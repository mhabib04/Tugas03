package com.example.tugas03;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Detail implements Parcelable {
    public String jenis;
    public String umur;
    public String jenisKelamin;
    public String warna;
    public String harga;
    public String gambar;
    public Detail() {
    }

    protected Detail(Parcel in) {
        jenis = in.readString();
        umur = in.readString();
        jenisKelamin = in.readString();
        harga = in.readString();
        warna = in.readString();
        gambar = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(jenis);
        dest.writeString(umur);
        dest.writeString(jenisKelamin);
        dest.writeString(harga);
        dest.writeString(warna);
        dest.writeString(gambar);

    }
}
