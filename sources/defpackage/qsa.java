package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qsa reason: default package */
public final class qsa {
    public final InteractionLogger a;
    private final ImpressionLogger b;

    public qsa(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.b = impressionLogger;
        this.a = interactionLogger;
    }
}
