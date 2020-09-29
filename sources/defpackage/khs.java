package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: khs reason: default package */
final class khs extends khq {
    public static final Creator<khs> CREATOR = new Creator<khs>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new khs(z);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new khs[i];
        }
    };

    khs(boolean z) {
        super(z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }
}
