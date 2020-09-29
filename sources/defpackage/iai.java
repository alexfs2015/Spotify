package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: iai reason: default package */
final class iai extends iah {
    public static final Creator<iai> CREATOR = new Creator<iai>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            iai iai = new iai(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return iai;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new iai[i];
        }
    };

    iai(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
