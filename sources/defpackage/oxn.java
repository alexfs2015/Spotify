package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oxn reason: default package */
public final class oxn implements oxk {
    private final InteractionLogger a;

    public oxn(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a() {
        this.a.a(null, "edit-button", 0, InteractionType.HIT, "edit-clicked");
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "pause");
    }

    public final void b(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "play");
    }
}
