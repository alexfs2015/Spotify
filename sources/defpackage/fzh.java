package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.paste.widgets.TextHeaderView;
import defpackage.fyv;

/* renamed from: fzh reason: default package */
public final class fzh<T extends fyv> extends fyk<T> {
    final TextHeaderView a;
    private final fxy b;
    private T c;
    private final Button d;

    public fzh(fym fym, Context context, Fragment fragment, fyb fyb) {
        this.a = new TextHeaderView(context);
        this.d = fym.d;
        this.b = fyj.b(fym, fragment, this.a, fym.h, fyb);
        this.b.a().c(fym.q);
        this.b.b().a(fym.l);
        int i = fym.c;
        if (i == 0) {
            a(fym, context);
            this.c = new fyq() {
                public final void a(CharSequence charSequence) {
                    fzh.this.a.a(charSequence);
                }
            };
        } else if (i == 1) {
            a(fym, context);
            this.c = new fys() {
                public final TextView a() {
                    return fzh.this.a.a;
                }

                public final void a(CharSequence charSequence) {
                    fzh.this.a.a(charSequence);
                }

                public final void b(CharSequence charSequence) {
                    fzh.this.a.b(charSequence);
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
        throw new UnsupportedOperationException("ListView not supported.");
    }

    public final RecyclerView f() {
        return this.b.e();
    }

    public final void h() {
        this.b.a().b(false);
    }
}
