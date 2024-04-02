package id.co.tokobuah.service;

import id.co.tokobuah.model.Buah;
import id.co.tokobuah.response.DtoResponse;

public interface BuahService {
    DtoResponse getAllBuahs();
    DtoResponse getBuahActive();
    DtoResponse saveBuah(Buah buah);
    DtoResponse updateBuah(Buah buah);
    DtoResponse deleteBuah(Buah buah);
}
