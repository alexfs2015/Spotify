package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Locale;

/* renamed from: hee reason: default package */
public final class hee {
    private final FireAndForgetResolver a;

    public hee(FireAndForgetResolver fireAndForgetResolver) {
        this.a = fireAndForgetResolver;
    }

    public final void a(String str, String str2) {
        this.a.resolve(new Request(Request.PUT, String.format(Locale.US, "sp://product-state/v1/values/%s", new Object[]{str}), Collections.emptyMap(), str2.getBytes(Charset.defaultCharset())));
    }
}
