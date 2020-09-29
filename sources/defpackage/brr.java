package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: brr reason: default package */
public final class brr extends bxw {
    public static final Creator<brr> CREATOR = new brq();
    private int a;

    public brr() {
        this(0);
    }

    brr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brr)) {
            return false;
        }
        return this.a == ((brr) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        int i = this.a;
        String str = i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG";
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 2, this.a);
        bxx.b(parcel, a2);
    }
}
