package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* renamed from: at reason: default package */
abstract class at {
    final Context a;
    Map<gu, MenuItem> b;
    Map<gv, SubMenu> c;

    at(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof gu)) {
            return menuItem;
        }
        gu guVar = (gu) menuItem;
        if (this.b == null) {
            this.b = new dp();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ba baVar = new ba(this.a, guVar);
        this.b.put(guVar, baVar);
        return baVar;
    }

    /* access modifiers changed from: 0000 */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof gv)) {
            return subMenu;
        }
        gv gvVar = (gv) subMenu;
        if (this.c == null) {
            this.c = new dp();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(gvVar);
        if (subMenu2 == null) {
            subMenu2 = new bj(this.a, gvVar);
            this.c.put(gvVar, subMenu2);
        }
        return subMenu2;
    }
}
