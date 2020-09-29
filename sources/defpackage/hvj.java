package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;

/* renamed from: hvj reason: default package */
public final class hvj implements vua<Flowable<SessionState>> {
    private final wlc<hvl> a;

    private hvj(wlc<hvl> wlc) {
        this.a = wlc;
    }

    public static hvj a(wlc<hvl> wlc) {
        return new hvj(wlc);
    }

    public static Flowable<SessionState> a(hvl hvl) {
        return (Flowable) vuf.a(hvl.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hvl) this.a.get());
    }
}
