package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hkq reason: default package */
public final class hkq implements Parcelable {
    public static final Creator<hkq> CREATOR = new Creator<hkq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hkq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new hkq(parcel);
        }
    };
    public String a;
    public String b;
    public String c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    protected hkq(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
