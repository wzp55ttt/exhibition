package com.keda.system.kedaexhibition.repository;

import com.keda.system.kedaexhibition.pojo.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author peng
 * @date 2021/1/26
 */
public interface VoltageRepository extends JpaRepository<Voltage, Integer> {
}
