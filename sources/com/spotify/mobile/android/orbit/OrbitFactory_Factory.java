package com.spotify.mobile.android.orbit;

public final class OrbitFactory_Factory implements wig<OrbitFactory> {
    private final wzi<juc> deviceIdProvider;
    private final wzi<DeviceInfo> deviceInfoProvider;
    private final wzi<gmd> deviceTypeResolverProvider;
    private final wzi<OrbitLibraryLoader> orbitLibraryLoaderProvider;

    public OrbitFactory_Factory(wzi<OrbitLibraryLoader> wzi, wzi<DeviceInfo> wzi2, wzi<juc> wzi3, wzi<gmd> wzi4) {
        this.orbitLibraryLoaderProvider = wzi;
        this.deviceInfoProvider = wzi2;
        this.deviceIdProvider = wzi3;
        this.deviceTypeResolverProvider = wzi4;
    }

    public static OrbitFactory_Factory create(wzi<OrbitLibraryLoader> wzi, wzi<DeviceInfo> wzi2, wzi<juc> wzi3, wzi<gmd> wzi4) {
        return new OrbitFactory_Factory(wzi, wzi2, wzi3, wzi4);
    }

    public static OrbitFactory newInstance(OrbitLibraryLoader orbitLibraryLoader, DeviceInfo deviceInfo, juc juc, gmd gmd) {
        return new OrbitFactory(orbitLibraryLoader, deviceInfo, juc, gmd);
    }

    public final OrbitFactory get() {
        return new OrbitFactory((OrbitLibraryLoader) this.orbitLibraryLoaderProvider.get(), (DeviceInfo) this.deviceInfoProvider.get(), (juc) this.deviceIdProvider.get(), (gmd) this.deviceTypeResolverProvider.get());
    }
}
