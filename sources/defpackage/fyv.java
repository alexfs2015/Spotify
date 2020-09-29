package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;

/* renamed from: fyv reason: default package */
final class fyv implements fyu {
    private final MenuItem a;
    private Runnable b;

    fyv(MenuItem menuItem) {
        this.a = menuItem;
    }

    public final fyu a(final Runnable runnable) {
        this.b = runnable;
        this.a.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            public final boolean onMenuItemClick(MenuItem menuItem) {
                runnable.run();
                return true;
            }
        });
        return this;
    }

    public final fyu a(Drawable drawable) {
        this.a.setIcon(drawable);
        return this;
    }

    public final fyu a(View view) {
        this.a.setActionView(view);
        return this;
    }
}
