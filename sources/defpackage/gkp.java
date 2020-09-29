package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gkp reason: default package */
final class gkp extends gko {
    public static final Creator<gkp> CREATOR = new Creator<gkp>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gkp[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new gkp(parcel.readString(), parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    gkp(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
