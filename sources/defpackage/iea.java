package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: iea reason: default package */
public final class iea implements vua<idz> {
    private final wlc<SlotApi> a;

    private iea(wlc<SlotApi> wlc) {
        this.a = wlc;
    }

    public static iea a(wlc<SlotApi> wlc) {
        return new iea(wlc);
    }

    public final /* synthetic */ Object get() {
        return new idz((SlotApi) this.a.get());
    }
}
