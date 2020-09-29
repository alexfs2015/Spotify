package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axa reason: default package */
public final class axa extends awv {
    public static final Creator<axa> CREATOR = new Creator<axa>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axa[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            axa axa = new axa(parcel.readLong(), parcel.readLong(), 0);
            return axa;
        }
    };
    private long a;
    private long b;

    /* synthetic */ axa(long j, long j2, byte b2) {
        this(j, j2);
    }

    private axa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static axa a(bdj bdj, long j, bdt bdt) {
        long a2 = a(bdj, j);
        return new axa(a2, bdt.b(a2));
    }

    static long a(bdj bdj, long j) {
        long c = (long) bdj.c();
        if ((128 & c) != 0) {
            return 8589934591L & ((((c & 1) << 32) | bdj.g()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
