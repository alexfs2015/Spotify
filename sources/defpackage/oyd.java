package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oyd reason: default package */
public final class oyd implements oya {
    private final InteractionLogger a;

    public oyd(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a() {
        this.a.a(null, "auto-play", 0, InteractionType.DEFERRED, "auto-play");
    }

    public final void a(String str, int i) {
        String str2 = str;
        this.a.a(str2, "auto-play", i, InteractionType.DEFERRED, "auto-play");
    }
}
