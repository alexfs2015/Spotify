package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: twm reason: default package */
public final class twm implements wig<twl> {
    private final wzi<InteractionLogger> a;
    private final wzi<String> b;

    private twm(wzi<InteractionLogger> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static twm a(wzi<InteractionLogger> wzi, wzi<String> wzi2) {
        return new twm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new twl((InteractionLogger) this.a.get(), (String) this.b.get());
    }
}
