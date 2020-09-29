package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lqr reason: default package */
final class lqr extends lqk {
    public static final Creator<lqr> CREATOR = new Creator<lqr>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lqr[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lqr(parcel.readString(), parcel.readArrayList(lqs.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    lqr(String str, List<lqv> list) {
        super(str, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeList(this.b);
    }
}
