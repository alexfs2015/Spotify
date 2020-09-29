package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: nvl reason: default package */
public final class nvl implements wig<nvk> {
    private final wzi<ImpressionLogger> a;
    private final wzi<InteractionLogger> b;

    private nvl(wzi<ImpressionLogger> wzi, wzi<InteractionLogger> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nvl a(wzi<ImpressionLogger> wzi, wzi<InteractionLogger> wzi2) {
        return new nvl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nvk((ImpressionLogger) this.a.get(), (InteractionLogger) this.b.get());
    }
}
