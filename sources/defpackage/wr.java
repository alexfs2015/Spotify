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

/* renamed from: wr reason: default package */
public final class wr implements wg {
    wh a;
    WeakReference<wd> b;
    List<ActivityPackage> c;
    AtomicBoolean d;
    Context e;
    wf f = vv.a();
    private xi g = new xe("PackageHandler");
    private boolean h;
    private BackoffStrategy i = vv.g();
    private String j;
    private String k;

    public wr(wd wdVar, Context context, boolean z) {
        this.b = new WeakReference<>(wdVar);
        this.e = context;
        this.h = !z;
        this.j = wdVar.k();
        this.k = wdVar.l();
        this.g.a(new Runnable() {
            public final void run() {
                String str = "Package queue";
                wr wrVar = wr.this;
                wrVar.a = vv.a((wd) wrVar.b.get(), (wg) wrVar);
                wrVar.d = new AtomicBoolean();
                try {
                    wrVar.c = (List) xa.a(wrVar.e, "AdjustIoPackageQueue", str, List.class);
                } catch (Exception e) {
                    wrVar.f.f("Failed to read %s file (%s)", str, e.getMessage());
                    wrVar.c = null;
                }
                if (wrVar.c != null) {
                    wrVar.f.b("Package handler read %d packages", Integer.valueOf(wrVar.c.size()));
                    return;
                }
                wrVar.c = new ArrayList();
            }
        });
    }

    public final void a() {
        this.g.a(new Runnable() {
            public final void run() {
                wr.this.g();
            }
        });
    }

    public final void a(final ActivityPackage activityPackage) {
        this.g.a(new Runnable() {
            public final void run() {
                wr wrVar = wr.this;
                ActivityPackage activityPackage = activityPackage;
                wrVar.c.add(activityPackage);
                wrVar.f.b("Added package %d (%s)", Integer.valueOf(wrVar.c.size()), activityPackage);
                wrVar.f.a("%s", activityPackage.b());
                wrVar.h();
            }
        });
    }

    public final void a(wu wuVar) {
        this.g.a(new Runnable() {
            public final void run() {
                wr wrVar = wr.this;
                if (!wrVar.c.isEmpty()) {
                    wrVar.c.remove(0);
                    wrVar.h();
                    wrVar.d.set(false);
                    wrVar.f.a("Package handler can send", new Object[0]);
                    wrVar.g();
                }
            }
        });
        wd wdVar = (wd) this.b.get();
        if (wdVar != null) {
            wdVar.a(wuVar);
        }
    }

    public final void a(wu wuVar, ActivityPackage activityPackage) {
        wuVar.c = true;
        wd wdVar = (wd) this.b.get();
        if (wdVar != null) {
            wdVar.a(wuVar);
        }
        AnonymousClass5 r8 = new Runnable() {
            public final void run() {
                wr.this.f.a("Package handler can send", new Object[0]);
                wr.this.d.set(false);
                wr.this.a();
            }
        };
        if (activityPackage == null) {
            r8.run();
            return;
        }
        int a2 = activityPackage.a();
        long a3 = xa.a(a2, this.i);
        double d2 = (double) a3;
        Double.isNaN(d2);
        String format = xa.a.format(d2 / 1000.0d);
        this.f.a("Waiting for %s seconds before retrying the %d time", format, Integer.valueOf(a2));
        this.g.a(r8, a3);
    }

    public final void a(wx wxVar) {
        final wx wxVar2;
        if (wxVar != null) {
            wxVar2 = new wx();
            if (wxVar.a != null) {
                wxVar2.a = new HashMap(wxVar.a);
            }
            if (wxVar.b != null) {
                wxVar2.b = new HashMap(wxVar.b);
            }
        } else {
            wxVar2 = null;
        }
        this.g.a(new Runnable() {
            public final void run() {
                wr wrVar = wr.this;
                wx wxVar = wxVar2;
                if (wxVar != null) {
                    wrVar.f.b("Updating package handler queue", new Object[0]);
                    wrVar.f.a("Session callback parameters: %s", wxVar.a);
                    wrVar.f.a("Session partner parameters: %s", wxVar.b);
                    for (ActivityPackage activityPackage : wrVar.c) {
                        Map<String, String> map = activityPackage.parameters;
                        wp.a(map, "callback_params", xa.a(wxVar.a, activityPackage.callbackParameters, "Callback"));
                        wp.a(map, "partner_params", xa.a(wxVar.b, activityPackage.partnerParameters, "Partner"));
                    }
                    wrVar.h();
                }
            }
        });
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
                wr wrVar = wr.this;
                wrVar.c.clear();
                wrVar.h();
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
        xa.a(this.c, this.e, "AdjustIoPackageQueue", "Package queue");
        this.f.b("Package handler wrote %d packages", Integer.valueOf(this.c.size()));
    }
}
