package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aov reason: default package */
public final class aov extends apb<aov, Object> {
    public static final Creator<aov> CREATOR = new Creator<aov>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aov(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aov[i];
        }
    };
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    aov(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
