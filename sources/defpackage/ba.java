package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: ba reason: default package */
public final class ba extends at implements MenuItem {
    public final gu d;
    public Method e;

    /* renamed from: ba$a */
    class a extends hu {
        final ActionProvider a;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.a = actionProvider;
        }

        public final View a() {
            return this.a.onCreateActionView();
        }

        public final void a(SubMenu subMenu) {
            this.a.onPrepareSubMenu(ba.this.a(subMenu));
        }

        public final boolean b() {
            return this.a.onPerformDefaultAction();
        }

        public final boolean c() {
            return this.a.hasSubMenu();
        }
    }

    /* renamed from: ba$b */
    class b extends a implements VisibilityListener {
        private defpackage.hu.b e;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public final View a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public final void a(defpackage.hu.b bVar) {
            this.e = bVar;
            this.a.setVisibilityListener(this);
        }

        public final boolean d() {
            return this.a.overridesItemVisibility();
        }

        public final boolean e() {
            return this.a.isVisible();
        }

        public final void f() {
            this.a.refreshVisibility();
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            defpackage.hu.b bVar = this.e;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* renamed from: ba$c */
    static class c extends FrameLayout implements ak {
        final CollapsibleActionView a;

        c(View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void a() {
            this.a.onActionViewExpanded();
        }

        public final void b() {
            this.a.onActionViewCollapsed();
        }
    }

    /* renamed from: ba$d */
    class d implements OnActionExpandListener {
        private final OnActionExpandListener a;

        d(OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(ba.this.a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(ba.this.a(menuItem));
        }
    }

    /* renamed from: ba$e */
    class e implements OnMenuItemClickListener {
        private final OnMenuItemClickListener a;

        e(OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(ba.this.a(menuItem));
        }
    }

    public ba(Context context, gu guVar) {
        super(context);
        if (guVar != null) {
            this.d = guVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        hu a2 = this.d.a();
        if (a2 instanceof a) {
            return ((a) a2).a;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public final int getGroupId() {
        return this.d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public final Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.d.getIntent();
    }

    public final int getItemId() {
        return this.d.getItemId();
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return a(this.d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    public final boolean isChecked() {
        return this.d.isChecked();
    }

    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    public final boolean isVisible() {
        return this.d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        hu bVar = VERSION.SDK_INT >= 16 ? new b(this.a, actionProvider) : new a(this.a, actionProvider);
        gu guVar = this.d;
        if (actionProvider == null) {
            bVar = null;
        }
        guVar.a(bVar);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.d.setActionView(i);
        View actionView = this.d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.d.setActionView((View) new c(actionView));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.d.setAlphabeticShortcut(c2, i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.a(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        this.d.setNumericShortcut(c2, i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.d.setShortcut(c2, c3, i, i2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.d.setTitle(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.b(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }
}
