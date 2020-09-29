package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends bxf implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new bwb();
    public final String a;
    private final int b;

    public Scope(int i, String str) {
        bwx.a(str, (Object) "scopeUri must not be null or empty");
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
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.b);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, a2);
    }
}
