package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mnd reason: default package */
final class mnd extends mmx {
    public static final Creator<mnd> CREATOR = new Creator<mnd>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mnd[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mnd(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
        }
    };

    public final int describeContents() {
        return 0;
    }

    mnd(String str, String str2, String str3) {
        super(str, str2, str3);
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
