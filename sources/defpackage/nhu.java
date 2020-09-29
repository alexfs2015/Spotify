package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.hiddencontent.FreeTierProfileLogger.UserIntent;
import com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter;
import com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter.Tab;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: nhu reason: default package */
public class nhu extends jrd implements d, NavigationItem, jqx, a, a, nip, a, uqq {
    public nhw T;
    public jpc U;
    public final jor<nik> V = new jor<nik>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            nik nik = (nik) obj;
            HiddenContentFragmentPresenter hiddenContentFragmentPresenter = nhu.this.a;
            jpc jpc = nhu.this.U;
            vku a2 = nik.a();
            String uri = a2.getUri();
            String str = uri;
            hiddenContentFragmentPresenter.a.a(str, "list-of-artists", nik.b(), InteractionType.HIT, UserIntent.ARTIST_CONTEXT_MENU_CLICKED);
            return jpc.a(uri, a2.getName()).a(hiddenContentFragmentPresenter.c).a(false).b(true).c(true).d(true).e(true).a();
        }
    };
    public final jor<nil> W = new jor<nil>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            nil nil = (nil) obj;
            HiddenContentFragmentPresenter hiddenContentFragmentPresenter = nhu.this.a;
            jpc jpc = nhu.this.U;
            vlf a2 = nil.a();
            String uri = a2.getUri();
            String str = uri;
            hiddenContentFragmentPresenter.a.a(str, "list-of-tracks", nil.b(), InteractionType.HIT, UserIntent.TRACK_CONTEXT_MENU_CLICKED);
            return jpc.a(uri, a2.getName(), hiddenContentFragmentPresenter.c.toString()).a(hiddenContentFragmentPresenter.c).a(false).b(true).c(true).d(false).h(true).i(true).j(true).k(true).a();
        }
    };
    private RecyclerView X;
    private fvz Y;
    private LoadingView Z;
    public HiddenContentFragmentPresenter a;
    private LinearLayout aa;
    private LinearLayout ab;
    private TextView ac;
    private TextView ad;
    private Parcelable ae;
    private a<u> af;
    private a<u> ag;
    private jog ah;
    private jog ai;
    public nhx b;

    public static nhu a(fqn fqn) {
        nhu nhu = new nhu();
        nhu.g(new Bundle());
        fqo.a((Fragment) nhu, fqn);
        return nhu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.X.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    private jog b(String str) {
        fqv.f();
        fvd a2 = fvg.a(n(), this.X);
        a2.b((CharSequence) str);
        return new jog(a2.getView());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a(Tab.SONGS);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a(Tab.ARTISTS);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = (Context) fbp.a(n());
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.fragment_hidden_content_header_with_list, viewGroup, false);
        this.X = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view);
        this.X.a((i) new LinearLayoutManager(context));
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) viewGroup2.findViewById(R.id.glue_header_layout);
        GlueHeaderView glueHeaderView = (GlueHeaderView) viewGroup2.findViewById(R.id.header_view);
        fsy a2 = ftc.a(context, viewGroup);
        glueHeaderView.a(a2);
        this.Y = fvy.a(glueHeaderView);
        this.Y.a(a((int) R.string.hidden_content_title_bans_only));
        a2.a((CharSequence) a((int) R.string.hidden_content_title_bans_only));
        fxf.a(glueHeaderView, this.Y);
        ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(n()).inflate(R.layout.hidden_content_tabs, glueHeaderLayout, false);
        this.aa = (LinearLayout) viewGroup3.findViewById(R.id.tab_artists);
        this.aa.setOnClickListener(new $$Lambda$nhu$67q6cJBWD5wxSycUsXpoH455nt4(this));
        this.ac = (TextView) viewGroup3.findViewById(R.id.tab_artists_count);
        TextView textView = this.ac;
        String str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        textView.setText(str);
        this.ab = (LinearLayout) viewGroup3.findViewById(R.id.tab_songs);
        this.ab.setOnClickListener(new $$Lambda$nhu$5r4VAKI5xPz2YLc655gotQLEI(this));
        this.ad = (TextView) viewGroup3.findViewById(R.id.tab_songs_count);
        this.ad.setText(str);
        glueHeaderLayout.a((View) viewGroup3, true);
        this.Z = LoadingView.a(layoutInflater, p(), glueHeaderLayout);
        viewGroup2.addView(this.Z);
        this.Z.a();
        glueHeaderLayout.setVisibility(4);
        this.af = this.b;
        this.ag = this.T;
        String str2 = "";
        this.ah = b(str2);
        this.ai = b(str2);
        return viewGroup2;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        if (bundle != null) {
            hiddenContentFragmentPresenter.e = Tab.valueOf(bundle.getString("active_tab", Tab.ARTISTS.name()));
        }
        hiddenContentFragmentPresenter.b(hiddenContentFragmentPresenter.e);
        if (bundle != null) {
            this.ae = bundle.getParcelable("list");
        }
    }

    public final void a(String str, int i) {
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        String str2 = str;
        hiddenContentFragmentPresenter.a.a(str2, "list-of-artists", i, InteractionType.HIT, UserIntent.ARTIST_CLICKED);
        hiddenContentFragmentPresenter.b.a(str);
    }

    public final void a(List<vlf> list) {
        this.ad.setText(String.valueOf(list.size()));
        this.b.a(list);
        this.af = this.b;
    }

    public final void a(vlf vlf, int i) {
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        hiddenContentFragmentPresenter.a.a(vlf.getUri(), "list-of-tracks", i, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        hiddenContentFragmentPresenter.a(vlf);
    }

    public final void aP_() {
        super.aP_();
        this.a.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.bn;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.YOURLIBRARY_HIDDEN_CONTENT, null);
    }

    public final uqm ag() {
        return uqo.ah;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final void ai() {
        if (this.Z.d()) {
            this.Z.b();
        }
    }

    public final gkq aj() {
        return PageIdentifiers.YOURLIBRARY_HIDDEN_CONTENT;
    }

    public final void ak() {
        this.ab.setSelected(true);
        this.aa.setSelected(false);
        this.X.a((a) this.af);
    }

    public final void al() {
        this.ab.setSelected(false);
        this.aa.setSelected(true);
        this.X.a((a) this.ag);
    }

    public final void am() {
        this.ad.setText(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        this.b.a(Collections.emptyList());
        this.af = this.ah;
    }

    public final void an() {
        this.ac.setText(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        this.T.a(Collections.emptyList());
        this.ag = this.ai;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(List<vku> list) {
        this.ac.setText(String.valueOf(list.size()));
        this.T.a(list);
        this.ag = this.T;
        Parcelable parcelable = this.ae;
        if (parcelable != null) {
            this.X.post(new $$Lambda$nhu$wiUROKrASL5DwlL5s5wSd1uxqV0(this, parcelable));
            this.ae = null;
        }
    }

    public final void b(vlf vlf, int i) {
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        hiddenContentFragmentPresenter.a.a(vlf.getUri(), "list-of-tracks", i, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        hiddenContentFragmentPresenter.a(vlf);
    }

    public final String e() {
        return "android-feature-hidden-content";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("active_tab", this.a.e.name());
        RecyclerView recyclerView = this.X;
        if (recyclerView != null) {
            bundle.putParcelable("list", ((i) fbp.a(recyclerView.d())).d());
        }
    }

    public final void h() {
        super.h();
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        if (hiddenContentFragmentPresenter.d != null) {
            hiddenContentFragmentPresenter.d.unsubscribe();
            hiddenContentFragmentPresenter.d.a();
            hiddenContentFragmentPresenter.d = null;
        }
    }
}
