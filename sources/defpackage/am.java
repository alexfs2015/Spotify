package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: am reason: default package */
public final class am extends aj implements a {
    private Context a;
    private ActionBarContextView d;
    private a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private ax i;

    public am(Context context, ActionBarContextView actionBarContextView, a aVar, boolean z) {
        this.a = context;
        this.d = actionBarContextView;
        this.e = aVar;
        ax axVar = new ax(actionBarContextView.getContext());
        this.i = axVar;
        this.i.a((a) this);
        this.h = z;
    }

    public final MenuInflater a() {
        return new ao(this.d.getContext());
    }

    public final void a(int i2) {
        b((CharSequence) this.a.getString(i2));
    }

    public final void a(View view) {
        this.d.a(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    public final void a(ax axVar) {
        d();
        this.d.a();
    }

    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void a(boolean z) {
        super.a(z);
        this.d.a(z);
    }

    public final boolean a(ax axVar, MenuItem menuItem) {
        return this.e.a((aj) this, menuItem);
    }

    public final Menu b() {
        return this.i;
    }

    public final void b(int i2) {
        a((CharSequence) this.a.getString(i2));
    }

    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public final void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    public final void d() {
        this.e.b(this, this.i);
    }

    public final CharSequence f() {
        return this.d.f;
    }

    public final CharSequence g() {
        return this.d.g;
    }

    public final boolean h() {
        return this.d.h;
    }

    public final View i() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
