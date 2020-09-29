package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;

/* renamed from: ktz reason: default package */
public final class ktz implements vua<kty> {
    private final wlc<Flowable<SessionState>> a;
    private final wlc<ktp> b;
    private final wlc<ktw> c;

    public static kty a(Flowable<SessionState> flowable, ktp ktp, Object obj) {
        return new kty(flowable, ktp, (ktw) obj);
    }

    public final /* synthetic */ Object get() {
        return new kty((Flowable) this.a.get(), (ktp) this.b.get(), (ktw) this.c.get());
    }
}
