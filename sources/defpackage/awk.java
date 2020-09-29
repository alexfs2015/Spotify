package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awk reason: default package */
public final class awk extends awp {
    public static final Creator<awk> CREATOR = new Creator<awk>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awk[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awk(parcel);
        }
    };
    private String a;
    private int b;
    private int d;
    private long e;
    private long f;
    private final awp[] g;

    public final int describeContents() {
        return 0;
    }

    public awk(String str, int i, int i2, long j, long j2, awp[] awpArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = awpArr;
    }

    awk(Parcel parcel) {
        super("CHAP");
        this.a = (String) bdw.a(parcel.readString());
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new awp[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (awp) parcel.readParcelable(awp.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awk awk = (awk) obj;
            return this.b == awk.b && this.d == awk.d && this.e == awk.e && this.f == awk.f && bdw.a((Object) this.a, (Object) awk.a) && Arrays.equals(this.g, awk.g);
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
        for (awp writeParcelable : this.g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
