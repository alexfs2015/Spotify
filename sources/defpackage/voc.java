package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: voc reason: default package */
final class voc extends vnz {
    public static final Creator<voc> CREATOR = new Creator<voc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            voc voc = new voc(readString, readString2, readString3, z, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString());
            return voc;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new voc[i];
        }
    };

    voc(String str, String str2, String str3, boolean z, String str4, String str5) {
        super(str, str2, str3, z, str4, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        if (this.e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.e);
        }
        parcel.writeString(this.f);
    }
}
