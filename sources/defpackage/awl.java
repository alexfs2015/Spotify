package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: awl reason: default package */
public final class awl extends awp {
    public static final Creator<awl> CREATOR = new Creator<awl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awl(parcel);
        }
    };
    private String a;
    private boolean b;
    private boolean d;
    private String[] e;
    private final awp[] f;

    public awl(String str, boolean z, boolean z2, String[] strArr, awp[] awpArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.d = z2;
        this.e = strArr;
        this.f = awpArr;
    }

    awl(Parcel parcel) {
        super("CTOC");
        this.a = (String) bdw.a(parcel.readString());
        boolean z = true;
        this.b = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.d = z;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new awp[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (awp) parcel.readParcelable(awp.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            awl awl = (awl) obj;
            return this.b == awl.b && this.d == awl.d && bdw.a((Object) this.a, (Object) awl.a) && Arrays.equals(this.e, awl.e) && Arrays.equals(this.f, awl.f);
        }
    }

    public final int hashCode() {
        int i = ((((this.b ? 1 : 0) + true) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        for (awp writeParcelable : this.f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
