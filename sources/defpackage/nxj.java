package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nxj reason: default package */
final class nxj extends nxf {
    public static final Creator<nxj> CREATOR = new Creator<nxj>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nxj[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            nxj nxj = new nxj(z, parcel.readLong(), parcel.readLong(), parcel.readFloat());
            return nxj;
        }
    };

    public final int describeContents() {
        return 0;
    }

    nxj(boolean z, long j, long j2, float f) {
        super(z, j, j2, f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.d);
    }
}
