package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kiy reason: default package */
final class kiy extends kiw {
    public static final Creator<kiy> CREATOR = new Creator<kiy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kiy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kiy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    kiy(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(b());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
