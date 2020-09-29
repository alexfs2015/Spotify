package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vob reason: default package */
final class vob extends vny {
    public static final Creator<vob> CREATOR = new Creator<vob>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            vob vob = new vob(readString, readString2, readString3, z, parcel.readInt() == 0 ? parcel.readString() : null);
            return vob;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vob[i];
        }
    };

    vob(String str, String str2, String str3, boolean z, String str4) {
        super(str, str2, str3, z, str4);
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
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.e);
    }
}
