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

/* renamed from: vaz reason: default package */
public class vaz extends jor implements b, a, udv, vay {
    public PodcastOnboardingLogger T;
    public Picasso U;
    public boolean V;
    private a W;
    private b<vbg, vbe> X;
    public vba a;
    public vae b;

    public static vaz e() {
        return new vaz();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.podcast_onboarding_topic_picker, viewGroup, false);
        ((q) p()).a((Toolbar) inflate.findViewById(R.id.toolbar));
        vbx vbx = new vbx(inflate, this.b, this.T, this, this.U);
        vbg vbg = vbg.a;
        vbg a2 = vbg.e().c(this.V).a();
        vba vba = this.a;
        Context n = n();
        vba.a = jto.a(n).e(Boolean.valueOf(jto.c(n)));
        this.X = kjt.a(vba.a((vbw) vbx), a2, kkd.a());
        this.X.a(vbx);
        return vbx.a;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ((AppBarLayout) view.findViewById(R.id.app_bar_layout)).a((b) new $$Lambda$vaz$GBUPgxmDUSORqwFmk7vIEF65aSM((TextView) view.findViewById(R.id.title), (TextView) view.findViewById(R.id.toolbar_title)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(TextView textView, TextView textView2, AppBarLayout appBarLayout, int i) {
        float abs = Math.abs(((float) i) / ((float) appBarLayout.b()));
        textView.setAlpha(1.0f - abs);
        textView2.setAlpha(abs);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_skip, menu);
        super.a(menu, menuInflater);
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

    public final void z() {
        super.z();
        this.X.c();
    }

    public final void A() {
        super.A();
        this.X.d();
    }

    public final void ax_() {
        super.ax_();
        this.X.b();
    }

    public final gjf aj() {
        return PageIdentifiers.PODCASTONBOARDING_TOPICPICKER;
    }

    public final sih ae_() {
        return sih.a("spotify:podcastonboarding:topic-picker");
    }

    public final void a(a aVar) {
        this.W = aVar;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PODCASTONBOARDING_TOPICPICKER, sih.a("spotify:podcastonboarding:topic-picker").toString());
    }
}
