package com.spotify.mobile.android.connect.model;

import com.spotify.mobile.android.connect.model.ConnectDevice.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.cosmos.JacksonModel;

public enum Tech implements JacksonModel {
    CONNECT,
    CAST_JS,
    CAST;

    public static Tech of(ConnectDevice connectDevice) {
        if (connectDevice == null) {
            return CONNECT;
        }
        return isConnectDeviceCast(connectDevice) ? CAST : CONNECT;
    }

    public static Tech of(GaiaDevice gaiaDevice) {
        if (gaiaDevice == null) {
            return CONNECT;
        }
        return isGaiaDeviceCast(gaiaDevice) ? CAST : CONNECT;
    }

    public static boolean is(ConnectDevice connectDevice, Tech tech) {
        return of(connectDevice) == tech;
    }

    private static boolean isGaiaDeviceCast(GaiaDevice gaiaDevice) {
        return gaiaDevice.getType() == GaiaTypes.CAST_VIDEO || gaiaDevice.getType() == GaiaTypes.CAST_AUDIO;
    }

    public final boolean isCast() {
        return this == CAST_JS || this == CAST;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    @com.fasterxml.jackson.annotation.JsonCreator
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.spotify.mobile.android.connect.model.Tech valueOfSafe(@com.fasterxml.jackson.annotation.JsonProperty("name") java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r6.toLowerCase(r0)
            int r1 = r0.hashCode()
            r2 = 3046207(0x2e7b3f, float:4.268645E-39)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x0031
            r2 = 555286167(0x2118fe97, float:5.183655E-19)
            if (r1 == r2) goto L_0x0027
            r2 = 951351530(0x38b478ea, float:8.605591E-5)
            if (r1 == r2) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r1 = "connect"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 0
            goto L_0x003c
        L_0x0027:
            java.lang.String r1 = "cast-js"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 2
            goto L_0x003c
        L_0x0031:
            java.lang.String r1 = "cast"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = -1
        L_0x003c:
            if (r0 == 0) goto L_0x0054
            if (r0 == r5) goto L_0x0051
            if (r0 == r4) goto L_0x004e
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r6
            java.lang.String r6 = "Unable to map tech '%s' to a valid enum, fall back to connect"
            com.spotify.base.java.logging.Logger.b(r6, r0)
            com.spotify.mobile.android.connect.model.Tech r6 = CONNECT
            return r6
        L_0x004e:
            com.spotify.mobile.android.connect.model.Tech r6 = CAST_JS
            return r6
        L_0x0051:
            com.spotify.mobile.android.connect.model.Tech r6 = CAST
            return r6
        L_0x0054:
            com.spotify.mobile.android.connect.model.Tech r6 = CONNECT
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.Tech.valueOfSafe(java.lang.String):com.spotify.mobile.android.connect.model.Tech");
    }

    private static boolean isConnectDeviceCast(ConnectDevice connectDevice) {
        return connectDevice.d == DeviceType.CAST_VIDEO || connectDevice.d == DeviceType.CAST_AUDIO;
    }
}
