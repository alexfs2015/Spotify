package defpackage;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: evs reason: default package */
final class evs extends evb {
    evs(evc evc) {
        super(evc);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x08bb  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0a99 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eke[] a(java.lang.String r65, defpackage.ekg[] r66, defpackage.ekm[] r67) {
        /*
            r64 = this;
            r7 = r64
            r15 = r65
            r13 = r66
            r14 = r67
            defpackage.bwx.a(r65)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            dp r12 = new dp
            r12.<init>()
            dp r10 = new dp
            r10.<init>()
            dp r9 = new dp
            r9.<init>()
            dp r8 = new dp
            r8.<init>()
            dp r6 = new dp
            r6.<init>()
            evw r0 = r64.s()
            boolean r23 = r0.f(r15)
            evz r0 = r64.h()
            java.util.Map r0 = r0.e(r15)
            if (r0 == 0) goto L_0x017c
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017c
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r0.get(r4)
            ekk r4 = (defpackage.ekk) r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r10.get(r3)
            java.util.BitSet r3 = (java.util.BitSet) r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r9.get(r5)
            java.util.BitSet r5 = (java.util.BitSet) r5
            r19 = r0
            if (r23 == 0) goto L_0x00b1
            dp r0 = new dp
            r0.<init>()
            r20 = r1
            if (r4 == 0) goto L_0x00a5
            ekf[] r1 = r4.c
            if (r1 != 0) goto L_0x0083
            goto L_0x00a5
        L_0x0083:
            ekf[] r1 = r4.c
            r21 = r5
            int r5 = r1.length
            r22 = r11
            r11 = 0
        L_0x008b:
            if (r11 >= r5) goto L_0x00a9
            r24 = r5
            r5 = r1[r11]
            r25 = r1
            java.lang.Integer r1 = r5.a
            if (r1 == 0) goto L_0x009e
            java.lang.Integer r1 = r5.a
            java.lang.Long r5 = r5.b
            r0.put(r1, r5)
        L_0x009e:
            int r11 = r11 + 1
            r5 = r24
            r1 = r25
            goto L_0x008b
        L_0x00a5:
            r21 = r5
            r22 = r11
        L_0x00a9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r8.put(r1, r0)
            goto L_0x00b8
        L_0x00b1:
            r20 = r1
            r21 = r5
            r22 = r11
            r0 = 0
        L_0x00b8:
            if (r3 != 0) goto L_0x00d3
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10.put(r1, r3)
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r9.put(r1, r5)
            goto L_0x00d5
        L_0x00d3:
            r5 = r21
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            long[] r11 = r4.a
            int r11 = r11.length
            int r11 = r11 << 6
            if (r1 >= r11) goto L_0x0129
            long[] r11 = r4.a
            boolean r11 = defpackage.evi.a(r11, r1)
            if (r11 == 0) goto L_0x010e
            eqw r11 = r64.q()
            eqy r11 = r11.k
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r24 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r25 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r11.a(r10, r8, r9)
            r5.set(r1)
            long[] r8 = r4.b
            boolean r8 = defpackage.evi.a(r8, r1)
            if (r8 == 0) goto L_0x0114
            r3.set(r1)
            r8 = 1
            goto L_0x0115
        L_0x010e:
            r21 = r8
            r24 = r9
            r25 = r10
        L_0x0114:
            r8 = 0
        L_0x0115:
            if (r0 == 0) goto L_0x0120
            if (r8 != 0) goto L_0x0120
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0.remove(r8)
        L_0x0120:
            int r1 = r1 + 1
            r8 = r21
            r9 = r24
            r10 = r25
            goto L_0x00d6
        L_0x0129:
            r21 = r8
            r24 = r9
            r25 = r10
            eke r1 = new eke
            r1.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12.put(r8, r1)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.d = r8
            r1.c = r4
            ekk r4 = new ekk
            r4.<init>()
            r1.b = r4
            ekk r4 = r1.b
            long[] r3 = defpackage.evi.a(r3)
            r4.b = r3
            ekk r3 = r1.b
            long[] r4 = defpackage.evi.a(r5)
            r3.a = r4
            if (r23 == 0) goto L_0x016e
            ekk r1 = r1.b
            ekf[] r0 = a(r0)
            r1.c = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            dp r1 = new dp
            r1.<init>()
            r6.put(r0, r1)
        L_0x016e:
            r0 = r19
            r1 = r20
            r8 = r21
            r11 = r22
            r9 = r24
            r10 = r25
            goto L_0x0043
        L_0x017c:
            r21 = r8
            r24 = r9
            r25 = r10
            r22 = r11
            java.lang.String r10 = "Filter definition"
            java.lang.String r8 = "Skipping failed audience ID"
            java.lang.String r26 = "null"
            if (r13 == 0) goto L_0x078f
            dp r4 = new dp
            r4.<init>()
            int r5 = r13.length
            r27 = 0
            r19 = r27
            r0 = 0
            r1 = 0
            r3 = 0
        L_0x0199:
            if (r3 >= r5) goto L_0x078f
            r2 = r13[r3]
            java.lang.String r9 = r2.b
            ekh[] r11 = r2.a
            r30 = r3
            evw r3 = r64.s()
            r31 = r4
            eqm$a<java.lang.Boolean> r4 = defpackage.eqm.R
            boolean r3 = r3.c(r15, r4)
            r32 = 1
            if (r3 == 0) goto L_0x0376
            r64.f()
            java.lang.String r3 = "_eid"
            java.lang.Object r4 = defpackage.evi.b(r2, r3)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x01c3
            r34 = 1
            goto L_0x01c5
        L_0x01c3:
            r34 = 0
        L_0x01c5:
            r35 = r5
            if (r34 == 0) goto L_0x01d3
            java.lang.String r5 = "_ep"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x01d3
            r5 = 1
            goto L_0x01d4
        L_0x01d3:
            r5 = 0
        L_0x01d4:
            if (r5 == 0) goto L_0x0329
            r64.f()
            java.lang.String r5 = "_en"
            java.lang.Object r5 = defpackage.evi.b(r2, r5)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto L_0x01ff
            eqw r2 = r64.q()
            eqy r2 = r2.c
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            r2.a(r3, r4)
            r36 = r0
            r41 = r6
            r40 = r31
            r31 = r35
            r35 = 1
            goto L_0x0317
        L_0x01ff:
            if (r0 == 0) goto L_0x0214
            if (r1 == 0) goto L_0x0214
            long r36 = r4.longValue()
            long r38 = r1.longValue()
            int r5 = (r36 > r38 ? 1 : (r36 == r38 ? 0 : -1))
            if (r5 == 0) goto L_0x0210
            goto L_0x0214
        L_0x0210:
            r5 = r0
            r34 = r1
            goto L_0x023c
        L_0x0214:
            evz r5 = r64.h()
            android.util.Pair r5 = r5.a(r15, r4)
            r36 = r0
            if (r5 == 0) goto L_0x0304
            java.lang.Object r0 = r5.first
            if (r0 != 0) goto L_0x0226
            goto L_0x0304
        L_0x0226:
            java.lang.Object r0 = r5.first
            ekg r0 = (defpackage.ekg) r0
            java.lang.Object r1 = r5.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r19 = r1.longValue()
            r64.f()
            java.lang.Object r1 = defpackage.evi.b(r0, r3)
            java.lang.Long r1 = (java.lang.Long) r1
            goto L_0x0210
        L_0x023c:
            long r19 = r19 - r32
            int r0 = (r19 > r27 ? 1 : (r19 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0288
            evz r1 = r64.h()
            r1.c()
            eqw r0 = r1.q()
            eqy r0 = r0.k
            java.lang.String r3 = "Clearing complex main event info. appId"
            r0.a(r3, r15)
            android.database.sqlite.SQLiteDatabase r0 = r1.w()     // Catch:{ SQLiteException -> 0x026b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r18 = r2
            r4 = 1
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0269 }
            r17 = 0
            r2[r17] = r15     // Catch:{ SQLiteException -> 0x0267 }
            r0.execSQL(r3, r2)     // Catch:{ SQLiteException -> 0x0267 }
            goto L_0x027c
        L_0x0267:
            r0 = move-exception
            goto L_0x0271
        L_0x0269:
            r0 = move-exception
            goto L_0x026f
        L_0x026b:
            r0 = move-exception
            r18 = r2
            r4 = 1
        L_0x026f:
            r17 = 0
        L_0x0271:
            eqw r1 = r1.q()
            eqy r1 = r1.c
            java.lang.String r2 = "Error clearing complex main event"
            r1.a(r2, r0)
        L_0x027c:
            r1 = r5
            r41 = r6
            r13 = r18
            r40 = r31
            r31 = r35
            r35 = 1
            goto L_0x02ab
        L_0x0288:
            r18 = r2
            r17 = 0
            r36 = 1
            evz r1 = r64.h()
            r3 = r18
            r2 = r65
            r13 = r3
            r3 = r4
            r16 = r5
            r40 = r31
            r31 = r35
            r35 = 1
            r4 = r19
            r41 = r6
            r6 = r16
            r1.a(r2, r3, r4, r6)
            r1 = r16
        L_0x02ab:
            ekh[] r0 = r1.a
            int r0 = r0.length
            int r2 = r11.length
            int r0 = r0 + r2
            ekh[] r0 = new defpackage.ekh[r0]
            ekh[] r2 = r1.a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x02b7:
            if (r4 >= r3) goto L_0x02d2
            r6 = r2[r4]
            r64.f()
            r16 = r1
            java.lang.String r1 = r6.a
            ekh r1 = defpackage.evi.a(r13, r1)
            if (r1 != 0) goto L_0x02cd
            int r1 = r5 + 1
            r0[r5] = r6
            r5 = r1
        L_0x02cd:
            int r4 = r4 + 1
            r1 = r16
            goto L_0x02b7
        L_0x02d2:
            r16 = r1
            if (r5 <= 0) goto L_0x02f2
            int r1 = r11.length
            r2 = 0
        L_0x02d8:
            if (r2 >= r1) goto L_0x02e4
            r3 = r11[r2]
            int r4 = r5 + 1
            r0[r5] = r3
            int r2 = r2 + 1
            r5 = r4
            goto L_0x02d8
        L_0x02e4:
            int r1 = r0.length
            if (r5 != r1) goto L_0x02e8
            goto L_0x02ee
        L_0x02e8:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            ekh[] r0 = (defpackage.ekh[]) r0
        L_0x02ee:
            r39 = r0
            r0 = r9
            goto L_0x0300
        L_0x02f2:
            eqw r0 = r64.q()
            eqy r0 = r0.f
            java.lang.String r1 = "No unique parameters in main event. eventName"
            r0.a(r1, r9)
            r0 = r9
            r39 = r11
        L_0x0300:
            r36 = r16
            goto L_0x0386
        L_0x0304:
            r41 = r6
            r40 = r31
            r31 = r35
            r35 = 1
            eqw r0 = r64.q()
            eqy r0 = r0.c
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.a(r2, r9, r4)
        L_0x0317:
            r44 = r8
            r46 = r10
            r17 = r12
            r47 = r21
            r11 = r22
            r43 = r24
            r45 = r25
            r0 = r36
            goto L_0x076f
        L_0x0329:
            r36 = r0
            r13 = r2
            r41 = r6
            r40 = r31
            r31 = r35
            r35 = 1
            if (r34 == 0) goto L_0x0381
            r64.f()
            java.lang.Long r0 = java.lang.Long.valueOf(r27)
            java.lang.String r1 = "_epc"
            java.lang.Object r1 = defpackage.evi.b(r13, r1)
            if (r1 != 0) goto L_0x0346
            goto L_0x0347
        L_0x0346:
            r0 = r1
        L_0x0347:
            java.lang.Long r0 = (java.lang.Long) r0
            long r16 = r0.longValue()
            int r0 = (r16 > r27 ? 1 : (r16 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x035e
            eqw r0 = r64.q()
            eqy r0 = r0.f
            java.lang.String r1 = "Complex event with zero extra param count. eventName"
            r0.a(r1, r9)
            r0 = r4
            goto L_0x036c
        L_0x035e:
            evz r1 = r64.h()
            r2 = r65
            r3 = r4
            r0 = r4
            r4 = r16
            r6 = r13
            r1.a(r2, r3, r4, r6)
        L_0x036c:
            r34 = r0
            r0 = r9
            r39 = r11
            r36 = r13
            r37 = r16
            goto L_0x0388
        L_0x0376:
            r36 = r0
            r13 = r2
            r41 = r6
            r40 = r31
            r35 = 1
            r31 = r5
        L_0x0381:
            r34 = r1
            r0 = r9
            r39 = r11
        L_0x0386:
            r37 = r19
        L_0x0388:
            evz r1 = r64.h()
            java.lang.String r2 = r13.b
            eqg r1 = r1.a(r15, r2)
            if (r1 != 0) goto L_0x03ee
            eqw r1 = r64.q()
            eqy r1 = r1.f
            java.lang.Object r2 = defpackage.eqw.a(r65)
            equ r3 = r64.n()
            java.lang.String r3 = r3.a(r0)
            java.lang.String r4 = "Event aggregate wasn't created during raw event logging. appId, event"
            r1.a(r4, r2, r3)
            eqg r1 = new eqg
            java.lang.String r2 = r13.b
            r3 = 1
            r5 = 1
            java.lang.Long r9 = r13.c
            long r16 = r9.longValue()
            r18 = 0
            r20 = 0
            r32 = 0
            r33 = 0
            r42 = 0
            r9 = r8
            r11 = r21
            r8 = r1
            r44 = r9
            r43 = r24
            r9 = r65
            r46 = r10
            r45 = r25
            r10 = r2
            r47 = r11
            r7 = r12
            r2 = r22
            r11 = r3
            r3 = r13
            r4 = r14
            r13 = r5
            r5 = r15
            r15 = r16
            r17 = r18
            r19 = r20
            r20 = r32
            r21 = r33
            r22 = r42
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
            r18 = r3
            goto L_0x0430
        L_0x03ee:
            r44 = r8
            r46 = r10
            r7 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r47 = r21
            r2 = r22
            r43 = r24
            r45 = r25
            eqg r6 = new eqg
            java.lang.String r8 = r1.a
            java.lang.String r9 = r1.b
            long r10 = r1.c
            long r51 = r10 + r32
            long r10 = r1.d
            long r53 = r10 + r32
            long r10 = r1.e
            long r12 = r1.f
            java.lang.Long r14 = r1.g
            java.lang.Long r15 = r1.h
            r18 = r3
            java.lang.Long r3 = r1.i
            java.lang.Boolean r1 = r1.j
            r48 = r6
            r49 = r8
            r50 = r9
            r55 = r10
            r57 = r12
            r59 = r14
            r60 = r15
            r61 = r3
            r62 = r1
            r48.<init>(r49, r50, r51, r53, r55, r57, r59, r60, r61, r62)
            r1 = r6
        L_0x0430:
            evz r3 = r64.h()
            r3.a(r1)
            long r8 = r1.c
            r10 = r40
            java.lang.Object r1 = r10.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0455
            evz r1 = r64.h()
            java.util.Map r1 = r1.f(r5, r0)
            if (r1 != 0) goto L_0x0452
            dp r1 = new dp
            r1.<init>()
        L_0x0452:
            r10.put(r0, r1)
        L_0x0455:
            r11 = r1
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x045e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0764
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r13 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0488
            eqw r1 = r64.q()
            eqy r1 = r1.k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r14 = r44
            r1.a(r14, r3)
            goto L_0x045e
        L_0x0488:
            r14 = r44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r7.get(r1)
            eke r1 = (defpackage.eke) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r15 = r45
            java.lang.Object r3 = r15.get(r3)
            java.util.BitSet r3 = (java.util.BitSet) r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r40 = r10
            r10 = r43
            java.lang.Object r6 = r10.get(r6)
            java.util.BitSet r6 = (java.util.BitSet) r6
            r22 = r2
            if (r23 == 0) goto L_0x04d1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r16 = r12
            r12 = r47
            java.lang.Object r2 = r12.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r17 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r44 = r14
            r14 = r41
            java.lang.Object r2 = r14.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x04dc
        L_0x04d1:
            r16 = r12
            r44 = r14
            r14 = r41
            r12 = r47
            r2 = 0
            r17 = 0
        L_0x04dc:
            if (r1 != 0) goto L_0x0522
            eke r1 = new eke
            r1.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r7.put(r3, r1)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.d = r3
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r15.put(r1, r3)
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r10.put(r1, r6)
            if (r23 == 0) goto L_0x0522
            dp r1 = new dp
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r12.put(r2, r1)
            dp r2 = new dp
            r2.<init>()
            r17 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14.put(r1, r2)
        L_0x0522:
            r63 = r17
            r17 = r2
            r2 = r63
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r19 = r1.iterator()
        L_0x0536:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x074e
            java.lang.Object r1 = r19.next()
            ejw r1 = (defpackage.ejw) r1
            r20 = r2
            eqw r2 = r64.q()
            r21 = r11
            r11 = 2
            boolean r2 = r2.a(r11)
            if (r2 == 0) goto L_0x0582
            eqw r2 = r64.q()
            eqy r2 = r2.k
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r4 = r1.a
            equ r5 = r64.n()
            r24 = r6
            java.lang.String r6 = r1.b
            java.lang.String r5 = r5.a(r6)
            java.lang.String r6 = "Evaluating filter. audience, filter, event"
            r2.a(r6, r11, r4, r5)
            eqw r2 = r64.q()
            eqy r2 = r2.k
            evi r4 = r64.f()
            java.lang.String r4 = r4.a(r1)
            r11 = r46
            r2.a(r11, r4)
            goto L_0x0586
        L_0x0582:
            r24 = r6
            r11 = r46
        L_0x0586:
            java.lang.Integer r2 = r1.a
            if (r2 == 0) goto L_0x0703
            java.lang.Integer r2 = r1.a
            int r2 = r2.intValue()
            r5 = 256(0x100, float:3.59E-43)
            if (r2 <= r5) goto L_0x0596
            goto L_0x0703
        L_0x0596:
            java.lang.String r6 = "Event filter result"
            if (r23 == 0) goto L_0x0676
            if (r1 == 0) goto L_0x05ab
            java.lang.Boolean r2 = r1.e
            if (r2 == 0) goto L_0x05ab
            java.lang.Boolean r2 = r1.e
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05ab
            r25 = 1
            goto L_0x05ad
        L_0x05ab:
            r25 = 0
        L_0x05ad:
            if (r1 == 0) goto L_0x05be
            java.lang.Boolean r2 = r1.f
            if (r2 == 0) goto L_0x05be
            java.lang.Boolean r2 = r1.f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05be
            r29 = 1
            goto L_0x05c0
        L_0x05be:
            r29 = 0
        L_0x05c0:
            java.lang.Integer r2 = r1.a
            int r2 = r2.intValue()
            boolean r2 = r3.get(r2)
            if (r2 == 0) goto L_0x05ef
            if (r25 != 0) goto L_0x05ef
            if (r29 != 0) goto L_0x05ef
            eqw r2 = r64.q()
            eqy r2 = r2.k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = r1.a
            java.lang.String r6 = "Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            r2.a(r6, r4, r1)
            r5 = r65
            r4 = r67
            r46 = r11
            r2 = r20
            r11 = r21
            r6 = r24
            goto L_0x0536
        L_0x05ef:
            r4 = r1
            r2 = r17
            r1 = r64
            r46 = r11
            r47 = r12
            r41 = r14
            r14 = r20
            r11 = r22
            r12 = r2
            r2 = r4
            r43 = r10
            r45 = r15
            r10 = r18
            r15 = r3
            r3 = r0
            r17 = r7
            r7 = r4
            r4 = r39
            r18 = r0
            r0 = r24
            r14 = r6
            r5 = r8
            java.lang.Boolean r1 = r1.a(r2, r3, r4, r5)
            eqw r2 = r64.q()
            eqy r2 = r2.k
            if (r1 != 0) goto L_0x0622
            r3 = r26
            goto L_0x0623
        L_0x0622:
            r3 = r1
        L_0x0623:
            r2.a(r14, r3)
            if (r1 != 0) goto L_0x0631
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r11.add(r1)
            goto L_0x0730
        L_0x0631:
            java.lang.Integer r2 = r7.a
            int r2 = r2.intValue()
            r0.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0730
            java.lang.Integer r1 = r7.a
            int r1 = r1.intValue()
            r15.set(r1)
            if (r25 != 0) goto L_0x064d
            if (r29 == 0) goto L_0x0730
        L_0x064d:
            java.lang.Long r1 = r10.c
            if (r1 == 0) goto L_0x0730
            if (r29 == 0) goto L_0x0664
            java.lang.Integer r1 = r7.a
            int r1 = r1.intValue()
            java.lang.Long r2 = r10.c
            long r2 = r2.longValue()
            b(r12, r1, r2)
            goto L_0x0730
        L_0x0664:
            java.lang.Integer r1 = r7.a
            int r1 = r1.intValue()
            java.lang.Long r2 = r10.c
            long r2 = r2.longValue()
            r5 = r20
            a(r5, r1, r2)
            goto L_0x06ae
        L_0x0676:
            r43 = r10
            r46 = r11
            r47 = r12
            r41 = r14
            r45 = r15
            r12 = r17
            r10 = r18
            r5 = r20
            r11 = r22
            r18 = r0
            r15 = r3
            r14 = r6
            r17 = r7
            r0 = r24
            r7 = r1
            java.lang.Integer r1 = r7.a
            int r1 = r1.intValue()
            boolean r1 = r15.get(r1)
            if (r1 == 0) goto L_0x06c3
            eqw r1 = r64.q()
            eqy r1 = r1.k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r3 = r7.a
            java.lang.String r4 = "Event filter already evaluated true. audience ID, filter ID"
            r1.a(r4, r2, r3)
        L_0x06ae:
            r4 = r67
            r6 = r0
            r2 = r5
            r22 = r11
            r3 = r15
            r7 = r17
            r0 = r18
            r11 = r21
            r14 = r41
            r15 = r45
            r5 = r65
            goto L_0x0744
        L_0x06c3:
            r1 = r64
            r2 = r7
            r3 = r18
            r4 = r39
            r20 = r5
            r5 = r8
            java.lang.Boolean r1 = r1.a(r2, r3, r4, r5)
            eqw r2 = r64.q()
            eqy r2 = r2.k
            if (r1 != 0) goto L_0x06dc
            r3 = r26
            goto L_0x06dd
        L_0x06dc:
            r3 = r1
        L_0x06dd:
            r2.a(r14, r3)
            if (r1 != 0) goto L_0x06ea
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r11.add(r1)
            goto L_0x0730
        L_0x06ea:
            java.lang.Integer r2 = r7.a
            int r2 = r2.intValue()
            r0.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0730
            java.lang.Integer r1 = r7.a
            int r1 = r1.intValue()
            r15.set(r1)
            goto L_0x0730
        L_0x0703:
            r43 = r10
            r46 = r11
            r47 = r12
            r41 = r14
            r45 = r15
            r12 = r17
            r10 = r18
            r11 = r22
            r18 = r0
            r15 = r3
            r17 = r7
            r0 = r24
            r7 = r1
            eqw r1 = r64.q()
            eqy r1 = r1.f
            java.lang.Object r2 = defpackage.eqw.a(r65)
            java.lang.Integer r3 = r7.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.a(r4, r2, r3)
        L_0x0730:
            r5 = r65
            r4 = r67
            r6 = r0
            r22 = r11
            r3 = r15
            r7 = r17
            r0 = r18
            r2 = r20
            r11 = r21
            r14 = r41
            r15 = r45
        L_0x0744:
            r18 = r10
            r17 = r12
            r10 = r43
            r12 = r47
            goto L_0x0536
        L_0x074e:
            r43 = r10
            r10 = r18
            r5 = r65
            r4 = r67
            r47 = r12
            r41 = r14
            r45 = r15
            r12 = r16
            r2 = r22
            r10 = r40
            goto L_0x045e
        L_0x0764:
            r11 = r2
            r17 = r7
            r40 = r10
            r1 = r34
            r0 = r36
            r19 = r37
        L_0x076f:
            int r3 = r30 + 1
            r7 = r64
            r15 = r65
            r13 = r66
            r14 = r67
            r22 = r11
            r12 = r17
            r5 = r31
            r4 = r40
            r6 = r41
            r24 = r43
            r8 = r44
            r25 = r45
            r10 = r46
            r21 = r47
            goto L_0x0199
        L_0x078f:
            r41 = r6
            r44 = r8
            r46 = r10
            r17 = r12
            r47 = r21
            r11 = r22
            r43 = r24
            r45 = r25
            r35 = 1
            r1 = r67
            if (r1 == 0) goto L_0x0ac4
            dp r0 = new dp
            r0.<init>()
            int r2 = r1.length
            r3 = 0
        L_0x07ac:
            if (r3 >= r2) goto L_0x0ac4
            r4 = r1[r3]
            java.lang.String r5 = r4.b
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x07d3
            evz r5 = r64.h()
            java.lang.String r6 = r4.b
            r7 = r65
            java.util.Map r5 = r5.g(r7, r6)
            if (r5 != 0) goto L_0x07cd
            dp r5 = new dp
            r5.<init>()
        L_0x07cd:
            java.lang.String r6 = r4.b
            r0.put(r6, r5)
            goto L_0x07d5
        L_0x07d3:
            r7 = r65
        L_0x07d5:
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x07dd:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0ab1
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r9 = r11.contains(r9)
            if (r9 == 0) goto L_0x0807
            eqw r9 = r64.q()
            eqy r9 = r9.k
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = r44
            r9.a(r10, r8)
            goto L_0x07dd
        L_0x0807:
            r10 = r44
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12 = r17
            java.lang.Object r9 = r12.get(r9)
            eke r9 = (defpackage.eke) r9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r14 = r45
            java.lang.Object r13 = r14.get(r13)
            java.util.BitSet r13 = (java.util.BitSet) r13
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r1 = r43
            java.lang.Object r15 = r1.get(r15)
            java.util.BitSet r15 = (java.util.BitSet) r15
            r66 = r0
            if (r23 == 0) goto L_0x0850
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r16 = r2
            r2 = r47
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r17 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r18 = r6
            r6 = r41
            java.lang.Object r0 = r6.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x085b
        L_0x0850:
            r16 = r2
            r18 = r6
            r6 = r41
            r2 = r47
            r0 = 0
            r17 = 0
        L_0x085b:
            if (r9 != 0) goto L_0x08a2
            eke r9 = new eke
            r9.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r12.put(r13, r9)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r9.d = r13
            java.util.BitSet r13 = new java.util.BitSet
            r13.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r14.put(r9, r13)
            java.util.BitSet r15 = new java.util.BitSet
            r15.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r1.put(r9, r15)
            if (r23 == 0) goto L_0x08a2
            dp r0 = new dp
            r0.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r2.put(r9, r0)
            dp r9 = new dp
            r9.<init>()
            r17 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6.put(r0, r9)
            goto L_0x08a3
        L_0x08a2:
            r9 = r0
        L_0x08a3:
            r44 = r10
            r0 = r17
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object r10 = r5.get(r10)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x08b5:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L_0x0a99
            java.lang.Object r17 = r10.next()
            r19 = r5
            r5 = r17
            ejz r5 = (defpackage.ejz) r5
            r17 = r10
            eqw r10 = r64.q()
            r20 = r12
            r12 = 2
            boolean r10 = r10.a(r12)
            if (r10 == 0) goto L_0x0907
            eqw r10 = r64.q()
            eqy r10 = r10.k
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r7 = r5.a
            r41 = r6
            equ r6 = r64.n()
            r21 = r2
            java.lang.String r2 = r5.b
            java.lang.String r2 = r6.c(r2)
            java.lang.String r6 = "Evaluating filter. audience, filter, property"
            r10.a(r6, r12, r7, r2)
            eqw r2 = r64.q()
            eqy r2 = r2.k
            evi r6 = r64.f()
            java.lang.String r6 = r6.a(r5)
            r7 = r46
            r2.a(r7, r6)
            goto L_0x090d
        L_0x0907:
            r21 = r2
            r41 = r6
            r7 = r46
        L_0x090d:
            java.lang.Integer r2 = r5.a
            if (r2 == 0) goto L_0x0a5f
            java.lang.Integer r2 = r5.a
            int r2 = r2.intValue()
            r6 = 256(0x100, float:3.59E-43)
            if (r2 <= r6) goto L_0x091d
            goto L_0x0a5f
        L_0x091d:
            java.lang.String r2 = "Property filter result"
            if (r23 == 0) goto L_0x09f2
            if (r5 == 0) goto L_0x0931
            java.lang.Boolean r10 = r5.d
            if (r10 == 0) goto L_0x0931
            java.lang.Boolean r10 = r5.d
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0931
            r10 = 1
            goto L_0x0932
        L_0x0931:
            r10 = 0
        L_0x0932:
            if (r5 == 0) goto L_0x0942
            java.lang.Boolean r12 = r5.e
            if (r12 == 0) goto L_0x0942
            java.lang.Boolean r12 = r5.e
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0942
            r12 = 1
            goto L_0x0943
        L_0x0942:
            r12 = 0
        L_0x0943:
            java.lang.Integer r6 = r5.a
            int r6 = r6.intValue()
            boolean r6 = r13.get(r6)
            if (r6 == 0) goto L_0x0972
            if (r10 != 0) goto L_0x0972
            if (r12 != 0) goto L_0x0972
            eqw r2 = r64.q()
            eqy r2 = r2.k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r5 = r5.a
            java.lang.String r10 = "Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            r2.a(r10, r6, r5)
            r46 = r7
            r10 = r17
            r5 = r19
            r12 = r20
            r2 = r21
            r6 = r41
            goto L_0x0a25
        L_0x0972:
            r6 = r64
            r46 = r7
            r7 = r20
            java.lang.Boolean r20 = r6.a(r5, r4)
            r43 = r1
            eqw r1 = r64.q()
            eqy r1 = r1.k
            r22 = r7
            if (r20 != 0) goto L_0x098b
            r7 = r26
            goto L_0x098d
        L_0x098b:
            r7 = r20
        L_0x098d:
            r1.a(r2, r7)
            if (r20 != 0) goto L_0x099a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r11.add(r1)
            goto L_0x09e2
        L_0x099a:
            java.lang.Integer r1 = r5.a
            int r1 = r1.intValue()
            r15.set(r1)
            java.lang.Integer r1 = r5.a
            int r1 = r1.intValue()
            boolean r2 = r20.booleanValue()
            r13.set(r1, r2)
            boolean r1 = r20.booleanValue()
            if (r1 == 0) goto L_0x09e2
            if (r10 != 0) goto L_0x09ba
            if (r12 == 0) goto L_0x09e2
        L_0x09ba:
            java.lang.Long r1 = r4.a
            if (r1 == 0) goto L_0x09e2
            if (r12 == 0) goto L_0x09d1
            java.lang.Integer r1 = r5.a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.a
            r7 = r3
            long r2 = r2.longValue()
            b(r9, r1, r2)
            goto L_0x0a18
        L_0x09d1:
            r7 = r3
            java.lang.Integer r1 = r5.a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.a
            long r2 = r2.longValue()
            a(r0, r1, r2)
            goto L_0x0a18
        L_0x09e2:
            r7 = r65
            r10 = r17
            r5 = r19
            r2 = r21
            r12 = r22
            r6 = r41
            r1 = r43
            goto L_0x08b5
        L_0x09f2:
            r6 = r64
            r43 = r1
            r46 = r7
            r22 = r20
            r7 = r3
            java.lang.Integer r1 = r5.a
            int r1 = r1.intValue()
            boolean r1 = r13.get(r1)
            if (r1 == 0) goto L_0x0a29
            eqw r1 = r64.q()
            eqy r1 = r1.k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r3 = r5.a
            java.lang.String r5 = "Property filter already evaluated true. audience ID, filter ID"
            r1.a(r5, r2, r3)
        L_0x0a18:
            r3 = r7
            r10 = r17
            r5 = r19
            r2 = r21
            r12 = r22
            r6 = r41
            r1 = r43
        L_0x0a25:
            r7 = r65
            goto L_0x08b5
        L_0x0a29:
            java.lang.Boolean r1 = r6.a(r5, r4)
            eqw r3 = r64.q()
            eqy r3 = r3.k
            if (r1 != 0) goto L_0x0a38
            r10 = r26
            goto L_0x0a39
        L_0x0a38:
            r10 = r1
        L_0x0a39:
            r3.a(r2, r10)
            if (r1 != 0) goto L_0x0a46
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r11.add(r1)
            goto L_0x0a18
        L_0x0a46:
            java.lang.Integer r2 = r5.a
            int r2 = r2.intValue()
            r15.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0a18
            java.lang.Integer r1 = r5.a
            int r1 = r1.intValue()
            r13.set(r1)
            goto L_0x0a18
        L_0x0a5f:
            r6 = r64
            r43 = r1
            r46 = r7
            r22 = r20
            r7 = r3
            eqw r0 = r64.q()
            eqy r0 = r0.f
            java.lang.Object r1 = defpackage.eqw.a(r65)
            java.lang.Integer r2 = r5.a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Invalid property filter ID. appId, id"
            r0.a(r3, r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r11.add(r0)
            r0 = r66
            r1 = r67
            r3 = r7
            r45 = r14
            r2 = r16
            r6 = r18
            r5 = r19
            r47 = r21
            r17 = r22
            r7 = r65
            goto L_0x07dd
        L_0x0a99:
            r41 = r6
            r6 = r64
            r7 = r65
            r0 = r66
            r43 = r1
            r47 = r2
            r17 = r12
            r45 = r14
            r2 = r16
            r6 = r18
            r1 = r67
            goto L_0x07dd
        L_0x0ab1:
            r6 = r64
            r66 = r0
            r16 = r2
            r7 = r3
            r22 = r17
            r14 = r45
            r21 = r47
            int r3 = r7 + 1
            r1 = r67
            goto L_0x07ac
        L_0x0ac4:
            r6 = r64
            r22 = r17
            r14 = r45
            r21 = r47
            int r0 = r14.size()
            eke[] r1 = new defpackage.eke[r0]
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x0adb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c7e
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r4 = r11.contains(r4)
            if (r4 != 0) goto L_0x0c7a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = r22
            java.lang.Object r4 = r5.get(r4)
            eke r4 = (defpackage.eke) r4
            if (r4 != 0) goto L_0x0b08
            eke r4 = new eke
            r4.<init>()
        L_0x0b08:
            int r7 = r3 + 1
            r1[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4.a = r3
            ekk r3 = new ekk
            r3.<init>()
            r4.b = r3
            ekk r3 = r4.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r14.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = defpackage.evi.a(r8)
            r3.b = r8
            ekk r3 = r4.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = r43
            java.lang.Object r8 = r9.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = defpackage.evi.a(r8)
            r3.a = r8
            if (r23 == 0) goto L_0x0bdf
            ekk r3 = r4.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r10 = r21
            java.lang.Object r8 = r10.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            ekf[] r8 = a(r8)
            r3.c = r8
            ekk r3 = r4.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r12 = r41
            java.lang.Object r8 = r12.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0b6f
            r13 = 0
            ekl[] r8 = new defpackage.ekl[r13]
            r66 = r2
            r20 = r5
            r15 = r8
            goto L_0x0bdc
        L_0x0b6f:
            r13 = 0
            int r15 = r8.size()
            ekl[] r15 = new defpackage.ekl[r15]
            java.util.Set r16 = r8.keySet()
            java.util.Iterator r16 = r16.iterator()
            r17 = 0
        L_0x0b80:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x0bd8
            java.lang.Object r18 = r16.next()
            r13 = r18
            java.lang.Integer r13 = (java.lang.Integer) r13
            r66 = r2
            ekl r2 = new ekl
            r2.<init>()
            r2.a = r13
            java.lang.Object r13 = r8.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0bca
            java.util.Collections.sort(r13)
            r20 = r5
            int r5 = r13.size()
            long[] r5 = new long[r5]
            java.util.Iterator r13 = r13.iterator()
            r18 = 0
        L_0x0bb0:
            boolean r19 = r13.hasNext()
            if (r19 == 0) goto L_0x0bc7
            java.lang.Object r19 = r13.next()
            java.lang.Long r19 = (java.lang.Long) r19
            int r21 = r18 + 1
            long r24 = r19.longValue()
            r5[r18] = r24
            r18 = r21
            goto L_0x0bb0
        L_0x0bc7:
            r2.b = r5
            goto L_0x0bcc
        L_0x0bca:
            r20 = r5
        L_0x0bcc:
            int r5 = r17 + 1
            r15[r17] = r2
            r2 = r66
            r17 = r5
            r5 = r20
            r13 = 0
            goto L_0x0b80
        L_0x0bd8:
            r66 = r2
            r20 = r5
        L_0x0bdc:
            r3.d = r15
            goto L_0x0be7
        L_0x0bdf:
            r66 = r2
            r20 = r5
            r10 = r21
            r12 = r41
        L_0x0be7:
            evz r2 = r64.h()
            ekk r3 = r4.b
            r2.j()
            r2.c()
            defpackage.bwx.a(r65)
            defpackage.bwx.a(r3)
            int r4 = r3.e()     // Catch:{ IOException -> 0x0c5a }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0c5a }
            int r5 = r4.length     // Catch:{ IOException -> 0x0c5a }
            ept r5 = defpackage.ept.a(r4, r5)     // Catch:{ IOException -> 0x0c5a }
            r3.a(r5)     // Catch:{ IOException -> 0x0c5a }
            r5.a()     // Catch:{ IOException -> 0x0c5a }
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r5 = "app_id"
            r8 = r65
            r3.put(r5, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "audience_id"
            r3.put(r5, r0)
            java.lang.String r0 = "current_results"
            r3.put(r0, r4)
            android.database.sqlite.SQLiteDatabase r0 = r2.w()     // Catch:{ SQLiteException -> 0x0c48 }
            java.lang.String r4 = "audience_filter_values"
            r5 = 5
            r13 = 0
            long r3 = r0.insertWithOnConflict(r4, r13, r3, r5)     // Catch:{ SQLiteException -> 0x0c46 }
            r15 = -1
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0c6d
            eqw r0 = r2.q()     // Catch:{ SQLiteException -> 0x0c46 }
            eqy r0 = r0.c     // Catch:{ SQLiteException -> 0x0c46 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r4 = defpackage.eqw.a(r65)     // Catch:{ SQLiteException -> 0x0c46 }
            r0.a(r3, r4)     // Catch:{ SQLiteException -> 0x0c46 }
            goto L_0x0c6d
        L_0x0c46:
            r0 = move-exception
            goto L_0x0c4a
        L_0x0c48:
            r0 = move-exception
            r13 = 0
        L_0x0c4a:
            eqw r2 = r2.q()
            eqy r2 = r2.c
            java.lang.Object r3 = defpackage.eqw.a(r65)
            java.lang.String r4 = "Error storing filter results. appId"
            r2.a(r4, r3, r0)
            goto L_0x0c6d
        L_0x0c5a:
            r0 = move-exception
            r8 = r65
            r13 = 0
            eqw r2 = r2.q()
            eqy r2 = r2.c
            java.lang.Object r3 = defpackage.eqw.a(r65)
            java.lang.String r4 = "Configuration loss. Failed to serialize filter results. appId"
            r2.a(r4, r3, r0)
        L_0x0c6d:
            r2 = r66
            r3 = r7
            r43 = r9
            r21 = r10
            r41 = r12
            r22 = r20
            goto L_0x0adb
        L_0x0c7a:
            r8 = r65
            goto L_0x0adb
        L_0x0c7e:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            eke[] r0 = (defpackage.eke[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evs.a(java.lang.String, ekg[], ekm[]):eke[]");
    }

    private final Boolean a(ejw ejw, String str, ekh[] ekhArr, long j) {
        ejx[] ejxArr;
        ejx[] ejxArr2;
        Boolean bool;
        if (ejw.d != null) {
            Boolean a = a(j, ejw.d);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        HashSet hashSet = new HashSet();
        for (ejx ejx : ejw.c) {
            if (TextUtils.isEmpty(ejx.d)) {
                q().f.a("null or empty param name in filter. event", n().a(str));
                return null;
            }
            hashSet.add(ejx.d);
        }
        dp dpVar = new dp();
        for (ekh ekh : ekhArr) {
            if (hashSet.contains(ekh.a)) {
                if (ekh.c != null) {
                    dpVar.put(ekh.a, ekh.c);
                } else if (ekh.d != null) {
                    dpVar.put(ekh.a, ekh.d);
                } else if (ekh.b != null) {
                    dpVar.put(ekh.a, ekh.b);
                } else {
                    q().f.a("Unknown value for param. event, param", n().a(str), n().b(ekh.a));
                    return null;
                }
            }
        }
        for (ejx ejx2 : ejw.c) {
            boolean equals = Boolean.TRUE.equals(ejx2.c);
            String str2 = ejx2.d;
            if (TextUtils.isEmpty(str2)) {
                q().f.a("Event has empty param name. event", n().a(str));
                return null;
            }
            Object obj = dpVar.get(str2);
            if (obj instanceof Long) {
                if (ejx2.b == null) {
                    q().f.a("No number filter for long param. event, param", n().a(str), n().b(str2));
                    return null;
                }
                Boolean a2 = a(((Long) obj).longValue(), ejx2.b);
                if (a2 == null) {
                    return null;
                }
                if ((!a2.booleanValue()) ^ equals) {
                    return Boolean.FALSE;
                }
            } else if (obj instanceof Double) {
                if (ejx2.b == null) {
                    q().f.a("No number filter for double param. event, param", n().a(str), n().b(str2));
                    return null;
                }
                Boolean a3 = a(((Double) obj).doubleValue(), ejx2.b);
                if (a3 == null) {
                    return null;
                }
                if ((!a3.booleanValue()) ^ equals) {
                    return Boolean.FALSE;
                }
            } else if (obj instanceof String) {
                if (ejx2.a != null) {
                    bool = a((String) obj, ejx2.a);
                } else if (ejx2.b != null) {
                    String str3 = (String) obj;
                    if (evi.a(str3)) {
                        bool = a(str3, ejx2.b);
                    } else {
                        q().f.a("Invalid param value for number filter. event, param", n().a(str), n().b(str2));
                        return null;
                    }
                } else {
                    q().f.a("No filter for String param. event, param", n().a(str), n().b(str2));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if ((!bool.booleanValue()) ^ equals) {
                    return Boolean.FALSE;
                }
            } else if (obj == null) {
                q().k.a("Missing param for filter. event, param", n().a(str), n().b(str2));
                return Boolean.FALSE;
            } else {
                q().f.a("Unknown param type. event, param", n().a(str), n().b(str2));
                return null;
            }
        }
        return Boolean.TRUE;
    }

    private final Boolean a(ejz ejz, ekm ekm) {
        ejx ejx = ejz.c;
        if (ejx == null) {
            q().f.a("Missing property filter. property", n().c(ekm.b));
            return null;
        }
        boolean equals = Boolean.TRUE.equals(ejx.c);
        if (ekm.d != null) {
            if (ejx.b != null) {
                return a(a(ekm.d.longValue(), ejx.b), equals);
            }
            q().f.a("No number filter for long property. property", n().c(ekm.b));
            return null;
        } else if (ekm.e != null) {
            if (ejx.b != null) {
                return a(a(ekm.e.doubleValue(), ejx.b), equals);
            }
            q().f.a("No number filter for double property. property", n().c(ekm.b));
            return null;
        } else if (ekm.c == null) {
            q().f.a("User property has no value, property", n().c(ekm.b));
            return null;
        } else if (ejx.a != null) {
            return a(a(ekm.c, ejx.a), equals);
        } else {
            if (ejx.b == null) {
                q().f.a("No string or number filter defined. property", n().c(ekm.b));
            } else if (evi.a(ekm.c)) {
                return a(a(ekm.c, ejx.b), equals);
            } else {
                q().f.a("Invalid user property value for Numeric number filter. property, value", n().c(ekm.b), ekm.c);
            }
            return null;
        }
    }

    private static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final Boolean a(String str, eka eka) {
        String str2;
        List list;
        bwx.a(eka);
        if (str == null || eka.a == null || eka.a.intValue() == 0) {
            return null;
        }
        if (eka.a.intValue() == 6) {
            if (eka.d == null || eka.d.length == 0) {
                return null;
            }
        } else if (eka.b == null) {
            return null;
        }
        int intValue = eka.a.intValue();
        boolean z = eka.c != null && eka.c.booleanValue();
        if (z || intValue == 1 || intValue == 6) {
            str2 = eka.b;
        } else {
            str2 = eka.b.toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (eka.d == null) {
            list = null;
        } else {
            String[] strArr = eka.d;
            if (z) {
                list = Arrays.asList(strArr);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String upperCase : strArr) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = arrayList;
            }
        }
        return a(str, intValue, z, str3, list, intValue == 1 ? str3 : null);
    }

    private final Boolean a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    q().f.a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private static Boolean a(long j, ejy ejy) {
        try {
            return a(new BigDecimal(j), ejy, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(double d, ejy ejy) {
        try {
            return a(new BigDecimal(d), ejy, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(String str, ejy ejy) {
        if (!evi.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), ejy, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (r3 != null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean a(java.math.BigDecimal r10, defpackage.ejy r11, double r12) {
        /*
            defpackage.bwx.a(r11)
            java.lang.Integer r0 = r11.a
            r1 = 0
            if (r0 == 0) goto L_0x00f3
            java.lang.Integer r0 = r11.a
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0012
            goto L_0x00f3
        L_0x0012:
            java.lang.Integer r0 = r11.a
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0024
            java.lang.String r0 = r11.d
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r11.e
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = r11.c
            if (r0 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.Integer r0 = r11.a
            int r0 = r0.intValue()
            java.lang.Integer r3 = r11.a
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x005a
            java.lang.String r3 = r11.d
            boolean r3 = defpackage.evi.a(r3)
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = r11.e
            boolean r3 = defpackage.evi.a(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0059
        L_0x0048:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r4 = r11.d     // Catch:{ NumberFormatException -> 0x0059 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r11 = r11.e     // Catch:{ NumberFormatException -> 0x0059 }
            r4.<init>(r11)     // Catch:{ NumberFormatException -> 0x0059 }
            r11 = r3
            r3 = r1
            goto L_0x006c
        L_0x0059:
            return r1
        L_0x005a:
            java.lang.String r3 = r11.c
            boolean r3 = defpackage.evi.a(r3)
            if (r3 != 0) goto L_0x0063
            return r1
        L_0x0063:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00f3 }
            java.lang.String r11 = r11.c     // Catch:{ NumberFormatException -> 0x00f3 }
            r3.<init>(r11)     // Catch:{ NumberFormatException -> 0x00f3 }
            r11 = r1
            r4 = r11
        L_0x006c:
            if (r0 != r2) goto L_0x0071
            if (r11 != 0) goto L_0x0073
            return r1
        L_0x0071:
            if (r3 == 0) goto L_0x00f3
        L_0x0073:
            r5 = -1
            r6 = 0
            r7 = 1
            if (r0 == r7) goto L_0x00e7
            r8 = 2
            if (r0 == r8) goto L_0x00db
            r9 = 3
            if (r0 == r9) goto L_0x0093
            if (r0 == r2) goto L_0x0081
            goto L_0x00f3
        L_0x0081:
            int r11 = r10.compareTo(r11)
            if (r11 == r5) goto L_0x008e
            int r10 = r10.compareTo(r4)
            if (r10 == r7) goto L_0x008e
            r6 = 1
        L_0x008e:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x0093:
            r0 = 0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00cf
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r0)
            java.math.BigDecimal r11 = r3.subtract(r11)
            int r11 = r10.compareTo(r11)
            if (r11 != r7) goto L_0x00ca
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r12 = new java.math.BigDecimal
            r12.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r12)
            java.math.BigDecimal r11 = r3.add(r11)
            int r10 = r10.compareTo(r11)
            if (r10 != r5) goto L_0x00ca
            r6 = 1
        L_0x00ca:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00cf:
            int r10 = r10.compareTo(r3)
            if (r10 != 0) goto L_0x00d6
            r6 = 1
        L_0x00d6:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00db:
            int r10 = r10.compareTo(r3)
            if (r10 != r7) goto L_0x00e2
            r6 = 1
        L_0x00e2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00e7:
            int r10 = r10.compareTo(r3)
            if (r10 != r5) goto L_0x00ee
            r6 = 1
        L_0x00ee:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00f3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evs.a(java.math.BigDecimal, ejy, double):java.lang.Boolean");
    }

    private static ekf[] a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        ekf[] ekfArr = new ekf[map.size()];
        for (Integer num : map.keySet()) {
            ekf ekf = new ekf();
            ekf.a = num;
            ekf.b = (Long) map.get(num);
            int i2 = i + 1;
            ekfArr[i] = ekf;
            i = i2;
        }
        return ekfArr;
    }

    private static void a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    private static void b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
