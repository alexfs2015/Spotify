package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: kjm reason: default package */
final class kjm extends kji {
    public static final Creator<kjm> CREATOR = new Creator<kjm>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kjm(parcel.readArrayList(kjo.class.getClassLoader()), parcel.readString(), parcel.readString(), (kjp) parcel.readParcelable(kjo.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kjm[i];
        }
    };

    kjm(List<kjk> list, String str, String str2, kjp kjp) {
        super(list, str, str2, kjp);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
