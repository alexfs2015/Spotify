package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: umf reason: default package */
final class umf extends umc {
    public static final Creator<umf> CREATOR = new Creator<umf>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new umf(parcel.readInt(), parcel.readInt(), (C0082b) parcel.readParcelable(b.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new umf[i];
        }
    };

    umf(int i, int i2, C0082b bVar) {
        super(i, i2, bVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
