package com.scaler.Splitwise.controllers;


import com.scaler.Splitwise.dtos.ResponseStatus;
import com.scaler.Splitwise.dtos.SettleGroupRequestDto;
import com.scaler.Splitwise.dtos.SettleGroupResponseDto;
import com.scaler.Splitwise.services.SettleGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SettleUpController {
    @Autowired
    SettleGroupService settleGroupService;

    public SettleGroupResponseDto settleGroup(SettleGroupRequestDto requestDto){
        SettleGroupResponseDto responseDto = new SettleGroupResponseDto();
        try{
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return  responseDto;
    }

}
