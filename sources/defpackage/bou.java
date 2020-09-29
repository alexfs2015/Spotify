package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: bou reason: default package */
public abstract class bou {
    private static final ein a = new ein("Session", 0);
    private final brc b;
    private final a c = new a(this, 0);

    /* renamed from: bou$a */
    class a extends bqj {
        private a() {
        }

        /* synthetic */ a(bou bou, byte b) {
            this();
        }

        public final cbi a() {
            return cbj.a(bou.this);
        }

        public final void a(Bundle bundle) {
            bou.this.a(bundle);
        }

        public final void a(boolean z) {
            bou.this.a(z);
        }

        public final long b() {
            return bou.this.d();
        }

        public final void b(Bundle bundle) {
            bou.this.c(bundle);
        }

        public final void c(Bundle bundle) {
            bou.this.b(bundle);
        }

        public final void d(Bundle bundle) {
            bou.this.d(bundle);
        }
    }

    protected bou(Context context, String str, String str2) {
        this.b = eiw.a(context, str, str2, (bqk) this.c);
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        try {
            this.b.a(8);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToStartSession", brc.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public final void b(int i) {
        try {
            this.b.b(i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionEnded", brc.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public final void c(int i) {
        try {
            this.b.c(8);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", brc.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(Bundle bundle);

    public long d() {
        bxo.b("Must be called from the main thread.");
        return 0;
    }

    /* access modifiers changed from: protected */
    public abstract void d(Bundle bundle);

    public final boolean f() {
        bxo.b("Must be called from the main thread.");
        try {
            return this.b.b();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isConnected", brc.class.getSimpleName());
            return false;
        }
    }

    public final boolean g() {
        bxo.b("Must be called from the main thread.");
        try {
            return this.b.c();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isConnecting", brc.class.getSimpleName());
            return false;
        }
    }

    public final boolean h() {
        bxo.b("Must be called from the main thread.");
        try {
            return this.b.d();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isResuming", brc.class.getSimpleName());
            return false;
        }
    }

    public final cbi i() {
        try {
            return this.b.a();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedObject", brc.class.getSimpleName());
            return null;
        }
    }
}
