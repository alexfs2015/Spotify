package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.podcastonboarding.logger.PodcastOnboardingLogger;
import com.squareup.picasso.Picasso;

/* renamed from: vnn reason: default package */
public class vnn extends jrd implements b, a, uqq, vnm {
    public PodcastOnboardingLogger T;
    public Picasso U;
    public boolean V;
    private a W;
    private b<vnu, vns> X;
    public vno a;
    public vms b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(TextView textView, TextView textView2, AppBarLayout appBarLayout, int i) {
        float abs = Math.abs(((float) i) / ((float) appBarLayout.b()));
        textView.setAlpha(1.0f - abs);
        textView2.setAlpha(abs);
    }

    public static vnn e() {
        return new vnn();
    }

    public final void A() {
        super.A();
        this.X.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.podcast_onboarding_topic_picker, viewGroup, false);
        ((q) p()).a((Toolbar) inflate.findViewById(R.id.toolbar));
        vol vol = new vol(inflate, this.b, this.T, this, this.U);
        vnu vnu = vnu.a;
        vnu a2 = vnu.e().c(this.V).a();
        vno vno = this.a;
        Context n = n();
        vno.a = jvw.a(n).e(Boolean.valueOf(jvw.c(n)));
        this.X = knc.a(vno.a((vok) vol), a2, knm.a());
        this.X.a(vol);
        return vol.a;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_skip, menu);
        super.a(menu, menuInflater);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ((AppBarLayout) view.findViewById(R.id.app_bar_layout)).a((b) new $$Lambda$vnn$qpKUAMFMPHgXRvFzN4r7HKrPjtY((TextView) view.findViewById(R.id.title), (TextView) view.findViewById(R.id.toolbar_title)));
    }

    public final void a(a aVar) {
        this.W = aVar;
    }

    public final boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_skip) {
            a aVar = this.W;
            if (aVar != null) {
                aVar.onSkipClicked();
                return true;
            }
        }
        return super.a(menuItem);
    }

    public final sso ae_() {
        return sso.a("spotify:podcastonboarding:topic-picker");
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PODCASTONBOARDING_TOPICPICKER, sso.a("spotify:podcastonboarding:topic-picker").toString());
    }

    public final gkq aj() {
        return PageIdentifiers.PODCASTONBOARDING_TOPICPICKER;
    }

    public final void aw_() {
        super.aw_();
        this.X.b();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final void z() {
        super.z();
        this.X.c();
    }
}
