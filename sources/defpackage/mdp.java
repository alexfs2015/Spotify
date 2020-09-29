package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: mdp reason: default package */
public final class mdp implements vua<mdo> {
    private final wlc<RxResolver> a;

    private mdp(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static mdp a(wlc<RxResolver> wlc) {
        return new mdp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mdo((RxResolver) this.a.get());
    }
}
