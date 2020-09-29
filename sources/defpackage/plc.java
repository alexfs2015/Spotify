package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: plc reason: default package */
final class plc extends pla {
    public static final Creator<plc> CREATOR = new Creator<plc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new plc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new plc(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    plc(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
