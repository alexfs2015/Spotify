package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: mpz reason: default package */
public final class mpz implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<gvv> c;
    private final wlc<Map<String, gvk>> d;
    private final wlc<mqa> e;

    private mpz(wlc<Context> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<Map<String, gvk>> wlc4, wlc<mqa> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static mpz a(wlc<Context> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<Map<String, gvk>> wlc4, wlc<mqa> wlc5) {
        mpz mpz = new mpz(wlc, wlc2, wlc3, wlc4, wlc5);
        return mpz;
    }

    public final /* synthetic */ Object get() {
        gvv gvv = (gvv) this.c.get();
        Map map = (Map) this.d.get();
        mqa mqa = (mqa) this.e.get();
        return (gum) vuf.a(gvv.a((Context) this.a.get(), (a) this.b.get()).a(map).a.a(mqa).c(mqa).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
