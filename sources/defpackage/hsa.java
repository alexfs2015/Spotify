package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hsa reason: default package */
public final class hsa implements Parcelable, hse {
    public static final Creator<hsa> CREATOR = new Creator<hsa>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hsa[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            hsa hsa = new hsa(parcel.readString(), parcel.readString(), parcel.readString(), (hsd) jse.b(parcel, hsd.CREATOR), 0);
            return hsa;
        }
    };
    public final String a;
    public final hsd b;
    private final String c;
    private final String d;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ hsa(String str, String str2, String str3, hsd hsd, byte b2) {
        this(str, str2, str3, hsd);
    }

    public hsa(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }

    public hsa(String str, String str2, hsd hsd) {
        this(str, str2, null, hsd);
    }

    private hsa(String str, String str2, String str3, hsd hsd) {
        this.c = str;
        this.d = str2;
        this.a = str3;
        this.b = hsd;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        String str = this.d;
        return str != null ? str : "";
    }

    public final String toString() {
        return b();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        jse.a(parcel, (Parcelable) this.b, i);
    }
}
