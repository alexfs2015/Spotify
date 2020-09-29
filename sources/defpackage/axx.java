package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axx reason: default package */
public final class axx implements Parcelable {
    public static final Creator<axx> CREATOR = new Creator<axx>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axx[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axx(parcel);
        }
    };
    public static final axx a = new axx(new axw[0]);
    public final int b;
    public final axw[] c;
    private int d;

    public final int describeContents() {
        return 0;
    }

    public axx(axw... axwArr) {
        this.c = axwArr;
        this.b = axwArr.length;
    }

    axx(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = new axw[this.b];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = (axw) parcel.readParcelable(axw.class.getClassLoader());
        }
    }

    public final int a(axw axw) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == axw) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = Arrays.hashCode(this.c);
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axx axx = (axx) obj;
            return this.b == axx.b && Arrays.equals(this.c, axx.c);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }
}
