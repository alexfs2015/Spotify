package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Event;

/* renamed from: hyu reason: default package */
public final class hyu implements wig<gmm<Event>> {
    private final wzi<gmn> a;

    private hyu(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static hyu a(wzi<gmn> wzi) {
        return new hyu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(Event.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
