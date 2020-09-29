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

/* renamed from: rpp reason: default package */
public abstract class rpp implements rnx<FrameLayout> {

    /* renamed from: rpp$a */
    public static final class a extends rpp {
        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            return rpp.super.a(viewGroup, gwm);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            gat.a();
            return (Button) gat.a((Context) fbp.a(context), Button.class, null, R.attr.solarButtonSecondary);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            rpp.super.a((FrameLayout) view, hcm, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            rpp.super.a((FrameLayout) view, hcm, gwm);
        }

        public final int b() {
            return R.id.free_tier_secondary_button;
        }
    }

    /* renamed from: rpp$b */
    public static final class b extends rpp {
        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            return rpp.super.a(viewGroup, gwm);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            gat.a();
            return (Button) gat.a((Context) fbp.a(context), Button.class, null, R.attr.solarButtonTertiary);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            rpp.super.a((FrameLayout) view, hcm, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            rpp.super.a((FrameLayout) view, hcm, gwm);
        }

        public final int b() {
            return R.id.free_tier_tertiary_button;
        }
    }

    /* renamed from: rpp$c */
    public static final class c extends rpp {
        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            gat.a();
            return defpackage.gat.a.c((Context) fbp.a(context));
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            rpp.super.a((FrameLayout) view, hcm, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            rpp.super.a((FrameLayout) view, hcm, gwm);
        }

        public final int b() {
            return R.id.free_tier_tertiary_outlined_button;
        }

        /* renamed from: b */
        public final FrameLayout a(ViewGroup viewGroup, gwm gwm) {
            FrameLayout b = rpp.super.a(viewGroup, gwm);
            b.setPadding(0, 0, 0, viewGroup.getResources().getDimensionPixelSize(R.dimen.tertiary_button_bottom_padding));
            return b;
        }
    }

    /* renamed from: rpp$d */
    public static final class d extends rpp {
        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            return rpp.super.a(viewGroup, gwm);
        }

        /* access modifiers changed from: protected */
        public final Button a(Context context) {
            gat.a();
            return defpackage.gat.a.b((Context) fbp.a(context));
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            rpp.super.a((FrameLayout) view, hcm, aVar);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            rpp.super.a((FrameLayout) view, hcm, gwm);
        }

        public final int b() {
            return R.id.free_tier_white_primary_button;
        }
    }

    private static Button a(FrameLayout frameLayout) {
        return (Button) frameLayout.getChildAt(0);
    }

    /* access modifiers changed from: protected */
    public abstract Button a(Context context);

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
        a((FrameLayout) view, hcm, aVar);
    }

    public /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        a((FrameLayout) view, hcm, gwm);
    }

    public final void a(FrameLayout frameLayout, hcm hcm, defpackage.gwi.a<View> aVar) {
        hdj.a((View) a(frameLayout), hcm, aVar);
    }

    public final void a(FrameLayout frameLayout, hcm hcm, gwm gwm) {
        Button a2 = a(frameLayout);
        a2.setText(hcm.text().title());
        gwj.a(gwm, (View) a2, hcm);
    }

    /* renamed from: b */
    public FrameLayout a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        Button a2 = a(context);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams b2 = gas.b(context, viewGroup);
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
}
