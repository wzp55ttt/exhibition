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
public class VoCurrent {

    private List<Integer> currentBreaker1;
    private List<Integer> currentBreaker2;
    private List<Integer> currentBreaker3;
    private List<Integer> currentBreaker4;
}
