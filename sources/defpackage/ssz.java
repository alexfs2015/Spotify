package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: ssz reason: default package */
public final class ssz implements wig<ImpressionLogger> {
    private final wzi<jlr> a;
    private final wzi<sso> b;
    private final wzi<gkq> c;

    private ssz(wzi<jlr> wzi, wzi<sso> wzi2, wzi<gkq> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ssz a(wzi<jlr> wzi, wzi<sso> wzi2, wzi<gkq> wzi3) {
        return new ssz(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ImpressionLogger((jlr) this.a.get(), (sso) this.b.get(), (gkq) this.c.get());
    }
}
