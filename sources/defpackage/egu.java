package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: egu reason: default package */
public final class egu extends bxf {
    public static final Creator<egu> CREATOR = new egw();
    String a;

    egu(String str) {
        this.a = str;
    }

    public egu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof egu)) {
            return false;
        }
        return ehl.a(this.a, ((egu) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, a2);
    }
}
