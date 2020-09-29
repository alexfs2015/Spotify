package defpackage;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: azm reason: default package */
public final class azm implements ayf, a, b {
    final HlsPlaylistTracker a;
    final a b;
    a c;
    azp[] d = new azp[0];
    private final azj e;
    private final azi f;
    private final bcu g;
    private final bcp h;
    private final bbz i;
    private final IdentityHashMap<ayk, Integer> j = new IdentityHashMap<>();
    private final azq k = new azq();
    private final axz l;
    private final boolean m;
    private int n;
    private ayo o;
    private azp[] p = new azp[0];
    private ayl q;
    private boolean r;

    public azm(azj azj, HlsPlaylistTracker hlsPlaylistTracker, azi azi, bcu bcu, bcp bcp, a aVar, bbz bbz, axz axz, boolean z) {
        this.e = azj;
        this.a = hlsPlaylistTracker;
        this.f = azi;
        this.g = bcu;
        this.h = bcp;
        this.b = aVar;
        this.i = bbz;
        this.l = axz;
        this.m = z;
        this.q = axz.a(new ayl[0]);
        aVar.a();
    }

    private static aqv a(aqv aqv, aqv aqv2, boolean z) {
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        aqv aqv3 = aqv;
        aqv aqv4 = aqv2;
        if (aqv4 != null) {
            String str4 = aqv4.d;
            int i4 = aqv4.q;
            int i5 = aqv4.v;
            String str5 = aqv4.w;
            str3 = aqv4.b;
            str2 = str4;
            i3 = i4;
            i2 = i5;
            str = str5;
        } else {
            String a2 = ben.a(aqv3.d, 1);
            if (z) {
                int i6 = aqv3.q;
                int i7 = aqv3.v;
                str2 = a2;
                i3 = i6;
                str = aqv3.b;
                i2 = i7;
                str3 = aqv3.b;
            } else {
                str2 = a2;
                str3 = null;
                str = null;
                i3 = -1;
                i2 = 0;
            }
        }
        return aqv.a(aqv3.a, str3, aqv3.e, bdx.f(str2), str2, z ? aqv3.c : -1, i3, -1, null, i2, str);
    }

    private azp a(int i2, a[] aVarArr, aqv aqv, List<aqv> list, long j2) {
        azh azh = new azh(this.e, this.a, aVarArr, this.f, this.g, this.k, list);
        azp azp = new azp(i2, this, azh, this.i, j2, aqv, this.h, this.b);
        return azp;
    }

