package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: umg reason: default package */
final class umg extends umd {
    public static final Creator<umg> CREATOR = new Creator<umg>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new umg(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new umg[i];
        }
    };

    umg(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
