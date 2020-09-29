package defpackage;

/* renamed from: wxb reason: default package */
public final class wxb implements wuf {
    private static wuf g = new wuf() {
        public final void a(long j) {
        }
    };
    private long a;
    private wuf b;
    private boolean c;
    private long d;
    private long e;
    private wuf f;

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r5.a + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r2 >= 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r2 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r5.a = r2;
        r0 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r0 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r0.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003a, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r6) {
        /*
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0041
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            monitor-enter(r5)
            boolean r2 = r5.c     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0017
            long r0 = r5.d     // Catch:{ all -> 0x003e }
            long r0 = r0 + r6
            r5.d = r0     // Catch:{ all -> 0x003e }
            monitor-exit(r5)     // Catch:{ all -> 0x003e }
            return
        L_0x0017:
            r2 = 1
            r5.c = r2     // Catch:{ all -> 0x003e }
            monitor-exit(r5)     // Catch:{ all -> 0x003e }
            long r2 = r5.a     // Catch:{ all -> 0x0034 }
            long r2 = r2 + r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0027
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0027:
            r5.a = r2     // Catch:{ all -> 0x0034 }
            wuf r0 = r5.b     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0030
            r0.a(r6)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            r5.a()     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r6 = move-exception
            monitor-enter(r5)
            r7 = 0
            r5.c = r7     // Catch:{ all -> 0x003b }
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r6
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r6
        L_0x003e:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003e }
            throw r6
        L_0x0041:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "n >= 0 required"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxb.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r2 == Long.MAX_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r2 = r2 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r2 < 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r7.a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        throw new java.lang.IllegalStateException("more items arrived than were requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r8) {
        /*
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0042
            monitor-enter(r7)
            boolean r2 = r7.c     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0012
            long r0 = r7.e     // Catch:{ all -> 0x003f }
            long r0 = r0 + r8
            r7.e = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r7)     // Catch:{ all -> 0x003f }
            return
        L_0x0012:
            r2 = 1
            r7.c = r2     // Catch:{ all -> 0x003f }
            monitor-exit(r7)     // Catch:{ all -> 0x003f }
            long r2 = r7.a     // Catch:{ all -> 0x0035 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0031
            long r2 = r2 - r8
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x0029
            r7.a = r2     // Catch:{ all -> 0x0035 }
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r9 = "more items arrived than were requested"
            r8.<init>(r9)     // Catch:{ all -> 0x0035 }
            throw r8     // Catch:{ all -> 0x0035 }
        L_0x0031:
            r7.a()     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r8 = move-exception
            monitor-enter(r7)
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x003c }
            monitor-exit(r7)     // Catch:{ all -> 0x003c }
            throw r8
        L_0x003c:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x003c }
            throw r8
        L_0x003f:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x003f }
            throw r8
        L_0x0042:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "n > 0 required"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxb.b(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.b = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        if (r3 == null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
        r3.a(r2.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wuf r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.c     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x000d
            if (r3 != 0) goto L_0x0009
            wuf r3 = g     // Catch:{ all -> 0x0028 }
        L_0x0009:
            r2.f = r3     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            return
        L_0x000d:
            r0 = 1
            r2.c = r0     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            r2.b = r3     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001a
            long r0 = r2.a     // Catch:{ all -> 0x001e }
            r3.a(r0)     // Catch:{ all -> 0x001e }
        L_0x001a:
            r2.a()     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-enter(r2)
            r0 = 0
            r2.c = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxb.a(wuf):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r8 = r13.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r8 == Long.MAX_VALUE) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r8 < 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r8 != Long.MAX_VALUE) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r8 = r8 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r8 < 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r13.a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        throw new java.lang.IllegalStateException("more produced than requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r13.a = Long.MAX_VALUE;
        r8 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r4 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r4 != g) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r13.b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r13.b = r4;
        r4.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        r2 = r13.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        if (r0 == 0) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r2.a(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r13 = this;
        L_0x0000:
            monitor-enter(r13)
            long r0 = r13.d     // Catch:{ all -> 0x0063 }
            long r2 = r13.e     // Catch:{ all -> 0x0063 }
            wuf r4 = r13.f     // Catch:{ all -> 0x0063 }
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0018
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0018
            if (r4 != 0) goto L_0x0018
            r0 = 0
            r13.c = r0     // Catch:{ all -> 0x0063 }
            monitor-exit(r13)     // Catch:{ all -> 0x0063 }
            return
        L_0x0018:
            r13.d = r5     // Catch:{ all -> 0x0063 }
            r13.e = r5     // Catch:{ all -> 0x0063 }
            r7 = 0
            r13.f = r7     // Catch:{ all -> 0x0063 }
            monitor-exit(r13)     // Catch:{ all -> 0x0063 }
            long r8 = r13.a
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0048
            long r8 = r8 + r0
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 < 0) goto L_0x0045
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            long r8 = r8 - r2
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x003d
            r13.a = r8
            goto L_0x0048
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "more produced than requested"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            r13.a = r10
            r8 = r10
        L_0x0048:
            if (r4 == 0) goto L_0x0057
            wuf r0 = g
            if (r4 != r0) goto L_0x0051
            r13.b = r7
            goto L_0x0000
        L_0x0051:
            r13.b = r4
            r4.a(r8)
            goto L_0x0000
        L_0x0057:
            wuf r2 = r13.b
            if (r2 == 0) goto L_0x0000
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0000
            r2.a(r0)
            goto L_0x0000
        L_0x0063:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0066:
            throw r0
        L_0x0067:
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxb.a():void");
    }
}
