package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: hsd reason: default package */
public final class hsd extends hsc {
    public static final Creator<hsd> CREATOR = new Creator<hsd>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hsd[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            hsd hsd = new hsd(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            return hsd;
        }
    };
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final int g;

    public final int describeContents() {
        return 0;
    }

    public hsd(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        super(str5);
        this.e = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.d = hsb.a(str6);
        this.g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        parcel.writeInt(this.g);
    }
}
