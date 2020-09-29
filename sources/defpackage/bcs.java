package defpackage;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import com.google.android.exoplayer2.upstream.cache.Cache.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: bcs reason: default package */
public final class bcs implements Cache {
    private static final HashSet<File> a = new HashSet<>();
    private static boolean b;
    private final File c;
    /* access modifiers changed from: private */
    public final bch d;
    private final bcm e;
    private final HashMap<String, ArrayList<a>> f;
    private long g;

    public static synchronized boolean b(File file) {
        boolean contains;
        synchronized (bcs.class) {
            contains = a.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    @Deprecated
    public static synchronized void b() {
        synchronized (bcs.class) {
            b = true;
            a.clear();
        }
    }

    public bcs(File file, bch bch) {
        this(file, bch, null, false);
    }

    private bcs(File file, bch bch, byte[] bArr, boolean z) {
        this(file, bch, new bcm(file, null, false));
    }

    private bcs(File file, bch bch, bcm bcm) {
        if (c(file)) {
            this.c = file;
            this.d = bch;
            this.e = bcm;
            this.f = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") {
                public final void run() {
                    synchronized (bcs.this) {
                        conditionVariable.open();
                        bcs.a(bcs.this);
                        bcs.this.d;
                    }
                }
            }.start();
            conditionVariable.block();
            return;
        }
        StringBuilder sb = new StringBuilder("Another SimpleCache instance uses the folder: ");
        sb.append(file);
        throw new IllegalStateException(sb.toString());
    }

    public final synchronized long a() {
        bcu.b(true);
        return this.g;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized bct a(String str, long j) {
        bct e2;
        while (true) {
            e2 = b(str, j);
            if (e2 == null) {
                wait();
            }
        }
        return e2;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized bct b(String str, long j) {
        bct bct;
        bct bct2;
        bcu.b(true);
        bcl b2 = this.e.b(str);
        if (b2 == null) {
            bct = bct.b(str, j);
        } else {
            while (true) {
                bct a2 = bct.a(b2.b, j);
                bct bct3 = (bct) b2.c.floor(a2);
                if (bct3 == null || bct3.b + bct3.c <= j) {
                    bct bct4 = (bct) b2.c.ceiling(a2);
                    if (bct4 == null) {
                        bct2 = bct.b(b2.b, j);
                    } else {
                        bct2 = bct.a(b2.b, j, bct4.b - j);
                    }
                } else {
                    bct2 = bct3;
                }
                if (!bct2.d || bct2.e.exists()) {
                    bct = bct2;
                } else {
                    c();
                }
            }
            bct = bct2;
        }
        if (bct.d) {
            try {
                bcl b3 = this.e.b(str);
                int i = b3.a;
                bcu.b(bct.d);
                long currentTimeMillis = System.currentTimeMillis();
                bct bct5 = new bct(bct.a, bct.b, bct.c, currentTimeMillis, bct.a(bct.e.getParentFile(), i, bct.b, currentTimeMillis));
                if (bct.e.renameTo(bct5.e)) {
                    bcu.b(b3.c.remove(bct));
                    b3.c.add(bct5);
                    a(bct, (bcj) bct5);
                    return bct5;
                }
                StringBuilder sb = new StringBuilder("Renaming of ");
                sb.append(bct.e);
                sb.append(" to ");
                sb.append(bct5.e);
                sb.append(" failed.");
                throw new CacheException(sb.toString());
            } catch (CacheException unused) {
                return bct;
            }
        } else {
            bcl a3 = this.e.a(str);
            if (a3.e) {
                return null;
            }
            a3.e = true;
            return bct;
        }
    }

    public final synchronized File a(String str, long j, long j2) {
        bcl b2;
        bcu.b(true);
        b2 = this.e.b(str);
        bcu.a(b2);
        bcu.b(b2.e);
        if (!this.c.exists()) {
            this.c.mkdirs();
            c();
        }
        this.d.a(this, j2);
        return bct.a(this.c, b2.a, j, System.currentTimeMillis());
    }

    public final synchronized void a(File file) {
        boolean z = true;
        bcu.b(true);
        bct a2 = bct.a(file, this.e);
        bcu.b(a2 != null);
        bcl b2 = this.e.b(a2.a);
        bcu.a(b2);
        bcu.b(b2.e);
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long a3 = bco.a(b2.d);
            if (a3 != -1) {
                if (a2.b + a2.c > a3) {
                    z = false;
                }
                bcu.b(z);
            }
            a(a2);
            this.e.a();
            notifyAll();
        }
    }

    public final synchronized void a(bcj bcj) {
        bcu.b(true);
        bcl b2 = this.e.b(bcj.a);
        bcu.a(b2);
        bcu.b(b2.e);
        b2.e = false;
        this.e.c(b2.b);
        notifyAll();
    }

    public final synchronized void b(bcj bcj) {
        bcu.b(true);
        a(bcj, true);
    }

    public final synchronized void c(String str, long j) {
        bcp bcp = new bcp();
        bco.a(bcp, j);
        a(str, bcp);
    }

    public final synchronized long a(String str) {
        return bco.a(b(str));
    }

    public final synchronized void a(String str, bcp bcp) {
        bcu.b(true);
        bcm bcm = this.e;
        if (bcm.a(str).a(bcp)) {
            bcm.d = true;
        }
        this.e.a();
    }

    public final synchronized bcn b(String str) {
        bcu.b(true);
        bcl b2 = this.e.b(str);
        if (b2 != null) {
            return b2.d;
        }
        return bcq.a;
    }

    private void a(bct bct) {
        this.e.a(bct.a).a(bct);
        this.g += bct.c;
        b(bct);
    }

    private void a(bcj bcj, boolean z) {
        bcl b2 = this.e.b(bcj.a);
        if (b2 != null && b2.a(bcj)) {
            this.g -= bcj.c;
            if (z) {
                try {
                    this.e.c(b2.b);
                    this.e.a();
                } catch (Throwable th) {
                    c(bcj);
                    throw th;
                }
            }
            c(bcj);
        }
    }

    private void c() {
        ArrayList arrayList = new ArrayList();
        for (bcl bcl : this.e.a.values()) {
            Iterator it = bcl.c.iterator();
            while (it.hasNext()) {
                bcj bcj = (bcj) it.next();
                if (!bcj.e.exists()) {
                    arrayList.add(bcj);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a((bcj) arrayList.get(i), false);
        }
        this.e.b();
        this.e.a();
    }

    private void c(bcj bcj) {
        ArrayList arrayList = (ArrayList) this.f.get(bcj.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).a(bcj);
            }
        }
        this.d.a(bcj);
    }

    private void b(bct bct) {
        ArrayList arrayList = (ArrayList) this.f.get(bct.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).a(this, bct);
            }
        }
        this.d.a(this, bct);
    }

