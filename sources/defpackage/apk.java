package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apk reason: default package */
public final class apk extends apb<apk, Object> {
    public static final Creator<apk> CREATOR = new Creator<apk>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apk(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apk[i];
        }
    };
    public final apj a;
    public final String b;

    apk(Parcel parcel) {
        super(parcel);
        this.a = new apj(new a().a(parcel), 0);
        this.b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
        parcel.writeString(this.b);
    }
}
