package defpackage;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ks reason: default package */
final class ks {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    private static final ku b = (VERSION.SDK_INT >= 21 ? new kt() : null);
    private static final ku c = b();

    /* renamed from: ks$a */
    static class a {
        public Fragment a;
        public boolean b;
        public kc c;
        public Fragment d;
        public boolean e;
        public kc f;

        a() {
        }
    }

    static View a(dp<String, View> dpVar, a aVar, Object obj, boolean z) {
        kc kcVar = aVar.c;
        if (obj == null || dpVar == null || kcVar.p == null || kcVar.p.isEmpty()) {
            return null;
        }
        return (View) dpVar.get(z ? (String) kcVar.p.get(0) : (String) kcVar.q.get(0));
    }

    private static dp<String, String> a(int i, ArrayList<kc> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        dp<String, String> dpVar = new dp<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            kc kcVar = (kc) arrayList.get(i4);
            if (kcVar.b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (kcVar.p != null) {
                    int size = kcVar.p.size();
                    if (booleanValue) {
                        arrayList3 = kcVar.p;
                        arrayList4 = kcVar.q;
                    } else {
                        ArrayList arrayList5 = kcVar.p;
                        arrayList3 = kcVar.q;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) dpVar.remove(str2);
                        if (str3 != null) {
                            dpVar.put(str, str3);
                        } else {
                            dpVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return dpVar;
    }

    static dp<String, View> a(ku kuVar, dp<String, String> dpVar, Object obj, a aVar) {
        fp fpVar;
        ArrayList arrayList;
        Fragment fragment = aVar.a;
        View view = fragment.H;
        if (dpVar.isEmpty() || obj == null || view == null) {
            dpVar.clear();
            return null;
        }
        dp<String, View> dpVar2 = new dp<>();
        kuVar.a((Map<String, View>) dpVar2, view);
        kc kcVar = aVar.c;
        if (aVar.b) {
            fpVar = fragment.Y();
            arrayList = kcVar.p;
        } else {
            fpVar = fragment.X();
            arrayList = kcVar.q;
        }
        if (arrayList != null) {
            du.a((Map<K, V>) dpVar2, (Collection<?>) arrayList);
            du.a((Map<K, V>) dpVar2, dpVar.values());
        }
        if (fpVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) dpVar2.get(str);
                if (view2 == null) {
                    String a2 = a(dpVar, str);
                    if (a2 != null) {
                        dpVar.remove(a2);
                    }
                } else if (!str.equals(ip.q(view2))) {
                    String a3 = a(dpVar, str);
                    if (a3 != null) {
                        dpVar.put(a3, ip.q(view2));
                    }
                }
            }
        } else {
            a(dpVar, dpVar2);
        }
        return dpVar2;
    }

    private static Object a(ku kuVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return kuVar.c(kuVar.b(z ? fragment2.H() : fragment.G()));
    }

    private static Object a(ku kuVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return kuVar.b(z ? fragment.F() : fragment.C());
    }

    private static Object a(ku kuVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return kuVar.a(obj2, obj, obj3);
    }

    private static String a(dp<String, String> dpVar, String str) {
        int size = dpVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(dpVar.c(i))) {
                return (String) dpVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(ku kuVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.H;
        if (view2 != null) {
            kuVar.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        kuVar.a(obj, arrayList2);
        return arrayList2;
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    private static ku a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object E = fragment.E();
            if (E != null) {
                arrayList.add(E);
            }
            Object D = fragment.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object H = fragment.H();
            if (H != null) {
                arrayList.add(H);
            }
        }
        if (fragment2 != null) {
            Object C = fragment2.C();
            if (C != null) {
                arrayList.add(C);
            }
            Object F = fragment2.F();
            if (F != null) {
                arrayList.add(F);
            }
            Object G = fragment2.G();
            if (G != null) {
                arrayList.add(G);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ku kuVar = b;
        if (kuVar != null && a(kuVar, (List<Object>) arrayList)) {
            return b;
        }
        ku kuVar2 = c;
        if (kuVar2 != null && a(kuVar2, (List<Object>) arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, dp<String, View> dpVar, boolean z2) {
        if ((z ? fragment2.X() : fragment.X()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = dpVar == null ? 0 : dpVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(dpVar.b(i));
                arrayList.add(dpVar.c(i));
            }
        }
    }

    private static void a(dp<String, String> dpVar, dp<String, View> dpVar2) {
        for (int size = dpVar.size() - 1; size >= 0; size--) {
            if (!dpVar2.containsKey((String) dpVar.c(size))) {
                dpVar.d(size);
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static void a(ArrayList<View> arrayList, dp<String, View> dpVar, Collection<String> collection) {
        for (int size = dpVar.size() - 1; size >= 0; size--) {
            View view = (View) dpVar.c(size);
            if (collection.contains(ip.q(view))) {
                arrayList.add(view);
            }
        }
    }

    private static void a(kc kcVar, SparseArray<a> sparseArray, boolean z) {
        int size = kcVar.c.size();
        for (int i = 0; i < size; i++) {
            a(kcVar, (a) kcVar.c.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r6.m != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0070, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008c, code lost:
        if (r6.A == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008e, code lost:
        r12 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.kc r11, defpackage.kr.a r12, android.util.SparseArray<defpackage.ks.a> r13, boolean r14, boolean r15) {
        /*
            androidx.fragment.app.Fragment r6 = r12.b
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            int r7 = r6.y
            if (r7 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r14 == 0) goto L_0x0013
            int[] r0 = a
            int r12 = r12.a
            r12 = r0[r12]
            goto L_0x0015
        L_0x0013:
            int r12 = r12.a
        L_0x0015:
            r0 = 0
            r1 = 1
            if (r12 == r1) goto L_0x0081
            r2 = 3
            if (r12 == r2) goto L_0x0057
            r2 = 4
            if (r12 == r2) goto L_0x003f
            r2 = 5
            if (r12 == r2) goto L_0x002d
            r2 = 6
            if (r12 == r2) goto L_0x0057
            r2 = 7
            if (r12 == r2) goto L_0x0081
            r12 = 0
            r1 = 0
        L_0x002a:
            r8 = 0
            goto L_0x0094
        L_0x002d:
            if (r15 == 0) goto L_0x003c
            boolean r12 = r6.M
            if (r12 == 0) goto L_0x0090
            boolean r12 = r6.A
            if (r12 != 0) goto L_0x0090
            boolean r12 = r6.m
            if (r12 == 0) goto L_0x0090
            goto L_0x008e
        L_0x003c:
            boolean r12 = r6.A
            goto L_0x0091
        L_0x003f:
            if (r15 == 0) goto L_0x004e
            boolean r12 = r6.M
            if (r12 == 0) goto L_0x0072
            boolean r12 = r6.m
            if (r12 == 0) goto L_0x0072
            boolean r12 = r6.A
            if (r12 == 0) goto L_0x0072
        L_0x004d:
            goto L_0x0070
        L_0x004e:
            boolean r12 = r6.m
            if (r12 == 0) goto L_0x0072
            boolean r12 = r6.A
            if (r12 != 0) goto L_0x0072
            goto L_0x004d
        L_0x0057:
            if (r15 == 0) goto L_0x0074
            boolean r12 = r6.m
            if (r12 != 0) goto L_0x0072
            android.view.View r12 = r6.H
            if (r12 == 0) goto L_0x0072
            android.view.View r12 = r6.H
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x0072
            float r12 = r6.N
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x0072
        L_0x0070:
            r12 = 1
            goto L_0x007d
        L_0x0072:
            r12 = 0
            goto L_0x007d
        L_0x0074:
            boolean r12 = r6.m
            if (r12 == 0) goto L_0x0072
            boolean r12 = r6.A
            if (r12 != 0) goto L_0x0072
            goto L_0x0070
        L_0x007d:
            r8 = r12
            r12 = 1
            r1 = 0
            goto L_0x0094
        L_0x0081:
            if (r15 == 0) goto L_0x0086
            boolean r12 = r6.L
            goto L_0x0091
        L_0x0086:
            boolean r12 = r6.m
            if (r12 != 0) goto L_0x0090
            boolean r12 = r6.A
            if (r12 != 0) goto L_0x0090
        L_0x008e:
            r12 = 1
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            r0 = r12
            r12 = 0
            goto L_0x002a
        L_0x0094:
            java.lang.Object r2 = r13.get(r7)
            ks$a r2 = (defpackage.ks.a) r2
            if (r0 == 0) goto L_0x00a6
            ks$a r2 = a(r2, r13, r7)
            r2.a = r6
            r2.b = r14
            r2.c = r11
        L_0x00a6:
            r9 = r2
            r10 = 0
            if (r15 != 0) goto L_0x00cd
            if (r1 == 0) goto L_0x00cd
            if (r9 == 0) goto L_0x00b4
            androidx.fragment.app.Fragment r0 = r9.d
            if (r0 != r6) goto L_0x00b4
            r9.d = r10
        L_0x00b4:
            kl r0 = r11.a
            int r1 = r6.b_
            if (r1 > 0) goto L_0x00cd
            int r1 = r0.i
            if (r1 <= 0) goto L_0x00cd
            boolean r1 = r11.r
            if (r1 != 0) goto L_0x00cd
            r0.g(r6)
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            r0.a(r1, r2, r3, r4, r5)
        L_0x00cd:
            if (r8 == 0) goto L_0x00df
            if (r9 == 0) goto L_0x00d5
            androidx.fragment.app.Fragment r0 = r9.d
            if (r0 != 0) goto L_0x00df
        L_0x00d5:
            ks$a r9 = a(r9, r13, r7)
            r9.d = r6
            r9.e = r14
            r9.f = r11
        L_0x00df:
            if (r15 != 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00eb
            if (r9 == 0) goto L_0x00eb
            androidx.fragment.app.Fragment r11 = r9.a
            if (r11 != r6) goto L_0x00eb
            r9.a = r10
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks.a(kc, kr$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(defpackage.kl r36, java.util.ArrayList<defpackage.kc> r37, java.util.ArrayList<java.lang.Boolean> r38, int r39, int r40, boolean r41) {
        /*
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r40
            r4 = r41
            int r5 = r0.i
            if (r5 > 0) goto L_0x000f
            return
        L_0x000f:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r6 = r39
        L_0x0016:
            if (r6 >= r3) goto L_0x0034
            java.lang.Object r7 = r1.get(r6)
            kc r7 = (defpackage.kc) r7
            java.lang.Object r8 = r2.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x002e
            b(r7, r5, r4)
            goto L_0x0031
        L_0x002e:
            a(r7, r5, r4)
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0034:
            int r6 = r5.size()
            if (r6 == 0) goto L_0x035c
            android.view.View r6 = new android.view.View
            kj r7 = r0.j
            android.content.Context r7 = r7.b
            r6.<init>(r7)
            int r15 = r5.size()
            r13 = 0
        L_0x0048:
            if (r13 >= r15) goto L_0x035c
            int r7 = r5.keyAt(r13)
            r12 = r39
            dp r11 = a(r7, r1, r2, r12, r3)
            java.lang.Object r8 = r5.valueAt(r13)
            r10 = r8
            ks$a r10 = (defpackage.ks.a) r10
            r20 = 0
            if (r4 == 0) goto L_0x01d9
            kg r9 = r0.k
            boolean r9 = r9.e_()
            if (r9 == 0) goto L_0x0070
            kg r9 = r0.k
            android.view.View r7 = r9.a(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0072
        L_0x0070:
            r7 = r20
        L_0x0072:
            if (r7 == 0) goto L_0x01d0
            androidx.fragment.app.Fragment r9 = r10.a
            androidx.fragment.app.Fragment r8 = r10.d
            ku r14 = a(r8, r9)
            if (r14 == 0) goto L_0x01d0
            boolean r1 = r10.b
            boolean r2 = r10.e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r30 = r5
            java.lang.Object r5 = a(r14, r9, r1)
            java.lang.Object r2 = b(r14, r8, r2)
            androidx.fragment.app.Fragment r12 = r10.a
            r31 = r13
            androidx.fragment.app.Fragment r13 = r10.d
            r32 = r15
            if (r12 == 0) goto L_0x00a8
            android.view.View r15 = r12.y()
            r0 = 0
            r15.setVisibility(r0)
        L_0x00a8:
            if (r12 == 0) goto L_0x014c
            if (r13 != 0) goto L_0x00ae
            goto L_0x014c
        L_0x00ae:
            boolean r0 = r10.b
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x00bb
            r17 = r1
            r15 = r20
            goto L_0x00c1
        L_0x00bb:
            java.lang.Object r15 = a(r14, r12, r13, r0)
            r17 = r1
        L_0x00c1:
            dp r1 = b(r14, r11, r15, r10)
            r18 = r9
            dp r9 = a(r14, r11, r15, r10)
            boolean r19 = r11.isEmpty()
            if (r19 == 0) goto L_0x00de
            if (r1 == 0) goto L_0x00d6
            r1.clear()
        L_0x00d6:
            if (r9 == 0) goto L_0x00db
            r9.clear()
        L_0x00db:
            r15 = r20
            goto L_0x00f0
        L_0x00de:
            r19 = r15
            java.util.Set r15 = r11.keySet()
            a(r4, r1, r15)
            java.util.Collection r15 = r11.values()
            a(r3, r9, r15)
            r15 = r19
        L_0x00f0:
            if (r5 != 0) goto L_0x00fb
            if (r2 != 0) goto L_0x00fb
            if (r15 != 0) goto L_0x00fb
            r34 = r3
        L_0x00f8:
            r33 = r11
            goto L_0x0153
        L_0x00fb:
            r33 = r11
            r11 = 1
            a(r12, r13, r0, r1, r11)
            if (r15 == 0) goto L_0x0131
            r3.add(r6)
            r14.a(r15, r6, r4)
            boolean r11 = r10.e
            r34 = r3
            kc r3 = r10.f
            r21 = r14
            r22 = r15
            r23 = r2
            r24 = r1
            r25 = r11
            r26 = r3
            a(r21, r22, r23, r24, r25, r26)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r20 = a(r9, r10, r5, r0)
            if (r20 == 0) goto L_0x012c
            r14.a(r5, r1)
        L_0x012c:
            r28 = r1
            r26 = r20
            goto L_0x0137
        L_0x0131:
            r34 = r3
            r26 = r20
            r28 = r26
        L_0x0137:
            ks$3 r1 = new ks$3
            r21 = r1
            r22 = r12
            r23 = r13
            r24 = r0
            r25 = r9
            r27 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            defpackage.im.a(r7, r1)
            goto L_0x0155
        L_0x014c:
            r17 = r1
            r34 = r3
            r18 = r9
            goto L_0x00f8
        L_0x0153:
            r15 = r20
        L_0x0155:
            if (r5 != 0) goto L_0x015b
            if (r15 != 0) goto L_0x015b
            if (r2 == 0) goto L_0x01d6
        L_0x015b:
            java.util.ArrayList r0 = a(r14, r2, r8, r4, r6)
            r1 = r18
            r3 = r34
            java.util.ArrayList r9 = a(r14, r5, r1, r3, r6)
            r10 = 4
            a(r9, r10)
            r21 = r14
            r22 = r5
            r23 = r2
            r24 = r15
            r25 = r1
            r26 = r17
            java.lang.Object r1 = a(r21, r22, r23, r24, r25, r26)
            if (r1 == 0) goto L_0x01d6
            if (r8 == 0) goto L_0x01a0
            if (r2 == 0) goto L_0x01a0
            boolean r10 = r8.m
            if (r10 == 0) goto L_0x01a0
            boolean r10 = r8.A
            if (r10 == 0) goto L_0x01a0
            boolean r10 = r8.M
            if (r10 == 0) goto L_0x01a0
            r10 = 1
            r8.h(r10)
            android.view.View r10 = r8.H
            r14.b(r2, r10, r0)
            android.view.ViewGroup r8 = r8.G
            ks$1 r10 = new ks$1
            r10.<init>(r0)
            defpackage.im.a(r8, r10)
        L_0x01a0:
            java.util.ArrayList r20 = defpackage.ku.a(r3)
            r21 = r14
            r22 = r1
            r23 = r5
            r24 = r9
            r25 = r2
            r26 = r0
            r27 = r15
            r28 = r3
            r21.a(r22, r23, r24, r25, r26, r27, r28)
            r14.a(r7, r1)
            r16 = r14
            r17 = r7
            r18 = r4
            r19 = r3
            r21 = r33
            r16.a(r17, r18, r19, r20, r21)
            r0 = 0
            a(r9, r0)
            r14.a(r15, r4, r3)
            goto L_0x0348
        L_0x01d0:
            r30 = r5
            r31 = r13
            r32 = r15
        L_0x01d6:
            r0 = 0
            goto L_0x0348
        L_0x01d9:
            r1 = r0
            r30 = r5
            r33 = r11
            r31 = r13
            r32 = r15
            r0 = 0
            kg r2 = r1.k
            boolean r2 = r2.e_()
            if (r2 == 0) goto L_0x01f4
            kg r2 = r1.k
            android.view.View r2 = r2.a(r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x01f6
        L_0x01f4:
            r2 = r20
        L_0x01f6:
            if (r2 == 0) goto L_0x0348
            androidx.fragment.app.Fragment r3 = r10.a
            androidx.fragment.app.Fragment r4 = r10.d
            ku r5 = a(r4, r3)
            if (r5 == 0) goto L_0x0348
            boolean r7 = r10.b
            boolean r8 = r10.e
            java.lang.Object r15 = a(r5, r3, r7)
            java.lang.Object r14 = b(r5, r4, r8)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            androidx.fragment.app.Fragment r11 = r10.a
            androidx.fragment.app.Fragment r9 = r10.d
            if (r11 == 0) goto L_0x02c7
            if (r9 != 0) goto L_0x0222
            goto L_0x02c7
        L_0x0222:
            boolean r8 = r10.b
            boolean r7 = r33.isEmpty()
            if (r7 == 0) goto L_0x022d
            r0 = r20
            goto L_0x0232
        L_0x022d:
            java.lang.Object r7 = a(r5, r11, r9, r8)
            r0 = r7
        L_0x0232:
            r7 = r33
            dp r1 = b(r5, r7, r0, r10)
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0241
            r0 = r20
            goto L_0x024c
        L_0x0241:
            r17 = r0
            java.util.Collection r0 = r1.values()
            r13.addAll(r0)
            r0 = r17
        L_0x024c:
            if (r15 != 0) goto L_0x0262
            if (r14 != 0) goto L_0x0262
            if (r0 != 0) goto L_0x0262
            r34 = r7
            r21 = r10
            r33 = r12
            r23 = r13
            r0 = r14
            r1 = r15
            r27 = r20
            r29 = 0
            goto L_0x02d8
        L_0x0262:
            r33 = r7
            r7 = 1
            a(r11, r9, r8, r1, r7)
            if (r0 == 0) goto L_0x0291
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.a(r0, r6, r13)
            r16 = r8
            boolean r8 = r10.e
            r17 = r9
            kc r9 = r10.f
            r21 = r5
            r22 = r0
            r23 = r14
            r24 = r1
            r25 = r8
            r26 = r9
            a(r21, r22, r23, r24, r25, r26)
            if (r15 == 0) goto L_0x028e
            r5.a(r15, r7)
        L_0x028e:
            r19 = r7
            goto L_0x0297
        L_0x0291:
            r16 = r8
            r17 = r9
            r19 = r20
        L_0x0297:
            ks$4 r1 = new ks$4
            r18 = r33
            r7 = r1
            r8 = r5
            r9 = r18
            r21 = r10
            r10 = r0
            r22 = r0
            r0 = r18
            r18 = r11
            r11 = r21
            r33 = r12
            r23 = r13
            r13 = r6
            r34 = r0
            r0 = r14
            r29 = 0
            r14 = r18
            r35 = r15
            r15 = r17
            r17 = r23
            r18 = r35
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            defpackage.im.a(r2, r1)
            r27 = r22
            goto L_0x02d6
        L_0x02c7:
            r21 = r10
            r23 = r13
            r0 = r14
            r35 = r15
            r34 = r33
            r29 = 0
            r33 = r12
            r27 = r20
        L_0x02d6:
            r1 = r35
        L_0x02d8:
            if (r1 != 0) goto L_0x02de
            if (r27 != 0) goto L_0x02de
            if (r0 == 0) goto L_0x034a
        L_0x02de:
            r7 = r23
            java.util.ArrayList r4 = a(r5, r0, r4, r7, r6)
            if (r4 == 0) goto L_0x02ec
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x02ee
        L_0x02ec:
            r0 = r20
        L_0x02ee:
            r5.b(r1, r6)
            r8 = r21
            boolean r7 = r8.b
            r21 = r5
            r22 = r1
            r23 = r0
            r24 = r27
            r25 = r3
            r26 = r7
            java.lang.Object r15 = a(r21, r22, r23, r24, r25, r26)
            if (r15 == 0) goto L_0x034a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r21 = r5
            r22 = r15
            r23 = r1
            r24 = r13
            r25 = r0
            r26 = r4
            r28 = r33
            r21.a(r22, r23, r24, r25, r26, r27, r28)
            ks$2 r14 = new ks$2
            r7 = r14
            r8 = r1
            r9 = r5
            r10 = r6
            r11 = r3
            r12 = r33
            r1 = r14
            r14 = r4
            r3 = r15
            r15 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            defpackage.im.a(r2, r1)
            ku$2 r0 = new ku$2
            r4 = r33
            r1 = r34
            r0.<init>(r4, r1)
            defpackage.im.a(r2, r0)
            r5.a(r2, r3)
            ku$3 r0 = new ku$3
            r0.<init>(r4, r1)
            defpackage.im.a(r2, r0)
            goto L_0x034a
        L_0x0348:
            r29 = 0
        L_0x034a:
            int r13 = r31 + 1
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r40
            r4 = r41
            r5 = r30
            r15 = r32
            goto L_0x0048
        L_0x035c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks.a(kl, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    private static void a(ku kuVar, Object obj, Object obj2, dp<String, View> dpVar, boolean z, kc kcVar) {
        if (kcVar.p != null && !kcVar.p.isEmpty()) {
            View view = (View) dpVar.get(z ? (String) kcVar.q.get(0) : (String) kcVar.p.get(0));
            kuVar.a(obj, view);
            if (obj2 != null) {
                kuVar.a(obj2, view);
            }
        }
    }

    static boolean a() {
        return (b == null && c == null) ? false : true;
    }

    private static boolean a(ku kuVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!kuVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static dp<String, View> b(ku kuVar, dp<String, String> dpVar, Object obj, a aVar) {
        fp fpVar;
        ArrayList arrayList;
        if (dpVar.isEmpty() || obj == null) {
            dpVar.clear();
            return null;
        }
        Fragment fragment = aVar.d;
        dp<String, View> dpVar2 = new dp<>();
        kuVar.a((Map<String, View>) dpVar2, fragment.y());
        kc kcVar = aVar.f;
        if (aVar.e) {
            fpVar = fragment.X();
            arrayList = kcVar.q;
        } else {
            fpVar = fragment.Y();
            arrayList = kcVar.p;
        }
        du.a((Map<K, V>) dpVar2, (Collection<?>) arrayList);
        if (fpVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) dpVar2.get(str);
                if (view == null) {
                    dpVar.remove(str);
                } else if (!str.equals(ip.q(view))) {
                    dpVar.put(ip.q(view), (String) dpVar.remove(str));
                }
            }
        } else {
            du.a((Map<K, V>) dpVar, (Collection<?>) dpVar2.keySet());
        }
        return dpVar2;
    }

    private static Object b(ku kuVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return kuVar.b(z ? fragment.D() : fragment.E());
    }

    private static ku b() {
        try {
            return (ku) Class.forName("qi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void b(kc kcVar, SparseArray<a> sparseArray, boolean z) {
        if (kcVar.a.k.e_()) {
            for (int size = kcVar.c.size() - 1; size >= 0; size--) {
                a(kcVar, (a) kcVar.c.get(size), sparseArray, true, z);
            }
        }
    }
}
