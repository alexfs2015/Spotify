package com.spotify.mobile.android.orbit;

public final class DeviceInfo_Factory implements wig<DeviceInfo> {
    private static final DeviceInfo_Factory INSTANCE = new DeviceInfo_Factory();

    public static DeviceInfo_Factory create() {
        return INSTANCE;
    }

    public static DeviceInfo newInstance() {
        return new DeviceInfo();
    }

    public final DeviceInfo get() {
        return new DeviceInfo();
    }
}
