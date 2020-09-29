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

/* renamed from: bdj reason: default package */
public final class bdj implements Cache {
    private static final HashSet<File> a = new HashSet<>();
    private static boolean b;
    private final File c;
    /* access modifiers changed from: private */
    public final bcy d;
    private final bdd e;
    private final HashMap<String, ArrayList<a>> f;
    private long g;

    public bdj(File file, bcy bcy) {
        this(file, bcy, null, false);
    }

    private bdj(File file, bcy bcy, bdd bdd) {
        if (c(file)) {
            this.c = file;
            this.d = bcy;
            this.e = bdd;
            this.f = new HashMap<>();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") {
                public final void run() {
                    synchronized (bdj.this) {
                        conditionVariable.open();
                        bdj.a(bdj.this);
                        bdj.this.d;
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

    private bdj(File file, bcy bcy, byte[] bArr, boolean z) {
        this(file, bcy, new bdd(file, null, false));
    }

    private void a(bda bda, boolean z) {
        bdc b2 = this.e.b(bda.a);
        if (b2 != null && b2.a(bda)) {
            this.g -= bda.c;
            if (z) {
                try {
                    this.e.c(b2.b);
                    this.e.a();
                } catch (Throwable th) {
                    c(bda);
                    throw th;
                }
            }
            c(bda);
        }
    }

    static /* synthetic */ void a(bdj bdj) {
        if (!bdj.c.exists()) {
            bdj.c.mkdirs();
            return;
        }
        bdd bdd = bdj.e;
        bdl.b(!bdd.d);
        if (!bdd.c()) {
            bdm bdm = bdd.c;
            bdm.a.delete();
            bdm.b.delete();
            bdd.a.clear();
            bdd.b.clear();
        }
        File[] listFiles = bdj.c.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                File file = listFiles[i];
                if (!file.getName().equals("cached_content_index.exi")) {
                    bdk a2 = file.length() > 0 ? bdk.a(file, bdj.e) : null;
                    if (a2 != null) {
                        bdj.a(a2);
                    } else {
                        file.delete();
                    }
                }
            }
            bdj.e.b();
            try {
                bdj.e.a();
            } catch (CacheException e2) {
                bdu.b("SimpleCache", "Storing index file failed", e2);
            }
        }
    }

    private void a(bdk bdk) {
        this.e.a(bdk.a).a(bdk);
        this.g += bdk.c;
        b(bdk);
    }

    private void a(bdk bdk, bda bda) {
        ArrayList arrayList = (ArrayList) this.f.get(bdk.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).a(this, bdk, bda);
            }
        }
        this.d.a(this, bdk, bda);
    }

    @Deprecated
    public static synchronized void b() {
        synchronized (bdj.class) {
            b = true;
            a.clear();
        }
    }

