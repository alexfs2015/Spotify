package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wkx reason: default package */
public abstract class wkx<T> {
    private Context a;
    protected final wjx b;
    private wkw<T> c;
    private wky d;
    private final int e;
    private volatile long f;
    private List<wkz> g = new CopyOnWriteArrayList();

    /* renamed from: wkx$a */
    static class a {
        final File a;
        final long b;

        public a(File file, long j) {
            this.a = file;
            this.b = j;
        }
    }

    public wkx(Context context, wkw<T> wkw, wjx wjx, wky wky, int i) {
        this.a = context.getApplicationContext();
        this.c = wkw;
        this.d = wky;
        this.b = wjx;
        this.f = this.b.a();
        this.e = 100;
    }

    private void a(String str) {
        for (wkz b2 : this.g) {
            try {
                b2.b();
            } catch (Exception unused) {
                CommonUtils.b(this.a, "One of the roll over listeners threw an exception");
            }
        }
    }

    private static long b(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final void a(T t) {
        byte[] a2 = this.c.a(t);
        int length = a2.length;
        if (!this.d.a(length, c())) {
            CommonUtils.a(this.a, 4, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.d.a()), Integer.valueOf(length), Integer.valueOf(c())}));
            d();
        }
        this.d.a(a2);
    }

    public final void a(List<File> list) {
        this.d.a(list);
    }

    public final void a(wkz wkz) {
        if (wkz != null) {
            this.g.add(wkz);
        }
    }

    /* access modifiers changed from: protected */
    public int b() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public int c() {
        return 8000;
    }

    public final boolean d() {
        String str;
        boolean z = true;
        if (!this.d.b()) {
            str = a();
            this.d.a(str);
            CommonUtils.a(this.a, 4, String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f = this.b.a();
        } else {
            str = null;
            z = false;
        }
        a(str);
        return z;
    }

    public final List<File> e() {
        return this.d.a(1);
    }

    public final void f() {
        wky wky = this.d;
        wky.a(wky.c());
        this.d.d();
    }

    public final void g() {
        List<File> c2 = this.d.c();
        int b2 = b();
        if (c2.size() > b2) {
            int size = c2.size() - b2;
            CommonUtils.a(this.a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c2.size()), Integer.valueOf(b2), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new Comparator<a>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return (int) (((a) obj).b - ((a) obj2).b);
                }
            });
            for (File file : c2) {
                treeSet.add(new a(file, b(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.d.a((List<File>) arrayList);
        }
    }
}
