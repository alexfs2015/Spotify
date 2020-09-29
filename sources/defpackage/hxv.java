package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;

/* renamed from: hxv reason: default package */
public final class hxv implements wig<Flowable<SessionState>> {
    private final wzi<hxx> a;

    private hxv(wzi<hxx> wzi) {
        this.a = wzi;
    }

    public static hxv a(wzi<hxx> wzi) {
        return new hxv(wzi);
    }

    public static Flowable<SessionState> a(hxx hxx) {
        return (Flowable) wil.a(hxx.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((hxx) this.a.get());
    }
}
