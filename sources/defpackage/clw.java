package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: clw reason: default package */
public final class clw {
    public final Object a = new Object();
    CopyOnWriteArraySet<cma> b = new CopyOnWriteArraySet<>();
    SharedPreferences c;
    public Editor d;
    boolean e = false;
    boolean f = true;
    String g;
    String h;
    boolean i = false;
    public String j = "";
    public long k = 0;
    long l = 0;
    long m = 0;
    int n = -1;
    public int o = 0;
    Set<String> p = Collections.emptySet();
    public JSONObject q = new JSONObject();
    boolean r = true;
    boolean s = true;
    private cpr<?> t;

    public final void a(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.t = (cpr) new clx(this, context).c();
    }

    public final void a(Bundle bundle) {
        new cly(this, bundle).c();
    }

    public final void a(cma cma) {
        synchronized (this.a) {
            if (this.t != null && this.t.isDone()) {
                cma.a(b());
            }
            this.b.add(cma);
        }
    }

    public final void a(String str) {
        a();
        synchronized (this.a) {
            if (!this.p.contains(str)) {
                this.p.add(str);
                if (this.d != null) {
                    this.d.putStringSet("never_pool_slots", this.p);
                    this.d.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.p.toArray(new String[this.p.size()]));
                a(bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r4) {
        /*
            r3 = this;
            r3.a()
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.f     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.d     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.d     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.d     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.e     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.a(r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clw.a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.a) {
            bundle.putBoolean("use_https", this.f);
            bundle.putBoolean("content_url_opted_out", this.r);
            bundle.putBoolean("content_vertical_opted_out", this.s);
            bundle.putBoolean("auto_collect_location", this.i);
            bundle.putInt("version_code", this.o);
            bundle.putStringArray("never_pool_slots", (String[]) this.p.toArray(new String[this.p.size()]));
            bundle.putString("app_settings_json", this.j);
            bundle.putLong("app_settings_last_update_ms", this.k);
            bundle.putLong("app_last_background_time_ms", this.l);
            bundle.putInt("request_in_session_count", this.n);
            bundle.putLong("first_ad_req_time_ms", this.m);
            bundle.putString("native_advanced_settings", this.q.toString());
            if (this.g != null) {
                bundle.putString("content_url_hashes", this.g);
            }
            if (this.h != null) {
                bundle.putString("content_vertical_hashes", this.h);
            }
        }
        return bundle;
    }

    public final void b(String str) {
        a();
        synchronized (this.a) {
            if (this.p.contains(str)) {
                this.p.remove(str);
                if (this.d != null) {
                    this.d.putStringSet("never_pool_slots", this.p);
                    this.d.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.p.toArray(new String[this.p.size()]));
                a(bundle);
            }
        }
    }

    public final void b(boolean z) {
        a();
        synchronized (this.a) {
            if (this.r != z) {
                this.r = z;
                if (this.d != null) {
                    this.d.putBoolean("content_url_opted_out", z);
                    this.d.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.r);
                bundle.putBoolean("content_vertical_opted_out", this.s);
                a(bundle);
            }
        }
    }

    public final void c(boolean z) {
        a();
        synchronized (this.a) {
            if (this.s != z) {
                this.s = z;
                if (this.d != null) {
                    this.d.putBoolean("content_vertical_opted_out", z);
                    this.d.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.r);
                bundle.putBoolean("content_vertical_opted_out", this.s);
                a(bundle);
            }
        }
    }

    public final boolean c() {
        boolean z;
        a();
        synchronized (this.a) {
            if (!this.f) {
                if (!this.e) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean c(String str) {
        boolean contains;
        a();
        synchronized (this.a) {
            contains = this.p.contains(str);
        }
        return contains;
    }

    public final void d(boolean z) {
        a();
        synchronized (this.a) {
            if (this.i != z) {
                this.i = z;
                if (this.d != null) {
                    this.d.putBoolean("auto_collect_location", z);
                    this.d.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                a(bundle);
            }
        }
    }

    public final boolean d() {
        boolean z;
        a();
        synchronized (this.a) {
            z = this.r;
        }
        return z;
    }

    public final String e() {
        String str;
        a();
        synchronized (this.a) {
            str = this.g;
        }
        return str;
    }

    public final boolean f() {
        boolean z;
        a();
        synchronized (this.a) {
            z = this.s;
        }
        return z;
    }

    public final String g() {
        String str;
        a();
        synchronized (this.a) {
            str = this.h;
        }
        return str;
    }

    public final boolean h() {
        boolean z;
        a();
        synchronized (this.a) {
            z = this.i;
        }
        return z;
    }

    public final int i() {
        int i2;
        a();
        synchronized (this.a) {
            i2 = this.o;
        }
        return i2;
    }

    public final cld j() {
        cld cld;
        a();
        synchronized (this.a) {
            cld = new cld(this.j, this.k);
        }
        return cld;
    }

    public final long k() {
        long j2;
        a();
        synchronized (this.a) {
            j2 = this.l;
        }
        return j2;
    }

    public final int l() {
        int i2;
        a();
        synchronized (this.a) {
            i2 = this.n;
        }
        return i2;
    }

    public final long m() {
        long j2;
        a();
        synchronized (this.a) {
            j2 = this.m;
        }
        return j2;
    }

    public final JSONObject n() {
        JSONObject jSONObject;
        a();
        synchronized (this.a) {
            jSONObject = this.q;
        }
        return jSONObject;
    }

    public final void a() {
        cpr<?> cpr = this.t;
        if (cpr != null && !cpr.isDone()) {
            try {
                this.t.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                cow.a(5);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                clu.a("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        a();
        synchronized (this.a) {
            JSONArray optJSONArray = this.q.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i2++;
                        } else if (!z || optJSONObject.optBoolean("uses_media_view", false) != z) {
                            length = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", bjl.l().a());
                optJSONArray.put(length, jSONObject);
                this.q.put(str, optJSONArray);
            } catch (JSONException unused) {
                cow.a(5);
            }
            if (this.d != null) {
                this.d.putString("native_advanced_settings", this.q.toString());
                this.d.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.q.toString());
            a(bundle);
        }
    }
}
