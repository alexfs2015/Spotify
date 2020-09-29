package com.spotify.mobile.android.orbit;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitService;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.connect.model.DeviceType;

public class OrbitFactory {
    private static boolean sNativeLoaded;
    private final juc mDeviceId;
    private final DeviceInfo mDeviceInfo;
    private final DeviceType mLocalDeviceType;
    private final OrbitLibraryLoader mOrbitLibraryLoader;

    public OrbitFactory(OrbitLibraryLoader orbitLibraryLoader, DeviceInfo deviceInfo, juc juc, gmd gmd) {
        this.mOrbitLibraryLoader = orbitLibraryLoader;
        this.mDeviceInfo = deviceInfo;
        this.mDeviceId = juc;
        this.mLocalDeviceType = gmd.a;
    }

    private void initOrbit() {
        if (!sNativeLoaded) {
            this.mOrbitLibraryLoader.waitForLibraryLoaded();
            sNativeLoaded = true;
            String str = VERSION.RELEASE;
            int i = VERSION.SDK_INT;
            String name = this.mDeviceInfo.getName();
            String str2 = Build.MODEL;
            String str3 = Build.BRAND;
            String str4 = "z s y  ";
            String str5 = "   m zy   x";
            OrbitService.setMobileDeviceInfo(str, i, name, "  xyz  ", "    xyz    ", Build.MANUFACTURER, this.mLocalDeviceType.ordinal(), this.mDeviceInfo.getVolumeSteps());
            Class<OrbitService> cls = OrbitService.class;
            OrbitService.setClassLoader(OrbitService.class.getClassLoader());
        }
    }

    public OrbitServiceInterface createService(Context context, int i, String str, String str2, String str3) {
        String str4;
        initOrbit();
        String a = this.mDeviceId.a();
        juc juc = this.mDeviceId;
        String a2 = juc.a();
        String b = juc.c.b(juc.a, "");
        String str5 = "%Ldso%nigIedcaIoao:ydd,rsa  ddrin:";
        Logger.b("androidId: %s, androidLegacyId: %s", a2, b);
        if (TextUtils.isEmpty(b)) {
            String str6 = a2;
            str4 = a2;
        } else {
            String str7 = b;
            str4 = b;
        }
        Context context2 = context;
        int i2 = i;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        return OrbitService.create(context, i, str, str2, a, str4, str3);
    }
}
