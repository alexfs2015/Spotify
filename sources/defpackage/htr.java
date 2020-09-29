package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.search.ClientCredentialsResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: htr reason: default package */
final class htr implements wly {
    private final String a;
    private final htv b;
    private final a c;

    /* renamed from: htr$a */
    interface a {
        ClientCredentialsResponse a(long j, TimeUnit timeUnit);
    }

    htr(htv htv, a aVar) {
        this("api.spotify.com", htv, aVar);
    }

    private htr(String str, htv htv, a aVar) {
        this.a = str;
        this.b = htv;
        this.c = aVar;
    }

    private static wmf a(defpackage.wly.a aVar, wmd wmd, String str) {
        defpackage.wmd.a a2 = wmd.a();
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(str);
        return aVar.a(a2.b("Authorization", sb.toString()).a());
    }

    public final wmf a(defpackage.wly.a aVar) {
        wmd a2 = aVar.a();
        if (!this.a.equals(a2.a.b)) {
            return aVar.a(a2);
        }
        String a3 = this.b.a();
        if (a3 == null) {
            a3 = a();
        }
        wmf a4 = a(aVar, a2, a3);
        if (a4.c == 401) {
            Logger.b("Request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
            if (a4.g != null) {
                a4.g.close();
            }
            htv htv = this.b;
            htv.b.a().a(htv.a).b();
            a4 = a(aVar, a2, a());
        }
        return a4;
    }

    private String a() {
        ClientCredentialsResponse a2 = this.c.a(15, TimeUnit.SECONDS);
        String accessToken = a2.getAccessToken();
        this.b.a(accessToken, TimeUnit.SECONDS.toMillis(a2.getExpiresIn().longValue()));
        return accessToken;
    }
}
