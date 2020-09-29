package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: ouv reason: default package */
public final class ouv implements ous {
    private final InteractionLogger a;

    public ouv(owh owh, gkq gkq) {
        this.a = owh.a(gkq);
    }

    public final void a() {
        this.a.a(null, "item-list", 0, InteractionType.HIT, "education-row-dismissed");
    }

    public final void a(String str, int i) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, "item-clicked");
    }

    public final void a(String str, int i, boolean z) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, z ? "like-disable" : "like-enable");
    }

    public final void b(String str, int i) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, "item-context-menu-clicked");
    }

    public final void b(String str, int i, boolean z) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, z ? "ban-disable" : "ban-enable");
    }

    public final void c(String str, int i) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, "item-download-clicked");
    }

    public final void d(String str, int i) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, "item-play-paused-clicked");
    }

    public final void e(String str, int i) {
        String str2 = str;
        this.a.a(str2, "item-list", i, InteractionType.HIT, "education-footer-clicked");
    }
}
