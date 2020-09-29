package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.r;

/* renamed from: nyj reason: default package */
public final class nyj extends oi {
    public int b = -1;
    public boolean c;
    public boolean d;
    public a e;
    private RecyclerView f;
    private final m g = new m() {
        public final void a(RecyclerView recyclerView, int i) {
            int i2;
            super.a(recyclerView, i);
            if (i == 0) {
                View a2 = nyj.this.a(recyclerView.d());
                if (a2 == null) {
                    i2 = -1;
                } else {
                    i2 = i.c(a2);
                }
                if (nyj.this.c && i2 < nyj.this.b) {
                    nyj nyj = nyj.this;
                    nyj.a(nyj, recyclerView, nyj.b);
                } else if (nyj.this.d && i2 > nyj.this.b) {
                    nyj nyj2 = nyj.this;
                    nyj.a(nyj2, recyclerView, nyj2.b);
                } else if (nyj.this.b != i2) {
                    nyj nyj3 = nyj.this;
                    if (nyj3.e != null) {
                        if (nyj3.b > i2) {
                            nyj3.e.b();
                        } else {
                            nyj3.e.a();
                        }
                    }
                    nyj.this.b = i2;
                }
            }
        }
    };

    /* renamed from: nyj$a */
    public interface a {
        void a();

        void b();
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

    public final int a(i iVar, int i, int i2) {
        if (i > 0 && this.d) {
            return this.b;
        }
        if (i >= 0 || !this.c) {
            return super.a(iVar, i, i2);
        }
        return this.b;
    }

    static /* synthetic */ void a(nyj nyj, RecyclerView recyclerView, int i) {
        if (i != -1) {
            i iVar = (i) fay.a(recyclerView.d());
            r rVar = (r) fay.a(nyj.c(iVar));
            rVar.b = i;
            iVar.a(rVar);
        }
    }
}
