package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
/* renamed from: aon reason: default package */
public final class aon implements api {
    @Deprecated
    public static final Creator<aon> CREATOR = new Creator<aon>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aon(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aon[i];
        }
    };
    final String a;
    final String b;

    @Deprecated
    aon(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
