package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ar reason: default package */
public final class ar implements gu {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private int i = 4096;
    private char j;
    private int k = 4096;
    private Drawable l;
    private int m = 0;
    private Context n;
    private OnMenuItemClickListener o;
    private CharSequence p;
    private CharSequence q;
    private ColorStateList r = null;
    private Mode s = null;
    private boolean t = false;
    private boolean u = false;
    private int v = 16;

    public ar(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.n = context;
        this.a = 16908332;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = charSequence;
    }

    private void b() {
        if (this.l == null) {
            return;
        }
        if (this.t || this.u) {
            this.l = gm.f(this.l);
            this.l = this.l.mutate();
            if (this.t) {
                gm.a(this.l, this.r);
            }
            if (this.u) {
                gm.a(this.l, this.s);
            }
        }
    }

    public final gu a(hu huVar) {
        throw new UnsupportedOperationException();
    }

    public final gu a(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    public final hu a() {
        return null;
    }

    public final gu b(CharSequence charSequence) {
        this.q = charSequence;
        return this;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.k;
    }

    public final char getAlphabeticShortcut() {
        return this.j;
    }

    public final CharSequence getContentDescription() {
        return this.p;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        return this.l;
    }

    public final ColorStateList getIconTintList() {
        return this.r;
    }

    public final Mode getIconTintMode() {
        return this.s;
    }

    public final Intent getIntent() {
        return this.g;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.i;
    }

    public final char getNumericShortcut() {
        return this.h;
    }

    public final int getOrder() {
        return this.d;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    public final CharSequence getTooltipText() {
        return this.q;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.v & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.v & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.v & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.v & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.j = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.v = z | (this.v & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.v = (z ? 2 : 0) | (this.v & -3);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.v = (z ? 16 : 0) | (this.v & -17);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.m = i2;
        this.l = fr.a(this.n, i2);
        b();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.l = drawable;
        this.m = 0;
        b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        this.t = true;
        b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.s = mode;
        this.u = true;
        b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.h = c2;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.o = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.e = this.n.getResources().getString(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.q = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.v & 8;
        if (z) {
            i2 = 0;
        }
        this.v = i3 | i2;
        return this;
    }
}
