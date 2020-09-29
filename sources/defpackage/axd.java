package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axd reason: default package */
public final class axd extends axg {
    public static final Creator<axd> CREATOR = new Creator<axd>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axd(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axd[i];
        }
    };
    public final String a;
    public final String b;
    private String d;

    axd(Parcel parcel) {
        super("COMM");
        this.d = (String) ben.a(parcel.readString());
        this.a = (String) ben.a(parcel.readString());
        this.b = (String) ben.a(parcel.readString());
    }

    public axd(String str, String str2, String str3) {
        super("COMM");
        this.d = str;
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axd axd = (axd) obj;
            return ben.a((Object) this.a, (Object) axd.a) && ben.a((Object) this.d, (Object) axd.d) && ben.a((Object) this.b, (Object) axd.b);
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
