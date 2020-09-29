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

/* renamed from: vrx reason: default package */
public final class vrx {
    final Context a;
    public final Downloader b;
    final Map<String, vrr> c;
    final Map<Object, vrp> d;
    final Map<Object, vrp> e;
    final Set<Object> f;
    final Handler g;
    final Handler h;
    final vrs i;
    final List<vrr> j;
    final boolean k;
    boolean l;
    private b m = new b();
    private ExecutorService n;
    private vsp o;
    private c p;

    /* renamed from: vrx$a */
    static class a extends Handler {
        private final vrx a;

        public a(Looper looper, vrx vrx) {
            super(looper);
            this.a = vrx;
        }

        public final void handleMessage(Message message) {
            final Message message2 = message;
            String str = "canceled";
            String str2 = "Dispatcher";
            switch (message2.what) {
                case 1:
                    this.a.a((vrp) message2.obj, true);
                    return;
                case 2:
                    vrp vrp = (vrp) message2.obj;
                    vrx vrx = this.a;
                    String str3 = vrp.i;
                    vrr vrr = (vrr) vrx.c.get(str3);
                    if (vrr != null) {
                        vrr.b(vrp);
                        if (vrr.b()) {
                            vrx.c.remove(str3);
                            if (vrp.a.l) {
                                vsv.a(str2, str, vrp.b.a());
                            }
                        }
                    }
                    if (vrx.f.contains(vrp.j)) {
                        vrx.e.remove(vrp.c());
                        if (vrp.a.l) {
                            vsv.a(str2, str, vrp.b.a(), "because paused request got canceled");
                        }
                    }
                    vrp vrp2 = (vrp) vrx.d.remove(vrp.c());
                    if (vrp2 != null && vrp2.a.l) {
                        vsv.a(str2, str, vrp2.b.a(), "from replaying");
                    }
                    return;
                case 4:
                    vrr vrr2 = (vrr) message2.obj;
                    vrx vrx2 = this.a;
                    if (MemoryPolicy.b(vrr2.e)) {
                        vrx2.i.a(vrr2.c, vrr2.j);
                    }
                    vrx2.c.remove(vrr2.c);
                    vrx2.d(vrr2);
                    if (vrr2.b.l) {
                        vsv.a(str2, "batched", vsv.a(vrr2), "for completion");
                    }
                    return;
                case 5:
                    this.a.c((vrr) message2.obj);
                    return;
                case 6:
                    this.a.a((vrr) message2.obj, false);
                    return;
                case 7:
                    vrx vrx3 = this.a;
                    ArrayList arrayList = new ArrayList(vrx3.j);
                    vrx3.j.clear();
                    vrx3.h.sendMessage(vrx3.h.obtainMessage(8, arrayList));
                    vrx.a((List<vrr>) arrayList);
                    return;
                case 9:
                    this.a.a((NetworkInfo) message2.obj);
                    return;
                case 10:
                    this.a.l = message2.arg1 == 1;
                    return;
                case 11:
                    Object obj = message2.obj;
                    vrx vrx4 = this.a;
                    if (vrx4.f.add(obj)) {
                        Iterator it = vrx4.c.values().iterator();
                        while (it.hasNext()) {
                            vrr vrr3 = (vrr) it.next();
                            boolean z = vrr3.b.l;
                            vrp vrp3 = vrr3.h;
                            List<vrp> list = vrr3.i;
                            boolean z2 = list != null && !list.isEmpty();
                            if (vrp3 != null || z2) {
                                String str4 = "' was paused";
                                String str5 = "because tag '";
                                String str6 = "paused";
                                if (vrp3 != null && vrp3.j.equals(obj)) {
                                    vrr3.b(vrp3);
                                    vrx4.e.put(vrp3.c(), vrp3);
                                    if (z) {
                                        String a2 = vrp3.b.a();
                                        StringBuilder sb = new StringBuilder(str5);
                                        sb.append(obj);
                                        sb.append(str4);
                                        vsv.a(str2, str6, a2, sb.toString());
                                    }
                                }
                                if (z2) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        vrp vrp4 = (vrp) list.get(size);
                                        if (vrp4.j.equals(obj)) {
                                            vrr3.b(vrp4);
                                            vrx4.e.put(vrp4.c(), vrp4);
                                            if (z) {
                                                String a3 = vrp4.b.a();
                                                StringBuilder sb2 = new StringBuilder(str5);
                                                sb2.append(obj);
                                                sb2.append(str4);
                                                vsv.a(str2, str6, a3, sb2.toString());
                                            }
                                        }
                                    }
                                }
                                if (vrr3.b()) {
                                    it.remove();
                                    if (z) {
                                        vsv.a(str2, str, vsv.a(vrr3), "all actions paused");
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

    /* renamed from: vrx$b */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: vrx$c */
    static class c extends BroadcastReceiver {
        final vrx a;

        c(vrx vrx) {
            this.a = vrx;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    String str = "state";
                    if (intent.hasExtra(str)) {
                        vrx vrx = this.a;
                        vrx.g.sendMessage(vrx.g.obtainMessage(10, intent.getBooleanExtra(str, false) ? 1 : 0, 0));
                        return;
                    }
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) vsv.a(context, "connectivity");
                    vrx vrx2 = this.a;
                    vrx2.g.sendMessage(vrx2.g.obtainMessage(9, connectivityManager.getActiveNetworkInfo()));
                }
            }
        }
    }

    public vrx(Context context, ExecutorService executorService, Handler handler, Downloader downloader, vrs vrs, vsp vsp) {
        this.m.start();
        vsv.a(this.m.getLooper());
        this.a = context;
        this.n = executorService;
        this.c = new LinkedHashMap();
        this.d = new WeakHashMap();
        this.e = new WeakHashMap();
        this.f = new HashSet();
        this.g = new a(this.m.getLooper(), this);
        this.b = downloader;
        this.h = handler;
        this.i = vrs;
        this.o = vsp;
        this.j = new ArrayList(4);
        this.l = vsv.d(this.a);
        this.k = vsv.b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.p = new c(this);
        c cVar = this.p;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.a.k) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        cVar.a.a.registerReceiver(cVar, intentFilter);
    }

    public final void a(vrp vrp) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(1, vrp));
    }

