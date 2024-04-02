package id.co.tokobuah.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tob_buah")
public class Buah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bua_id")
    private Integer bua_id;

    @Column(name =  "bua_namaBuah")
    private String bua_namaBuah;

    @Column(name = "bua_harga")
    private BigDecimal bua_harga;

    @Column(name = "bua_stok")
    private Integer bua_stok;

    @Column(name = "bua_kategori")
    private Integer bua_kategori;

    @Column(name = "bua_status")
    private Integer bua_status;

    @Column(name = "bua_creaby")
    private Integer bua_creaby;

    @Column(name = "bua_creadate")
    private Date bua_creadate;

    @Column(name = "bua_modiby")
    private Integer bua_modiby;

    @Column(name = "bua_modidate")
    private Date bua_modidate;

    public Buah(){
    }

    public Buah(Integer bua_id, String bua_namaBuah, BigDecimal bua_harga, Integer bua_stok, Integer bua_kategori, Integer bua_status, Integer bua_creaby, Date bua_creadate, Integer bua_modiby, Date bua_modidate) {
        this.bua_id = bua_id;
        this.bua_namaBuah = bua_namaBuah;
        this.bua_harga = bua_harga;
        this.bua_stok = bua_stok;
        this.bua_kategori = bua_kategori;
        this.bua_status = bua_status;
        this.bua_creaby = bua_creaby;
        this.bua_creadate = bua_creadate;
        this.bua_modiby = bua_modiby;
        this.bua_modidate = bua_modidate;
    }

    public Integer getBua_id() {
        return bua_id;
    }

    public void setBua_id(Integer bua_id) {
        this.bua_id = bua_id;
    }

    public String getBua_namaBuah() {
        return bua_namaBuah;
    }

    public void setBua_namaBuah(String bua_namaBuah) {
        this.bua_namaBuah = bua_namaBuah;
    }

    public BigDecimal getBua_harga() {
        return bua_harga;
    }

    public void setBua_harga(BigDecimal bua_harga) {
        this.bua_harga = bua_harga;
    }

    public Integer getBua_stok() {
        return bua_stok;
    }

    public void setBua_stok(Integer bua_stok) {
        this.bua_stok = bua_stok;
    }

    public Integer getBua_kategori() {
        return bua_kategori;
    }

    public void setBua_kategori(Integer bua_kategori) {
        this.bua_kategori = bua_kategori;
    }

    public Integer getBua_status() {
        return bua_status;
    }

    public void setBua_status(Integer bua_status) {
        this.bua_status = bua_status;
    }

    public Integer getBua_creaby() {
        return bua_creaby;
    }

    public void setBua_creaby(Integer bua_creaby) {
        this.bua_creaby = bua_creaby;
    }

    public Date getBua_creadate() {
        return bua_creadate;
    }

    public void setBua_creadate(Date bua_creadate) {
        this.bua_creadate = bua_creadate;
    }

    public Integer getBua_modiby() {
        return bua_modiby;
    }

    public void setBua_modiby(Integer bua_modiby) {
        this.bua_modiby = bua_modiby;
    }

    public Date getBua_modidate() {
        return bua_modidate;
    }

    public void setBua_modidate(Date bua_modidate) {
        this.bua_modidate = bua_modidate;
    }
}
