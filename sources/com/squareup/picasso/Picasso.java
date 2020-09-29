package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {
    public static final Handler a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            int i = message.what;
            String str = "Main";
            if (i != 3) {
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        vrr vrr = (vrr) list.get(i2);
                        Picasso picasso = vrr.b;
                        vrp vrp = vrr.h;
                        List<vrp> list2 = vrr.i;
                        boolean z = true;
                        boolean z2 = list2 != null && !list2.isEmpty();
                        if (vrp == null && !z2) {
                            z = false;
                        }
                        if (z) {
                            Uri uri = vrr.d.d;
                            Exception exc = vrr.m;
                            Bitmap bitmap = vrr.j;
                            LoadedFrom loadedFrom = vrr.l;
                            if (vrp != null) {
                                picasso.a(bitmap, loadedFrom, vrp);
                            }
                            if (z2) {
                                int size2 = list2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    picasso.a(bitmap, loadedFrom, (vrp) list2.get(i3));
                                }
                            }
                            if (!(picasso.b == null || exc == null)) {
                                picasso.b.onImageLoadFailed(picasso, uri, exc);
                            }
                        }
                    }
                } else if (i == 13) {
                    List list3 = (List) message.obj;
                    int size3 = list3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        vrp vrp2 = (vrp) list3.get(i4);
                        Picasso picasso2 = vrp2.a;
                        Bitmap bitmap2 = null;
                        if (MemoryPolicy.a(vrp2.e)) {
                            bitmap2 = picasso2.b(vrp2.i);
                        }
                        if (bitmap2 != null) {
                            picasso2.a(bitmap2, LoadedFrom.MEMORY, vrp2);
                            if (picasso2.l) {
                                String a = vrp2.b.a();
                                StringBuilder sb = new StringBuilder("from ");
                                sb.append(LoadedFrom.MEMORY);
                                vsv.a(str, "completed", a, sb.toString());
                            }
                        } else {
                            picasso2.a(vrp2);
                            if (picasso2.l) {
                                vsv.a(str, "resumed", vrp2.b.a());
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Unknown handler message received: ");
                    sb2.append(message.what);
                    throw new AssertionError(sb2.toString());
                }
            } else {
                vrp vrp3 = (vrp) message.obj;
                if (vrp3.a.l) {
                    vsv.a(str, "canceled", vrp3.b.a(), "target got garbage collected");
                }
                vrp3.a.d(vrp3.c());
            }
        }
    };
    private static volatile Picasso m = null;
    final c b;
    public final List<vsm> c;
    public final Context d;
    public final vrx e;
    public final vrs f;
    public final vsp g;
    public final Map<ImageView, vrw> h;
    public final ReferenceQueue<Object> i;
    public final Config j;
    public boolean k;
    public volatile boolean l;
    private final d n;
    private final b o;
    private Map<Object, vrp> p;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        public final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public static class a {
        public Downloader a;
        public ExecutorService b;
        public c c;
        public List<vsm> d;
        public Config e;
        private final Context f;
        private vrs g;
        private d h;

        public a(Context context) {
            if (context != null) {
                this.f = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public final a a(vrs vrs) {
            if (this.g == null) {
                this.g = vrs;
                return this;
            }
            throw new IllegalStateException("Memory cache already set.");
        }

        public final Picasso a() {
            Context context = this.f;
            if (this.a == null) {
                this.a = vsv.a(context);
            }
            if (this.g == null) {
                this.g = new vsf(context);
            }
            if (this.b == null) {
                this.b = new vsj();
            }
            if (this.h == null) {
                this.h = d.a;
            }
            vsp vsp = new vsp(this.g);
            Context context2 = context;
            vrx vrx = new vrx(context2, this.b, Picasso.a, this.a, this.g, vsp);
            Picasso picasso = new Picasso(context2, vrx, this.g, this.c, this.h, this.d, vsp, this.e, false, false);
            return picasso;
        }
    }

    static class b extends Thread {
        private final ReferenceQueue<Object> a;
        private final Handler b;

        b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.a = referenceQueue;
            this.b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    defpackage.vrp.a aVar = (defpackage.vrp.a) this.a.remove(1000);
                    Message obtainMessage = this.b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.a;
                        this.b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.b.post(new Runnable() {
                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }
    }

    public interface c {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    public interface d {
        public static final d a = new d() {
            public final vsk a(vsk vsk) {
                return vsk;
            }
        };

        vsk a(vsk vsk);
    }

    Picasso(Context context, vrx vrx, vrs vrs, c cVar, d dVar, List<vsm> list, vsp vsp, Config config, boolean z, boolean z2) {
        this.d = context;
        this.e = vrx;
        this.f = vrs;
        this.b = cVar;
        this.n = dVar;
        this.j = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new vsn(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new vru(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new vrv(context));
        arrayList.add(new vrq(context));
        arrayList.add(new vrz(context));
        arrayList.add(new NetworkRequestHandler(vrx.b, vsp));
        this.c = Collections.unmodifiableList(arrayList);
        this.g = vsp;
        this.p = new WeakHashMap();
        this.h = new WeakHashMap();
        this.k = z;
        this.l = z2;
        this.i = new ReferenceQueue<>();
        this.o = new b(this.i, a);
        this.o.start();
    }

    public final void a(Object obj) {
        vsv.b();
        ArrayList arrayList = new ArrayList(this.p.values());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vrp vrp = (vrp) arrayList.get(i2);
            if (vrp.j.equals(obj)) {
                d(vrp.c());
            }
        }
    }

    public final void b(Object obj) {
        this.e.a(obj);
    }

    public final void c(Object obj) {
        this.e.b(obj);
    }

    public final vsl a(Uri uri) {
        return new vsl(this, uri, 0);
    }

    public final vsl a(String str) {
        if (str == null) {
            return new vsl(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public final vsl a(int i2) {
        if (i2 != 0) {
            return new vsl(this, null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public final vsk a(vsk vsk) {
        vsk a2 = this.n.a(vsk);
        if (a2 != null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder("Request transformer ");
        sb.append(this.n.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(vsk);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(vrp vrp) {
        Object c2 = vrp.c();
        if (!(c2 == null || this.p.get(c2) == vrp)) {
            d(c2);
            this.p.put(c2, vrp);
        }
        b(vrp);
    }

    public final void b(vrp vrp) {
        this.e.a(vrp);
    }

    public final Bitmap b(String str) {
        Bitmap a2 = this.f.a(str);
        if (a2 != null) {
            this.g.a();
        } else {
            this.g.b.sendEmptyMessage(1);
        }
        return a2;
    }

    public void d(Object obj) {
        vsv.b();
        vrp vrp = (vrp) this.p.remove(obj);
        if (vrp != null) {
            vrp.b();
            this.e.b(vrp);
        }
        if (obj instanceof ImageView) {
            vrw vrw = (vrw) this.h.remove((ImageView) obj);
            if (vrw != null) {
                vrw.a();
            }
        }
    }

    public static Picasso a(Context context) {
        if (m == null) {
            synchronized (Picasso.class) {
                if (m == null) {
                    m = new a(context).a();
                }
            }
        }
        return m;
    }

    /* access modifiers changed from: 0000 */
    public void a(Bitmap bitmap, LoadedFrom loadedFrom, vrp vrp) {
        if (!vrp.l) {
            if (!vrp.k) {
                this.p.remove(vrp.c());
            }
            String str = "Main";
            if (bitmap == null) {
                vrp.a();
                if (this.l) {
                    vsv.a(str, "errored", vrp.b.a());
                }
            } else if (loadedFrom != null) {
                vrp.a(bitmap, loadedFrom);
                if (this.l) {
                    String a2 = vrp.b.a();
                    StringBuilder sb = new StringBuilder("from ");
                    sb.append(loadedFrom);
                    vsv.a(str, "completed", a2, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }
}
