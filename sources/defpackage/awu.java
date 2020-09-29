package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: awu reason: default package */
public final class awu extends awv {
    public static final Creator<awu> CREATOR = new Creator<awu>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awu[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awu(parcel, 0);
        }
    };
    private long a;
    private long b;
    private byte[] c;

    /* synthetic */ awu(Parcel parcel, byte b2) {
        this(parcel);
    }

    private awu(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    private awu(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = new byte[parcel.readInt()];
        parcel.readByteArray(this.c);
    }

    static awu a(bdj bdj, int i, long j) {
        long g = bdj.g();
        byte[] bArr = new byte[(i - 4)];
        bdj.a(bArr, 0, bArr.length);
        awu awu = new awu(g, bArr, j);
        return awu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }
}
