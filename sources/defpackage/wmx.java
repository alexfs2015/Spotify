package defpackage;

import java.util.List;

/* renamed from: wmx reason: default package */
public final class wmx implements wly {
    private final wlq a;

    public wmx(wlq wlq) {
        this.a = wlq;
    }

    public final wmf a(a aVar) {
        boolean z;
        wmd a2 = aVar.a();
        a a3 = a2.a();
        wme wme = a2.d;
        String str = "Content-Type";
        String str2 = "Content-Length";
        if (wme != null) {
            wlz a4 = wme.a();
            if (a4 != null) {
                a3.a(str, a4.toString());
            }
            long b = wme.b();
            String str3 = "Transfer-Encoding";
            if (b != -1) {
                a3.a(str2, Long.toString(b));
                a3.b(str3);
            } else {
                a3.a(str3, "chunked");
                a3.b(str2);
            }
        }
        String str4 = "Host";
        if (a2.a(str4) == null) {
            a3.a(str4, wmk.a(a2.a, false));
        }
        String str5 = "Connection";
        if (a2.a(str5) == null) {
            a3.a(str5, "Keep-Alive");
        }
        String str6 = "Accept-Encoding";
        String str7 = "gzip";
        if (a2.a(str6) == null && a2.a("Range") == null) {
            a3.a(str6, str7);
            z = true;
        } else {
            z = false;
        }
        List a5 = this.a.a();
        if (!a5.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = a5.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                wlp wlp = (wlp) a5.get(i);
                sb.append(wlp.a);
                sb.append('=');
                sb.append(wlp.b);
            }
            a3.a("Cookie", sb.toString());
        }
        String str8 = "User-Agent";
        if (a2.a(str8) == null) {
            a3.a(str8, "okhttp/3.12.3");
        }
        wmf a6 = aVar.a(a3.a());
        wnb.a(this.a, a2.a, a6.f);
        a b2 = a6.b();
        b2.a = a2;
        if (z) {
            String str9 = "Content-Encoding";
            if (str7.equalsIgnoreCase(a6.a(str9)) && wnb.d(a6)) {
                wos wos = new wos(a6.g.c());
                b2.a(a6.f.b().b(str9).b(str2).a());
                b2.g = new wne(a6.a(str), -1, wou.a((wpa) wos));
            }
        }
        return b2.a();
    }
}
