package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gja reason: default package */
final class gja extends giz {
    public static final Creator<gja> CREATOR = new Creator<gja>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gja[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new gja((udr) parcel.readParcelable(gjb.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    gja(udr udr) {
        super(udr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
