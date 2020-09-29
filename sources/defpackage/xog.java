package defpackage;

import java.util.ArrayList;
import java.util.List;
import rx.internal.operators.NotificationLite;
import rx.subjects.SubjectSubscriptionManager;
import rx.subjects.SubjectSubscriptionManager.a;
import rx.subjects.SubjectSubscriptionManager.b;

/* renamed from: xog reason: default package */
public final class xog<T> extends xoi<T, T> {
    public final SubjectSubscriptionManager<T> a;

    private xog(a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.a = subjectSubscriptionManager;
    }

    public static <T> xog<T> a(T t, boolean z) {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.latest = NotificationLite.a(t);
        }
        subjectSubscriptionManager.onAdded = new xis<b<T>>() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
                if (r0 == null) goto L_0x001f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
                r3.a(null, r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void call(java.lang.Object r3) {
                /*
                    r2 = this;
                    rx.subjects.SubjectSubscriptionManager$b r3 = (rx.subjects.SubjectSubscriptionManager.b) r3
                    rx.subjects.SubjectSubscriptionManager r0 = r0
                    java.lang.Object r0 = r0.latest
                    monitor-enter(r3)
                    boolean r1 = r3.a     // Catch:{ all -> 0x0022 }
                    if (r1 == 0) goto L_0x0020
                    boolean r1 = r3.b     // Catch:{ all -> 0x0022 }
                    if (r1 == 0) goto L_0x0010
                    goto L_0x0020
                L_0x0010:
                    r1 = 0
                    r3.a = r1     // Catch:{ all -> 0x0022 }
                    if (r0 == 0) goto L_0x0016
                    r1 = 1
                L_0x0016:
                    r3.b = r1     // Catch:{ all -> 0x0022 }
                    monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                    if (r0 == 0) goto L_0x001f
                    r1 = 0
                    r3.a(r1, r0)
                L_0x001f:
                    return
                L_0x0020:
                    monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                    return
                L_0x0022:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xog.AnonymousClass1.call(java.lang.Object):void");
            }
        };
        subjectSubscriptionManager.onTerminated = subjectSubscriptionManager.onAdded;
        return new xog<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    public static <T> xog<T> e() {
        return a(null, false);
    }

    public final void onCompleted() {
        if (this.a.latest == null || this.a.active) {
            Object a2 = NotificationLite.a();
            for (b a3 : this.a.a(a2)) {
                a3.a(a2);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.a.latest == null || this.a.active) {
            Object a2 = NotificationLite.a(th);
            ArrayList arrayList = null;
            for (b a3 : this.a.a(a2)) {
                try {
                    a3.a(a2);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            xiq.a((List<? extends Throwable>) arrayList);
        }
    }

    public final void onNext(T t) {
        if (this.a.latest == null || this.a.active) {
            Object a2 = NotificationLite.a(t);
            SubjectSubscriptionManager<T> subjectSubscriptionManager = this.a;
            subjectSubscriptionManager.latest = a2;
            for (b a3 : ((a) subjectSubscriptionManager.get()).b) {
                a3.a(a2);
            }
        }
    }
}
