package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground.VisualStyle;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import defpackage.fyv;

/* renamed from: fyz reason: default package */
public final class fyz<T extends fyv> extends fyk<T> {
    final GlueHeaderLayout a;
    final fsy b;
    private final Button c;
    private final RecyclerView d;
    private final GlueHeaderView e;
    private T f;
    private final ImageView g;
    private final boolean h;
    private final Context i;
    private final fym j;
    private fvx k;

    public fyz(Context context, fym fym, fyh fyh) {
        Context context2 = context;
        fyh fyh2 = fyh;
        this.j = fym;
        this.i = context2;
        this.h = this.j.a == 2;
        String str = "not supported";
        if (!this.h) {
            a d2 = GlueHeaderView.d();
            d2.b = VisualStyle.COLOR_ONLY;
            this.e = d2.a(this.i);
            int i2 = this.j.c;
            if (i2 == 0) {
                final fwb e2 = fvy.e(this.e);
                fxf.a(this.e, e2);
                this.k = e2;
                this.f = new fyq() {
                    public final void a(CharSequence charSequence) {
                        e2.a(charSequence);
                        fyz.this.a.a(charSequence);
                        fyz.this.b.a((CharSequence) String.valueOf(charSequence));
                    }
                };
            } else if (i2 == 1) {
                final fwf f2 = fvy.f(this.e);
                fxf.a(this.e, f2);
                this.k = f2;
                final ImageView imageView = new ImageView(this.e.getContext());
                final ImageView imageView2 = new ImageView(this.e.getContext());
                final ImageView imageView3 = new ImageView(this.e.getContext());
                int dimensionPixelOffset = this.i.getResources().getDimensionPixelOffset(R.dimen.header_drawables_margin);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                layoutParams2.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                if (this.j.k.booleanValue()) {
                    this.e.addView(imageView, layoutParams);
                    this.e.addView(imageView2, layoutParams2);
                } else {
                    LinearLayout linearLayout = new LinearLayout(this.e.getContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(1);
                    linearLayout.addView(imageView, layoutParams);
                    linearLayout.addView(imageView2, layoutParams2);
                    this.e.addView(linearLayout, new LayoutParams(-2, -2));
                }
                LayoutParams layoutParams3 = new LayoutParams(-2, -2);
                layoutParams3.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                this.e.addView(imageView3, layoutParams3);
                AnonymousClass2 r0 = new fyt() {
                    public final TextView a() {
                        return f2.e();
                    }

                    public final void a(CharSequence charSequence) {
                        f2.a(charSequence);
                        fyz.this.a.a(charSequence);
                        fyz.this.b.a((CharSequence) String.valueOf(charSequence));
                    }

                    public final void a(boolean z) {
                        imageView.setVisibility(8);
                        imageView2.setVisibility(8);
                        imageView3.setVisibility(8);
                    }

                    public final void b(CharSequence charSequence) {
                        f2.b(charSequence);
                    }
                };
                this.f = r0;
                ((fyt) this.f).a(false);
            } else if (i2 == 2) {
                final fwh g2 = fvy.g(this.e);
                this.k = g2;
                fxf.a(this.e, g2);
                this.f = new fyu() {
                    public final TextView a() {
                        return g2.e();
                    }

                    public final void a(CharSequence charSequence) {
                        g2.a(charSequence);
                        fyz.this.a.a(charSequence);
                        fyz.this.b.a((CharSequence) String.valueOf(charSequence));
                    }

                    public final TextView b() {
                        throw new UnsupportedOperationException("You should not do anything to this field.");
                    }

                    public final void b(CharSequence charSequence) {
                        g2.b(charSequence);
                    }

                    public final void c(CharSequence charSequence) {
                        g2.c(charSequence);
                    }
                };
            } else if (i2 == 3) {
                final fwj d3 = fvy.d(this.e);
                fxf.a(this.e, d3);
                this.f = new fyo() {
                };
            } else if (i2 == 4 || i2 == 5) {
                GlueHeaderView glueHeaderView = this.e;
                final fwe fwe = new fwe(LayoutInflater.from(glueHeaderView.e().getContext()).inflate(R.layout.glue_header_content_set_single_line_linear_layout, glueHeaderView.e(), false));
                fqz.a(fwe);
                this.k = fwe;
                fxf.a(this.e, fwe);
                this.f = new fyr() {
                    public final LinearLayout a() {
                        return fwe.e();
                    }

                    public final void a(CharSequence charSequence) {
                        fwe.a(charSequence);
                        fyz.this.a.a(charSequence);
                        fyz.this.b.a((CharSequence) String.valueOf(charSequence));
                    }
                };
            } else {
                throw new UnsupportedOperationException(str);
            }
            this.b = ftc.a(context2, this.e);
            this.e.a(this.b);
        } else {
            this.b = null;
            this.e = null;
            int i3 = this.j.c;
            if (i3 == 0) {
                this.f = fyn.a;
            } else if (i3 == 1) {
                this.f = fyn.b;
            } else if (i3 == 2) {
                this.f = fyn.c;
            } else if (i3 == 3) {
                this.f = fyn.d;
            } else if (i3 == 4 || i3 == 5) {
                this.f = fyn.e;
            } else {
                throw new UnsupportedOperationException(str);
            }
        }
        this.a = (GlueHeaderLayout) LayoutInflater.from(this.i).inflate(R.layout.glue_header_layout, null);
        this.a.setId(R.id.glue_header_layout);
        this.a.e = fyh2;
        fyh2.a("");
        fyh2.a(0.0f);
        this.d = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        this.d.a((i) new LinearLayoutManager(this.i));
        this.d.setId(R.id.glue_header_layout_recycler);
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.a.findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.a(this.d);
        this.d.setVerticalScrollBarEnabled(!this.j.q);
        recyclerViewFastScroller.setEnabled(this.j.q);
        this.c = this.j.d;
        if (!this.h) {
            this.a.d(this.j.h);
            if (this.c != null) {
                this.b.a(ToolbarSide.END, this.c, R.id.glue_header_toolbar_button);
            }
            this.e.setId(R.id.glue_header_layout_header);
            this.a.a(this.e, (HeaderBehavior<T>) new GlueHeaderBehavior<T>());
        } else {
            this.a.a(new GlueNoHeaderView(this.i), (HeaderBehavior<T>) new GlueNoHeaderBehavior<T>());
        }
        this.g = new ImageView(this.a.getContext());
        this.g.setVisibility(8);
    }

    public final T a() {
        return this.f;
    }

    public final void a(int i2) {
    }

    public final void a(View view) {
    }

    public final void a(e eVar) {
    }

    public final void a(fzn fzn, Context context) {
        Button button = this.c;
        if (button != null && !this.h && button != null) {
            button.setBackgroundColor(0);
            button.setTextColor(vgl.d(context, R.attr.glueRowTitleColor));
            button.setLayerType(2, null);
            button.setGravity(21);
            fzo a2 = fzn.a(R.id.glue_header_toolbar_button, button.getText());
            FrameLayout frameLayout = new FrameLayout(context);
            if (button.getParent() != null) {
                ((ViewGroup) button.getParent()).removeView(button);
            }
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
                ((FrameLayout.LayoutParams) layoutParams).setMargins(0, 0, (int) button.getResources().getDimension(R.dimen.appbar_button_margin), 0);
            }
            frameLayout.addView(button, layoutParams);
            a2.a((View) frameLayout);
        }
    }

    public final void a(boolean z) {
        this.a.d(z);
    }

    public final View b() {
        return this.a;
    }

    public final void b(int i2) {
        GlueHeaderView glueHeaderView = this.e;
        if (glueHeaderView != null) {
            glueHeaderView.b(i2);
        }
    }

    public final void b(View view) {
        this.a.d(view);
    }

    public final void b(boolean z) {
        this.a.c(z);
    }

    public final ImageView c() {
        fvx fvx = this.k;
        if (fvx == null) {
            return null;
        }
        return fvx.a();
    }

    public final ImageView d() {
        return this.g;
    }

    public final StickyListView e() {
        throw new UnsupportedOperationException();
    }

    public final RecyclerView f() {
        return this.d;
    }

    public final void h() {
    }
}
