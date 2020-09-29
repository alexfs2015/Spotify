package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: luq reason: default package */
final class luq extends luj {
    public static final Creator<luq> CREATOR = new Creator<luq>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new luq(parcel.readString(), parcel.readArrayList(lur.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new luq[i];
        }
    };

    luq(String str, List<luu> list) {
        super(str, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeList(this.b);
    }
}
