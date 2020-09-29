package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gmb reason: default package */
final class gmb extends gma {
    public static final Creator<gmb> CREATOR = new Creator<gmb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new gmb(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gmb[i];
        }
    };

    gmb(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
