package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Event;

/* renamed from: hwi reason: default package */
public final class hwi implements vua<gky<Event>> {
    private final wlc<gkz> a;

    private hwi(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static hwi a(wlc<gkz> wlc) {
        return new hwi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(Event.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
