package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: iem reason: default package */
final class iem extends iel {
    public static final Creator<iem> CREATOR = new Creator<iem>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            iem iem = new iem(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return iem;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new iem[i];
        }
    };

    iem(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
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
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.d);
        }
        if (this.e == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.e);
    }
}
