package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends bxw implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new bws();
    public final String a;
    private final int b;

    public Scope(int i, String str) {
        bxo.a(str, (Object) "scopeUri must not be null or empty");
        this.b = i;
        this.a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.a.equals(((Scope) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.b);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, a2);
    }
}
