package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: tyg reason: default package */
public final class tyg implements wig<tyf> {
    private final wzi<lar> a;
    private final wzi<gkq> b;
    private final wzi<InteractionLogger> c;

    private tyg(wzi<lar> wzi, wzi<gkq> wzi2, wzi<InteractionLogger> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tyg a(wzi<lar> wzi, wzi<gkq> wzi2, wzi<InteractionLogger> wzi3) {
        return new tyg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tyf((lar) this.a.get(), (gkq) this.b.get(), (InteractionLogger) this.c.get());
    }
}
