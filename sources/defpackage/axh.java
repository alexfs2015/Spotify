package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axh reason: default package */
public final class axh extends axg {
    public static final Creator<axh> CREATOR = new Creator<axh>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axh(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axh[i];
        }
    };
    public final String a;
    public final String b;
    public final String d;

    axh(Parcel parcel) {
        super("----");
        this.a = (String) ben.a(parcel.readString());
        this.b = (String) ben.a(parcel.readString());
        this.d = (String) ben.a(parcel.readString());
    }

    public axh(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axh axh = (axh) obj;
            return ben.a((Object) this.b, (Object) axh.b) && ben.a((Object) this.a, (Object) axh.a) && ben.a((Object) this.d, (Object) axh.d);
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
