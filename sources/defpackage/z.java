package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: z reason: default package */
final class z {
    private static z c;
    final Context a;
    final a b = new a();
    private final LocationManager d;

    /* renamed from: z$a */
    static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    private z(Context context, LocationManager locationManager) {
        this.a = context;
        this.d = locationManager;
    }

    static z a(Context context) {
        if (c == null) {
            Context applicationContext = context.getApplicationContext();
            c = new z(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return c;
    }

    /* access modifiers changed from: 0000 */
    public Location a(String str) {
        try {
            if (this.d.isProviderEnabled(str)) {
                return this.d.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
