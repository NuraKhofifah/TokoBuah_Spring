package id.co.tokobuah.vo;

import id.co.tokobuah.model.Buah;

import java.math.BigDecimal;

public class BuahVo {
    private Integer id;
    private String namabuah;
    private BigDecimal harga;
    private Integer stok;
    private Integer kategori;
    private Integer status;

    public BuahVo(){
    }

    public BuahVo(Buah buah) {
        this.id = buah.getBua_id();
        this.namabuah = buah.getBua_namaBuah();
        this.harga = buah.getBua_harga();
        this.stok = buah.getBua_stok();
        this.kategori = buah.getBua_kategori();
        this.status = buah.getBua_status();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamabuah() {
        return namabuah;
    }

    public void setNamabuah(String namabuah) {
        this.namabuah = namabuah;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Integer getKategori() {
        return kategori;
    }

    public void setKategori(Integer kategori) {
        this.kategori = kategori;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
