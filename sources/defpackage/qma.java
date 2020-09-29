package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: qma reason: default package */
public final class qma implements vua<qlz> {
    private final wlc<RxResolver> a;

    private qma(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static qma a(wlc<RxResolver> wlc) {
        return new qma(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qlz((RxResolver) this.a.get());
    }
}
