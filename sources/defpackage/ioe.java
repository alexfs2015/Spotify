package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ioe reason: default package */
public final class ioe implements vua<iod> {
    private final wlc<RxResolver> a;

    private ioe(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static ioe a(wlc<RxResolver> wlc) {
        return new ioe(wlc);
    }

    public final /* synthetic */ Object get() {
        return new iod(this.a);
    }
}
