package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2.e;
import androidx.viewpager2.widget.ViewPager2.g;
import java.util.Locale;

/* renamed from: sn reason: default package */
public final class sn extends e {
    public g a;
    private final LinearLayoutManager b;

    public sn(LinearLayoutManager linearLayoutManager) {
        this.b = linearLayoutManager;
    }

    public final void a(int i) {
    }

    public final void a(int i, float f, int i2) {
        if (this.a != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.b.r()) {
                View g = this.b.g(i3);
                if (g != null) {
                    this.a.transformPage(g, ((float) (LinearLayoutManager.c(g) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.b.r())}));
                }
            }
        }
    }

    public final void b(int i) {
    }
}
