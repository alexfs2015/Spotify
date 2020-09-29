package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axb reason: default package */
public final class axb extends axg {
    public static final Creator<axb> CREATOR = new Creator<axb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axb(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axb[i];
        }
    };
    private String a;
    private int b;
    private int d;
    private long e;
    private long f;
    private final axg[] g;

    axb(Parcel parcel) {
        super("CHAP");
        this.a = (String) ben.a(parcel.readString());
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new axg[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (axg) parcel.readParcelable(axg.class.getClassLoader());
        }
    }

    public axb(String str, int i, int i2, long j, long j2, axg[] axgArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = axgArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axb axb = (axb) obj;
            return this.b == axb.b && this.d == axb.d && this.e == axb.e && this.f == axb.f && ben.a((Object) this.a, (Object) axb.a) && Arrays.equals(this.g, axb.g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.b + 527) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (axg writeParcelable : this.g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
