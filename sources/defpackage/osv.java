package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: osv reason: default package */
public final class osv implements oss {
    private final InteractionLogger a;

    public osv(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "pause");
    }

    public final void a(String str, boolean z) {
        this.a.a(str, "header", 0, InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
    }

    public final void b(String str) {
        String str2 = str;
        this.a.a(str2, "play-button", 0, InteractionType.HIT, "play");
    }

    public final void c(String str) {
        String str2 = str;
        this.a.a(str2, "cover-art", 0, InteractionType.HIT, "cover-art-clicked");
    }

    public final void d(String str) {
        String str2 = str;
        this.a.a(str2, "header-second-page", 0, InteractionType.HIT, "owner-clicked");
    }
}
