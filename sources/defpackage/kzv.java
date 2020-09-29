package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kzv reason: default package */
final class kzv extends kzu {
    public static final Creator<kzv> CREATOR = new Creator<kzv>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            kzv kzv = new kzv(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readLong(), (Intent) parcel.readParcelable(kzw.class.getClassLoader()), (hct) parcel.readParcelable(kzw.class.getClassLoader()));
            return kzv;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kzv[i];
        }
    };

    kzv(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, Intent intent, hct hct) {
        super(str, str2, str3, str4, str5, str6, str7, j, intent, hct);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.d);
        }
        if (this.e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.e);
        }
        if (this.f == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f);
        }
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
    }
}
