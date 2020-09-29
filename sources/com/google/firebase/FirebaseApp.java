package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.components.DependencyCycleException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class FirebaseApp {
    static final Map<String, FirebaseApp> a = new dp();
    private static final List<String> b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> e = Arrays.asList(new String[0]);
    private static final Set<String> f = Collections.emptySet();
    /* access modifiers changed from: private */
    public static final Object g = new Object();
    private static final Executor h = new c(0);
    private final Context i;
    private final String j;
    private final ffl k;
    private final fgb l;
    private final SharedPreferences m;
    private final fgk n;
    /* access modifiers changed from: private */
    public final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean();
    private final AtomicBoolean q;
    private final List<Object> r = new CopyOnWriteArrayList();
    private final List<Object> s = new CopyOnWriteArrayList();
    private final List<Object> t = new CopyOnWriteArrayList();
    private a u;

    @Deprecated
    public interface a {
    }

    static class b implements defpackage.bth.a {
        private static AtomicReference<b> a = new AtomicReference<>();

        private b() {
        }

        static /* synthetic */ void a(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (a.compareAndSet(null, bVar)) {
                        bth.a(application);
                        bth.a().a((defpackage.bth.a) bVar);
                    }
                }
            }
        }

        public final void a(boolean z) {
            synchronized (FirebaseApp.g) {
                Iterator it = new ArrayList(FirebaseApp.a.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.o.get()) {
                        FirebaseApp.a(firebaseApp, z);
                    }
                }
            }
        }
    }

    static class c implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    static class d extends BroadcastReceiver {
        private static AtomicReference<d> a = new AtomicReference<>();
        private final Context b;

        private d(Context context) {
            this.b = context;
        }

        static /* synthetic */ void a(Context context) {
            if (a.get() == null) {
                d dVar = new d(context);
                if (a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.g) {
                for (FirebaseApp a2 : FirebaseApp.a.values()) {
                    a2.h();
                }
            }
            this.b.unregisterReceiver(this);
        }
    }

    private FirebaseApp(Context context, String str, ffl ffl) {
        this.i = (Context) bxo.a(context);
        this.j = bxo.a(str);
        this.k = (ffl) bxo.a(ffl);
        this.u = new fio();
        this.m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.q = new AtomicBoolean(f());
        AnonymousClass1 r8 = new Object(context, new ffz(0)) {
            public final T a;
            public final fga<T> b;

            {
                this.a = r1;
                this.b = r2;
            }

            public static List<ffv> a(List<String> list) {
                String str = "Could not instantiate %s";
                String str2 = "Could not instantiate %s.";
                ArrayList arrayList = new ArrayList();
                for (String str3 : list) {
                    try {
                        Class cls = Class.forName(str3);
                        if (!ffv.class.isAssignableFrom(cls)) {
                            String.format("Class %s is not an instance of %s", new Object[]{str3, "com.google.firebase.components.ComponentRegistrar"});
                        } else {
                            arrayList.add((ffv) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        }
                    } catch (ClassNotFoundException unused) {
                        String.format("Class %s is not an found.", new Object[]{str3});
                    } catch (IllegalAccessException unused2) {
                        String.format(str2, new Object[]{str3});
                    } catch (InstantiationException unused3) {
                        String.format(str2, new Object[]{str3});
                    } catch (NoSuchMethodException unused4) {
                        String.format(str, new Object[]{str3});
                    } catch (InvocationTargetException unused5) {
                        String.format(str, new Object[]{str3});
                    }
                }
                return arrayList;
            }

            private static Set<fgc> a(Set<fgc> set) {
                HashSet hashSet = new HashSet();
                for (fgc fgc : set) {
                    if (fgc.a()) {
                        hashSet.add(fgc);
                    }
                }
                return hashSet;
            }

            static List<ffs<?>> b(List<ffs<?>> list) {
                HashMap hashMap = new HashMap(list.size());
                for (ffs ffs : list) {
                    fgc fgc = new fgc(ffs);
                    Iterator it = ffs.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Class cls = (Class) it.next();
                            if (hashMap.put(cls, fgc) != null) {
                                throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                            }
                        }
                    }
                }
                for (fgc fgc2 : hashMap.values()) {
                    for (ffw ffw : fgc2.a.b) {
                        if (ffw.a()) {
                            fgc fgc3 = (fgc) hashMap.get(ffw.a);
                            if (fgc3 != null) {
                                fgc2.b.add(fgc3);
                                fgc3.c.add(fgc2);
                            }
                        }
                    }
                }
                HashSet<fgc> hashSet = new HashSet<>(hashMap.values());
                Set a2 = a((Set<fgc>) hashSet);
                ArrayList arrayList = new ArrayList();
                while (!a2.isEmpty()) {
                    fgc fgc4 = (fgc) a2.iterator().next();
                    a2.remove(fgc4);
                    arrayList.add(fgc4.a);
                    for (fgc fgc5 : fgc4.b) {
                        fgc5.c.remove(fgc4);
                        if (fgc5.a()) {
                            a2.add(fgc5);
                        }
                    }
                }
                if (arrayList.size() == list.size()) {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (fgc fgc6 : hashSet) {
                    if (!fgc6.a() && !fgc6.b.isEmpty()) {
                        arrayList2.add(fgc6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
        };
        List a2 = AnonymousClass1.a(r8.b.a(r8.a));
        this.l = new fgb(h, a2, ffs.a(context, Context.class, new Class[0]), ffs.a(this, FirebaseApp.class, new Class[0]), ffs.a(ffl, ffl.class, new Class[0]));
        this.n = (fgk) this.l.a(fgk.class);
    }

    public static FirebaseApp a(Context context) {
        synchronized (g) {
            if (a.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            ffl a2 = ffl.a(context);
            if (a2 == null) {
                return null;
            }
            FirebaseApp a3 = a(context, a2, "[DEFAULT]");
            return a3;
        }
    }

    private static FirebaseApp a(Context context, ffl ffl, String str) {
        FirebaseApp firebaseApp;
        b.a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (g) {
            boolean z = !a.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            bxo.a(z, (Object) sb.toString());
            bxo.a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, ffl);
            a.put(trim, firebaseApp);
        }
        firebaseApp.h();
        return firebaseApp;
    }

    static /* synthetic */ void a(FirebaseApp firebaseApp, boolean z) {
        Iterator it = firebaseApp.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static <T> void a(Class<T> cls, T t2, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (!e.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is not linked. Skipping initialization.");
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb2.toString());
                    }
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb3.toString());
                } catch (InvocationTargetException unused3) {
                    continue;
                } catch (IllegalAccessException unused4) {
                    "Failed to initialize ".concat(String.valueOf(str));
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t2});
            }
        }
    }

    private String e() {
        g();
        return this.j;
    }

    private boolean f() {
        String str = "firebase_data_collection_default_enabled";
        if (this.m.contains(str)) {
            return this.m.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.i.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.i.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    private void g() {
        bxo.a(!this.p.get(), (Object) "FirebaseApp was deleted");
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (g) {
            firebaseApp = (FirebaseApp) a.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(cah.a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    /* access modifiers changed from: private */
    public void h() {
        Class<FirebaseApp> cls = FirebaseApp.class;
        boolean c2 = fr.c(this.i);
        if (c2) {
            d.a(this.i);
        } else {
            this.l.a(c());
        }
        a(cls, this, b, c2);
        if (c()) {
            a(cls, this, c, c2);
            a(Context.class, this.i, d, c2);
        }
    }

    public final Context a() {
        g();
        return this.i;
    }

    public final <T> T a(Class<T> cls) {
        g();
        return this.l.a((Class) cls);
    }

    public final ffl b() {
        g();
        return this.k;
    }

    public final boolean c() {
        return "[DEFAULT]".equals(e());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.j.equals(((FirebaseApp) obj).e());
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public boolean isDataCollectionDefaultEnabled() {
        g();
        return this.q.get();
    }

    public String toString() {
        return bxm.a((Object) this).a("name", this.j).a("options", this.k).toString();
    }
}
