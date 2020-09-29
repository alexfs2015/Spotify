package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ulo reason: default package */
final class ulo extends ulj {
    public static final Creator<ulo> CREATOR = new Creator<ulo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ulo((ulu) parcel.readParcelable(ulw.class.getClassLoader()), (ult) parcel.readParcelable(ulw.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ulo[i];
        }
    };

    ulo(ulu ulu, ult ult) {
        super(ulu, ult);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
