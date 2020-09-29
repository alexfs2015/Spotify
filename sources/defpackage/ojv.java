package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: ojv reason: default package */
public final class ojv implements ojs {
    private final InteractionLogger a;

    public ojv(opb opb, gjf gjf) {
        this.a = opb.a(gjf);
    }

    public final void a(String str, boolean z) {
        this.a.a(str, "download-toggle-header", 0, InteractionType.HIT, z ? "offline-enable" : "offline-disable");
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "download-toggle-header", 0, InteractionType.HIT, "go-to-settings");
    }
}
