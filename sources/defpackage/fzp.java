package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;

/* renamed from: fzp reason: default package */
final class fzp implements fzo {
    private final MenuItem a;
    private Runnable b;

    fzp(MenuItem menuItem) {
        this.a = menuItem;
    }

    public final fzo a(Drawable drawable) {
        this.a.setIcon(drawable);
        return this;
    }

    public final fzo a(View view) {
        this.a.setActionView(view);
        return this;
    }

    public final fzo a(final Runnable runnable) {
        this.b = runnable;
        this.a.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            public final boolean onMenuItemClick(MenuItem menuItem) {
                runnable.run();
                return true;
            }
        });
        return this;
    }
}
