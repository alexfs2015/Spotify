package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

/* renamed from: bf reason: default package */
public class bf extends at implements Menu {
    private final gt d;

    public bf(Context context, gt gtVar) {
        super(context);
        if (gtVar != null) {
            this.d = gtVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return a(this.d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return a(this.d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return a(this.d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(this.d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(this.d.addSubMenu(charSequence));
    }

    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        this.d.clear();
    }

    public void close() {
        this.d.close();
    }

    public MenuItem findItem(int i) {
        return a(this.d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return a(this.d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        if (this.b != null) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        this.d.removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.b != null) {
            Iterator it = this.b.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    public int size() {
        return this.d.size();
    }
}
