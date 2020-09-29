package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;

/* renamed from: hho reason: default package */
public final class hho implements vua<hhn> {
    private final wlc<RxPlayerState> a;
    private final wlc<hec> b;
    private final wlc<hed> c;
    private final wlc<hvl> d;
    private final wlc<RxResolver> e;
    private final wlc<ConnectManager> f;

    public static hhn a(RxPlayerState rxPlayerState, hec hec, hed hed, hvl hvl, RxResolver rxResolver, ConnectManager connectManager) {
        hhn hhn = new hhn(rxPlayerState, hec, hed, hvl, rxResolver, connectManager);
        return hhn;
    }

    public final /* synthetic */ Object get() {
        hhn hhn = new hhn((RxPlayerState) this.a.get(), (hec) this.b.get(), (hed) this.c.get(), (hvl) this.d.get(), (RxResolver) this.e.get(), (ConnectManager) this.f.get());
        return hhn;
    }
}
