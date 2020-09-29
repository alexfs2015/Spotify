package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tyt reason: default package */
final class tyt extends tyo {
    public static final Creator<tyt> CREATOR = new Creator<tyt>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tyt[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tyt((tyz) parcel.readParcelable(tzb.class.getClassLoader()), (tyy) parcel.readParcelable(tzb.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    tyt(tyz tyz, tyy tyy) {
        super(tyz, tyy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
