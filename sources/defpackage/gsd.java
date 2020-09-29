package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: gsd reason: default package */
public abstract class gsd {
    public static final gsd a = a(ConnectState.UNKNOWN, EnumSet.noneOf(Tech.class), null, null);

    public abstract ConnectState a();

    public abstract EnumSet<Tech> b();

    public abstract GaiaDevice c();

    public abstract GaiaDevice d();

    public static gsd a(ConnectState connectState, EnumSet<Tech> enumSet, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
        return new gsb(connectState, enumSet, gaiaDevice, gaiaDevice2);
    }
}
