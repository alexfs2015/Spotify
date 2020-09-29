package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;

/* renamed from: ppv reason: default package */
public final class ppv {
    private final ppx a;
    private final pqs b;
    private final kjm<pqf> c;
    private final Scheduler d;
    private final Scheduler e;

    public ppv(ppx ppx, pqs pqs, pni pni, rka rka, Flowable<PlayerState> flowable, pqp pqp, Scheduler scheduler, Scheduler scheduler2) {
        this.a = ppx;
        this.b = pqs;
        this.c = kla.a(pni.b.b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$ppv$2XRXXKBxqIv7cgGUgPuefuV5FYs.INSTANCE), flowable.j().a((ObservableTransformer<? super T, ? extends R>) pqp).a((Predicate<? super T>) $$Lambda$ppv$IgFarqAaub79Hn6Kzx0MCGzsawc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ppv$AW2K_vuLHi4fwMZH7GochK4hyDE.INSTANCE), rka.a.c((Function<? super T, ? extends R>) $$Lambda$ppv$6CoNPTUJdkTjgXqC0zKSMKAM2rQ.INSTANCE));
        this.d = scheduler;
        this.e = scheduler2;
    }

    /* access modifiers changed from: 0000 */
    public c<pqh, pqf, pqe> a() {
        return klb.a((kjz<M, E, F>) $$Lambda$yOTlvH1_hXwio_EZup84t8ORziw.INSTANCE, pqi.a(this.a, this.b)).a(this.c).b(new $$Lambda$ppv$nbIcg61ebDmqPgD5IwA7D_XzArA(this)).a((kkp<kkv>) new $$Lambda$ppv$qZQ9ZFRjB4XwvosbcICRJ00c6_k<kkv>(this)).a(kkh.a("InAppMessagingPreviewTool"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv c() {
        return new kld(this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv b() {
        return new kld(this.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(pnm pnm) {
        ArrayList arrayList = new ArrayList(0);
        String str = "URI";
        if (pnm.c()) {
            arrayList.add(pqf.b(str, pnm.a()));
        }
        arrayList.add(pqf.a(str, pnm.b()));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pqf a(rjz rjz) {
        return (pqf) rjz.a($$Lambda$ppv$1SSNvmlMtCOMY3tlpwOtcWoBjno.INSTANCE, $$Lambda$ppv$nR5nJUx5BTOXXR9y8R5yZdO07f0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pqf a(prf prf) {
        if (prf instanceof f) {
            f fVar = (f) prf;
            return pqf.a(fVar.b, fVar.a);
        }
        e eVar = (e) prf;
        return pqf.b(eVar.b, eVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(prf prf) {
        return (prf instanceof e) || (prf instanceof f);
    }
}
