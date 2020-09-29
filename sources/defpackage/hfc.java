package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: hfc reason: default package */
public final class hfc implements wig<hfb> {
    private final wzi<FireAndForgetResolver> a;
    private final wzi<ObjectMapper> b;
    private final wzi<String> c;
    private final wzi<Integer> d;

    private hfc(wzi<FireAndForgetResolver> wzi, wzi<ObjectMapper> wzi2, wzi<String> wzi3, wzi<Integer> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hfc a(wzi<FireAndForgetResolver> wzi, wzi<ObjectMapper> wzi2, wzi<String> wzi3, wzi<Integer> wzi4) {
        return new hfc(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hfb(this.a, this.b, this.c, this.d);
    }
}
