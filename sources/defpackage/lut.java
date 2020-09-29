package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: lut reason: default package */
public final class lut implements vua<lus> {
    private final wlc<luu> a;
    private final wlc<InteractionLogger> b;

    private lut(wlc<luu> wlc, wlc<InteractionLogger> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lut a(wlc<luu> wlc, wlc<InteractionLogger> wlc2) {
        return new lut(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lus((luu) this.a.get(), (InteractionLogger) this.b.get());
    }
}
