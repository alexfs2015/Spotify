package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.follow.FollowManager;
import io.reactivex.Scheduler;

/* renamed from: qsq reason: default package */
public final class qsq implements wig<qsp> {
    private final wzi<FollowManager> a;
    private final wzi<rls> b;
    private final wzi<qqc> c;
    private final wzi<Scheduler> d;
    private final wzi<a> e;

    private qsq(wzi<FollowManager> wzi, wzi<rls> wzi2, wzi<qqc> wzi3, wzi<Scheduler> wzi4, wzi<a> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qsq a(wzi<FollowManager> wzi, wzi<rls> wzi2, wzi<qqc> wzi3, wzi<Scheduler> wzi4, wzi<a> wzi5) {
        qsq qsq = new qsq(wzi, wzi2, wzi3, wzi4, wzi5);
        return qsq;
    }

    public final /* synthetic */ Object get() {
        qsp qsp = new qsp((FollowManager) this.a.get(), (rls) this.b.get(), (qqc) this.c.get(), (Scheduler) this.d.get(), (a) this.e.get());
        return qsp;
    }
}
