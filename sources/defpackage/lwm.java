package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;

/* renamed from: lwm reason: default package */
public final class lwm implements vua<gzz> {
    private final wlc<Boolean> a;
    private final wlc<lzk> b;

    private lwm(wlc<Boolean> wlc, wlc<lzk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lwm a(wlc<Boolean> wlc, wlc<lzk> wlc2) {
        return new lwm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        gzz gzz;
        lzk lzk = (lzk) this.b.get();
        String str = "browse-loading-empty-view";
        if (((Boolean) this.a.get()).booleanValue()) {
            gzz = gyi.b().a(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a(lzk.a(str)).a();
        } else {
            gzz = gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a(lzk.a(str)).a();
        }
        return (gzz) vuf.a(gzz, "Cannot return null from a non-@Nullable @Provides method");
    }
}
