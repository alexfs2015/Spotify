package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: iai reason: default package */
final class iai extends iah {
    public static final Creator<iai> CREATOR = new Creator<iai>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new iai[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new iai(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    iai(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
