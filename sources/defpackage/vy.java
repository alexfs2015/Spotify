package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.TrackingState;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: vy reason: default package */
public final class vy implements we {
    String a;
    xi b = new xe("AttributionHandler");
    WeakReference<wd> c;
    private boolean d;
    private String e;
    private String f;
    private wf g = vv.a();
    private xk h = new xk(new Runnable() {
        public final void run() {
            vy vyVar = vy.this;
            vyVar.b.a(new Runnable() {
                public final void run() {
                    vy.a(vy.this);
                }
            });
        }
    }, "Attribution timer");

    public vy(wd wdVar, boolean z) {
        this.e = wdVar.k();
        this.f = wdVar.b().h;
        this.c = new WeakReference<>(wdVar);
        this.d = !z;
    }

    static /* synthetic */ void a(vy vyVar) {
        if (!((wd) vyVar.c.get()).c().isGdprForgotten) {
            if (vyVar.d) {
                vyVar.g.b("Attribution handler is paused", new Object[0]);
                return;
            }
            wd wdVar = (wd) vyVar.c.get();
            wp wpVar = new wp(wdVar.a(), wdVar.b(), wdVar.c(), wdVar.d(), System.currentTimeMillis());
            String str = vyVar.a;
            ContentResolver contentResolver = wpVar.d.c.getContentResolver();
            HashMap hashMap = new HashMap();
            Map a2 = ws.a(wpVar.d.c, wp.a);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            wpVar.c.a(wpVar.d.c);
            wp.a((Map<String, String>) hashMap, "android_uuid", wpVar.e.g);
            wp.a((Map<String, String>) hashMap, "tracking_enabled", wpVar.c.c);
            wp.a((Map<String, String>) hashMap, "gps_adid", wpVar.c.a);
            wp.a((Map<String, String>) hashMap, "gps_adid_src", wpVar.c.b);
            if (!wp.a((Map<String, String>) hashMap)) {
                wp.a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
                wpVar.c.b(wpVar.d.c);
                wp.a((Map<String, String>) hashMap, "mac_sha1", wpVar.c.d);
                wp.a((Map<String, String>) hashMap, "mac_md5", wpVar.c.e);
                wp.a((Map<String, String>) hashMap, "android_id", wpVar.c.f);
            }
            wp.a((Map<String, String>) hashMap, "api_level", wpVar.c.p);
            wp.a((Map<String, String>) hashMap, "app_secret", (String) null);
            wp.a((Map<String, String>) hashMap, "app_token", wpVar.d.d);
            wp.a((Map<String, String>) hashMap, "app_version", wpVar.c.j);
            wp.a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
            wp.b(hashMap, "created_at", wpVar.b);
            wp.a((Map<String, String>) hashMap, "device_known", (Boolean) null);
            wp.a((Map<String, String>) hashMap, "device_name", wpVar.c.l);
            wp.a((Map<String, String>) hashMap, "device_type", wpVar.c.k);
            wp.a((Map<String, String>) hashMap, "environment", wpVar.d.e);
            wp.a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
            wp.a((Map<String, String>) hashMap, "fire_adid", xa.a(contentResolver));
            wp.a((Map<String, String>) hashMap, "fire_tracking_enabled", xa.b(contentResolver));
            wp.a((Map<String, String>) hashMap, "initiated_by", str);
            wp.a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
            wp.a((Map<String, String>) hashMap, "os_name", wpVar.c.n);
            wp.a((Map<String, String>) hashMap, "os_version", wpVar.c.o);
            wp.a((Map<String, String>) hashMap, "package_name", wpVar.c.i);
            wp.a((Map<String, String>) hashMap, "push_token", wpVar.e.h);
            wp.a((Map<String, String>) hashMap, "secret_id", (String) null);
            wp.b((Map<String, String>) hashMap);
            ActivityPackage a3 = wpVar.a(ActivityKind.ATTRIBUTION);
            a3.path = "attribution";
            a3.suffix = "";
            a3.parameters = hashMap;
            vyVar.a = null;
            vyVar.g.a("%s", a3.b());
            try {
                wu a4 = xb.a(a3, vyVar.e);
                if (a4 instanceof vz) {
                    if (a4.h == TrackingState.OPTED_OUT) {
                        ((wd) vyVar.c.get()).i();
                        return;
                    }
                    final vz vzVar = (vz) a4;
                    vyVar.b.a(new Runnable() {
                        public final void run() {
                            wd wdVar = (wd) vy.this.c.get();
                            if (wdVar != null) {
                                vy vyVar = vy.this;
                                vz vzVar = vzVar;
                                vyVar.a(wdVar, vzVar);
                                if (vzVar.g != null) {
                                    JSONObject optJSONObject = vzVar.g.optJSONObject("attribution");
                                    if (optJSONObject != null) {
                                        String optString = optJSONObject.optString("deeplink", null);
                                        if (optString != null) {
                                            vzVar.a = Uri.parse(optString);
                                        }
                                    }
                                }
                                wdVar.a(vzVar);
                            }
                        }
                    });
                }
            } catch (Exception e2) {
                vyVar.g.f("Failed to get attribution (%s)", e2.getMessage());
            }
        }
    }

    public final void a() {
        this.b.a(new Runnable() {
            public final void run() {
                vy vyVar = vy.this;
                vyVar.a = "sdk";
                vyVar.a(0);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void a(long j) {
        if (this.h.a() <= j) {
            if (j != 0) {
                double d2 = (double) j;
                Double.isNaN(d2);
                String format = xa.a.format(d2 / 1000.0d);
                this.g.b("Waiting to query attribution in %s seconds", format);
            }
            this.h.a(j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(wd wdVar, wu wuVar) {
        if (wuVar.g != null) {
            long optLong = wuVar.g.optLong("ask_in", -1);
            if (optLong >= 0) {
                wdVar.a(true);
                this.a = "backend";
                a(optLong);
                return;
            }
            wdVar.a(false);
            wuVar.i = AdjustAttribution.a(wuVar.g.optJSONObject("attribution"), wuVar.d, xa.e(this.f));
        }
    }

    public final void a(final ww wwVar) {
        this.b.a(new Runnable() {
            public final void run() {
                wd wdVar = (wd) vy.this.c.get();
                if (wdVar != null) {
                    vy vyVar = vy.this;
                    ww wwVar = wwVar;
                    vyVar.a(wdVar, wwVar);
                    wdVar.a(wwVar);
                }
            }
        });
    }

    public final void a(final wy wyVar) {
        this.b.a(new Runnable() {
            public final void run() {
                wd wdVar = (wd) vy.this.c.get();
                if (wdVar != null) {
                    vy vyVar = vy.this;
                    wy wyVar = wyVar;
                    vyVar.a(wdVar, wyVar);
                    wdVar.a(wyVar);
                }
            }
        });
    }

    public final void b() {
        this.d = true;
    }

    public final void c() {
        this.d = false;
    }
}
