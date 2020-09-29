package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.NetworkRequestHandler.ContentLengthException;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: wgd reason: default package */
public final class wgd {
    final Context a;
    public final Downloader b;
    final Map<String, wfx> c;
    final Map<Object, wfv> d;
    final Map<Object, wfv> e;
    final Set<Object> f;
    final Handler g;
    final Handler h;
    final wfy i;
    final List<wfx> j;
    final boolean k;
    boolean l;
    private b m = new b();
    private ExecutorService n;
    private wgv o;
    private c p;

    /* renamed from: wgd$a */
    static class a extends Handler {
        private final wgd a;

        public a(Looper looper, wgd wgd) {
            super(looper);
            this.a = wgd;
        }

        public final void handleMessage(Message message) {
            final Message message2 = message;
            String str = "canceled";
            String str2 = "Dispatcher";
            switch (message2.what) {
                case 1:
                    this.a.a((wfv) message2.obj, true);
                    return;
                case 2:
                    wfv wfv = (wfv) message2.obj;
                    wgd wgd = this.a;
                    String str3 = wfv.i;
                    wfx wfx = (wfx) wgd.c.get(str3);
                    if (wfx != null) {
                        wfx.b(wfv);
                        if (wfx.b()) {
                            wgd.c.remove(str3);
                            if (wfv.a.l) {
                                whb.a(str2, str, wfv.b.a());
                            }
                        }
                    }
                    if (wgd.f.contains(wfv.j)) {
                        wgd.e.remove(wfv.c());
                        if (wfv.a.l) {
                            whb.a(str2, str, wfv.b.a(), "because paused request got canceled");
                        }
                    }
                    wfv wfv2 = (wfv) wgd.d.remove(wfv.c());
                    if (wfv2 != null && wfv2.a.l) {
                        whb.a(str2, str, wfv2.b.a(), "from replaying");
                    }
                    return;
                case 4:
                    wfx wfx2 = (wfx) message2.obj;
                    wgd wgd2 = this.a;
                    if (MemoryPolicy.b(wfx2.e)) {
                        wgd2.i.a(wfx2.c, wfx2.j);
                    }
                    wgd2.c.remove(wfx2.c);
                    wgd2.d(wfx2);
                    if (wfx2.b.l) {
                        whb.a(str2, "batched", whb.a(wfx2), "for completion");
                    }
                    return;
                case 5:
                    this.a.c((wfx) message2.obj);
                    return;
                case 6:
                    this.a.a((wfx) message2.obj, false);
                    return;
                case 7:
                    wgd wgd3 = this.a;
                    ArrayList arrayList = new ArrayList(wgd3.j);
                    wgd3.j.clear();
                    wgd3.h.sendMessage(wgd3.h.obtainMessage(8, arrayList));
                    wgd.a((List<wfx>) arrayList);
                    return;
                case 9:
                    this.a.a((NetworkInfo) message2.obj);
                    return;
                case 10:
                    this.a.l = message2.arg1 == 1;
                    return;
                case 11:
                    Object obj = message2.obj;
                    wgd wgd4 = this.a;
                    if (wgd4.f.add(obj)) {
                        Iterator it = wgd4.c.values().iterator();
                        while (it.hasNext()) {
                            wfx wfx3 = (wfx) it.next();
                            boolean z = wfx3.b.l;
                            wfv wfv3 = wfx3.h;
                            List<wfv> list = wfx3.i;
                            boolean z2 = list != null && !list.isEmpty();
                            if (wfv3 != null || z2) {
                                String str4 = "' was paused";
                                String str5 = "because tag '";
                                String str6 = "paused";
                                if (wfv3 != null && wfv3.j.equals(obj)) {
                                    wfx3.b(wfv3);
                                    wgd4.e.put(wfv3.c(), wfv3);
                                    if (z) {
                                        String a2 = wfv3.b.a();
                                        StringBuilder sb = new StringBuilder(str5);
                                        sb.append(obj);
                                        sb.append(str4);
                                        whb.a(str2, str6, a2, sb.toString());
                                    }
                                }
                                if (z2) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        wfv wfv4 = (wfv) list.get(size);
                                        if (wfv4.j.equals(obj)) {
                                            wfx3.b(wfv4);
                                            wgd4.e.put(wfv4.c(), wfv4);
                                            if (z) {
                                                String a3 = wfv4.b.a();
                                                StringBuilder sb2 = new StringBuilder(str5);
                                                sb2.append(obj);
                                                sb2.append(str4);
                                                whb.a(str2, str6, a3, sb2.toString());
                                            }
                                        }
                                    }
                                }
                                if (wfx3.b()) {
                                    it.remove();
                                    if (z) {
                                        whb.a(str2, str, whb.a(wfx3), "all actions paused");
                                    }
                                }
                            }
                        }
                    }
                    return;
                case 12:
                    this.a.c(message2.obj);
                    return;
                default:
                    Picasso.a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message2.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
            }
        }
    }

    /* renamed from: wgd$b */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: wgd$c */
    static class c extends BroadcastReceiver {
        final wgd a;

        c(wgd wgd) {
            this.a = wgd;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    String str = "state";
                    if (intent.hasExtra(str)) {
                        wgd wgd = this.a;
                        wgd.g.sendMessage(wgd.g.obtainMessage(10, intent.getBooleanExtra(str, false) ? 1 : 0, 0));
                        return;
                    }
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) whb.a(context, "connectivity");
                    wgd wgd2 = this.a;
                    wgd2.g.sendMessage(wgd2.g.obtainMessage(9, connectivityManager.getActiveNetworkInfo()));
                }
            }
        }
    }

    public wgd(Context context, ExecutorService executorService, Handler handler, Downloader downloader, wfy wfy, wgv wgv) {
        this.m.start();
        whb.a(this.m.getLooper());
        this.a = context;
        this.n = executorService;
        this.c = new LinkedHashMap();
        this.d = new WeakHashMap();
        this.e = new WeakHashMap();
        this.f = new HashSet();
        this.g = new a(this.m.getLooper(), this);
        this.b = downloader;
        this.h = handler;
        this.i = wfy;
        this.o = wgv;
        this.j = new ArrayList(4);
        this.l = whb.d(this.a);
        this.k = whb.b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.p = new c(this);
        c cVar = this.p;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.a.k) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        cVar.a.a.registerReceiver(cVar, intentFilter);
    }

    static void a(List<wfx> list) {
        if (!list.isEmpty() && ((wfx) list.get(0)).b.l) {
            StringBuilder sb = new StringBuilder();
            for (wfx wfx : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(whb.a(wfx));
            }
            whb.a("Dispatcher", "delivered", sb.toString());
        }
    }

    private void c(wfv wfv) {
        Object c2 = wfv.c();
        if (c2 != null) {
            wfv.k = true;
            this.d.put(c2, wfv);
        }
    }

    private void e(wfx wfx) {
        wfv wfv = wfx.h;
        if (wfv != null) {
            c(wfv);
        }
        List<wfv> list = wfx.i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c((wfv) list.get(i2));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(NetworkInfo networkInfo) {
        ExecutorService executorService = this.n;
        if (executorService instanceof wgp) {
            wgp wgp = (wgp) executorService;
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            wgp.a(1);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            wgp.a(2);
                            break;
                        default:
                            switch (subtype) {
                                case 12:
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    wgp.a(3);
                                    break;
                                default:
                                    wgp.a(3);
                                    break;
                            }
                            wgp.a(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    wgp.a(4);
                } else {
                    wgp.a(3);
                }
            } else {
                wgp.a(3);
            }
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.d.isEmpty()) {
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                wfv wfv = (wfv) it.next();
                it.remove();
                if (wfv.a.l) {
                    whb.a("Dispatcher", "replaying", wfv.b.a());
                }
                a(wfv, false);
            }
        }
    }

    public final void a(Object obj) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    public final void a(wfv wfv) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(1, wfv));
    }

    /* access modifiers changed from: 0000 */
    public final void a(wfv wfv, boolean z) {
        String str = "Dispatcher";
        if (this.f.contains(wfv.j)) {
            this.e.put(wfv.c(), wfv);
            if (wfv.a.l) {
                String a2 = wfv.b.a();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(wfv.j);
                sb.append("' is paused");
                whb.a(str, "paused", a2, sb.toString());
            }
            return;
        }
        wfx wfx = (wfx) this.c.get(wfv.i);
        if (wfx != null) {
            wfx.a(wfv);
        } else if (this.n.isShutdown()) {
            if (wfv.a.l) {
                whb.a(str, "ignored", wfv.b.a(), "because shut down");
            }
        } else {
            wfx a3 = wfx.a(wfv.a, this, this.i, this.o, wfv);
            a3.k = this.n.submit(a3);
            this.c.put(wfv.i, a3);
            if (z) {
                this.d.remove(wfv.c());
            }
            if (wfv.a.l) {
                whb.a(str, "enqueued", wfv.b.a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(wfx wfx) {
        Handler handler = this.g;
        handler.sendMessageDelayed(handler.obtainMessage(5, wfx), 500);
    }

    /* access modifiers changed from: 0000 */
    public final void a(wfx wfx, boolean z) {
        if (wfx.b.l) {
            String a2 = whb.a(wfx);
            StringBuilder sb = new StringBuilder("for error");
            sb.append(z ? " (will replay)" : "");
            whb.a("Dispatcher", "batched", a2, sb.toString());
        }
        this.c.remove(wfx.c);
        d(wfx);
    }

    public final void b(Object obj) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    public final void b(wfv wfv) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(2, wfv));
    }

    /* access modifiers changed from: 0000 */
    public final void b(wfx wfx) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(6, wfx));
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        if (this.f.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                wfv wfv = (wfv) it.next();
                if (wfv.j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(wfv);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.h;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(wfx wfx) {
        boolean z;
        if (!wfx.c()) {
            boolean z2 = false;
            if (this.n.isShutdown()) {
                a(wfx, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.k) {
                networkInfo = ((ConnectivityManager) whb.a(this.a, "connectivity")).getActiveNetworkInfo();
            }
            boolean z3 = networkInfo != null && networkInfo.isConnected();
            boolean z4 = this.l;
            if (!(wfx.n > 0)) {
                z = false;
            } else {
                wfx.n--;
                z = wfx.g.a(networkInfo);
            }
            boolean b2 = wfx.g.b();
            if (!z) {
                if (this.k && b2) {
                    z2 = true;
                }
                a(wfx, z2);
                if (z2) {
                    e(wfx);
                }
            } else if (!this.k || z3) {
                if (wfx.b.l) {
                    whb.a("Dispatcher", "retrying", whb.a(wfx));
                }
                if (wfx.m instanceof ContentLengthException) {
                    wfx.f |= NetworkPolicy.NO_CACHE.index;
                }
                wfx.k = this.n.submit(wfx);
            } else {
                a(wfx, b2);
                if (b2) {
                    e(wfx);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(wfx wfx) {
        if (!wfx.c()) {
            this.j.add(wfx);
            if (!this.g.hasMessages(7)) {
                this.g.sendEmptyMessageDelayed(7, 200);
            }
        }
    }
}