    public final void b(vrp vrp) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(2, vrp));
    }

    public final void a(Object obj) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    public final void b(Object obj) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    /* access modifiers changed from: 0000 */
    public final void a(vrr vrr) {
        Handler handler = this.g;
        handler.sendMessageDelayed(handler.obtainMessage(5, vrr), 500);
    }

    /* access modifiers changed from: 0000 */
    public final void b(vrr vrr) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(6, vrr));
    }

    /* access modifiers changed from: 0000 */
    public final void a(vrp vrp, boolean z) {
        String str = "Dispatcher";
        if (this.f.contains(vrp.j)) {
            this.e.put(vrp.c(), vrp);
            if (vrp.a.l) {
                String a2 = vrp.b.a();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(vrp.j);
                sb.append("' is paused");
                vsv.a(str, "paused", a2, sb.toString());
            }
            return;
        }
        vrr vrr = (vrr) this.c.get(vrp.i);
        if (vrr != null) {
            vrr.a(vrp);
        } else if (this.n.isShutdown()) {
            if (vrp.a.l) {
                vsv.a(str, "ignored", vrp.b.a(), "because shut down");
            }
        } else {
            vrr a3 = vrr.a(vrp.a, this, this.i, this.o, vrp);
            a3.k = this.n.submit(a3);
            this.c.put(vrp.i, a3);
            if (z) {
                this.d.remove(vrp.c());
            }
            if (vrp.a.l) {
                vsv.a(str, "enqueued", vrp.b.a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        if (this.f.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                vrp vrp = (vrp) it.next();
                if (vrp.j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(vrp);
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
    public final void c(vrr vrr) {
        boolean z;
        if (!vrr.c()) {
            boolean z2 = false;
            if (this.n.isShutdown()) {
                a(vrr, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.k) {
                networkInfo = ((ConnectivityManager) vsv.a(this.a, "connectivity")).getActiveNetworkInfo();
            }
            boolean z3 = networkInfo != null && networkInfo.isConnected();
            boolean z4 = this.l;
            if (!(vrr.n > 0)) {
                z = false;
            } else {
                vrr.n--;
                z = vrr.g.a(networkInfo);
            }
            boolean b2 = vrr.g.b();
            if (!z) {
                if (this.k && b2) {
                    z2 = true;
                }
                a(vrr, z2);
                if (z2) {
                    e(vrr);
                }
            } else if (!this.k || z3) {
                if (vrr.b.l) {
                    vsv.a("Dispatcher", "retrying", vsv.a(vrr));
                }
                if (vrr.m instanceof ContentLengthException) {
                    vrr.f |= NetworkPolicy.NO_CACHE.index;
                }
                vrr.k = this.n.submit(vrr);
            } else {
                a(vrr, b2);
                if (b2) {
                    e(vrr);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(NetworkInfo networkInfo) {
        ExecutorService executorService = this.n;
        if (executorService instanceof vsj) {
            vsj vsj = (vsj) executorService;
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            vsj.a(1);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            vsj.a(2);
                            break;
                        default:
                            switch (subtype) {
                                case 12:
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    vsj.a(3);
                                    break;
                                default:
                                    vsj.a(3);
                                    break;
                            }
                            vsj.a(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    vsj.a(4);
                } else {
                    vsj.a(3);
                }
            } else {
                vsj.a(3);
            }
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.d.isEmpty()) {
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                vrp vrp = (vrp) it.next();
                it.remove();
                if (vrp.a.l) {
                    vsv.a("Dispatcher", "replaying", vrp.b.a());
                }
                a(vrp, false);
            }
        }
    }

    private void c(vrp vrp) {
        Object c2 = vrp.c();
        if (c2 != null) {
            vrp.k = true;
            this.d.put(c2, vrp);
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(vrr vrr) {
        if (!vrr.c()) {
            this.j.add(vrr);
            if (!this.g.hasMessages(7)) {
                this.g.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    static void a(List<vrr> list) {
        if (!list.isEmpty() && ((vrr) list.get(0)).b.l) {
            StringBuilder sb = new StringBuilder();
            for (vrr vrr : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(vsv.a(vrr));
            }
            vsv.a("Dispatcher", "delivered", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(vrr vrr, boolean z) {
        if (vrr.b.l) {
            String a2 = vsv.a(vrr);
            StringBuilder sb = new StringBuilder("for error");
            sb.append(z ? " (will replay)" : "");
            vsv.a("Dispatcher", "batched", a2, sb.toString());
        }
        this.c.remove(vrr.c);
        d(vrr);
    }

    private void e(vrr vrr) {
        vrp vrp = vrr.h;
        if (vrp != null) {
            c(vrp);
        }
        List<vrp> list = vrr.i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c((vrp) list.get(i2));
            }
        }
    }
}
