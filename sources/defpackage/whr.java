package defpackage;

import android.app.Application;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: whr reason: default package */
public abstract class whr extends Application implements whx {
    public volatile DispatchingAndroidInjector<Object> f;

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

    /* access modifiers changed from: protected */
    public abstract whq<? extends whr> a();

    public final whq<Object> j() {
        b();
        return this.f;
    }

    public void onCreate() {
        super.onCreate();
        b();
    }
}
