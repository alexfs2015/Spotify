package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;

/* renamed from: nzm reason: default package */
public final class nzm implements wig<Observable<SessionState>> {
    private final wzi<hxx> a;

    private nzm(wzi<hxx> wzi) {
        this.a = wzi;
    }

    public static nzm a(wzi<hxx> wzi) {
        return new nzm(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((hxx) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
