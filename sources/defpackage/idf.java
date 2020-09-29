package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: idf reason: default package */
public final class idf implements vua<ide> {
    private final wlc<SlotApi> a;

    private idf(wlc<SlotApi> wlc) {
        this.a = wlc;
    }

    public static idf a(wlc<SlotApi> wlc) {
        return new idf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ide((SlotApi) this.a.get());
    }
}
