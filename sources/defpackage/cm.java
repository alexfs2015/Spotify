package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: cm reason: default package */
public final class cm extends ContextWrapper {
    private static final Object a = new Object();
    private static ArrayList<WeakReference<cm>> b;
    private final Resources c;
    private final Theme d;

    private cm(Context context) {
        super(context);
        if (cu.a()) {
            this.c = new cu(this, context.getResources());
            this.d = this.c.newTheme();
            this.d.setTo(context.getTheme());
            return;
        }
        this.c = new co(this, context.getResources());
        this.d = null;
    }

    public final Theme getTheme() {
        Theme theme = this.d;
        return theme == null ? super.getTheme() : theme;
    }

    public final void setTheme(int i) {
        Theme theme = this.d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        return this.c;
    }

    public final AssetManager getAssets() {
        return this.c.getAssets();
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof cm) && !(context.getResources() instanceof co) && !(context.getResources() instanceof cu) && (VERSION.SDK_INT < 21 || cu.a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (a) {
            if (b == null) {
                b = new ArrayList<>();
            } else {
                for (int size = b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        b.remove(size);
                    }
                }
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) b.get(size2);
                    cm cmVar = weakReference2 != null ? (cm) weakReference2.get() : null;
                    if (cmVar != null && cmVar.getBaseContext() == context) {
                        return cmVar;
                    }
                }
            }
            cm cmVar2 = new cm(context);
            b.add(new WeakReference(cmVar2));
            return cmVar2;
        }
    }
}
