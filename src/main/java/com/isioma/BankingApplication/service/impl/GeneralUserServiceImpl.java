package com.isioma.BankingApplication.service.impl;

import com.isioma.BankingApplication.domain.entities.UserEntity;
import com.isioma.BankingApplication.infrastructure.config.JwtAuthenticationFilter;
import com.isioma.BankingApplication.infrastructure.config.JwtTokenProvider;
import com.isioma.BankingApplication.payload.response.BankResponse;
import com.isioma.BankingApplication.repository.UserRepository;
import com.isioma.BankingApplication.service.GeneralUserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GeneralUserServiceImpl implements GeneralUserService {

    private final FileUploadServiceImpl fileUploadService;
    private final UserRepository userRepository;
    private final JwtAuthenticationFilter authenticationFilter;
    private final HttpServletRequest request;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public ResponseEntity<BankResponse<String>> uploadProfilePics(MultipartFile profilePics) {

        String token = authenticationFilter.getTokenfromRequest(request);
        String email = jwtTokenProvider.getUserName(token);

        Optional<UserEntity> userEntityOptional = userRepository.findByEmail(email);

        String fileUrl = null;

        try {
            if (userEntityOptional.isPresent()){
                fileUrl = fileUploadService.uploadFile(profilePics);

                UserEntity userEntity = userEntityOptional.get();
                userEntity.setProfilePicture(fileUrl);

                userRepository.save(userEntity);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.ok(
                new BankResponse<>(
                        "Uploaded Successful",
                        fileUrl
                )
        );
    }
}
