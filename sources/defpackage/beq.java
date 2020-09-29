package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: beq reason: default package */
public final class beq implements Parcelable {
    public static final Creator<beq> CREATOR = new Creator<beq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new beq(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new beq[0];
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public beq(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    beq(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = ben.a(parcel) ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            beq beq = (beq) obj;
            return this.a == beq.a && this.b == beq.b && this.c == beq.c && Arrays.equals(this.d, beq.d);
        }
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.a);
        String str = ", ";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.c);
        sb.append(str);
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        ben.a(parcel, this.d != null);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
