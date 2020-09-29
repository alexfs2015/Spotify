package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: lyr reason: default package */
public final class lyr implements gxk {
    private final lyt b;
    private final InteractionLogger c;

    public lyr(lyt lyt, InteractionLogger interactionLogger) {
        this.b = (lyt) fbp.a(lyt);
        this.c = (InteractionLogger) fbp.a(interactionLogger);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (ute.f(string) || ute.e(string)) {
            this.b.a(string);
            this.c.a(string, "browse-header", -1, InteractionType.HIT, "play");
        }
    }
}
