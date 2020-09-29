package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: npj reason: default package */
public final class npj {
    public final InteractionLogger a;
    public final ImpressionLogger b;

    public npj(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = (InteractionLogger) fay.a(interactionLogger);
        this.b = (ImpressionLogger) fay.a(impressionLogger);
    }
}
