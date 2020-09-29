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
                        wfx wfx = (wfx) list.get(i2);
                        Picasso picasso = wfx.b;
                        wfv wfv = wfx.h;
                        List<wfv> list2 = wfx.i;
                        boolean z = true;
                        boolean z2 = list2 != null && !list2.isEmpty();
                        if (wfv == null && !z2) {
                            z = false;
                        }
                        if (z) {
                            Uri uri = wfx.d.d;
                            Exception exc = wfx.m;
                            Bitmap bitmap = wfx.j;
                            LoadedFrom loadedFrom = wfx.l;
                            if (wfv != null) {
                                picasso.a(bitmap, loadedFrom, wfv);
                            }
                            if (z2) {
                                int size2 = list2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    picasso.a(bitmap, loadedFrom, (wfv) list2.get(i3));
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
                        wfv wfv2 = (wfv) list3.get(i4);
                        Picasso picasso2 = wfv2.a;
                        Bitmap bitmap2 = null;
                        if (MemoryPolicy.a(wfv2.e)) {
                            bitmap2 = picasso2.b(wfv2.i);
                        }
                        if (bitmap2 != null) {
                            picasso2.a(bitmap2, LoadedFrom.MEMORY, wfv2);
                            if (picasso2.l) {
                                String a = wfv2.b.a();
                                StringBuilder sb = new StringBuilder("from ");
                                sb.append(LoadedFrom.MEMORY);
                                whb.a(str, "completed", a, sb.toString());
                            }
                        } else {
                            picasso2.a(wfv2);
                            if (picasso2.l) {
                                whb.a(str, "resumed", wfv2.b.a());
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Unknown handler message received: ");
                    sb2.append(message.what);
                    throw new AssertionError(sb2.toString());
                }
            } else {
                wfv wfv3 = (wfv) message.obj;
                if (wfv3.a.l) {
                    whb.a(str, "canceled", wfv3.b.a(), "target got garbage collected");
                }
                wfv3.a.d(wfv3.c());
            }
        }
    };
    private static volatile Picasso m = null;
    final c b;
    public final List<wgs> c;
    public final Context d;
    public final wgd e;
    public final wfy f;
    public final wgv g;
    public final Map<ImageView, wgc> h;
    public final ReferenceQueue<Object> i;
    public final Config j;
    public boolean k;
    public volatile boolean l;
    private final d n;
    private final b o;
    private Map<Object, wfv> p;

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
        public List<wgs> d;
        public Config e;
        private final Context f;
        private wfy g;
        private d h;

        public a(Context context) {
            if (context != null) {
                this.f = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public final a a(wfy wfy) {
            if (this.g == null) {
                this.g = wfy;
                return this;
            }
            throw new IllegalStateException("Memory cache already set.");
        }

        public final Picasso a() {
            Context context = this.f;
            if (this.a == null) {
                this.a = whb.a(context);
            }
            if (this.g == null) {
                this.g = new wgl(context);
            }
            if (this.b == null) {
                this.b = new wgp();
            }
            if (this.h == null) {
                this.h = d.a;
            }
            wgv wgv = new wgv(this.g);
            Context context2 = context;
            wgd wgd = new wgd(context2, this.b, Picasso.a, this.a, this.g, wgv);
            Picasso picasso = new Picasso(context2, wgd, this.g, this.c, this.h, this.d, wgv, this.e, false, false);
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
                    defpackage.wfv.a aVar = (defpackage.wfv.a) this.a.remove(1000);
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
            public final wgq a(wgq wgq) {
                return wgq;
            }
        };

        wgq a(wgq wgq);
    }

    Picasso(Context context, wgd wgd, wfy wfy, c cVar, d dVar, List<wgs> list, wgv wgv, Config config, boolean z, boolean z2) {
        this.d = context;
        this.e = wgd;
        this.f = wfy;
        this.b = cVar;
        this.n = dVar;
        this.j = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new wgt(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new wga(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new wgb(context));
        arrayList.add(new wfw(context));
        arrayList.add(new wgf(context));
        arrayList.add(new NetworkRequestHandler(wgd.b, wgv));
        this.c = Collections.unmodifiableList(arrayList);
        this.g = wgv;
        this.p = new WeakHashMap();
        this.h = new WeakHashMap();
        this.k = z;
        this.l = z2;
        this.i = new ReferenceQueue<>();
        this.o = new b(this.i, a);
        this.o.start();
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

    public final wgq a(wgq wgq) {
        wgq a2 = this.n.a(wgq);
        if (a2 != null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder("Request transformer ");
        sb.append(this.n.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(wgq);
        throw new IllegalStateException(sb.toString());
    }

    public final wgr a(int i2) {
        if (i2 != 0) {
            return new wgr(this, null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public final wgr a(Uri uri) {
        return new wgr(this, uri, 0);
    }

    public final wgr a(String str) {
        if (str == null) {
            return new wgr(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: 0000 */
    public void a(Bitmap bitmap, LoadedFrom loadedFrom, wfv wfv) {
        if (!wfv.l) {
            if (!wfv.k) {
                this.p.remove(wfv.c());
            }
            String str = "Main";
            if (bitmap == null) {
                wfv.a();
                if (this.l) {
                    whb.a(str, "errored", wfv.b.a());
                }
            } else if (loadedFrom != null) {
                wfv.a(bitmap, loadedFrom);
                if (this.l) {
                    String a2 = wfv.b.a();
                    StringBuilder sb = new StringBuilder("from ");
                    sb.append(loadedFrom);
                    whb.a(str, "completed", a2, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public final void a(Object obj) {
        whb.b();
        ArrayList arrayList = new ArrayList(this.p.values());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wfv wfv = (wfv) arrayList.get(i2);
            if (wfv.j.equals(obj)) {
                d(wfv.c());
            }
        }
    }

    public final void a(wfv wfv) {
        Object c2 = wfv.c();
        if (!(c2 == null || this.p.get(c2) == wfv)) {
            d(c2);
            this.p.put(c2, wfv);
        }
        b(wfv);
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

    public final void b(Object obj) {
        this.e.a(obj);
    }

    public final void b(wfv wfv) {
        this.e.a(wfv);
    }

    public final void c(Object obj) {
        this.e.b(obj);
    }

    public void d(Object obj) {
        whb.b();
        wfv wfv = (wfv) this.p.remove(obj);
        if (wfv != null) {
            wfv.b();
            this.e.b(wfv);
        }
        if (obj instanceof ImageView) {
            wgc wgc = (wgc) this.h.remove((ImageView) obj);
            if (wgc != null) {
                wgc.a();
            }
        }
    }
}
