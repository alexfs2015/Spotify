package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kjl reason: default package */
final class kjl extends kjh {
    public static final Creator<kjl> CREATOR = new Creator<kjl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kjl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kjl[i];
        }
    };

    kjl(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(b());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
