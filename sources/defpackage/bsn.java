package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bsn reason: default package */
public final class bsn extends bxw {
    public static final Creator<bsn> CREATOR = new cav();
    public final String a;
    @Deprecated
    private final int b;
    private final long c;

    public bsn(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public bsn(String str, long j) {
        this.a = str;
        this.c = 1;
        this.b = -1;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bsn) {
            bsn bsn = (bsn) obj;
            String str = this.a;
            if (((str != null && str.equals(bsn.a)) || (this.a == null && bsn.a == null)) && a() == bsn.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        return bxm.a((Object) this).a("name", this.a).a("version", Long.valueOf(a())).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a, false);
        bxx.b(parcel, 2, this.b);
        bxx.a(parcel, 3, a());
        bxx.b(parcel, a2);
    }
}
