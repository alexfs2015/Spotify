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

/* renamed from: llp reason: default package */
public class llp extends jor implements b {
    public lmb T;
    private Button U;
    private Button V;
    private View W;
    private GlueHeaderView X;
    private fvf Y;
    private PrettyHeaderView Z;
    public a a;
    private ProgressBar aa;
    private TermsAndConditionsView ab;
    public Picasso b;

    public static llp a(Bundle bundle) {
        llp llp = new llp();
        llp.g(bundle);
        return llp;
    }

    public static Bundle a(lmb lmb) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_FACEBOOK_USER", lmb);
        return bundle;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (View) fay.a(layoutInflater.inflate(R.layout.fragment_create_account, viewGroup, false));
        this.U = (Button) fay.a(view.findViewById(R.id.create_account_button));
        this.U.setOnClickListener(new $$Lambda$llp$EYld3eANVbLPPgjDHQDE2Mj1UAk(this));
        this.V = (Button) fay.a(view.findViewById(R.id.confirmation_cancel_button));
        this.V.setOnClickListener(new $$Lambda$llp$tJvCJHcsKZEY3wQDmjx021WmqOc(this));
        this.W = view.findViewById(R.id.signup_terms_placeholder);
        this.aa = (ProgressBar) view.findViewById(R.id.progress_spinner);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.create_account_container);
        a d = GlueHeaderView.d();
        d.b = VisualStyle.IMAGE_AND_COLOR;
        d.a = R.attr.glueHeaderStyleExtraReduced;
        this.X = d.a(p());
        this.Y = fve.a(this.X);
        fwl.a(this.X, this.Y);
        this.Z = new PrettyHeaderView((Context) p(), (View) this.X);
        linearLayout.addView(this.Z, 0);
        this.ab = (TermsAndConditionsView) view.findViewById(R.id.signup_terms);
        return view;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.c();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.Z.c().setColorFilter(qpi.b(view.getContext(), this.T.c()));
        this.X.b(qpi.a(view.getContext(), this.T.c()));
        this.Y.a(this.T.c());
    }

    public final void g() {
        super.g();
        this.a.a(this);
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
