package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: xag reason: default package */
public final class xag implements wuk {
    private Set<wuk> a;
    private volatile boolean b;

    public xag() {
    }

    public xag(wuk... wukArr) {
        this.a = new HashSet(Arrays.asList(wukArr));
    }

    public final boolean isUnsubscribed() {
        return this.b;
    }

    public final void a(wuk wuk) {
        if (!wuk.isUnsubscribed()) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        if (this.a == null) {
                            this.a = new HashSet(4);
                        }
                        this.a.add(wuk);
                        return;
                    }
                }
            }
            wuk.unsubscribe();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2.unsubscribe();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.wuk r2) {
        /*
            r1 = this;
            boolean r0 = r1.b
            if (r0 != 0) goto L_0x0020
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            java.util.Set<wuk> r0 = r1.a     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            java.util.Set<wuk> r0 = r1.a     // Catch:{ all -> 0x001d }
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0020
            r2.unsubscribe()
            goto L_0x0020
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xag.b(wuk):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        a((java.util.Collection<defpackage.wuk>) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0018
            java.util.Set<wuk> r0 = r2.a     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            java.util.Set<wuk> r0 = r2.a     // Catch:{ all -> 0x001a }
            r1 = 0
            r2.a = r1     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            a(r0)
            goto L_0x001d
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xag.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        a((java.util.Collection<defpackage.wuk>) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unsubscribe() {
        /*
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L_0x001b
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            return
        L_0x000b:
            r0 = 1
            r2.b = r0     // Catch:{ all -> 0x0018 }
            java.util.Set<wuk> r0 = r2.a     // Catch:{ all -> 0x0018 }
            r1 = 0
            r2.a = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            a(r0)
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xag.unsubscribe():void");
    }

    private static void a(Collection<wuk> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (wuk unsubscribe : collection) {
                try {
                    unsubscribe.unsubscribe();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            wul.a((List<? extends Throwable>) arrayList);
        }
    }
}
