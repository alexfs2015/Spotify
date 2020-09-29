package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axi reason: default package */
public final class axi extends axg {
    public static final Creator<axi> CREATOR = new Creator<axi>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axi(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axi[i];
        }
    };
    public final String a;
    public final byte[] b;

    axi(Parcel parcel) {
        super("PRIV");
        this.a = (String) ben.a(parcel.readString());
        this.b = (byte[]) ben.a(parcel.createByteArray());
    }

    public axi(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axi axi = (axi) obj;
            return ben.a((Object) this.a, (Object) axi.a) && Arrays.equals(this.b, axi.b);
        }
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(": owner=");
        sb.append(this.a);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}
