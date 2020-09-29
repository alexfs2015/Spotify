package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rft reason: default package */
final class rft extends rfr {
    public static final Creator<rft> CREATOR = new Creator<rft>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new rft(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rft[i];
        }
    };

    rft(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
