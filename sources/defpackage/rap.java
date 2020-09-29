package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: rap reason: default package */
public final class rap {
    public final InteractionLogger a;
    private final ImpressionLogger b;

    public rap(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.b = impressionLogger;
        this.a = interactionLogger;
    }
}
