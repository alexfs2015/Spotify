package defpackage;

import android.net.Uri;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;

/* renamed from: pyw reason: default package */
public final class pyw implements sfx {
    private final jjf a;
    private final udr b;
    private final a c;
    private final jrp d;

    public pyw(jjf jjf, udr udr, a aVar, jrp jrp) {
        this.a = (jjf) fay.a(jjf);
        this.b = (udr) fay.a(udr);
        this.c = (a) fay.a(aVar);
        this.d = jrp;
    }

    public final void a(String str) {
        jjf jjf = this.a;
        bh bhVar = new bh((String) fay.a(str), ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), "search-field", -1, "", "hit", "clear", (double) this.d.a());
        jjf.a(bhVar);
    }

    public final void a(String str, int i) {
        a(str, i, "navigate-forward");
    }

    public final void a(String str, int i, String str2) {
        String str3;
        if (jst.h(str)) {
            str3 = str;
        } else {
            str3 = a(str, this.c.ae_());
        }
        jjf jjf = this.a;
        bh bhVar = new bh("", ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), "history", (long) i, str3, "hit", (String) fay.a(str2), (double) this.d.a());
        jjf.a(bhVar);
    }

    public final void b(String str, int i) {
        if (!jst.h(str)) {
            str = a(str, this.c.ae_());
        }
        String str2 = str;
        jjf jjf = this.a;
        bh bhVar = new bh("", ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), "history", (long) i, str2, "hit", "dismiss", (double) this.d.a());
        jjf.a(bhVar);
    }

    public final void a() {
        jjf jjf = this.a;
        bh bhVar = new bh("", ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), "history", -1, "", "hit", "clear", (double) this.d.a());
        jjf.a(bhVar);
    }

    public final void b(String str) {
        jjf jjf = this.a;
        String str2 = str;
        bh bhVar = new bh(null, ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), "search-field", -1, str2, "hit", BackNavigationInteractionType.UP_BUTTON_PRESSED.toString(), (double) this.d.a());
        jjf.a(bhVar);
    }

    public final void a(String str, String str2, int i, String str3) {
        jjf jjf = this.a;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        bh bhVar = new bh(str4, ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), str5, (long) i, str6, "hit", "play", (double) this.d.a());
        jjf.a(bhVar);
    }

    public final void b(String str, String str2, int i, String str3) {
        jjf jjf = this.a;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        bh bhVar = new bh(str4, ((udr) fay.a(this.b)).a(), ((a) fay.a(this.c)).ae_().toString(), str5, (long) i, str6, "hit", "navigate-forward", (double) this.d.a());
        jjf.a(bhVar);
    }

    private static String a(String str, sih sih) {
        return String.format("%s%s:%s", new Object[]{fay.a(sih), "history", Uri.encode((String) fay.a(str))});
    }
}
