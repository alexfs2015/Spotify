package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: pgq reason: default package */
public final class pgq implements wig<pgp> {
    private final wzi<InteractionLogger> a;

    private pgq(wzi<InteractionLogger> wzi) {
        this.a = wzi;
    }

    public static pgq a(wzi<InteractionLogger> wzi) {
        return new pgq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pgp((InteractionLogger) this.a.get());
    }
}
