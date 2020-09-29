package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;

/* renamed from: nzn reason: default package */
public final class nzn implements wig<hhv<hcs>> {
    private final wzi<xil> a;
    private final wzi<nyv> b;

    private nzn(wzi<xil> wzi, wzi<nyv> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nzn a(wzi<xil> wzi, wzi<nyv> wzi2) {
        return new nzn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        nyv nyv = (nyv) this.b.get();
        return (hhv) wil.a(new a(hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).e(nyv.a("made-for-you-hub-loading-empty-view")).a()).a(), (xil) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
