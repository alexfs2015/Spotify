package com.spotify.core.orbit;

import com.spotify.core.image.ImageLoader;

public final class OrbitService implements OrbitServiceInterface {
    private long nOrbitServicePtr;

    interface DeviceType {
        public static final int SMARTPHONE = 3;
        public static final int TABLET = 2;
    }

    public static native OrbitService create(Object obj, int i, String str, String str2, String str3, String str4, String str5);

    public static native void setClassLoader(ClassLoader classLoader);

    public static native void setMobileDeviceInfo(String str, int i, String str2, String str3, String str4, String str5, int i2, int i3);

    public final native void crash();

    public final native void destroy();

    public final native ImageLoader getImageLoader();

    public final native int getLifecycleState();

    public final native OrbitSession getOrbitSession();

    public final native void setConnectivityType(int i, boolean z);

    public final native void setObserver(OrbitServiceObserver orbitServiceObserver);

    public final native void start(String str, String str2, String str3, boolean z, boolean z2, Object obj);

    public final native void stop();

    public final native void tryReconnectNow(boolean z);

    private OrbitService() {
    }

    public static void setMobileDeviceInfo(String str, int i, String str2, String str3, String str4, String str5, boolean z, int i2) {
        setMobileDeviceInfo(str, i, str2, str3, str4, str5, z ? 2 : 3, i2);
    }

    public final boolean isCreated() {
        return this.nOrbitServicePtr != 0;
    }
}
