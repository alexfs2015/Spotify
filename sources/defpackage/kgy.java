package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kgy reason: default package */
final class kgy extends kgu {
    public static final Creator<kgy> CREATOR = new Creator<kgy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kgy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kgy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    kgy(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(b());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
