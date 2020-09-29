package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ulq reason: default package */
final class ulq extends ull {
    public static final Creator<ulq> CREATOR = new Creator<ulq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ulq((umh) parcel.readParcelable(uly.class.getClassLoader()), (ulz) parcel.readParcelable(uly.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ulq[i];
        }
    };

    ulq(umh umh, ulz ulz) {
        super(umh, ulz);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
