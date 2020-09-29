package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.legacy.ui.PremiumOffersHeaderBackground;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: phe reason: default package */
public class phe extends jor implements c, d, NavigationItem, jol, pgj, spl {
    public pgr T;
    public fpt U;
    public shy V;
    public pgk W;
    public sih X;
    public gjf Y;
    private GlueHeaderLayout Z;
    public pgt a;
    private phf aa;
    private GlueHeaderView ab;
    public phc b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "premium-offers";
    }

    public static jol a(fpt fpt) {
        phe phe = new phe();
        fpu.a((Fragment) phe, fpt);
        return phe;
    }

    public final void z() {
        super.z();
        this.V.a();
        h_(R.string.premium_offers_header);
        a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.premium_offers_fragment, viewGroup, false);
        this.Z = (GlueHeaderLayout) inflate.findViewById(R.id.glue_header_layout);
        this.ab = (GlueHeaderView) inflate.findViewById(R.id.header_view);
        GlueHeaderView glueHeaderView = this.ab;
        PremiumOffersHeaderBackground premiumOffersHeaderBackground = new PremiumOffersHeaderBackground(viewGroup.getContext());
        fay.a(premiumOffersHeaderBackground);
        glueHeaderView.removeView(glueHeaderView.a.d.a());
        glueHeaderView.addView(premiumOffersHeaderBackground.a(), 0);
        glueHeaderView.a.d = premiumOffersHeaderBackground;
        this.ab.c().setImageResource(R.drawable.bg_premium_destination_gradient);
        this.aa = new phf(layoutInflater, viewGroup);
        fwl.a(this.ab, this.aa);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(inflate.getContext()));
        uwh uwh = new uwh();
        if (this.T.d(this.U)) {
            uwh.a((a<H>) this.b, 100);
            recyclerView.a((h) new phg(), -1);
            uwh.a((a<H>) this.a, 101);
        } else if (this.T.c(this.U)) {
            uwh.a((a<H>) this.a, 101);
            uwh.a((a<H>) this.b, 100);
        } else if (this.T.b(this.U)) {
            uwh.a((a<H>) this.b, 100);
        }
        recyclerView.a((a) uwh);
        return inflate;
    }

    public final void A() {
        super.A();
        this.V.b();
    }

    public final void h_(int i) {
        this.aa.a(a(i));
    }

    public final void a() {
        this.aa.a.setVisibility(8);
    }

    public final udr ag() {
        return udt.aG;
    }

    public final rdh af() {
        return rdh.a(this.Y, this.X.toString());
    }

    public final boolean ak() {
        this.Z.d(true);
        return true;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.PREMIUM;
    }
}
