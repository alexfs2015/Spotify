package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: men reason: default package */
public interface men extends a {
    void a(ConnectState connectState, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2, EnumSet<Tech> enumSet, uax uax);

    void a(boolean z);

    boolean b();
}
