package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.ShelfGridRecyclerView;

/* renamed from: qth reason: default package */
public final class qth extends oj {
    private static final Interpolator g = $$Lambda$qth$PPBjFE2nt1tZDUxloLAxrL9PJGg.INSTANCE;
    public b b;
    private ShelfGridRecyclerView c;
    private a d;
    private om e;
    private Scroller f;
    private int h = -1;
    private int i;
    private int j;

    /* renamed from: qth$a */
    class a {
        final boolean a;

        a(int i) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.a = z;
        }
    }

    /* renamed from: qth$b */
    public interface b {
        void a(int i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ float a(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3) + 1.0f;
    }

    private int a(int i2) {
        return i2 - (i2 % this.j);
    }

    private void a(GridLayoutManager gridLayoutManager) {
        if (this.i == 0) {
            View g2 = gridLayoutManager.g(0);
            if (g2 != null) {
                this.i = g2.getWidth();
                this.j = ShelfGridRecyclerView.o();
            }
        }
    }

    public final int a(i iVar, int i2, int i3) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) iVar;
        a(gridLayoutManager);
        Scroller scroller = this.f;
        if (scroller != null) {
            scroller.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            a aVar = this.d;
            if (!(aVar == null || i2 == 0)) {
                int finalX = this.f.getFinalX();
                int i4 = qth.this.j;
                if (finalX < 0) {
                    i4 = -i4;
                }
                if (aVar.a) {
                    i4 = -i4;
                }
                boolean z = finalX < 0;
                if (!aVar.a) {
                    z = !z;
                }
                return (z ? qth.this.a(gridLayoutManager.j()) : qth.this.a(gridLayoutManager.l())) + i4;
            }
        }
        return -1;
    }

    public final View a(i iVar) {
        int i2;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) iVar;
        int j2 = gridLayoutManager.j();
        if (j2 == -1) {
            i2 = -1;
        } else {
            a(gridLayoutManager);
            if (j2 >= this.h) {
                i2 = gridLayoutManager.k();
                if (i2 == -1 || i2 % this.j != 0) {
                    i2 = a(this.j + j2);
                }
            } else {
                int a2 = a(j2);
                if (gridLayoutManager.c(a2) == null) {
                    a aVar = this.d;
                    if (aVar != null) {
                        int i3 = this.h;
                        int[] iArr = new int[2];
                        int j3 = gridLayoutManager.j();
                        if (qth.this.e != null) {
                            if (i3 > j3) {
                                iArr[0] = -qth.this.e.a(gridLayoutManager.c(i3));
                            } else if (aVar.a) {
                                iArr[0] = qth.this.e.b(gridLayoutManager.c(gridLayoutManager.l())) + ((j3 - i3) * qth.this.i);
                            } else {
                                iArr[0] = qth.this.e.a(gridLayoutManager.c(j3)) - ((j3 - i3) * qth.this.i);
                            }
                        }
                        this.c.a(iArr[0], iArr[1], g);
                    }
                }
                i2 = a2;
            }
            this.h = j2;
        }
        if (i2 == -1) {
            return null;
        }
        return iVar.c(i2);
    }

    public final void a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.c = (ShelfGridRecyclerView) recyclerView;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) fbp.a((GridLayoutManager) recyclerView.d());
            if (gridLayoutManager.e()) {
                this.e = om.a((i) gridLayoutManager);
                this.d = new a(ip.f(this.c));
                this.f = new Scroller(this.c.getContext(), g);
                a(gridLayoutManager);
            } else {
                throw new IllegalStateException("RecyclerView must be scrollable");
            }
        }
        super.a(recyclerView);
    }

    public final int[] a(i iVar, View view) {
        int i2;
        int i3;
        int[] iArr = new int[2];
        a aVar = this.d;
        if (aVar != null) {
            if (qth.this.e != null) {
                if (aVar.a) {
                    i2 = qth.this.e.b(view) + ip.i(qth.this.c);
                    i3 = qth.this.c.getWidth();
                } else {
                    i2 = qth.this.e.a(view);
                    i3 = ip.i(qth.this.c);
                }
                iArr[0] = i2 - i3;
                b bVar = this.b;
                if (bVar != null) {
                    bVar.a(i.c(view));
                }
            } else {
                throw new IllegalStateException("OrientationHelper must be not null");
            }
        }
        return iArr;
    }
}
