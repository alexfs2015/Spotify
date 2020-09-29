package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: lys reason: default package */
public final class lys implements wig<lyr> {
    private final wzi<lyt> a;
    private final wzi<InteractionLogger> b;

    private lys(wzi<lyt> wzi, wzi<InteractionLogger> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lys a(wzi<lyt> wzi, wzi<InteractionLogger> wzi2) {
        return new lys(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lyr((lyt) this.a.get(), (InteractionLogger) this.b.get());
    }
}
