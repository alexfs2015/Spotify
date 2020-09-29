package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mnf reason: default package */
final class mnf extends mmz {
    public static final Creator<mnf> CREATOR = new Creator<mnf>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mnf[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mnf(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    mnf(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
