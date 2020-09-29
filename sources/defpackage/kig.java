package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: kig reason: default package */
final class kig extends kie {
    public static final Creator<kig> CREATOR = new Creator<kig>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kig[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(kii.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    kig(String str, String str2, String str3, List<kih> list) {
        super(str, str2, str3, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeList(this.d);
    }
}
