package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pwt reason: default package */
final class pwt extends pwr {
    public static final Creator<pwt> CREATOR = new Creator<pwt>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new pwt(z, (pwz) parcel.readParcelable(pwy.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new pwt[i];
        }
    };

    pwt(boolean z, pwz pwz) {
        super(z, pwz);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
    }
}
