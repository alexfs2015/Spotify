package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: klo reason: default package */
final class klo extends kll {
    public static final Creator<klo> CREATOR = new Creator<klo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new klo(parcel.readString(), parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new klo[i];
        }
    };

    klo(String str, int i) {
        super(str, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
