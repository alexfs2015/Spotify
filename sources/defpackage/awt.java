package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: awt reason: default package */
public final class awt extends awp {
    public static final Creator<awt> CREATOR = new Creator<awt>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awt[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awt(parcel);
        }
    };
    private String a;
    private String b;

    public awt(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    awt(Parcel parcel) {
        super((String) bdw.a(parcel.readString()));
        this.a = parcel.readString();
        this.b = (String) bdw.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awt awt = (awt) obj;
            return this.c.equals(awt.c) && bdw.a((Object) this.a, (Object) awt.a) && bdw.a((Object) this.b, (Object) awt.b);
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
