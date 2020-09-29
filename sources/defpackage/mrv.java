package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mrv reason: default package */
final class mrv extends mrp {
    public static final Creator<mrv> CREATOR = new Creator<mrv>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mrv(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mrv[i];
        }
    };

    mrv(String str, String str2) {
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
