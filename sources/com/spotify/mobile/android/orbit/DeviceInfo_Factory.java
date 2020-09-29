package com.spotify.mobile.android.orbit;

public final class DeviceInfo_Factory implements vua<DeviceInfo> {
    private static final DeviceInfo_Factory INSTANCE = new DeviceInfo_Factory();

    public final DeviceInfo get() {
        return new DeviceInfo();
    }

    public static DeviceInfo_Factory create() {
        return INSTANCE;
    }

    public static DeviceInfo newInstance() {
        return new DeviceInfo();
    }
}
