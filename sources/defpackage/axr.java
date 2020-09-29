package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axr reason: default package */
public final class axr extends axm {
    public static final Creator<axr> CREATOR = new Creator<axr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            axr axr = new axr(parcel.readLong(), parcel.readLong(), 0);
            return axr;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axr[i];
        }
    };
    private long a;
    private long b;

    private axr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* synthetic */ axr(long j, long j2, byte b2) {
        this(j, j2);
    }

    static long a(bea bea, long j) {
        long c = (long) bea.c();
        if ((128 & c) != 0) {
            return 8589934591L & ((((c & 1) << 32) | bea.g()) + j);
        }
        return -9223372036854775807L;
    }

    static axr a(bea bea, long j, bek bek) {
        long a2 = a(bea, j);
        return new axr(a2, bek.b(a2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
