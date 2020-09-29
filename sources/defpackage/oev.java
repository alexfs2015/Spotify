package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.r;

/* renamed from: oev reason: default package */
public final class oev extends on {
    public int b = -1;
    public boolean c;
    public boolean d;
    public a e;
    private RecyclerView f;
    private final m g = new m() {
        public final void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0) {
                View a2 = oev.this.a(recyclerView.d());
                int c = a2 == null ? -1 : i.c(a2);
                if (oev.this.c && c < oev.this.b) {
                    oev oev = oev.this;
                    oev.a(oev, recyclerView, oev.b);
                } else if (oev.this.d && c > oev.this.b) {
                    oev oev2 = oev.this;
                    oev.a(oev2, recyclerView, oev2.b);
                } else if (oev.this.b != c) {
                    oev oev3 = oev.this;
                    if (oev3.e != null) {
                        if (oev3.b > c) {
                            oev3.e.b();
                        } else {
                            oev3.e.a();
                        }
                    }
                    oev.this.b = c;
                }
            }
        }
    };

    /* renamed from: oev$a */
    public interface a {
        void a();

        void b();
    }

    static /* synthetic */ void a(oev oev, RecyclerView recyclerView, int i) {
        if (i != -1) {
            i iVar = (i) fbp.a(recyclerView.d());
            r rVar = (r) fbp.a(oev.c(iVar));
            rVar.b = i;
            iVar.a(rVar);
        }
    }

    public final int a(i iVar, int i, int i2) {
        return (i <= 0 || !this.d) ? (i >= 0 || !this.c) ? super.a(iVar, i, i2) : this.b : this.b;
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        RecyclerView recyclerView2 = this.f;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b(this.g);
            }
            this.f = recyclerView;
            RecyclerView recyclerView3 = this.f;
            if (recyclerView3 != null) {
                recyclerView3.a(this.g);
            }
        }
    }
}
