package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: omu reason: default package */
public final class omu implements omr {
    private final InteractionLogger a;

    public omu(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a() {
        this.a.a(null, "add-songs-button", 0, InteractionType.HIT, "add-songs-clicked");
    }
}
