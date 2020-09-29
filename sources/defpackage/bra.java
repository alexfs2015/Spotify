package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bra reason: default package */
public final class bra extends bxf {
    public static final Creator<bra> CREATOR = new bqz();
    private int a;

    bra(int i) {
        this.a = i;
    }

    public bra() {
        this(0);
    }

    public final String toString() {
        int i = this.a;
        String str = i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG";
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bra)) {
            return false;
        }
        return this.a == ((bra) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 2, this.a);
        bxg.b(parcel, a2);
    }
}
