package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vuu reason: default package */
public class vuu {
    private static volatile vuu c;
    private static vvc d = new vut();
    public final ExecutorService a;
    public WeakReference<Activity> b;
    private final Context e;
    private final Map<Class<? extends vuz>, vuz> f;
    private final Handler g;
    /* access modifiers changed from: private */
    public final vux<vuu> h;
    private final vux<?> i;
    private final IdManager j;
    private vus k;
    /* access modifiers changed from: private */
    public AtomicBoolean l = new AtomicBoolean(false);
    private vvc m;
    private boolean n;

    /* renamed from: vuu$a */
    public static class a {
        public boolean a;
        private final Context b;
        private vuz[] c;
        private vwj d;
        private Handler e;
        private vvc f;
        private String g;
        private vux<vuu> h;

        public a(Context context) {
            if (context != null) {
                this.b = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public final a a(vuz... vuzArr) {
            if (this.c == null) {
                new vvw();
                if (!vvw.b(this.b)) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (vuz vuz : vuzArr) {
                        String b2 = vuz.b();
                        char c2 = 65535;
                        int hashCode = b2.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && b2.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c2 = 0;
                            }
                        } else if (b2.equals("com.crashlytics.sdk.android:answers")) {
                            c2 = 1;
                        }
                        if (c2 == 0 || c2 == 1) {
                            arrayList.add(vuz);
                        } else if (!z) {
                            vuu.a().d("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            z = true;
                        }
                    }
                    vuzArr = (vuz[]) arrayList.toArray(new vuz[0]);
                }
                this.c = vuzArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public final vuu a() {
            Map map;
            if (this.d == null) {
                this.d = vwj.a();
            }
            if (this.e == null) {
                this.e = new Handler(Looper.getMainLooper());
            }
            if (this.f == null) {
                if (this.a) {
                    this.f = new vut(3);
                } else {
                    this.f = new vut();
                }
            }
            if (this.g == null) {
                this.g = this.b.getPackageName();
            }
            if (this.h == null) {
                this.h = vux.a;
            }
            vuz[] vuzArr = this.c;
            if (vuzArr == null) {
                map = new HashMap();
            } else {
                map = vuu.a((Collection) Arrays.asList(vuzArr));
            }
            Map map2 = map;
            Context applicationContext = this.b.getApplicationContext();
            vuu vuu = new vuu(applicationContext, map2, this.d, this.e, this.f, this.a, this.h, new IdManager(applicationContext, this.g, null, map2.values()), vuu.a(this.b));
            return vuu;
        }
    }

    vuu(Context context, Map<Class<? extends vuz>, vuz> map, vwj vwj, Handler handler, vvc vvc, boolean z, vux vux, IdManager idManager, Activity activity) {
        this.e = context;
        this.f = map;
        this.a = vwj;
        this.g = handler;
        this.m = vvc;
        this.n = z;
        this.h = vux;
        final int size = map.size();
        this.i = new vux() {
            private CountDownLatch b = new CountDownLatch(size);

            public final void a() {
                this.b.countDown();
                if (this.b.getCount() == 0) {
                    vuu.this.l.set(true);
                    vuu.this.h.a();
                }
            }

            public final void a(Exception exc) {
                vuu.this.h.a(exc);
            }
        };
        this.j = idManager;
        a(activity);
    }

    public static vuu a(Context context, vuz... vuzArr) {
        if (c == null) {
            synchronized (vuu.class) {
                if (c == null) {
                    d(new a(context).a(vuzArr).a());
                }
            }
        }
        return c;
    }

    public static vuu a(vuu vuu) {
        if (c == null) {
            synchronized (vuu.class) {
                if (c == null) {
                    d(vuu);
                }
            }
        }
        return c;
    }

    private static void d(vuu vuu) {
        c = vuu;
        vuu.d();
    }

    public final vuu a(Activity activity) {
        this.b = new WeakReference<>(activity);
        return this;
    }

    private void d() {
        this.k = new vus(this.e);
        this.k.a(new b() {
            public final void a(Activity activity) {
                vuu.this.a(activity);
            }

            public final void b(Activity activity) {
                vuu.this.a(activity);
            }

            public final void c(Activity activity) {
                vuu.this.a(activity);
            }
        });
        b(this.e);
    }

    private void b(Context context) {
        StringBuilder sb;
        Future c2 = c(context);
        Collection e2 = e();
        vvd vvd = new vvd(c2, e2);
        ArrayList<vuz> arrayList = new ArrayList<>(e2);
        Collections.sort(arrayList);
        vvd.a(context, this, vux.a, this.j);
        for (vuz a2 : arrayList) {
            a2.a(context, this, this.i, this.j);
        }
        vvd.i();
        String str = "Fabric";
        if (a().a(str, 3)) {
            sb = new StringBuilder("Initializing io.fabric.sdk.android:fabric");
            sb.append(" [Version: 1.4.7.30");
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (vuz vuz : arrayList) {
            vuz.g.a((vwk) vvd.g);
            a(this.f, vuz);
            vuz.i();
            if (sb != null) {
                sb.append(vuz.b());
                sb.append(" [Version: ");
                sb.append(vuz.a());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            a().a(str, sb.toString());
        }
    }

    private static void a(Map<Class<? extends vuz>, vuz> map, vuz vuz) {
        Class[] a2;
        vwd vwd = vuz.k;
        if (vwd != null) {
            for (Class cls : vwd.a()) {
                if (cls.isInterface()) {
                    for (vuz vuz2 : map.values()) {
                        if (cls.isAssignableFrom(vuz2.getClass())) {
                            vuz.g.a((vwk) vuz2.g);
                        }
                    }
                } else if (((vuz) map.get(cls)) != null) {
                    vuz.g.a((vwk) ((vuz) map.get(cls)).g);
                } else {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    private Collection<vuz> e() {
        return this.f.values();
    }

    public static vvc a() {
        if (c == null) {
            return d;
        }
        return c.m;
    }

    public static boolean b() {
        if (c == null) {
            return false;
        }
        return c.n;
    }

    public static boolean c() {
        return c != null && c.l.get();
    }

    private static void a(Map<Class<? extends vuz>, vuz> map, Collection<? extends vuz> collection) {
        for (vuz vuz : collection) {
            map.put(vuz.getClass(), vuz);
            if (vuz instanceof vva) {
                a(map, ((vva) vuz).c());
            }
        }
    }

    private Future<Map<String, vvb>> c(Context context) {
        return this.a.submit(new vuw(context.getPackageCodePath()));
    }

    public static <T extends vuz> T a(Class<T> cls) {
        if (c != null) {
            return (vuz) c.f.get(cls);
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    static /* synthetic */ Map a(Collection collection) {
        HashMap hashMap = new HashMap(collection.size());
        a((Map<Class<? extends vuz>, vuz>) hashMap, collection);
        return hashMap;
    }

    static /* synthetic */ Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
