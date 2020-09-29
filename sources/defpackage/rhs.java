package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsLoaderImpl;

/* renamed from: rhs reason: default package */
public final class rhs implements wig<RecsLoaderImpl> {
    private final wzi<gmn> a;
    private final wzi<rwl> b;

    private rhs(wzi<gmn> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rhs a(wzi<gmn> wzi, wzi<rwl> wzi2) {
        return new rhs(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new RecsLoaderImpl((gmn) this.a.get(), (rwl) this.b.get());
    }
}
