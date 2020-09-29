package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: sej reason: default package */
public final class sej {
    private final upd a;
    private final sdq b;
    private final Scheduler c;
    private final int d;

    public sej(upd upd, sdq sdq, Scheduler scheduler, int i) {
        this.a = upd;
        this.b = (sdq) fay.a(sdq);
        this.c = scheduler;
        this.d = i;
    }

    public final Flowable<sge> a(shr shr, txs txs, a aVar, sfk sfk, sfj sfj, String str, boolean z) {
        Flowable c2 = seg.a(shr, aVar, this.c).c((Function<? super T, ? extends R>) $$Lambda$vjVZfeH3R7GGKbG9LZON6t_tYZg.INSTANCE);
        Flowable a2 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sej$7gyUz2FUIKNFW718x4CH6w9xpQw<T>(txs), BackpressureStrategy.LATEST).a((wrf<? extends U>) c2, (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$4e3nxzXSI8ZKwt9AKjYnOny2A.INSTANCE).a(Functions.a());
        int i = this.d;
        if (i > 0) {
            c2 = c2.c((long) i, TimeUnit.MILLISECONDS, this.c);
        }
        String h = shr.h();
        if (!h.equals(str) || fax.a(h)) {
            c2 = c2.c(sge.a(h));
        } else if (z) {
            c2 = c2.c(new sfz(h, new e(), null));
        }
        Flowable a3 = Flowable.a((wrf<? extends T>) c2, (wrf<? extends T>) new sdv(shr).a(sfk).c((Function<? super T, ? extends R>) $$Lambda$vjVZfeH3R7GGKbG9LZON6t_tYZg.INSTANCE));
        Flowable a4 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sej$REWdgeggtl0lfVKzfQNN06FkCVQ<T>(shr, sfj), BackpressureStrategy.LATEST);
        Flowable a5 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sej$qbUfHSVfLsQcjnPegqiFVkTTryk<T>(shr, this.a), BackpressureStrategy.LATEST);
        return Flowable.a((wrf<? extends T>) a3, (wrf<? extends T>) Flowable.a((wrf<? extends T>) a4, (wrf<? extends T>) a5), (wrf<? extends T>) this.b.a(shr), (wrf<? extends T>) a2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(final shr shr, sfj sfj, final FlowableEmitter flowableEmitter) {
        sfj.a = new sfi() {
            public final void onSuggestionClicked(String str, String str2, int i) {
                shr.a(str, false);
                flowableEmitter.a(new sfz(str, new b(i), str2));
            }

            public final void a(String str, int i) {
                shr.a(str, false);
                flowableEmitter.a(new sfz(str, new a(i), null));
            }
        };
        flowableEmitter.a(new $$Lambda$sej$uQSmLlTWEaFJDBF_E0L4mHm50(sfj));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(txs txs, FlowableEmitter flowableEmitter) {
        flowableEmitter.getClass();
        txs.a((txr) new $$Lambda$r5VsjqOAsSV1PSw_2BP1mnZt2U(flowableEmitter));
        flowableEmitter.a(new $$Lambda$sej$BMUSJwDcXmQHETsuCiMBIA5hy4(txs));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(shr shr, upd upd, FlowableEmitter flowableEmitter) {
        upd.a(new $$Lambda$sej$4gNV2aRJCVTcuoQ6bOmLL1xD6s4(shr, flowableEmitter));
        flowableEmitter.a(new $$Lambda$sej$fvW9xRsOP_OUiirDtSp_SVmVvc(upd));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(shr shr, FlowableEmitter flowableEmitter, String str) {
        shr.a(str, false);
        flowableEmitter.a(new sfz(str, new c(), null));
    }
}
