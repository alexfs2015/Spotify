package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ulp reason: default package */
final class ulp extends ulk {
    public static final Creator<ulp> CREATOR = new Creator<ulp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ulp(parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ulp[i];
        }
    };

    ulp(int i) {
        super(i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
