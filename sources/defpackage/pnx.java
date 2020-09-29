package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pnx reason: default package */
final class pnx extends pnv {
    public static final Creator<pnx> CREATOR = new Creator<pnx>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pnx[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new pnx(z, (pod) parcel.readParcelable(poc.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    pnx(boolean z, pod pod) {
        super(z, pod);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
    }
}
