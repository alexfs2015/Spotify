package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kfz reason: default package */
final class kfz extends kfu {
    public static final Creator<kfz> CREATOR = new Creator<kfz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kfz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            kfz kfz = new kfz(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return kfz;
        }
    };

    public final int describeContents() {
        return 0;
    }

    kfz(String str, String str2, String str3, String str4, String str5) {
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
