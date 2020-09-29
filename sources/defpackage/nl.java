package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: nl reason: default package */
final class nl extends ne implements ServiceConnection {
    static final boolean i = Log.isLoggable("MediaRouteProviderProxy", 3);
    final ComponentName j;
    final c k;
    final ArrayList<b> l = new ArrayList<>();
    boolean m;
    a n;
    boolean o;
    private boolean p;

    /* renamed from: nl$a */
    final class a implements DeathRecipient {
        int a = 1;
        int b = 1;
        int c;
        int d;
        final SparseArray<defpackage.ni.c> e = new SparseArray<>();
        private final Messenger g;
        private final d h;
        private final Messenger i;

        public a(Messenger messenger) {
            this.g = messenger;
            this.h = new d(this);
            this.i = new Messenger(this.h);
        }

        public final void a(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i4 = this.a;
            this.a = i4 + 1;
            a(6, i4, i2, null, bundle);
        }

        public final void a(nd ndVar) {
            int i2 = this.a;
            this.a = i2 + 1;
            a(10, i2, 0, ndVar != null ? ndVar.a : null, null);
        }

        public final boolean a() {
            int i2 = this.a;
            this.a = i2 + 1;
            this.d = i2;
            if (!a(1, this.d, 3, null, null)) {
                return false;
            }
            try {
                this.g.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public final boolean a(int i2) {
            if (i2 == this.d) {
                this.d = 0;
                nl nlVar = nl.this;
                if (nlVar.n == this) {
                    if (nl.i) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(nlVar);
                        sb.append(": Service connection error - ");
                        sb.append("Registration failed");
                    }
                    nlVar.e();
                }
            }
            defpackage.ni.c cVar = (defpackage.ni.c) this.e.get(i2);
            if (cVar != null) {
                this.e.remove(i2);
                cVar.a(null, null);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i2, int i3, int i4, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = i3;
            obtain.arg2 = i4;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.i;
            try {
                this.g.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e2) {
                if (i2 != 2) {
                    Log.e("MediaRouteProviderProxy", "Could not send message to service.", e2);
                }
                return false;
            }
        }

        public final boolean a(int i2, Bundle bundle) {
            if (this.c == 0) {
                return false;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle2 = (Bundle) it.next();
                arrayList.add(bundle2 == null ? null : new defpackage.ne.b.a(nc.a(bundle2.getBundle("mrDescriptor")), bundle2.getInt("selectionState", 1), bundle2.getBoolean("isUnselectable", false), bundle2.getBoolean("isGroupable", false), bundle2.getBoolean("isTransferable", false)));
            }
            nl nlVar = nl.this;
            if (nlVar.n == this) {
                if (nl.i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nlVar);
                    sb.append(": DynamicRouteDescriptors changed, descriptors=");
                    sb.append(arrayList);
                }
                b a2 = nlVar.a(i2);
                if (a2 instanceof e) {
                    ((e) a2).a((Collection<defpackage.ne.b.a>) arrayList);
                }
            }
            return true;
        }

        public final void b() {
            a(2, 0, 0, null, null);
            this.h.a.clear();
            this.g.getBinder().unlinkToDeath(this, 0);
            nl.this.k.post(new Runnable() {
                public final void run() {
                    a aVar = a.this;
                    int size = aVar.e.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.ni.c) aVar.e.valueAt(i)).a(null, null);
                    }
                    aVar.e.clear();
                }
            });
        }

        public final void b(int i2) {
            int i3 = this.a;
            this.a = i3 + 1;
            a(4, i3, i2, null, null);
        }

        public final void b(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.a;
            this.a = i4 + 1;
            a(7, i4, i2, null, bundle);
        }

        public final void binderDied() {
            nl.this.k.post(new Runnable() {
                public final void run() {
                    nl nlVar = nl.this;
                    if (nlVar.n == a.this) {
                        if (nl.i) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(nlVar);
                            sb.append(": Service connection died");
                        }
                        nlVar.f();
                    }
                }
            });
        }

        public final void c(int i2) {
            int i3 = this.a;
            this.a = i3 + 1;
            a(5, i3, i2, null, null);
        }

        public final void c(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.a;
            this.a = i4 + 1;
            a(8, i4, i2, null, bundle);
        }
    }

    /* renamed from: nl$b */
    interface b {
        void a(a aVar);

        int f();

        void g();
    }

    /* renamed from: nl$c */
    static final class c extends Handler {
        c() {
        }
    }

    /* renamed from: nl$d */
    static final class d extends Handler {
        final WeakReference<a> a;

        public d(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                java.lang.ref.WeakReference<nl$a> r0 = r8.a
                java.lang.Object r0 = r0.get()
                nl$a r0 = (defpackage.nl.a) r0
                if (r0 == 0) goto L_0x0108
                int r1 = r9.what
                int r2 = r9.arg1
                int r3 = r9.arg2
                java.lang.Object r4 = r9.obj
                android.os.Bundle r5 = r9.peekData()
                r6 = 0
                r7 = 1
                switch(r1) {
                    case 0: goto L_0x00f4;
                    case 1: goto L_0x00f7;
                    case 2: goto L_0x00ab;
                    case 3: goto L_0x0090;
                    case 4: goto L_0x006b;
                    case 5: goto L_0x0054;
                    case 6: goto L_0x002b;
                    case 7: goto L_0x001d;
                    default: goto L_0x001b;
                }
            L_0x001b:
                goto L_0x00f8
            L_0x001d:
                if (r4 == 0) goto L_0x0023
                boolean r1 = r4 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x00f8
            L_0x0023:
                android.os.Bundle r4 = (android.os.Bundle) r4
                boolean r6 = r0.a(r3, r4)
                goto L_0x00f8
            L_0x002b:
                boolean r1 = r4 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x00f8
                android.os.Bundle r4 = (android.os.Bundle) r4
                android.util.SparseArray<ni$c> r1 = r0.e
                java.lang.Object r1 = r1.get(r2)
                ni$c r1 = (defpackage.ni.c) r1
                if (r4 == 0) goto L_0x004d
                java.lang.String r3 = "routeId"
                boolean r3 = r4.containsKey(r3)
                if (r3 == 0) goto L_0x004d
                android.util.SparseArray<ni$c> r0 = r0.e
                r0.remove(r2)
                r1.a(r4)
                goto L_0x00f8
            L_0x004d:
                java.lang.String r0 = "DynamicGroupRouteController is created without valid route id."
                r1.a(r0, r4)
                goto L_0x00f8
            L_0x0054:
                if (r4 == 0) goto L_0x005a
                boolean r1 = r4 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x00f8
            L_0x005a:
                android.os.Bundle r4 = (android.os.Bundle) r4
                int r1 = r0.c
                if (r1 == 0) goto L_0x00f8
                nl r1 = defpackage.nl.this
                nf r2 = defpackage.nf.a(r4)
                r1.a(r0, r2)
                goto L_0x00f7
            L_0x006b:
                if (r4 == 0) goto L_0x0071
                boolean r1 = r4 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x00f8
            L_0x0071:
                if (r5 != 0) goto L_0x0075
                r1 = 0
                goto L_0x007b
            L_0x0075:
                java.lang.String r1 = "error"
                java.lang.String r1 = r5.getString(r1)
            L_0x007b:
                android.os.Bundle r4 = (android.os.Bundle) r4
                android.util.SparseArray<ni$c> r3 = r0.e
                java.lang.Object r3 = r3.get(r2)
                ni$c r3 = (defpackage.ni.c) r3
                if (r3 == 0) goto L_0x00f8
                android.util.SparseArray<ni$c> r0 = r0.e
                r0.remove(r2)
                r3.a(r1, r4)
                goto L_0x00f7
            L_0x0090:
                if (r4 == 0) goto L_0x0096
                boolean r1 = r4 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x00f8
            L_0x0096:
                android.os.Bundle r4 = (android.os.Bundle) r4
                android.util.SparseArray<ni$c> r1 = r0.e
                java.lang.Object r1 = r1.get(r2)
                ni$c r1 = (defpackage.ni.c) r1
                if (r1 == 0) goto L_0x00f8
                android.util.SparseArray<ni$c> r0 = r0.e
                r0.remove(r2)
                r1.a(r4)
                goto L_0x00f7
            L_0x00ab:
                if (r4 == 0) goto L_0x00b1
                boolean r1 = r4 instanceof android.os.Bundle
                if (r1 == 0) goto L_0x00f8
            L_0x00b1:
                android.os.Bundle r4 = (android.os.Bundle) r4
                int r1 = r0.c
                if (r1 != 0) goto L_0x00f8
                int r1 = r0.d
                if (r2 != r1) goto L_0x00f8
                if (r3 <= 0) goto L_0x00f8
                r0.d = r6
                r0.c = r3
                nl r1 = defpackage.nl.this
                nf r2 = defpackage.nf.a(r4)
                r1.a(r0, r2)
                nl r1 = defpackage.nl.this
                nl$a r2 = r1.n
                if (r2 != r0) goto L_0x00f7
                r1.o = r7
                java.util.ArrayList<nl$b> r0 = r1.l
                int r0 = r0.size()
            L_0x00d8:
                if (r6 >= r0) goto L_0x00ea
                java.util.ArrayList<nl$b> r2 = r1.l
                java.lang.Object r2 = r2.get(r6)
                nl$b r2 = (defpackage.nl.b) r2
                nl$a r3 = r1.n
                r2.a(r3)
                int r6 = r6 + 1
                goto L_0x00d8
            L_0x00ea:
                nd r0 = r1.e
                if (r0 == 0) goto L_0x00f7
                nl$a r1 = r1.n
                r1.a(r0)
                goto L_0x00f7
            L_0x00f4:
                r0.a(r2)
            L_0x00f7:
                r6 = 1
            L_0x00f8:
                if (r6 != 0) goto L_0x0108
                boolean r0 = defpackage.nl.i
                if (r0 == 0) goto L_0x0108
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unhandled message from server: "
                r0.<init>(r1)
                r0.append(r9)
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nl.d.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: nl$e */
    final class e extends defpackage.ne.b implements b {
        String e;
        String f;
        private final String g;
        private boolean h;
        private int i = -1;
        private int j;
        private a k;
        private int l = -1;

        e(String str) {
            this.g = str;
        }

        public final String a() {
            return this.e;
        }

        public final void a(int i2) {
            this.h = false;
            a aVar = this.k;
            if (aVar != null) {
                aVar.a(this.l, i2);
            }
        }

        public final void a(String str) {
            a aVar = this.k;
            if (aVar != null) {
                int i2 = this.l;
                Bundle bundle = new Bundle();
                bundle.putString("memberRouteId", str);
                int i3 = aVar.a;
                aVar.a = i3 + 1;
                aVar.a(12, i3, i2, null, bundle);
            }
        }

        public final void a(a aVar) {
            AnonymousClass1 r0 = new defpackage.ni.c() {
                public final void a(Bundle bundle) {
                    e.this.e = bundle.getString("groupableTitle");
                    e.this.f = bundle.getString("transferableTitle");
                }

                public final void a(String str, Bundle bundle) {
                    StringBuilder sb = new StringBuilder("Error: ");
                    sb.append(str);
                    sb.append(", data: ");
                    sb.append(bundle);
                }
            };
            this.k = aVar;
            String str = this.g;
            int i2 = aVar.b;
            aVar.b = i2 + 1;
            int i3 = aVar.a;
            aVar.a = i3 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            aVar.a(11, i3, i2, null, bundle);
            aVar.e.put(i3, r0);
            this.l = i2;
            if (this.h) {
                aVar.c(this.l);
                int i4 = this.i;
                if (i4 >= 0) {
                    aVar.b(this.l, i4);
                    this.i = -1;
                }
                int i5 = this.j;
                if (i5 != 0) {
                    aVar.c(this.l, i5);
                    this.j = 0;
                }
            }
        }

        public final String b() {
            return this.f;
        }

        public final void b(int i2) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.b(this.l, i2);
                return;
            }
            this.i = i2;
            this.j = 0;
        }

        public final void b(String str) {
            a aVar = this.k;
            if (aVar != null) {
                int i2 = this.l;
                Bundle bundle = new Bundle();
                bundle.putString("memberRouteId", str);
                int i3 = aVar.a;
                aVar.a = i3 + 1;
                aVar.a(13, i3, i2, null, bundle);
            }
        }

        public final void c() {
            nl.this.a((b) this);
        }

        public final void c(int i2) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.c(this.l, i2);
            } else {
                this.j += i2;
            }
        }

        public final void d() {
            this.h = true;
            a aVar = this.k;
            if (aVar != null) {
                aVar.c(this.l);
            }
        }

        public final void e() {
            a(0);
        }

        public final int f() {
            return this.l;
        }

        public final void g() {
            a aVar = this.k;
            if (aVar != null) {
                aVar.b(this.l);
                this.k = null;
                this.l = 0;
            }
        }
    }

    /* renamed from: nl$f */
    final class f extends defpackage.ne.e implements b {
        private final String a;
        private final String b;
        private boolean c;
        private int d = -1;
        private int e;
        private a f;
        private int g;

        f(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final void a(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.g, i);
            }
        }

        public final void a(a aVar) {
            this.f = aVar;
            String str = this.a;
            String str2 = this.b;
            int i = aVar.b;
            aVar.b = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = aVar.a;
            aVar.a = i2 + 1;
            aVar.a(3, i2, i, null, bundle);
            this.g = i;
            if (this.c) {
                aVar.c(this.g);
                int i3 = this.d;
                if (i3 >= 0) {
                    aVar.b(this.g, i3);
                    this.d = -1;
                }
                int i4 = this.e;
                if (i4 != 0) {
                    aVar.c(this.g, i4);
                    this.e = 0;
                }
            }
        }

        public final void b(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.b(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        public final void c() {
            nl.this.a((b) this);
        }

        public final void c(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.c(this.g, i);
            } else {
                this.e += i;
            }
        }

        public final void d() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.c(this.g);
            }
        }

        public final void e() {
            a(0);
        }

        public final int f() {
            return this.g;
        }

        public final void g() {
            a aVar = this.f;
            if (aVar != null) {
                aVar.b(this.g);
                this.f = null;
                this.g = 0;
            }
        }
    }

    public nl(Context context, ComponentName componentName) {
        super(context, new defpackage.ne.d(componentName));
        this.j = componentName;
        this.k = new c();
    }

    private defpackage.ne.e b(String str, String str2) {
        nf nfVar = this.g;
        if (nfVar != null) {
            List<nc> list = nfVar.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((nc) list.get(i2)).a().equals(str)) {
                    f fVar = new f(str, str2);
                    b bVar = fVar;
                    this.l.add(bVar);
                    if (this.o) {
                        bVar.a(this.n);
                    }
                    b();
                    return fVar;
                }
            }
        }
        return null;
    }

    private defpackage.ne.b c(String str) {
        nf nfVar = this.g;
        if (nfVar != null) {
            List<nc> list = nfVar.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((nc) list.get(i2)).a().equals(str)) {
                    e eVar = new e(str);
                    b bVar = eVar;
                    this.l.add(bVar);
                    if (this.o) {
                        bVar.a(this.n);
                    }
                    b();
                    return eVar;
                }
            }
        }
        return null;
    }

    private void g() {
        int size = this.l.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.l.get(i2)).g();
        }
    }

    public final defpackage.ne.e a(String str) {
        if (str != null) {
            return b(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final defpackage.ne.e a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return b(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    /* access modifiers changed from: 0000 */
    public b a(int i2) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f() == i2) {
                return bVar;
            }
        }
        return null;
    }

    public final void a() {
        if (!this.m) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Starting");
            }
            this.m = true;
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar, nf nfVar) {
        if (this.n == aVar) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Descriptor changed, descriptor=");
                sb.append(nfVar);
            }
            a(nfVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(b bVar) {
        this.l.remove(bVar);
        bVar.g();
        b();
    }

    public final defpackage.ne.b b(String str) {
        if (str != null) {
            return c(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (c()) {
            d();
        } else {
            e();
        }
    }

    public final void b(nd ndVar) {
        if (this.o) {
            this.n.a(ndVar);
        }
        b();
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.m && (this.e != null || !this.l.isEmpty());
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        String str = ": Bind failed";
        if (!this.p) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.j);
            try {
                this.p = this.a.bindService(intent, this, 1);
                if (!this.p && i) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(str);
                }
            } catch (SecurityException unused) {
                if (i) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this);
                    sb3.append(str);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (this.p) {
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": Unbinding");
            }
            this.p = false;
            f();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": unbindService failed");
                Log.e("MediaRouteProviderProxy", sb2.toString(), e2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (this.n != null) {
            a((nf) null);
            this.o = false;
            g();
            this.n.b();
            this.n = null;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Connected");
        }
        if (this.p) {
            f();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (ng.a(messenger)) {
                a aVar = new a(messenger);
                if (aVar.a()) {
                    this.n = aVar;
                } else {
                    if (i) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this);
                        sb2.append(": Registration failed");
                    }
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(": Service returned invalid messenger binder");
                Log.e("MediaRouteProviderProxy", sb3.toString());
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(": Service disconnected");
        }
        f();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Service connection ");
        sb.append(this.j.flattenToShortString());
        return sb.toString();
    }
}
