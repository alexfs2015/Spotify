package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kix reason: default package */
final class kix extends kiv {
    public static final Creator<kix> CREATOR = new Creator<kix>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kix[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kix(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    kix(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
