package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: boa reason: default package */
public final class boa extends bxw {
    public static final Creator<boa> CREATOR = new brs();
    public boolean a;
    private String b;

    /* renamed from: boa$a */
    public static final class a {
        public boa a = new boa();
    }

    public boa() {
        this(false, eic.a(Locale.getDefault()));
    }

    boa(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof boa)) {
            return false;
        }
        boa boa = (boa) obj;
        return this.a == boa.a && eic.a(this.b, boa.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b, false);
        bxx.b(parcel, a2);
    }
}
