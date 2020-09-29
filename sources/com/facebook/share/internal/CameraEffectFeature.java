package com.facebook.share.internal;

public enum CameraEffectFeature implements amm {
    SHARE_CAMERA_EFFECT(20170417);
    
    private int minVersion;

    private CameraEffectFeature(int i) {
        this.minVersion = 20170417;
    }

    public final String a() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public final int b() {
        return this.minVersion;
    }
}
