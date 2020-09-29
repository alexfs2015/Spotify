package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;

/* renamed from: pyr reason: default package */
public final class pyr {
    private final pyt a;
    private final pzo b;
    private final kmv<pzb> c;
    private final Scheduler d;

    public pyr(pyt pyt, pzo pzo, pwe pwe, rtg rtg, Flowable<PlayerState> flowable, pzl pzl, Scheduler scheduler) {
        this.a = pyt;
        this.b = pzo;
        this.c = koj.a(pwe.b.b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$pyr$pjE7KL84sHlizcWDE2bGBTErbdE.INSTANCE), flowable.j().a((ObservableTransformer<? super T, ? extends R>) pzl).a((Predicate<? super T>) $$Lambda$pyr$UGXRKhHBcOBgig4H1QHIaRJJVy4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$pyr$g6gfcgIB1I_DYEzSkTAAKT05Zk.INSTANCE), rtg.a.c((Function<? super T, ? extends R>) $$Lambda$pyr$KaqTVM_g65mkMByiKVHXcwdv7tY.INSTANCE));
        this.d = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(pwi pwi) {
        ArrayList arrayList = new ArrayList(0);
        String str = "URI";
        if (pwi.c()) {
            arrayList.add(pzb.b(str, pwi.a()));
        }
        arrayList.add(pzb.a(str, pwi.b()));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pzb a(qab qab) {
        if (qab instanceof f) {
            f fVar = (f) qab;
            return pzb.a(fVar.b, fVar.a);
        }
        e eVar = (e) qab;
        return pzb.b(eVar.b, eVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pzb a(rtf rtf) {
        return (pzb) rtf.a($$Lambda$pyr$OUF0ZzVXeRjfFXeagJqk4fRQ71Q.INSTANCE, $$Lambda$pyr$iio7k9LVtI8vG0Dp9KjFqInwU6Q.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe b() {
        return new kom(this.d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(qab qab) {
        return (qab instanceof e) || (qab instanceof f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe c() {
        return new kom(this.d);
    }

    /* access modifiers changed from: 0000 */
    public c<pzd, pzb, pza> a() {
        return kok.a((kni<M, E, F>) $$Lambda$q_hWiNMhLOSPuBz10fjdbPpk8P4.INSTANCE, pze.a(this.a, this.b)).a(this.c).b(new $$Lambda$pyr$ETHRTpBR3nKV5u18MXf3DF4ZoE(this)).a((kny<koe>) new $$Lambda$pyr$330q_ooCsApXLKb692uBhuEP8<koe>(this)).a(knq.a("InAppMessagingPreviewTool"));
    }
}
