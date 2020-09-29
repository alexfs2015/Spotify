package defpackage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* renamed from: xlz reason: default package */
public final class xlz implements xip {
    public List<xip> a;
    public volatile boolean b;

    public xlz() {
    }

    public xlz(xip xip) {
        this.a = new LinkedList();
        this.a.add(xip);
    }

    public xlz(xip... xipArr) {
        this.a = new LinkedList(Arrays.asList(xipArr));
    }

    public final void a(xip xip) {
        if (!xip.isUnsubscribed()) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        List list = this.a;
                        if (list == null) {
                            list = new LinkedList();
                            this.a = list;
                        }
                        list.add(xip);
                        return;
                    }
                }
            }
            xip.unsubscribe();
        }
    }

    public final boolean isUnsubscribed() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        ((defpackage.xip) r0.next()).unsubscribe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        r1.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        defpackage.xiq.a((java.util.List<? extends java.lang.Throwable>) r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unsubscribe() {
        /*
            r3 = this;
            boolean r0 = r3.b
            if (r0 != 0) goto L_0x003d
            monitor-enter(r3)
            boolean r0 = r3.b     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            return
        L_0x000b:
            r0 = 1
            r3.b = r0     // Catch:{ all -> 0x003a }
            java.util.List<xip> r0 = r3.a     // Catch:{ all -> 0x003a }
            r1 = 0
            r3.a = r1     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x003d
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            xip r2 = (defpackage.xip) r2
            r2.unsubscribe()     // Catch:{ all -> 0x002a }
            goto L_0x001a
        L_0x002a:
            r2 = move-exception
            if (r1 != 0) goto L_0x0032
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0032:
            r1.add(r2)
            goto L_0x001a
        L_0x0036:
            defpackage.xiq.a(r1)
            goto L_0x003d
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlz.unsubscribe():void");
    }
}
