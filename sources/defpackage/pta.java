package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pta reason: default package */
final class pta extends psx {
    public static final Creator<pta> CREATOR = new Creator<pta>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            pta pta = new pta(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
            return pta;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pta[i];
        }
    };

    pta(int i, String str, String str2, String str3, boolean z) {
        super(i, str, str2, str3, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
