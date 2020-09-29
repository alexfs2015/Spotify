package defpackage;

import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import io.reactivex.schedulers.Schedulers;

/* renamed from: nqj reason: default package */
public final class nqj {
    private final nqq a;
    private final nqr b;

    public nqj(nqq nqq, nqr nqr) {
        this.a = nqq;
        this.b = nqr;
    }

    public c<ListeningHistoryModel, nqo, nqn> a() {
        return klb.a((kjz<M, E, F>) $$Lambda$flCFvXomTXV5P_etXUlHh7neeo0.INSTANCE, this.a.a()).b($$Lambda$nqj$SKDxQ0WdK52GXu_uoDFcA1Fb1e0.INSTANCE).a((kkp<kkv>) $$Lambda$nqj$ThDHiPkrtclwJzM89fczzf4Am1Y.INSTANCE).a(this.b.a()).a((kjo<M, F>) $$Lambda$02I3kEKrJyVv8CMNxagSlKX2G5I.INSTANCE).a(kkh.a("ListeningHistory"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv c() {
        return new kld(Schedulers.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv b() {
        return new kld(Schedulers.a());
    }
}
