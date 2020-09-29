package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qxe reason: default package */
final class qxe extends qxc {
    public static final Creator<qxe> CREATOR = new Creator<qxe>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new qxe[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new qxe(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    qxe(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
