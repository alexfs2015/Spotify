package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ayn reason: default package */
public final class ayn implements Parcelable {
    public static final Creator<ayn> CREATOR = new Creator<ayn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ayn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ayn[i];
        }
    };
    public final int a;
    public final aqv[] b;
    private int c;

    ayn(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = new aqv[this.a];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (aqv) parcel.readParcelable(aqv.class.getClassLoader());
        }
    }

    public ayn(aqv... aqvArr) {
        bdl.b(aqvArr.length > 0);
        this.b = aqvArr;
        this.a = aqvArr.length;
    }

    public final int a(aqv aqv) {
        int i = 0;
        while (true) {
            aqv[] aqvArr = this.b;
            if (i >= aqvArr.length) {
                return -1;
            }
            if (aqv == aqvArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayn ayn = (ayn) obj;
            return this.a == ayn.a && Arrays.equals(this.b, ayn.b);
        }
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }
}
