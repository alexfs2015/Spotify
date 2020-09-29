package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kgg reason: default package */
final class kgg extends kge {
    public static final Creator<kgg> CREATOR = new Creator<kgg>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kgg[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            kgg kgg = new kgg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return kgg;
        }
    };

    public final int describeContents() {
        return 0;
    }

    kgg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
