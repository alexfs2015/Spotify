package defpackage;

import android.app.Activity;
import android.os.Bundle;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: vtt reason: default package */
public abstract class vtt extends q implements vtr {
    public DispatchingAndroidInjector<Object> i;

    public void onCreate(Bundle bundle) {
        vtj.a((Activity) this);
        super.onCreate(bundle);
    }

    public final vtk<Object> j() {
        return this.i;
    }
}
