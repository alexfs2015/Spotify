package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ptt reason: default package */
final class ptt extends ptr {
    public static final Creator<ptt> CREATOR = new Creator<ptt>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ptt(parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ptt[i];
        }
    };

    ptt(String str) {
        super(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
