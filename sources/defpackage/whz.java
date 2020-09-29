package defpackage;

import android.app.Activity;
import android.os.Bundle;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: whz reason: default package */
public abstract class whz extends q implements whx {
    public DispatchingAndroidInjector<Object> i;

    public final whq<Object> j() {
        return this.i;
    }

    public void onCreate(Bundle bundle) {
        whp.a((Activity) this);
        super.onCreate(bundle);
    }
}
