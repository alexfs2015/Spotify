package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ayo reason: default package */
public final class ayo implements Parcelable {
    public static final Creator<ayo> CREATOR = new Creator<ayo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ayo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ayo[i];
        }
    };
    public static final ayo a = new ayo(new ayn[0]);
    public final int b;
    public final ayn[] c;
    private int d;

    ayo(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = new ayn[this.b];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = (ayn) parcel.readParcelable(ayn.class.getClassLoader());
        }
    }

    public ayo(ayn... aynArr) {
        this.c = aynArr;
        this.b = aynArr.length;
    }

    public final int a(ayn ayn) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == ayn) {
                return i;
            }
        }
        return -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayo ayo = (ayo) obj;
            return this.b == ayo.b && Arrays.equals(this.c, ayo.c);
        }
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = Arrays.hashCode(this.c);
        }
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }
}
