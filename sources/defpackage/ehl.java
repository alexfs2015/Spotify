package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ehl reason: default package */
public final class ehl extends bxw {
    public static final Creator<ehl> CREATOR = new ehn();
    String a;

    public ehl() {
        this(null);
    }

    ehl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ehl)) {
            return false;
        }
        return eic.a(this.a, ((ehl) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, a2);
    }
}
