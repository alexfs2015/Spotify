package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kkb reason: default package */
final class kkb extends kjz {
    public static final Creator<kkb> CREATOR = new Creator<kkb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kkb(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kkb[i];
        }
    };

    kkb(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
