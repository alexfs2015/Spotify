package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: idt reason: default package */
public final class idt implements vua<ids> {
    private final wlc<gky<AdSlotEvent>> a;

    private idt(wlc<gky<AdSlotEvent>> wlc) {
        this.a = wlc;
    }

    public static idt a(wlc<gky<AdSlotEvent>> wlc) {
        return new idt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ids((gky) this.a.get());
    }
}
