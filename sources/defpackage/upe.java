package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: upe reason: default package */
public final class upe implements wig<upd> {
    private final wzi<ImpressionLogger> a;
    private final wzi<InteractionLogger> b;

    private upe(wzi<ImpressionLogger> wzi, wzi<InteractionLogger> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static upe a(wzi<ImpressionLogger> wzi, wzi<InteractionLogger> wzi2) {
        return new upe(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new upd((ImpressionLogger) this.a.get(), (InteractionLogger) this.b.get());
    }
}
