package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: odx reason: default package */
final class odx extends odt {
    public static final Creator<odx> CREATOR = new Creator<odx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            odx odx = new odx(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1);
            return odx;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new odx[i];
        }
    };

    odx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(z, z2, z3, z4, z5, z6, z7);
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
        parcel.writeInt(this.g ? 1 : 0);
    }
}
