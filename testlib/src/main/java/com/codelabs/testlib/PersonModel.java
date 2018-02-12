package com.codelabs.testlib;

/**
 * Created by Biekaeksa on 2/12/2018.
 */

public class PersonModel {
    private String nama;
    private String umur;
    private String kelamin;

    public PersonModel(String nama, String umur, String kelamin) {
        this.nama = nama;
        this.umur = umur;
        this.kelamin = kelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
}
