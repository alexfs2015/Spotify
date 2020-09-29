package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: huv reason: default package */
public final class huv extends huu {
    public static final Creator<huv> CREATOR = new Creator<huv>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            huv huv = new huv(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            return huv;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new huv[i];
        }
    };
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final int g;

    public huv(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        super(str5);
        this.e = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.d = hut.a(str6);
        this.g = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        parcel.writeInt(this.g);
    }
}
