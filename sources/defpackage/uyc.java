package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: uyc reason: default package */
final class uyc extends uyb {
    public static final Creator<uyc> CREATOR = new Creator<uyc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uyc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new uyc(parcel.readInt(), parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    uyc(int i, int i2) {
        super(i, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
