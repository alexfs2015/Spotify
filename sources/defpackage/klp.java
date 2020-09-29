package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: klp reason: default package */
final class klp extends klm {
    public static final Creator<klp> CREATOR = new Creator<klp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new klp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(kls.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new klp[i];
        }
    };

    klp(String str, String str2, String str3, List<klq> list) {
        super(str, str2, str3, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeList(this.d);
    }
}
