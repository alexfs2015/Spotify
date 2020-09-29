package defpackage;

/* renamed from: hka reason: default package */
public final class hka {
    private final jtz a;
    private int b = 1;
    private final Object c = new Object();

    public hka(jtz jtz) {
        this.a = jtz;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
        L_0x0003:
            int r1 = r2.b     // Catch:{ InterruptedException -> 0x000f }
            if (r1 == r3) goto L_0x000f
            java.lang.Object r1 = r2.c     // Catch:{ InterruptedException -> 0x000f }
            r1.wait()     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x0003
        L_0x000d:
            r3 = move-exception
            goto L_0x0018
        L_0x000f:
            int r1 = r2.b     // Catch:{ all -> 0x000d }
            if (r1 != r3) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            goto L_0x001b
        L_0x001a:
            throw r3
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hka.b(int):boolean");
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.b;
        }
        return i;
    }

    public final void a(int i) {
        synchronized (this.c) {
            this.b = i;
            this.c.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r8, long r9) {
        /*
            r7 = this;
            r8 = 0
            r0 = 0
            r2 = 1
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            java.lang.String r4 = "Seriously, no negative timeouts, ok?"
            com.spotify.mobile.android.util.Assertion.a(r4, r3)
            java.lang.Object r3 = r7.c
            monitor-enter(r3)
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            boolean r8 = r7.b(r2)     // Catch:{ all -> 0x0055 }
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            return r8
        L_0x001d:
            jtz r4 = r7.a     // Catch:{ all -> 0x0055 }
            long r4 = r4.c()     // Catch:{ all -> 0x0055 }
            long r4 = r4 + r9
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x002e
            boolean r8 = r7.b(r2)     // Catch:{ all -> 0x0055 }
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            return r8
        L_0x002e:
            int r9 = r7.b     // Catch:{ all -> 0x0055 }
            if (r9 == r2) goto L_0x004e
            jtz r9 = r7.a     // Catch:{ all -> 0x0055 }
            long r9 = r9.c()     // Catch:{ all -> 0x0055 }
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x004e
            jtz r9 = r7.a     // Catch:{ InterruptedException -> 0x002e }
            long r9 = r9.c()     // Catch:{ InterruptedException -> 0x002e }
            long r9 = r4 - r9
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x002e
            java.lang.Object r6 = r7.c     // Catch:{ InterruptedException -> 0x002e }
            r6.wait(r9)     // Catch:{ InterruptedException -> 0x002e }
            goto L_0x002e
        L_0x004e:
            int r9 = r7.b     // Catch:{ all -> 0x0055 }
            if (r9 != r2) goto L_0x0053
            r8 = 1
        L_0x0053:
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            return r8
        L_0x0055:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0058:
            throw r8
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hka.a(int, long):boolean");
    }

    public final String toString() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "INVALID" : "STARTED" : "STARTING" : "STOPPED" : "STOPPING";
    }
}
