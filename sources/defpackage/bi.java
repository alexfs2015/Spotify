package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: bi reason: default package */
public class bi extends ax implements SubMenu {
    public ax k;
    private az l;

    public bi(Context context, ax axVar, az azVar) {
        super(context);
        this.k = axVar;
        this.l = azVar;
    }

    public void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    public final boolean c() {
        return this.k.c();
    }

    public final boolean d() {
        return this.k.d();
    }

    public MenuItem getItem() {
        return this.l;
    }

    public final void a(a aVar) {
        this.k.a(aVar);
    }

    public final ax l() {
        return this.k.l();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ax axVar, MenuItem menuItem) {
        return super.a(axVar, menuItem) || this.k.a(axVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    public final boolean a(az azVar) {
        return this.k.a(azVar);
    }

    public final boolean b(az azVar) {
        return this.k.b(azVar);
    }

    public final String a() {
        az azVar = this.l;
        int itemId = azVar != null ? azVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.a());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    public final boolean b() {
        return this.k.b();
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.a(0, null, 0, drawable, null);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        super.a(0, null, i, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(0, charSequence, 0, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.a(0, null, 0, null, view);
        return this;
    }
}
