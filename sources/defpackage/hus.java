package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hus reason: default package */
public final class hus implements Parcelable, huw {
    public static final Creator<hus> CREATOR = new Creator<hus>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            hus hus = new hus(parcel.readString(), parcel.readString(), parcel.readString(), (huv) juo.b(parcel, huv.CREATOR), 0);
            return hus;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hus[i];
        }
    };
    public final huv a;
    private final String b;
    private final String c;
    private final String d;

    public hus(String str, String str2, huv huv) {
        this(str, str2, null, huv);
    }

    public hus(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }

    private hus(String str, String str2, String str3, huv huv) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = huv;
    }

    /* synthetic */ hus(String str, String str2, String str3, huv huv, byte b2) {
        this(str, str2, str3, huv);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.c;
        return str != null ? str : "";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        juo.a(parcel, (Parcelable) this.a, i);
    }
}
