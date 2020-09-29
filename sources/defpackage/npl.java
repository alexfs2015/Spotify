package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: npl reason: default package */
final class npl extends npk {
    public static final Creator<npl> CREATOR = new Creator<npl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new npl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new npl(readString, readString2, readString3, z);
        }
    };

    public final int describeContents() {
        return 0;
    }

    npl(String str, String str2, String str3, boolean z) {
        super(str, str2, str3, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
