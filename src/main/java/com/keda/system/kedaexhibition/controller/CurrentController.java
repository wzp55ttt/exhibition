package com.keda.system.kedaexhibition.controller;

import com.keda.system.kedaexhibition.service.CurrentService;
import com.keda.system.kedaexhibition.vo.VoCurrent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peng
 * @date 2021/1/26
 */
@RestController
public class CurrentController {

    @Autowired
    private CurrentService currentService;

    @GetMapping("current/listCurrent")
    public VoCurrent listCurrent() {
        return this.currentService.listCurrent();
    }
}
