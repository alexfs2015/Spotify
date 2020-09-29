package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;

/* renamed from: hhn reason: default package */
public final class hhn {
    public final RxPlayerState a;
    public final hec b;
    public final hed c;
    public final hvl d;
    public final RxResolver e;
    public final ConnectManager f;

    hhn(RxPlayerState rxPlayerState, hec hec, hed hed, hvl hvl, RxResolver rxResolver, ConnectManager connectManager) {
        this.a = rxPlayerState;
        this.b = hec;
        this.c = hed;
        this.d = hvl;
        this.e = rxResolver;
        this.f = connectManager;
    }
}
