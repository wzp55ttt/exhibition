package com.keda.system.kedaexhibition.service;

import com.keda.system.kedaexhibition.vo.VoVoltage;

/**
 * @author peng
 */
public interface VoltageService {

    /**
     * 获取四个断路器的电压集合
     * @return res
     */
    VoVoltage listVoltage();
}
