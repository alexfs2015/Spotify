package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: hxw reason: default package */
final class hxw extends hxv {
    public static final Creator<hxw> CREATOR = new Creator<hxw>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hxw[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            hxw hxw = new hxw(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return hxw;
        }
    };

    public final int describeContents() {
        return 0;
    }

    hxw(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
