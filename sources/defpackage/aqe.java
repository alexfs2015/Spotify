package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aqe reason: default package */
public final class aqe implements Parcelable {
    public static final Creator<aqe> CREATOR = new Creator<aqe>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aqe[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aqe(parcel);
        }
    };
    private byte[] A;
    private int B;
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List<byte[]> h;
    public final asc i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    public final bdz p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final String w;
    public final int x;
    private awa y;
    private int z;

    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public static aqe a(String str, String str2, String str3, String str4, int i2, int i3, int i4, float f2, List<byte[]> list, int i5) {
        return a(str, (String) null, str2, str3, str4, i2, i3, i4, -1.0f, null, i5);
    }

    public static aqe a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, float f2, List<byte[]> list, int i5) {
        aqe aqe = new aqe(str, str2, str3, str4, str5, i2, -1, i3, i4, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, null, -1, Long.MAX_VALUE, list, null, null);
        return aqe;
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, asc asc) {
        return a(str, str2, str3, -1, -1, i4, i5, -1.0f, list, -1, f3, (byte[]) null, -1, (bdz) null, (asc) null);
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, bdz bdz, asc asc) {
        aqe aqe = new aqe(str, null, null, str2, str3, i2, i3, i4, i5, f2, i6, f3, bArr, i7, bdz, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, asc, null);
        return aqe;
    }

    @Deprecated
    public static aqe a(String str, String str2, String str3, String str4, int i2, int i3, int i4, List<byte[]> list, int i5, String str5) {
        return a(str, (String) null, str2, str3, str4, i2, -1, -1, null, i5, (String) null);
    }

    public static aqe a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, List<byte[]> list, int i5, String str6) {
        aqe aqe = new aqe(str, str2, str3, str4, str5, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, -1, -1, -1, i5, str6, -1, Long.MAX_VALUE, list, null, null);
        return aqe;
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, asc asc, int i6, String str4) {
        return a(str, str2, (String) null, i2, i3, i4, i5, -1, list, asc, 0, str4);
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, asc asc, int i7, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, list, asc, i7, str4, (awa) null);
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, asc asc, int i9, String str4, awa awa) {
        aqe aqe = new aqe(str, null, null, str2, str3, i2, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, i7, i8, i9, str4, -1, Long.MAX_VALUE, list, asc, awa);
        return aqe;
    }

    public static aqe a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6) {
        return a(str, str2, str3, str4, (String) null, -1, i3, str6, -1);
    }

    public static aqe a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, int i4) {
        aqe aqe = new aqe(str, str2, str3, str4, str5, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str6, i4, Long.MAX_VALUE, null, null, null);
        return aqe;
    }

    public static aqe a(String str, String str2, int i2, String str3) {
        return a((String) null, str2, 0, (String) null, (asc) null);
    }

    public static aqe a(String str, String str2, int i2, String str3, asc asc) {
        return a(str, str2, (String) null, -1, i2, str3, -1, asc, Long.MAX_VALUE, Collections.emptyList());
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, String str4, asc asc, long j2) {
        return a(str, str2, str3, i2, 0, str4, -1, (asc) null, j2, Collections.emptyList());
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, String str4, int i4, asc asc, long j2, List<byte[]> list) {
        aqe aqe = new aqe(str, null, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, i4, j2, list, asc, null);
        return aqe;
    }

    public static aqe a(String str, String str2, String str3, int i2, int i3, List<byte[]> list, String str4, asc asc) {
        aqe aqe = new aqe(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, Long.MAX_VALUE, list, asc, null);
        return aqe;
    }

    public static aqe b(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6) {
        aqe aqe = new aqe(str, null, str3, null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
        return aqe;
    }

    public static aqe a(String str, String str2, long j2) {
        aqe aqe = new aqe(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j2, null, null, null);
        return aqe;
    }

    public static aqe a(String str, String str2, String str3, int i2, asc asc) {
        aqe aqe = new aqe(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
        return aqe;
    }

    private aqe(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, bdz bdz, int i8, int i9, int i10, int i11, int i12, int i13, String str6, int i14, long j2, List<byte[]> list, asc asc, awa awa) {
        this.a = str;
        this.b = str2;
        this.e = str3;
        this.f = str4;
        this.d = str5;
        this.c = i2;
        this.g = i3;
        this.k = i4;
        this.l = i5;
        this.m = f2;
        int i15 = i6;
        if (i15 == -1) {
            i15 = 0;
        }
        this.n = i15;
        this.o = f3 == -1.0f ? 1.0f : f3;
        this.A = bArr;
        this.z = i7;
        this.p = bdz;
        this.q = i8;
        this.r = i9;
        this.s = i10;
        int i16 = i11;
        if (i16 == -1) {
            i16 = 0;
        }
        this.t = i16;
        int i17 = i12;
        if (i17 == -1) {
            i17 = 0;
        }
        this.u = i17;
        this.v = i13;
        this.w = str6;
        this.x = i14;
        this.j = j2;
        this.h = list == null ? Collections.emptyList() : list;
        this.i = asc;
        this.y = awa;
    }

    aqe(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.d = parcel.readString();
        this.c = parcel.readInt();
        this.g = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.A = bdw.a(parcel) ? parcel.createByteArray() : null;
        this.z = parcel.readInt();
        this.p = (bdz) parcel.readParcelable(bdz.class.getClassLoader());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.j = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (asc) parcel.readParcelable(asc.class.getClassLoader());
        this.y = (awa) parcel.readParcelable(awa.class.getClassLoader());
    }

    public final aqe a(int i2) {
        int i3 = i2;
        aqe aqe = new aqe(this.a, this.b, this.e, this.f, this.d, this.c, i3, this.k, this.l, this.m, this.n, this.o, this.A, this.z, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.j, this.h, this.i, this.y);
        return aqe;
    }

    public final aqe a(long j2) {
        aqe aqe = new aqe(this.a, this.b, this.e, this.f, this.d, this.c, this.g, this.k, this.l, this.m, this.n, this.o, this.A, this.z, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, j2, this.h, this.i, this.y);
        return aqe;
    }

    public final aqe a(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, String str5) {
        String str6 = str;
        aqe aqe = new aqe(str6, str2, this.e, str3, str4, i2, this.g, i3, i4, this.m, this.n, this.o, this.A, this.z, this.p, this.q, this.r, this.s, this.t, this.u, i5, str5, this.x, this.j, this.h, this.i, this.y);
        return aqe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqe a(defpackage.aqe r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.f
            int r2 = defpackage.bdg.g(r2)
            java.lang.String r4 = r1.a
            java.lang.String r3 = r1.b
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            java.lang.String r3 = r0.b
        L_0x0016:
            r5 = r3
            java.lang.String r3 = r0.w
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001f
            if (r2 != r7) goto L_0x0026
        L_0x001f:
            java.lang.String r6 = r1.w
            if (r6 == 0) goto L_0x0026
            r25 = r6
            goto L_0x0028
        L_0x0026:
            r25 = r3
        L_0x0028:
            int r3 = r0.c
            r6 = -1
            if (r3 != r6) goto L_0x002f
            int r3 = r1.c
        L_0x002f:
            r9 = r3
            java.lang.String r3 = r0.d
            if (r3 != 0) goto L_0x0043
            java.lang.String r6 = r1.d
            java.lang.String r6 = defpackage.bdw.a(r6, r2)
            java.lang.String[] r8 = defpackage.bdw.i(r6)
            int r8 = r8.length
            if (r8 != r7) goto L_0x0043
            r8 = r6
            goto L_0x0044
        L_0x0043:
            r8 = r3
        L_0x0044:
            float r3 = r0.m
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0053
            r6 = 2
            if (r2 != r6) goto L_0x0053
            float r2 = r1.m
            r13 = r2
            goto L_0x0054
        L_0x0053:
            r13 = r3
        L_0x0054:
            int r2 = r0.v
            int r3 = r1.v
            r24 = r2 | r3
            asc r1 = r1.i
            asc r2 = r0.i
            asc r30 = defpackage.asc.a(r1, r2)
            aqe r1 = new aqe
            r3 = r1
            java.lang.String r6 = r0.e
            java.lang.String r7 = r0.f
            int r10 = r0.g
            int r11 = r0.k
            int r12 = r0.l
            int r14 = r0.n
            float r15 = r0.o
            byte[] r2 = r0.A
            r16 = r2
            int r2 = r0.z
            r17 = r2
            bdz r2 = r0.p
            r18 = r2
            int r2 = r0.q
            r19 = r2
            int r2 = r0.r
            r20 = r2
            int r2 = r0.s
            r21 = r2
            int r2 = r0.t
            r22 = r2
            int r2 = r0.u
            r23 = r2
            int r2 = r0.x
            r26 = r2
            r33 = r1
            long r1 = r0.j
            r27 = r1
            java.util.List<byte[]> r1 = r0.h
            r29 = r1
            awa r1 = r0.y
            r31 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqe.a(aqe):aqe");
    }

    public final aqe a(int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        aqe aqe = new aqe(this.a, this.b, this.e, this.f, this.d, this.c, this.g, this.k, this.l, this.m, this.n, this.o, this.A, this.z, this.p, this.q, this.r, this.s, i4, i5, this.v, this.w, this.x, this.j, this.h, this.i, this.y);
        return aqe;
    }

    public final aqe a(asc asc) {
        asc asc2 = asc;
        aqe aqe = new aqe(this.a, this.b, this.e, this.f, this.d, this.c, this.g, this.k, this.l, this.m, this.n, this.o, this.A, this.z, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.j, this.h, asc2, this.y);
        return aqe;
    }

    public final aqe a(awa awa) {
        awa awa2 = awa;
        aqe aqe = new aqe(this.a, this.b, this.e, this.f, this.d, this.c, this.g, this.k, this.l, this.m, this.n, this.o, this.A, this.z, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.j, this.h, this.i, awa2);
        return aqe;
    }

    public final int a() {
        int i2 = this.k;
        if (i2 != -1) {
            int i3 = this.l;
            if (i3 != -1) {
                return i2 * i3;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.e);
        sb.append(str);
        sb.append(this.f);
        sb.append(str);
        sb.append(this.d);
        sb.append(str);
        sb.append(this.c);
        sb.append(str);
        sb.append(this.w);
        sb.append(", [");
        sb.append(this.k);
        sb.append(str);
        sb.append(this.l);
        sb.append(str);
        sb.append(this.m);
        sb.append("], [");
        sb.append(this.q);
        sb.append(str);
        sb.append(this.r);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.B == 0) {
            String str = this.a;
            int i2 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.c) * 31) + this.k) * 31) + this.l) * 31) + this.q) * 31) + this.r) * 31;
            String str5 = this.w;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.x) * 31;
            asc asc = this.i;
            int hashCode6 = (hashCode5 + (asc == null ? 0 : asc.hashCode())) * 31;
            awa awa = this.y;
            int hashCode7 = (hashCode6 + (awa == null ? 0 : awa.hashCode())) * 31;
            String str6 = this.b;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.B = ((((((((((((((((((((hashCode7 + i2) * 31) + this.g) * 31) + ((int) this.j)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.o)) * 31) + this.n) * 31) + this.z) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v;
        }
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aqe aqe = (aqe) obj;
            int i2 = this.B;
            if (i2 != 0) {
                int i3 = aqe.B;
                if (!(i3 == 0 || i2 == i3)) {
                    return false;
                }
            }
            return this.c == aqe.c && this.g == aqe.g && this.k == aqe.k && this.l == aqe.l && Float.compare(this.m, aqe.m) == 0 && this.n == aqe.n && Float.compare(this.o, aqe.o) == 0 && this.z == aqe.z && this.q == aqe.q && this.r == aqe.r && this.s == aqe.s && this.t == aqe.t && this.u == aqe.u && this.j == aqe.j && this.v == aqe.v && bdw.a((Object) this.a, (Object) aqe.a) && bdw.a((Object) this.b, (Object) aqe.b) && bdw.a((Object) this.w, (Object) aqe.w) && this.x == aqe.x && bdw.a((Object) this.e, (Object) aqe.e) && bdw.a((Object) this.f, (Object) aqe.f) && bdw.a((Object) this.d, (Object) aqe.d) && bdw.a((Object) this.i, (Object) aqe.i) && bdw.a((Object) this.y, (Object) aqe.y) && bdw.a((Object) this.p, (Object) aqe.p) && Arrays.equals(this.A, aqe.A) && b(aqe);
        }
    }

    public final boolean b(aqe aqe) {
        if (this.h.size() != aqe.h.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!Arrays.equals((byte[]) this.h.get(i2), (byte[]) aqe.h.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.d);
        parcel.writeInt(this.c);
        parcel.writeInt(this.g);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        bdw.a(parcel, this.A != null);
        byte[] bArr = this.A;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.z);
        parcel.writeParcelable(this.p, i2);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeLong(this.j);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.h.get(i3));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.y, 0);
    }
}
