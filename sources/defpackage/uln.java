package defpackage;

import java.util.concurrent.TimeUnit;
import rx.internal.operators.CachedObservable;
import rx.internal.operators.NeverObservableHolder;

/* renamed from: uln reason: default package */
public final class uln implements wut<vri, wud<Long>> {
    /* access modifiers changed from: private */
    public final wug a;

    public final /* synthetic */ Object call(Object obj) {
        return (wud) ((vri) obj).a((gct<c, R_>) new gct<c, wud<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return NeverObservableHolder.a();
            }
        }, (gct<d, R_>) new gct<d, wud<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return CachedObservable.a(wud.a(6000, TimeUnit.MILLISECONDS, uln.this.a), 16);
            }
        }, (gct<b, R_>) new gct<b, wud<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return NeverObservableHolder.a();
            }
        }, (gct<a, R_>) new gct<a, wud<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return CachedObservable.a(wud.a(2000, TimeUnit.MILLISECONDS, uln.this.a), 16);
            }
        }, (gct<e, R_>) new gct<e, wud<Long>>() {
            public final /* synthetic */ Object apply(Object obj) {
                return NeverObservableHolder.a();
            }
        });
    }

    public uln(wug wug) {
        this.a = (wug) fay.a(wug);
    }
}
