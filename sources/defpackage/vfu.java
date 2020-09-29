package defpackage;

import android.view.View;

/* renamed from: vfu reason: default package */
public final class vfu {
    public b a;
    private final View b;

    public vfu(View view) {
        this.b = view;
    }

    public final void a() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(this.b.getDrawableState());
        }
    }

    public final void a(b bVar) {
        b bVar2 = this.a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.a((View) null);
            }
            this.a = bVar;
            if (bVar != null) {
                bVar.a(this.b);
                if (ip.E(this.b)) {
                    bVar.a(this.b.getDrawableState());
                }
            }
        }
    }

    public final void b() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a();
        }
    }
}
