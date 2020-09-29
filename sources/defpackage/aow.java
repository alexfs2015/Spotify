package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aow reason: default package */
public final class aow extends aon<aow, Object> {
    public static final Creator<aow> CREATOR = new Creator<aow>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aow[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aow(parcel);
        }
    };
    public final aov a;
    public final String b;

    public final int describeContents() {
        return 0;
    }

    aow(Parcel parcel) {
        super(parcel);
        this.a = new aov(new a().a(parcel), 0);
        this.b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
        parcel.writeString(this.b);
    }
}
