package com.keda.system.kedaexhibition.controller;

import com.keda.system.kedaexhibition.service.VoltageService;
import com.keda.system.kedaexhibition.vo.VoVoltage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng
 * @date 2021/1/26
 */
@RestController
public class VoltageController {

    @Autowired
    private VoltageService voltageService;

    @GetMapping("voltage/listVoltage")
    public VoVoltage listCurrent() {
        return this.voltageService.listVoltage();
    }
}
