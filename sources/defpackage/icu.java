package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: icu reason: default package */
final class icu extends ict {
    public static final Creator<icu> CREATOR = new Creator<icu>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new icu(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new icu[i];
        }
    };

    icu(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
