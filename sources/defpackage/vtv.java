package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: vtv reason: default package */
public abstract class vtv extends Fragment implements vtr {
    public DispatchingAndroidInjector<Object> X;

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final vtk<Object> j() {
        return this.X;
    }
}
