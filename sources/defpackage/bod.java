package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: bod reason: default package */
public abstract class bod {
    private static final ehw a = new ehw("Session", 0);
    private final bql b;
    private final a c = new a(this, 0);

    /* renamed from: bod$a */
    class a extends bps {
        private a() {
        }

        public final car a() {
            return cas.a(bod.this);
        }

        public final void a(Bundle bundle) {
            bod.this.a(bundle);
        }

        public final void b(Bundle bundle) {
            bod.this.c(bundle);
        }

        public final void c(Bundle bundle) {
            bod.this.b(bundle);
        }

        public final void d(Bundle bundle) {
            bod.this.d(bundle);
        }

        public final void a(boolean z) {
            bod.this.a(z);
        }

        public final long b() {
            return bod.this.d();
        }

        /* synthetic */ a(bod bod, byte b) {
            this();
        }
    }

    protected bod(Context context, String str, String str2) {
        this.b = eif.a(context, str, str2, (bpt) this.c);
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void c(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void d(Bundle bundle);

    public long d() {
        bwx.b("Must be called from the main thread.");
        return 0;
    }

    public final boolean f() {
        bwx.b("Must be called from the main thread.");
        try {
            return this.b.b();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isConnected", bql.class.getSimpleName());
            return false;
        }
    }

    public final boolean g() {
        bwx.b("Must be called from the main thread.");
        try {
            return this.b.c();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isConnecting", bql.class.getSimpleName());
            return false;
        }
    }

    public final boolean h() {
        bwx.b("Must be called from the main thread.");
        try {
            return this.b.d();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isResuming", bql.class.getSimpleName());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        try {
            this.b.a(8);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToStartSession", bql.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        try {
            this.b.b(i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionEnded", bql.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i) {
        try {
            this.b.c(8);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", bql.class.getSimpleName());
        }
    }

    public final car i() {
        try {
            return this.b.a();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedObject", bql.class.getSimpleName());
            return null;
        }
    }
}
