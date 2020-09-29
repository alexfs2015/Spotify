package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: bnj reason: default package */
public final class bnj extends bxf {
    public static final Creator<bnj> CREATOR = new brb();
    public boolean a;
    private String b;

    /* renamed from: bnj$a */
    public static final class a {
        public bnj a = new bnj();
    }

    bnj(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public bnj() {
        this(false, ehl.a(Locale.getDefault()));
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnj)) {
            return false;
        }
        bnj bnj = (bnj) obj;
        return this.a == bnj.a && ehl.a(this.b, bnj.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b, false);
        bxg.b(parcel, a2);
    }
}
