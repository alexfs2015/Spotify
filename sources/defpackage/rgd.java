package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rgd reason: default package */
final class rgd extends rfz {
    public static final Creator<rgd> CREATOR = new Creator<rgd>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            rgd rgd = new rgd(readString, readString2, readString3, readString4, z2, z, parcel.readString());
            return rgd;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rgd[i];
        }
    };

    rgd(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        super(str, str2, str3, str4, z, z2, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
    }
}
