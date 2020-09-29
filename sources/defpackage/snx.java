package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: snx reason: default package */
public final class snx {
    private final boolean a;

    public snx(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final sry sry, final FlowableEmitter flowableEmitter) {
        AnonymousClass1 r0 = new a() {
            public final void a(boolean z) {
                if (z) {
                    flowableEmitter.a(sql.a(sry.h()));
                }
            }

            public final void ah() {
            }

            public final void c(String str) {
                flowableEmitter.a(new sqg(str, new d(), null));
            }

            public final void onQueryChanged(String str) {
            }
        };
        sry.a((a) r0);
        flowableEmitter.a(new $$Lambda$snx$rVDG8_TCLZY6kWSethk8VPjHJJU(sry, r0));
    }

    /* access modifiers changed from: 0000 */
    public final Flowable<sql> a(sry sry) {
        return !this.a ? Flowable.d() : Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$snx$Y4hT6AlfkuavgYyupmJ3_T_fHuw<T>(this, sry), BackpressureStrategy.LATEST);
    }
}
