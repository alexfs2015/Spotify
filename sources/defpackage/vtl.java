package defpackage;

import android.app.Application;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: vtl reason: default package */
public abstract class vtl extends Application implements vtr {
    public volatile DispatchingAndroidInjector<Object> f;

    /* access modifiers changed from: protected */
    public abstract vtk<? extends vtl> a();

    public void onCreate() {
        super.onCreate();
        b();
    }

    private void b() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    a().a(this);
                    if (this.f == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    public final vtk<Object> j() {
        b();
        return this.f;
    }
}
