package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: lqa reason: default package */
final class lqa extends lpz {
    public static final Creator<lqa> CREATOR = new Creator<lqa>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String str = null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new lqa(readString, readString2, readString3, str);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lqa[i];
        }
    };

    lqa(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        if (this.c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
        if (this.d == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.d);
    }
}
