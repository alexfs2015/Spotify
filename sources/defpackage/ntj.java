package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;

/* renamed from: ntj reason: default package */
public final class ntj implements vua<Observable<SessionState>> {
    private final wlc<hvl> a;

    private ntj(wlc<hvl> wlc) {
        this.a = wlc;
    }

    public static ntj a(wlc<hvl> wlc) {
        return new ntj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((hvl) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
