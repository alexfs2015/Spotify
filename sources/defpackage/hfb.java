package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: hfb reason: default package */
public final class hfb {
    final wzi<FireAndForgetResolver> a;
    final wzi<ObjectMapper> b;
    final wzi<String> c;
    final wzi<Integer> d;

    public hfb(wzi<FireAndForgetResolver> wzi, wzi<ObjectMapper> wzi2, wzi<String> wzi3, wzi<Integer> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
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
