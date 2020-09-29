package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import defpackage.fyb;

/* renamed from: fyi reason: default package */
public final class fyi<T extends fyb> extends fxq<T> {
    final fxc a;
    final uvx b;
    private final Button c;
    private T d;

    public final void a(e eVar) {
    }

    public final void a(fyt fyt, Context context) {
    }

    public final void h() {
    }

    public fyi(fxs fxs, Context context, Fragment fragment, uvx uvx, fxh fxh) {
        this.b = (uvx) fay.a(uvx);
        this.c = fxs.d;
        this.a = fxp.a(fxs, fragment, this.b.b(), fxs.h, fxh);
        int i = fxs.c;
        if (i == 0) {
            LinearLayout d2 = d(context);
            a(d2, fxs, context);
            this.b.b(d2);
            this.d = new fxw() {
                public final void a(CharSequence charSequence) {
                    fyi.this.b.a(charSequence);
                    fyi.this.a.a(String.valueOf(charSequence));
                }
            };
        } else if (i == 1) {
            LinearLayout d3 = d(context);
            final TextView a2 = fzz.a(context);
            a2.setId(16908308);
            uuu.b(context, a2, R.attr.pasteTextAppearanceMetadata);
            d3.addView(a2, new LayoutParams(-2, -2));
            a(d3, fxs, context);
            this.d = new fxy() {
                public final TextView a() {
                    return a2;
                }

                public final void a(CharSequence charSequence) {
                    fyi.this.b.a(charSequence);
                    fyi.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a2.setText(charSequence);
                }
            };
            this.b.b(d3);
        } else if (i == 2) {
            LinearLayout d4 = d(context);
            final TextView a3 = fzz.a(context);
            a3.setId(R.id.metadata);
            uuu.b(context, a3, R.attr.pasteTextAppearance);
            final TextView a4 = fzz.a(context);
            a4.setId(16908308);
            uuu.b(context, a4, R.attr.pasteTextAppearanceMetadata);
            if (fxs.p) {
                a4.setPadding(0, uts.a(10.0f, context.getResources()), 0, uts.a(10.0f, context.getResources()));
                d4.addView(a3, new LayoutParams(-2, -2));
                d4.addView(a4, new LayoutParams(-2, -2));
            } else {
                d4.addView(a4, new LayoutParams(-2, -2));
                d4.addView(a3, new LayoutParams(-2, -2));
            }
            a(d4, fxs, context);
            this.d = new fya() {
                public final TextView b() {
                    return a3;
                }

                public final void c(CharSequence charSequence) {
                    a3.setText(charSequence);
                }

                public final TextView a() {
                    return a4;
                }

                public final void a(CharSequence charSequence) {
                    fyi.this.b.a(charSequence);
                    fyi.this.a.a(String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a4.setText(charSequence);
                }
            };
            this.b.b(d4);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        if (fxs.g != null) {
            this.b.a((sa) new fyd(fxs.g));
        }
    }

    private static LinearLayout d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private void a(ViewGroup viewGroup, fxs fxs, Context context) {
        if (this.c != null) {
            int i = 0;
            boolean z = fxs.e == 0;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int a2 = uts.a((float) fxs.f, context.getResources());
            if (z) {
                layoutParams.bottomMargin = a2;
            } else {
                layoutParams.topMargin = a2;
            }
            Button button = this.c;
            if (!z) {
                i = viewGroup.getChildCount();
            }
            viewGroup.addView(button, i, layoutParams);
        }
    }

    public final T a() {
        return this.d;
    }

    public final View b() {
        return this.a.d();
    }

    public final ImageView c() {
        return this.b.a();
    }

    public final ImageView d() {
        return this.a.b().c();
    }

    public final StickyListView e() {
        return this.a.a();
    }

    public final void a(boolean z) {
        this.a.b(z);
    }

    public final void b(boolean z) {
        this.a.c(z);
    }

    public final void a(int i) {
        this.a.a(0);
    }

    public final void a(View view) {
        this.b.a(view);
    }

    public final void b(View view) {
        this.a.a(view);
    }

    public final void b(int i) {
        this.a.b().a(i);
    }
}
