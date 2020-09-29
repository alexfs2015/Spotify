package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: noo reason: default package */
public final class noo implements wig<ImpressionLogger> {
    private final wzi<jlr> a;
    private final wzi<a> b;
    private final wzi<uqm> c;

    private noo(wzi<jlr> wzi, wzi<a> wzi2, wzi<uqm> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static noo a(wzi<jlr> wzi, wzi<a> wzi2, wzi<uqm> wzi3) {
        return new noo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (ImpressionLogger) wil.a(new ImpressionLogger((jlr) this.a.get(), ((a) this.b.get()).ae_(), ((uqm) this.c.get()).toString()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
