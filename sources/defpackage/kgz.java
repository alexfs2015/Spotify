package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: kgz reason: default package */
final class kgz extends kgv {
    public static final Creator<kgz> CREATOR = new Creator<kgz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kgz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kgz(parcel.readArrayList(khb.class.getClassLoader()), parcel.readString(), parcel.readString(), (khc) parcel.readParcelable(khb.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    kgz(List<kgx> list, String str, String str2, khc khc) {
        super(list, str, str2, khc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
