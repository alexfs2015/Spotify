package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ibb reason: default package */
final class ibb extends iba {
    public static final Creator<ibb> CREATOR = new Creator<ibb>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ibb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ibb ibb = new ibb(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return ibb;
        }
    };

    public final int describeContents() {
        return 0;
    }

    ibb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
