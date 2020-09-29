package defpackage;

import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: llc reason: default package */
public final class llc implements wig<MediaSessionCompat> {
    private final wzi<seb> a;

    private llc(wzi<seb> wzi) {
        this.a = wzi;
    }

    public static llc a(wzi<seb> wzi) {
        return new llc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (MediaSessionCompat) wil.a(((seb) this.a.get()).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
