package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vky reason: default package */
final class vky extends vkw {
    public static final Creator<vky> CREATOR = new Creator<vky>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vky[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vky vky = new vky(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1);
            return vky;
        }
    };

    public final int describeContents() {
        return 0;
    }

    vky(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(z, z2, z3, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
