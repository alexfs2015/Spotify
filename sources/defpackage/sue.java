package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: sue reason: default package */
public final class sue {
    private final jlr a;
    private final jtz b;
    private final suf c;

    public sue(jlr jlr, jtz jtz, suf suf) {
        this.a = jlr;
        this.b = jtz;
        this.c = suf;
    }

    private void c(String str, String str2) {
        String str3 = str;
        bh bhVar = new bh(null, "com.spotify.music.lowfrictionsearch", "spotify:lfs", null, 0, str3, "tap", str2, (double) this.b.a(), null);
        this.a.a(bhVar);
        Logger.a("Log interaction - TargetUri: %s, InteractionType: %s, UserIntent: %s", str, "tap", str2);
    }

    private void d(String str, String str2) {
        be beVar = new be(null, "com.spotify.music.lowfrictionsearch", "spotify:lfs", null, 0, str, null, str2, (double) this.b.a());
        this.a.a(beVar);
        Logger.a("Log impression - TargetUri: %s, RenderType: %s", str, str2);
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
}
