package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: sjx reason: default package */
public final class sjx {
    private final jjf a;
    private final jrp b;
    private final sjy c;

    public sjx(jjf jjf, jrp jrp, sjy sjy) {
        this.a = jjf;
        this.b = jrp;
        this.c = sjy;
    }

    public final void a(String str, String str2) {
        if (this.c.a(str, str2)) {
            c(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.c.b(str, str2)) {
            d(str, str2);
        }
    }

    private void c(String str, String str2) {
        String str3 = str;
        bi biVar = new bi(null, "com.spotify.music.lowfrictionsearch", "spotify:lfs", null, 0, str3, "tap", str2, (double) this.b.a(), null);
        this.a.a(biVar);
        Logger.a("Log interaction - TargetUri: %s, InteractionType: %s, UserIntent: %s", str, "tap", str2);
    }

    private void d(String str, String str2) {
        bf bfVar = new bf(null, "com.spotify.music.lowfrictionsearch", "spotify:lfs", null, 0, str, null, str2, (double) this.b.a());
        this.a.a(bfVar);
        Logger.a("Log impression - TargetUri: %s, RenderType: %s", str, str2);
    }
}
