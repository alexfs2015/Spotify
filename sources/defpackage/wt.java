package defpackage;

import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.TrackingState;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;

/* renamed from: wt reason: default package */
public final class wt implements wh {
    private xg a = new xe("RequestHandler");
    private WeakReference<wg> b;
    private WeakReference<wd> c;
    private wf d = vv.a();
    private String e;
    private String f;

    public wt(wd wdVar, wg wgVar) {
        this.b = new WeakReference<>(wgVar);
        this.c = new WeakReference<>(wdVar);
        this.e = wgVar.e();
        this.f = wgVar.f();
    }

    private void a(ActivityPackage activityPackage, String str, Throwable th) {
        String a2 = xa.a("%s. (%s) Will retry later", activityPackage.c(), xa.a(str, th));
        this.d.f(a2, new Object[0]);
        wu a3 = wu.a(activityPackage);
        a3.e = a2;
        wg wgVar = (wg) this.b.get();
        if (wgVar != null) {
            wgVar.a(a3, activityPackage);
        }
    }

    static /* synthetic */ void a(wt wtVar, ActivityPackage activityPackage, int i) {
        String str;
        if (activityPackage.activityKind != ActivityKind.GDPR) {
            str = vv.i();
            if (wtVar.e != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(wtVar.e);
                str = sb.toString();
            }
        } else {
            str = vv.j();
            if (wtVar.f != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(wtVar.f);
                str = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(activityPackage.path);
        try {
            wu a2 = xb.a(sb3.toString(), activityPackage, i);
            wg wgVar = (wg) wtVar.b.get();
            if (wgVar != null) {
                wd wdVar = (wd) wtVar.c.get();
                if (wdVar != null) {
                    if (a2.h == TrackingState.OPTED_OUT) {
                        wdVar.i();
                    } else if (a2.g == null) {
                        wgVar.a(a2, activityPackage);
                    } else {
                        wgVar.a(a2);
                    }
                }
            }
        } catch (UnsupportedEncodingException e2) {
            wtVar.b(activityPackage, "Failed to encode parameters", e2);
        } catch (SocketTimeoutException e3) {
            wtVar.a(activityPackage, "Request timed out", (Throwable) e3);
        } catch (IOException e4) {
            wtVar.a(activityPackage, "Request failed", (Throwable) e4);
        } catch (Throwable th) {
            wtVar.b(activityPackage, "Runtime exception", th);
        }
    }

    private void b(ActivityPackage activityPackage, String str, Throwable th) {
        String a2 = xa.a("%s. (%s)", activityPackage.c(), xa.a(str, th));
        this.d.f(a2, new Object[0]);
        wu a3 = wu.a(activityPackage);
        a3.e = a2;
        wg wgVar = (wg) this.b.get();
        if (wgVar != null) {
            wgVar.a(a3);
        }
    }

    public final void a(final ActivityPackage activityPackage, final int i) {
        this.a.a(new Runnable() {
            public final void run() {
                wt.a(wt.this, activityPackage, i);
            }
        });
    }
}
