package defpackage;

import android.net.Uri;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;

/* renamed from: qhu reason: default package */
public final class qhu implements sqe {
    private final jlr a;
    private final uqm b;
    private final a c;
    private final jtz d;

    public qhu(jlr jlr, uqm uqm, a aVar, jtz jtz) {
        this.a = (jlr) fbp.a(jlr);
        this.b = (uqm) fbp.a(uqm);
        this.c = (a) fbp.a(aVar);
        this.d = jtz;
    }

    private static String a(String str, sso sso) {
        return String.format("%s%s:%s", new Object[]{fbp.a(sso), "history", Uri.encode((String) fbp.a(str))});
    }

    public final void a() {
        jlr jlr = this.a;
        bg bgVar = new bg("", ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), "history", -1, "", "hit", "clear", (double) this.d.a());
        jlr.a(bgVar);
    }

    public final void a(String str) {
        jlr jlr = this.a;
        bg bgVar = new bg((String) fbp.a(str), ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), "search-field", -1, "", "hit", "clear", (double) this.d.a());
        jlr.a(bgVar);
    }

    public final void a(String str, int i) {
        a(str, i, "navigate-forward");
    }

    public final void a(String str, int i, String str2) {
        String str3;
        if (jva.h(str)) {
            str3 = str;
        } else {
            str3 = a(str, this.c.ae_());
        }
        jlr jlr = this.a;
        bg bgVar = new bg("", ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), "history", (long) i, str3, "hit", (String) fbp.a(str2), (double) this.d.a());
        jlr.a(bgVar);
    }

    public final void a(String str, String str2, int i, String str3) {
        jlr jlr = this.a;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        bg bgVar = new bg(str4, ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), str5, (long) i, str6, "hit", "play", (double) this.d.a());
        jlr.a(bgVar);
    }

    public final void b(String str) {
        jlr jlr = this.a;
        String str2 = str;
        bg bgVar = new bg(null, ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), "search-field", -1, str2, "hit", BackNavigationInteractionType.UP_BUTTON_PRESSED.toString(), (double) this.d.a());
        jlr.a(bgVar);
    }

    public final void b(String str, int i) {
        if (!jva.h(str)) {
            str = a(str, this.c.ae_());
        }
        String str2 = str;
        jlr jlr = this.a;
        bg bgVar = new bg("", ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), "history", (long) i, str2, "hit", "dismiss", (double) this.d.a());
        jlr.a(bgVar);
    }

    public final void b(String str, String str2, int i, String str3) {
        jlr jlr = this.a;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        bg bgVar = new bg(str4, ((uqm) fbp.a(this.b)).a(), ((a) fbp.a(this.c)).ae_().toString(), str5, (long) i, str6, "hit", "navigate-forward", (double) this.d.a());
        jlr.a(bgVar);
    }
}
