package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: hwh reason: default package */
public final class hwh implements vua<gky<AdSlotEvent>> {
    private final wlc<gkz> a;

    private hwh(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static hwh a(wlc<gkz> wlc) {
        return new hwh(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(AdSlotEvent.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
