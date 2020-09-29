package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* renamed from: son reason: default package */
public final class son {

    /* renamed from: son$a */
    public interface a {
        void a(String str);
    }

    public static Flowable<String> a(sry sry, a aVar, Scheduler scheduler) {
        Flowable a2 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$son$KaTJR34sjSqyvFRrZ75kUElCFQ<T>(aVar, sry), BackpressureStrategy.LATEST);
        $$Lambda$son$vbVue8A2svqo5AcoO5amAC4mskg r2 = new $$Lambda$son$vbVue8A2svqo5AcoO5amAC4mskg(scheduler);
        ObjectHelper.a(r2, "debounceIndicator is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDebounce<T>(a2, r2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xfk a(Scheduler scheduler, String str) {
        return fbo.a(str) ? Flowable.b(10, TimeUnit.MILLISECONDS, scheduler) : Flowable.b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(final a aVar, sry sry, final FlowableEmitter flowableEmitter) {
        AnonymousClass1 r0 = new defpackage.sry.a() {
            public /* synthetic */ void a(boolean z) {
                CC.$default$a(this, z);
            }

            public /* synthetic */ void ah() {
                CC.$default$ah(this);
            }

            public final void c(String str) {
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a(str);
                }
            }

            public final void onQueryChanged(String str) {
                flowableEmitter.a(str);
            }
        };
        sry.a((defpackage.sry.a) r0);
        flowableEmitter.a(new $$Lambda$son$O980x5o_nKQEW0W6xqhSKVBYeqE(sry, r0));
    }
}
