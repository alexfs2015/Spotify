package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground.VisualStyle;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView.a;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.music.R;
import com.spotify.termsandconditions.TermsAndConditionsView;
import com.squareup.picasso.Picasso;

/* renamed from: lpp reason: default package */
public class lpp extends jrd implements b {
    public lqb T;
    private Button U;
    private Button V;
    private View W;
    private GlueHeaderView X;
    private fvz Y;
    private PrettyHeaderView Z;
    public a a;
    private ProgressBar aa;
    private TermsAndConditionsView ab;
    public Picasso b;

    public static Bundle a(lqb lqb) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_FACEBOOK_USER", lqb);
        return bundle;
    }

    public static lpp a(Bundle bundle) {
        lpp lpp = new lpp();
        lpp.g(bundle);
        return lpp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.b();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (View) fbp.a(layoutInflater.inflate(R.layout.fragment_create_account, viewGroup, false));
        this.U = (Button) fbp.a(view.findViewById(R.id.create_account_button));
        this.U.setOnClickListener(new $$Lambda$lpp$EiB9A5zLmX899TnJWVlinWkHMqU(this));
        this.V = (Button) fbp.a(view.findViewById(R.id.confirmation_cancel_button));
        this.V.setOnClickListener(new $$Lambda$lpp$t8oBMUMbSDnE9WI8eSMqaULNP8(this));
        this.W = view.findViewById(R.id.signup_terms_placeholder);
        this.aa = (ProgressBar) view.findViewById(R.id.progress_spinner);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.create_account_container);
        a d = GlueHeaderView.d();
        d.b = VisualStyle.IMAGE_AND_COLOR;
        d.a = R.attr.glueHeaderStyleExtraReduced;
        this.X = d.a(p());
        this.Y = fvy.a(this.X);
        fxf.a(this.X, this.Y);
        this.Z = new PrettyHeaderView((Context) p(), (View) this.X);
        linearLayout.addView(this.Z, 0);
        this.ab = (TermsAndConditionsView) view.findViewById(R.id.signup_terms);
        return view;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.Z.c().setColorFilter(qxr.b(view.getContext(), this.T.c()));
        this.X.b(qxr.a(view.getContext(), this.T.c()));
        this.Y.a(this.T.c());
    }

    public final void a(SpotifyError spotifyError) {
        Toast.makeText(p(), spotifyError.mResourceId, 1).show();
    }

    public final void a(String str) {
        this.b.a(str).d().b().a(this.Z.c());
    }

    public final void a(boolean z) {
        this.U.setEnabled(z);
    }

    public final void aP_() {
        super.aP_();
        this.a.a(this);
    }

    public final void b(boolean z) {
        this.V.setEnabled(z);
    }

    public final void b_(boolean z) {
        this.aa.setVisibility(z ? 0 : 4);
    }

    public final void d(boolean z) {
        if (z) {
            this.ab.d();
        }
        this.ab.a(this.W);
    }
}
