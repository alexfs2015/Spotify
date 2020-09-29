package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ica reason: default package */
final class ica extends ibz {
    public static final Creator<ica> CREATOR = new Creator<ica>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ica[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ica ica = new ica(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return ica;
        }
    };

    public final int describeContents() {
        return 0;
    }

    ica(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
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
