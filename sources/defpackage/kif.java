package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kif reason: default package */
final class kif extends kid {
    public static final Creator<kif> CREATOR = new Creator<kif>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kif[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kif(parcel.readString(), parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    kif(String str, int i) {
        super(str, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
