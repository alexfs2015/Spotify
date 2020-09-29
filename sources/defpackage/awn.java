package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awn reason: default package */
public final class awn extends awp {
    public static final Creator<awn> CREATOR = new Creator<awn>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awn[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awn(parcel);
        }
    };
    private String a;
    private String b;
    private String d;
    private byte[] e;

    public awn(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = bArr;
    }

    awn(Parcel parcel) {
        super("GEOB");
        this.a = (String) bdw.a(parcel.readString());
        this.b = (String) bdw.a(parcel.readString());
        this.d = (String) bdw.a(parcel.readString());
        this.e = (byte[]) bdw.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awn awn = (awn) obj;
            return bdw.a((Object) this.a, (Object) awn.a) && bdw.a((Object) this.b, (Object) awn.b) && bdw.a((Object) this.d, (Object) awn.d) && Arrays.equals(this.e, awn.e);
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
