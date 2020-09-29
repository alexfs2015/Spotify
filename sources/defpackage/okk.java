package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: okk reason: default package */
public final class okk implements okh {
    private final InteractionLogger a;

    public okk(opb opb, gjf gjf) {
        this.a = opb.a(gjf);
    }

    public final void a() {
        this.a.a(null, "add-songs-button-in-empty-view", 0, InteractionType.HIT, "add-songs-clicked");
    }

    public final void b() {
        this.a.a(null, "home-button", 0, InteractionType.HIT, "home-clicked");
    }
}
