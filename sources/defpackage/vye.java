package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vye reason: default package */
final class vye extends vyc {
    public static final Creator<vye> CREATOR = new Creator<vye>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            vye vye = new vye(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1);
            return vye;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vye[i];
        }
    };

    vye(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(z, z2, z3, z4, z5, z6);
    }

    public final int describeContents() {
        return 0;
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
