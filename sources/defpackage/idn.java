package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: idn reason: default package */
final class idn extends idm {
    public static final Creator<idn> CREATOR = new Creator<idn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            idn idn = new idn(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return idn;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new idn[i];
        }
    };

    idn(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
