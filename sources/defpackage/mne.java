package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: mne reason: default package */
final class mne extends mmy {
    public static final Creator<mne> CREATOR = new Creator<mne>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mne[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mne(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    mne(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
