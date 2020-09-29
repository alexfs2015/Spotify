package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: txv reason: default package */
public final class txv implements wig<txu> {
    private final wzi<InteractionLogger> a;
    private final wzi<String> b;

    private txv(wzi<InteractionLogger> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static txv a(wzi<InteractionLogger> wzi, wzi<String> wzi2) {
        return new txv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new txu((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
