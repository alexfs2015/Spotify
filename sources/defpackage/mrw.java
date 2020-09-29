package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mrw reason: default package */
final class mrw extends mrq {
    public static final Creator<mrw> CREATOR = new Creator<mrw>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mrw(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mrw[i];
        }
    };

    mrw(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        if (this.c == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.c);
    }
}
