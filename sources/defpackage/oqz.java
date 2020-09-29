package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oqz reason: default package */
public final class oqz implements oqw {
    private final InteractionLogger a;

    public oqz(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "download-toggle-header", 0, InteractionType.HIT, "go-to-settings");
    }

    public final void a(String str, boolean z) {
        this.a.a(str, "download-toggle-header", 0, InteractionType.HIT, z ? "offline-enable" : "offline-disable");
    }
}
