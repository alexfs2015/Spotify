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

/* renamed from: vk reason: default package */
public final class vk implements vq {
    String a;
    wu b = new wq("AttributionHandler");
    WeakReference<vp> c;
    private boolean d;
    private String e;
    private String f;
    private vr g = vh.a();
    private ww h = new ww(new Runnable() {
        public final void run() {
            vk vkVar = vk.this;
            vkVar.b.a(new Runnable() {
                public final void run() {
                    vk.a(vk.this);
                }
            });
        }
    }, "Attribution timer");

    public vk(vp vpVar, boolean z) {
        this.e = vpVar.k();
        this.f = vpVar.b().h;
        this.c = new WeakReference<>(vpVar);
        this.d = !z;
    }

    public final void a() {
        this.b.a(new Runnable() {
            public final void run() {
                vk vkVar = vk.this;
                vkVar.a = "sdk";
                vkVar.a(0);
            }
        });
    }

    public final void a(final wk wkVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vp vpVar = (vp) vk.this.c.get();
                if (vpVar != null) {
                    vk vkVar = vk.this;
                    wk wkVar = wkVar;
                    vkVar.a(vpVar, wkVar);
                    vpVar.a(wkVar);
                }
            }
        });
    }

    public final void a(final wi wiVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vp vpVar = (vp) vk.this.c.get();
                if (vpVar != null) {
                    vk vkVar = vk.this;
                    wi wiVar = wiVar;
                    vkVar.a(vpVar, wiVar);
                    vpVar.a(wiVar);
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

    /* access modifiers changed from: 0000 */
    public void a(long j) {
        if (this.h.a() <= j) {
            if (j != 0) {
                double d2 = (double) j;
                Double.isNaN(d2);
                String format = wm.a.format(d2 / 1000.0d);
                this.g.b("Waiting to query attribution in %s seconds", format);
            }
            this.h.a(j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(vp vpVar, wg wgVar) {
        if (wgVar.g != null) {
            long optLong = wgVar.g.optLong("ask_in", -1);
            if (optLong >= 0) {
                vpVar.a(true);
                this.a = "backend";
                a(optLong);
                return;
            }
            vpVar.a(false);
            wgVar.i = AdjustAttribution.a(wgVar.g.optJSONObject("attribution"), wgVar.d, wm.e(this.f));
        }
    }

    static /* synthetic */ void a(vk vkVar) {
        if (!((vp) vkVar.c.get()).c().isGdprForgotten) {
            if (vkVar.d) {
                vkVar.g.b("Attribution handler is paused", new Object[0]);
                return;
            }
            vp vpVar = (vp) vkVar.c.get();
            wb wbVar = new wb(vpVar.a(), vpVar.b(), vpVar.c(), vpVar.d(), System.currentTimeMillis());
            String str = vkVar.a;
            ContentResolver contentResolver = wbVar.d.c.getContentResolver();
            HashMap hashMap = new HashMap();
            Map a2 = we.a(wbVar.d.c, wb.a);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            wbVar.c.a(wbVar.d.c);
            wb.a((Map<String, String>) hashMap, "android_uuid", wbVar.e.g);
            wb.a((Map<String, String>) hashMap, "tracking_enabled", wbVar.c.c);
            wb.a((Map<String, String>) hashMap, "gps_adid", wbVar.c.a);
            wb.a((Map<String, String>) hashMap, "gps_adid_src", wbVar.c.b);
            if (!wb.a((Map<String, String>) hashMap)) {
                wb.a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
                wbVar.c.b(wbVar.d.c);
                wb.a((Map<String, String>) hashMap, "mac_sha1", wbVar.c.d);
                wb.a((Map<String, String>) hashMap, "mac_md5", wbVar.c.e);
                wb.a((Map<String, String>) hashMap, "android_id", wbVar.c.f);
            }
            wb.a((Map<String, String>) hashMap, "api_level", wbVar.c.p);
            wb.a((Map<String, String>) hashMap, "app_secret", (String) null);
            wb.a((Map<String, String>) hashMap, "app_token", wbVar.d.d);
            wb.a((Map<String, String>) hashMap, "app_version", wbVar.c.j);
            wb.a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
            wb.b(hashMap, "created_at", wbVar.b);
            wb.a((Map<String, String>) hashMap, "device_known", (Boolean) null);
            wb.a((Map<String, String>) hashMap, "device_name", wbVar.c.l);
            wb.a((Map<String, String>) hashMap, "device_type", wbVar.c.k);
            wb.a((Map<String, String>) hashMap, "environment", wbVar.d.e);
            wb.a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
            wb.a((Map<String, String>) hashMap, "fire_adid", wm.a(contentResolver));
            wb.a((Map<String, String>) hashMap, "fire_tracking_enabled", wm.b(contentResolver));
            wb.a((Map<String, String>) hashMap, "initiated_by", str);
            wb.a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
            wb.a((Map<String, String>) hashMap, "os_name", wbVar.c.n);
            wb.a((Map<String, String>) hashMap, "os_version", wbVar.c.o);
            wb.a((Map<String, String>) hashMap, "package_name", wbVar.c.i);
            wb.a((Map<String, String>) hashMap, "push_token", wbVar.e.h);
            wb.a((Map<String, String>) hashMap, "secret_id", (String) null);
            wb.b((Map<String, String>) hashMap);
            ActivityPackage a3 = wbVar.a(ActivityKind.ATTRIBUTION);
            a3.path = "attribution";
            a3.suffix = "";
            a3.parameters = hashMap;
            vkVar.a = null;
            vkVar.g.a("%s", a3.b());
            try {
                wg a4 = wn.a(a3, vkVar.e);
                if (a4 instanceof vl) {
                    if (a4.h == TrackingState.OPTED_OUT) {
                        ((vp) vkVar.c.get()).i();
                        return;
                    }
                    final vl vlVar = (vl) a4;
                    vkVar.b.a(new Runnable() {
                        public final void run() {
                            vp vpVar = (vp) vk.this.c.get();
                            if (vpVar != null) {
                                vk vkVar = vk.this;
                                vl vlVar = vlVar;
                                vkVar.a(vpVar, vlVar);
                                if (vlVar.g != null) {
                                    JSONObject optJSONObject = vlVar.g.optJSONObject("attribution");
                                    if (optJSONObject != null) {
                                        String optString = optJSONObject.optString("deeplink", null);
                                        if (optString != null) {
                                            vlVar.a = Uri.parse(optString);
                                        }
                                    }
                                }
                                vpVar.a(vlVar);
                            }
                        }
                    });
                }
            } catch (Exception e2) {
                vkVar.g.f("Failed to get attribution (%s)", e2.getMessage());
            }
        }
    }
}
