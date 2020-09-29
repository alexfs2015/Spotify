package defpackage;

import android.content.Intent;
import java.util.UUID;

/* renamed from: amh reason: default package */
public final class amh {
    private static amh d;
    public UUID a;
    public Intent b;
    int c;

    public amh(int i) {
        this(i, UUID.randomUUID());
    }

    private amh(int i, UUID uuid) {
        this.a = uuid;
        this.c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.amh a(java.util.UUID r4, int r5) {
        /*
            java.lang.Class<amh> r0 = defpackage.amh.class
            monitor-enter(r0)
            amh r1 = d     // Catch:{ all -> 0x001c }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.util.UUID r3 = r1.a     // Catch:{ all -> 0x001c }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x001c }
            if (r4 == 0) goto L_0x001a
            int r4 = r1.c     // Catch:{ all -> 0x001c }
            if (r4 == r5) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            a(r2)     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001a:
            monitor-exit(r0)
            return r2
        L_0x001c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amh.a(java.util.UUID, int):amh");
    }

    static synchronized boolean a(amh amh) {
        boolean z;
        synchronized (amh.class) {
            amh amh2 = d;
            d = amh;
            z = amh2 != null;
        }
        return z;
    }
}
