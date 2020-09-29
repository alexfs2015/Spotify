package defpackage;

import android.view.MenuItem;

/* renamed from: ib reason: default package */
public final class ib {
    public static MenuItem a(MenuItem menuItem, hu huVar) {
        return menuItem instanceof gu ? ((gu) menuItem).a(huVar) : menuItem;
    }

    public static hu a(MenuItem menuItem) {
        if (menuItem instanceof gu) {
            return ((gu) menuItem).a();
        }
        return null;
    }
}
