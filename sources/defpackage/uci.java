package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: uci reason: default package */
public final class uci {
    public final ImpressionLogger a;
    private final InteractionLogger b;

    public uci(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.a = impressionLogger;
        this.b = interactionLogger;
    }

    public void a(String str, int i) {
        this.b.a("", (String) null, "social-listening", "card-view", i, InteractionType.HIT, str);
    }

    public void a(String str, String str2, int i) {
        this.b.a("", (String) null, "social-listening", str2, i, InteractionType.HIT, str);
    }

    public final void a() {
        a("cancel-end-session", "confirm-end-session-dialog", -1);
    }
}
