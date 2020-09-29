package com.facebook.share.internal;

public enum CameraEffectFeature implements aly {
    SHARE_CAMERA_EFFECT(20170417);
    
    private int minVersion;

    public final String a() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    private CameraEffectFeature(int i) {
        this.minVersion = 20170417;
    }

    public final int b() {
        return this.minVersion;
    }
}
