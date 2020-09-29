package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tzk reason: default package */
final class tzk extends tzh {
    public static final Creator<tzk> CREATOR = new Creator<tzk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tzk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tzk(parcel.readInt(), parcel.readInt(), (C0080b) parcel.readParcelable(b.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    tzk(int i, int i2, C0080b bVar) {
        super(i, i2, bVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
