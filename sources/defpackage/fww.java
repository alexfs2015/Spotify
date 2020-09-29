package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;

/* renamed from: fww reason: default package */
abstract class fww implements fwz {
    protected final PrettyHeaderView a;
    protected final ImageView b;
    protected final View c;
    protected boolean d = true;
    protected boolean e = true;
    protected View f;
    protected View g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected fxn p = fxn.a;
    protected CharSequence q;
    protected int r;
    protected boolean s = true;

    public void a(boolean z) {
    }

    public void b(int i2) {
    }

    public fww(PrettyHeaderView prettyHeaderView, ImageView imageView, View view, int i2) {
        this.a = prettyHeaderView;
        this.b = imageView;
        this.c = view;
        this.l = i2;
    }

    public final int a() {
        return this.o;
    }

    public final int b() {
        return this.n;
    }

    public final void a(fxn fxn) {
        this.p = fxn;
    }

    public void a(int i2) {
        this.b.setColorFilter(i2);
    }

    public ImageView c() {
        return this.b;
    }

    public final View d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public final void a(View view) {
        this.f = view;
    }

    public final void b(View view) {
        this.g = view;
    }

    public final int f() {
        return this.h;
    }

    public void c(int i2) {
        this.h = i2;
    }

    public void d(int i2) {
        this.i = i2;
    }

    public void e(int i2) {
        this.r = i2;
    }

    public final void f(int i2) {
        this.m = i2;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void a(CharSequence charSequence) {
        this.q = charSequence;
    }

    public final void c(boolean z) {
        this.s = z;
    }
}
