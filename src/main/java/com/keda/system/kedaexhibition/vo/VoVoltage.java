package com.keda.system.kedaexhibition.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author peng
 * @date 2021/1/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VoVoltage {

    private List<Integer> voltageBreaker1;
    private List<Integer> voltageBreaker2;
    private List<Integer> voltageBreaker3;
    private List<Integer> voltageBreaker4;
}
