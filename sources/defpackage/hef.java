package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: hef reason: default package */
public final class hef implements vua<hee> {
    private final wlc<FireAndForgetResolver> a;

    private hef(wlc<FireAndForgetResolver> wlc) {
        this.a = wlc;
    }

    public static hef a(wlc<FireAndForgetResolver> wlc) {
        return new hef(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hee((FireAndForgetResolver) this.a.get());
    }
}
