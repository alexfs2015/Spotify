package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tyu reason: default package */
final class tyu extends typ {
    public static final Creator<tyu> CREATOR = new Creator<tyu>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tyu[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tyu(parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    tyu(int i) {
        super(i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
