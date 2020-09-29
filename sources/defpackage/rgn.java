package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rgn reason: default package */
public abstract class rgn implements rev<FrameLayout> {

    /* renamed from: rgn$a */
    public static final class a extends rgn {
        public final int b() {
            return R.id.free_tier_secondary_button;
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            return rgn.super.a(viewGroup, gum);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            rgn.super.a((FrameLayout) view, gzt, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
            rgn.super.a((FrameLayout) view, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            fzz.a();
            return (Button) fzz.a((Context) fay.a(context), Button.class, null, R.attr.solarButtonSecondary);
        }
    }

    /* renamed from: rgn$b */
    public static final class b extends rgn {
        public final int b() {
            return R.id.free_tier_tertiary_button;
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            return rgn.super.a(viewGroup, gum);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            rgn.super.a((FrameLayout) view, gzt, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
            rgn.super.a((FrameLayout) view, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            fzz.a();
            return (Button) fzz.a((Context) fay.a(context), Button.class, null, R.attr.solarButtonTertiary);
        }
    }

    /* renamed from: rgn$c */
    public static final class c extends rgn {
        public final int b() {
            return R.id.free_tier_tertiary_outlined_button;
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            rgn.super.a((FrameLayout) view, gzt, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
            rgn.super.a((FrameLayout) view, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            fzz.a();
            return defpackage.fzz.a.c((Context) fay.a(context));
        }

        /* renamed from: b */
        public final FrameLayout a(ViewGroup viewGroup, gum gum) {
            FrameLayout b = rgn.super.a(viewGroup, gum);
            b.setPadding(0, 0, 0, viewGroup.getResources().getDimensionPixelSize(R.dimen.tertiary_button_bottom_padding));
            return b;
        }
    }

    /* renamed from: rgn$d */
    public static final class d extends rgn {
        public final int b() {
            return R.id.free_tier_white_primary_button;
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            return rgn.super.a(viewGroup, gum);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            rgn.super.a((FrameLayout) view, gzt, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
            rgn.super.a((FrameLayout) view, gzt, gum);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            fzz.a();
            return defpackage.fzz.a.b((Context) fay.a(context));
        }
    }

    /* access modifiers changed from: protected */
    public abstract Button a(Context context);

    public /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
        a((FrameLayout) view, gzt, aVar);
    }

    public /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
        a((FrameLayout) view, gzt, gum);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    /* renamed from: b */
    public FrameLayout a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        Button a2 = a(context);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams b2 = fzy.b(context, viewGroup);
        if (b2 != null) {
            frameLayout.setLayoutParams(b2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        a2.setLayoutParams(layoutParams);
        a2.setText("");
        frameLayout.addView(a2);
        return frameLayout;
    }

    public final void a(FrameLayout frameLayout, gzt gzt, gum gum) {
        Button a2 = a(frameLayout);
        a2.setText(gzt.text().title());
        guj.a(gum, (View) a2, gzt);
    }

    private static Button a(FrameLayout frameLayout) {
        return (Button) frameLayout.getChildAt(0);
    }

    public final void a(FrameLayout frameLayout, gzt gzt, defpackage.gui.a<View> aVar) {
        haq.a((View) a(frameLayout), gzt, aVar);
    }
}
