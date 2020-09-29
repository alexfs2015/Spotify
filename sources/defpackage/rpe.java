package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: rpe reason: default package */
public final class rpe implements wig<ImpressionLogger> {
    private final wzi<jlr> a;
    private final wzi<sso> b;
    private final wzi<String> c;

    public static ImpressionLogger a(jlr jlr, sso sso, String str) {
        return (ImpressionLogger) wil.a(CC.a(jlr, sso, str), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jlr) this.a.get(), (sso) this.b.get(), (String) this.c.get());
    }
}
