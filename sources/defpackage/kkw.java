package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: kkw reason: default package */
final class kkw extends kku {
    public static final Creator<kkw> CREATOR = new Creator<kkw>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kkw(parcel.readString(), parcel.readArrayList(kky.class.getClassLoader()), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kkw[i];
        }
    };

    kkw(String str, List<kkz> list, String str2) {
        super(str, list, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeList(this.b);
        parcel.writeString(this.c);
    }
}
