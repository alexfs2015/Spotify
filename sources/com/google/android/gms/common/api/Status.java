package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class Status extends bxw implements btc, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new bwt();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public final int f;
    public final String g;
    final PendingIntent h;
    private final int i;

    static {
        new Status(17);
        new Status(18);
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.i = i2;
        this.f = i3;
        this.g = str;
        this.h = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public final Status B_() {
        return this;
    }

    public final boolean b() {
        return this.h != null;
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.i == status.i && this.f == status.f && bxm.a(this.g, status.g) && bxm.a(this.h, status.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.f), this.g, this.h});
    }

    public final String toString() {
        a a2 = bxm.a((Object) this);
        String str = this.g;
        if (str == null) {
            str = bsw.a(this.f);
        }
        return a2.a("statusCode", str).a("resolution", this.h).toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.f);
        bxx.a(parcel, 2, this.g, false);
        bxx.a(parcel, 3, (Parcelable) this.h, i2, false);
        bxx.b(parcel, 1000, this.i);
        bxx.b(parcel, a2);
    }
}