    private void b(bdk bdk) {
        ArrayList arrayList = (ArrayList) this.f.get(bdk.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).a(this, bdk);
            }
        }
        this.d.a(this, bdk);
    }

    public static synchronized boolean b(File file) {
        boolean contains;
        synchronized (bdj.class) {
            contains = a.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    private void c() {
        ArrayList arrayList = new ArrayList();
        for (bdc bdc : this.e.a.values()) {
            Iterator it = bdc.c.iterator();
            while (it.hasNext()) {
                bda bda = (bda) it.next();
                if (!bda.e.exists()) {
                    arrayList.add(bda);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a((bda) arrayList.get(i), false);
        }
        this.e.b();
        this.e.a();
    }

    private void c(bda bda) {
        ArrayList arrayList = (ArrayList) this.f.get(bda.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).a(bda);
            }
        }
        this.d.a(bda);
    }

    private static synchronized boolean c(File file) {
        synchronized (bdj.class) {
            if (b) {
                return true;
            }
            boolean add = a.add(file.getAbsoluteFile());
            return add;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized bdk a(String str, long j) {
        bdk e2;
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
    public synchronized bdk b(String str, long j) {
        bdk bdk;
        bdk bdk2;
        bdl.b(true);
        bdc b2 = this.e.b(str);
        if (b2 == null) {
            bdk = bdk.b(str, j);
        } else {
            while (true) {
                bdk a2 = bdk.a(b2.b, j);
                bdk bdk3 = (bdk) b2.c.floor(a2);
                if (bdk3 == null || bdk3.b + bdk3.c <= j) {
                    bdk bdk4 = (bdk) b2.c.ceiling(a2);
                    bdk2 = bdk4 == null ? bdk.b(b2.b, j) : bdk.a(b2.b, j, bdk4.b - j);
                } else {
                    bdk2 = bdk3;
                }
                if (!bdk2.d || bdk2.e.exists()) {
                    bdk = bdk2;
                } else {
                    c();
                }
            }
            bdk = bdk2;
        }
        if (bdk.d) {
            try {
                bdc b3 = this.e.b(str);
                int i = b3.a;
                bdl.b(bdk.d);
                long currentTimeMillis = System.currentTimeMillis();
                bdk bdk5 = new bdk(bdk.a, bdk.b, bdk.c, currentTimeMillis, bdk.a(bdk.e.getParentFile(), i, bdk.b, currentTimeMillis));
                if (bdk.e.renameTo(bdk5.e)) {
                    bdl.b(b3.c.remove(bdk));
                    b3.c.add(bdk5);
                    a(bdk, (bda) bdk5);
                    return bdk5;
                }
                StringBuilder sb = new StringBuilder("Renaming of ");
                sb.append(bdk.e);
                sb.append(" to ");
                sb.append(bdk5.e);
                sb.append(" failed.");
                throw new CacheException(sb.toString());
            } catch (CacheException unused) {
                return bdk;
            }
        } else {
            bdc a3 = this.e.a(str);
            if (a3.e) {
                return null;
            }
            a3.e = true;
            return bdk;
        }
    }

    public final synchronized long a() {
        bdl.b(true);
        return this.g;
    }

    public final synchronized long a(String str) {
        return bdf.a(b(str));
    }

    public final synchronized File a(String str, long j, long j2) {
        bdc b2;
        bdl.b(true);
        b2 = this.e.b(str);
        bdl.a(b2);
        bdl.b(b2.e);
        if (!this.c.exists()) {
            this.c.mkdirs();
            c();
        }
        this.d.a(this, j2);
        return bdk.a(this.c, b2.a, j, System.currentTimeMillis());
    }

    public final synchronized void a(bda bda) {
        bdl.b(true);
        bdc b2 = this.e.b(bda.a);
        bdl.a(b2);
        bdl.b(b2.e);
        b2.e = false;
        this.e.c(b2.b);
        notifyAll();
    }

    public final synchronized void a(File file) {
        boolean z = true;
        bdl.b(true);
        bdk a2 = bdk.a(file, this.e);
        bdl.b(a2 != null);
        bdc b2 = this.e.b(a2.a);
        bdl.a(b2);
        bdl.b(b2.e);
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long a3 = bdf.a(b2.d);
            if (a3 != -1) {
                if (a2.b + a2.c > a3) {
                    z = false;
                }
                bdl.b(z);
            }
            a(a2);
            this.e.a();
            notifyAll();
        }
    }

    public final synchronized void a(String str, bdg bdg) {
        bdl.b(true);
        bdd bdd = this.e;
        if (bdd.a(str).a(bdg)) {
            bdd.d = true;
        }
        this.e.a();
    }

    public final synchronized bde b(String str) {
        bdl.b(true);
        bdc b2 = this.e.b(str);
        if (b2 != null) {
            return b2.d;
        }
        return bdh.a;
    }

    public final synchronized void b(bda bda) {
        bdl.b(true);
        a(bda, true);
    }

    public final synchronized void c(String str, long j) {
        bdg bdg = new bdg();
        bdf.a(bdg, j);
        a(str, bdg);
    }
}
