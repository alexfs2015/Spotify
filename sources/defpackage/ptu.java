package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ptu reason: default package */
final class ptu extends pts {
    public static final Creator<ptu> CREATOR = new Creator<ptu>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ptu(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ptu[i];
        }
    };

    ptu(String str, String str2) {
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
