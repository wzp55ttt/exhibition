package com.keda.system.kedaexhibition.service;

import com.keda.system.kedaexhibition.vo.VoCurrent;

/**
 * @author peng
 */
public interface CurrentService {

    /**
     * 获取四个断路器的电流集合
     * @return res
     */
    VoCurrent listCurrent();
}
