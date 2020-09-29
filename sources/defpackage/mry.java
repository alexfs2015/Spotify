package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mry reason: default package */
final class mry extends mrs {
    public static final Creator<mry> CREATOR = new Creator<mry>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mry(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mry[i];
        }
    };

    mry(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
