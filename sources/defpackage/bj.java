package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: bj reason: default package */
final class bj extends bf implements SubMenu {
    private final gv d;

    bj(Context context, gv gvVar) {
        super(context, gvVar);
        this.d = gvVar;
    }

    public final void clearHeader() {
        this.d.clearHeader();
    }

    public final MenuItem getItem() {
        return a(this.d.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.d.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.d.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.d.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.d.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.d.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }
}
