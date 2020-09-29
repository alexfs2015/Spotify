package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* renamed from: ftj reason: default package */
public final class ftj {
    public int a = -1;
    private final Button b;
    private final ftl c;
    private int d;
    private int e;
    private final a f = new a(0);
    private final a g = new a(0);
    private final ftk h;

    /* renamed from: ftj$a */
    static class a {
        boolean a;
        int b;
        ColorStateList c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ftj(Button button, ftl ftl) {
        this.b = (Button) fay.a(button);
        this.c = (ftl) fay.a(ftl);
        this.h = new ftk(button.getContext());
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.b.getContext().obtainStyledAttributes(attributeSet, defpackage.fzu.a.g, i, 0);
        try {
            this.e = obtainStyledAttributes.getColor(defpackage.fzu.a.j, -16777216);
            this.d = obtainStyledAttributes.getColor(defpackage.fzu.a.k, -1);
            this.a = obtainStyledAttributes.getResourceId(defpackage.fzu.a.h, -1);
            if (obtainStyledAttributes.hasValue(defpackage.fzu.a.l)) {
                this.g.b = obtainStyledAttributes.getColor(defpackage.fzu.a.l, -65281);
            }
            if (obtainStyledAttributes.hasValue(defpackage.fzu.a.i)) {
                this.f.b = obtainStyledAttributes.getColor(defpackage.fzu.a.i, -65281);
            }
            a();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a() {
        boolean z = true;
        boolean z2 = this.g.b != 0;
        boolean z3 = this.f.b != 0;
        this.f.a = z3 && this.c.a(this.a);
        a aVar = this.g;
        if (!z2 && !this.f.a) {
            z = false;
        }
        aVar.a = z;
        if (this.f.a) {
            a aVar2 = this.f;
            aVar2.c = this.h.a(aVar2.b);
            b();
        }
        if (this.g.a) {
            a(a(this.f.b));
        }
    }

    public final void b() {
        if (this.f.a) {
            Drawable background = this.b.getBackground();
            if (background != null) {
                fti.a(background, this.f.c, this.b.getDrawableState());
            }
        }
    }

    private void a(boolean z) {
        if (this.g.b != 0) {
            a aVar = this.g;
            aVar.c = this.h.a(aVar.b);
        } else if (z) {
            this.g.c = this.h.a(this.e);
        } else {
            this.g.c = this.h.a(this.d);
        }
        c();
    }

    private void c() {
        if (this.g.a) {
            this.b.setTextColor(this.g.c);
        }
    }

    private static boolean a(int i) {
        return gd.a(i) > 0.5d;
    }
}
