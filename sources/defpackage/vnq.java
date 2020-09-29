package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vnq reason: default package */
final class vnq extends vnp {
    public static final Creator<vnq> CREATOR = new Creator<vnq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vnq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new vnq(readString, z, (vns) parcel.readParcelable(vns.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    vnq(String str, boolean z, vns vns) {
        super(str, z, vns);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
