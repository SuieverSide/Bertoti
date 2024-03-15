package com.crud.crud;

public class Locais {
    private Double lat;
    private Double lon;
    private String motivo;

    public Locais(){

    }
    public Locais(Double lat, Double lon, String motivo){

        this.lat = lat;
        this.lon = lon;
        this.motivo = motivo;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}