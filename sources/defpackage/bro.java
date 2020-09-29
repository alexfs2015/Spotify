package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bro reason: default package */
public final class bro extends bxw {
    public static final Creator<bro> CREATOR = new brn();
    private final brm a;
    private final brm b;

    public bro(brm brm, brm brm2) {
        this.a = brm;
        this.b = brm2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bro)) {
            return false;
        }
        bro bro = (bro) obj;
        return eic.a(this.a, bro.a) && eic.a(this.b, bro.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, (Parcelable) this.a, i, false);
        bxx.a(parcel, 3, (Parcelable) this.b, i, false);
        bxx.b(parcel, a2);
    }
}
