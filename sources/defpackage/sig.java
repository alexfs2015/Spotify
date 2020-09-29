package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sig reason: default package */
final class sig extends sif {
    public static final Creator<sig> CREATOR = new Creator<sig>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new sig[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new sig(parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    sig(String str) {
        super(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
