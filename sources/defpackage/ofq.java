package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: ofq reason: default package */
public final class ofq implements ofn {
    private final InteractionLogger a;

    public ofq(opb opb, gjf gjf) {
        this.a = opb.a(gjf);
    }

    public final void a() {
        this.a.a(null, "add-songs-button", 0, InteractionType.HIT, "add-songs-clicked");
    }
}
