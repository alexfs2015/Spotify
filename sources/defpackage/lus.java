package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: lus reason: default package */
public final class lus implements gvk {
    private final luu b;
    private final InteractionLogger c;

    public lus(luu luu, InteractionLogger interactionLogger) {
        this.b = (luu) fay.a(luu);
        this.c = (InteractionLogger) fay.a(interactionLogger);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (uhq.g(string) || uhq.f(string)) {
            this.b.a(string);
            this.c.a(string, "browse-header", -1, InteractionType.HIT, "play");
        }
    }
}
