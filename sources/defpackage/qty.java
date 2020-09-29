package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: qty reason: default package */
public final class qty implements wig<qtx> {
    private final wzi<jlr> a;
    private final wzi<ImpressionLogger> b;
    private final wzi<qul> c;
    private final wzi<qtz> d;

    private qty(wzi<jlr> wzi, wzi<ImpressionLogger> wzi2, wzi<qul> wzi3, wzi<qtz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qtx a(jlr jlr, ImpressionLogger impressionLogger, qul qul, qtz qtz) {
        return new qtx(jlr, impressionLogger, qul, qtz);
    }

    public static qty a(wzi<jlr> wzi, wzi<ImpressionLogger> wzi2, wzi<qul> wzi3, wzi<qtz> wzi4) {
        return new qty(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qtx((jlr) this.a.get(), (ImpressionLogger) this.b.get(), (qul) this.c.get(), (qtz) this.d.get());
    }
}
