package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;

/* renamed from: why reason: default package */
public final class why {
    public static void a(Fragment fragment) {
        wil.a(fragment, "fragment");
        whx b = b(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), b.getClass().getCanonicalName()});
        }
        a(fragment, b);
    }

    private static void a(Object obj, whx whx) {
        whq j = whx.j();
        wil.a(j, "%s.androidInjector() returned null", whx.getClass());
        j.a(obj);
    }

    private static whx b(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.w;
            if (fragment2 == null) {
                kf p = fragment.p();
                if (p instanceof whx) {
                    return (whx) p;
                }
                if (p.getApplication() instanceof whx) {
                    return (whx) p.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
            }
        } while (!(fragment2 instanceof whx));
        return (whx) fragment2;
    }
}
