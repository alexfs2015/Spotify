package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: awm reason: default package */
public final class awm extends awp {
    public static final Creator<awm> CREATOR = new Creator<awm>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awm[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awm(parcel);
        }
    };
    public final String a;
    public final String b;
    private String d;

    public awm(String str, String str2, String str3) {
        super("COMM");
        this.d = str;
        this.a = str2;
        this.b = str3;
    }

    awm(Parcel parcel) {
        super("COMM");
        this.d = (String) bdw.a(parcel.readString());
        this.a = (String) bdw.a(parcel.readString());
        this.b = (String) bdw.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awm awm = (awm) obj;
            return bdw.a((Object) this.a, (Object) awm.a) && bdw.a((Object) this.d, (Object) awm.d) && bdw.a((Object) this.b, (Object) awm.b);
        }
    }

    public final int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.a;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(": language=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.a);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.b);
    }
}
