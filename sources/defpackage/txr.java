package defpackage;

import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: txr reason: default package */
public final class txr implements wig<txq> {
    private final wzi<uig> a;
    private final wzi<PlaySourceProvider> b;
    private final wzi<Boolean> c;

    private txr(wzi<uig> wzi, wzi<PlaySourceProvider> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static txr a(wzi<uig> wzi, wzi<PlaySourceProvider> wzi2, wzi<Boolean> wzi3) {
        return new txr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new txq((uig) this.a.get(), (PlaySourceProvider) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
