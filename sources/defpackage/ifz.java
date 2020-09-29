package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: ifz reason: default package */
public final class ifz implements vua<ify> {
    private final wlc<SlotApi> a;
    private final wlc<jvr> b;

    private ifz(wlc<SlotApi> wlc, wlc<jvr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ifz a(wlc<SlotApi> wlc, wlc<jvr> wlc2) {
        return new ifz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ify((SlotApi) this.a.get(), (jvr) this.b.get());
    }
}
