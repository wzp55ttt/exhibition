package com.keda.system.kedaexhibition.service.impl;

import com.keda.system.kedaexhibition.mapper.CurrentMapper;
import com.keda.system.kedaexhibition.service.CurrentService;
import com.keda.system.kedaexhibition.vo.VoCurrent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author peng
 * @date 2021/1/26
 */
@Service
public class CurrentServiceImpl implements CurrentService {

    @Autowired
    private CurrentMapper currentMapper;

    @Override
    public VoCurrent listCurrent() {
        VoCurrent vo = new VoCurrent();
        List<Integer> list1 = this.currentMapper.listValueByParent(1);
        List<Integer> list2 = this.currentMapper.listValueByParent(2);
        List<Integer> list3 = this.currentMapper.listValueByParent(3);
        List<Integer> list4 = this.currentMapper.listValueByParent(4);
        vo.setCurrentBreaker1(list1);
        vo.setCurrentBreaker2(list2);
        vo.setCurrentBreaker3(list3);
        vo.setCurrentBreaker4(list4);
        return vo;
    }
}
