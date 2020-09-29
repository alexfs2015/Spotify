package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awr reason: default package */
public final class awr extends awp {
    public static final Creator<awr> CREATOR = new Creator<awr>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awr[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awr(parcel);
        }
    };
    public final String a;
    public final byte[] b;

    public awr(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    awr(Parcel parcel) {
        super("PRIV");
        this.a = (String) bdw.a(parcel.readString());
        this.b = (byte[]) bdw.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awr awr = (awr) obj;
            return bdw.a((Object) this.a, (Object) awr.a) && Arrays.equals(this.b, awr.b);
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
