package com.moat.analytics.mobile.spot;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class o implements LocationListener {
    private static o a;
    private ScheduledExecutorService b;
    private ScheduledFuture<?> c;
    private ScheduledFuture<?> d;
    private LocationManager e;
    private boolean f;
    private Location g;
    private boolean h;

    private o() {
        String str;
        try {
            this.f = ((k) MoatAnalytics.getInstance()).c;
            String str2 = "LocationManager";
            if (this.f) {
                str = "Moat location services disabled";
            } else {
                this.b = Executors.newScheduledThreadPool(1);
                this.e = (LocationManager) a.a().getSystemService("location");
                if (this.e.getAllProviders().size() == 0) {
                    str = "Device has no location providers";
                } else {
                    e();
                    return;
                }
            }
            p.a(3, str2, (Object) this, str);
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    static o a() {
        if (a == null) {
            a = new o();
        }
        return a;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        try {
            p.a(3, "LocationManager", (Object) this, "stopping location fetch");
            h();
            i();
            if (z) {
                k();
            } else {
                j();
            }
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    private static boolean a(Location location) {
        if (location == null) {
            return false;
        }
        return !(location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) && location.getAccuracy() >= 0.0f && b(location) < 600.0f;
    }

    static boolean a(Location location, Location location2) {
        if (location == location2) {
            return true;
        }
        return (location == null || location2 == null || location.getTime() != location2.getTime()) ? false : true;
    }

    private static boolean a(String str) {
        return fr.b(a.a().getApplicationContext(), str) == 0;
    }

    private static float b(Location location) {
        return (float) ((System.currentTimeMillis() - location.getTime()) / 1000);
    }

    private static Location b(Location location, Location location2) {
        boolean a2 = a(location);
        boolean a3 = a(location2);
        if (a2) {
            return (a3 && location.getAccuracy() >= location.getAccuracy()) ? location2 : location;
        }
        if (!a3) {
            return null;
        }
        return location2;
    }

    /* access modifiers changed from: private */
    public void e() {
        try {
            if (!this.f) {
                if (this.e != null) {
                    String str = "LocationManager";
                    if (this.h) {
                        p.a(3, str, (Object) this, "already updating location");
                    }
                    p.a(3, str, (Object) this, "starting location fetch");
                    Location b2 = b();
                    if (b2 != null) {
                        StringBuilder sb = new StringBuilder("Have a valid location, won't fetch = ");
                        sb.append(b2.toString());
                        p.a(3, str, (Object) this, sb.toString());
                        k();
                        return;
                    }
                    g();
                }
            }
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    private Location f() {
        try {
            boolean l = l();
            boolean m = m();
            String str = "network";
            String str2 = "gps";
            if (l && m) {
                return b(this.e.getLastKnownLocation(str2), this.e.getLastKnownLocation(str));
            }
            if (l) {
                return this.e.getLastKnownLocation(str2);
            }
            if (m) {
                return this.e.getLastKnownLocation(str);
            }
            return null;
        } catch (SecurityException e2) {
            m.a(e2);
            return null;
        }
    }

    private void g() {
        String str = "LocationManager";
        try {
            if (!this.h) {
                p.a(3, str, (Object) this, "Attempting to start update");
                if (l()) {
                    p.a(3, str, (Object) this, "start updating gps location");
                    this.e.requestLocationUpdates("gps", 0, 0.0f, this, Looper.getMainLooper());
                    this.h = true;
                }
                if (m()) {
                    p.a(3, str, (Object) this, "start updating network location");
                    this.e.requestLocationUpdates("network", 0, 0.0f, this, Looper.getMainLooper());
                    this.h = true;
                }
                if (this.h) {
                    i();
                    this.d = this.b.schedule(new Runnable() {
                        public void run() {
                            try {
                                p.a(3, "LocationManager", (Object) this, "fetchTimedOut");
                                o.this.a(true);
                            } catch (Exception e) {
                                m.a(e);
                            }
                        }
                    }, 60, TimeUnit.SECONDS);
                }
            }
        } catch (SecurityException e2) {
            m.a(e2);
        }
    }

    private void h() {
        try {
            p.a(3, "LocationManager", (Object) this, "Stopping to update location");
            if (n() && this.e != null) {
                this.e.removeUpdates(this);
                this.h = false;
            }
        } catch (SecurityException e2) {
            m.a(e2);
        }
    }

    private void i() {
        ScheduledFuture<?> scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.d.cancel(true);
            this.d = null;
        }
    }

    private void j() {
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.c.cancel(true);
            this.c = null;
        }
    }

    private void k() {
        p.a(3, "LocationManager", (Object) this, "Resetting fetch timer");
        j();
        Location b2 = b();
        float f2 = 600.0f;
        if (b2 != null) {
            f2 = Math.max(600.0f - b(b2), 0.0f);
        }
        this.c = this.b.schedule(new Runnable() {
            public void run() {
                try {
                    p.a(3, "LocationManager", (Object) this, "fetchTimerCompleted");
                    o.this.e();
                } catch (Exception e) {
                    m.a(e);
                }
            }
        }, (long) f2, TimeUnit.SECONDS);
    }

    private boolean l() {
        if (a("android.permission.ACCESS_FINE_LOCATION")) {
            String str = "gps";
            if (this.e.getProvider(str) != null && this.e.isProviderEnabled(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean m() {
        if (n()) {
            String str = "network";
            if (this.e.getProvider(str) != null && this.e.isProviderEnabled(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean n() {
        return a("android.permission.ACCESS_FINE_LOCATION") || a("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* access modifiers changed from: 0000 */
    public Location b() {
        if (!this.f && this.e != null) {
            try {
                this.g = b(this.g, f());
                return this.g;
            } catch (Exception e2) {
                m.a(e2);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        e();
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        a(false);
    }

    public void onLocationChanged(Location location) {
        String str = "LocationManager";
        try {
            StringBuilder sb = new StringBuilder("Received an updated location = ");
            sb.append(location.toString());
            p.a(3, str, (Object) this, sb.toString());
            float b2 = b(location);
            if (location.hasAccuracy() && location.getAccuracy() <= 100.0f && b2 < 600.0f) {
                this.g = b(this.g, location);
                p.a(3, str, (Object) this, "fetchCompleted");
                a(true);
            }
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
