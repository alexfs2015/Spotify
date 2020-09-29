package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: uqo reason: default package */
final class uqo extends uqn {
    public static final Creator<uqo> CREATOR = new Creator<uqo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uqo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new uqo(z2, z, parcel.readInt(), parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    uqo(boolean z, boolean z2, int i, int i2) {
        super(z, z2, i, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(c());
        parcel.writeInt(this.c);
    }
}
