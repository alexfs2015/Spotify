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

/* renamed from: etc reason: default package */
public final class etc extends eur {
    protected etl a;
    public final AtomicReference<String> b = new AtomicReference<>();
    private final Set<eta> c = new CopyOnWriteArraySet();
    private boolean d;
    private boolean e = true;

    protected etc(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final void a(boolean z) {
        D();
        p().a((Runnable) new etk(this, z));
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, l().a());
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2, long j, Bundle bundle) {
        c();
        a(str, str2, j, bundle, true, true, false, null);
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
            defpackage.bwx.a(r28)
            defpackage.bwx.a(r29)
            defpackage.bwx.a(r32)
            r27.c()
            r27.D()
            ery r0 = r1.r
            boolean r0 = r0.o()
            if (r0 != 0) goto L_0x002d
            eqw r0 = r27.q()
            eqy r0 = r0.j
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
            eqw r4 = r27.q()     // Catch:{ ClassNotFoundException -> 0x0062 }
            eqy r4 = r4.f     // Catch:{ ClassNotFoundException -> 0x0062 }
            java.lang.String r9 = "Failed to invoke Tag Manager's initialize() method"
            r4.a(r9, r0)     // Catch:{ ClassNotFoundException -> 0x0062 }
            goto L_0x006d
        L_0x0062:
            eqw r0 = r27.q()
            eqy r0 = r0.i
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
            ery r10 = r1.r
            evm r10 = r10.e()
            java.lang.String r11 = "event"
            boolean r12 = r10.a(r11, r6)
            if (r12 != 0) goto L_0x008c
        L_0x008a:
            r10 = 2
            goto L_0x009f
        L_0x008c:
            java.lang.String[] r12 = defpackage.esx.a
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
            eqw r2 = r27.q()
            eqy r2 = r2.e
            equ r3 = r27.n()
            java.lang.String r3 = r3.a(r6)
            java.lang.String r7 = "Invalid public event name. Event will not be logged (FE)"
            r2.a(r7, r3)
            ery r2 = r1.r
            r2.e()
            java.lang.String r2 = defpackage.evm.a(r6, r4, r5)
            if (r6 == 0) goto L_0x00c6
            int r16 = r29.length()
            r3 = r16
            goto L_0x00c7
        L_0x00c6:
            r3 = 0
        L_0x00c7:
            ery r4 = r1.r
            evm r4 = r4.e()
            r4.a(r10, r0, r2, r3)
            return
        L_0x00d1:
            etp r10 = r27.h()
            eto r15 = r10.v()
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
            defpackage.etp.a(r15, r2, r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            defpackage.evm.e(r29)
            ery r10 = r1.r
            boolean r10 = r10.t()
            if (r10 != 0) goto L_0x0101
            return
        L_0x0101:
            evm r10 = r27.o()
            int r10 = r10.b(r6)
            if (r10 == 0) goto L_0x0139
            eqw r2 = r27.q()
            eqy r2 = r2.e
            equ r3 = r27.n()
            java.lang.String r3 = r3.a(r6)
            java.lang.String r7 = "Invalid event name. Event will not be logged (FE)"
            r2.a(r7, r3)
            r27.o()
            java.lang.String r2 = defpackage.evm.a(r6, r4, r5)
            if (r6 == 0) goto L_0x012e
            int r16 = r29.length()
            r3 = r16
            goto L_0x012f
        L_0x012e:
            r3 = 0
        L_0x012f:
            ery r4 = r1.r
            evm r4 = r4.e()
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
            evm r9 = r27.o()
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
            eto r9 = new eto
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
            evw r3 = r27.s()
            boolean r3 = r3.l(r7)
            java.lang.String r5 = "_ae"
            r9 = 0
            if (r3 == 0) goto L_0x01ce
            etp r3 = r27.h()
            eto r3 = r3.v()
            if (r3 == 0) goto L_0x01ce
            boolean r3 = r5.equals(r6)
            if (r3 == 0) goto L_0x01ce
            euq r3 = r27.j()
            long r11 = r3.w()
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ce
            evm r3 = r27.o()
            r3.a(r15, r11)
        L_0x01ce:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r15)
            evm r11 = r27.o()
            java.security.SecureRandom r11 = r11.g()
            long r13 = r11.nextLong()
            evw r11 = r27.s()
            eqq r12 = r27.f()
            java.lang.String r12 = r12.v()
            boolean r11 = r11.k(r12)
            if (r11 == 0) goto L_0x0218
            java.lang.String r11 = "extend_session"
            long r9 = r15.getLong(r11, r9)
            r11 = 1
            int r18 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r18 != 0) goto L_0x0218
            eqw r9 = r27.q()
            eqy r9 = r9.k
            java.lang.String r10 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r9.a(r10)
            ery r9 = r1.r
            euq r9 = r9.c()
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
            android.os.Bundle[] r8 = defpackage.evm.a(r19)
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
            defpackage.etp.a(r2, r10, r15)
            evm r20 = r27.o()
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
            evm r2 = r27.o()
            android.os.Bundle r1 = r2.a(r1)
        L_0x031e:
            eqw r2 = r27.q()
            eqy r2 = r2.j
            equ r5 = r27.n()
            java.lang.String r5 = r5.a(r6)
            equ r7 = r27.n()
            java.lang.String r7 = r7.a(r1)
            java.lang.String r9 = "Logging event (FE)"
            r2.a(r9, r5, r7)
            eqk r9 = new eqk
            eqh r5 = new eqh
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
            ets r2 = r27.g()
            r2.a(r9, r15)
            r9 = r27
            if (r17 != 0) goto L_0x037c
            java.util.Set<eta> r2 = r9.c
            java.util.Iterator r18 = r2.iterator()
        L_0x0361:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x037c
            java.lang.Object r2 = r18.next()
            eta r2 = (defpackage.eta) r2
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
            etp r0 = r27.h()
            eto r0 = r0.v()
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r12.equals(r14)
            if (r0 == 0) goto L_0x03a4
            euq r0 = r27.j()
            r0.a(r13, r13)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etc.a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    private void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        b(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, true, true, false, null);
    }

    private final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b2 = evm.b(bundle);
        eru p = p();
        ete ete = new ete(this, str, str2, j, b2, z, z2, z3, null);
        p.a((Runnable) ete);
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(str, str2, obj, true, l().a());
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
            evm o = o();
            String str4 = "user property";
            if (o.a(str4, str2)) {
                if (!o.a(str4, esz.a, str2)) {
                    i = 15;
                } else if (o.a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            o();
            String a2 = evm.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.r.e().a(i, str5, a2, i2);
        } else if (obj != null) {
            int b2 = o().b(str2, obj);
            if (b2 != 0) {
                o();
                String a3 = evm.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.r.e().a(b2, str5, a3, i2);
                return;
            }
            o();
            Object c2 = evm.c(str2, obj);
            if (c2 != null) {
                a(str3, str2, j, c2);
            }
        } else {
            a(str3, str2, j, (Object) null);
        }
    }

    private final void a(String str, String str2, long j, Object obj) {
        eru p = p();
        etf etf = new etf(this, str, str2, obj, j);
        p.a((Runnable) etf);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2, Object obj, long j) {
        bwx.a(str);
        bwx.a(str2);
        c();
        D();
        if (!this.r.o()) {
            q().j.a("User property not set since app measurement is disabled");
        } else if (this.r.t()) {
            q().j.a("Setting user property (FE)", n().a(str2), obj);
            evj evj = new evj(str2, j, obj, str);
            g().a(evj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.b.set(str);
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

    public final void a(eta eta) {
        D();
        bwx.a(eta);
        if (!this.c.add(eta)) {
            q().f.a("OnEventListener already registered");
        }
    }

    public final void a(ConditionalUserProperty conditionalUserProperty) {
        long a2 = l().a();
        bwx.a(conditionalUserProperty);
        bwx.a(conditionalUserProperty.mName);
        bwx.a(conditionalUserProperty.mOrigin);
        bwx.a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a2;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (o().c(str) != 0) {
            q().c.a("Invalid conditional user property name", n().c(str));
        } else if (o().b(str, obj) != 0) {
            q().c.a("Invalid conditional user property value", n().c(str), obj);
        } else {
            o();
            Object c2 = evm.c(str, obj);
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
                p().a((Runnable) new etg(this, conditionalUserProperty));
                return;
            }
            q().c.a("Invalid conditional user property timeout", n().c(str), Long.valueOf(j));
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        long a2 = l().a();
        bwx.a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a2;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        p().a((Runnable) new eth(this, conditionalUserProperty));
    }

    public final List<ConditionalUserProperty> a(String str, String str2, String str3) {
        if (p().f()) {
            q().c.a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (evt.a()) {
            q().c.a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                eru p = this.r.p();
                eti eti = new eti(this, atomicReference, str, str2, str3);
                p.a((Runnable) eti);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    q().f.a("Interrupted waiting for get conditional user properties", str, e2);
                }
            }
            List<evu> list = (List) atomicReference.get();
            if (list == null) {
                q().f.a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (evu evu : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = evu.a;
                conditionalUserProperty.mOrigin = evu.b;
                conditionalUserProperty.mCreationTimestamp = evu.d;
                conditionalUserProperty.mName = evu.c.a;
                conditionalUserProperty.mValue = evu.c.a();
                conditionalUserProperty.mActive = evu.e;
                conditionalUserProperty.mTriggerEventName = evu.f;
                if (evu.g != null) {
                    conditionalUserProperty.mTimedOutEventName = evu.g.a;
                    if (evu.g.b != null) {
                        conditionalUserProperty.mTimedOutEventParams = evu.g.b.a();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = evu.h;
                if (evu.i != null) {
                    conditionalUserProperty.mTriggeredEventName = evu.i.a;
                    if (evu.i.b != null) {
                        conditionalUserProperty.mTriggeredEventParams = evu.i.b.a();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = evu.c.b;
                conditionalUserProperty.mTimeToLive = evu.j;
                if (evu.k != null) {
                    conditionalUserProperty.mExpiredEventName = evu.k.a;
                    if (evu.k.b != null) {
                        conditionalUserProperty.mExpiredEventParams = evu.k.b.a();
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
        } else if (evt.a()) {
            q().c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                eru p = this.r.p();
                etj etj = new etj(this, atomicReference, str, str2, str3, z);
                p.a((Runnable) etj);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e2) {
                    q().f.a("Interrupted waiting for get user properties", e2);
                }
            }
            List<evj> list = (List) atomicReference.get();
            if (list == null) {
                q().f.a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            dp dpVar = new dp(list.size());
            for (evj evj : list) {
                dpVar.put(evj.a, evj.a());
            }
            return dpVar;
        }
    }

    public final String w() {
        eto eto = this.r.h().b;
        if (eto != null) {
            return eto.a;
        }
        return null;
    }

    public final String x() {
        eto eto = this.r.h().b;
        if (eto != null) {
            return eto.b;
        }
        return null;
    }

    public final String y() {
        if (this.r.a != null) {
            return this.r.a;
        }
        try {
            return bst.a();
        } catch (IllegalStateException e2) {
            this.r.q().c.a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqf d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ etc e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ eqq f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ ets g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ etp h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ eqs i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ euq j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }

    static /* synthetic */ void a(etc etc) {
        if (!etc.s().e(etc.f().v()) || !etc.r.o() || !etc.e) {
            etc.q().j.a("Updating Scion state (FE)");
            etc.g().w();
            return;
        }
        etc.q().j.a("Recording app launch after enabling measurement for the first time (FE)");
        etc.v();
    }

    static /* synthetic */ void a(etc etc, ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        etc.c();
        etc.D();
        bwx.a(conditionalUserProperty);
        bwx.a(conditionalUserProperty2.mName);
        bwx.a(conditionalUserProperty2.mOrigin);
        bwx.a(conditionalUserProperty2.mValue);
        if (!etc.r.o()) {
            etc.q().j.a("Conditional property not sent since collection is disabled");
            return;
        }
        evj evj = new evj(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            eqk a2 = etc.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0);
            eqk a3 = etc.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0);
            eqk a4 = etc.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0);
            evu evu = r2;
            evu evu2 = new evu(conditionalUserProperty2.mAppId, conditionalUserProperty2.mOrigin, evj, conditionalUserProperty2.mCreationTimestamp, false, conditionalUserProperty2.mTriggerEventName, a3, conditionalUserProperty2.mTriggerTimeout, a2, conditionalUserProperty2.mTimeToLive, a4);
            etc.g().a(evu);
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void b(etc etc, ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        etc.c();
        etc.D();
        bwx.a(conditionalUserProperty);
        bwx.a(conditionalUserProperty2.mName);
        if (!etc.r.o()) {
            etc.q().j.a("Conditional property not cleared since collection is disabled");
            return;
        }
        evj evj = new evj(conditionalUserProperty2.mName, 0, null, null);
        try {
            eqk a2 = etc.o().a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            boolean z = conditionalUserProperty2.mActive;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            long j3 = conditionalUserProperty2.mTimeToLive;
            evu evu = r2;
            evu evu2 = new evu(str, str2, evj, j, z, str3, null, j2, null, j3, a2);
            etc.g().a(evu);
        } catch (IllegalArgumentException unused) {
        }
    }
}
