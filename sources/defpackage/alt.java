package defpackage;

import android.content.Intent;
import java.util.UUID;

/* renamed from: alt reason: default package */
public final class alt {
    private static alt d;
    public UUID a;
    public Intent b;
    int c;

    public alt(int i) {
        this(i, UUID.randomUUID());
    }

    private alt(int i, UUID uuid) {
        this.a = uuid;
        this.c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.alt a(java.util.UUID r4, int r5) {
        /*
            java.lang.Class<alt> r0 = defpackage.alt.class
            monitor-enter(r0)
            alt r1 = d     // Catch:{ all -> 0x001c }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alt.a(java.util.UUID, int):alt");
    }

    static synchronized boolean a(alt alt) {
        boolean z;
        synchronized (alt.class) {
            alt alt2 = d;
            d = alt;
            if (alt2 != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
