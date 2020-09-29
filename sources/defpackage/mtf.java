package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: mtf reason: default package */
final class mtf extends u {
    final RecyclerView a = ((RecyclerView) this.o.findViewById(16908298));
    final Picasso b;
    final LayoutInflater c;
    /* access modifiers changed from: private */
    public final int d;
    /* access modifiers changed from: private */
    public final int e;

    mtf(View view, Picasso picasso, LayoutInflater layoutInflater) {
        super(view);
        this.c = layoutInflater;
        this.b = picasso;
        Resources resources = layoutInflater.getContext().getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.std_16dp);
        this.d = resources.getDimensionPixelSize(R.dimen.std_4dp);
        this.a.a((h) new h() {
            public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                int e = RecyclerView.e(view);
                if (e != -1) {
                    i d = recyclerView.d();
                    if (d != null) {
                        rect.set(e == 0 ? mtf.this.e : mtf.this.d, 0, e == d.t() + -1 ? mtf.this.e : mtf.this.d, 0);
                    }
                }
            }
        }, -1);
    }
}
