package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: kgf reason: default package */
final class kgf extends kgd {
    public static final Creator<kgf> CREATOR = new Creator<kgf>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kgf[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kgf(parcel.readString(), parcel.readArrayList(kgh.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    kgf(String str, List<kgl> list) {
        super(str, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeList(this.b);
    }
}
