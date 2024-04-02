package id.co.tokobuah.dao.impl;

import id.co.tokobuah.dao.BuahDao;
import id.co.tokobuah.model.Buah;
import id.co.tokobuah.repository.BuahRepository;
import id.co.tokobuah.vo.BuahVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BuahDaoImpl implements BuahDao {
    @Autowired
    private BuahRepository buahRepository;

    @Override
    public List<BuahVo> getAllBuahs(){
        Iterable<Buah> buahs = buahRepository.findAll();
        List<BuahVo> buahVos = new ArrayList<>();
        for (Buah item : buahs) {
            BuahVo buahVo = new BuahVo(item);
            buahVos.add(buahVo);
        }
        return buahVos;
    }

    @Override
    public List<BuahVo> getBuahActive() {
        Iterable<Buah> buahs = buahRepository.findByStatus(1);
        List<BuahVo> buahVos = new ArrayList<>();
        for (Buah item : buahs) {
            BuahVo buahVo = new BuahVo(item);
            buahVos.add(buahVo);
        }
        return buahVos;
    }
}
