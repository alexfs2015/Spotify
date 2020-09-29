package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: hcg reason: default package */
public final class hcg implements vua<hcf> {
    private final wlc<FireAndForgetResolver> a;
    private final wlc<ObjectMapper> b;
    private final wlc<String> c;
    private final wlc<Integer> d;

    private hcg(wlc<FireAndForgetResolver> wlc, wlc<ObjectMapper> wlc2, wlc<String> wlc3, wlc<Integer> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hcg a(wlc<FireAndForgetResolver> wlc, wlc<ObjectMapper> wlc2, wlc<String> wlc3, wlc<Integer> wlc4) {
        return new hcg(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hcf(this.a, this.b, this.c, this.d);
    }
}
