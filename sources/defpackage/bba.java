package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bba reason: default package */
public final class bba extends bbc {
    private static final int[] c = new int[0];
    private final defpackage.bbd.a d;
    private final AtomicReference<c> e;

    /* renamed from: bba$a */
    static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c);
            }
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: bba$b */
    static final class b implements Comparable<b> {
        private final c a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        public b(aqe aqe, c cVar, int i) {
            this.a = cVar;
            this.b = bba.b(i, false) ? 1 : 0;
            this.c = bba.a(aqe, cVar.c) ? 1 : 0;
            int i2 = 1;
            if ((aqe.v & 1) == 0) {
                i2 = 0;
            }
            this.d = i2;
            this.e = aqe.q;
            this.f = aqe.r;
            this.g = aqe.c;
        }

        /* renamed from: a */
        public final int compareTo(b bVar) {
            int a2;
            int i = this.b;
            int i2 = bVar.b;
            if (i != i2) {
                return bba.a(i, i2);
            }
            int i3 = this.c;
            int i4 = bVar.c;
            if (i3 != i4) {
                return bba.a(i3, i4);
            }
            int i5 = this.d;
            int i6 = bVar.d;
            if (i5 != i6) {
                return bba.a(i5, i6);
            }
            if (this.a.o) {
                return bba.a(bVar.g, this.g);
            }
            int i7 = 1;
            if (this.b != 1) {
                i7 = -1;
            }
            int i8 = this.e;
            int i9 = bVar.e;
            if (i8 != i9) {
                a2 = bba.a(i8, i9);
            } else {
                int i10 = this.f;
                int i11 = bVar.f;
                if (i10 != i11) {
                    a2 = bba.a(i10, i11);
                } else {
                    a2 = bba.a(this.g, bVar.g);
                }
            }
            return i7 * a2;
        }
    }

    /* renamed from: bba$c */
    public static final class c implements Parcelable {
        public static final Creator<c> CREATOR = new Creator<c>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }
        };
        public static final c a = new c();
        /* access modifiers changed from: 0000 */
        public final SparseArray<Map<axx, e>> b;
        public final String c;
        public final String d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final boolean k;
        public final int l;
        public final int m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final boolean r;
        public final boolean s;
        public final int t;
        /* access modifiers changed from: private */
        public final SparseBooleanArray u;

        public final int describeContents() {
            return 0;
        }

        private c() {
            SparseArray sparseArray = r2;
            SparseArray sparseArray2 = new SparseArray();
            SparseBooleanArray sparseBooleanArray = r3;
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            this(sparseArray, sparseBooleanArray, null, null, false, 0, false, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        c(SparseArray<Map<axx, e>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, int i3, int i4, int i5, int i6, boolean z6, boolean z7, int i7, int i8, boolean z8, int i9) {
            this.b = sparseArray;
            this.u = sparseBooleanArray;
            this.c = bdw.b(str);
            this.d = bdw.b(str2);
            this.e = z;
            this.f = i2;
            this.o = z2;
            this.p = z3;
            this.q = z4;
            this.r = z5;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            this.j = i6;
            this.k = z6;
            this.s = z7;
            this.l = i7;
            this.m = i8;
            this.n = z8;
            this.t = i9;
        }

        c(Parcel parcel) {
            this.b = a(parcel);
            this.u = parcel.readSparseBooleanArray();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = bdw.a(parcel);
            this.f = parcel.readInt();
            this.o = bdw.a(parcel);
            this.p = bdw.a(parcel);
            this.q = bdw.a(parcel);
            this.r = bdw.a(parcel);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = bdw.a(parcel);
            this.s = bdw.a(parcel);
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = bdw.a(parcel);
            this.t = parcel.readInt();
        }

        public final boolean a(int i2) {
            return this.u.get(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0115 A[LOOP:1: B:57:0x00be->B:72:0x0115, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x011b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00bb A[EDGE_INSN: B:80:0x00bb->B:55:0x00bb ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 1
                if (r10 != r11) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r11 == 0) goto L_0x011c
                java.lang.Class r2 = r10.getClass()
                java.lang.Class r3 = r11.getClass()
                if (r2 == r3) goto L_0x0013
                goto L_0x011c
            L_0x0013:
                bba$c r11 = (defpackage.bba.c) r11
                boolean r2 = r10.e
                boolean r3 = r11.e
                if (r2 != r3) goto L_0x011c
                int r2 = r10.f
                int r3 = r11.f
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.o
                boolean r3 = r11.o
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.p
                boolean r3 = r11.p
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.q
                boolean r3 = r11.q
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.r
                boolean r3 = r11.r
                if (r2 != r3) goto L_0x011c
                int r2 = r10.g
                int r3 = r11.g
                if (r2 != r3) goto L_0x011c
                int r2 = r10.h
                int r3 = r11.h
                if (r2 != r3) goto L_0x011c
                int r2 = r10.i
                int r3 = r11.i
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.k
                boolean r3 = r11.k
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.s
                boolean r3 = r11.s
                if (r2 != r3) goto L_0x011c
                boolean r2 = r10.n
                boolean r3 = r11.n
                if (r2 != r3) goto L_0x011c
                int r2 = r10.l
                int r3 = r11.l
                if (r2 != r3) goto L_0x011c
                int r2 = r10.m
                int r3 = r11.m
                if (r2 != r3) goto L_0x011c
                int r2 = r10.j
                int r3 = r11.j
                if (r2 != r3) goto L_0x011c
                int r2 = r10.t
                int r3 = r11.t
                if (r2 != r3) goto L_0x011c
                java.lang.String r2 = r10.c
                java.lang.String r3 = r11.c
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L_0x011c
                java.lang.String r2 = r10.d
                java.lang.String r3 = r11.d
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L_0x011c
                android.util.SparseBooleanArray r2 = r10.u
                android.util.SparseBooleanArray r3 = r11.u
                int r4 = r2.size()
                int r5 = r3.size()
                if (r5 == r4) goto L_0x0099
            L_0x0097:
                r2 = 0
                goto L_0x00ab
            L_0x0099:
                r5 = 0
            L_0x009a:
                if (r5 >= r4) goto L_0x00aa
                int r6 = r2.keyAt(r5)
                int r6 = r3.indexOfKey(r6)
                if (r6 >= 0) goto L_0x00a7
                goto L_0x0097
            L_0x00a7:
                int r5 = r5 + 1
                goto L_0x009a
            L_0x00aa:
                r2 = 1
            L_0x00ab:
                if (r2 == 0) goto L_0x011c
                android.util.SparseArray<java.util.Map<axx, bba$e>> r2 = r10.b
                android.util.SparseArray<java.util.Map<axx, bba$e>> r11 = r11.b
                int r3 = r2.size()
                int r4 = r11.size()
                if (r4 == r3) goto L_0x00bd
            L_0x00bb:
                r11 = 0
                goto L_0x0119
            L_0x00bd:
                r4 = 0
            L_0x00be:
                if (r4 >= r3) goto L_0x0118
                int r5 = r2.keyAt(r4)
                int r5 = r11.indexOfKey(r5)
                if (r5 < 0) goto L_0x00bb
                java.lang.Object r6 = r2.valueAt(r4)
                java.util.Map r6 = (java.util.Map) r6
                java.lang.Object r5 = r11.valueAt(r5)
                java.util.Map r5 = (java.util.Map) r5
                int r7 = r6.size()
                int r8 = r5.size()
                if (r8 == r7) goto L_0x00e2
            L_0x00e0:
                r5 = 0
                goto L_0x0112
            L_0x00e2:
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x00ea:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x0111
                java.lang.Object r7 = r6.next()
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                java.lang.Object r8 = r7.getKey()
                axx r8 = (defpackage.axx) r8
                boolean r9 = r5.containsKey(r8)
                if (r9 == 0) goto L_0x00e0
                java.lang.Object r7 = r7.getValue()
                java.lang.Object r8 = r5.get(r8)
                boolean r7 = defpackage.bdw.a(r7, r8)
                if (r7 != 0) goto L_0x00ea
                goto L_0x00e0
            L_0x0111:
                r5 = 1
            L_0x0112:
                if (r5 != 0) goto L_0x0115
                goto L_0x00bb
            L_0x0115:
                int r4 = r4 + 1
                goto L_0x00be
            L_0x0118:
                r11 = 1
            L_0x0119:
                if (r11 == 0) goto L_0x011c
                return r0
            L_0x011c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int i2;
            int i3 = (((((((((((((((((((((((((((((((this.e ? 1 : 0) * true) + this.f) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.k ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + this.l) * 31) + this.m) * 31) + this.j) * 31) + this.t) * 31;
            String str = this.c;
            int i4 = 0;
            if (str == null) {
                i2 = 0;
            } else {
                i2 = str.hashCode();
            }
            int i5 = (i3 + i2) * 31;
            String str2 = this.d;
            if (str2 != null) {
                i4 = str2.hashCode();
            }
            return i5 + i4;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            SparseArray<Map<axx, e>> sparseArray = this.b;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                Map map = (Map) sparseArray.valueAt(i3);
                int size2 = map.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.u);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            bdw.a(parcel, this.e);
            parcel.writeInt(this.f);
            bdw.a(parcel, this.o);
            bdw.a(parcel, this.p);
            bdw.a(parcel, this.q);
            bdw.a(parcel, this.r);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            bdw.a(parcel, this.k);
            bdw.a(parcel, this.s);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            bdw.a(parcel, this.n);
            parcel.writeInt(this.t);
        }

        private static SparseArray<Map<axx, e>> a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<axx, e>> sparseArray = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i3 = 0; i3 < readInt3; i3++) {
                    hashMap.put((axx) parcel.readParcelable(axx.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }
    }

    /* renamed from: bba$d */
    public static final class d {
        final SparseArray<Map<axx, e>> a;
        final SparseBooleanArray b;
        String c;
        public String d;
        boolean e;
        int f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        int k;
        int l;
        int m;
        int n;
        boolean o;
        boolean p;
        int q;
        int r;
        boolean s;
        int t;

        /* synthetic */ d(c cVar, byte b2) {
            this(cVar);
        }

        public d() {
            this(c.a);
        }

        private d(c cVar) {
            this.a = a(cVar.b);
            this.b = cVar.u.clone();
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.o;
            this.h = cVar.p;
            this.i = cVar.q;
            this.j = cVar.r;
            this.k = cVar.g;
            this.l = cVar.h;
            this.m = cVar.i;
            this.n = cVar.j;
            this.o = cVar.k;
            this.p = cVar.s;
            this.q = cVar.l;
            this.r = cVar.m;
            this.s = cVar.n;
            this.t = cVar.t;
        }

        private static SparseArray<Map<axx, e>> a(SparseArray<Map<axx, e>> sparseArray) {
            SparseArray<Map<axx, e>> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray2.put(sparseArray.keyAt(i2), new HashMap((Map) sparseArray.valueAt(i2)));
            }
            return sparseArray2;
        }
    }

    /* renamed from: bba$e */
    public static final class e implements Parcelable {
        public static final Creator<e> CREATOR = new Creator<e>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new e[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }
        };
        public final int a;
        public final int[] b = new int[this.c];
        public final int c;

        public final int describeContents() {
            return 0;
        }

        e(Parcel parcel) {
            this.a = parcel.readInt();
            this.c = parcel.readByte();
            parcel.readIntArray(this.b);
        }

        public final int hashCode() {
            return (this.a * 31) + Arrays.hashCode(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                e eVar = (e) obj;
                return this.a == eVar.a && Arrays.equals(this.b, eVar.b);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b.length);
            parcel.writeIntArray(this.b);
        }
    }

    static /* synthetic */ int a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    private static int b(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    protected static boolean b(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public bba() {
        this(new defpackage.bay.a());
    }

    public bba(defpackage.bbd.a aVar) {
        this.d = aVar;
        this.e = new AtomicReference<>(c.a);
    }

    @Deprecated
    public final void a(int i, boolean z) {
        d a2 = a();
        if (a2.b.get(i) != z) {
            if (z) {
                a2.b.put(i, true);
            } else {
                a2.b.delete(i);
            }
        }
        a(a2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0103 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f A[LOOP:1: B:22:0x0051->B:50:0x010f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<defpackage.aqq[], defpackage.bbd[]> a(defpackage.bbc.a r37, int[][][] r38, int[] r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            java.util.concurrent.atomic.AtomicReference<bba$c> r3 = r0.e
            java.lang.Object r3 = r3.get()
            bba$c r3 = (defpackage.bba.c) r3
            int r4 = r1.a
            int r5 = r1.a
            bbd[] r6 = new defpackage.bbd[r5]
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0017:
            r11 = 2
            if (r8 >= r5) goto L_0x0185
            int[] r14 = r1.b
            r14 = r14[r8]
            if (r11 != r14) goto L_0x016b
            if (r9 != 0) goto L_0x014e
            axx[] r9 = r1.c
            r9 = r9[r8]
            r14 = r2[r8]
            r15 = r39[r8]
            bbd$a r7 = r0.d
            boolean r12 = r3.p
            if (r12 != 0) goto L_0x0134
            boolean r12 = r3.o
            if (r12 != 0) goto L_0x0134
            if (r7 == 0) goto L_0x0134
            bbj r12 = r36.b()
            boolean r13 = r3.r
            if (r13 == 0) goto L_0x0041
            r13 = 24
            goto L_0x0043
        L_0x0041:
            r13 = 16
        L_0x0043:
            boolean r11 = r3.q
            if (r11 == 0) goto L_0x004d
            r11 = r15 & r13
            if (r11 == 0) goto L_0x004d
            r11 = 1
            goto L_0x004e
        L_0x004d:
            r11 = 0
        L_0x004e:
            r26 = r4
            r15 = 0
        L_0x0051:
            int r4 = r9.b
            if (r15 >= r4) goto L_0x0127
            axw[] r4 = r9.c
            r4 = r4[r15]
            r27 = r14[r15]
            int r0 = r3.g
            int r2 = r3.h
            r28 = r5
            int r5 = r3.i
            r29 = r10
            int r10 = r3.j
            int r1 = r3.l
            r30 = r6
            int r6 = r3.m
            r31 = r8
            boolean r8 = r3.n
            r32 = r3
            int r3 = r4.a
            r33 = r9
            r9 = 2
            if (r3 >= r9) goto L_0x0080
            int[] r0 = c
        L_0x007c:
            r35 = r11
            goto L_0x0100
        L_0x0080:
            java.util.List r1 = a(r4, r1, r6, r8)
            int r3 = r1.size()
            if (r3 >= r9) goto L_0x008d
            int[] r0 = c
            goto L_0x007c
        L_0x008d:
            if (r11 != 0) goto L_0x00db
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r6 = 0
            r9 = 0
            r34 = 0
        L_0x0098:
            int r8 = r1.size()
            if (r6 >= r8) goto L_0x00d6
            java.lang.Object r8 = r1.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r35 = r11
            aqe[] r11 = r4.b
            r8 = r11[r8]
            java.lang.String r8 = r8.f
            boolean r11 = r3.add(r8)
            if (r11 == 0) goto L_0x00d1
            r17 = r4
            r18 = r27
            r19 = r13
            r20 = r8
            r21 = r0
            r22 = r2
            r23 = r5
            r24 = r10
            r25 = r1
            int r11 = a(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r11 <= r9) goto L_0x00d1
            r34 = r8
            r9 = r11
        L_0x00d1:
            int r6 = r6 + 1
            r11 = r35
            goto L_0x0098
        L_0x00d6:
            r35 = r11
            r20 = r34
            goto L_0x00df
        L_0x00db:
            r35 = r11
            r20 = 0
        L_0x00df:
            r17 = r4
            r18 = r27
            r19 = r13
            r21 = r0
            r22 = r2
            r23 = r5
            r24 = r10
            r25 = r1
            b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r0 = r1.size()
            r2 = 2
            if (r0 >= r2) goto L_0x00fc
            int[] r0 = c
            goto L_0x0100
        L_0x00fc:
            int[] r0 = defpackage.bdw.a(r1)
        L_0x0100:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x010f
            java.lang.Object r1 = defpackage.bcu.a(r7)
            bbd$a r1 = (defpackage.bbd.a) r1
            bbd r0 = r1.a(r4, r12, r0)
            r12 = r0
            goto L_0x013a
        L_0x010f:
            int r15 = r15 + 1
            r0 = r36
            r1 = r37
            r2 = r38
            r5 = r28
            r10 = r29
            r6 = r30
            r8 = r31
            r3 = r32
            r9 = r33
            r11 = r35
            goto L_0x0051
        L_0x0127:
            r32 = r3
        L_0x0129:
            r28 = r5
            r30 = r6
            r31 = r8
            r33 = r9
            r29 = r10
            goto L_0x0139
        L_0x0134:
            r32 = r3
            r26 = r4
            goto L_0x0129
        L_0x0139:
            r12 = 0
        L_0x013a:
            r3 = r32
            if (r12 != 0) goto L_0x0144
            r0 = r33
            bbd r12 = a(r0, r14, r3)
        L_0x0144:
            r30[r31] = r12
            r0 = r30[r31]
            if (r0 == 0) goto L_0x014c
            r9 = 1
            goto L_0x0158
        L_0x014c:
            r9 = 0
            goto L_0x0158
        L_0x014e:
            r26 = r4
            r28 = r5
            r30 = r6
            r31 = r8
            r29 = r10
        L_0x0158:
            r0 = r37
            axx[] r1 = r0.c
            r1 = r1[r31]
            int r1 = r1.b
            if (r1 <= 0) goto L_0x0165
            r16 = 1
            goto L_0x0167
        L_0x0165:
            r16 = 0
        L_0x0167:
            r1 = r29 | r16
            r10 = r1
            goto L_0x0176
        L_0x016b:
            r0 = r1
            r26 = r4
            r28 = r5
            r30 = r6
            r31 = r8
            r29 = r10
        L_0x0176:
            int r8 = r31 + 1
            r2 = r38
            r1 = r0
            r4 = r26
            r5 = r28
            r6 = r30
            r0 = r36
            goto L_0x0017
        L_0x0185:
            r0 = r1
            r26 = r4
            r28 = r5
            r30 = r6
            r29 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r1 = r28
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -1
            r7 = 0
            r8 = -1
        L_0x0199:
            if (r4 >= r1) goto L_0x0225
            int[] r9 = r0.b
            r9 = r9[r4]
            r10 = 1
            if (r9 == r10) goto L_0x01ec
            r10 = 2
            if (r9 == r10) goto L_0x01e9
            r11 = 3
            if (r9 == r11) goto L_0x01ba
            axx[] r9 = r0.c
            r9 = r9[r4]
            r11 = r38
            r12 = r11[r4]
            bbd r9 = c(r9, r12, r3)
            r30[r4] = r9
        L_0x01b6:
            r13 = r36
            goto L_0x0221
        L_0x01ba:
            r11 = r38
            axx[] r9 = r0.c
            r9 = r9[r4]
            r12 = r11[r4]
            android.util.Pair r9 = b(r9, r12, r3)
            if (r9 == 0) goto L_0x01b6
            java.lang.Object r12 = r9.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 <= r5) goto L_0x01b6
            if (r6 == r2) goto L_0x01d7
            r5 = 0
            r30[r6] = r5
        L_0x01d7:
            java.lang.Object r5 = r9.first
            bbd r5 = (defpackage.bbd) r5
            r30[r4] = r5
            java.lang.Object r5 = r9.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r13 = r36
            r6 = r4
            goto L_0x0221
        L_0x01e9:
            r11 = r38
            goto L_0x01b6
        L_0x01ec:
            r11 = r38
            r10 = 2
            axx[] r9 = r0.c
            r9 = r9[r4]
            r12 = r11[r4]
            if (r29 == 0) goto L_0x01fb
            r14 = 0
            r13 = r36
            goto L_0x01ff
        L_0x01fb:
            r13 = r36
            bbd$a r14 = r13.d
        L_0x01ff:
            android.util.Pair r9 = r13.a(r9, r12, r3, r14)
            if (r9 == 0) goto L_0x0221
            if (r7 == 0) goto L_0x0211
            java.lang.Object r12 = r9.second
            bba$b r12 = (defpackage.bba.b) r12
            int r12 = r12.compareTo(r7)
            if (r12 <= 0) goto L_0x0221
        L_0x0211:
            if (r8 == r2) goto L_0x0216
            r7 = 0
            r30[r8] = r7
        L_0x0216:
            java.lang.Object r7 = r9.first
            bbd r7 = (defpackage.bbd) r7
            r30[r4] = r7
            java.lang.Object r7 = r9.second
            bba$b r7 = (defpackage.bba.b) r7
            r8 = r4
        L_0x0221:
            int r4 = r4 + 1
            goto L_0x0199
        L_0x0225:
            r13 = r36
            r11 = r38
            r1 = r26
            r2 = 0
        L_0x022c:
            if (r2 >= r1) goto L_0x02ab
            boolean r4 = r3.a(r2)
            if (r4 == 0) goto L_0x023d
            r4 = 0
            r30[r2] = r4
            r5 = r4
        L_0x0238:
            r10 = 1
            r16 = 0
            goto L_0x02a8
        L_0x023d:
            axx[] r4 = r0.c
            r4 = r4[r2]
            android.util.SparseArray<java.util.Map<axx, bba$e>> r5 = r3.b
            java.lang.Object r5 = r5.get(r2)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0253
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0253
            r5 = 1
            goto L_0x0254
        L_0x0253:
            r5 = 0
        L_0x0254:
            if (r5 == 0) goto L_0x02a6
            android.util.SparseArray<java.util.Map<axx, bba$e>> r5 = r3.b
            java.lang.Object r5 = r5.get(r2)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0268
            java.lang.Object r5 = r5.get(r4)
            r12 = r5
            bba$e r12 = (defpackage.bba.e) r12
            goto L_0x0269
        L_0x0268:
            r12 = 0
        L_0x0269:
            if (r12 != 0) goto L_0x026f
            r5 = 0
            r30[r2] = r5
            goto L_0x0238
        L_0x026f:
            r5 = 0
            int r6 = r12.c
            r10 = 1
            if (r6 != r10) goto L_0x0289
            bbb r6 = new bbb
            int r7 = r12.a
            axw[] r4 = r4.c
            r4 = r4[r7]
            int[] r7 = r12.b
            r16 = 0
            r7 = r7[r16]
            r6.<init>(r4, r7)
            r30[r2] = r6
            goto L_0x02a8
        L_0x0289:
            r16 = 0
            bbd$a r6 = r13.d
            java.lang.Object r6 = defpackage.bcu.a(r6)
            bbd$a r6 = (defpackage.bbd.a) r6
            int r7 = r12.a
            axw[] r4 = r4.c
            r4 = r4[r7]
            bbj r7 = r36.b()
            int[] r8 = r12.b
            bbd r4 = r6.a(r4, r7, r8)
            r30[r2] = r4
            goto L_0x02a8
        L_0x02a6:
            r5 = 0
            goto L_0x0238
        L_0x02a8:
            int r2 = r2 + 1
            goto L_0x022c
        L_0x02ab:
            r5 = 0
            r10 = 1
            r16 = 0
            aqq[] r2 = new defpackage.aqq[r1]
            r4 = 0
        L_0x02b2:
            if (r4 >= r1) goto L_0x02d3
            boolean r6 = r3.a(r4)
            if (r6 != 0) goto L_0x02c7
            int[] r6 = r0.b
            r6 = r6[r4]
            r7 = 6
            if (r6 == r7) goto L_0x02c5
            r6 = r30[r4]
            if (r6 == 0) goto L_0x02c7
        L_0x02c5:
            r6 = 1
            goto L_0x02c8
        L_0x02c7:
            r6 = 0
        L_0x02c8:
            if (r6 == 0) goto L_0x02cd
            aqq r12 = defpackage.aqq.a
            goto L_0x02ce
        L_0x02cd:
            r12 = r5
        L_0x02ce:
            r2[r4] = r12
            int r4 = r4 + 1
            goto L_0x02b2
        L_0x02d3:
            int r1 = r3.t
            r3 = r30
            a(r0, r11, r2, r3, r1)
            android.util.Pair r0 = android.util.Pair.create(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.a(bbc$a, int[][][], int[]):android.util.Pair");
    }

    private static int a(axw axw, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = ((Integer) list.get(i7)).intValue();
            if (a(axw.b[intValue], str, iArr[intValue], i, i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    private static void b(axw axw, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            if (!a(axw.b[intValue], str, iArr[intValue], i, i2, i3, i4, i5)) {
                list2.remove(size);
            }
        }
    }

    private static boolean a(aqe aqe, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!b(i, false) || (i & i2) == 0 || ((str != null && !bdw.a((Object) aqe.f, (Object) str)) || ((aqe.k != -1 && aqe.k > i3) || ((aqe.l != -1 && aqe.l > i4) || ((aqe.m != -1.0f && aqe.m > ((float) i5)) || (aqe.c != -1 && aqe.c > i6)))))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (b(r2.c, r14) < 0) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.bbd a(defpackage.axx r18, int[][] r19, defpackage.bba.c r20) {
        /*
            r0 = r18
            r1 = r20
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000b:
            int r11 = r0.b
            if (r5 >= r11) goto L_0x00df
            axw[] r11 = r0.c
            r11 = r11[r5]
            int r12 = r1.l
            int r13 = r1.m
            boolean r14 = r1.n
            java.util.List r12 = a(r11, r12, r13, r14)
            r13 = r19[r5]
            r14 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = 0
        L_0x0025:
            int r15 = r11.a
            if (r6 >= r15) goto L_0x00d3
            r15 = r13[r6]
            boolean r2 = r1.s
            boolean r2 = b(r15, r2)
            if (r2 == 0) goto L_0x00cc
            aqe[] r2 = r11.b
            r2 = r2[r6]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r15 = r12.contains(r15)
            r16 = 1
            if (r15 == 0) goto L_0x0074
            int r15 = r2.k
            if (r15 == r3) goto L_0x004d
            int r15 = r2.k
            int r4 = r1.g
            if (r15 > r4) goto L_0x0074
        L_0x004d:
            int r4 = r2.l
            if (r4 == r3) goto L_0x0057
            int r4 = r2.l
            int r15 = r1.h
            if (r4 > r15) goto L_0x0074
        L_0x0057:
            float r4 = r2.m
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x0068
            float r4 = r2.m
            int r15 = r1.i
            float r15 = (float) r15
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x0074
        L_0x0068:
            int r4 = r2.c
            if (r4 == r3) goto L_0x0072
            int r4 = r2.c
            int r15 = r1.j
            if (r4 > r15) goto L_0x0074
        L_0x0072:
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 != 0) goto L_0x007b
            boolean r15 = r1.k
            if (r15 == 0) goto L_0x00cc
        L_0x007b:
            if (r4 == 0) goto L_0x007f
            r15 = 2
            goto L_0x0080
        L_0x007f:
            r15 = 1
        L_0x0080:
            r3 = r13[r6]
            r0 = 0
            boolean r3 = b(r3, r0)
            if (r3 == 0) goto L_0x008b
            int r15 = r15 + 1000
        L_0x008b:
            if (r15 <= r9) goto L_0x0090
            r17 = 1
            goto L_0x0092
        L_0x0090:
            r17 = 0
        L_0x0092:
            if (r15 != r9) goto L_0x00c1
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x00a6
            int r0 = r2.c
            int r0 = b(r0, r14)
            if (r0 >= 0) goto L_0x00a3
        L_0x00a0:
            r17 = 1
            goto L_0x00c1
        L_0x00a3:
            r17 = 0
            goto L_0x00c1
        L_0x00a6:
            int r0 = r2.a()
            if (r0 == r10) goto L_0x00b1
            int r0 = b(r0, r10)
            goto L_0x00b7
        L_0x00b1:
            int r0 = r2.c
            int r0 = b(r0, r14)
        L_0x00b7:
            if (r3 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x00be
            if (r0 <= 0) goto L_0x00a3
            goto L_0x00a0
        L_0x00be:
            if (r0 >= 0) goto L_0x00a3
            goto L_0x00a0
        L_0x00c1:
            if (r17 == 0) goto L_0x00cc
            int r14 = r2.c
            int r10 = r2.a()
            r8 = r6
            r7 = r11
            r9 = r15
        L_0x00cc:
            int r6 = r6 + 1
            r3 = -1
            r0 = r18
            goto L_0x0025
        L_0x00d3:
            int r5 = r5 + 1
            r3 = -1
            r0 = r18
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            goto L_0x000b
        L_0x00df:
            if (r6 != 0) goto L_0x00e3
            r0 = 0
            return r0
        L_0x00e3:
            bbb r0 = new bbb
            r0.<init>(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.a(axx, int[][], bba$c):bbd");
    }

    private Pair<bbd, b> a(axx axx, int[][] iArr, c cVar, defpackage.bbd.a aVar) {
        axx axx2 = axx;
        c cVar2 = cVar;
        defpackage.bbd.a aVar2 = aVar;
        bbd bbd = null;
        b bVar = null;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (i < axx2.b) {
            axw axw = axx2.c[i];
            int[] iArr2 = iArr[i];
            int i4 = i3;
            b bVar2 = bVar;
            int i5 = i2;
            for (int i6 = 0; i6 < axw.a; i6++) {
                if (b(iArr2[i6], cVar2.s)) {
                    b bVar3 = new b(axw.b[i6], cVar2, iArr2[i6]);
                    if (bVar2 == null || bVar3.compareTo(bVar2) > 0) {
                        i5 = i;
                        i4 = i6;
                        bVar2 = bVar3;
                    }
                }
            }
            i++;
            i2 = i5;
            bVar = bVar2;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        axw axw2 = axx2.c[i2];
        if (!cVar2.p && !cVar2.o && aVar2 != null) {
            int[] a2 = a(axw2, iArr[i2], cVar2.q);
            if (a2.length > 0) {
                bbd = aVar2.a(axw2, b(), a2);
            }
        }
        if (bbd == null) {
            bbd = new bbb(axw2, i3);
        }
        return Pair.create(bbd, bcu.a(bVar));
    }

    private static int[] a(axw axw, int[] iArr, boolean z) {
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < axw.a; i2++) {
            aqe aqe = axw.b[i2];
            a aVar2 = new a(aqe.q, aqe.r, z ? null : aqe.f);
            if (hashSet.add(aVar2)) {
                int a2 = a(axw, iArr, aVar2);
                if (a2 > i) {
                    i = a2;
                    aVar = aVar2;
                }
            }
        }
        if (i <= 1) {
            return c;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < axw.a; i4++) {
            if (a(axw.b[i4], iArr[i4], (a) bcu.a(aVar))) {
                int i5 = i3 + 1;
                iArr2[i3] = i4;
                i3 = i5;
            }
        }
        return iArr2;
    }

    private static int a(axw axw, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < axw.a; i2++) {
            if (a(axw.b[i2], iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(aqe aqe, int i, a aVar) {
        if (!b(i, false) || aqe.q != aVar.a || aqe.r != aVar.b || (aVar.c != null && !TextUtils.equals(aVar.c, aqe.f))) {
            return false;
        }
        return true;
    }

    private static Pair<bbd, Integer> b(axx axx, int[][] iArr, c cVar) {
        int i;
        axx axx2 = axx;
        c cVar2 = cVar;
        axw axw = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < axx2.b) {
            axw axw2 = axx2.c[i2];
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            axw axw3 = axw;
            for (int i6 = 0; i6 < axw2.a; i6++) {
                if (b(iArr2[i6], cVar2.s)) {
                    aqe aqe = axw2.b[i6];
                    int i7 = aqe.v & (cVar2.f ^ -1);
                    boolean z = (i7 & 1) != 0;
                    boolean z2 = (i7 & 2) != 0;
                    boolean a2 = a(aqe, cVar2.d);
                    if (a2 || (cVar2.e && a(aqe))) {
                        int i8 = z ? 8 : !z2 ? 6 : 4;
                        i = i8 + (a2 ? 1 : 0);
                    } else if (z) {
                        i = 3;
                    } else if (z2) {
                        i = a(aqe, cVar2.c) ? 2 : 1;
                    }
                    if (b(iArr2[i6], false)) {
                        i += 1000;
                    }
                    if (i > i5) {
                        i3 = i6;
                        axw3 = axw2;
                        i5 = i;
                    }
                }
            }
            i2++;
            axw = axw3;
            i4 = i5;
        }
        if (axw == null) {
            return null;
        }
        return Pair.create(new bbb(axw, i3), Integer.valueOf(i4));
    }

    private static bbd c(axx axx, int[][] iArr, c cVar) {
        axw axw = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < axx.b) {
            axw axw2 = axx.c[i];
            int[] iArr2 = iArr[i];
            int i4 = i3;
            axw axw3 = axw;
            for (int i5 = 0; i5 < axw2.a; i5++) {
                if (b(iArr2[i5], cVar.s)) {
                    int i6 = 1;
                    if ((axw2.b[i5].v & 1) != 0) {
                        i6 = 2;
                    }
                    if (b(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i4) {
                        i2 = i5;
                        axw3 = axw2;
                        i4 = i6;
                    }
                }
            }
            i++;
            axw = axw3;
            i3 = i4;
        }
        if (axw == null) {
            return null;
        }
        return new bbb(axw, i2);
    }

    private static boolean a(aqe aqe) {
        return TextUtils.isEmpty(aqe.w) || a(aqe, "und");
    }

    protected static boolean a(aqe aqe, String str) {
        return str != null && TextUtils.equals(str, bdw.b(aqe.w));
    }

    private static List<Integer> a(axw axw, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(axw.a);
        for (int i3 = 0; i3 < axw.a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < axw.a; i5++) {
                aqe aqe = axw.b[i5];
                if (aqe.k > 0 && aqe.l > 0) {
                    Point a2 = a(z, i, i2, aqe.k, aqe.l);
                    int i6 = aqe.k * aqe.l;
                    if (aqe.k >= ((int) (((float) a2.x) * 0.98f)) && aqe.l >= ((int) (((float) a2.y) * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int a3 = axw.b[((Integer) arrayList.get(size)).intValue()].a();
                    if (a3 == -1 || a3 > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = defpackage.bdw.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = defpackage.bdw.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.a(boolean, int, int, int, int):android.graphics.Point");
    }

    public final void a(d dVar) {
        d dVar2 = dVar;
        c cVar = r2;
        c cVar2 = new c(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.k, dVar2.l, dVar2.m, dVar2.n, dVar2.o, dVar2.p, dVar2.q, dVar2.r, dVar2.s, dVar2.t);
        bcu.a(cVar);
        c cVar3 = cVar;
        if (!((c) this.e.getAndSet(cVar3)).equals(cVar3) && this.a != null) {
            this.a.b();
        }
    }

    public final d a() {
        return new d((c) this.e.get(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.bbc.a r15, int[][][] r16, defpackage.aqq[] r17, defpackage.bbd[] r18, int r19) {
        /*
            r0 = r15
            r1 = r19
            if (r1 != 0) goto L_0x0006
            return
        L_0x0006:
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x000b:
            int r7 = r0.a
            r8 = 1
            if (r4 >= r7) goto L_0x0059
            int[] r7 = r0.b
            r7 = r7[r4]
            r9 = r18[r4]
            if (r7 == r8) goto L_0x001b
            r10 = 2
            if (r7 != r10) goto L_0x0056
        L_0x001b:
            if (r9 == 0) goto L_0x0056
            r10 = r16[r4]
            axx[] r11 = r0.c
            r11 = r11[r4]
            if (r9 != 0) goto L_0x0027
        L_0x0025:
            r9 = 0
            goto L_0x0048
        L_0x0027:
            axw r12 = r9.e()
            int r11 = r11.a(r12)
            r12 = 0
        L_0x0030:
            int r13 = r9.f()
            if (r12 >= r13) goto L_0x0047
            r13 = r10[r11]
            int r14 = r9.b(r12)
            r13 = r13[r14]
            r14 = 32
            r13 = r13 & r14
            if (r13 == r14) goto L_0x0044
            goto L_0x0025
        L_0x0044:
            int r12 = r12 + 1
            goto L_0x0030
        L_0x0047:
            r9 = 1
        L_0x0048:
            if (r9 == 0) goto L_0x0056
            if (r7 != r8) goto L_0x0051
            if (r6 == r2) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            r6 = r4
            goto L_0x0056
        L_0x0051:
            if (r5 == r2) goto L_0x0055
        L_0x0053:
            r0 = 0
            goto L_0x005a
        L_0x0055:
            r5 = r4
        L_0x0056:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0059:
            r0 = 1
        L_0x005a:
            if (r6 == r2) goto L_0x005f
            if (r5 == r2) goto L_0x005f
            r3 = 1
        L_0x005f:
            r0 = r0 & r3
            if (r0 == 0) goto L_0x006b
            aqq r0 = new aqq
            r0.<init>(r1)
            r17[r6] = r0
            r17[r5] = r0
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.a(bbc$a, int[][][], aqq[], bbd[], int):void");
    }
}
