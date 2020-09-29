package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: psz reason: default package */
final class psz extends psw {
    public static final Creator<psz> CREATOR = new Creator<psz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new psz(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new psz[i];
        }
    };

    psz(int i, String str, String str2) {
        super(i, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
