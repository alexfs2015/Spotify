package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: syp reason: default package */
final class syp extends syo {
    public static final Creator<syp> CREATOR = new Creator<syp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new syp((sso) parcel.readParcelable(syq.class.getClassLoader()), parcel.readArrayList(syq.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new syp[i];
        }
    };

    syp(sso sso, List<String> list) {
        super(sso, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
    }
}
