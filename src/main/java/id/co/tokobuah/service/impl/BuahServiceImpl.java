package id.co.tokobuah.service.impl;

import id.co.tokobuah.dao.BuahDao;
import id.co.tokobuah.model.Buah;
import id.co.tokobuah.repository.BuahRepository;
import id.co.tokobuah.response.DtoResponse;
import id.co.tokobuah.service.BuahService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import id.co.tokobuah.vo.BuahVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static id.co.tokobuah.constant.BuahConstant.*;

import java.util.List;

/*
import static id.co.tokobuah.constant.BuahConstant.mCreateSuccess;
import static id.co.tokobuah.constant.BuahConstant.mEmptyData;
*/

@Service
@Transactional
public class BuahServiceImpl implements BuahService {
    @Autowired
    private BuahDao buahDao;

    @Autowired
    private BuahRepository buahRepository;

    @Override
    public DtoResponse getAllBuahs(){
        if (buahDao.getAllBuahs() != null) {
            return new DtoResponse(200, buahDao.getAllBuahs());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse getBuahActive() {
        if (buahDao.getBuahActive() != null) {
            return new DtoResponse(200, buahDao.getBuahActive());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse saveBuah(Buah buah) {
        try {
            buahRepository.save(buah);
            return new DtoResponse(200, buah, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, buah, mCreatedFailed);
        }
    }

    @Override
    public DtoResponse updateBuah (Buah buah) {
        try {
            Buah updateBuah = buahRepository.save(buah);
            if (updateBuah != null) {
                return new DtoResponse(200, updateBuah, mUpdateSuccess);
            } else {
                return new DtoResponse(404, null, mNotFound);
            }
        } catch (Exception e){
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteBuah(Buah buah) {
        Buah buahData = buahRepository.findById(buah.getBua_id()).orElseThrow();
        if(buahData != null){
            try{
                buahRepository.delete(buah);
                return new DtoResponse(200, buahData, mUpdateSuccess);
            } catch (Exception e){
                return new DtoResponse(500, buahData, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }







}
