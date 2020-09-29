package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axa reason: default package */
public final class axa extends axg {
    public static final Creator<axa> CREATOR = new Creator<axa>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axa(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axa[i];
        }
    };
    private byte[] a;

    axa(Parcel parcel) {
        super((String) ben.a(parcel.readString()));
        this.a = (byte[]) ben.a(parcel.createByteArray());
    }

    public axa(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axa axa = (axa) obj;
            return this.c.equals(axa.c) && Arrays.equals(this.a, axa.a);
        }
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.a);
    }
}
