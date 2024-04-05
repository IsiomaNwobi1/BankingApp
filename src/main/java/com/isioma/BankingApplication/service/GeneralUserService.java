package com.isioma.BankingApplication.service;

import com.isioma.BankingApplication.payload.response.BankResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface GeneralUserService {

    ResponseEntity<BankResponse<String>> uploadProfilePics(MultipartFile multipartFile);
}