    public final long a(long j2, arj arj) {
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bbu[] r29, boolean[] r30, defpackage.ayk[] r31, boolean[] r32, long r33) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r31
            r10 = r33
            int r3 = r1.length
            int[] r12 = new int[r3]
            int r3 = r1.length
            int[] r13 = new int[r3]
            r3 = 0
        L_0x000f:
            int r4 = r1.length
            r15 = -1
            if (r3 >= r4) goto L_0x004e
            r4 = r2[r3]
            if (r4 != 0) goto L_0x0019
            r4 = -1
            goto L_0x0027
        L_0x0019:
            java.util.IdentityHashMap<ayk, java.lang.Integer> r4 = r0.j
            r5 = r2[r3]
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0027:
            r12[r3] = r4
            r13[r3] = r15
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004b
            r4 = r1[r3]
            ayn r4 = r4.e()
            r5 = 0
        L_0x0036:
            azp[] r6 = r0.d
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004b
            r6 = r6[r5]
            ayo r6 = r6.p
            int r6 = r6.a(r4)
            if (r6 == r15) goto L_0x0048
            r13[r3] = r5
            goto L_0x004b
        L_0x0048:
            int r5 = r5 + 1
            goto L_0x0036
        L_0x004b:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004e:
            java.util.IdentityHashMap<ayk, java.lang.Integer> r3 = r0.j
            r3.clear()
            int r3 = r1.length
            ayk[] r8 = new defpackage.ayk[r3]
            int r3 = r1.length
            ayk[] r9 = new defpackage.ayk[r3]
            int r3 = r1.length
            bbu[] r6 = new defpackage.bbu[r3]
            azp[] r3 = r0.d
            int r3 = r3.length
            azp[] r7 = new defpackage.azp[r3]
            r4 = 0
            r5 = 0
            r16 = 0
        L_0x0065:
            azp[] r3 = r0.d
            int r3 = r3.length
            if (r4 >= r3) goto L_0x02ce
            r3 = 0
        L_0x006b:
            int r14 = r1.length
            if (r3 >= r14) goto L_0x0086
            r14 = r12[r3]
            if (r14 != r4) goto L_0x0075
            r14 = r2[r3]
            goto L_0x0076
        L_0x0075:
            r14 = 0
        L_0x0076:
            r9[r3] = r14
            r14 = r13[r3]
            if (r14 != r4) goto L_0x007f
            r15 = r1[r3]
            goto L_0x0080
        L_0x007f:
            r15 = 0
        L_0x0080:
            r6[r3] = r15
            int r3 = r3 + 1
            r15 = -1
            goto L_0x006b
        L_0x0086:
            azp[] r3 = r0.d
            r14 = r3[r4]
            boolean r3 = r14.k
            defpackage.bdl.b(r3)
            int r3 = r14.l
            r19 = r4
            r15 = 0
        L_0x0094:
            int r4 = r6.length
            r20 = r8
            r8 = 1
            if (r15 >= r4) goto L_0x00e3
            r4 = r9[r15]
            if (r4 == 0) goto L_0x00d6
            r4 = r6[r15]
            if (r4 == 0) goto L_0x00a6
            boolean r4 = r30[r15]
            if (r4 != 0) goto L_0x00d6
        L_0x00a6:
            int r4 = r14.l
            int r4 = r4 - r8
            r14.l = r4
            r4 = r9[r15]
            azo r4 = (defpackage.azo) r4
            int r8 = r4.c
            r21 = r5
            r5 = -1
            if (r8 == r5) goto L_0x00d0
            azp r8 = r4.b
            int r5 = r4.a
            r22 = r7
            int[] r7 = r8.q
            r5 = r7[r5]
            boolean[] r7 = r8.s
            boolean r7 = r7[r5]
            defpackage.bdl.b(r7)
            boolean[] r7 = r8.s
            r8 = 0
            r7[r5] = r8
            r5 = -1
            r4.c = r5
            goto L_0x00d2
        L_0x00d0:
            r22 = r7
        L_0x00d2:
            r4 = 0
            r9[r15] = r4
            goto L_0x00da
        L_0x00d6:
            r21 = r5
            r22 = r7
        L_0x00da:
            int r15 = r15 + 1
            r8 = r20
            r5 = r21
            r7 = r22
            goto L_0x0094
        L_0x00e3:
            r21 = r5
            r22 = r7
            if (r16 != 0) goto L_0x00f9
            boolean r4 = r14.v
            if (r4 == 0) goto L_0x00f0
            if (r3 != 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f0:
            long r3 = r14.t
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r3 = 0
            goto L_0x00fa
        L_0x00f9:
            r3 = 1
        L_0x00fa:
            azh r4 = r14.b
            bbu r4 = r4.f
            r23 = r3
            r15 = r4
            r3 = 0
        L_0x0102:
            int r5 = r6.length
            if (r3 >= r5) goto L_0x0168
            r5 = r9[r3]
            if (r5 != 0) goto L_0x0163
            r5 = r6[r3]
            if (r5 == 0) goto L_0x0163
            int r5 = r14.l
            int r5 = r5 + r8
            r14.l = r5
            r5 = r6[r3]
            ayo r7 = r14.p
            ayn r8 = r5.e()
            int r7 = r7.a(r8)
            int r8 = r14.r
            if (r7 != r8) goto L_0x0127
            azh r8 = r14.b
            r8.f = r5
            r15 = r5
        L_0x0127:
            azo r5 = new azo
            r5.<init>(r14, r7)
            r9[r3] = r5
            r5 = 1
            r32[r3] = r5
            int[] r5 = r14.q
            if (r5 == 0) goto L_0x013c
            r5 = r9[r3]
            azo r5 = (defpackage.azo) r5
            r5.c()
        L_0x013c:
            boolean r5 = r14.j
            if (r5 == 0) goto L_0x0163
            if (r23 != 0) goto L_0x0163
            ayj[] r5 = r14.h
            int[] r8 = r14.q
            r7 = r8[r7]
            r5 = r5[r7]
            r5.c()
            r8 = 1
            int r7 = r5.b(r10, r8, r8)
            r8 = -1
            if (r7 != r8) goto L_0x0160
            ayi r5 = r5.a
            int r5 = r5.b()
            if (r5 == 0) goto L_0x0160
            r23 = 1
            goto L_0x0164
        L_0x0160:
            r23 = 0
            goto L_0x0164
        L_0x0163:
            r8 = -1
        L_0x0164:
            int r3 = r3 + 1
            r8 = 1
            goto L_0x0102
        L_0x0168:
            r8 = -1
            int r3 = r14.l
            if (r3 != 0) goto L_0x01aa
            azh r3 = r14.b
            r4 = 0
            r3.d = r4
            r14.n = r4
            java.util.ArrayList<azl> r3 = r14.e
            r3.clear()
            com.google.android.exoplayer2.upstream.Loader r3 = r14.c
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0199
            boolean r3 = r14.j
            if (r3 == 0) goto L_0x0193
            ayj[] r3 = r14.h
            int r4 = r3.length
            r5 = 0
        L_0x0189:
            if (r5 >= r4) goto L_0x0193
            r7 = r3[r5]
            r7.d()
            int r5 = r5 + 1
            goto L_0x0189
        L_0x0193:
            com.google.android.exoplayer2.upstream.Loader r3 = r14.c
            r3.b()
            goto L_0x019c
        L_0x0199:
            r14.c()
        L_0x019c:
            r0 = r9
            r17 = r12
            r26 = r19
            r27 = r21
            r12 = 1
            r18 = -1
            r19 = r6
            goto L_0x0232
        L_0x01aa:
            java.util.ArrayList<azl> r3 = r14.e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0212
            boolean r3 = defpackage.ben.a(r15, r4)
            if (r3 != 0) goto L_0x0212
            boolean r3 = r14.v
            if (r3 != 0) goto L_0x01fd
            r3 = 0
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x01c3
            long r3 = -r10
        L_0x01c3:
            r17 = r3
            azl r7 = r14.g()
            azh r3 = r14.b
            r3.a(r7, r10)
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r15
            r26 = r19
            r27 = r21
            r4 = r33
            r19 = r6
            r2 = r7
            r6 = r17
            r0 = r9
            r17 = r12
            r12 = 1
            r18 = -1
            r8 = r24
            r3.a(r4, r6, r8)
            azh r3 = r14.b
            ayn r3 = r3.a
            aqv r2 = r2.g
            int r2 = r3.a(r2)
            int r3 = r15.h()
            if (r3 == r2) goto L_0x01fb
            goto L_0x0209
        L_0x01fb:
            r8 = 0
            goto L_0x020a
        L_0x01fd:
            r0 = r9
            r17 = r12
            r26 = r19
            r27 = r21
            r12 = 1
            r18 = -1
            r19 = r6
        L_0x0209:
            r8 = 1
        L_0x020a:
            if (r8 == 0) goto L_0x021e
            r14.u = r12
            r2 = 1
            r23 = 1
            goto L_0x0220
        L_0x0212:
            r0 = r9
            r17 = r12
            r26 = r19
            r27 = r21
            r12 = 1
            r18 = -1
            r19 = r6
        L_0x021e:
            r2 = r16
        L_0x0220:
            if (r23 == 0) goto L_0x0232
            r14.a(r10, r2)
            r2 = 0
        L_0x0226:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0232
            r3 = r0[r2]
            if (r3 == 0) goto L_0x022f
            r32[r2] = r12
        L_0x022f:
            int r2 = r2 + 1
            goto L_0x0226
        L_0x0232:
            java.util.ArrayList<azo> r2 = r14.g
            r2.clear()
            int r2 = r0.length
            r3 = 0
        L_0x0239:
            if (r3 >= r2) goto L_0x0249
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0246
            java.util.ArrayList<azo> r5 = r14.g
            azo r4 = (defpackage.azo) r4
            r5.add(r4)
        L_0x0246:
            int r3 = r3 + 1
            goto L_0x0239
        L_0x0249:
            r14.v = r12
            r2 = 0
            r3 = 0
        L_0x024d:
            int r4 = r1.length
            if (r2 >= r4) goto L_0x028b
            r4 = r13[r2]
            r5 = r26
            if (r4 != r5) goto L_0x0274
            r3 = r0[r2]
            if (r3 == 0) goto L_0x025c
            r3 = 1
            goto L_0x025d
        L_0x025c:
            r3 = 0
        L_0x025d:
            defpackage.bdl.b(r3)
            r3 = r0[r2]
            r20[r2] = r3
            r4 = r0
            r0 = r28
            java.util.IdentityHashMap<ayk, java.lang.Integer> r3 = r0.j
            r6 = r4[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.put(r6, r7)
            r3 = 1
            goto L_0x0285
        L_0x0274:
            r4 = r0
            r0 = r28
            r6 = r17[r2]
            if (r6 != r5) goto L_0x0285
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0281
            r6 = 1
            goto L_0x0282
        L_0x0281:
            r6 = 0
        L_0x0282:
            defpackage.bdl.b(r6)
        L_0x0285:
            int r2 = r2 + 1
            r0 = r4
            r26 = r5
            goto L_0x024d
        L_0x028b:
            r4 = r0
            r5 = r26
            r0 = r28
            r2 = r27
            if (r3 == 0) goto L_0x02ba
            r22[r2] = r14
            int r3 = r2 + 1
            if (r2 != 0) goto L_0x02b5
            r14.a(r12)
            if (r23 != 0) goto L_0x02aa
            azp[] r2 = r0.p
            int r6 = r2.length
            if (r6 == 0) goto L_0x02aa
            r6 = 0
            r2 = r2[r6]
            if (r14 == r2) goto L_0x02bc
            goto L_0x02ab
        L_0x02aa:
            r6 = 0
        L_0x02ab:
            azq r2 = r0.k
            android.util.SparseArray<bek> r2 = r2.a
            r2.clear()
            r16 = 1
            goto L_0x02bc
        L_0x02b5:
            r6 = 0
            r14.a(r6)
            goto L_0x02bc
        L_0x02ba:
            r6 = 0
            r3 = r2
        L_0x02bc:
            int r2 = r5 + 1
            r5 = r3
            r9 = r4
            r12 = r17
            r6 = r19
            r8 = r20
            r7 = r22
            r15 = -1
            r4 = r2
            r2 = r31
            goto L_0x0065
        L_0x02ce:
            r2 = r5
            r22 = r7
            r3 = r8
            r6 = 0
            int r1 = r3.length
            r4 = r31
            r5 = r22
            java.lang.System.arraycopy(r3, r6, r4, r6, r1)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r2)
            azp[] r1 = (defpackage.azp[]) r1
            r0.p = r1
            axz r1 = r0.l
            azp[] r2 = r0.p
            ayl r1 = r1.a(r2)
            r0.q = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azm.a(bbu[], boolean[], ayk[], boolean[], long):long");
    }

