package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: axj reason: default package */
public final class axj extends axg {
    public static final Creator<axj> CREATOR = new Creator<axj>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axj(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axj[i];
        }
    };
    private String a;
    private String b;

    axj(Parcel parcel) {
        super((String) ben.a(parcel.readString()));
        this.a = parcel.readString();
        this.b = (String) ben.a(parcel.readString());
    }

    public axj(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axj axj = (axj) obj;
            return this.c.equals(axj.c) && ben.a((Object) this.a, (Object) axj.a) && ben.a((Object) this.b, (Object) axj.b);
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
        sb.append(": value=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
