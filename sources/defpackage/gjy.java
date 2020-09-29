package defpackage;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.http.wg.WebgateTokenProvider.WebgateTokenException;
import okhttp3.Protocol;

/* renamed from: gjy reason: default package */
public final class gjy implements xae {
    private final gjz a;
    private final wzi<WebgateTokenProvider> b;

    public gjy(gjz gjz, wzi<WebgateTokenProvider> wzi) {
        this.a = gjz;
        this.b = wzi;
    }

    private static xal a(a aVar, xaj xaj, String str) {
        a a2 = xaj.a();
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(str);
        return aVar.a(a2.b("Authorization", sb.toString()).a());
    }

    public final xal a(a aVar) {
        xaj a2 = aVar.a();
        String str = "No-Webgate-Authentication";
        if (a2.a(str) != null) {
            return aVar.a(a2.a().b(str).a());
        }
        if (a2.b().j) {
            return aVar.a(a2);
        }
        if (this.a.a(a2)) {
            Class<Object> cls = Object.class;
            if (!(cls.cast(a2.e.get(cls)) instanceof gjx) && TextUtils.isEmpty(a2.a("Authorization"))) {
                int c = aVar.c() / 2;
                try {
                    xal a3 = a(aVar, a2, ((WebgateTokenProvider) this.b.get()).a(c));
                    if (a3.c == 401) {
                        Logger.b("Webgate request returned 401 unauthorized. Will renew token and try again.", new Object[0]);
                        if (a3.g != null) {
                            a3.g.close();
                        }
                        a3 = a(aVar, a2, ((WebgateTokenProvider) this.b.get()).b(c));
                    }
                    return a3;
                } catch (WebgateTokenException unused) {
                    Logger.e("Could not retrieve access token for a webgate request: %s %s", a2.b, a2.a);
                    a aVar2 = new a();
                    aVar2.a = a2;
                    aVar2.c = 503;
                    aVar2.b = Protocol.HTTP_1_1;
                    aVar2.g = xam.a(null, new byte[0]);
                    aVar2.d = "";
                    return aVar2.a();
                }
            }
        }
        return aVar.a(a2);
    }
}
