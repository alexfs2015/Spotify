package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: giy reason: default package */
public final class giy {
    public static xgp a(xah xah, rwl rwl) {
        ObjectMapper a = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        a a2 = new a().a(new a().a("https").b("spclient.wg.spotify.com").b()).a(xah).a((a) new xgy(null, true)).a((a) new xhh()).a((a) xhc.a());
        if (a != null) {
            return a2.a((a) new xgz(a)).a();
        }
        throw new NullPointerException("mapper == null");
    }
}
