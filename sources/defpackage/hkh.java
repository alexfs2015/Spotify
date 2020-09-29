package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;

/* renamed from: hkh reason: default package */
public final class hkh {
    public final RxPlayerState a;
    public final hgy b;
    public final hgz c;
    public final hxx d;
    public final RxResolver e;
    public final ConnectManager f;

    hkh(RxPlayerState rxPlayerState, hgy hgy, hgz hgz, hxx hxx, RxResolver rxResolver, ConnectManager connectManager) {
        this.a = rxPlayerState;
        this.b = hgy;
        this.c = hgz;
        this.d = hxx;
        this.e = rxResolver;
        this.f = connectManager;
    }
}
