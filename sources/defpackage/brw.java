package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: brw reason: default package */
public final class brw extends bxf {
    public static final Creator<brw> CREATOR = new cae();
    public final String a;
    @Deprecated
    private final int b;
    private final long c;

    public brw(String str, long j) {
        this.a = str;
        this.c = 1;
        this.b = -1;
    }

    public brw(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof brw) {
            brw brw = (brw) obj;
            String str = this.a;
            if (((str != null && str.equals(brw.a)) || (this.a == null && brw.a == null)) && a() == brw.a()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return bwv.a((Object) this).a("name", this.a).a("version", Long.valueOf(a())).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        bxg.b(parcel, 2, this.b);
        bxg.a(parcel, 3, a());
        bxg.b(parcel, a2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }
}
