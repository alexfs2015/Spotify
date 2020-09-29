package defpackage;

import java.util.concurrent.TimeUnit;
import rx.internal.operators.CachedObservable;
import rx.internal.operators.NeverObservableHolder;

/* renamed from: uwr reason: default package */
public final class uwr implements xiy<weq, xii<Long>> {
    /* access modifiers changed from: private */
    public final xil a;

    public uwr(xil xil) {
        this.a = (xil) fbp.a(xil);
    }

    public final /* synthetic */ Object call(Object obj) {
        return (xii) ((weq) obj).a((gee<c, R_>) new gee<c, xii<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return NeverObservableHolder.a();
            }
        }, (gee<d, R_>) new gee<d, xii<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return CachedObservable.a(xii.a(6000, TimeUnit.MILLISECONDS, uwr.this.a), 16);
            }
        }, (gee<b, R_>) new gee<b, xii<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return NeverObservableHolder.a();
            }
        }, (gee<a, R_>) new gee<a, xii<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return CachedObservable.a(xii.a(2000, TimeUnit.MILLISECONDS, uwr.this.a), 16);
            }
        }, (gee<e, R_>) new gee<e, xii<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return NeverObservableHolder.a();
            }
        });
    }
}
