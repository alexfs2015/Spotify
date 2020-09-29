package defpackage;

import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.TrackingState;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;

/* renamed from: wf reason: default package */
public final class wf implements vt {
    private ws a = new wq("RequestHandler");
    private WeakReference<vs> b;
    private WeakReference<vp> c;
    private vr d = vh.a();
    private String e;
    private String f;

    public wf(vp vpVar, vs vsVar) {
        this.b = new WeakReference<>(vsVar);
        this.c = new WeakReference<>(vpVar);
        this.e = vsVar.e();
        this.f = vsVar.f();
    }

    public final void a(final ActivityPackage activityPackage, final int i) {
        this.a.a(new Runnable() {
            public final void run() {
                wf.a(wf.this, activityPackage, i);
            }
        });
    }

    private void a(ActivityPackage activityPackage, String str, Throwable th) {
        String a2 = wm.a("%s. (%s) Will retry later", activityPackage.c(), wm.a(str, th));
        this.d.f(a2, new Object[0]);
        wg a3 = wg.a(activityPackage);
        a3.e = a2;
        vs vsVar = (vs) this.b.get();
        if (vsVar != null) {
            vsVar.a(a3, activityPackage);
        }
    }

    private void b(ActivityPackage activityPackage, String str, Throwable th) {
        String a2 = wm.a("%s. (%s)", activityPackage.c(), wm.a(str, th));
        this.d.f(a2, new Object[0]);
        wg a3 = wg.a(activityPackage);
        a3.e = a2;
        vs vsVar = (vs) this.b.get();
        if (vsVar != null) {
            vsVar.a(a3);
        }
    }

    static /* synthetic */ void a(wf wfVar, ActivityPackage activityPackage, int i) {
        String str;
        if (activityPackage.activityKind != ActivityKind.GDPR) {
            str = vh.i();
            if (wfVar.e != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(wfVar.e);
                str = sb.toString();
            }
        } else {
            str = vh.j();
            if (wfVar.f != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(wfVar.f);
                str = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(activityPackage.path);
        try {
            wg a2 = wn.a(sb3.toString(), activityPackage, i);
            vs vsVar = (vs) wfVar.b.get();
            if (vsVar != null) {
                vp vpVar = (vp) wfVar.c.get();
                if (vpVar != null) {
                    if (a2.h == TrackingState.OPTED_OUT) {
                        vpVar.i();
                    } else if (a2.g == null) {
                        vsVar.a(a2, activityPackage);
                    } else {
                        vsVar.a(a2);
                    }
                }
            }
        } catch (UnsupportedEncodingException e2) {
            wfVar.b(activityPackage, "Failed to encode parameters", e2);
        } catch (SocketTimeoutException e3) {
            wfVar.a(activityPackage, "Request timed out", (Throwable) e3);
        } catch (IOException e4) {
            wfVar.a(activityPackage, "Request failed", (Throwable) e4);
        } catch (Throwable th) {
            wfVar.b(activityPackage, "Runtime exception", th);
        }
    }
}
