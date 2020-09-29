package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ConnectionResult extends bxw {
    public static final Creator<ConnectionResult> CREATOR = new cau();
    public static final int SUCCESS = 0;
    public static final ConnectionResult a = new ConnectionResult(0);
    public final int b;
    public final PendingIntent c;
    public final String d;
    private final int e;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.e = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean a() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.b == connectionResult.b && bxm.a(this.c, connectionResult.c) && bxm.a(this.d, connectionResult.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        return bxm.a((Object) this).a("statusCode", a(this.b)).a("resolution", this.c).a("message", this.d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.e);
        bxx.b(parcel, 2, this.b);
        bxx.a(parcel, 3, (Parcelable) this.c, i, false);
        bxx.a(parcel, 4, this.d, false);
        bxx.b(parcel, a2);
    }
}
