package com.spotify.mobile.android.orbit;

public final class OrbitFactory_Factory implements vua<OrbitFactory> {
    private final wlc<jrs> deviceIdProvider;
    private final wlc<DeviceInfo> deviceInfoProvider;
    private final wlc<OrbitLibraryLoader> orbitLibraryLoaderProvider;

    public OrbitFactory_Factory(wlc<OrbitLibraryLoader> wlc, wlc<DeviceInfo> wlc2, wlc<jrs> wlc3) {
        this.orbitLibraryLoaderProvider = wlc;
        this.deviceInfoProvider = wlc2;
        this.deviceIdProvider = wlc3;
    }

    public final OrbitFactory get() {
        return new OrbitFactory((OrbitLibraryLoader) this.orbitLibraryLoaderProvider.get(), (DeviceInfo) this.deviceInfoProvider.get(), (jrs) this.deviceIdProvider.get());
    }

    public static OrbitFactory_Factory create(wlc<OrbitLibraryLoader> wlc, wlc<DeviceInfo> wlc2, wlc<jrs> wlc3) {
        return new OrbitFactory_Factory(wlc, wlc2, wlc3);
    }

    public static OrbitFactory newInstance(OrbitLibraryLoader orbitLibraryLoader, DeviceInfo deviceInfo, jrs jrs) {
        return new OrbitFactory(orbitLibraryLoader, deviceInfo, jrs);
    }
}