    public final void a(long j2) {
        this.q.a(j2);
    }

    public final void a(long j2, boolean z) {
        azp[] azpArr;
        for (azp azp : this.p) {
            if (azp.j && !azp.i()) {
                int length = azp.h.length;
                for (int i2 = 0; i2 < length; i2++) {
                    azp.h[i2].a(j2, z, azp.s[i2]);
                }
            }
        }
    }

    public final void a(a aVar, long j2) {
        int i2;
        ArrayList arrayList;
        List<a> list;
        int i3;
        int i4;
        this.c = aVar;
        this.a.a((b) this);
        azu b2 = this.a.b();
        List<a> list2 = b2.c;
        List<a> list3 = b2.d;
        int size = list2.size() + 1 + list3.size();
        this.d = new azp[size];
        this.n = size;
        ArrayList arrayList2 = new ArrayList(b2.b);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i5 = 0;
        while (true) {
            i2 = 2;
            if (i5 >= arrayList2.size()) {
                break;
            }
            a aVar2 = (a) arrayList2.get(i5);
            aqv aqv = aVar2.b;
            if (aqv.l > 0 || ben.a(aqv.d, 2) != null) {
                arrayList3.add(aVar2);
            } else if (ben.a(aqv.d, 1) != null) {
                arrayList4.add(aVar2);
            }
            i5++;
        }
        if (!arrayList3.isEmpty()) {
            arrayList = arrayList3;
        } else {
            if (arrayList4.size() < arrayList2.size()) {
                arrayList2.removeAll(arrayList4);
            }
            arrayList = arrayList2;
        }
        bdl.a(!arrayList.isEmpty());
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        String str = aVarArr[0].b.d;
        azp a2 = a(0, aVarArr, b2.e, b2.f, j2);
        this.d[0] = a2;
        if (!this.m || str == null) {
            list = list3;
            i3 = 1;
            a2.a(true);
            a2.b();
        } else {
            boolean z = ben.a(str, 2) != null;
            boolean z2 = ben.a(str, 1) != null;
            ArrayList arrayList5 = new ArrayList();
            if (z) {
                aqv[] aqvArr = new aqv[arrayList.size()];
                int i6 = 0;
                while (i6 < aqvArr.length) {
                    aqv aqv2 = aVarArr[i6].b;
                    String a3 = ben.a(aqv2.d, i2);
                    List<a> list4 = list3;
                    aqvArr[i6] = aqv.a(aqv2.a, aqv2.b, aqv2.e, bdx.f(a3), a3, aqv2.c, aqv2.k, aqv2.l, aqv2.m, null, aqv2.v);
                    i6++;
                    i2 = 2;
                    list3 = list4;
                }
                list = list3;
                arrayList5.add(new ayn(aqvArr));
                if (z2 && (b2.e != null || b2.c.isEmpty())) {
                    arrayList5.add(new ayn(a(aVarArr[0].b, b2.e, false)));
                }
                List<aqv> list5 = b2.f;
                if (list5 != null) {
                    for (int i7 = 0; i7 < list5.size(); i7++) {
                        arrayList5.add(new ayn((aqv) list5.get(i7)));
                    }
                }
                i4 = 1;
            } else {
                list = list3;
                if (z2) {
                    aqv[] aqvArr2 = new aqv[arrayList.size()];
                    for (int i8 = 0; i8 < aqvArr2.length; i8++) {
                        aqvArr2[i8] = a(aVarArr[i8].b, b2.e, true);
                    }
                    i4 = 1;
                    arrayList5.add(new ayn(aqvArr2));
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected codecs attribute: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            aqv[] aqvArr3 = new aqv[i4];
            aqvArr3[0] = aqv.a("ID3", "application/id3", (String) null, -1, (ast) null);
            ayn ayn = new ayn(aqvArr3);
            arrayList5.add(ayn);
            a2.a(new ayo((ayn[]) arrayList5.toArray(new ayn[0])), 0, new ayo(ayn));
            i3 = 1;
        }
        int i9 = 0;
        int i10 = 1;
        while (i9 < list2.size()) {
            a aVar3 = (a) list2.get(i9);
            a[] aVarArr2 = new a[i3];
            aVarArr2[0] = aVar3;
            azp a4 = a(1, aVarArr2, (aqv) null, Collections.emptyList(), j2);
            int i11 = i10 + 1;
            this.d[i10] = a4;
            aqv aqv3 = aVar3.b;
            if (!this.m || aqv3.d == null) {
                a4.b();
            } else {
                a4.a(new ayo(new ayn(aVar3.b)), 0, ayo.a);
            }
            i9++;
            i10 = i11;
            i3 = 1;
        }
        int i12 = 0;
        while (i12 < list.size()) {
            a aVar4 = (a) list.get(i12);
            azp a5 = a(3, new a[]{aVar4}, (aqv) null, Collections.emptyList(), j2);
            int i13 = i10 + 1;
            this.d[i10] = a5;
            a5.a(new ayo(new ayn(aVar4.b)), 0, ayo.a);
            i12++;
            i10 = i13;
        }
        this.p = this.d;
    }

    public final /* bridge */ /* synthetic */ void a(ayl ayl) {
        this.c.a(this);
    }

    public final void a(a aVar) {
        this.a.d(aVar);
    }

    public final boolean a(a aVar, long j2) {
        boolean z;
        boolean z2 = true;
        for (azp azp : this.d) {
            azh azh = azp.b;
            int a2 = azh.a.a(aVar.b);
            if (a2 != -1) {
                int c2 = azh.f.c(a2);
                if (c2 != -1) {
                    azh.g |= azh.e == aVar;
                    if (j2 != -9223372036854775807L && !azh.f.a(c2, j2)) {
                        z = false;
                        z2 &= z;
                    }
                }
            }
            z = true;
            z2 &= z;
        }
        this.c.a(this);
        return z2;
    }

    public final long b(long j2) {
        azp[] azpArr = this.p;
        if (azpArr.length > 0) {
            boolean a2 = azpArr[0].a(j2, false);
            int i2 = 1;
            while (true) {
                azp[] azpArr2 = this.p;
                if (i2 >= azpArr2.length) {
                    break;
                }
                azpArr2[i2].a(j2, a2);
                i2++;
            }
            if (a2) {
                this.k.a.clear();
            }
        }
        return j2;
    }

    public final ayo b() {
        return this.o;
    }

    public final long c() {
        if (!this.r) {
            this.b.c();
            this.r = true;
        }
        return -9223372036854775807L;
    }

    public final boolean c(long j2) {
        if (this.o != null) {
            return this.q.c(j2);
        }
        for (azp b2 : this.d) {
            b2.b();
        }
        return false;
    }

    public final long d() {
        return this.q.d();
    }

    public final long e() {
        return this.q.e();
    }

    public final void f() {
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 <= 0) {
            int i3 = 0;
            for (azp azp : this.d) {
                i3 += azp.p.b;
            }
            ayn[] aynArr = new ayn[i3];
            azp[] azpArr = this.d;
            int length = azpArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                azp azp2 = azpArr[i4];
                int i6 = azp2.p.b;
                int i7 = i5;
                int i8 = 0;
                while (i8 < i6) {
                    int i9 = i7 + 1;
                    aynArr[i7] = azp2.p.c[i8];
                    i8++;
                    i7 = i9;
                }
                i4++;
                i5 = i7;
            }
            this.o = new ayo(aynArr);
            this.c.a(this);
        }
    }

    public final void g() {
        this.c.a(this);
    }

    public final void m_() {
        for (azp azp : this.d) {
            azp.b.a();
        }
    }
}
