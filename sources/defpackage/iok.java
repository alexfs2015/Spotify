package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iok reason: default package */
public final class iok implements vua<ioj> {
    private final wlc<RxResolver> a;

    private iok(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static iok a(wlc<RxResolver> wlc) {
        return new iok(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ioj(this.a);
    }
}
