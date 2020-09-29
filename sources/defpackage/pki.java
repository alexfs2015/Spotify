package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pki reason: default package */
final class pki extends pkf {
    public static final Creator<pki> CREATOR = new Creator<pki>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pki[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            pki pki = new pki(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
            return pki;
        }
    };

    public final int describeContents() {
        return 0;
    }

    pki(int i, String str, String str2, String str3, boolean z) {
        super(i, str, str2, str3, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
