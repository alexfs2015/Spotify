package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pkh reason: default package */
final class pkh extends pke {
    public static final Creator<pkh> CREATOR = new Creator<pkh>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pkh[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new pkh(parcel.readInt(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    pkh(int i, String str, String str2) {
        super(i, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
