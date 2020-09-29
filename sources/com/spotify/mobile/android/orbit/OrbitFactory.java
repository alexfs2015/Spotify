package com.spotify.mobile.android.orbit;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitService;
import com.spotify.core.orbit.OrbitServiceInterface;

public class OrbitFactory {
    private static boolean sNativeLoaded;
    private final jrs mDeviceId;
    private final DeviceInfo mDeviceInfo;
    private final OrbitLibraryLoader mOrbitLibraryLoader;

    public OrbitFactory(OrbitLibraryLoader orbitLibraryLoader, DeviceInfo deviceInfo, jrs jrs) {
        this.mOrbitLibraryLoader = orbitLibraryLoader;
        this.mDeviceInfo = deviceInfo;
        this.mDeviceId = jrs;
    }

    private void initOrbit(Context context) {
        if (!sNativeLoaded) {
            this.mOrbitLibraryLoader.waitForLibraryLoaded();
            sNativeLoaded = true;
            OrbitService.setMobileDeviceInfo(VERSION.RELEASE, VERSION.SDK_INT, this.mDeviceInfo.getName(), Build.MODEL, Build.BRAND, Build.MANUFACTURER, jtc.c(context), this.mDeviceInfo.getVolumeSteps());
            OrbitService.setClassLoader(OrbitService.class.getClassLoader());
        }
    }

    public OrbitServiceInterface createService(Context context, int i, String str, String str2, String str3) {
        initOrbit(context);
        String a = this.mDeviceId.a();
        jrs jrs = this.mDeviceId;
        String a2 = jrs.a();
        String b = jrs.c.b(jrs.a, "");
        Logger.b("androidId: %s, androidLegacyId: %s", a2, b);
        return OrbitService.create(context, i, str, str2, a, TextUtils.isEmpty(b) ? a2 : b, str3);
    }
}
