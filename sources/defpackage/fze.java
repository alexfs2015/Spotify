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
import defpackage.fyv;

/* renamed from: fze reason: default package */
public final class fze<T extends fyv> extends fyk<T> {
    final TextHeaderView a;
    private final fxw b;
    private T c;
    private final Button d;

    public fze(fym fym, Context context, Fragment fragment, fyb fyb) {
        this.a = new TextHeaderView(context);
        this.d = fym.d;
        this.b = fyj.a(fym, fragment, this.a, fym.h, fyb);
        this.b.b().a(fym.l);
        int i = fym.c;
        if (i == 0) {
            a(fym, context);
            this.c = new fyq() {
                public final void a(CharSequence charSequence) {
                    fze.this.a.a(charSequence);
                }
            };
        } else if (i == 1) {
            a(fym, context);
            this.c = new fys() {
                public final TextView a() {
                    return fze.this.a.a;
                }

                public final void a(CharSequence charSequence) {
                    fze.this.a.a(charSequence);
                }

                public final void b(CharSequence charSequence) {
                    fze.this.a.b(charSequence);
                }
            };
        } else {
            throw new UnsupportedOperationException("not supported");
        }
    }

    private void a(fym fym, Context context) {
        if (this.d != null) {
            int i = fym.e == 0 ? 1 : 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = vfj.a(8.0f, context.getResources());
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

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(View view) {
    }

    public final void a(e eVar) {
    }

    public final void a(fzn fzn, Context context) {
    }

    public final void a(boolean z) {
        this.b.b(z);
    }

    public final View b() {
        return this.b.d();
    }

    public final void b(int i) {
    }

    public final void b(View view) {
    }

    public final void b(boolean z) {
        this.b.c(z);
    }

    public final ImageView c() {
        return null;
    }

    public final ImageView d() {
        return this.b.b().c();
    }

    public final StickyListView e() {
        return this.b.a();
    }

    public final void h() {
    }
}
