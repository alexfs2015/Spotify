package defpackage;

import android.content.Context;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.BackoffStrategy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wd reason: default package */
public final class wd implements vs {
    vt a;
    WeakReference<vp> b;
    List<ActivityPackage> c;
    AtomicBoolean d;
    Context e;
    vr f = vh.a();
    private wu g = new wq("PackageHandler");
    private boolean h;
    private BackoffStrategy i = vh.g();
    private String j;
    private String k;

    public wd(vp vpVar, Context context, boolean z) {
        this.b = new WeakReference<>(vpVar);
        this.e = context;
        this.h = !z;
        this.j = vpVar.k();
        this.k = vpVar.l();
        this.g.a(new Runnable() {
            public final void run() {
                String str = "Package queue";
                wd wdVar = wd.this;
                wdVar.a = vh.a((vp) wdVar.b.get(), (vs) wdVar);
                wdVar.d = new AtomicBoolean();
                try {
                    wdVar.c = (List) wm.a(wdVar.e, "AdjustIoPackageQueue", str, List.class);
                } catch (Exception e) {
                    wdVar.f.f("Failed to read %s file (%s)", str, e.getMessage());
                    wdVar.c = null;
                }
                if (wdVar.c != null) {
                    wdVar.f.b("Package handler read %d packages", Integer.valueOf(wdVar.c.size()));
                    return;
                }
                wdVar.c = new ArrayList();
            }
        });
    }

    public final void a(final ActivityPackage activityPackage) {
        this.g.a(new Runnable() {
            public final void run() {
                wd wdVar = wd.this;
                ActivityPackage activityPackage = activityPackage;
                wdVar.c.add(activityPackage);
                wdVar.f.b("Added package %d (%s)", Integer.valueOf(wdVar.c.size()), activityPackage);
                wdVar.f.a("%s", activityPackage.b());
                wdVar.h();
            }
        });
    }

    public final void a() {
        this.g.a(new Runnable() {
            public final void run() {
                wd.this.g();
            }
        });
    }

    public final void a(wg wgVar) {
        this.g.a(new Runnable() {
            public final void run() {
                wd wdVar = wd.this;
                if (!wdVar.c.isEmpty()) {
                    wdVar.c.remove(0);
                    wdVar.h();
                    wdVar.d.set(false);
                    wdVar.f.a("Package handler can send", new Object[0]);
                    wdVar.g();
                }
            }
        });
        vp vpVar = (vp) this.b.get();
        if (vpVar != null) {
            vpVar.a(wgVar);
        }
    }

    public final void a(wg wgVar, ActivityPackage activityPackage) {
        wgVar.c = true;
        vp vpVar = (vp) this.b.get();
        if (vpVar != null) {
            vpVar.a(wgVar);
        }
        AnonymousClass5 r8 = new Runnable() {
            public final void run() {
                wd.this.f.a("Package handler can send", new Object[0]);
                wd.this.d.set(false);
                wd.this.a();
            }
        };
        if (activityPackage == null) {
            r8.run();
            return;
        }
        int a2 = activityPackage.a();
        long a3 = wm.a(a2, this.i);
        double d2 = (double) a3;
        Double.isNaN(d2);
        String format = wm.a.format(d2 / 1000.0d);
        this.f.a("Waiting for %s seconds before retrying the %d time", format, Integer.valueOf(a2));
        this.g.a(r8, a3);
    }

    public final void b() {
        this.h = true;
    }

    public final void c() {
        this.h = false;
    }

    public final void d() {
        this.g.a(new Runnable() {
            public final void run() {
                wd wdVar = wd.this;
                wdVar.c.clear();
                wdVar.h();
            }
        });
    }

    public final String e() {
        return this.j;
    }

    public final String f() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        if (!this.c.isEmpty()) {
            if (this.h) {
                this.f.b("Package handler is paused", new Object[0]);
            } else if (this.d.getAndSet(true)) {
                this.f.a("Package handler is already sending", new Object[0]);
            } else {
                this.a.a((ActivityPackage) this.c.get(0), this.c.size() - 1);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        wm.a(this.c, this.e, "AdjustIoPackageQueue", "Package queue");
        this.f.b("Package handler wrote %d packages", Integer.valueOf(this.c.size()));
    }

    public final void a(wj wjVar) {
        final wj wjVar2;
        if (wjVar != null) {
            wjVar2 = new wj();
            if (wjVar.a != null) {
                wjVar2.a = new HashMap(wjVar.a);
            }
            if (wjVar.b != null) {
                wjVar2.b = new HashMap(wjVar.b);
            }
        } else {
            wjVar2 = null;
        }
        this.g.a(new Runnable() {
            public final void run() {
                wd wdVar = wd.this;
                wj wjVar = wjVar2;
                if (wjVar != null) {
                    wdVar.f.b("Updating package handler queue", new Object[0]);
                    wdVar.f.a("Session callback parameters: %s", wjVar.a);
                    wdVar.f.a("Session partner parameters: %s", wjVar.b);
                    for (ActivityPackage activityPackage : wdVar.c) {
                        Map<String, String> map = activityPackage.parameters;
                        wb.a(map, "callback_params", wm.a(wjVar.a, activityPackage.callbackParameters, "Callback"));
                        wb.a(map, "partner_params", wm.a(wjVar.b, activityPackage.partnerParameters, "Partner"));
                    }
                    wdVar.h();
                }
            }
        });
    }
}
