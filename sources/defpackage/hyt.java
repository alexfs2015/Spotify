package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: hyt reason: default package */
public final class hyt implements wig<gmm<AdSlotEvent>> {
    private final wzi<gmn> a;

    private hyt(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static hyt a(wzi<gmn> wzi) {
        return new hyt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(AdSlotEvent.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
