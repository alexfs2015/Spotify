package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ohj reason: default package */
final class ohj extends ohg {
    public static final Creator<ohj> CREATOR = new Creator<ohj>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ohj((gmc) parcel.readParcelable(ohl.class.getClassLoader()), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ohj[i];
        }
    };

    ohj(gmc gmc, String str) {
        super(gmc, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
