package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: nzk reason: default package */
public final class nzk implements wig<nzq> {
    private final wzi<nzt> a;
    private final wzi<Scheduler> b;
    private final wzi<nyx> c;
    private final wzi<Observable<SessionState>> d;
    private final wzi<nzo> e;

    private nzk(wzi<nzt> wzi, wzi<Scheduler> wzi2, wzi<nyx> wzi3, wzi<Observable<SessionState>> wzi4, wzi<nzo> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static nzk a(wzi<nzt> wzi, wzi<Scheduler> wzi2, wzi<nyx> wzi3, wzi<Observable<SessionState>> wzi4, wzi<nzo> wzi5) {
        nzk nzk = new nzk(wzi, wzi2, wzi3, wzi4, wzi5);
        return nzk;
    }

    public final /* synthetic */ Object get() {
        nzq nzq = new nzq((nzt) this.a.get(), (Scheduler) this.b.get(), (nyx) this.c.get(), (Observable) this.d.get(), (nzo) this.e.get());
        return (nzq) wil.a(nzq, "Cannot return null from a non-@Nullable @Provides method");
    }
}
