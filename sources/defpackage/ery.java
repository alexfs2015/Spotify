package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: ery reason: default package */
final class ery extends etm {
    static final Pair<String, Long> a = new Pair<>("", Long.valueOf(0));
    SharedPreferences b;
    public esb c;
    public final esa d = new esa(this, "last_upload", 0);
    public final esa e = new esa(this, "last_upload_attempt", 0);
    public final esa f = new esa(this, "backoff", 0);
    public final esa g = new esa(this, "last_delete_stale", 0);
    public final esa h = new esa(this, "midnight_offset", 0);
    public final esa i = new esa(this, "first_open_time", 0);
    public final esa j = new esa(this, "app_install_time", 0);
    public final esc k = new esc(this, "app_instance_id");
    public final esa l = new esa(this, "time_before_start", 10000);
    public final esa m = new esa(this, "session_timeout", 1800000);
    public final erz n = new erz(this, "start_new_session");
    public final esa o = new esa(this, "last_pause_time", 0);
    public final esa p = new esa(this, "time_active", 0);
    public boolean q;
    private String s;
    private boolean t;
    private long u;

    ery(esp esp) {
        super(esp);
    }

    private void d(boolean z) {
        c();
        q().k.a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = f().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final Pair<String, Boolean> a(String str) {
        String str2 = "";
        c();
        long b2 = l().b();
        String str3 = this.s;
        if (str3 != null && b2 < this.u) {
            return new Pair<>(str3, Boolean.valueOf(this.t));
        }
        this.u = b2 + s().a(str, erd.i);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m());
            if (advertisingIdInfo != null) {
                this.s = advertisingIdInfo.getId();
                this.t = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.s == null) {
                this.s = str2;
            }
        } catch (Exception e2) {
            q().j.a("Unable to get advertising id", e2);
            this.s = str2;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.s, Boolean.valueOf(this.t));
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        c();
        q().k.a("Setting useService", Boolean.valueOf(z));
        Editor edit = f().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(long j2) {
        return j2 - this.m.a() > this.o.a();
    }

    /* access modifiers changed from: 0000 */
    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest h2 = ewd.h();
        if (h2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, h2.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(boolean z) {
        c();
        return f().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    public final void c(String str) {
        c();
        Editor edit = f().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final void c(boolean z) {
        c();
        q().k.a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = f().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final void d(String str) {
        c();
        Editor edit = f().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.b = m().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        String str = "has_been_opened";
        this.q = this.b.getBoolean(str, false);
        if (!this.q) {
            Editor edit = this.b.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        esb esb = new esb(this, "health_monitor", Math.max(0, ((Long) erd.j.a()).longValue()), 0);
        this.c = esb;
    }

    /* access modifiers changed from: 0000 */
    public final SharedPreferences f() {
        c();
        w();
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final String g() {
        c();
        return f().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    public final String h() {
        c();
        return f().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    public final Boolean i() {
        c();
        String str = "use_service";
        if (!f().contains(str)) {
            return null;
        }
        return Boolean.valueOf(f().getBoolean(str, false));
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        c();
        q().k.a("Clearing collection preferences.");
        if (s().a(erd.ak)) {
            Boolean t2 = t();
            Editor edit = f().edit();
            edit.clear();
            edit.apply();
            if (t2 != null) {
                d(t2.booleanValue());
            }
            return;
        }
        boolean contains = f().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = b(true);
        }
        Editor edit2 = f().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            d(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public final Boolean t() {
        c();
        String str = "measurement_enabled";
        if (f().contains(str)) {
            return Boolean.valueOf(f().getBoolean(str, true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String u() {
        c();
        String str = "previous_os_version";
        String string = f().getString(str, null);
        k().w();
        String str2 = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2) && !str2.equals(string)) {
            Editor edit = f().edit();
            edit.putString(str, str2);
            edit.apply();
        }
        return string;
    }
}
