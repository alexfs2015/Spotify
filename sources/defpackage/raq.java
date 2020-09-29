package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: raq reason: default package */
public final class raq implements wig<rap> {
    private final wzi<ImpressionLogger> a;
    private final wzi<InteractionLogger> b;

    private raq(wzi<ImpressionLogger> wzi, wzi<InteractionLogger> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static raq a(wzi<ImpressionLogger> wzi, wzi<InteractionLogger> wzi2) {
        return new raq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rap((ImpressionLogger) this.a.get(), (InteractionLogger) this.b.get());
    }
}
