package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: qvx reason: default package */
public final class qvx implements vua<ioo> {
    private final wlc<RxResolver> a;

    private qvx(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static qvx a(wlc<RxResolver> wlc) {
        return new qvx(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ioo) vuf.a(new ioo((RxResolver) this.a.get(), "@"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
