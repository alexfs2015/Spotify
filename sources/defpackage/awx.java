package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: awx reason: default package */
public final class awx extends awv {
    public static final Creator<awx> CREATOR = new Creator<awx>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awx[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awx(parcel, 0);
        }
    };
    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private long f;
    private long g;
    private List<a> h;
    private boolean i;
    private long j;
    private int k;
    private int l;
    private int m;

    /* renamed from: awx$a */
    public static final class a {
        public final int a;
        public final long b;
        public final long c;

        /* synthetic */ a(int i, long j, long j2, byte b2) {
            this(i, j, j2);
        }

        a(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    /* synthetic */ awx(Parcel parcel, byte b2) {
        this(parcel);
    }

    private awx(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<a> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.a = j2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j3;
        this.g = j4;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j5;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    private awx(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = false;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            a aVar = new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
            arrayList.add(aVar);
        }
        this.h = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.i = z;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    static awx a(bdj bdj, long j2, bdt bdt) {
        boolean z;
        int i2;
        int i3;
        int i4;
        long j3;
        boolean z2;
        List list;
        long j4;
        boolean z3;
        boolean z4;
        List list2;
        boolean z5;
        long j5;
        bdt bdt2 = bdt;
        long g2 = bdj.g();
        boolean z6 = (bdj.c() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int c2 = bdj.c();
            boolean z7 = (c2 & 128) != 0;
            boolean z8 = (c2 & 64) != 0;
            boolean z9 = (c2 & 32) != 0;
            boolean z10 = (c2 & 16) != 0;
            long a2 = (!z8 || z10) ? -9223372036854775807L : axa.a(bdj, j2);
            if (!z8) {
                int c3 = bdj.c();
                list2 = new ArrayList(c3);
                for (int i5 = 0; i5 < c3; i5++) {
                    int c4 = bdj.c();
                    long a3 = !z10 ? axa.a(bdj, j2) : -9223372036854775807L;
                    a aVar = new a(c4, a3, bdt2.b(a3), 0);
                    list2.add(aVar);
                }
            } else {
                list2 = emptyList;
            }
            if (z9) {
                long c5 = (long) bdj.c();
                z5 = (128 & c5) != 0;
                j5 = ((((c5 & 1) << 32) | bdj.g()) * 1000) / 90;
            } else {
                j5 = -9223372036854775807L;
                z5 = false;
            }
            int d2 = bdj.d();
            i3 = bdj.c();
            i2 = bdj.c();
            z4 = z7;
            z = z8;
            list = list2;
            boolean z11 = z5;
            i4 = d2;
            long j6 = j5;
            z3 = z10;
            j4 = a2;
            z2 = z11;
            j3 = j6;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j4 = -9223372036854775807L;
            z2 = false;
            j3 = -9223372036854775807L;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            z = false;
        }
        awx awx = new awx(g2, z6, z4, z, z3, j4, bdt2.b(j4), list, z2, j3, i4, i3, i2);
        return awx;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeByte(this.e ? (byte) 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) this.h.get(i3);
            parcel.writeInt(aVar.a);
            parcel.writeLong(aVar.b);
            parcel.writeLong(aVar.c);
        }
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
