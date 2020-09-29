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

/* renamed from: hby reason: default package */
final class hby {
    private final gxd a;
    private gxh<?> b;
    private gxh<?> c;
    private LinearLayout d;

    hby(gwm gwm) {
        this.a = new gxd(gwm);
    }

    private View a(ViewGroup viewGroup, hcm hcm, hcm hcm2) {
        this.b = a(this.b, viewGroup, hcm, hcm2);
        return this.b.b;
    }

    private static LayoutParams a(int i, int i2) {
        LayoutParams layoutParams = new LayoutParams(0, -1, 1.0f);
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i2;
        return layoutParams;
    }

    private gxh<?> a(gxh<?> gxh, ViewGroup viewGroup, hcm hcm, hcm hcm2) {
        gxh<?> a2 = this.a.a(gxh, hcm2, viewGroup, hcm.children().indexOf(hcm2));
        if (a2.b.getParent() != viewGroup) {
            gaw.d(a2.b);
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

    private static void a(ViewGroup viewGroup, View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != view) {
            if (childAt != null) {
                viewGroup.removeView(childAt);
            }
            viewGroup.addView(view, i, layoutParams);
        }
    }

    private void b() {
        gxh<?> gxh = this.c;
        if (gxh != null) {
            this.a.a(gxh);
            this.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final View a(hcm hcm, ViewGroup viewGroup) {
        List childGroup = hcm != null ? hcm.childGroup("primary_buttons") : Collections.emptyList();
        if (hcm == null || childGroup.isEmpty()) {
            a();
            gxh<?> gxh = this.b;
            if (gxh != null) {
                this.a.a(gxh);
                this.b = null;
            }
            b();
            return null;
        } else if (childGroup.size() == 1) {
            a();
            b();
            return a(viewGroup, hcm, (hcm) childGroup.get(0));
        } else {
            Context context = viewGroup.getContext();
            hcm hcm2 = (hcm) childGroup.get(0);
            hcm hcm3 = (hcm) childGroup.get(1);
            LinearLayout linearLayout = this.d;
            if (linearLayout == null) {
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new LayoutParams(-1, -2));
                this.d = linearLayout;
            }
            int b2 = vfj.b(8.0f, context.getResources());
            int i = b2 << 1;
            a((ViewGroup) linearLayout, a((ViewGroup) linearLayout, hcm, hcm2), 0, (ViewGroup.LayoutParams) a(i, b2));
            this.c = a(this.c, (ViewGroup) linearLayout, hcm, hcm3);
            a((ViewGroup) linearLayout, (View) this.c.b, 1, (ViewGroup.LayoutParams) a(b2, i));
            return linearLayout;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(fzn fzn, hcm hcm, ViewGroup viewGroup) {
        View a2 = a(hcm, viewGroup);
        if (a2 != null) {
            gaw.d(a2);
            FrameLayout frameLayout = new FrameLayout(fzn.a());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = a2.getResources().getDimensionPixelSize(R.dimen.actionbar_play_button_container_padding);
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            a2.setLayoutParams(layoutParams);
            frameLayout.addView(a2);
            fzo a3 = fzn.a(R.id.actionbar_item_shuffle_play, "").a((View) frameLayout);
            frameLayout.getClass();
            a3.a((Runnable) new $$Lambda$GnwP2FQTZ9m3UY7Z4I0qkzlUfis(frameLayout));
        }
    }
}
