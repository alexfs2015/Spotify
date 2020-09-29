package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: lqi reason: default package */
public final class lqi implements vua<ioo> {
    private final wlc<RxResolver> a;

    public static ioo a(RxResolver rxResolver) {
        return (ioo) vuf.a(CC.a(rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((RxResolver) this.a.get());
    }
}