    private void a(bct bct, bcj bcj) {
        ArrayList arrayList = (ArrayList) this.f.get(bct.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).a(this, bct, bcj);
            }
        }
        this.d.a(this, bct, bcj);
    }

    private static synchronized boolean c(File file) {
        synchronized (bcs.class) {
            if (b) {
                return true;
            }
            boolean add = a.add(file.getAbsoluteFile());
            return add;
        }
    }

    static /* synthetic */ void a(bcs bcs) {
        if (!bcs.c.exists()) {
            bcs.c.mkdirs();
            return;
        }
        bcm bcm = bcs.e;
        bcu.b(!bcm.d);
        if (!bcm.c()) {
            bcv bcv = bcm.c;
            bcv.a.delete();
            bcv.b.delete();
            bcm.a.clear();
            bcm.b.clear();
        }
        File[] listFiles = bcs.c.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                File file = listFiles[i];
                if (!file.getName().equals("cached_content_index.exi")) {
                    bct a2 = file.length() > 0 ? bct.a(file, bcs.e) : null;
                    if (a2 != null) {
                        bcs.a(a2);
                    } else {
                        file.delete();
                    }
                }
            }
            bcs.e.b();
            try {
                bcs.e.a();
            } catch (CacheException e2) {
                bdd.b("SimpleCache", "Storing index file failed", e2);
            }
        }
    }
}
