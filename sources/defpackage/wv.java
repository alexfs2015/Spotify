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

/* renamed from: wv reason: default package */
public final class wv implements wj {
    boolean a;
    wf b;
    BackoffStrategy c;
    List<ActivityPackage> d = new ArrayList();
    xi e;
    WeakReference<wd> f;
    private String g;

    public wv(wd wdVar, boolean z) {
        this.a = !z;
        this.f = new WeakReference<>(wdVar);
        this.g = wdVar.k();
        this.b = vv.a();
        this.c = vv.f();
        this.e = new xe("SdkClickHandler");
    }

    private void a(ActivityPackage activityPackage, String str, Throwable th) {
        this.b.f(xa.a("%s. (%s)", activityPackage.c(), xa.a(str, th)), new Object[0]);
    }

    static /* synthetic */ void a(wv wvVar, ActivityPackage activityPackage) {
        long j;
        wd wdVar = (wd) wvVar.f.get();
        if (!wdVar.c().isGdprForgotten) {
            String str = (String) activityPackage.parameters.get("source");
            boolean z = false;
            boolean z2 = str != null && str.equals("reftag");
            String str2 = (String) activityPackage.parameters.get("raw_referrer");
            if (!z2 || new wz(wdVar.j()).c(str2, activityPackage.clickTimeInMilliseconds) != null) {
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
                String i = vv.i();
                if (wvVar.g != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(wvVar.g);
                    i = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append(activityPackage.path);
                try {
                    ww wwVar = (ww) xb.a(sb2.toString(), activityPackage, wvVar.d.size() - 1);
                    if (wwVar.g == null) {
                        wvVar.b(activityPackage);
                    } else if (wdVar != null) {
                        if (wwVar.h == TrackingState.OPTED_OUT) {
                            wdVar.i();
                            return;
                        }
                        if (z2) {
                            new wz(wdVar.j()).b(str2, activityPackage.clickTimeInMilliseconds);
                        }
                        if (z) {
                            wwVar.j = j2;
                            wwVar.k = j;
                            wwVar.l = str3;
                            wwVar.a = true;
                        }
                        wdVar.a((wu) wwVar);
                    }
                } catch (UnsupportedEncodingException e2) {
                    wvVar.a(activityPackage, "Sdk_click failed to encode parameters", e2);
                } catch (SocketTimeoutException e3) {
                    wvVar.a(activityPackage, "Sdk_click request timed out. Will retry later", e3);
                    wvVar.b(activityPackage);
                } catch (IOException e4) {
                    wvVar.a(activityPackage, "Sdk_click request failed. Will retry later", e4);
                    wvVar.b(activityPackage);
                } catch (Throwable th) {
                    wvVar.a(activityPackage, "Sdk_click runtime exception", th);
                }
            }
        }
    }

    private void b(ActivityPackage activityPackage) {
        int a2 = activityPackage.a();
        this.b.f("Retrying sdk_click package for the %d time", Integer.valueOf(a2));
        a(activityPackage);
    }

    public final void a() {
        this.a = true;
    }

    public final void a(final ActivityPackage activityPackage) {
        this.e.a(new Runnable() {
            public final void run() {
                wv.this.d.add(activityPackage);
                wv.this.b.b("Added sdk_click %d", Integer.valueOf(wv.this.d.size()));
                wv.this.b.a("%s", activityPackage.b());
                wv.this.d();
            }
        });
    }

    public final void b() {
        this.a = false;
        d();
    }

    public final void c() {
        this.e.a(new Runnable() {
            public final void run() {
                wd wdVar = (wd) wv.this.f.get();
                wz wzVar = new wz(wdVar.j());
                try {
                    JSONArray a2 = wzVar.a();
                    boolean z = false;
                    for (int i = 0; i < a2.length(); i++) {
                        JSONArray jSONArray = a2.getJSONArray(i);
                        if (jSONArray.optInt(2, -1) == 0) {
                            String optString = jSONArray.optString(0, null);
                            long optLong = jSONArray.optLong(1, -1);
                            jSONArray.put(2, 1);
                            wv.this.a(wq.a(optString, optLong, wdVar.c(), wdVar.a(), wdVar.b(), wdVar.d()));
                            z = true;
                        }
                    }
                    if (z) {
                        wzVar.a(a2);
                    }
                } catch (JSONException e) {
                    wv.this.b.f("Send saved raw referrers error (%s)", e.getMessage());
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.e.a(new Runnable() {
            public final void run() {
                wv wvVar = wv.this;
                if (!wvVar.a && !wvVar.d.isEmpty()) {
                    ActivityPackage activityPackage = (ActivityPackage) wvVar.d.remove(0);
                    int i = activityPackage.retries;
                    AnonymousClass4 r4 = new Runnable(activityPackage) {
                        private /* synthetic */ ActivityPackage a;

                        {
                            this.a = r2;
                        }

                        public final void run() {
                            wv.a(wv.this, this.a);
                            wv.this.d();
                        }
                    };
                    if (i <= 0) {
                        r4.run();
                        return;
                    }
                    long a2 = xa.a(i, wvVar.c);
                    double d = (double) a2;
                    Double.isNaN(d);
                    String format = xa.a.format(d / 1000.0d);
                    wvVar.b.a("Waiting for %s seconds before retrying sdk_click for the %d time", format, Integer.valueOf(i));
                    wvVar.e.a(r4, a2);
                }
            }
        });
    }
}
