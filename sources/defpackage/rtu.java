package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: rtu reason: default package */
public final class rtu implements vua<rtt> {
    private final wlc<MediaSessionCompat> a;
    private final wlc<Context> b;
    private final wlc<rtc> c;

    private rtu(wlc<MediaSessionCompat> wlc, wlc<Context> wlc2, wlc<rtc> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rtu a(wlc<MediaSessionCompat> wlc, wlc<Context> wlc2, wlc<rtc> wlc3) {
        return new rtu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rtt((MediaSessionCompat) this.a.get(), (Context) this.b.get(), (rtc) this.c.get());
    }
}
