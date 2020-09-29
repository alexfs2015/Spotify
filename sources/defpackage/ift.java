package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: ift reason: default package */
public abstract class ift implements ifn {
    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    public abstract boolean c();

    public abstract boolean d();

    /* access modifiers changed from: protected */
    public abstract String e();

    public abstract void f();

    /* access modifiers changed from: protected */
    public final void g() {
        if (c()) {
            Logger.b("%s onAllowed", e());
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void h() {
        if (d()) {
            Logger.b("%s onDisallowed", e());
            b();
        }
    }
}
