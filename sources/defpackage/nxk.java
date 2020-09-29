package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nxk reason: default package */
final class nxk extends nxg {
    public static final Creator<nxk> CREATOR = new Creator<nxk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nxk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            nxk nxk = new nxk(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1);
            return nxk;
        }
    };

    public final int describeContents() {
        return 0;
    }

    nxk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(z, z2, z3, z4, z5, z6, z7);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
