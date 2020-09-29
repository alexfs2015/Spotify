package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: ghw reason: default package */
public final class ghw implements vua<ghi> {
    private final wlc<Context> a;

    private ghw(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ghw a(wlc<Context> wlc) {
        return new ghw(wlc);
    }

    public final /* synthetic */ Object get() {
        File a2 = ghj.a((Context) this.a.get(), "picasso-cache");
        return (ghi) vuf.a(new ghj(a2, ghj.a(a2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
