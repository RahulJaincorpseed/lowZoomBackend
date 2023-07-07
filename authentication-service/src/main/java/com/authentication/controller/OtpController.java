package com.authentication.controller;

import com.authentication.payload.request.OtpRequest;
import com.authentication.payload.request.OtpResponse;
import com.authentication.service.OtpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Handle otp related actions")
@RequestMapping("/api/auth/otp")
public class OtpController {

    @Autowired
    private OtpService otpService;

    @ApiOperation(value = "generate otp",response = OtpResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Successfully otp generated"),
            @ApiResponse(code = 500,message = "Something Went-Wrong"),
            @ApiResponse(code = 400,message = "Bad Request")
    })
    @PostMapping()
    public OtpResponse generateOtp(@RequestBody OtpRequest otpRequest){
        return this.otpService.generateOtp(otpRequest.getMobile());
    }
}
