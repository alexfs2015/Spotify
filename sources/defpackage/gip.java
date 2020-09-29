package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.http.RequestInfo;
import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;
import java.util.List;

/* renamed from: gip reason: default package */
public final class gip implements gin {
    private static final byte[] a = "[]".getBytes(fbi.c);
    private final FireAndForgetResolver b;
    private final ObjectMapper c;

    gip(FireAndForgetResolver fireAndForgetResolver, rwl rwl) {
        this.b = fireAndForgetResolver;
        this.c = rwl.b();
    }

    private byte[] b(List<RequestInfo> list) {
        try {
            return this.c.writeValueAsBytes(list);
        } catch (JsonProcessingException e) {
            Assertion.a((Exception) e);
            return a;
        }
    }

    public final void a(List<RequestInfo> list) {
        this.b.resolve(new Request(Request.PUT, "sp://netstat/v1/request-info", Collections.emptyMap(), b(list)));
    }
}
