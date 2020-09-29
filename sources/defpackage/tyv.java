package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tyv reason: default package */
final class tyv extends tyq {
    public static final Creator<tyv> CREATOR = new Creator<tyv>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tyv[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tyv((tzm) parcel.readParcelable(tzd.class.getClassLoader()), (tze) parcel.readParcelable(tzd.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    tyv(tzm tzm, tze tze) {
        super(tzm, tze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
