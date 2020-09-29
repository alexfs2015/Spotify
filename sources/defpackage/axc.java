package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axc reason: default package */
public final class axc extends axg {
    public static final Creator<axc> CREATOR = new Creator<axc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axc(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axc[i];
        }
    };
    private String a;
    private boolean b;
    private boolean d;
    private String[] e;
    private final axg[] f;

    axc(Parcel parcel) {
        super("CTOC");
        this.a = (String) ben.a(parcel.readString());
        boolean z = true;
        this.b = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.d = z;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new axg[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (axg) parcel.readParcelable(axg.class.getClassLoader());
        }
    }

    public axc(String str, boolean z, boolean z2, String[] strArr, axg[] axgArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.d = z2;
        this.e = strArr;
        this.f = axgArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axc axc = (axc) obj;
            return this.b == axc.b && this.d == axc.d && ben.a((Object) this.a, (Object) axc.a) && Arrays.equals(this.e, axc.e) && Arrays.equals(this.f, axc.f);
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
        for (axg writeParcelable : this.f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
