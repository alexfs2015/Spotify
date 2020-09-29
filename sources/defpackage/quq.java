package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: quq reason: default package */
final class quq extends qup {
    public static final Creator<quq> CREATOR = new Creator<quq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new quq(readString, readString2, str);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new quq[i];
        }
    };

    quq(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.a);
        }
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        if (this.c == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.c);
    }
}
