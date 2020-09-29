package defpackage;

import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: lhc reason: default package */
public final class lhc implements vua<MediaSessionCompat> {
    private final wlc<rur> a;

    private lhc(wlc<rur> wlc) {
        this.a = wlc;
    }

    public static lhc a(wlc<rur> wlc) {
        return new lhc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (MediaSessionCompat) vuf.a(((rur) this.a.get()).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
