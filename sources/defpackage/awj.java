package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awj reason: default package */
public final class awj extends awp {
    public static final Creator<awj> CREATOR = new Creator<awj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awj(parcel);
        }
    };
    private byte[] a;

    public awj(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    awj(Parcel parcel) {
        super((String) bdw.a(parcel.readString()));
        this.a = (byte[]) bdw.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awj awj = (awj) obj;
            return this.c.equals(awj.c) && Arrays.equals(this.a, awj.a);
        }
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.a);
    }
}
