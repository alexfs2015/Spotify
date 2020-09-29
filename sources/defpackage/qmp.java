package defpackage;

import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: qmp reason: default package */
public final class qmp {
    public final ImpressionLogger a;
    private final InteractionLogger b;

    public qmp(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.b = interactionLogger;
        this.a = impressionLogger;
    }

    public void a(String str, String str2, int i, InteractionType interactionType, Intent intent) {
        this.b.a(null, str2, 0, interactionType, intent.mIntent);
    }
}
