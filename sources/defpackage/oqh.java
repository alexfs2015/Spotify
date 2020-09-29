package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oqh reason: default package */
public final class oqh implements oqe {
    private final InteractionLogger a;

    public oqh(opb opb, gjf gjf) {
        this.a = opb.a(gjf);
    }

    public final void a() {
        this.a.a(null, "edit-button", 0, InteractionType.HIT, "edit-clicked");
    }

    public final void b(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "play");
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "pause");
    }
}
