package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.connect.model.DeviceState;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.BluetoothTypes;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;

/* renamed from: mmo reason: default package */
public final class mmo {
    private static final ImmutableSet<DeviceState> b = ImmutableSet.b(GaiaDeviceState.CONNECTING, GaiaDeviceState.LOGGED_IN);
    private static final ImmutableSet<DeviceType> c = ImmutableSet.a(GaiaTypes.COMPUTER, GaiaTypes.SMARTPHONE, GaiaTypes.TABLET);
    public final gmd a;

    public mmo(gmd gmd) {
        this.a = gmd;
    }

    public static boolean a(gtz gtz) {
        if (!gtz.isDisabled()) {
            if (!(b.contains(gtz.getState()) && (c.contains(gtz.getType()) ^ true) && gtz.supportsLogout()) && !gtz.hasIncarnations()) {
                if (gtz.getCapabilities() != null && !gtz.getCapabilities().isEmpty()) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(gtz gtz) {
        return !gtz.isActive() && !gtz.isDisabled() && !e(gtz);
    }

    public static boolean c(gtz gtz) {
        DeviceType type = gtz.getType();
        return type == GaiaTypes.CAST_VIDEO || type == GaiaTypes.CAST_AUDIO;
    }

    public static boolean d(gtz gtz) {
        return gtz.getType() == BluetoothTypes.BLUETOOTH;
    }

    public static boolean e(gtz gtz) {
        return gtz.getState() == GaiaDeviceState.CONNECTING;
    }

    public final DeviceType a() {
        return this.a.a;
    }
}
