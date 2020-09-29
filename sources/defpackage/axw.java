package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: axw reason: default package */
public final class axw implements Parcelable {
    public static final Creator<axw> CREATOR = new Creator<axw>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new axw[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new axw(parcel);
        }
    };
    public final int a;
    public final aqe[] b;
    private int c;

    public final int describeContents() {
        return 0;
    }

    public axw(aqe... aqeArr) {
        bcu.b(aqeArr.length > 0);
        this.b = aqeArr;
        this.a = aqeArr.length;
    }

    axw(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = new aqe[this.a];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (aqe) parcel.readParcelable(aqe.class.getClassLoader());
        }
    }

    public final int a(aqe aqe) {
        int i = 0;
        while (true) {
            aqe[] aqeArr = this.b;
            if (i >= aqeArr.length) {
                return -1;
            }
            if (aqe == aqeArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axw axw = (axw) obj;
            return this.a == axw.a && Arrays.equals(this.b, axw.b);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }
}
