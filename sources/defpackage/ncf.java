package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
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

/* renamed from: ncf reason: default package */
public class ncf extends jor implements d, NavigationItem, jol, a, a, nda, a, udv {
    public nch T;
    public jmq U;
    public final jmf<ncv> V = new jmf<ncv>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            ncv ncv = (ncv) obj;
            HiddenContentFragmentPresenter hiddenContentFragmentPresenter = ncf.this.a;
            jmq jmq = ncf.this.U;
            uyr a2 = ncv.a();
            String uri = a2.getUri();
            String str = uri;
            hiddenContentFragmentPresenter.a.a(str, "list-of-artists", ncv.b(), InteractionType.HIT, UserIntent.ARTIST_CONTEXT_MENU_CLICKED);
            return jmq.a(uri, a2.getName()).a(hiddenContentFragmentPresenter.c).a(false).b(true).c(true).d(true).e(true).a();
        }
    };
    public final jmf<ncw> W = new jmf<ncw>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            ncw ncw = (ncw) obj;
            HiddenContentFragmentPresenter hiddenContentFragmentPresenter = ncf.this.a;
            jmq jmq = ncf.this.U;
            uzc a2 = ncw.a();
            String uri = a2.getUri();
            String str = uri;
            hiddenContentFragmentPresenter.a.a(str, "list-of-tracks", ncw.b(), InteractionType.HIT, UserIntent.TRACK_CONTEXT_MENU_CLICKED);
            return jmq.a(uri, a2.getName(), hiddenContentFragmentPresenter.c.toString()).a(hiddenContentFragmentPresenter.c).a(false).b(true).c(true).d(false).h(true).i(true).j(true).k(true).a();
        }
    };
    private RecyclerView X;
    private fvf Y;
    private LoadingView Z;
    public HiddenContentFragmentPresenter a;
    private LinearLayout aa;
    private LinearLayout ab;
    private TextView ac;
    private TextView ad;
    private Parcelable ae;
    private a<u> af;
    private a<u> ag;
    private jlu ah;
    private jlu ai;
    public nci b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "android-feature-hidden-content";
    }

    public static ncf a(fpt fpt) {
        ncf ncf = new ncf();
        ncf.g(new Bundle());
        fpu.a((Fragment) ncf, fpt);
        return ncf;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = (Context) fay.a(n());
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.fragment_hidden_content_header_with_list, viewGroup, false);
        this.X = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view);
        this.X.a((i) new LinearLayoutManager(context));
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) viewGroup2.findViewById(R.id.glue_header_layout);
        GlueHeaderView glueHeaderView = (GlueHeaderView) viewGroup2.findViewById(R.id.header_view);
        fse a2 = fsi.a(context, viewGroup);
        glueHeaderView.a(a2);
        this.Y = fve.a(glueHeaderView);
        this.Y.a(a((int) R.string.hidden_content_title_bans_only));
        a2.a((CharSequence) a((int) R.string.hidden_content_title_bans_only));
        fwl.a(glueHeaderView, this.Y);
        ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(n()).inflate(R.layout.hidden_content_tabs, glueHeaderLayout, false);
        this.aa = (LinearLayout) viewGroup3.findViewById(R.id.tab_artists);
        this.aa.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ncf.this.a.a(Tab.ARTISTS);
            }
        });
        this.ac = (TextView) viewGroup3.findViewById(R.id.tab_artists_count);
        TextView textView = this.ac;
        String str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        textView.setText(str);
        this.ab = (LinearLayout) viewGroup3.findViewById(R.id.tab_songs);
        this.ab.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ncf.this.a.a(Tab.SONGS);
            }
        });
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

    private jlu b(String str) {
        fqb.f();
        fuj a2 = fum.a(n(), this.X);
        a2.b((CharSequence) str);
        return new jlu(a2.getView());
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

    public final void g() {
        super.g();
        this.a.a();
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

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("active_tab", this.a.e.name());
        RecyclerView recyclerView = this.X;
        if (recyclerView != null) {
            bundle.putParcelable("list", ((i) fay.a(recyclerView.d())).d());
        }
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final udr ag() {
        return udt.ah;
    }

    public final void ai() {
        if (this.Z.d()) {
            this.Z.b();
        }
    }

    public final void a(List<uzc> list) {
        this.ad.setText(String.valueOf(list.size()));
        this.b.a(list);
        this.af = this.b;
    }

    public final void b(List<uyr> list) {
        this.ac.setText(String.valueOf(list.size()));
        this.T.a(list);
        this.ag = this.T;
        Parcelable parcelable = this.ae;
        if (parcelable != null) {
            this.X.post(new $$Lambda$ncf$8K2u2uXBCHHWwKdpix8bf0zfoM(this, parcelable));
            this.ae = null;
        }
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.X.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    public final gjf aj() {
        return PageIdentifiers.YOURLIBRARY_HIDDEN_CONTENT;
    }

    public final sih ae_() {
        return ViewUris.bo;
    }

    public final void a(uzc uzc, int i) {
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        hiddenContentFragmentPresenter.a.a(uzc.getUri(), "list-of-tracks", i, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        hiddenContentFragmentPresenter.a(uzc);
    }

    public final void b(uzc uzc, int i) {
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        hiddenContentFragmentPresenter.a.a(uzc.getUri(), "list-of-tracks", i, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        hiddenContentFragmentPresenter.a(uzc);
    }

    public final void a(String str, int i) {
        HiddenContentFragmentPresenter hiddenContentFragmentPresenter = this.a;
        String str2 = str;
        hiddenContentFragmentPresenter.a.a(str2, "list-of-artists", i, InteractionType.HIT, UserIntent.ARTIST_CLICKED);
        hiddenContentFragmentPresenter.b.a(str);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.YOURLIBRARY_HIDDEN_CONTENT, null);
    }
}
