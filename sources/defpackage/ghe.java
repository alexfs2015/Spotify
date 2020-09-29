package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.http.RequestInfo;
import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;
import java.util.List;

/* renamed from: ghe reason: default package */
public final class ghe implements ghc {
    private static final byte[] a = "[]".getBytes(far.c);
    private final FireAndForgetResolver b;
    private final ObjectMapper c;

    ghe(FireAndForgetResolver fireAndForgetResolver, rnf rnf) {
        this.b = fireAndForgetResolver;
        this.c = rnf.b();
    }

    public final void a(List<RequestInfo> list) {
        this.b.resolve(new Request(Request.PUT, "sp://netstat/v1/request-info", Collections.emptyMap(), b(list)));
    }

    private byte[] b(List<RequestInfo> list) {
        try {
            return this.c.writeValueAsBytes(list);
        } catch (JsonProcessingException e) {
            Assertion.a((Exception) e);
            return a;
        }
    }
}
