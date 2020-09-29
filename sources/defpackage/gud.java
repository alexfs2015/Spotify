package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: gud reason: default package */
public abstract class gud {
    public static final gud a = a(ConnectState.UNKNOWN, EnumSet.noneOf(Tech.class), null, null);

    public static gud a(ConnectState connectState, EnumSet<Tech> enumSet, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
        return new gub(connectState, enumSet, gaiaDevice, gaiaDevice2);
    }

    public abstract ConnectState a();

    public abstract EnumSet<Tech> b();

    public abstract GaiaDevice c();

    public abstract GaiaDevice d();
}
