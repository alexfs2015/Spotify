package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oro reason: default package */
public final class oro implements orl {
    private final InteractionLogger a;

    public oro(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a() {
        this.a.a(null, "add-songs-button-in-empty-view", 0, InteractionType.HIT, "add-songs-clicked");
    }

    public final void b() {
        this.a.a(null, "home-button", 0, InteractionType.HIT, "home-clicked");
    }
}
