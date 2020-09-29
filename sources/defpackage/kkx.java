package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kkx reason: default package */
final class kkx extends kkv {
    public static final Creator<kkx> CREATOR = new Creator<kkx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kkx(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kkx[i];
        }
    };

    kkx(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
        parcel.writeString(this.a);
    }
}
