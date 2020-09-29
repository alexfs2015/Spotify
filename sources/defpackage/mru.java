package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mru reason: default package */
final class mru extends mro {
    public static final Creator<mru> CREATOR = new Creator<mru>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mru(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mru[i];
        }
    };

    mru(String str, String str2) {
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
