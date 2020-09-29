package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

/* renamed from: awr reason: default package */
public final class awr implements Parcelable {
    public static final Creator<awr> CREATOR = new Creator<awr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awr(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awr[0];
        }
    };
    public final a[] a;

    /* renamed from: awr$a */
    public interface a extends Parcelable {
    }

    awr(Parcel parcel) {
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

    public awr(List<? extends a> list) {
        this.a = new a[list.size()];
        list.toArray(this.a);
    }

    public awr(a... aVarArr) {
        this.a = aVarArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((awr) obj).a);
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
