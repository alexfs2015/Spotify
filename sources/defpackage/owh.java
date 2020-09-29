package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: owh reason: default package */
public final class owh {
    private final jlr a;
    private final sso b;

    public owh(jlr jlr, sso sso) {
        this.a = jlr;
        this.b = sso;
    }

    public final InteractionLogger a(gkq gkq) {
        return new InteractionLogger(this.a, this.b, gkq);
    }
}
