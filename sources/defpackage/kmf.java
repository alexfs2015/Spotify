package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kmf reason: default package */
final class kmf extends kme {
    public static final Creator<kmf> CREATOR = new Creator<kmf>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kmf(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kmf[i];
        }
    };

    kmf(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(b());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
