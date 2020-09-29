package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: as reason: default package */
public abstract class as implements bd {
    protected Context a;
    protected Context b;
    public ax c;
    public a d;
    public be e;
    public int f;
    private LayoutInflater g;
    private LayoutInflater h;
    private int i;
    private int j;

    public as(Context context, int i2, int i3) {
        this.a = context;
        this.g = LayoutInflater.from(context);
        this.i = i2;
        this.j = i3;
    }

    public View a(az azVar, View view, ViewGroup viewGroup) {
        a aVar = view instanceof a ? (a) view : (a) this.g.inflate(this.j, viewGroup, false);
        a(azVar, aVar);
        return (View) aVar;
    }

    public be a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (be) this.g.inflate(this.i, viewGroup, false);
            this.e.a(this.c);
            a(true);
        }
        return this.e;
    }

    public void a(Context context, ax axVar) {
        this.b = context;
        this.h = LayoutInflater.from(this.b);
        this.c = axVar;
    }

    public void a(ax axVar, boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(axVar, z);
        }
    }

    public abstract void a(az azVar, a aVar);

    public final void a(a aVar) {
        this.d = aVar;
    }

    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            ax axVar = this.c;
            int i2 = 0;
            if (axVar != null) {
                axVar.j();
                ArrayList i3 = this.c.i();
                int size = i3.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    az azVar = (az) i3.get(i5);
                    if (a(azVar)) {
                        View childAt = viewGroup.getChildAt(i4);
                        az a2 = childAt instanceof a ? ((a) childAt).a() : null;
                        View a3 = a(azVar, childAt, viewGroup);
                        if (azVar != a2) {
                            a3.setPressed(false);
                            a3.jumpDrawablesToCurrentState();
                        }
                        if (a3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a3);
                            }
                            ((ViewGroup) this.e).addView(a3, i4);
                        }
                        i4++;
                    }
                }
                i2 = i4;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public boolean a(az azVar) {
        return true;
    }

    public boolean a(bi biVar) {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.a(biVar);
        }
        return false;
    }

    public final int b() {
        return this.f;
    }

    public final boolean b(az azVar) {
        return false;
    }

    public final boolean c(az azVar) {
        return false;
    }
}
