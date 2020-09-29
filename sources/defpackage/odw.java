package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: odw reason: default package */
final class odw extends ods {
    public static final Creator<odw> CREATOR = new Creator<odw>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            odw odw = new odw(z, parcel.readLong(), parcel.readLong(), parcel.readFloat());
            return odw;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new odw[i];
        }
    };

    odw(boolean z, long j, long j2, float f) {
        super(z, j, j2, f);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.d);
    }
}
