package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mnb reason: default package */
final class mnb extends mmv {
    public static final Creator<mnb> CREATOR = new Creator<mnb>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mnb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mnb(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    mnb(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
