package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.playlist.models.Show;

/* renamed from: tkt reason: default package */
public final class tkt {
    private final InteractionLogger a;
    private final String b;

    tkt(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    public final void a(Show show) {
        a(show.getUri());
    }

    private void a(String str) {
        this.a.a(str, this.b, 0, InteractionType.HIT, "navigate-to-show-page");
    }
}
