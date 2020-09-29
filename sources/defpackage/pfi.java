package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: pfi reason: default package */
public final class pfi implements wig<pfh> {
    private final wzi<InteractionLogger> a;
    private final wzi<String> b;

    private pfi(wzi<InteractionLogger> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pfi a(wzi<InteractionLogger> wzi, wzi<String> wzi2) {
        return new pfi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pfh((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
