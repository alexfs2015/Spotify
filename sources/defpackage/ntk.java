package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;

/* renamed from: ntk reason: default package */
public final class ntk implements vua<hez<gzz>> {
    private final wlc<wug> a;
    private final wlc<nss> b;

    private ntk(wlc<wug> wlc, wlc<nss> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ntk a(wlc<wug> wlc, wlc<nss> wlc2) {
        return new ntk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        nss nss = (nss) this.b.get();
        return (hez) vuf.a(new a(gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).e(nss.a("made-for-you-hub-loading-empty-view")).a()).a(), (wug) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
