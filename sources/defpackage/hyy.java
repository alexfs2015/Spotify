package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: hyy reason: default package */
public final class hyy implements vua<hyx> {
    private final wlc<SlotApi> a;
    private final wlc<hxi> b;

    private hyy(wlc<SlotApi> wlc, wlc<hxi> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hyy a(wlc<SlotApi> wlc, wlc<hxi> wlc2) {
        return new hyy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hyx((SlotApi) this.a.get(), (hxi) this.b.get());
    }
}
