package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mnc reason: default package */
final class mnc extends mmw {
    public static final Creator<mnc> CREATOR = new Creator<mnc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mnc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mnc(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    mnc(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
