package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: awz reason: default package */
public final class awz extends awv {
    public static final Creator<awz> CREATOR = new Creator<awz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awz(parcel, 0);
        }
    };
    private List<b> a;

    /* renamed from: awz$a */
    public static final class a {
        public final int a;
        public final long b;

        /* synthetic */ a(int i, long j, byte b2) {
            this(i, j);
        }

        a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    /* renamed from: awz$b */
    public static final class b {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<a> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private b(long j2, boolean z, boolean z2, boolean z3, List<a> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.a = j2;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j3;
            this.g = z4;
            this.h = j4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
        }

        b(Parcel parcel) {
            this.a = parcel.readLong();
            boolean z = false;
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(new a(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            if (parcel.readByte() == 1) {
                z = true;
            }
            this.g = z;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        static b a(bdj bdj) {
            long j2;
            int i2;
            int i3;
            int i4;
            boolean z;
            boolean z2;
            long j3;
            ArrayList arrayList;
            long g2 = bdj.g();
            boolean z3 = false;
            boolean z4 = (bdj.c() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z4) {
                int c2 = bdj.c();
                boolean z5 = (c2 & 128) != 0;
                z = (c2 & 64) != 0;
                boolean z6 = (c2 & 32) != 0;
                long g3 = z ? bdj.g() : -9223372036854775807L;
                if (!z) {
                    int c3 = bdj.c();
                    ArrayList arrayList3 = new ArrayList(c3);
                    for (int i5 = 0; i5 < c3; i5++) {
                        arrayList3.add(new a(bdj.c(), bdj.g(), 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z6) {
                    long c4 = (long) bdj.c();
                    if ((128 & c4) != 0) {
                        z3 = true;
                    }
                    j2 = ((((c4 & 1) << 32) | bdj.g()) * 1000) / 90;
                } else {
                    j2 = -9223372036854775807L;
                }
                int d2 = bdj.d();
                int c5 = bdj.c();
                i2 = bdj.c();
                j3 = g3;
                i4 = d2;
                i3 = c5;
                arrayList = arrayList2;
                boolean z7 = z5;
                z2 = z3;
                z3 = z7;
            } else {
                arrayList = arrayList2;
                j3 = -9223372036854775807L;
                z2 = false;
                z = false;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                j2 = -9223372036854775807L;
            }
            b bVar = new b(g2, z4, z3, z, arrayList, j3, z2, j2, i4, i3, i2);
            return bVar;
        }
    }

    /* synthetic */ awz(Parcel parcel, byte b2) {
        this(parcel);
    }

    private awz(List<b> list) {
        this.a = Collections.unmodifiableList(list);
    }

    private awz(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new b(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    static awz a(bdj bdj) {
        int c = bdj.c();
        ArrayList arrayList = new ArrayList(c);
        for (int i = 0; i < c; i++) {
            arrayList.add(b.a(bdj));
        }
        return new awz((List<b>) arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.a.get(i2);
            parcel.writeLong(bVar.a);
            parcel.writeByte(bVar.b ? (byte) 1 : 0);
            parcel.writeByte(bVar.c ? (byte) 1 : 0);
            parcel.writeByte(bVar.d ? (byte) 1 : 0);
            int size2 = bVar.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                a aVar = (a) bVar.f.get(i3);
                parcel.writeInt(aVar.a);
                parcel.writeLong(aVar.b);
            }
            parcel.writeLong(bVar.e);
            parcel.writeByte(bVar.g ? (byte) 1 : 0);
            parcel.writeLong(bVar.h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.j);
            parcel.writeInt(bVar.k);
        }
    }
}
