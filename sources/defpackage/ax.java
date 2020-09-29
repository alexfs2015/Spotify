package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ax reason: default package */
public class ax implements gt {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public a b;
    ArrayList<az> c;
    public ArrayList<az> d;
    public int e = 1;
    CharSequence f;
    Drawable g;
    View h;
    az i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private boolean n;
    private ArrayList<az> o;
    private boolean p;
    private ArrayList<az> q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private ArrayList<az> x = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<bd>> y = new CopyOnWriteArrayList<>();
    private boolean z = false;

    /* renamed from: ax$a */
    public interface a {
        void a(ax axVar);

        boolean a(ax axVar, MenuItem menuItem);
    }

    /* renamed from: ax$b */
    public interface b {
        boolean a(az azVar);
    }

    public ax(Context context) {
        this.a = context;
        this.l = context.getResources();
        this.c = new ArrayList<>();
        this.o = new ArrayList<>();
        boolean z2 = true;
        this.p = true;
        this.d = new ArrayList<>();
        this.q = new ArrayList<>();
        this.r = true;
        if (this.l.getConfiguration().keyboard == 1 || !iq.c(ViewConfiguration.get(this.a), this.a)) {
            z2 = false;
        }
        this.n = z2;
    }

    private static int a(ArrayList<az> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((az) arrayList.get(size)).a <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    private az a(int i2, KeyEvent keyEvent) {
        ArrayList<az> arrayList = this.x;
        arrayList.clear();
        a((List<az>) arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (az) arrayList.get(0);
        }
        boolean c2 = c();
        for (int i3 = 0; i3 < size; i3++) {
            az azVar = (az) arrayList.get(i3);
            char alphabeticShortcut = c2 ? azVar.getAlphabeticShortcut() : azVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (c2 && alphabeticShortcut == 8 && i2 == 67))) {
                return azVar;
            }
        }
        return null;
    }

    private void a(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.c.size()) {
            this.c.remove(i2);
            if (z2) {
                b(true);
            }
        }
    }

    private void a(List<az> list, int i2, KeyEvent keyEvent) {
        boolean c2 = c();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                az azVar = (az) this.c.get(i3);
                if (azVar.hasSubMenu()) {
                    ((ax) azVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char alphabeticShortcut = c2 ? azVar.getAlphabeticShortcut() : azVar.getNumericShortcut();
                if (((modifiers & 69647) == ((c2 ? azVar.getAlphabeticModifiers() : azVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c2 && alphabeticShortcut == 8 && i2 == 67)) && azVar.isEnabled())) {
                    list.add(azVar);
                }
            }
        }
    }

    private boolean a(bi biVar, bd bdVar) {
        boolean z2 = false;
        if (this.y.isEmpty()) {
            return false;
        }
        if (bdVar != null) {
            z2 = bdVar.a(biVar);
        }
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            bd bdVar2 = (bd) weakReference.get();
            if (bdVar2 == null) {
                this.y.remove(weakReference);
            } else if (!z2) {
                z2 = bdVar2.a(biVar);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5 = i4 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (k[i5] << 16) | (65535 & i4);
        az azVar = new az(this, i2, i3, i4, i6, charSequence, this.e);
        ArrayList<az> arrayList = this.c;
        arrayList.add(a(arrayList, i6), azVar);
        b(true);
        return azVar;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.l;
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (i2 > 0) {
                this.f = resources.getText(i2);
            } else if (charSequence != null) {
                this.f = charSequence;
            }
            if (i3 > 0) {
                this.g = fr.a(this.a, i3);
            } else if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        b(false);
    }

    public final void a(Bundle bundle) {
        if (!this.y.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                bd bdVar = (bd) weakReference.get();
                if (bdVar == null) {
                    this.y.remove(weakReference);
                } else {
                    int b2 = bdVar.b();
                    if (b2 > 0) {
                        Parcelable f2 = bdVar.f();
                        if (f2 != null) {
                            sparseArray.put(b2, f2);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public final void a(bd bdVar) {
        a(bdVar, this.a);
    }

    public final void a(bd bdVar, Context context) {
        this.y.add(new WeakReference(bdVar));
        bdVar.a(context, this);
        this.r = true;
    }

    public final void a(boolean z2) {
        if (!this.w) {
            this.w = true;
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                bd bdVar = (bd) weakReference.get();
                if (bdVar == null) {
                    this.y.remove(weakReference);
                } else {
                    bdVar.a(this, z2);
                }
            }
            this.w = false;
        }
    }

    public final boolean a(MenuItem menuItem, bd bdVar, int i2) {
        az azVar = (az) menuItem;
        if (azVar == null || !azVar.isEnabled()) {
            return false;
        }
        boolean b2 = azVar.b();
        hu huVar = azVar.e;
        boolean z2 = huVar != null && huVar.c();
        if (azVar.j()) {
            b2 |= azVar.expandActionView();
            if (b2) {
                a(true);
            }
        } else if (azVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                a(false);
            }
            if (!azVar.hasSubMenu()) {
                azVar.a(new bi(this.a, this, azVar));
            }
            bi biVar = (bi) azVar.getSubMenu();
            if (z2) {
                huVar.a((SubMenu) biVar);
            }
            b2 |= a(biVar, bdVar);
            if (!b2) {
                a(true);
            }
        } else if ((i2 & 1) == 0) {
            a(true);
        }
        return b2;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ax axVar, MenuItem menuItem) {
        a aVar = this.b;
        return aVar != null && aVar.a(axVar, menuItem);
    }

    public boolean a(az azVar) {
        boolean z2 = false;
        if (this.y.isEmpty()) {
            return false;
        }
        e();
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            bd bdVar = (bd) weakReference.get();
            if (bdVar != null) {
                z2 = bdVar.b(azVar);
                if (z2) {
                    break;
                }
            } else {
                this.y.remove(weakReference);
            }
        }
        f();
        if (z2) {
            this.i = azVar;
        }
        return z2;
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.l.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.l.getString(i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i6);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.l.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.l.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        az azVar = (az) a(i2, i3, i4, charSequence);
        bi biVar = new bi(this.a, this, azVar);
        azVar.a(biVar);
        return biVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.y.isEmpty()) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                bd bdVar = (bd) weakReference.get();
                if (bdVar == null) {
                    this.y.remove(weakReference);
                } else {
                    int b2 = bdVar.b();
                    if (b2 > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(b2);
                        if (parcelable != null) {
                            bdVar.a(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void b(bd bdVar) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            bd bdVar2 = (bd) weakReference.get();
            if (bdVar2 == null || bdVar2 == bdVar) {
                this.y.remove(weakReference);
            }
        }
    }

    public void b(boolean z2) {
        if (!this.s) {
            if (z2) {
                this.p = true;
                this.r = true;
            }
            if (!this.y.isEmpty()) {
                e();
                Iterator it = this.y.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    bd bdVar = (bd) weakReference.get();
                    if (bdVar == null) {
                        this.y.remove(weakReference);
                    } else {
                        bdVar.a(z2);
                    }
                }
                f();
            }
            return;
        }
        this.t = true;
        if (z2) {
            this.u = true;
        }
    }

    public boolean b() {
        return this.z;
    }

    public boolean b(az azVar) {
        boolean z2 = false;
        if (!this.y.isEmpty() && this.i == azVar) {
            e();
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                bd bdVar = (bd) weakReference.get();
                if (bdVar != null) {
                    z2 = bdVar.c(azVar);
                    if (z2) {
                        break;
                    }
                } else {
                    this.y.remove(weakReference);
                }
            }
            f();
            if (z2) {
                this.i = null;
            }
        }
        return z2;
    }

    public final void c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((bi) item.getSubMenu()).c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public boolean c() {
        return this.m;
    }

    public void clear() {
        az azVar = this.i;
        if (azVar != null) {
            b(azVar);
        }
        this.c.clear();
        b(true);
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        b(false);
    }

    public void close() {
        a(true);
    }

    public final void d(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((bi) item.getSubMenu()).d(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0) {
                MenuItem findItem = findItem(i3);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    public boolean d() {
        return this.n;
    }

    public final void e() {
        if (!this.s) {
            this.s = true;
            this.t = false;
            this.u = false;
        }
    }

    public final void f() {
        this.s = false;
        if (this.t) {
            this.t = false;
            b(this.u);
        }
    }

    public MenuItem findItem(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            az azVar = (az) this.c.get(i3);
            if (azVar.getItemId() == i2) {
                return azVar;
            }
            if (azVar.hasSubMenu()) {
                MenuItem findItem = azVar.getSubMenu().findItem(i2);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        this.p = true;
        b(true);
    }

    public MenuItem getItem(int i2) {
        return (MenuItem) this.c.get(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.r = true;
        b(true);
    }

    public boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((az) this.c.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<az> i() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            az azVar = (az) this.c.get(i2);
            if (azVar.isVisible()) {
                this.o.add(azVar);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public final void j() {
        ArrayList i2 = i();
        if (this.r) {
            Iterator it = this.y.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                bd bdVar = (bd) weakReference.get();
                if (bdVar == null) {
                    this.y.remove(weakReference);
                } else {
                    z2 |= bdVar.a();
                }
            }
            if (z2) {
                this.d.clear();
                this.q.clear();
                int size = i2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    az azVar = (az) i2.get(i3);
                    if (azVar.f()) {
                        this.d.add(azVar);
                    } else {
                        this.q.add(azVar);
                    }
                }
            } else {
                this.d.clear();
                this.q.clear();
                this.q.addAll(i());
            }
            this.r = false;
        }
    }

    public final ArrayList<az> k() {
        j();
        return this.q;
    }

    public ax l() {
        return this;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), (bd) null, i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        az a2 = a(i2, keyEvent);
        boolean a3 = a2 != null ? a((MenuItem) a2, (bd) null, i3) : false;
        if ((i3 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((az) this.c.get(i3)).getGroupId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.c.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || ((az) this.c.get(i3)).getGroupId() != i2) {
                    b(true);
                } else {
                    a(i3, false);
                    i4 = i5;
                }
            }
            b(true);
        }
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((az) this.c.get(i3)).getItemId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        a(i3, true);
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            az azVar = (az) this.c.get(i3);
            if (azVar.getGroupId() == i2) {
                azVar.a(z3);
                azVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.z = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            az azVar = (az) this.c.get(i3);
            if (azVar.getGroupId() == i2) {
                azVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.c.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            az azVar = (az) this.c.get(i3);
            if (azVar.getGroupId() == i2 && azVar.c(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.m = z2;
        b(false);
    }

    public int size() {
        return this.c.size();
    }
}
