package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: soi reason: default package */
final class soi extends soh {
    public static final Creator<soi> CREATOR = new Creator<soi>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new soi[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new soi((sih) parcel.readParcelable(soj.class.getClassLoader()), parcel.readArrayList(soj.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    soi(sih sih, List<String> list) {
        super(sih, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
    }
}
