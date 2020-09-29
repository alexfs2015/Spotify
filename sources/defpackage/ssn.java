package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ssn reason: default package */
final class ssn extends ssm {
    public static final Creator<ssn> CREATOR = new Creator<ssn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ssn(parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ssn[i];
        }
    };

    ssn(String str) {
        super(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
