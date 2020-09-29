package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;

/* renamed from: vts reason: default package */
public final class vts {
    public static void a(Fragment fragment) {
        vuf.a(fragment, "fragment");
        vtr b = b(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), b.getClass().getCanonicalName()});
        }
        a(fragment, b);
    }

    private static void a(Object obj, vtr vtr) {
        vtk j = vtr.j();
        vuf.a(j, "%s.androidInjector() returned null", vtr.getClass());
        j.a(obj);
    }

    private static vtr b(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.w;
            if (fragment2 == null) {
                ka p = fragment.p();
                if (p instanceof vtr) {
                    return (vtr) p;
                }
                if (p.getApplication() instanceof vtr) {
                    return (vtr) p.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
            }
        } while (!(fragment2 instanceof vtr));
        return (vtr) fragment2;
    }
}
