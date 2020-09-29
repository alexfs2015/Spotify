package defpackage;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.http.wg.WebgateTokenProvider.WebgateTokenException;
import okhttp3.Protocol;

/* renamed from: gin reason: default package */
public final class gin implements wly {
    private final gio a;
    private final wlc<WebgateTokenProvider> b;

    public gin(gio gio, wlc<WebgateTokenProvider> wlc) {
        this.a = gio;
        this.b = wlc;
    }

    public final wmf a(a aVar) {
        wmd a2 = aVar.a();
        String str = "No-Webgate-Authentication";
        if (a2.a(str) != null) {
            return aVar.a(a2.a().b(str).a());
        }
        if (this.a.a(a2)) {
            Class<Object> cls = Object.class;
            if (!(cls.cast(a2.e.get(cls)) instanceof gim) && TextUtils.isEmpty(a2.a("Authorization"))) {
                int c = aVar.c() / 2;
                try {
                    wmf a3 = a(aVar, a2, ((WebgateTokenProvider) this.b.get()).a(c));
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
                    aVar2.g = wmg.a(null, new byte[0]);
                    aVar2.d = "";
                    return aVar2.a();
                }
            }
        }
        return aVar.a(a2);
    }

    private static wmf a(a aVar, wmd wmd, String str) {
        a a2 = wmd.a();
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(str);
        return aVar.a(a2.b("Authorization", sb.toString()).a());
    }
}
