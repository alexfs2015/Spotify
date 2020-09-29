package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.search.ClientCredentialsResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: hwd reason: default package */
final class hwd implements xae {
    private final String a;
    private final hwh b;
    private final a c;

    /* renamed from: hwd$a */
    interface a {
        ClientCredentialsResponse a(long j, TimeUnit timeUnit);
    }

    hwd(hwh hwh, a aVar) {
        this("api.spotify.com", hwh, aVar);
    }

    private hwd(String str, hwh hwh, a aVar) {
        this.a = str;
        this.b = hwh;
        this.c = aVar;
    }

    private String a() {
        ClientCredentialsResponse a2 = this.c.a(15, TimeUnit.SECONDS);
        String accessToken = a2.getAccessToken();
        this.b.a(accessToken, TimeUnit.SECONDS.toMillis(a2.getExpiresIn().longValue()));
        return accessToken;
    }

    private static xal a(defpackage.xae.a aVar, xaj xaj, String str) {
        defpackage.xaj.a a2 = xaj.a();
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(str);
        return aVar.a(a2.b("Authorization", sb.toString()).a());
    }

    public final xal a(defpackage.xae.a aVar) {
        xaj a2 = aVar.a();
        if (!this.a.equals(a2.a.b)) {
            return aVar.a(a2);
        }
        String a3 = this.b.a();
        if (a3 == null) {
            a3 = a();
        }
        xal a4 = a(aVar, a2, a3);
        if (a4.c == 401) {
            Logger.b("Request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
            if (a4.g != null) {
                a4.g.close();
            }
            hwh hwh = this.b;
            hwh.b.a().a(hwh.a).b();
            a4 = a(aVar, a2, a());
        }
        return a4;
    }
}
