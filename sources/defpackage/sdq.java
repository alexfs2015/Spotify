package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: sdq reason: default package */
public final class sdq {
    private final boolean a;

    public sdq(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: 0000 */
    public final Flowable<sge> a(shr shr) {
        if (!this.a) {
            return Flowable.d();
        }
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sdq$73Z8xd2ZuzfVhIEpyXaTUjcNRxE<T>(this, shr), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final shr shr, final FlowableEmitter flowableEmitter) {
        AnonymousClass1 r0 = new a() {
            public final void ah() {
            }

            public final void onQueryChanged(String str) {
            }

            public final void c(String str) {
                flowableEmitter.a(new sfz(str, new d(), null));
            }

            public final void a(boolean z) {
                if (z) {
                    flowableEmitter.a(sge.a(shr.h()));
                }
            }
        };
        shr.a((a) r0);
        flowableEmitter.a(new $$Lambda$sdq$H1GvrxQZ2dhDTO4S0Uuh4cMwsI(shr, r0));
    }
}
