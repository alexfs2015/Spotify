package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mrx reason: default package */
final class mrx extends mrr {
    public static final Creator<mrx> CREATOR = new Creator<mrx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mrx(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mrx[i];
        }
    };

    mrx(String str, String str2) {
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
