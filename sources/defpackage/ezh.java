package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: ezh reason: default package */
public final class ezh extends ax {
    public ezh(Context context) {
        super(context);
    }

    public final MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            e();
            MenuItem a = super.a(i, i2, i3, charSequence);
            if (a instanceof az) {
                ((az) a).a(true);
            }
            f();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
