package com.keda.system.kedaexhibition;

import com.keda.system.kedaexhibition.mapper.CurrentMapper;
import com.keda.system.kedaexhibition.pojo.Current;
import com.keda.system.kedaexhibition.pojo.Voltage;
import com.keda.system.kedaexhibition.repository.CurrentRepository;
import com.keda.system.kedaexhibition.repository.VoltageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KedaExhibitionApplicationTests {

    @Autowired
    private CurrentRepository currentRepository;
    @Autowired
    private VoltageRepository voltageRepository;
    @Autowired
    private CurrentMapper currentMapper;
    @Test
    public void contextLoads() {
        for (int i = 1; i <= 4; i++) {
            for (int i1 = 1; i1 <= 3; i1++) {
                Current current = new Current();
                UUID uuid = UUID.randomUUID();
//                current.setId(uuid.toString());
//                current.setId(1l);
                current.setNumber((float)i1);
                current.setParent(i);
                current.setValue(1);
                currentRepository.save(current);
            }
        }
    }

    @Test
    public void delete() {
        List<Current> all = this.currentRepository.findAll();
        all.forEach(a -> this.currentRepository.delete(a));
    }

    @Test
    public void add() {
        for (int i = 1; i <= 4; i++) {
            for (int i1 = 1; i1 <= 3; i1++) {
                Voltage voltage = new Voltage();
                voltage.setNumber((float)i1);
                voltage.setParent(i);
                voltage.setValue(1);
                voltageRepository.save(voltage);
            }
        }
    }

    @Test
    public void test() {
        List<Integer> list = this.currentMapper.listValueByParent(1);
        System.out.println(list);
    }

}
