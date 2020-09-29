package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

/* renamed from: awa reason: default package */
public final class awa implements Parcelable {
    public static final Creator<awa> CREATOR = new Creator<awa>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awa[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awa(parcel);
        }
    };
    public final a[] a;

    /* renamed from: awa$a */
    public interface a extends Parcelable {
    }

    public final int describeContents() {
        return 0;
    }

    public awa(a... aVarArr) {
        this.a = aVarArr;
    }

    public awa(List<? extends a> list) {
        this.a = new a[list.size()];
        list.toArray(this.a);
    }

    awa(Parcel parcel) {
        this.a = new a[parcel.readInt()];
        int i = 0;
        while (true) {
            a[] aVarArr = this.a;
            if (i < aVarArr.length) {
                aVarArr[i] = (a) parcel.readParcelable(a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((awa) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (a writeParcelable : this.a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
