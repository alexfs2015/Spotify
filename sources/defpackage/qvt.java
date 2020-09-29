package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: qvt reason: default package */
public final class qvt implements vua<ioi> {
    private final wlc<RxResolver> a;

    private qvt(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static qvt a(wlc<RxResolver> wlc) {
        return new qvt(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ioi) vuf.a(new ioi((RxResolver) this.a.get(), "@"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
