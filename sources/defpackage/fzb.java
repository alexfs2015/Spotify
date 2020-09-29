package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.music.R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import defpackage.fyv;

/* renamed from: fzb reason: default package */
public final class fzb<T extends fyv> extends fyk<T> {
    final GlueHeaderLayout a;
    final fsy b;
    private final Button c;
    private final GlueHeaderView d;
    private T e;
    private final RecyclerView f;

    public fzb(Context context, fym fym) {
        this.d = GlueHeaderView.d().a(context);
        this.b = ftc.a(context, this.d);
        this.d.a(this.b);
        int i = fym.c;
        if (i == 0) {
            final fvz a2 = fvy.a(this.d);
            fxf.a(this.d, a2);
            this.e = new fyq() {
                public final void a(CharSequence charSequence) {
                    a2.a(charSequence);
                    fzb.this.a.a(charSequence);
                    fzb.this.b.a((CharSequence) String.valueOf(charSequence));
                }
            };
        } else if (i == 1) {
            final fwl b2 = fvy.b(this.d);
            fxf.a(this.d, b2);
            this.e = new fys() {
                public final TextView a() {
                    return b2.a();
                }

                public final void a(CharSequence charSequence) {
                    b2.a(charSequence);
                    fzb.this.a.a(charSequence);
                    fzb.this.b.a((CharSequence) String.valueOf(charSequence));
                }

                public final void b(CharSequence charSequence) {
                    b2.b(charSequence);
                }
            };
        } else if (i == 2) {
            final fwm c2 = fvy.c(this.d);
            fxf.a(this.d, c2);
            this.e = new fyu() {
                public final TextView a() {
                    return c2.a();
                }

                public final void a(CharSequence charSequence) {
                    c2.a(charSequence);
                    fzb.this.a.a(charSequence);
                    fzb.this.b.a((CharSequence) String.valueOf(charSequence));
                }

                public final TextView b() {
                    throw new UnsupportedOperationException("You should not do anything to this field.");
                }

                public final void b(CharSequence charSequence) {
                    c2.b(charSequence);
                }

                public final void c(CharSequence charSequence) {
                    c2.c(charSequence);
                }
            };
        } else if (i == 3) {
            final fwj d2 = fvy.d(this.d);
            fxf.a(this.d, d2);
            this.e = new fyo() {
            };
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        this.a = (GlueHeaderLayout) LayoutInflater.from(context).inflate(R.layout.glue_header_layout, null);
        this.a.d(fym.h);
        this.a.setId(R.id.glue_header_layout);
        this.f = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        this.f.a((i) new LinearLayoutManager(context));
        this.f.setId(R.id.glue_header_layout_recycler);
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.a.findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.a(this.f);
        this.f.setVerticalScrollBarEnabled(true ^ fym.q);
        recyclerViewFastScroller.setEnabled(fym.q);
        this.c = fym.d;
        if (this.c != null) {
            this.b.a(ToolbarSide.END, this.c, R.id.glue_header_toolbar_button);
        }
        this.d.setId(R.id.glue_header_layout_header);
        this.a.a(this.d, (HeaderBehavior<T>) new GlueHeaderBehavior<T>());
    }

    public final T a() {
        return this.e;
    }

    public final void a(int i) {
    }

    public final void a(View view) {
    }

    public final void a(e eVar) {
    }

    public final void a(fzn fzn, Context context) {
        Button button = this.c;
        if (button != null) {
            button.setAlpha(0.0f);
            vgl.a((View) this.c, (int) R.attr.selectableItemBackgroundBorderless);
            fzo a2 = fzn.a(R.id.glue_header_toolbar_button, this.c.getText());
            FrameLayout frameLayout = new FrameLayout(context);
            if (this.c.getParent() != null) {
                ((ViewGroup) this.c.getParent()).removeAllViews();
            }
            frameLayout.setLayoutParams(new LayoutParams(-2, -2));
            frameLayout.addView(this.c);
            a2.a((View) frameLayout);
        }
    }

    public final void a(boolean z) {
        this.a.d(z);
    }

    public final View b() {
        return this.a;
    }

    public final void b(int i) {
        this.d.b(i);
    }

    public final void b(View view) {
        this.a.d(view);
    }

    public final void b(boolean z) {
        this.a.c(z);
    }

    public final ImageView c() {
        return this.d.c();
    }

    public final ImageView d() {
        return this.d.c();
    }

    public final StickyListView e() {
        throw new UnsupportedOperationException();
    }

    public final RecyclerView f() {
        return this.f;
    }

    public final void h() {
    }
}
