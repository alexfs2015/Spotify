package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: awq reason: default package */
public final class awq extends awp {
    public static final Creator<awq> CREATOR = new Creator<awq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awq(parcel);
        }
    };
    public final String a;
    public final String b;
    public final String d;

    public awq(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.d = str3;
    }

    awq(Parcel parcel) {
        super("----");
        this.a = (String) bdw.a(parcel.readString());
        this.b = (String) bdw.a(parcel.readString());
        this.d = (String) bdw.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awq awq = (awq) obj;
            return bdw.a((Object) this.b, (Object) awq.b) && bdw.a((Object) this.a, (Object) awq.a) && bdw.a((Object) this.d, (Object) awq.d);
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
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(": domain=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.d);
    }
}
