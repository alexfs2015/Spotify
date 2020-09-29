package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class Status extends bxf implements bsl, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new bwc();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public final int f;
    public final String g;
    final PendingIntent h;
    private final int i;

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.i = i2;
        this.f = i3;
        this.g = str;
        this.h = pendingIntent;
    }

    public final Status B_() {
        return this;
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public final boolean b() {
        return this.h != null;
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.f), this.g, this.h});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.i != status.i || this.f != status.f || !bwv.a(this.g, status.g) || !bwv.a(this.h, status.h)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        a a2 = bwv.a((Object) this);
        String str = this.g;
        if (str == null) {
            str = bsf.a(this.f);
        }
        return a2.a("statusCode", str).a("resolution", this.h).toString();
    }

    static {
        new Status(17);
        new Status(18);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.f);
        bxg.a(parcel, 2, this.g, false);
        bxg.a(parcel, 3, (Parcelable) this.h, i2, false);
        bxg.b(parcel, 1000, this.i);
        bxg.b(parcel, a2);
    }
}
