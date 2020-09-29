package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: kje reason: default package */
public class kje extends kif {
    public Picasso U;
    private TextView V;
    private TextView X;
    private TextView Y;
    private ConstraintLayout Z;
    private TextView aa;
    private TextView ab;
    private ImageView ac;
    private ImageView ad;
    private ImageView ae;
    private View af;
    private final AnimatorSet ag = new AnimatorSet();
    private View ah;

    public static kje a(d dVar) {
        Bundle a = a((kfp) dVar);
        kje kje = new kje();
        kje.g(a);
        a.putParcelable("GLOBAL_CITIZEN", dVar.a);
        return kje;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kjo kjo) {
        List a = kjo.a();
        kjk kjk = (kjk) fbp.a(a.get(0));
        b(kjk.d());
        this.aa.setText(kjk.c());
        this.ab.setText(kjk.a());
        this.U.a(kjk.b()).a(this.ae);
        this.U.a(kjk.b()).a(this.ad);
        this.U.a(kjk.b()).a(this.ac);
        int dimension = (int) o().getResources().getDimension(R.dimen.global_citizen_earth_final_size_side_length);
        this.ag.setStartDelay(4500);
        AnimatorSet animatorSet = this.ag;
        View view = this.af;
        View view2 = this.ah;
        ConstraintLayout constraintLayout = this.Z;
        et etVar = new et();
        etVar.a(this.Z.getContext(), (int) R.layout.story_global_citizen_fragment_country_detail);
        animatorSet.playSequentially(new Animator[]{kjc.a(view, view2, constraintLayout, etVar, dimension), ValueAnimator.ofInt(new int[]{0, 1}).setDuration(6000), kjc.a(this.U, (gcp<String>) new $$Lambda$UsYjUK_k0qvIFFi0c0z5dT8eVyw<String>(this), this.aa, this.ab, a.subList(1, a.size()), (List<ImageView>) ImmutableList.a(this.ae, this.ad, this.ac))});
        b((Animator) this.ag);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z = (ConstraintLayout) layoutInflater.inflate(R.layout.story_global_citizen_fragment_intro, viewGroup, false);
        this.V = (TextView) ip.d((View) this.Z, (int) R.id.global_citizen_title);
        this.X = (TextView) ip.d((View) this.Z, (int) R.id.global_citizen_caption);
        this.Y = (TextView) ip.d((View) this.Z, (int) R.id.global_citizen_stats);
        this.aa = (TextView) ip.d((View) this.Z, (int) R.id.global_citizen_artist_name);
        this.ab = (TextView) ip.d((View) this.Z, (int) R.id.global_citizen_country_name);
        this.ae = (ImageView) ip.d((View) this.Z, (int) R.id.global_citizen_image_1);
        this.ad = (ImageView) ip.d((View) this.Z, (int) R.id.global_citizen_image_2);
        this.ac = (ImageView) ip.d((View) this.Z, (int) R.id.global_citizen_image_3);
        this.af = ip.d((View) this.Z, (int) R.id.global_citizen_earth);
        this.ah = ip.d((View) this.Z, (int) R.id.global_citizen_earth_bottom_guide);
        return this.Z;
    }

    public final void aP_() {
        super.aP_();
        kjo kjo = (kjo) fbp.a(l().getParcelable("GLOBAL_CITIZEN"));
        this.V.setText(kjo.c());
        this.X.setText(kjo.b());
        TextView textView = this.Y;
        Context o = o();
        kjp d = kjo.d();
        textView.setText(StoryParagraphDecorator.a(d.a().text(), d.a().valuesArray(), fr.c(o, R.color.wrapped_citric)));
        this.Z.post(new $$Lambda$kje$gxqRQd0UxWcpWPi3tmINvFqn2TA(this, kjo));
    }
}
