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

/* renamed from: wja reason: default package */
public class wja {
    private static volatile wja c;
    private static wji d = new wiz();
    public final ExecutorService a;
    public WeakReference<Activity> b;
    private final Context e;
    private final Map<Class<? extends wjf>, wjf> f;
    private final Handler g;
    /* access modifiers changed from: private */
    public final wjd<wja> h;
    private final wjd<?> i;
    private final IdManager j;
    private wiy k;
    /* access modifiers changed from: private */
    public AtomicBoolean l = new AtomicBoolean(false);
    private wji m;
    private boolean n;

    /* renamed from: wja$a */
    public static class a {
        public boolean a;
        private final Context b;
        private wjf[] c;
        private wkp d;
        private Handler e;
        private wji f;
        private String g;
        private wjd<wja> h;

        public a(Context context) {
            if (context != null) {
                this.b = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public final a a(wjf... wjfArr) {
            if (this.c == null) {
                new wkc();
                if (!wkc.b(this.b)) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (wjf wjf : wjfArr) {
                        String b2 = wjf.b();
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
                            arrayList.add(wjf);
                        } else if (!z) {
                            wja.a().d("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            z = true;
                        }
                    }
                    wjfArr = (wjf[]) arrayList.toArray(new wjf[0]);
                }
                this.c = wjfArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public final wja a() {
            if (this.d == null) {
                this.d = wkp.a();
            }
            if (this.e == null) {
                this.e = new Handler(Looper.getMainLooper());
            }
            if (this.f == null) {
                if (this.a) {
                    this.f = new wiz(3);
                } else {
                    this.f = new wiz();
                }
            }
            if (this.g == null) {
                this.g = this.b.getPackageName();
            }
            if (this.h == null) {
                this.h = wjd.a;
            }
            wjf[] wjfArr = this.c;
            Map hashMap = wjfArr == null ? new HashMap() : wja.a((Collection) Arrays.asList(wjfArr));
            Context applicationContext = this.b.getApplicationContext();
            wja wja = new wja(applicationContext, hashMap, this.d, this.e, this.f, this.a, this.h, new IdManager(applicationContext, this.g, null, hashMap.values()), wja.a(this.b));
            return wja;
        }
    }

    wja(Context context, Map<Class<? extends wjf>, wjf> map, wkp wkp, Handler handler, wji wji, boolean z, wjd wjd, IdManager idManager, Activity activity) {
        this.e = context;
        this.f = map;
        this.a = wkp;
        this.g = handler;
        this.m = wji;
        this.n = z;
        this.h = wjd;
        final int size = map.size();
        this.i = new wjd() {
            private CountDownLatch b = new CountDownLatch(size);

            public final void a() {
                this.b.countDown();
                if (this.b.getCount() == 0) {
                    wja.this.l.set(true);
                    wja.this.h.a();
                }
            }

            public final void a(Exception exc) {
                wja.this.h.a(exc);
            }
        };
        this.j = idManager;
        a(activity);
    }

    static /* synthetic */ Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    static /* synthetic */ Map a(Collection collection) {
        HashMap hashMap = new HashMap(collection.size());
        a((Map<Class<? extends wjf>, wjf>) hashMap, collection);
        return hashMap;
    }

    public static wja a(Context context, wjf... wjfArr) {
        if (c == null) {
            synchronized (wja.class) {
                if (c == null) {
                    d(new a(context).a(wjfArr).a());
                }
            }
        }
        return c;
    }

    public static wja a(wja wja) {
        if (c == null) {
            synchronized (wja.class) {
                if (c == null) {
                    d(wja);
                }
            }
        }
        return c;
    }

    public static <T extends wjf> T a(Class<T> cls) {
        if (c != null) {
            return (wjf) c.f.get(cls);
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    public static wji a() {
        return c == null ? d : c.m;
    }

    private static void a(Map<Class<? extends wjf>, wjf> map, Collection<? extends wjf> collection) {
        for (wjf wjf : collection) {
            map.put(wjf.getClass(), wjf);
            if (wjf instanceof wjg) {
                a(map, ((wjg) wjf).c());
            }
        }
    }

    private static void a(Map<Class<? extends wjf>, wjf> map, wjf wjf) {
        Class[] a2;
        wkj wkj = wjf.k;
        if (wkj != null) {
            for (Class cls : wkj.a()) {
                if (cls.isInterface()) {
                    for (wjf wjf2 : map.values()) {
                        if (cls.isAssignableFrom(wjf2.getClass())) {
                            wjf.g.a((wkq) wjf2.g);
                        }
                    }
                } else if (((wjf) map.get(cls)) != null) {
                    wjf.g.a((wkq) ((wjf) map.get(cls)).g);
                } else {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    private void b(Context context) {
        StringBuilder sb;
        Future c2 = c(context);
        Collection e2 = e();
        wjj wjj = new wjj(c2, e2);
        ArrayList<wjf> arrayList = new ArrayList<>(e2);
        Collections.sort(arrayList);
        wjj.a(context, this, wjd.a, this.j);
        for (wjf a2 : arrayList) {
            a2.a(context, this, this.i, this.j);
        }
        wjj.i();
        String str = "Fabric";
        if (a().a(str, 3)) {
            sb = new StringBuilder("Initializing io.fabric.sdk.android:fabric");
            sb.append(" [Version: 1.4.7.30");
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (wjf wjf : arrayList) {
            wjf.g.a((wkq) wjj.g);
            a(this.f, wjf);
            wjf.i();
            if (sb != null) {
                sb.append(wjf.b());
                sb.append(" [Version: ");
                sb.append(wjf.a());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            a().a(str, sb.toString());
        }
    }

    public static boolean b() {
        if (c == null) {
            return false;
        }
        return c.n;
    }

    private Future<Map<String, wjh>> c(Context context) {
        return this.a.submit(new wjc(context.getPackageCodePath()));
    }

    public static boolean c() {
        return c != null && c.l.get();
    }

    private void d() {
        this.k = new wiy(this.e);
        this.k.a(new b() {
            public final void a(Activity activity) {
                wja.this.a(activity);
            }

            public final void b(Activity activity) {
                wja.this.a(activity);
            }

            public final void c(Activity activity) {
                wja.this.a(activity);
            }
        });
        b(this.e);
    }

    private static void d(wja wja) {
        c = wja;
        wja.d();
    }

    private Collection<wjf> e() {
        return this.f.values();
    }

    public final wja a(Activity activity) {
        this.b = new WeakReference<>(activity);
        return this;
    }
}
