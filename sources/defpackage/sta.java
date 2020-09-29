package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: sta reason: default package */
public final class sta implements wig<InteractionLogger> {
    private final wzi<jlr> a;
    private final wzi<sso> b;
    private final wzi<gkq> c;

    private sta(wzi<jlr> wzi, wzi<sso> wzi2, wzi<gkq> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static sta a(wzi<jlr> wzi, wzi<sso> wzi2, wzi<gkq> wzi3) {
        return new sta(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new InteractionLogger((jlr) this.a.get(), (sso) this.b.get(), (gkq) this.c.get());
    }
}
