package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awx reason: default package */
public final class awx implements a {
    public static final Creator<awx> CREATOR = new Creator<awx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awx(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awx[i];
        }
    };
    private String a;
    private String b;
    private long c;
    private long d;
    private long e;
    private byte[] f;
    private int g;

    awx(Parcel parcel) {
        this.a = (String) ben.a(parcel.readString());
        this.b = (String) ben.a(parcel.readString());
        this.d = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.f = (byte[]) ben.a(parcel.createByteArray());
    }

    public awx(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.e = j2;
        this.f = bArr;
        this.d = j3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awx awx = (awx) obj;
            return this.d == awx.d && this.c == awx.c && this.e == awx.e && ben.a((Object) this.a, (Object) awx.a) && ben.a((Object) this.b, (Object) awx.b) && Arrays.equals(this.f, awx.f);
        }
    }

    public final int hashCode() {
        if (this.g == 0) {
            String str = this.a;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            long j = this.d;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.c;
            int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.e;
            this.g = ((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f);
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EMSG: scheme=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.b);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.d);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }
}
