package com.example.app_tieng;

public class DuLieu {
    public String id,vidu;

    @Override
    public String toString() {
        return "DuLieu{" +
                "id='" + id + '\'' +
                ", vidu='" + vidu + '\'' +
                '}';
    }

    public DuLieu(String id, String vidu) {
        this.id = id;
        this.vidu = vidu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVidu() {
        return vidu;
    }

    public void setVidu(String vidu) {
        this.vidu = vidu;
    }
}
