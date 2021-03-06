package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import java.util.List;

/* renamed from: ur reason: default package */
public final class ur implements Runnable {
    private static final String b = sg.a("EnqueueRunnable");
    public final sp a = new sp();
    private final st c;

    public ur(st stVar) {
        this.c = stVar;
    }

    public final void run() {
        try {
            if (!st.a(this.c, new HashSet())) {
                if (a()) {
                    ut.a(this.c.a.a, RescheduleReceiver.class, true);
                    sv svVar = this.c.a;
                    ss.a(svVar.b, svVar.c, svVar.e);
                }
                this.a.a(si.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.c}));
        } catch (Throwable th) {
            this.a.a(new C0076a(th));
        }
    }

    private boolean a() {
        WorkDatabase workDatabase = this.c.a.c;
        workDatabase.e();
        try {
            boolean a2 = a(this.c);
            workDatabase.g();
            return a2;
        } finally {
            workDatabase.f();
        }
    }

    private static boolean b(st stVar) {
        boolean a2 = a(stVar.a, stVar.d, (String[]) st.a(stVar).toArray(new String[0]), stVar.b, stVar.c);
        stVar.g = true;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01aa A[LOOP:6: B:109:0x01a4->B:111:0x01aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(defpackage.sv r19, java.util.List<? extends defpackage.sm> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.ExistingWorkPolicy r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r0.c
            r8 = 1
            if (r1 == 0) goto L_0x0016
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0016
            r9 = 1
            goto L_0x0017
        L_0x0016:
            r9 = 0
        L_0x0017:
            if (r9 == 0) goto L_0x005b
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x001e:
            if (r11 >= r10) goto L_0x005e
            r15 = r1[r11]
            uk r7 = r6.j()
            uj r7 = r7.b(r15)
            if (r7 != 0) goto L_0x0043
            sg r0 = defpackage.sg.a()
            java.lang.String r1 = b
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.a(r1, r2, r4)
            return r3
        L_0x0043:
            androidx.work.WorkInfo$State r7 = r7.b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r15) goto L_0x004b
            r15 = 1
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            r12 = r12 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r15) goto L_0x0053
            r13 = 1
            goto L_0x0058
        L_0x0053:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r15) goto L_0x0058
            r14 = 1
        L_0x0058:
            int r11 = r11 + 1
            goto L_0x001e
        L_0x005b:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x005e:
            boolean r7 = android.text.TextUtils.isEmpty(r22)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0069
            if (r9 != 0) goto L_0x0069
            r10 = 1
            goto L_0x006a
        L_0x0069:
            r10 = 0
        L_0x006a:
            if (r10 == 0) goto L_0x00cc
            uk r10 = r6.j()
            java.util.List r10 = r10.c(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00cc
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND
            if (r3 != r11) goto L_0x00ce
            ub r3 = r6.k()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            uj$a r11 = (defpackage.uj.a) r11
            java.lang.String r15 = r11.a
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L_0x00be
            androidx.work.WorkInfo$State r15 = r11.b
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r15 != r8) goto L_0x00a7
            r8 = 1
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            r8 = r8 & r12
            androidx.work.WorkInfo$State r12 = r11.b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r12 != r15) goto L_0x00b1
            r13 = 1
            goto L_0x00b8
        L_0x00b1:
            androidx.work.WorkInfo$State r12 = r11.b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r12 != r15) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            java.lang.String r11 = r11.a
            r9.add(r11)
            r12 = r8
        L_0x00be:
            r8 = 1
            goto L_0x008b
        L_0x00c0:
            java.lang.Object[] r1 = r9.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x00cb
            r9 = 1
            goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            r3 = 0
            goto L_0x0115
        L_0x00ce:
            androidx.work.ExistingWorkPolicy r8 = androidx.work.ExistingWorkPolicy.KEEP
            if (r3 != r8) goto L_0x00f0
            java.util.Iterator r3 = r10.iterator()
        L_0x00d6:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00f0
            java.lang.Object r8 = r3.next()
            uj$a r8 = (defpackage.uj.a) r8
            androidx.work.WorkInfo$State r11 = r8.b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r11 == r15) goto L_0x00ee
            androidx.work.WorkInfo$State r8 = r8.b
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.RUNNING
            if (r8 != r11) goto L_0x00d6
        L_0x00ee:
            r3 = 0
            return r3
        L_0x00f0:
            r3 = 0
            uq r8 = defpackage.uq.a(r2, r0, r3)
            r8.run()
            uk r8 = r6.j()
            java.util.Iterator r10 = r10.iterator()
        L_0x0100:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0112
            java.lang.Object r11 = r10.next()
            uj$a r11 = (defpackage.uj.a) r11
            java.lang.String r11 = r11.a
            r8.a(r11)
            goto L_0x0100
        L_0x0112:
            r16 = 1
            goto L_0x0117
        L_0x0115:
            r16 = 0
        L_0x0117:
            java.util.Iterator r8 = r20.iterator()
        L_0x011b:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01dc
            java.lang.Object r10 = r8.next()
            sm r10 = (defpackage.sm) r10
            uj r11 = r10.b
            if (r9 == 0) goto L_0x0140
            if (r12 != 0) goto L_0x0140
            if (r13 == 0) goto L_0x0134
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r11.b = r15
            goto L_0x0148
        L_0x0134:
            if (r14 == 0) goto L_0x013b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r11.b = r15
            goto L_0x0148
        L_0x013b:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r11.b = r15
            goto L_0x0148
        L_0x0140:
            boolean r15 = r11.a()
            if (r15 != 0) goto L_0x014b
            r11.n = r4
        L_0x0148:
            r17 = r4
            goto L_0x0151
        L_0x014b:
            r17 = r4
            r3 = 0
            r11.n = r3
        L_0x0151:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L_0x0161
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            if (r3 > r4) goto L_0x0161
            a(r11)
            goto L_0x0172
        L_0x0161:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 > r4) goto L_0x0172
            java.lang.String r3 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r3 = a(r0, r3)
            if (r3 == 0) goto L_0x0172
            a(r11)
        L_0x0172:
            androidx.work.WorkInfo$State r3 = r11.b
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo.State.ENQUEUED
            if (r3 != r4) goto L_0x017a
            r16 = 1
        L_0x017a:
            uk r3 = r6.j()
            r3.a(r11)
            if (r9 == 0) goto L_0x019e
            int r3 = r1.length
            r4 = 0
        L_0x0185:
            if (r4 >= r3) goto L_0x019e
            r5 = r1[r4]
            ua r11 = new ua
            java.util.UUID r15 = r10.a
            java.lang.String r15 = r15.toString()
            r11.<init>(r15, r5)
            ub r5 = r6.k()
            r5.a(r11)
            int r4 = r4 + 1
            goto L_0x0185
        L_0x019e:
            java.util.Set<java.lang.String> r3 = r10.c
            java.util.Iterator r3 = r3.iterator()
        L_0x01a4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01c3
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            un r5 = r6.l()
            um r11 = new um
            java.util.UUID r15 = r10.a
            java.lang.String r15 = r15.toString()
            r11.<init>(r4, r15)
            r5.a(r11)
            goto L_0x01a4
        L_0x01c3:
            if (r7 == 0) goto L_0x01d7
            uh r3 = r6.n()
            ug r4 = new ug
            java.util.UUID r5 = r10.a
            java.lang.String r5 = r5.toString()
            r4.<init>(r2, r5)
            r3.a(r4)
        L_0x01d7:
            r4 = r17
            r3 = 0
            goto L_0x011b
        L_0x01dc:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.a(sv, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static void a(uj ujVar) {
        sc scVar = ujVar.j;
        if (scVar.e || scVar.f) {
            String str = ujVar.c;
            a aVar = new a();
            aVar.a(ujVar.e).a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            ujVar.c = ConstraintTrackingWorker.class.getName();
            ujVar.e = aVar.a();
        }
    }

    private static boolean a(sv svVar, String str) {
        try {
            Class cls = Class.forName(str);
            for (sr srVar : svVar.e) {
                if (cls.isAssignableFrom(srVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    private static boolean a(st stVar) {
        List<st> list = stVar.f;
        boolean z = false;
        if (list != null) {
            boolean z2 = false;
            for (st stVar2 : list) {
                if (!stVar2.g) {
                    z2 |= a(stVar2);
                } else {
                    sg.a();
                    String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", stVar2.e)});
                }
            }
            z = z2;
        }
        return b(stVar) | z;
    }
}
