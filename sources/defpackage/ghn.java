package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: ghn reason: default package */
public final class ghn {
    public static wsk a(wmb wmb, rnf rnf) {
        ObjectMapper a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        a a2 = new a().a(new a().a("https").b("spclient.wg.spotify.com").b()).a(wmb).a((a) new wst(null, true)).a((a) new wtc()).a((a) wsx.a());
        if (a != null) {
            return a2.a((a) new wsu(a)).a();
        }
        throw new NullPointerException("mapper == null");
    }
}
