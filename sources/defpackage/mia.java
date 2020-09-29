package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.connect.model.DeviceState;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.BluetoothTypes;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;

/* renamed from: mia reason: default package */
public final class mia {
    private static final ImmutableSet<DeviceState> a = ImmutableSet.b(GaiaDeviceState.CONNECTING, GaiaDeviceState.LOGGED_IN);
    private static final ImmutableSet<DeviceType> b = ImmutableSet.a(GaiaTypes.COMPUTER, GaiaTypes.SMARTPHONE, GaiaTypes.TABLET);
    private final Context c;

    public mia(Context context) {
        this.c = context;
    }

    public final DeviceType a() {
        return jtc.c(this.c) ? GaiaTypes.TABLET : GaiaTypes.SMARTPHONE;
    }

    public static boolean a(grz grz) {
        if (!grz.isDisabled()) {
            if (!(a.contains(grz.getState()) && (b.contains(grz.getType()) ^ true) && grz.supportsLogout()) && !grz.hasIncarnations()) {
                if (grz.getCapabilities() != null && !grz.getCapabilities().isEmpty()) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(grz grz) {
        return !grz.isActive() && !grz.isDisabled() && !e(grz);
    }

    public static boolean c(grz grz) {
        DeviceType type = grz.getType();
        return type == GaiaTypes.CAST_VIDEO || type == GaiaTypes.CAST_AUDIO;
    }

    public static boolean d(grz grz) {
        return grz.getType() == BluetoothTypes.BLUETOOTH;
    }

    public static boolean e(grz grz) {
        return grz.getState() == GaiaDeviceState.CONNECTING;
    }
}
