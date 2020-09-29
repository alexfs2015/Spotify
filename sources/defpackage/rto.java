package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import java.util.Set;

/* renamed from: rto reason: default package */
public final class rto implements vua<rtn> {
    private final wlc<MediaSessionCompat> a;
    private final wlc<Set<rti>> b;
    private final wlc<rtg> c;

    private rto(wlc<MediaSessionCompat> wlc, wlc<Set<rti>> wlc2, wlc<rtg> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rto a(wlc<MediaSessionCompat> wlc, wlc<Set<rti>> wlc2, wlc<rtg> wlc3) {
        return new rto(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rtn((MediaSessionCompat) this.a.get(), (Set) this.b.get(), (rtg) this.c.get());
    }
}
