package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: khv reason: default package */
final class khv extends khu {
    public static final Creator<khv> CREATOR = new Creator<khv>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new khv[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            khv khv = new khv(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
            return khv;
        }
    };

    public final int describeContents() {
        return 0;
    }

    khv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        super(str, str2, str3, str4, str5, str6, str7, str8, z);
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
        parcel.writeInt(this.i ? 1 : 0);
    }
}
