package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager.b;
import androidx.recyclerview.widget.RecyclerView.u;
import com.squareup.picasso.Picasso;

/* renamed from: nop reason: default package */
public final class nop extends non<noq> {
    public final b f;
    private final DisplayMetrics g;
    private final Picasso h;
    private final int i;
    private final int j;

    public nop(DisplayMetrics displayMetrics, Picasso picasso, npg npg, final int i2, int i3) {
        super(npg);
        this.g = (DisplayMetrics) fay.a(displayMetrics);
        this.h = picasso;
        this.f = new b() {
            public final int a(int i) {
                if (i == 0) {
                    if ((nop.this.b() & 1) != 0) {
                        return i2;
                    }
                }
                return 1;
            }
        };
        this.i = i2;
        this.j = i3;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        noq noq = new noq(viewGroup, this.e, this.h, this.f, this.g.widthPixels, this.i, this.j);
        return noq;
    }
}
