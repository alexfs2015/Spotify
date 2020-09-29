package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@cey
/* renamed from: ecj reason: default package */
public final class ecj implements ebx {
    final long a;
    final long b;
    final Object c = new Object();
    boolean d = false;
    final Map<cpr<ecg>, ecd> e = new HashMap();
    private final cfu f;
    private final ecp g;
    private final Context h;
    private final ebz i;
    private final boolean j;
    private final int k;
    private final boolean l;
    private final String m;
    private List<ecg> n = new ArrayList();
    private final boolean o;

    public ecj(Context context, cfu cfu, ecp ecp, ebz ebz, boolean z, boolean z2, String str, long j2, long j3, boolean z3) {
        this.h = context;
        this.f = cfu;
        this.g = ecp;
        this.i = ebz;
        this.j = z;
        this.l = z2;
        this.m = str;
        this.a = j2;
        this.b = j3;
        this.k = 2;
        this.o = z3;
    }

    private final void a(cpr<ecg> cpr) {
        cmd.a.post(new ecl(this, cpr));
    }

    public final void a() {
        synchronized (this.c) {
            this.d = true;
            for (ecd a2 : this.e.values()) {
                a2.a();
            }
        }
    }

    public final List<ecg> b() {
        return this.n;
    }

    public final ecg a(List<eby> list) {
        cow.a(3);
        ArrayList arrayList = new ArrayList();
        dpc dpc = this.f.d;
        int[] iArr = new int[2];
        if (dpc.g != null) {
            bjl.x();
            if (eci.a(this.m, iArr)) {
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                dpc[] dpcArr = dpc.g;
                int length = dpcArr.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    dpc dpc2 = dpcArr[i2];
                    if (i3 == dpc2.e && i4 == dpc2.b) {
                        dpc = dpc2;
                        break;
                    }
                    i2++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eby eby = (eby) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(eby.b);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(4);
            Iterator it2 = eby.c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = this.h;
                ecp ecp = this.g;
                ebz ebz = this.i;
                doy doy = this.f.c;
                coy coy = this.f.k;
                boolean z = this.j;
                boolean z2 = this.l;
                dup dup = this.f.y;
                Iterator it3 = it;
                List<String> list2 = this.f.n;
                Iterator it4 = it2;
                List<String> list3 = this.f.z;
                dup dup2 = dup;
                ArrayList arrayList2 = arrayList;
                dup dup3 = dup2;
                boolean z3 = z2;
                eby eby2 = eby;
                boolean z4 = z;
                dpc dpc3 = dpc;
                coy coy2 = coy;
                List<String> list4 = list2;
                List<String> list5 = list3;
                ecd ecd = new ecd(context, str2, ecp, ebz, eby2, doy, dpc3, coy2, z4, z3, dup3, list4, list5, this.f.X, this.o);
                cpr a2 = cmb.a((Callable<T>) new eck<T>(this, ecd));
                this.e.put(a2, ecd);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a2);
                arrayList = arrayList3;
                it2 = it4;
                it = it3;
            }
        }
        return b(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r13.i.n == -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r13.i.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r14 = r14.iterator();
        r3 = null;
        r1 = r0;
        r0 = null;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r14.hasNext() == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = (defpackage.cpr) r14.next();
        r6 = defpackage.bjl.l().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.isDone() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r10 = (defpackage.ecg) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r10 = r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r13.n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r10 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r10.a != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        r11 = r10.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (r11 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r11.a() <= r4) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r4 = r11.a();
        r3 = r5;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        r1 = java.lang.Math.max(r1 - (defpackage.bjl.l().a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        defpackage.cow.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0088, code lost:
        r1 = java.lang.Math.max(r1 - (defpackage.bjl.l().a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        java.lang.Math.max(r1 - (defpackage.bjl.l().a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r0 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        return new defpackage.ecg(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ecg b(java.util.List<defpackage.cpr<defpackage.ecg>> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.c
            monitor-enter(r0)
            boolean r1 = r13.d     // Catch:{ all -> 0x00b2 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            ecg r14 = new ecg     // Catch:{ all -> 0x00b2 }
            r14.<init>(r2)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            return r14
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            ebz r0 = r13.i
            long r0 = r0.n
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            ebz r0 = r13.i
            long r0 = r0.n
            goto L_0x0021
        L_0x001f:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0021:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
            r1 = r0
            r0 = r3
            r4 = -1
        L_0x0029:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x00a5
            java.lang.Object r5 = r14.next()
            cpr r5 = (defpackage.cpr) r5
            bzg r6 = defpackage.bjl.l()
            long r6 = r6.a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0050
            boolean r10 = r5.isDone()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            if (r10 == 0) goto L_0x0050
            java.lang.Object r10 = r5.get()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
        L_0x004d:
            ecg r10 = (defpackage.ecg) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            goto L_0x0057
        L_0x0050:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            goto L_0x004d
        L_0x0057:
            java.util.List<ecg> r11 = r13.n     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            r11.add(r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            if (r10 == 0) goto L_0x0073
            int r11 = r10.a     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            if (r11 != 0) goto L_0x0073
            ecy r11 = r10.f     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            if (r11 == 0) goto L_0x0073
            int r12 = r11.a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            if (r12 <= r4) goto L_0x0073
            int r0 = r11.a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0084 }
            r4 = r0
            r3 = r5
            r0 = r10
        L_0x0073:
            bzg r5 = defpackage.bjl.l()
            long r10 = r5.a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x0082:
            r14 = move-exception
            goto L_0x0097
        L_0x0084:
            r5 = 5
            defpackage.cow.a(r5)     // Catch:{ all -> 0x0082 }
            bzg r5 = defpackage.bjl.l()
            long r10 = r5.a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x0097:
            bzg r0 = defpackage.bjl.l()
            long r3 = r0.a()
            long r3 = r3 - r6
            long r1 = r1 - r3
            java.lang.Math.max(r1, r8)
            throw r14
        L_0x00a5:
            r13.a(r3)
            if (r0 != 0) goto L_0x00b1
            ecg r14 = new ecg
            r0 = 1
            r14.<init>(r0)
            return r14
        L_0x00b1:
            return r0
        L_0x00b2:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b6
        L_0x00b5:
            throw r14
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecj.b(java.util.List):ecg");
    }
}
