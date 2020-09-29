package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* renamed from: gzf reason: default package */
final class gzf {
    private final gvd a;
    private gvh<?> b;
    private gvh<?> c;
    private LinearLayout d;

    gzf(gum gum) {
        this.a = new gvd(gum);
    }

    /* access modifiers changed from: 0000 */
    public final View a(gzt gzt, ViewGroup viewGroup) {
        List list;
        if (gzt != null) {
            list = gzt.childGroup("primary_buttons");
        } else {
            list = Collections.emptyList();
        }
        if (gzt == null || list.isEmpty()) {
            a();
            gvh<?> gvh = this.b;
            if (gvh != null) {
                this.a.a(gvh);
                this.b = null;
            }
            b();
            return null;
        } else if (list.size() == 1) {
            a();
            b();
            return a(viewGroup, gzt, (gzt) list.get(0));
        } else {
            Context context = viewGroup.getContext();
            gzt gzt2 = (gzt) list.get(0);
            gzt gzt3 = (gzt) list.get(1);
            LinearLayout linearLayout = this.d;
            if (linearLayout == null) {
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new LayoutParams(-1, -2));
                this.d = linearLayout;
            }
            int b2 = uts.b(8.0f, context.getResources());
            int i = b2 << 1;
            a((ViewGroup) linearLayout, a((ViewGroup) linearLayout, gzt, gzt2), 0, (ViewGroup.LayoutParams) a(i, b2));
            this.c = a(this.c, (ViewGroup) linearLayout, gzt, gzt3);
            a((ViewGroup) linearLayout, (View) this.c.b, 1, (ViewGroup.LayoutParams) a(b2, i));
            return linearLayout;
        }
    }

    private static void a(ViewGroup viewGroup, View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != view) {
            if (childAt != null) {
                viewGroup.removeView(childAt);
            }
            viewGroup.addView(view, i, layoutParams);
        }
    }

    private View a(ViewGroup viewGroup, gzt gzt, gzt gzt2) {
        this.b = a(this.b, viewGroup, gzt, gzt2);
        return this.b.b;
    }

    private gvh<?> a(gvh<?> gvh, ViewGroup viewGroup, gzt gzt, gzt gzt2) {
        gvh<?> a2 = this.a.a(gvh, gzt2, viewGroup, gzt.children().indexOf(gzt2));
        if (a2.b.getParent() != viewGroup) {
            gac.d(a2.b);
        }
        return a2;
    }

    private void a() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.d = null;
        }
    }

    private void b() {
        gvh<?> gvh = this.c;
        if (gvh != null) {
            this.a.a(gvh);
            this.c = null;
        }
    }

    private static LayoutParams a(int i, int i2) {
        LayoutParams layoutParams = new LayoutParams(0, -1, 1.0f);
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i2;
        return layoutParams;
    }

    /* access modifiers changed from: 0000 */
    public final void a(fyt fyt, gzt gzt, ViewGroup viewGroup) {
        View a2 = a(gzt, viewGroup);
        if (a2 != null) {
            gac.d(a2);
            FrameLayout frameLayout = new FrameLayout(fyt.a());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = a2.getResources().getDimensionPixelSize(R.dimen.actionbar_play_button_container_padding);
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            a2.setLayoutParams(layoutParams);
            frameLayout.addView(a2);
            fyu a3 = fyt.a(R.id.actionbar_item_shuffle_play, "").a((View) frameLayout);
            frameLayout.getClass();
            a3.a((Runnable) new $$Lambda$GnwP2FQTZ9m3UY7Z4I0qkzlUfis(frameLayout));
        }
    }
}
