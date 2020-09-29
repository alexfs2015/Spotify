package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: qvs reason: default package */
public final class qvs implements vua<ioc> {
    private final wlc<RxResolver> a;

    private qvs(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static qvs a(wlc<RxResolver> wlc) {
        return new qvs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ioc) vuf.a(new ioc((RxResolver) this.a.get(), "@"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
