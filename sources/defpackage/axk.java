package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axk reason: default package */
public final class axk extends axg {
    public static final Creator<axk> CREATOR = new Creator<axk>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axk(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axk[i];
        }
    };
    private String a;
    private String b;

    axk(Parcel parcel) {
        super((String) ben.a(parcel.readString()));
        this.a = parcel.readString();
        this.b = (String) ben.a(parcel.readString());
    }

    public axk(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axk axk = (axk) obj;
            return this.c.equals(axk.c) && ben.a((Object) this.a, (Object) axk.a) && ben.a((Object) this.b, (Object) axk.b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(": url=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
