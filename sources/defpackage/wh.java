package defpackage;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.BackoffStrategy;
import com.adjust.sdk.TrackingState;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: wh reason: default package */
public final class wh implements vv {
    boolean a;
    vr b;
    BackoffStrategy c;
    List<ActivityPackage> d = new ArrayList();
    wu e;
    WeakReference<vp> f;
    private String g;

    public wh(vp vpVar, boolean z) {
        this.a = !z;
        this.f = new WeakReference<>(vpVar);
        this.g = vpVar.k();
        this.b = vh.a();
        this.c = vh.f();
        this.e = new wq("SdkClickHandler");
    }

    public final void a() {
        this.a = true;
    }

    public final void b() {
        this.a = false;
        d();
    }

    public final void a(final ActivityPackage activityPackage) {
        this.e.a(new Runnable() {
            public final void run() {
                wh.this.d.add(activityPackage);
                wh.this.b.b("Added sdk_click %d", Integer.valueOf(wh.this.d.size()));
                wh.this.b.a("%s", activityPackage.b());
                wh.this.d();
            }
        });
    }

    public final void c() {
        this.e.a(new Runnable() {
            public final void run() {
                vp vpVar = (vp) wh.this.f.get();
                wl wlVar = new wl(vpVar.j());
                try {
                    JSONArray a2 = wlVar.a();
                    boolean z = false;
                    for (int i = 0; i < a2.length(); i++) {
                        JSONArray jSONArray = a2.getJSONArray(i);
                        if (jSONArray.optInt(2, -1) == 0) {
                            String optString = jSONArray.optString(0, null);
                            long optLong = jSONArray.optLong(1, -1);
                            jSONArray.put(2, 1);
                            wh.this.a(wc.a(optString, optLong, vpVar.c(), vpVar.a(), vpVar.b(), vpVar.d()));
                            z = true;
                        }
                    }
                    if (z) {
                        wlVar.a(a2);
                    }
                } catch (JSONException e) {
                    wh.this.b.f("Send saved raw referrers error (%s)", e.getMessage());
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.e.a(new Runnable() {
            public final void run() {
                wh whVar = wh.this;
                if (!whVar.a && !whVar.d.isEmpty()) {
                    ActivityPackage activityPackage = (ActivityPackage) whVar.d.remove(0);
                    int i = activityPackage.retries;
                    AnonymousClass4 r4 = new Runnable(activityPackage) {
                        private /* synthetic */ ActivityPackage a;

                        {
                            this.a = r2;
                        }

                        public final void run() {
                            wh.a(wh.this, this.a);
                            wh.this.d();
                        }
                    };
                    if (i <= 0) {
                        r4.run();
                        return;
                    }
                    long a2 = wm.a(i, whVar.c);
                    double d = (double) a2;
                    Double.isNaN(d);
                    String format = wm.a.format(d / 1000.0d);
                    whVar.b.a("Waiting for %s seconds before retrying sdk_click for the %d time", format, Integer.valueOf(i));
                    whVar.e.a(r4, a2);
                }
            }
        });
    }

    private void b(ActivityPackage activityPackage) {
        int a2 = activityPackage.a();
        this.b.f("Retrying sdk_click package for the %d time", Integer.valueOf(a2));
        a(activityPackage);
    }

    private void a(ActivityPackage activityPackage, String str, Throwable th) {
        this.b.f(wm.a("%s. (%s)", activityPackage.c(), wm.a(str, th)), new Object[0]);
    }

    static /* synthetic */ void a(wh whVar, ActivityPackage activityPackage) {
        long j;
        vp vpVar = (vp) whVar.f.get();
        if (!vpVar.c().isGdprForgotten) {
            String str = (String) activityPackage.parameters.get("source");
            boolean z = false;
            boolean z2 = str != null && str.equals("reftag");
            String str2 = (String) activityPackage.parameters.get("raw_referrer");
            if (!z2 || new wl(vpVar.j()).c(str2, activityPackage.clickTimeInMilliseconds) != null) {
                if (str != null && str.equals("install_referrer")) {
                    z = true;
                }
                String str3 = null;
                long j2 = -1;
                if (z) {
                    j2 = activityPackage.clickTimeInSeconds;
                    j = activityPackage.installBeginTimeInSeconds;
                    str3 = (String) activityPackage.parameters.get("referrer");
                } else {
                    j = -1;
                }
                String i = vh.i();
                if (whVar.g != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(whVar.g);
                    i = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append(activityPackage.path);
                try {
                    wi wiVar = (wi) wn.a(sb2.toString(), activityPackage, whVar.d.size() - 1);
                    if (wiVar.g == null) {
                        whVar.b(activityPackage);
                    } else if (vpVar != null) {
                        if (wiVar.h == TrackingState.OPTED_OUT) {
                            vpVar.i();
                            return;
                        }
                        if (z2) {
                            new wl(vpVar.j()).b(str2, activityPackage.clickTimeInMilliseconds);
                        }
                        if (z) {
                            wiVar.j = j2;
                            wiVar.k = j;
                            wiVar.l = str3;
                            wiVar.a = true;
                        }
                        vpVar.a((wg) wiVar);
                    }
                } catch (UnsupportedEncodingException e2) {
                    whVar.a(activityPackage, "Sdk_click failed to encode parameters", e2);
                } catch (SocketTimeoutException e3) {
                    whVar.a(activityPackage, "Sdk_click request timed out. Will retry later", e3);
                    whVar.b(activityPackage);
                } catch (IOException e4) {
                    whVar.a(activityPackage, "Sdk_click request failed. Will retry later", e4);
                    whVar.b(activityPackage);
                } catch (Throwable th) {
                    whVar.a(activityPackage, "Sdk_click runtime exception", th);
                }
            }
        }
    }
}
