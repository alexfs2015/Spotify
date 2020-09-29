package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axe reason: default package */
public final class axe extends axg {
    public static final Creator<axe> CREATOR = new Creator<axe>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axe(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axe[i];
        }
    };
    private String a;
    private String b;
    private String d;
    private byte[] e;

    axe(Parcel parcel) {
        super("GEOB");
        this.a = (String) ben.a(parcel.readString());
        this.b = (String) ben.a(parcel.readString());
        this.d = (String) ben.a(parcel.readString());
        this.e = (byte[]) ben.a(parcel.createByteArray());
    }

    public axe(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axe axe = (axe) obj;
            return ben.a((Object) this.a, (Object) axe.a) && ben.a((Object) this.b, (Object) axe.b) && ben.a((Object) this.d, (Object) axe.d) && Arrays.equals(this.e, axe.e);
        }
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(": mimeType=");
        sb.append(this.a);
        sb.append(", filename=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.d);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }
}
