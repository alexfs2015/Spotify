package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: plb reason: default package */
final class plb extends pkz {
    public static final Creator<plb> CREATOR = new Creator<plb>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new plb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new plb(parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    plb(String str) {
        super(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
