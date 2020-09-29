package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: pga reason: default package */
public final class pga implements wig<pfz> {
    private final wzi<pej> a;
    private final wzi<Boolean> b;
    private final wzi<txq> c;
    private final wzi<ImpressionLogger> d;

    private pga(wzi<pej> wzi, wzi<Boolean> wzi2, wzi<txq> wzi3, wzi<ImpressionLogger> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pga a(wzi<pej> wzi, wzi<Boolean> wzi2, wzi<txq> wzi3, wzi<ImpressionLogger> wzi4) {
        return new pga(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pfz((pej) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (txq) this.c.get(), (ImpressionLogger) this.d.get());
    }
}
