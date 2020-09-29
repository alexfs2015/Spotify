package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: prn reason: default package */
final class prn extends prm {
    public static final Creator<prn> CREATOR = new Creator<prn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new prn(parcel.readString(), parcel.readString(), (prg) parcel.readParcelable(prr.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new prn[i];
        }
    };

    prn(String str, String str2, prg prg) {
        super(str, str2, prg);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
