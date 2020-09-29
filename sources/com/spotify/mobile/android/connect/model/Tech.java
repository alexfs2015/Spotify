package com.spotify.mobile.android.connect.model;

import com.spotify.mobile.android.connect.model.ConnectDevice.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.cosmos.JacksonModel;

public enum Tech implements JacksonModel {
    CONNECT,
    CAST_JS,
    CAST;

    public static boolean is(ConnectDevice connectDevice, Tech tech) {
        return of(connectDevice) == tech;
    }

    private static boolean isConnectDeviceCast(ConnectDevice connectDevice) {
        if (connectDevice.d != DeviceType.CAST_VIDEO) {
            if (connectDevice.d != DeviceType.CAST_AUDIO) {
                return false;
            }
        }
        return true;
    }

    private static boolean isGaiaDeviceCast(GaiaDevice gaiaDevice) {
        if (gaiaDevice.getType() != GaiaTypes.CAST_VIDEO) {
            if (gaiaDevice.getType() != GaiaTypes.CAST_AUDIO) {
                return false;
            }
        }
        return true;
    }

    public static Tech of(ConnectDevice connectDevice) {
        return connectDevice == null ? CONNECT : isConnectDeviceCast(connectDevice) ? CAST : CONNECT;
    }

    public static Tech of(GaiaDevice gaiaDevice) {
        return gaiaDevice == null ? CONNECT : isGaiaDeviceCast(gaiaDevice) ? CAST : CONNECT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    @com.fasterxml.jackson.annotation.JsonCreator
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.spotify.mobile.android.connect.model.Tech valueOfSafe(@com.fasterxml.jackson.annotation.JsonProperty("name") java.lang.String r7) {
        /*
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r6 = 4
            java.lang.String r0 = r7.toLowerCase(r0)
            r6 = 6
            int r1 = r0.hashCode()
            r2 = 3046207(0x2e7b3f, float:4.268645E-39)
            r3 = 4
            r3 = 0
            r6 = 4
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x003f
            r2 = 555286167(0x2118fe97, float:5.183655E-19)
            r6 = 0
            if (r1 == r2) goto L_0x0033
            r6 = 5
            r2 = 951351530(0x38b478ea, float:8.605591E-5)
            r6 = 5
            if (r1 == r2) goto L_0x0025
            r6 = 4
            goto L_0x004d
        L_0x0025:
            java.lang.String r1 = "cnsncoe"
            java.lang.String r1 = "connect"
            r6 = 6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004d
            r0 = 0
            int r6 = r6 >> r0
            goto L_0x004f
        L_0x0033:
            java.lang.String r1 = "cast-js"
            boolean r0 = r0.equals(r1)
            r6 = 3
            if (r0 == 0) goto L_0x004d
            r0 = 3
            r0 = 2
            goto L_0x004f
        L_0x003f:
            r6 = 6
            java.lang.String r1 = "cast"
            boolean r0 = r0.equals(r1)
            r6 = 7
            if (r0 == 0) goto L_0x004d
            r6 = 7
            r0 = 1
            r6 = 2
            goto L_0x004f
        L_0x004d:
            r6 = 5
            r0 = -1
        L_0x004f:
            if (r0 == 0) goto L_0x006d
            if (r0 == r5) goto L_0x006a
            r6 = 6
            if (r0 == r4) goto L_0x0067
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r6 = 6
            r0[r3] = r7
            r6 = 5
            java.lang.String r7 = "Unable to map tech '%s' to a valid enum, fall back to connect"
            r6 = 5
            com.spotify.base.java.logging.Logger.b(r7, r0)
            r6 = 2
            com.spotify.mobile.android.connect.model.Tech r7 = CONNECT
            return r7
        L_0x0067:
            com.spotify.mobile.android.connect.model.Tech r7 = CAST_JS
            return r7
        L_0x006a:
            com.spotify.mobile.android.connect.model.Tech r7 = CAST
            return r7
        L_0x006d:
            r6 = 5
            com.spotify.mobile.android.connect.model.Tech r7 = CONNECT
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.Tech.valueOfSafe(java.lang.String):com.spotify.mobile.android.connect.model.Tech");
    }

    public final boolean isCast() {
        if (this != CAST_JS) {
            if (this != CAST) {
                return false;
            }
        }
        return true;
    }
}
