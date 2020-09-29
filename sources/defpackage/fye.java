package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.LegacyHeaderBehavior;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import defpackage.fyb;

/* renamed from: fye reason: default package */
public final class fye<T extends fyb> extends fxq<T> {
    final PrettyHeaderView a;
    final GlueHeaderLayout b;
    final uvx c;
    private final RecyclerView d;
    private T e;

    public final void a(int i) {
    }

    public final void a(e eVar) {
    }

    public final void a(fyt fyt, Context context) {
    }

    public final void h() {
    }

    public fye(fxs fxs, Context context, Fragment fragment, uvx uvx, fxn fxn) {
        this.c = (uvx) fay.a(uvx);
        this.a = new PrettyHeaderView(context, this.c.b());
        this.a.setId(R.id.glue_header_layout_header);
        this.a.b(uuu.c(context, 16843499) + gaa.a(((Context) fay.a(fragment.p())).getResources()));
        this.b = (GlueHeaderLayout) LayoutInflater.from(context).inflate(R.layout.glue_header_layout, null);
        this.b.d(fxs.h);
        int i = 0;
        this.b.d = fxs.a == 1;
        this.b.setId(R.id.glue_header_layout);
        this.d = (RecyclerView) this.b.findViewById(R.id.recycler_view);
        this.d.a((i) new LinearLayoutManager(context));
        this.d.setId(R.id.glue_header_layout_recycler);
        this.b.a(this.a, new LegacyHeaderBehavior(), true);
        this.b.e = fxn;
        int i2 = fxs.c;
        if (i2 == 0) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            if (fxs.d != null) {
                if (fxs.e == 0) {
                    i = 1;
                }
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                int a2 = uts.a(8.0f, context.getResources());
                if (i != 0) {
                    layoutParams.bottomMargin = a2;
                } else {
                    layoutParams.topMargin = a2;
                }
                linearLayout.addView(fxs.d, i ^ 1, layoutParams);
            }
            this.c.b(linearLayout);
            this.e = new fxw() {
                public final void a(CharSequence charSequence) {
                    fye.this.c.a(charSequence);
                    fye.this.b.a(charSequence);
                    fye.this.a.a((CharSequence) String.valueOf(charSequence));
                }
            };
        } else if (i2 == 1) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(17);
            final TextView a3 = fzz.a(context);
            a3.setId(16908308);
            uuu.b(context, a3, R.attr.pasteTextAppearanceMetadata);
            linearLayout2.addView(a3, new LayoutParams(-2, -2));
            if (fxs.d != null) {
                if (fxs.e == 0) {
                    i = 1;
                }
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                int a4 = uts.a(8.0f, context.getResources());
                if (i != 0) {
                    layoutParams2.bottomMargin = a4;
                } else {
                    layoutParams2.topMargin = a4;
                }
                linearLayout2.addView(fxs.d, i ^ 1, layoutParams2);
            }
            this.e = new fxy() {
                public final TextView a() {
                    return a3;
                }

                public final void a(CharSequence charSequence) {
                    fye.this.c.a(charSequence);
                    fye.this.b.a(charSequence);
                    fye.this.a.a((CharSequence) String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    a3.setText(charSequence);
                }
            };
            this.c.b(linearLayout2);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        if (fxs.g != null) {
            this.c.a((sa) new fyd(fxs.g));
        }
    }

    public final RecyclerView f() {
        return this.d;
    }

    public final T a() {
        return this.e;
    }

    public final View b() {
        return this.b;
    }

    public final ImageView c() {
        return this.c.a();
    }

    public final ImageView d() {
        return this.a.c();
    }

    public final StickyListView e() {
        throw new UnsupportedOperationException("getStickyListView is not supported when useRecyclerView was set to true. Use getRecyclerView instead.");
    }

    public final void a(boolean z) {
        this.b.d(z);
    }

    public final void b(boolean z) {
        this.b.c(z);
    }

    public final void a(View view) {
        this.c.a(view);
    }

    public final void b(View view) {
        this.b.d(view);
    }

    public final void b(int i) {
        this.a.a(i);
    }
}
