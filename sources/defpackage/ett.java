package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ett reason: default package */
public final class ett extends evi {
    protected euc a;
    public final AtomicReference<String> b = new AtomicReference<>();
    private final Set<etr> c = new CopyOnWriteArraySet();
    private boolean d;
    private boolean e = true;

    protected ett(esp esp) {
        super(esp);
    }

    static /* synthetic */ void a(ett ett) {
        if (!ett.s().e(ett.f().v()) || !ett.r.o() || !ett.e) {
            ett.q().j.a("Updating Scion state (FE)");
            ett.g().w();
            return;
        }
        ett.q().j.a("Recording app launch after enabling measurement for the first time (FE)");
        ett.v();
    }

    static /* synthetic */ void a(ett ett, ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        ett.c();
        ett.D();
        bxo.a(conditionalUserProperty);
        bxo.a(conditionalUserProperty2.mName);
        bxo.a(conditionalUserProperty2.mOrigin);
        bxo.a(conditionalUserProperty2.mValue);
        if (!ett.r.o()) {
            ett.q().j.a("Conditional property not sent since collection is disabled");
            return;
        }
        ewa ewa = new ewa(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            erb a2 = ett.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0);
            erb a3 = ett.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0);
            erb a4 = ett.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0);
            ewl ewl = r2;
            ewl ewl2 = new ewl(conditionalUserProperty2.mAppId, conditionalUserProperty2.mOrigin, ewa, conditionalUserProperty2.mCreationTimestamp, false, conditionalUserProperty2.mTriggerEventName, a3, conditionalUserProperty2.mTriggerTimeout, a2, conditionalUserProperty2.mTimeToLive, a4);
            ett.g().a(ewl);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r1 = r27
            r8 = r28
            r6 = r29
            r2 = r32
            r7 = r36
            defpackage.bxo.a(r28)
            defpackage.bxo.a(r29)
            defpackage.bxo.a(r32)
            r27.c()
            r27.D()
            esp r0 = r1.r
            boolean r0 = r0.o()
            if (r0 != 0) goto L_0x002d
            ern r0 = r27.q()
            erp r0 = r0.j
            java.lang.String r2 = "Event not sent since app measurement is disabled"
            r0.a(r2)
            return
        L_0x002d:
            boolean r0 = r1.d
            r3 = 0
            r16 = 0
            r5 = 1
            if (r0 != 0) goto L_0x006d
            r1.d = r5
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0062 }
            java.lang.String r4 = "initialize"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r16] = r10     // Catch:{ Exception -> 0x0055 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r9)     // Catch:{ Exception -> 0x0055 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0055 }
            android.content.Context r9 = r27.m()     // Catch:{ Exception -> 0x0055 }
            r4[r16] = r9     // Catch:{ Exception -> 0x0055 }
            r0.invoke(r3, r4)     // Catch:{ Exception -> 0x0055 }
            goto L_0x006d
        L_0x0055:
            r0 = move-exception
            ern r4 = r27.q()     // Catch:{ ClassNotFoundException -> 0x0062 }
            erp r4 = r4.f     // Catch:{ ClassNotFoundException -> 0x0062 }
            java.lang.String r9 = "Failed to invoke Tag Manager's initialize() method"
            r4.a(r9, r0)     // Catch:{ ClassNotFoundException -> 0x0062 }
            goto L_0x006d
        L_0x0062:
            ern r0 = r27.q()
            erp r0 = r0.i
            java.lang.String r4 = "Tag Manager is not found and thus will not be used"
            r0.a(r4)
        L_0x006d:
            java.lang.String r0 = "_ev"
            r4 = 40
            r9 = 2
            if (r35 == 0) goto L_0x00d1
            java.lang.String r10 = "_iap"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00d1
            esp r10 = r1.r
            ewd r10 = r10.e()
            java.lang.String r11 = "event"
            boolean r12 = r10.a(r11, r6)
            if (r12 != 0) goto L_0x008c
        L_0x008a:
            r10 = 2
            goto L_0x009f
        L_0x008c:
            java.lang.String[] r12 = defpackage.eto.a
            boolean r12 = r10.a(r11, r12, r6)
            if (r12 != 0) goto L_0x0097
            r10 = 13
            goto L_0x009f
        L_0x0097:
            boolean r10 = r10.a(r11, r4, r6)
            if (r10 != 0) goto L_0x009e
            goto L_0x008a
        L_0x009e:
            r10 = 0
        L_0x009f:
            if (r10 == 0) goto L_0x00d1
            ern r2 = r27.q()
            erp r2 = r2.e
            erl r3 = r27.n()
            java.lang.String r3 = r3.a(r6)
            java.lang.String r7 = "Invalid public event name. Event will not be logged (FE)"
            r2.a(r7, r3)
            esp r2 = r1.r
            r2.e()
            java.lang.String r2 = defpackage.ewd.a(r6, r4, r5)
            if (r6 == 0) goto L_0x00c6
            int r16 = r29.length()
            r3 = r16
            goto L_0x00c7
        L_0x00c6:
            r3 = 0
        L_0x00c7:
            esp r4 = r1.r
            ewd r4 = r4.e()
            r4.a(r10, r0, r2, r3)
            return
        L_0x00d1:
            eug r10 = r27.h()
            euf r15 = r10.v()
            java.lang.String r14 = "_sc"
            if (r15 == 0) goto L_0x00e5
            boolean r10 = r2.containsKey(r14)
            if (r10 != 0) goto L_0x00e5
            r15.d = r5
        L_0x00e5:
            if (r33 == 0) goto L_0x00eb
            if (r35 == 0) goto L_0x00eb
            r10 = 1
            goto L_0x00ec
        L_0x00eb:
            r10 = 0
        L_0x00ec:
            defpackage.eug.a(r15, r2, r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            defpackage.ewd.e(r29)
            esp r10 = r1.r
            boolean r10 = r10.t()
            if (r10 != 0) goto L_0x0101
            return
        L_0x0101:
            ewd r10 = r27.o()
            int r10 = r10.b(r6)
            if (r10 == 0) goto L_0x0139
            ern r2 = r27.q()
            erp r2 = r2.e
            erl r3 = r27.n()
            java.lang.String r3 = r3.a(r6)
            java.lang.String r7 = "Invalid event name. Event will not be logged (FE)"
            r2.a(r7, r3)
            r27.o()
            java.lang.String r2 = defpackage.ewd.a(r6, r4, r5)
            if (r6 == 0) goto L_0x012e
            int r16 = r29.length()
            r3 = r16
            goto L_0x012f
        L_0x012e:
            r3 = 0
        L_0x012f:
            esp r4 = r1.r
            ewd r4 = r4.e()
            r4.b(r10, r0, r2, r3)
            return
        L_0x0139:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r4 = "_o"
            r0[r16] = r4
            java.lang.String r13 = "_sn"
            r0[r5] = r13
            r0[r9] = r14
            r9 = 3
            java.lang.String r12 = "_si"
            r0[r9] = r12
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            ewd r9 = r27.o()
            r18 = 1
            r10 = r36
            r11 = r29
            r3 = r12
            r12 = r32
            r5 = r13
            r13 = r0
            r2 = r14
            r14 = r35
            r21 = r15
            r15 = r18
            android.os.Bundle r15 = r9.a(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0196
            boolean r9 = r15.containsKey(r2)
            if (r9 == 0) goto L_0x0196
            boolean r9 = r15.containsKey(r3)
            if (r9 != 0) goto L_0x017c
            goto L_0x0196
        L_0x017c:
            java.lang.String r5 = r15.getString(r5)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            euf r9 = new euf
            long r10 = r3.longValue()
            r9.<init>(r5, r2, r10)
            goto L_0x0197
        L_0x0196:
            r9 = 0
        L_0x0197:
            if (r9 != 0) goto L_0x019c
            r2 = r21
            goto L_0x019d
        L_0x019c:
            r2 = r9
        L_0x019d:
            ewn r3 = r27.s()
            boolean r3 = r3.l(r7)
            java.lang.String r5 = "_ae"
            r9 = 0
            if (r3 == 0) goto L_0x01ce
            eug r3 = r27.h()
            euf r3 = r3.v()
            if (r3 == 0) goto L_0x01ce
            boolean r3 = r5.equals(r6)
            if (r3 == 0) goto L_0x01ce
            evh r3 = r27.j()
            long r11 = r3.w()
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ce
            ewd r3 = r27.o()
            r3.a(r15, r11)
        L_0x01ce:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r15)
            ewd r11 = r27.o()
            java.security.SecureRandom r11 = r11.g()
            long r13 = r11.nextLong()
            ewn r11 = r27.s()
            erh r12 = r27.f()
            java.lang.String r12 = r12.v()
            boolean r11 = r11.k(r12)
            if (r11 == 0) goto L_0x0218
            java.lang.String r11 = "extend_session"
            long r9 = r15.getLong(r11, r9)
            r11 = 1
            int r18 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r18 != 0) goto L_0x0218
            ern r9 = r27.q()
            erp r9 = r9.k
            java.lang.String r10 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r9.a(r10)
            esp r9 = r1.r
            evh r9 = r9.c()
            r11 = r30
            r10 = 1
            r9.a(r11, r10)
            goto L_0x021a
        L_0x0218:
            r11 = r30
        L_0x021a:
            java.util.Set r9 = r15.keySet()
            int r10 = r32.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r9 = r9.toArray(r10)
            r10 = r9
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.util.Arrays.sort(r10)
            int r9 = r10.length
            r33 = r5
            r5 = 0
            r7 = 0
        L_0x0233:
            java.lang.String r1 = "_eid"
            if (r5 >= r9) goto L_0x02e1
            r18 = r4
            r4 = r10[r5]
            java.lang.Object r19 = r15.get(r4)
            r27.o()
            android.os.Bundle[] r8 = defpackage.ewd.a(r19)
            if (r8 == 0) goto L_0x02bf
            r19 = r9
            int r9 = r8.length
            r15.putInt(r4, r9)
            r32 = r10
            r9 = 0
        L_0x0251:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x02b1
            r10 = r8[r9]
            r21 = r15
            r15 = 1
            defpackage.eug.a(r2, r10, r15)
            ewd r20 = r27.o()
            r22 = 0
            java.lang.String r23 = "_ep"
            r24 = r9
            r9 = r20
            r20 = r32
            r25 = r10
            r10 = r36
            r11 = r23
            r12 = r25
            r23 = r2
            r25 = r3
            r2 = r13
            r13 = r0
            r14 = r35
            r26 = r0
            r0 = r21
            r21 = 1
            r15 = r22
            android.os.Bundle r9 = r9.a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r6)
            r9.putLong(r1, r2)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r4)
            int r10 = r8.length
            java.lang.String r11 = "_ll"
            r9.putInt(r11, r10)
            java.lang.String r10 = "_i"
            r11 = r24
            r9.putInt(r10, r11)
            r10 = r25
            r10.add(r9)
            int r9 = r11 + 1
            r11 = r30
            r15 = r0
            r13 = r2
            r3 = r10
            r2 = r23
            r0 = r26
            goto L_0x0251
        L_0x02b1:
            r20 = r32
            r26 = r0
            r23 = r2
            r10 = r3
            r2 = r13
            r0 = r15
            r21 = 1
            int r1 = r8.length
            int r7 = r7 + r1
            goto L_0x02cc
        L_0x02bf:
            r26 = r0
            r23 = r2
            r19 = r9
            r20 = r10
            r0 = r15
            r21 = 1
            r10 = r3
            r2 = r13
        L_0x02cc:
            int r5 = r5 + 1
            r8 = r28
            r11 = r30
            r15 = r0
            r13 = r2
            r3 = r10
            r4 = r18
            r9 = r19
            r10 = r20
            r2 = r23
            r0 = r26
            goto L_0x0233
        L_0x02e1:
            r10 = r3
            r18 = r4
            r2 = r13
            r0 = r15
            r21 = 1
            if (r7 == 0) goto L_0x02f2
            r0.putLong(r1, r2)
            java.lang.String r1 = "_epc"
            r0.putInt(r1, r7)
        L_0x02f2:
            r0 = 0
        L_0x02f3:
            int r1 = r10.size()
            if (r0 >= r1) goto L_0x0387
            java.lang.Object r1 = r10.get(r0)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r0 == 0) goto L_0x0303
            r2 = 1
            goto L_0x0304
        L_0x0303:
            r2 = 0
        L_0x0304:
            if (r2 == 0) goto L_0x030c
            java.lang.String r2 = "_ep"
            r8 = r28
            r3 = r2
            goto L_0x030f
        L_0x030c:
            r8 = r28
            r3 = r6
        L_0x030f:
            r4 = r18
            r1.putString(r4, r8)
            if (r34 == 0) goto L_0x031e
            ewd r2 = r27.o()
            android.os.Bundle r1 = r2.a(r1)
        L_0x031e:
            ern r2 = r27.q()
            erp r2 = r2.j
            erl r5 = r27.n()
            java.lang.String r5 = r5.a(r6)
            erl r7 = r27.n()
            java.lang.String r7 = r7.a(r1)
            java.lang.String r9 = "Logging event (FE)"
            r2.a(r9, r5, r7)
            erb r9 = new erb
            eqy r5 = new eqy
            r5.<init>(r1)
            r2 = r9
            r11 = r4
            r4 = r5
            r12 = r33
            r13 = 1
            r5 = r28
            r15 = r36
            r14 = r6
            r6 = r30
            r2.<init>(r3, r4, r5, r6)
            euj r2 = r27.g()
            r2.a(r9, r15)
            r9 = r27
            if (r17 != 0) goto L_0x037c
            java.util.Set<etr> r2 = r9.c
            java.util.Iterator r18 = r2.iterator()
        L_0x0361:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x037c
            java.lang.Object r2 = r18.next()
            etr r2 = (defpackage.etr) r2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r1)
            r3 = r28
            r4 = r29
            r6 = r30
            r2.onEvent(r3, r4, r5, r6)
            goto L_0x0361
        L_0x037c:
            int r0 = r0 + 1
            r18 = r11
            r33 = r12
            r6 = r14
            r21 = 1
            goto L_0x02f3
        L_0x0387:
            r13 = 1
            r9 = r27
            r12 = r33
            r14 = r6
            eug r0 = r27.h()
            euf r0 = r0.v()
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r12.equals(r14)
            if (r0 == 0) goto L_0x03a4
            evh r0 = r27.j()
            r0.a(r13, r13)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ett.a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    private final void a(String str, String str2, long j, Object obj) {
        esl p = p();
        etw etw = new etw(this, str, str2, obj, j);
        p.a((Runnable) etw);
    }

    private void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        b(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, true, true, false, null);
    }

    private void a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = o().c(str2);
        } else {
            ewd o = o();
            String str4 = "user property";
            if (o.a(str4, str2)) {
                if (!o.a(str4, etq.a, str2)) {
                    i = 15;
                } else if (o.a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            o();
            String a2 = ewd.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.r.e().a(i, str5, a2, i2);
        } else if (obj != null) {
            int b2 = o().b(str2, obj);
            if (b2 != 0) {
                o();
                String a3 = ewd.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.r.e().a(b2, str5, a3, i2);
                return;
            }
            o();
            Object c2 = ewd.c(str2, obj);
            if (c2 != null) {
                a(str3, str2, j, c2);
            }
        } else {
            a(str3, str2, j, (Object) null);
        }
    }

    static /* synthetic */ void b(ett ett, ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        ett.c();
        ett.D();
        bxo.a(conditionalUserProperty);
        bxo.a(conditionalUserProperty2.mName);
        if (!ett.r.o()) {
            ett.q().j.a("Conditional property not cleared since collection is disabled");
            return;
        }
        ewa ewa = new ewa(conditionalUserProperty2.mName, 0, null, null);
        try {
            erb a2 = ett.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            boolean z = conditionalUserProperty2.mActive;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            long j3 = conditionalUserProperty2.mTimeToLive;
            ewl ewl = r2;
            ewl ewl2 = new ewl(str, str2, ewa, j, z, str3, null, j2, null, j3, a2);
            ett.g().a(ewl);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b2 = ewd.b(bundle);
        esl p = p();
        etv etv = new etv(this, str, str2, j, b2, z, z2, z3, null);
        p.a((Runnable) etv);
    }

    public final List<ConditionalUserProperty> a(String str, String str2, String str3) {
        if (p().f()) {
            q().c.a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (ewk.a()) {
            q().c.a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                esl p = this.r.p();
                etz etz = new etz(this, atomicReference, str, str2, str3);
                p.a((Runnable) etz);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    q().f.a("Interrupted waiting for get conditional user properties", str, e2);
                }
            }
            List<ewl> list = (List) atomicReference.get();
            if (list == null) {
                q().f.a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (ewl ewl : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = ewl.a;
                conditionalUserProperty.mOrigin = ewl.b;
                conditionalUserProperty.mCreationTimestamp = ewl.d;
                conditionalUserProperty.mName = ewl.c.a;
                conditionalUserProperty.mValue = ewl.c.a();
                conditionalUserProperty.mActive = ewl.e;
                conditionalUserProperty.mTriggerEventName = ewl.f;
                if (ewl.g != null) {
                    conditionalUserProperty.mTimedOutEventName = ewl.g.a;
                    if (ewl.g.b != null) {
                        conditionalUserProperty.mTimedOutEventParams = ewl.g.b.a();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = ewl.h;
                if (ewl.i != null) {
                    conditionalUserProperty.mTriggeredEventName = ewl.i.a;
                    if (ewl.i.b != null) {
                        conditionalUserProperty.mTriggeredEventParams = ewl.i.b.a();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = ewl.c.b;
                conditionalUserProperty.mTimeToLive = ewl.j;
                if (ewl.k != null) {
                    conditionalUserProperty.mExpiredEventName = ewl.k.a;
                    if (ewl.k.b != null) {
                        conditionalUserProperty.mExpiredEventParams = ewl.k.b.a();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        if (p().f()) {
            q().c.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (ewk.a()) {
            q().c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                esl p = this.r.p();
                eua eua = new eua(this, atomicReference, str, str2, str3, z);
                p.a((Runnable) eua);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    q().f.a("Interrupted waiting for get user properties", e2);
                }
            }
            List<ewa> list = (List) atomicReference.get();
            if (list == null) {
                q().f.a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            dp dpVar = new dp(list.size());
            for (ewa ewa : list) {
                dpVar.put(ewa.a, ewa.a());
            }
            return dpVar;
        }
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(ConditionalUserProperty conditionalUserProperty) {
        long a2 = l().a();
        bxo.a(conditionalUserProperty);
        bxo.a(conditionalUserProperty.mName);
        bxo.a(conditionalUserProperty.mOrigin);
        bxo.a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a2;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (o().c(str) != 0) {
            q().c.a("Invalid conditional user property name", n().c(str));
        } else if (o().b(str, obj) != 0) {
            q().c.a("Invalid conditional user property value", n().c(str), obj);
        } else {
            o();
            Object c2 = ewd.c(str, obj);
            if (c2 == null) {
                q().c.a("Unable to normalize conditional user property value", n().c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c2;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    q().c.a("Invalid conditional user property time to live", n().c(str), Long.valueOf(j2));
                    return;
                }
                p().a((Runnable) new etx(this, conditionalUserProperty));
                return;
            }
            q().c.a("Invalid conditional user property timeout", n().c(str), Long.valueOf(j));
        }
    }

    public final void a(etr etr) {
        D();
        bxo.a(etr);
        if (!this.c.add(etr)) {
            q().f.a("OnEventListener already registered");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.b.set(str);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2, long j, Bundle bundle) {
        c();
        a(str, str2, j, bundle, true, true, false, null);
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, l().a());
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2, Object obj, long j) {
        bxo.a(str);
        bxo.a(str2);
        c();
        D();
        if (!this.r.o()) {
            q().j.a("User property not set since app measurement is disabled");
        } else if (this.r.t()) {
            q().j.a("Setting user property (FE)", n().a(str2), obj);
            ewa ewa = new ewa(str2, j, obj, str);
            g().a(ewa);
        }
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(str, str2, obj, true, l().a());
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        long a2 = l().a();
        bxo.a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a2;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        p().a((Runnable) new ety(this, conditionalUserProperty));
    }

    public final void a(boolean z) {
        D();
        p().a((Runnable) new eub(this, z));
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqw d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ ett e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ erh f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ euj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ eug h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ erj i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ evh j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final void v() {
        c();
        D();
        if (this.r.t()) {
            g().x();
            this.e = false;
            String u = r().u();
            if (!TextUtils.isEmpty(u)) {
                k().w();
                if (!u.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", u);
                    a("auto", "_ou", bundle);
                }
            }
        }
    }

    public final String w() {
        euf euf = this.r.h().b;
        if (euf != null) {
            return euf.a;
        }
        return null;
    }

    public final String x() {
        euf euf = this.r.h().b;
        if (euf != null) {
            return euf.b;
        }
        return null;
    }

    public final String y() {
        if (this.r.a != null) {
            return this.r.a;
        }
        try {
            return btk.a();
        } catch (IllegalStateException e2) {
            this.r.q().c.a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }
}
