package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: az reason: default package */
public final class az implements gu {
    private View A;
    private OnActionExpandListener B;
    private boolean C = false;
    private ContextMenuInfo D;
    final int a;
    public int b = 4096;
    public int c = 4096;
    public ax d;
    public hu e;
    private final int f;
    private final int g;
    private final int h;
    private CharSequence i;
    private CharSequence j;
    private Intent k;
    private char l;
    private char m;
    private Drawable n;
    private int o = 0;
    private bi p;
    private OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t = null;
    private Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z = 0;

    az(ax axVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.d = axVar;
        this.f = i3;
        this.g = i2;
        this.h = i4;
        this.a = i5;
        this.i = charSequence;
        this.z = i6;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = gm.f(drawable).mutate();
            if (this.v) {
                gm.a(drawable, this.t);
            }
            if (this.w) {
                gm.a(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public gu setActionView(View view) {
        this.A = view;
        this.e = null;
        if (view != null && view.getId() == -1) {
            int i2 = this.f;
            if (i2 > 0) {
                view.setId(i2);
            }
        }
        this.d.h();
        return this;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final gu a(hu huVar) {
        hu huVar2 = this.e;
        if (huVar2 != null) {
            huVar2.d = null;
            huVar2.c = null;
        }
        this.A = null;
        this.e = huVar;
        this.d.b(true);
        hu huVar3 = this.e;
        if (huVar3 != null) {
            huVar3.a((b) new b() {
                public final void a() {
                    az.this.d.g();
                }
            });
        }
        return this;
    }

    /* renamed from: a */
    public final gu setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.d.b(false);
        return this;
    }

    public final hu a() {
        return this.e;
    }

    public final CharSequence a(a aVar) {
        return aVar.a_() ? getTitleCondensed() : getTitle();
    }

    public final void a(bi biVar) {
        this.p = biVar;
        biVar.setHeaderTitle(getTitle());
    }

    public final void a(boolean z2) {
        this.y = (z2 ? 4 : 0) | (this.y & -5);
    }

    /* renamed from: b */
    public final gu setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.d.b(false);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z2) {
        int i2 = this.y;
        this.y = (z2 ? 2 : 0) | (i2 & -3);
        if (i2 != this.y) {
            this.d.b(false);
        }
    }

    public final boolean b() {
        OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        ax axVar = this.d;
        if (axVar.a(axVar, (MenuItem) this)) {
            return true;
        }
        if (this.k != null) {
            try {
                this.d.a.startActivity(this.k);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        hu huVar = this.e;
        return huVar != null && huVar.b();
    }

    public final char c() {
        return this.d.c() ? this.m : this.l;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(boolean z2) {
        int i2 = this.y;
        this.y = (z2 ? 0 : 8) | (i2 & -9);
        return i2 != this.y;
    }

    public final boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.d.b(this);
        }
        return false;
    }

    public final void d(boolean z2) {
        if (z2) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public final boolean d() {
        return this.d.d() && c() != 0;
    }

    public final void e(boolean z2) {
        this.C = z2;
        this.d.b(false);
    }

    public final boolean e() {
        return (this.y & 4) != 0;
    }

    public final boolean expandActionView() {
        if (!j()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.d.a(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.y & 32) == 32;
    }

    public final boolean g() {
        return (this.z & 1) == 1;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        hu huVar = this.e;
        if (huVar == null) {
            return null;
        }
        this.A = huVar.a((MenuItem) this);
        return this.A;
    }

    public final int getAlphabeticModifiers() {
        return this.c;
    }

    public final char getAlphabeticShortcut() {
        return this.m;
    }

    public final CharSequence getContentDescription() {
        return this.r;
    }

    public final int getGroupId() {
        return this.g;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.n;
        if (drawable != null) {
            return a(drawable);
        }
        if (this.o == 0) {
            return null;
        }
        Drawable b2 = ab.b(this.d.a, this.o);
        this.o = 0;
        this.n = b2;
        return a(b2);
    }

    public final ColorStateList getIconTintList() {
        return this.t;
    }

    public final Mode getIconTintMode() {
        return this.u;
    }

    public final Intent getIntent() {
        return this.k;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public final int getNumericModifiers() {
        return this.b;
    }

    public final char getNumericShortcut() {
        return this.l;
    }

    public final int getOrder() {
        return this.h;
    }

    public final SubMenu getSubMenu() {
        return this.p;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.i;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.j;
        if (charSequence == null) {
            charSequence = this.i;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final CharSequence getTooltipText() {
        return this.s;
    }

    public final boolean h() {
        return (this.z & 2) == 2;
    }

    public final boolean hasSubMenu() {
        return this.p != null;
    }

    public final boolean i() {
        return (this.z & 4) == 4;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public final boolean isVisible() {
        hu huVar = this.e;
        return (huVar == null || !huVar.d()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.e.e();
    }

    public final boolean j() {
        if ((this.z & 8) != 0) {
            if (this.A == null) {
                hu huVar = this.e;
                if (huVar != null) {
                    this.A = huVar.a((MenuItem) this);
                }
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.d.a;
        setActionView(LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.m == c2) {
            return this;
        }
        this.m = Character.toLowerCase(c2);
        this.d.b(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.m == c2 && this.c == i2) {
            return this;
        }
        this.m = Character.toLowerCase(c2);
        this.c = KeyEvent.normalizeMetaState(i2);
        this.d.b(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.y;
        this.y = z2 | (i2 & true) ? 1 : 0;
        if (i2 != this.y) {
            this.d.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        if ((this.y & 4) != 0) {
            ax axVar = this.d;
            int groupId = getGroupId();
            int size = axVar.c.size();
            axVar.e();
            for (int i2 = 0; i2 < size; i2++) {
                az azVar = (az) axVar.c.get(i2);
                if (azVar.getGroupId() == groupId && azVar.e() && azVar.isCheckable()) {
                    azVar.b(azVar == this);
                }
            }
            axVar.f();
        } else {
            b(z2);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.d.b(false);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.n = null;
        this.o = i2;
        this.x = true;
        this.d.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.o = 0;
        this.n = drawable;
        this.x = true;
        this.d.b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.d.b(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.d.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.k = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.l == c2) {
            return this;
        }
        this.l = c2;
        this.d.b(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.l == c2 && this.b == i2) {
            return this;
        }
        this.l = c2;
        this.b = KeyEvent.normalizeMetaState(i2);
        this.d.b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.l = c2;
        this.m = Character.toLowerCase(c3);
        this.d.b(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.l = c2;
        this.b = KeyEvent.normalizeMetaState(i2);
        this.m = Character.toLowerCase(c3);
        this.c = KeyEvent.normalizeMetaState(i3);
        this.d.b(false);
        return this;
    }

    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.z = i2;
            this.d.h();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        return setTitle((CharSequence) this.d.a.getString(i2));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.i = charSequence;
        this.d.b(false);
        bi biVar = this.p;
        if (biVar != null) {
            biVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.j = charSequence;
        this.d.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        if (c(z2)) {
            this.d.g();
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.i;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
