package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qps reason: default package */
final class qps extends qpr {
    public static final Creator<qps> CREATOR = new Creator<qps>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String str = null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new qps(readString, readString2, readString3, str);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new qps[i];
        }
    };

    qps(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        parcel.writeString(this.c);
        if (this.d == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(this.d);
    }
}
