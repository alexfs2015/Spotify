package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oxa reason: default package */
public final class oxa implements a {
    private final InteractionLogger a;
    private final String b;

    public oxa(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "show-description", -1, InteractionType.HIT, "open-show-description-url");
    }

    public final void a() {
        this.a.a(this.b, "show-description", -1, InteractionType.HIT, "expand-show-description");
    }
}
