package com.keda.system.kedaexhibition.service.impl;

import com.keda.system.kedaexhibition.mapper.VoltageMapper;
import com.keda.system.kedaexhibition.service.VoltageService;
import com.keda.system.kedaexhibition.vo.VoVoltage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author peng
 * @date 2021/1/26
 */
@Service
public class VoltageServiceImpl implements VoltageService {

    @Autowired
    private VoltageMapper voltageMapper;

    @Override
    public VoVoltage listVoltage() {
        VoVoltage vo = new VoVoltage();
        List<Integer> list1 = this.voltageMapper.listValueByParent(1);
        List<Integer> list2 = this.voltageMapper.listValueByParent(2);
        List<Integer> list3 = this.voltageMapper.listValueByParent(3);
        List<Integer> list4 = this.voltageMapper.listValueByParent(4);
        vo.setVoltageBreaker1(list1);
        vo.setVoltageBreaker2(list2);
        vo.setVoltageBreaker3(list3);
        vo.setVoltageBreaker4(list4);
        return vo;
    }
}
