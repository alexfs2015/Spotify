package com.spotify.voiceassistant.models.v2;

public class TargetDevice {
    @fjk(a = "brand")
    public String brand;
    @fjk(a = "device_id")
    public String device_id;
    @fjk(a = "device_type")
    public int device_type;
    @fjk(a = "model")
    public String model;

    public TargetDevice(int i, String str, String str2, String str3) {
        this.device_type = i;
        this.brand = str;
        this.model = str2;
        this.device_id = str3;
    }
}
