package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ncn reason: default package */
public final class ncn implements vua<ioi> {
    private final wlc<RxResolver> a;

    public static ioi a(RxResolver rxResolver) {
        return (ioi) vuf.a(CC.b(rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((RxResolver) this.a.get());
    }
}
