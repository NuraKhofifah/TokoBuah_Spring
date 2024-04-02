package id.co.tokobuah.dao;

import id.co.tokobuah.vo.BuahVo;

import java.util.List;

public interface BuahDao {
    List<BuahVo> getAllBuahs();
    List<BuahVo> getBuahActive();
}
