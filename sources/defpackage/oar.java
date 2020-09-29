package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oar reason: default package */
final class oar extends oao {
    public static final Creator<oar> CREATOR = new Creator<oar>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new oar[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new oar((gkq) parcel.readParcelable(oas.class.getClassLoader()), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    oar(gkq gkq, String str) {
        super(gkq, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
