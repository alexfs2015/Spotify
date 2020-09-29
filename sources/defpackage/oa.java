package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: oa reason: default package */
public final class oa {
    private static final Comparator<e> a = new Comparator<e>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            int i = eVar.a - eVar2.a;
            return i == 0 ? eVar.b - eVar2.b : i;
        }
    };

    /* renamed from: oa$a */
    public static abstract class a {
        public abstract int a();

        public abstract boolean a(int i, int i2);

        public abstract int b();

        public abstract boolean b(int i, int i2);
    }

    /* renamed from: oa$b */
    public static class b {
        private final List<e> a;
        private final int[] b;
        private final int[] c;
        private final a d;
        private final int e;
        private final int f;
        private final boolean g;

        b(a aVar, List<e> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(this.b, 0);
            Arrays.fill(this.c, 0);
            this.d = aVar;
            this.e = aVar.a();
            this.f = aVar.b();
            this.g = z;
            e eVar = this.a.isEmpty() ? null : (e) this.a.get(0);
            if (!(eVar != null && eVar.a == 0 && eVar.b == 0)) {
                e eVar2 = new e();
                eVar2.a = 0;
                eVar2.b = 0;
                eVar2.d = false;
                eVar2.c = 0;
                eVar2.e = false;
                this.a.add(0, eVar2);
            }
            a();
        }

        private static c a(List<c> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                c cVar = (c) list.get(size);
                if (cVar.a == i && cVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        c cVar2 = (c) list.get(size);
                        cVar2.b += z ? 1 : -1;
                        size++;
                    }
                    return cVar;
                }
                size--;
            }
            return null;
        }

        private void a() {
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e eVar = (e) this.a.get(size);
                int i3 = eVar.a + eVar.c;
                int i4 = eVar.b + eVar.c;
                if (this.g) {
                    while (i > i3) {
                        if (this.b[i - 1] == 0) {
                            a(i, i2, size, false);
                        }
                        i--;
                    }
                    while (i2 > i4) {
                        if (this.c[i2 - 1] == 0) {
                            a(i, i2, size, true);
                        }
                        i2--;
                    }
                }
                for (int i5 = 0; i5 < eVar.c; i5++) {
                    int i6 = eVar.a + i5;
                    int i7 = eVar.b + i5;
                    int i8 = this.d.b(i6, i7) ? 1 : 2;
                    this.b[i6] = (i7 << 5) | i8;
                    this.c[i7] = (i6 << 5) | i8;
                }
                i = eVar.a;
                i2 = eVar.b;
            }
        }

        private void a(List<c> list, ok okVar, int i, int i2, int i3) {
            if (!this.g) {
                okVar.a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.c[i5] & 31;
                if (i6 == 0) {
                    okVar.a(i, 1);
                    for (c cVar : list) {
                        cVar.b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    okVar.c(a(list, this.c[i5] >> 5, true).b, i);
                    if (i6 == 4) {
                        okVar.a(i, 1, null);
                    }
                } else if (i6 == 16) {
                    list.add(new c(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        private boolean a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                e eVar = (e) this.a.get(i3);
                int i6 = eVar.a + eVar.c;
                int i7 = eVar.b + eVar.c;
                int i8 = 8;
                if (z) {
                    for (int i9 = i5 - 1; i9 >= i6; i9--) {
                        if (this.d.a(i9, i4)) {
                            if (!this.d.b(i9, i4)) {
                                i8 = 4;
                            }
                            this.c[i4] = (i9 << 5) | 16;
                            this.b[i9] = (i4 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i7; i10--) {
                        if (this.d.a(i4, i10)) {
                            if (!this.d.b(i4, i10)) {
                                i8 = 4;
                            }
                            int i11 = i - 1;
                            this.b[i11] = (i10 << 5) | 16;
                            this.c[i10] = (i11 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = eVar.a;
                i2 = eVar.b;
                i3--;
            }
            return false;
        }

        private void b(List<c> list, ok okVar, int i, int i2, int i3) {
            if (!this.g) {
                okVar.b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.b[i5] & 31;
                if (i6 == 0) {
                    okVar.b(i + i4, 1);
                    for (c cVar : list) {
                        cVar.b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    c a2 = a(list, this.b[i5] >> 5, false);
                    okVar.c(i + i4, a2.b - 1);
                    if (i6 == 4) {
                        okVar.a(a2.b - 1, 1, null);
                    }
                } else if (i6 == 16) {
                    list.add(new c(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        public final void a(androidx.recyclerview.widget.RecyclerView.a aVar) {
            a((ok) new nw(aVar));
        }

        public final void a(ok okVar) {
            nx nxVar = okVar instanceof nx ? (nx) okVar : new nx(okVar);
            ArrayList arrayList = new ArrayList();
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e eVar = (e) this.a.get(size);
                int i3 = eVar.c;
                int i4 = eVar.a + i3;
                int i5 = eVar.b + i3;
                if (i4 < i) {
                    b(arrayList, nxVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    a(arrayList, nxVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.b[eVar.a + i6] & 31) == 2) {
                        nxVar.a(eVar.a + i6, 1, null);
                    }
                }
                i = eVar.a;
                i2 = eVar.b;
            }
            nxVar.a();
        }
    }

    /* renamed from: oa$c */
    static class c {
        int a;
        int b;
        boolean c;

        public c(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* renamed from: oa$d */
    static class d {
        int a;
        int b;
        int c;
        int d;

        public d() {
        }

        public d(int i, int i2, int i3, int i4) {
            this.a = 0;
            this.b = i2;
            this.c = 0;
            this.d = i4;
        }
    }

    /* renamed from: oa$e */
    static class e {
        int a;
        int b;
        int c;
        boolean d;
        boolean e;

        e() {
        }
    }

    public static b a(a aVar) {
        return a(aVar, true);
    }

    public static b a(a aVar, boolean z) {
        int a2 = aVar.a();
        int b2 = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new d(0, a2, 0, b2));
        int abs = Math.abs(a2 - b2) + a2 + b2;
        int i = abs << 1;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            d dVar = (d) arrayList2.remove(arrayList2.size() - 1);
            e a3 = a(aVar, dVar.a, dVar.b, dVar.c, dVar.d, iArr, iArr2, abs);
            if (a3 != null) {
                if (a3.c > 0) {
                    arrayList.add(a3);
                }
                a3.a += dVar.a;
                a3.b += dVar.c;
                d dVar2 = arrayList3.isEmpty() ? new d() : (d) arrayList3.remove(arrayList3.size() - 1);
                dVar2.a = dVar.a;
                dVar2.c = dVar.c;
                if (a3.e) {
                    dVar2.b = a3.a;
                    dVar2.d = a3.b;
                } else if (a3.d) {
                    dVar2.b = a3.a - 1;
                    dVar2.d = a3.b;
                } else {
                    dVar2.b = a3.a;
                    dVar2.d = a3.b - 1;
                }
                arrayList2.add(dVar2);
                if (!a3.e) {
                    dVar.a = a3.a + a3.c;
                    dVar.c = a3.b + a3.c;
                } else if (a3.d) {
                    dVar.a = a3.a + a3.c + 1;
                    dVar.c = a3.b + a3.c;
                } else {
                    dVar.a = a3.a + a3.c;
                    dVar.c = a3.b + a3.c + 1;
                }
                arrayList2.add(dVar);
            } else {
                arrayList3.add(dVar);
            }
        }
        Collections.sort(arrayList, a);
        b bVar = new b(aVar, arrayList, iArr, iArr2, z);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r7]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.oa.e a(defpackage.oa.a r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            if (r3 <= 0) goto L_0x0133
            if (r4 > 0) goto L_0x0010
            goto L_0x0133
        L_0x0010:
            int r5 = r3 - r4
            int r6 = r3 + r4
            r7 = 1
            int r6 = r6 + r7
            int r6 = r6 / 2
            int r8 = r26 - r6
            int r8 = r8 - r7
            int r9 = r26 + r6
            int r9 = r9 + r7
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r5
            int r9 = r9 + r5
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r5 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r6) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r7
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r7
            r13 = r1[r13]
            int r13 = r13 + r7
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r7
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r7 = r22 + r15
            boolean r7 = r0.a(r10, r7)
            if (r7 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r7 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r7 = r26 + r12
            r1[r7] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r5 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r5 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r7]
            r13 = r2[r7]
            if (r10 < r13) goto L_0x009c
            oa$e r0 = new oa$e
            r0.<init>()
            r3 = r2[r7]
            r0.a = r3
            int r3 = r0.a
            int r3 = r3 - r12
            r0.b = r3
            r1 = r1[r7]
            r2 = r2[r7]
            int r1 = r1 - r2
            r0.c = r1
            r0.d = r14
            r7 = 0
            r0.e = r7
            return r0
        L_0x009c:
            r7 = 0
            int r12 = r12 + 2
            r7 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a2:
            r7 = 0
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r5
            int r13 = r9 + r5
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r5
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = 1
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = 0
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r7 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r7 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r7 = r1[r3]
            r13 = r2[r3]
            if (r7 < r13) goto L_0x0119
            oa$e r0 = new oa$e
            r0.<init>()
            r4 = r2[r3]
            r0.a = r4
            int r4 = r0.a
            int r4 = r4 - r12
            r0.b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.c = r1
            r0.d = r14
            r3 = 1
            r0.e = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r7 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r7 = 1
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.a(oa$a, int, int, int, int, int[], int[], int):oa$e");
    }
}
