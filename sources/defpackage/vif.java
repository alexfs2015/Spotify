package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Consumer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vif reason: default package */
public final class vif<T> {
    private Set<vig<?>> a = new HashSet();

    public final Observable<T> a(String str, Observable<T> observable) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$vif$u_PWhU7QAc0lGXduV1STPymrfjI<T>(this, str, vid.a(), observable));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void b(String str, StackTraceElement[] stackTraceElementArr, Observable<T> observable, ObservableEmitter<T> observableEmitter) {
        vie a2 = vie.a(str, stackTraceElementArr);
        observableEmitter.getClass();
        Observable b = observable.b((Action) new $$Lambda$sNQSr1eiggzdwNpCe9otJ7jJYdY(observableEmitter));
        observableEmitter.getClass();
        $$Lambda$usK6AHKcaXdYxpLr9JspyYsRKE r0 = new $$Lambda$usK6AHKcaXdYxpLr9JspyYsRKE(observableEmitter);
        observableEmitter.getClass();
        Disposable a3 = b.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$JfswciaWzDuzBZkMcrFNRhTOaFI<Object>(observableEmitter));
        vig vig = new vig(observableEmitter, a2);
        b(str, vig);
        observableEmitter.a((Cancellable) new $$Lambda$vif$FA5HsyS0OSN8_IjUrZMNSvYQ0A(this, a3, str, vig));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable, String str, vig vig) {
        disposable.bf_();
        a(str, vig);
    }

    private synchronized void a(String str, vig<?> vig) {
        this.a.remove(vig);
        Logger.b("Removed %s#%d subscription. Current count: %d", str, Integer.valueOf(hashCode()), Integer.valueOf(this.a.size()));
    }

    private synchronized void b(String str, vig<?> vig) {
        this.a.add(vig);
        Logger.b("Added %s#%d subscription. Current count: %d", str, Integer.valueOf(hashCode()), Integer.valueOf(this.a.size()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x001b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<defpackage.vie> a() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Set<vig<?>> r0 = r4.a     // Catch:{ all -> 0x0046 }
            java.util.ArrayList r0 = com.google.common.collect.Lists.a(r0)     // Catch:{ all -> 0x0046 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)
            return r0
        L_0x0013:
            java.util.ArrayList r1 = com.google.common.collect.Lists.a()     // Catch:{ all -> 0x0046 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0046 }
        L_0x001b:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0046 }
            vig r2 = (defpackage.vig) r2     // Catch:{ all -> 0x0046 }
            io.reactivex.ObservableEmitter<T> r3 = r2.a     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x003b
            io.reactivex.ObservableEmitter<T> r3 = r2.a     // Catch:{ all -> 0x0046 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0034
            goto L_0x003b
        L_0x0034:
            io.reactivex.ObservableEmitter<T> r3 = r2.a     // Catch:{ all -> 0x0046 }
            r3.c()     // Catch:{ all -> 0x0046 }
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x001b
            vie r2 = r2.b     // Catch:{ all -> 0x0046 }
            r1.add(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x001b
        L_0x0044:
            monitor-exit(r4)
            return r1
        L_0x0046:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x004a
        L_0x0049:
            throw r0
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vif.a():java.util.List");
    }
}
