package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: hcf reason: default package */
public final class hcf {
    final wlc<FireAndForgetResolver> a;
    final wlc<ObjectMapper> b;
    final wlc<String> c;
    final wlc<Integer> d;

    public hcf(wlc<FireAndForgetResolver> wlc, wlc<ObjectMapper> wlc2, wlc<String> wlc3, wlc<Integer> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
