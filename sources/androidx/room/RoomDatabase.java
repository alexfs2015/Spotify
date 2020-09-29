package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class RoomDatabase {
    @Deprecated
    public volatile po a;
    Executor b;
    public pp c;
    public boolean d;
    @Deprecated
    public List<b> e;
    public final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
    private Executor g;
    private final ox h = a();
    private boolean i;
    private final ThreadLocal<Integer> j = new ThreadLocal<>();
    private final Map<String, Object> k = new ConcurrentHashMap();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    public static class a<T extends RoomDatabase> {
        public ArrayList<b> a;
        public Executor b;
        public boolean c;
        private final Class<T> d;
        private final String e;
        private final Context f;
        private Executor g;
        private defpackage.pp.c h;
        private JournalMode i = JournalMode.AUTOMATIC;
        private boolean j = true;
        private boolean k;
        private final c l = new c();
        private Set<Integer> m;

        public a(Context context, Class<T> cls, String str) {
            this.f = context;
            this.d = cls;
            this.e = str;
        }

        public final a<T> a(pf... pfVarArr) {
            if (this.m == null) {
                this.m = new HashSet();
            }
            for (int i2 = 0; i2 <= 0; i2++) {
                pf pfVar = pfVarArr[0];
                this.m.add(Integer.valueOf(pfVar.a));
                this.m.add(Integer.valueOf(pfVar.b));
            }
            this.l.a(pfVarArr);
            return this;
        }

        public final a<T> a() {
            this.j = false;
            this.k = true;
            return this;
        }

        public final T b() {
            if (this.f == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.d != null) {
                if (this.b == null && this.g == null) {
                    Executor b2 = cx.b();
                    this.g = b2;
                    this.b = b2;
                } else {
                    Executor executor = this.b;
                    if (executor != null && this.g == null) {
                        this.g = executor;
                    } else if (this.b == null) {
                        Executor executor2 = this.g;
                        if (executor2 != null) {
                            this.b = executor2;
                        }
                    }
                }
                if (this.h == null) {
                    this.h = new pv();
                }
                Context context = this.f;
                String str = this.e;
                defpackage.pp.c cVar = this.h;
                c cVar2 = this.l;
                ArrayList<b> arrayList = this.a;
                boolean z = this.c;
                JournalMode journalMode = this.i;
                if (journalMode == JournalMode.AUTOMATIC) {
                    if (VERSION.SDK_INT >= 16) {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        if (activityManager != null && !fa.a(activityManager)) {
                            journalMode = JournalMode.WRITE_AHEAD_LOGGING;
                        }
                    }
                    journalMode = JournalMode.TRUNCATE;
                }
                or orVar = new or(context, str, cVar, cVar2, arrayList, z, journalMode, this.b, this.g, false, this.j, this.k, null);
                T t = (RoomDatabase) oz.a(this.d, "_Impl");
                t.a(orVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }

    public static abstract class b {
        public void a(po poVar) {
        }
    }

    public static class c {
        private dw<dw<pf>> a = new dw<>();

        public final void a(pf... pfVarArr) {
            for (pf pfVar : pfVarArr) {
                int i = pfVar.a;
                int i2 = pfVar.b;
                dw dwVar = (dw) this.a.a(i, null);
                if (dwVar == null) {
                    dwVar = new dw();
                    this.a.b(i, dwVar);
                }
                pf pfVar2 = (pf) dwVar.a(i2, null);
                if (pfVar2 != null) {
                    StringBuilder sb = new StringBuilder("Overriding migration ");
                    sb.append(pfVar2);
                    sb.append(" with ");
                    sb.append(pfVar);
                }
                dwVar.c(i2, pfVar);
            }
        }

        public List<pf> a(List<pf> list, boolean z, int i, int i2) {
            boolean z2;
            int i3;
            int i4;
            int i5 = z ? -1 : 1;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                dw dwVar = (dw) this.a.a(i, null);
                if (dwVar != null) {
                    int b = dwVar.b();
                    z2 = false;
                    if (z) {
                        i4 = b - 1;
                        i3 = -1;
                    } else {
                        i3 = b;
                        i4 = 0;
                    }
                    while (true) {
                        if (i4 == i3) {
                            break;
                        }
                        int b2 = dwVar.b(i4);
                        if (!z ? !(b2 < i2 || b2 >= i) : !(b2 > i2 || b2 <= i)) {
                            list.add(dwVar.c(i4));
                            i = b2;
                            z2 = true;
                            continue;
                            break;
                        }
                        i4 += i5;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract ox a();

    /* access modifiers changed from: protected */
    public abstract pp b(or orVar);

    public final void a(or orVar) {
        this.c = b(orVar);
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (orVar.g == JournalMode.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.c.a(z);
        }
        this.e = orVar.e;
        this.b = orVar.h;
        this.g = new pe(orVar.i);
        this.i = orVar.f;
        this.d = z;
        if (orVar.j) {
            ox oxVar = this.h;
            oxVar.g = new oy(orVar.b, orVar.c, oxVar, oxVar.b.b);
        }
    }

    public final boolean b() {
        po poVar = this.a;
        return poVar != null && poVar.e();
    }

    public final void c() {
        if (!this.i) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public final void d() {
        if (!h() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final Cursor a(pr prVar) {
        c();
        d();
        return this.c.a().a(prVar);
    }

    public final ps a(String str) {
        c();
        d();
        return this.c.a().a(str);
    }

    @Deprecated
    public final void e() {
        c();
        po a2 = this.c.a();
        this.h.a(a2);
        a2.a();
    }

    @Deprecated
    public final void f() {
        this.c.a().b();
        if (!h()) {
            ox oxVar = this.h;
            if (oxVar.c.compareAndSet(false, true)) {
                oxVar.b.b.execute(oxVar.h);
            }
        }
    }

    @Deprecated
    public final void g() {
        this.c.a().c();
    }

    public final void a(po poVar) {
        ox oxVar = this.h;
        synchronized (oxVar) {
            if (oxVar.d) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            poVar.c("PRAGMA temp_store = MEMORY;");
            poVar.c("PRAGMA recursive_triggers='ON';");
            poVar.c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            oxVar.a(poVar);
            oxVar.e = poVar.a("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            oxVar.d = true;
        }
    }

    public final boolean h() {
        return this.c.a().d();
    }
}
