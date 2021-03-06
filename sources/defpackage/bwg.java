package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bwg reason: default package */
public abstract class bwg<T extends IInterface> {
    private static final brw[] a = new brw[0];
    /* access modifiers changed from: private */
    public boolean A;
    /* access modifiers changed from: private */
    public volatile byj B;
    int b;
    long c;
    protected final Context d;
    public final Looper e;
    final Handler f;
    protected c g;
    protected AtomicInteger h;
    private long i;
    private int j;
    private long k;
    private byp l;
    private final bwn m;
    private final bry n;
    private final Object o;
    /* access modifiers changed from: private */
    public final Object p;
    /* access modifiers changed from: private */
    public bwt q;
    private T r;
    /* access modifiers changed from: private */
    public final ArrayList<h<?>> s;
    private j t;
    private int u;
    /* access modifiers changed from: private */
    public final a v;
    /* access modifiers changed from: private */
    public final b w;
    private final int x;
    private final String y;
    /* access modifiers changed from: private */
    public ConnectionResult z;

    /* renamed from: bwg$a */
    public interface a {
        void a(int i);

        void a(Bundle bundle);
    }

    /* renamed from: bwg$b */
    public interface b {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: bwg$c */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: bwg$d */
    public class d implements c {
        public d() {
        }

        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.b()) {
                bwg bwg = bwg.this;
                bwg.a((bwq) null, bwg.r());
                return;
            }
            if (bwg.this.w != null) {
                bwg.this.w.a(connectionResult);
            }
        }
    }

    /* renamed from: bwg$e */
    public interface e {
        void a();
    }

    /* renamed from: bwg$f */
    abstract class f extends h<Boolean> {
        private final int a;
        private final Bundle b;

        protected f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.a = i;
            this.b = bundle;
        }

        /* access modifiers changed from: protected */
        public abstract void a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        public abstract boolean a();

        /* access modifiers changed from: protected */
        public final /* synthetic */ void a(Object obj) {
            if (((Boolean) obj) == null) {
                bwg.this.a(1, null);
                return;
            }
            int i = this.a;
            PendingIntent pendingIntent = null;
            if (i != 0) {
                if (i != 10) {
                    bwg.this.a(1, null);
                    Bundle bundle = this.b;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    a(new ConnectionResult(this.a, pendingIntent));
                } else {
                    bwg.this.a(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), bwg.this.C_(), bwg.this.b()}));
                }
            } else if (!a()) {
                bwg.this.a(1, null);
                a(new ConnectionResult(8, null));
            }
        }
    }

    /* renamed from: bwg$g */
    final class g extends eiz {
        public g(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (bwg.this.h.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !bwg.this.h()) {
                a(message);
            } else if (message.what == 4) {
                bwg.this.z = new ConnectionResult(message.arg2);
                if (!bwg.this.u() || bwg.this.A) {
                    if (bwg.this.z != null) {
                        connectionResult2 = bwg.this.z;
                    } else {
                        connectionResult2 = new ConnectionResult(8);
                    }
                    bwg.this.g.a(connectionResult2);
                    bwg.this.a(connectionResult2);
                    return;
                }
                bwg.this.a(3, null);
            } else if (message.what == 5) {
                if (bwg.this.z != null) {
                    connectionResult = bwg.this.z;
                } else {
                    connectionResult = new ConnectionResult(8);
                }
                bwg.this.g.a(connectionResult);
                bwg.this.a(connectionResult);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    bwg.this.g.a(connectionResult3);
                    bwg.this.a(connectionResult3);
                } else if (message.what == 6) {
                    bwg.this.a(5, null);
                    if (bwg.this.v != null) {
                        bwg.this.v.a(message.arg2);
                    }
                    bwg bwg = bwg.this;
                    bwg.b = message.arg2;
                    bwg.c = System.currentTimeMillis();
                    bwg.this.a(5, 1, null);
                } else if (message.what == 2 && !bwg.this.g()) {
                    a(message);
                } else if (b(message)) {
                    ((h) message.obj).b();
                } else {
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    new Exception();
                }
            }
        }

        private static void a(Message message) {
            ((h) message.obj).c();
        }

        private static boolean b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* renamed from: bwg$h */
    public abstract class h<TListener> {
        private TListener a;
        private boolean b = false;

        public h(TListener tlistener) {
            this.a = tlistener;
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.b = true;
            }
            c();
        }

        public final void c() {
            d();
            synchronized (bwg.this.s) {
                bwg.this.s.remove(this);
            }
        }

        public final void d() {
            synchronized (this) {
                this.a = null;
            }
        }
    }

    /* renamed from: bwg$i */
    public static final class i extends defpackage.bws.a {
        private bwg a;
        private final int b;

        public i(bwg bwg, int i) {
            this.a = bwg;
            this.b = i;
        }

        public final void a(int i, Bundle bundle) {
            new Exception();
        }

        public final void a(int i, IBinder iBinder, Bundle bundle) {
            bwx.a(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.a(i, iBinder, bundle, this.b);
            this.a = null;
        }

        public final void a(int i, IBinder iBinder, byj byj) {
            bwx.a(this.a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            bwx.a(byj);
            this.a.B = byj;
            a(i, iBinder, byj.a);
        }
    }

    /* renamed from: bwg$j */
    public final class j implements ServiceConnection {
        private final int a;

        public j(int i) {
            this.a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            bwt bwt;
            if (iBinder == null) {
                bwg.a(bwg.this);
                return;
            }
            synchronized (bwg.this.p) {
                bwg bwg = bwg.this;
                if (iBinder == null) {
                    bwt = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof bwt)) {
                        bwt = new C0021a(iBinder);
                    } else {
                        bwt = (bwt) queryLocalInterface;
                    }
                }
                bwg.q = bwt;
            }
            bwg.this.a(0, this.a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (bwg.this.p) {
                bwg.this.q = null;
            }
            bwg.this.f.sendMessage(bwg.this.f.obtainMessage(6, this.a, 1));
        }
    }

    /* renamed from: bwg$k */
    public final class k extends f {
        private final IBinder a;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.a = iBinder;
        }

        /* access modifiers changed from: protected */
        public final void a(ConnectionResult connectionResult) {
            if (bwg.this.w != null) {
                bwg.this.w.a(connectionResult);
            }
            bwg.this.a(connectionResult);
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            boolean z = false;
            try {
                String interfaceDescriptor = this.a.getInterfaceDescriptor();
                if (!bwg.this.b().equals(interfaceDescriptor)) {
                    String b2 = bwg.this.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(b2);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a2 = bwg.this.a(this.a);
                if (a2 != null && (bwg.this.a(2, 4, a2) || bwg.this.a(3, 4, a2))) {
                    bwg.this.z = null;
                    Bundle a3 = bwg.this.a();
                    if (bwg.this.v != null) {
                        bwg.this.v.a(a3);
                    }
                    z = true;
                }
                return z;
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: bwg$l */
    public final class l extends f {
        public l(int i) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        public final void a(ConnectionResult connectionResult) {
            bwg.this.g.a(connectionResult);
            bwg.this.a(connectionResult);
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            bwg.this.g.a(ConnectionResult.a);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String C_();

    public Bundle a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract String b();

    public boolean c() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public Account m() {
        return null;
    }

    protected bwg(Context context, Looper looper, int i2, a aVar, b bVar, String str) {
        this(context, looper, bwn.a(context), bry.b(), i2, (a) bwx.a(aVar), (b) bwx.a(bVar), null);
    }

    protected bwg(Context context, Looper looper, bwn bwn, bry bry, int i2, a aVar, b bVar, String str) {
        this.o = new Object();
        this.p = new Object();
        this.s = new ArrayList<>();
        this.u = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.h = new AtomicInteger(0);
        this.d = (Context) bwx.a(context, (Object) "Context must not be null");
        this.e = (Looper) bwx.a(looper, (Object) "Looper must not be null");
        this.m = (bwn) bwx.a(bwn, (Object) "Supervisor must not be null");
        this.n = (bry) bwx.a(bry, (Object) "API availability must not be null");
        this.f = new g(looper);
        this.x = i2;
        this.v = aVar;
        this.w = bVar;
        this.y = str;
    }

    private final String s() {
        String str = this.y;
        return str == null ? this.d.getClass().getName() : str;
    }

    public final brw[] k() {
        byj byj = this.B;
        if (byj == null) {
            return null;
        }
        return byj.b;
    }

    /* access modifiers changed from: private */
    public final void a(int i2, T t2) {
        bwx.b((i2 == 4) == (t2 != null));
        synchronized (this.o) {
            this.u = i2;
            this.r = t2;
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.t == null || this.l == null)) {
                        String str = this.l.a;
                        String str2 = this.l.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str);
                        sb.append(" on ");
                        sb.append(str2);
                        Log.e("GmsClient", sb.toString());
                        bwn bwn = this.m;
                        String str3 = this.l.a;
                        String str4 = this.l.b;
                        byp byp = this.l;
                        bwn.a(str3, str4, 129, this.t, s());
                        this.h.incrementAndGet();
                    }
                    this.t = new j(this.h.get());
                    this.l = new byp("com.google.android.gms", C_(), false);
                    bwn bwn2 = this.m;
                    String str5 = this.l.a;
                    String str6 = this.l.b;
                    byp byp2 = this.l;
                    if (!bwn2.a(new defpackage.bwn.a(str5, str6, 129), this.t, s())) {
                        String str7 = this.l.a;
                        String str8 = this.l.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 34 + String.valueOf(str8).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str7);
                        sb2.append(" on ");
                        sb2.append(str8);
                        Log.e("GmsClient", sb2.toString());
                        a(16, this.h.get());
                    }
                } else if (i2 == 4) {
                    this.i = System.currentTimeMillis();
                }
            } else if (this.t != null) {
                this.m.a(C_(), "com.google.android.gms", 129, this.t, s());
                this.t = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2, int i3, T t2) {
        synchronized (this.o) {
            if (this.u != i2) {
                return false;
            }
            a(i3, t2);
            return true;
        }
    }

    public final void l() {
        int b2 = this.n.b(this.d, e());
        if (b2 != 0) {
            a(1, (T) null);
            this.g = (c) bwx.a(new d(), (Object) "Connection progress callbacks cannot be null.");
            Handler handler = this.f;
            handler.sendMessage(handler.obtainMessage(3, this.h.get(), b2, null));
            return;
        }
        a((c) new d());
    }

    public final void a(c cVar) {
        this.g = (c) bwx.a(cVar, (Object) "Connection progress callbacks cannot be null.");
        a(2, (T) null);
    }

    public final boolean g() {
        boolean z2;
        synchronized (this.o) {
            z2 = this.u == 4;
        }
        return z2;
    }

    public final boolean h() {
        boolean z2;
        synchronized (this.o) {
            if (this.u != 2) {
                if (this.u != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    private final boolean t() {
        boolean z2;
        synchronized (this.o) {
            z2 = this.u == 3;
        }
        return z2;
    }

    public void f() {
        this.h.incrementAndGet();
        synchronized (this.s) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((h) this.s.get(i2)).d();
            }
            this.s.clear();
        }
        synchronized (this.p) {
            this.q = null;
        }
        a(1, (T) null);
    }

    public final void a(int i2) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(6, this.h.get(), i2));
    }

    public brw[] n() {
        return a;
    }

    /* access modifiers changed from: protected */
    public Bundle o() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2)));
    }

    /* access modifiers changed from: protected */
    public final void p() {
        if (!g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T q() {
        T t2;
        synchronized (this.o) {
            if (this.u != 5) {
                p();
                bwx.a(this.r != null, (Object) "Client is connected but service is null");
                t2 = this.r;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    public final void a(bwq bwq, Set<Scope> set) {
        Bundle o2 = o();
        bwk bwk = new bwk(this.x);
        bwk.a = this.d.getPackageName();
        bwk.d = o2;
        if (set != null) {
            bwk.c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (i()) {
            bwk.e = m() != null ? m() : new Account("<<default account>>", "com.google");
            if (bwq != null) {
                bwk.b = bwq.asBinder();
            }
        }
        bwk.f = a;
        bwk.g = n();
        try {
            synchronized (this.p) {
                if (this.q != null) {
                    this.q.a(new i(this, this.h.get()), bwk);
                }
            }
        } catch (DeadObjectException unused) {
            a(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException unused2) {
            a(8, (IBinder) null, (Bundle) null, this.h.get());
        }
    }

    public final void a(e eVar) {
        eVar.a();
    }

    public Intent d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public Set<Scope> r() {
        return Collections.EMPTY_SET;
    }

    public final void a(String str, PrintWriter printWriter) {
        int i2;
        T t2;
        bwt bwt;
        synchronized (this.o) {
            i2 = this.u;
            t2 = this.r;
        }
        synchronized (this.p) {
            bwt = this.q;
        }
        printWriter.append(str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t2 == null) {
            printWriter.append("null");
        } else {
            printWriter.append(b()).append("@").append(Integer.toHexString(System.identityHashCode(t2.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (bwt == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(bwt.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.i > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j2 = this.i;
            String format = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.c > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i3 = this.b;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 != 2) {
                printWriter.append(String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.c;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.k > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(bsf.a(this.j));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.k;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean u() {
        if (this.A || TextUtils.isEmpty(b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final String j() {
        if (g()) {
            byp byp = this.l;
            if (byp != null) {
                return byp.b;
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int e() {
        return bry.b;
    }

    static {
        String[] strArr = {"service_esmobile", "service_googleme"};
    }

    /* access modifiers changed from: protected */
    public void a(ConnectionResult connectionResult) {
        this.j = connectionResult.b;
        this.k = System.currentTimeMillis();
    }

    static /* synthetic */ void a(bwg bwg) {
        int i2;
        if (bwg.t()) {
            i2 = 5;
            bwg.A = true;
        } else {
            i2 = 4;
        }
        Handler handler = bwg.f;
        handler.sendMessage(handler.obtainMessage(i2, bwg.h.get(), 16));
    }
}
