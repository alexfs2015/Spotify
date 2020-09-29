package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: kkc reason: default package */
final class kkc extends kka {
    public static final Creator<kkc> CREATOR = new Creator<kkc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kkc(parcel.readString(), parcel.readArrayList(kke.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kkc[i];
        }
    };

    kkc(String str, List<kkd> list) {
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
