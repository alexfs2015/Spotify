package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import com.moat.analytics.mobile.R;

/* renamed from: al reason: default package */
public final class al extends ContextWrapper {
    public int a;
    private Theme b;
    private LayoutInflater c;
    private Resources d;

    public al() {
        super(null);
    }

    public al(Context context, int i) {
        super(context);
        this.a = i;
    }

    private void a() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public final Theme getTheme() {
        Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.b;
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            a();
        }
    }
}
