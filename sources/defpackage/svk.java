package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: svk reason: default package */
public final class svk implements wig<ImpressionLogger> {
    private final wzi<jlr> a;
    private final wzi<sso> b;

    private svk(wzi<jlr> wzi, wzi<sso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static svk a(wzi<jlr> wzi, wzi<sso> wzi2) {
        return new svk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ImpressionLogger) wil.a(new ImpressionLogger((jlr) this.a.get(), (sso) this.b.get(), "com.spotify.feature.lyrics"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
