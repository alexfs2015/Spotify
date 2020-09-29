package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;

/* renamed from: hki reason: default package */
public final class hki implements wig<hkh> {
    private final wzi<RxPlayerState> a;
    private final wzi<hgy> b;
    private final wzi<hgz> c;
    private final wzi<hxx> d;
    private final wzi<RxResolver> e;
    private final wzi<ConnectManager> f;

    public static hkh a(RxPlayerState rxPlayerState, hgy hgy, hgz hgz, hxx hxx, RxResolver rxResolver, ConnectManager connectManager) {
        hkh hkh = new hkh(rxPlayerState, hgy, hgz, hxx, rxResolver, connectManager);
        return hkh;
    }

    public final /* synthetic */ Object get() {
        hkh hkh = new hkh((RxPlayerState) this.a.get(), (hgy) this.b.get(), (hgz) this.c.get(), (hxx) this.d.get(), (RxResolver) this.e.get(), (ConnectManager) this.f.get());
        return hkh;
    }
}
