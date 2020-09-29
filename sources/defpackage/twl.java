package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.playlist.models.Show;

/* renamed from: twl reason: default package */
public final class twl {
    private final InteractionLogger a;
    private final String b;

    twl(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    private void a(String str) {
        this.a.a(str, this.b, 0, InteractionType.HIT, "navigate-to-show-page");
    }

    public final void a(Show show) {
        a(show.getUri());
    }
}
