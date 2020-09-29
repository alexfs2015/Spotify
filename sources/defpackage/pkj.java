package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pkj reason: default package */
final class pkj extends pkg {
    public static final Creator<pkj> CREATOR = new Creator<pkj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pkj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new pkj(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    pkj(int i, String str, String str2, String str3) {
        super(i, str, str2, str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
