package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gkl reason: default package */
final class gkl extends gkk {
    public static final Creator<gkl> CREATOR = new Creator<gkl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new gkl((uqm) parcel.readParcelable(gkm.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gkl[i];
        }
    };

    gkl(uqm uqm) {
        super(uqm);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
