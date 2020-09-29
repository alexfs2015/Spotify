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

/* renamed from: soq reason: default package */
public final class soq {
    private final vai a;
    private final snx b;
    private final Scheduler c;
    private final int d;

    public soq(vai vai, snx snx, Scheduler scheduler, int i) {
        this.a = vai;
        this.b = (snx) fbp.a(snx);
        this.c = scheduler;
        this.d = i;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(sry sry, FlowableEmitter flowableEmitter, String str) {
        sry.a(str, false);
        flowableEmitter.a(new sqg(str, new c(), null));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(final sry sry, spq spq, final FlowableEmitter flowableEmitter) {
        spq.a = new spp() {
            public final void a(String str, int i) {
                sry.a(str, false);
                flowableEmitter.a(new sqg(str, new a(i), null));
            }

            public final void onSuggestionClicked(String str, String str2, int i) {
                sry.a(str, false);
                flowableEmitter.a(new sqg(str, new b(i), str2));
            }
        };
        flowableEmitter.a(new $$Lambda$soq$ax2qSu0FkxJU9GT1fcqaIFDhwuc(spq));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(sry sry, vai vai, FlowableEmitter flowableEmitter) {
        vai.a(new $$Lambda$soq$bkjJZTWFamsm8czj_cp0GFNXtp4(sry, flowableEmitter));
        flowableEmitter.a(new $$Lambda$soq$y4VHkuhim8TTSee5tzuQGtlMo(vai));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ukb ukb, FlowableEmitter flowableEmitter) {
        flowableEmitter.getClass();
        ukb.a((uka) new $$Lambda$nMvcO1DAFi9KNYnmhkcZuIUtmaU(flowableEmitter));
        flowableEmitter.a(new $$Lambda$soq$xv49XPKf2PyYNIeyqCWmXQ5er8(ukb));
    }

    public final Flowable<sql> a(sry sry, ukb ukb, a aVar, spr spr, spq spq, String str, boolean z) {
        Flowable c2 = son.a(sry, aVar, this.c).c((Function<? super T, ? extends R>) $$Lambda$jYGnstiYfJ4IXKNzg0z2IyrSB3w.INSTANCE);
        Flowable a2 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$soq$mi3ZW334IrKYHLlstPqN0EvZOc<T>(ukb), BackpressureStrategy.LATEST).a((xfk<? extends U>) c2, (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$O1jXUNCNdUoNXVVa_qkWpxTBNAw.INSTANCE).a(Functions.a());
        int i = this.d;
        if (i > 0) {
            c2 = c2.c((long) i, TimeUnit.MILLISECONDS, this.c);
        }
        String h = sry.h();
        if (!h.equals(str) || fbo.a(h)) {
            c2 = c2.c(sql.a(h));
        } else if (z) {
            c2 = c2.c(new sqg(h, new e(), null));
        }
        Flowable a3 = Flowable.a((xfk<? extends T>) c2, (xfk<? extends T>) new soc(sry).a(spr).c((Function<? super T, ? extends R>) $$Lambda$jYGnstiYfJ4IXKNzg0z2IyrSB3w.INSTANCE));
        Flowable a4 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$soq$DmC6sgMMmDjD6ibmKxTcScZbsU<T>(sry, spq), BackpressureStrategy.LATEST);
        Flowable a5 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$soq$DART9l86yrMRaIVnafXNQKUr6co<T>(sry, this.a), BackpressureStrategy.LATEST);
        return Flowable.a((xfk<? extends T>) a3, (xfk<? extends T>) Flowable.a((xfk<? extends T>) a4, (xfk<? extends T>) a5), (xfk<? extends T>) this.b.a(sry), (xfk<? extends T>) a2);
    }
}
