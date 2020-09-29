package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awi reason: default package */
public final class awi extends awp {
    public static final Creator<awi> CREATOR = new Creator<awi>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awi[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awi(parcel);
        }
    };
    private String a;
    private String b;
    private int d;
    private byte[] e;

    public awi(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = bArr;
    }

    awi(Parcel parcel) {
        super("APIC");
        this.a = (String) bdw.a(parcel.readString());
        this.b = (String) bdw.a(parcel.readString());
        this.d = parcel.readInt();
        this.e = (byte[]) bdw.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awi awi = (awi) obj;
            return this.d == awi.d && bdw.a((Object) this.a, (Object) awi.a) && bdw.a((Object) this.b, (Object) awi.b) && Arrays.equals(this.e, awi.e);
        }
    }

    public final int hashCode() {
        int i = (this.d + 527) * 31;
        String str = this.a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(": mimeType=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }
}
