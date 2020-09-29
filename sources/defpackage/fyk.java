package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.paste.widgets.TextHeaderView;
import defpackage.fyb;

/* renamed from: fyk reason: default package */
public final class fyk<T extends fyb> extends fxq<T> {
    final TextHeaderView a;
    private final fxc b;
    private T c;
    private final Button d;

    public final void a(View view) {
    }

    public final void a(e eVar) {
    }

    public final void a(fyt fyt, Context context) {
    }

    public final void b(int i) {
    }

    public final void b(View view) {
    }

    public final ImageView c() {
        return null;
    }

    public final void h() {
    }

    public fyk(fxs fxs, Context context, Fragment fragment, fxh fxh) {
        this.a = new TextHeaderView(context);
        this.d = fxs.d;
        this.b = fxp.a(fxs, fragment, this.a, fxs.h, fxh);
        this.b.b().a(fxs.l);
        int i = fxs.c;
        if (i == 0) {
            a(fxs, context);
            this.c = new fxw() {
                public final void a(CharSequence charSequence) {
                    fyk.this.a.a(charSequence);
                }
            };
        } else if (i == 1) {
            a(fxs, context);
            this.c = new fxy() {
                public final TextView a() {
                    return fyk.this.a.a;
                }

                public final void a(CharSequence charSequence) {
                    fyk.this.a.a(charSequence);
                }

                public final void b(CharSequence charSequence) {
                    fyk.this.a.b(charSequence);
                }
            };
        } else {
            throw new UnsupportedOperationException("not supported");
        }
    }

    private void a(fxs fxs, Context context) {
        if (this.d != null) {
            int i = fxs.e == 0 ? 1 : 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = uts.a(8.0f, context.getResources());
            if (i != 0) {
                layoutParams.bottomMargin = a2;
            } else {
                layoutParams.topMargin = a2;
            }
            this.a.addView(this.d, i ^ 1, layoutParams);
        }
    }

    public final T a() {
        return this.c;
    }

    public final View b() {
        return this.b.d();
    }

    public final ImageView d() {
        return this.b.b().c();
    }

    public final StickyListView e() {
        return this.b.a();
    }

    public final void a(boolean z) {
        this.b.b(z);
    }

    public final void b(boolean z) {
        this.b.c(z);
    }

    public final void a(int i) {
        this.b.a(i);
    }
}
