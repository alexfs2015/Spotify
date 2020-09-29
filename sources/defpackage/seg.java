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

/* renamed from: seg reason: default package */
public final class seg {

    /* renamed from: seg$a */
    public interface a {
        void a(String str);
    }

    public static Flowable<String> a(shr shr, a aVar, Scheduler scheduler) {
        Flowable a2 = Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$seg$lsAtO7DrpIMFurBQXl_IzD1qNzw<T>(aVar, shr), BackpressureStrategy.LATEST);
        $$Lambda$seg$yInK8yPYkqrBLM0iJMdTPfL0zOs r2 = new $$Lambda$seg$yInK8yPYkqrBLM0iJMdTPfL0zOs(scheduler);
        ObjectHelper.a(r2, "debounceIndicator is null");
        return RxJavaPlugins.a((Flowable<T>) new FlowableDebounce<T>(a2, r2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(final a aVar, shr shr, final FlowableEmitter flowableEmitter) {
        AnonymousClass1 r0 = new defpackage.shr.a() {
            public /* synthetic */ void a(boolean z) {
                CC.$default$a(this, z);
            }

            public /* synthetic */ void ah() {
                CC.$default$ah(this);
            }

            public final void onQueryChanged(String str) {
                flowableEmitter.a(str);
            }

            public final void c(String str) {
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a(str);
                }
            }
        };
        shr.a((defpackage.shr.a) r0);
        flowableEmitter.a(new $$Lambda$seg$JkaO9TrUA_lopfQpGUxVojBgyGU(shr, r0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wrf a(Scheduler scheduler, String str) {
        if (fax.a(str)) {
            return Flowable.b(10, TimeUnit.MILLISECONDS, scheduler);
        }
        return Flowable.b();
    }
}
