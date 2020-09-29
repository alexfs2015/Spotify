package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: luv reason: default package */
final class luv extends lut {
    public static final Creator<luv> CREATOR = new Creator<luv>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            luv luv = new luv(readString, readString2, readString3, z, parcel.readString(), parcel.readString(), parcel.readArrayList(luu.class.getClassLoader()), parcel.readString());
            return luv;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new luv[i];
        }
    };

    luv(String str, String str2, String str3, boolean z, String str4, String str5, List<String> list, String str6) {
        super(str, str2, str3, z, str4, str5, list, str6);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeList(this.g);
        parcel.writeString(this.h);
    }
}
