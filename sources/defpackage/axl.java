package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axl reason: default package */
public final class axl extends axm {
    public static final Creator<axl> CREATOR = new Creator<axl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axl(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axl[i];
        }
    };
    private long a;
    private long b;
    private byte[] c;

    private axl(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    private axl(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = new byte[parcel.readInt()];
        parcel.readByteArray(this.c);
    }

    /* synthetic */ axl(Parcel parcel, byte b2) {
        this(parcel);
    }

    static axl a(bea bea, int i, long j) {
        long g = bea.g();
        byte[] bArr = new byte[(i - 4)];
        bea.a(bArr, 0, bArr.length);
        axl axl = new axl(g, bArr, j);
        return axl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }
}
