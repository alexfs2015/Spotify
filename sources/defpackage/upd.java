package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: upd reason: default package */
public final class upd {
    public final ImpressionLogger a;
    private final InteractionLogger b;

    public upd(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.a = impressionLogger;
        this.b = interactionLogger;
    }

    public final void a() {
        a("cancel-end-session", "confirm-end-session-dialog", -1);
    }

    public void a(String str, int i) {
        this.b.a("", (String) null, "social-listening", "card-view", i, InteractionType.HIT, str);
    }

    public void a(String str, String str2, int i) {
        this.b.a("", (String) null, "social-listening", str2, i, InteractionType.HIT, str);
    }
}
