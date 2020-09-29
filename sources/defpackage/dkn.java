package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dkn reason: default package */
final class dkn implements dyb {
    private final Map<String, List<dwe<?>>> a = new HashMap();
    private final dim b;

    dkn(dim dim) {
        this.b = dim;
    }

    public final void a(dwe<?> dwe, ecb<?> ecb) {
        List<dwe> list;
        if (ecb.b == null || ecb.b.a()) {
            a(dwe);
            return;
        }
        String str = dwe.b;
        synchronized (this) {
            list = (List) this.a.remove(str);
        }
        if (list != null) {
            if (cgp.a) {
                cgp.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
            }
            for (dwe a2 : list) {
                this.b.e.a(a2, ecb);
            }
        }
    }

    public final synchronized void a(dwe<?> dwe) {
        String str = dwe.b;
        List list = (List) this.a.remove(str);
        if (list != null && !list.isEmpty()) {
            if (cgp.a) {
                cgp.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
            }
            dwe dwe2 = (dwe) list.remove(0);
            this.a.put(str, list);
            dwe2.a((dyb) this);
            try {
                this.b.c.put(dwe2);
            } catch (InterruptedException e) {
                cgp.c("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(defpackage.dwe<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.b     // Catch:{ all -> 0x0050 }
            java.util.Map<java.lang.String, java.util.List<dwe<?>>> r1 = r5.a     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0050 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            java.util.Map<java.lang.String, java.util.List<dwe<?>>> r1 = r5.a     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0050 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x001c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
        L_0x001c:
            java.lang.String r4 = "waiting-for-response"
            r6.b(r4)     // Catch:{ all -> 0x0050 }
            r1.add(r6)     // Catch:{ all -> 0x0050 }
            java.util.Map<java.lang.String, java.util.List<dwe<?>>> r6 = r5.a     // Catch:{ all -> 0x0050 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0050 }
            boolean r6 = defpackage.cgp.a     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x0036
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r1[r3] = r0     // Catch:{ all -> 0x0050 }
            defpackage.cgp.b(r6, r1)     // Catch:{ all -> 0x0050 }
        L_0x0036:
            monitor-exit(r5)
            return r2
        L_0x0038:
            java.util.Map<java.lang.String, java.util.List<dwe<?>>> r1 = r5.a     // Catch:{ all -> 0x0050 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0050 }
            r6.a(r5)     // Catch:{ all -> 0x0050 }
            boolean r6 = defpackage.cgp.a     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r1[r3] = r0     // Catch:{ all -> 0x0050 }
            defpackage.cgp.b(r6, r1)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r5)
            return r3
        L_0x0050:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkn.b(dwe):boolean");
    }
}
