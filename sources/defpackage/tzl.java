package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tzl reason: default package */
final class tzl extends tzi {
    public static final Creator<tzl> CREATOR = new Creator<tzl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tzl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tzl(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    tzl(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
