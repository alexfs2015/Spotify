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
    private final fer k;
    private final ffh l;
    private final SharedPreferences m;
    private final ffq n;
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

    static class b implements defpackage.bsq.a {
        private static AtomicReference<b> a = new AtomicReference<>();

        private b() {
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

        static /* synthetic */ void a(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (a.compareAndSet(null, bVar)) {
                        bsq.a(application);
                        bsq.a().a((defpackage.bsq.a) bVar);
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

        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.g) {
                for (FirebaseApp a2 : FirebaseApp.a.values()) {
                    a2.h();
                }
            }
            this.b.unregisterReceiver(this);
        }

        static /* synthetic */ void a(Context context) {
            if (a.get() == null) {
                d dVar = new d(context);
                if (a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
    }

    public final Context a() {
        g();
        return this.i;
    }

    private String e() {
        g();
        return this.j;
    }

    public final fer b() {
        g();
        return this.k;
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

    public String toString() {
        return bwv.a((Object) this).a("name", this.j).a("options", this.k).toString();
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (g) {
            firebaseApp = (FirebaseApp) a.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(bzq.a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp a(Context context) {
        synchronized (g) {
            if (a.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            fer a2 = fer.a(context);
            if (a2 == null) {
                return null;
            }
            FirebaseApp a3 = a(context, a2, "[DEFAULT]");
            return a3;
        }
    }

    private static FirebaseApp a(Context context, fer fer, String str) {
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
            bwx.a(z, (Object) sb.toString());
            bwx.a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, fer);
            a.put(trim, firebaseApp);
        }
        firebaseApp.h();
        return firebaseApp;
    }

    public final <T> T a(Class<T> cls) {
        g();
        return this.l.a((Class) cls);
    }

    public boolean isDataCollectionDefaultEnabled() {
        g();
        return this.q.get();
    }

    private FirebaseApp(Context context, String str, fer fer) {
        this.i = (Context) bwx.a(context);
        this.j = bwx.a(str);
        this.k = (fer) bwx.a(fer);
        this.u = new fhu();
        this.m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.q = new AtomicBoolean(f());
        AnonymousClass1 r8 = new Object(context, new fff(0)) {
            public final T a;
            public final ffg<T> b;

            {
                this.a = r1;
                this.b = r2;
            }

            public static List<ffb> a(List<String> list) {
                String str = "Could not instantiate %s";
                String str2 = "Could not instantiate %s.";
                ArrayList arrayList = new ArrayList();
                for (String str3 : list) {
                    try {
                        Class cls = Class.forName(str3);
                        if (!ffb.class.isAssignableFrom(cls)) {
                            String.format("Class %s is not an instance of %s", new Object[]{str3, "com.google.firebase.components.ComponentRegistrar"});
                        } else {
                            arrayList.add((ffb) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
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

            static List<fey<?>> b(List<fey<?>> list) {
                HashMap hashMap = new HashMap(list.size());
                for (fey fey : list) {
                    ffi ffi = new ffi(fey);
                    Iterator it = fey.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Class cls = (Class) it.next();
                            if (hashMap.put(cls, ffi) != null) {
                                throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                            }
                        }
                    }
                }
                for (ffi ffi2 : hashMap.values()) {
                    for (ffc ffc : ffi2.a.b) {
                        if (ffc.a()) {
                            ffi ffi3 = (ffi) hashMap.get(ffc.a);
                            if (ffi3 != null) {
                                ffi2.b.add(ffi3);
                                ffi3.c.add(ffi2);
                            }
                        }
                    }
                }
                HashSet<ffi> hashSet = new HashSet<>(hashMap.values());
                Set a2 = a((Set<ffi>) hashSet);
                ArrayList arrayList = new ArrayList();
                while (!a2.isEmpty()) {
                    ffi ffi4 = (ffi) a2.iterator().next();
                    a2.remove(ffi4);
                    arrayList.add(ffi4.a);
                    for (ffi ffi5 : ffi4.b) {
                        ffi5.c.remove(ffi4);
                        if (ffi5.a()) {
                            a2.add(ffi5);
                        }
                    }
                }
                if (arrayList.size() == list.size()) {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ffi ffi6 : hashSet) {
                    if (!ffi6.a() && !ffi6.b.isEmpty()) {
                        arrayList2.add(ffi6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }

            private static Set<ffi> a(Set<ffi> set) {
                HashSet hashSet = new HashSet();
                for (ffi ffi : set) {
                    if (ffi.a()) {
                        hashSet.add(ffi);
                    }
                }
                return hashSet;
            }
        };
        List a2 = AnonymousClass1.a(r8.b.a(r8.a));
        this.l = new ffh(h, a2, fey.a(context, Context.class, new Class[0]), fey.a(this, FirebaseApp.class, new Class[0]), fey.a(fer, fer.class, new Class[0]));
        this.n = (ffq) this.l.a(ffq.class);
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
        bwx.a(!this.p.get(), (Object) "FirebaseApp was deleted");
    }

    public final boolean c() {
        return "[DEFAULT]".equals(e());
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

    static /* synthetic */ void a(FirebaseApp firebaseApp, boolean z) {
        Iterator it = firebaseApp.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
