package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* renamed from: fud reason: default package */
public final class fud {
    public int a = -1;
    private final Button b;
    private final fuf c;
    private int d;
    private int e;
    private final a f = new a(0);
    private final a g = new a(0);
    private final fue h;

    /* renamed from: fud$a */
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

    public fud(Button button, fuf fuf) {
        this.b = (Button) fbp.a(button);
        this.c = (fuf) fbp.a(fuf);
        this.h = new fue(button.getContext());
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

    private static boolean a(int i) {
        return gd.a(i) > 0.5d;
    }

    private void c() {
        if (this.g.a) {
            this.b.setTextColor(this.g.c);
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

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.b.getContext().obtainStyledAttributes(attributeSet, defpackage.gao.a.g, i, 0);
        try {
            this.e = obtainStyledAttributes.getColor(defpackage.gao.a.j, -16777216);
            this.d = obtainStyledAttributes.getColor(defpackage.gao.a.k, -1);
            this.a = obtainStyledAttributes.getResourceId(defpackage.gao.a.h, -1);
            if (obtainStyledAttributes.hasValue(defpackage.gao.a.l)) {
                this.g.b = obtainStyledAttributes.getColor(defpackage.gao.a.l, -65281);
            }
            if (obtainStyledAttributes.hasValue(defpackage.gao.a.i)) {
                this.f.b = obtainStyledAttributes.getColor(defpackage.gao.a.i, -65281);
            }
            a();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void b() {
        if (this.f.a) {
            Drawable background = this.b.getBackground();
            if (background != null) {
                fuc.a(background, this.f.c, this.b.getDrawableState());
            }
        }
    }
}
