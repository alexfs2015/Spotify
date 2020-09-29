package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qxp reason: default package */
public final class qxp extends qxl {
    public static final Creator<qxp> CREATOR = new Creator<qxp>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new qxp[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            qxp qxp = new qxp(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString());
            return qxp;
        }
    };

    public final int describeContents() {
        return 0;
    }

    public qxp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, String str2) {
        super(z, z2, z3, z4, z5, z6, z7, z8, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        if (this.i == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.i);
        }
        parcel.writeString(this.j);
    }
}
