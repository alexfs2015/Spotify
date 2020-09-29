package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import androidx.viewpager.widget.ViewPager.e;
import androidx.viewpager.widget.ViewPager.h;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.view.ContentFrameLayout;
import com.spotify.music.libs.album.model.Album;
import com.spotify.music.libs.album.model.AlbumImage;
import com.spotify.music.libs.album.model.AlbumRelease;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.Calendar;
import java.util.List;

/* renamed from: lst reason: default package */
public final class lst implements lss {
    final sso a;
    final jpc b;
    final jos c;
    lsd d;
    private final Context e;
    private final ContentFrameLayout<View> f;
    private final ToolbarMenuHelper g;
    private final ContentViewManager h;
    private final jyx i;
    private final jtz j;
    private fyk<fys> k;
    private lsp l;
    private ToggleButton m;
    private View n;
    private RecyclerView o;
    private vhx p;
    private DownloadHeaderView q;
    private fsm r;
    private lrw s;
    private lrx t;
    private TextView u;

    public lst(Context context, sso sso, Fragment fragment, jpc jpc, jos jos, ToolbarMenuHelper toolbarMenuHelper, jyx jyx, jtz jtz) {
        this.e = context;
        this.a = sso;
        this.i = jyx;
        this.j = jtz;
        this.b = (jpc) fbp.a(jpc);
        this.c = (jos) fbp.a(jos);
        this.f = new ContentFrameLayout<>(context);
        ContentFrameLayout<View> contentFrameLayout = this.f;
        this.l = new lsp(context);
        lsp lsp = this.l;
        jyx jyx2 = this.i;
        jtz jtz2 = this.j;
        lsp.e = jyx2;
        lsp.f = jtz2;
        lsp.a(lsp.getContext().getString(R.string.album_header_album_by));
        lsp.b.setImageDrawable(gaa.a(lsp.getContext()));
        ToggleButton toggleButton = (ToggleButton) LayoutInflater.from(context).inflate(R.layout.header_toggle_button, null);
        toggleButton.setVisibility(0);
        this.m = toggleButton;
        if (jvi.b(context)) {
            this.k = fyk.b(context).b().b(this.m, 0).a((View) this.l).b(true).a(fragment);
        } else {
            this.n = jso.a(context, null);
            this.k = fyk.a(context).b().b(this.m, 0).a(true).b(this.n).a((View) this.l).b(true).a(fragment);
        }
        this.o = this.k.f();
        this.s = new lrw(context, sso, this.i);
        this.t = new lrx(context, sso);
        this.u = (TextView) LayoutInflater.from(context).inflate(R.layout.cell_copyright, this.o, false);
        this.p = new vhx();
        this.q = DownloadHeaderView.a(context, (ViewGroup) this.o);
        this.p.a((a<H>) new jog<H>(this.q, true), 1);
        this.p.a((a<H>) this.t, 2);
        this.r = fqv.e().a(context, this.o);
        this.p.a((a<H>) new jog<H>(this.r.getView(), true), 4);
        this.p.a((a<H>) this.s, 3);
        this.p.a((a<H>) new jog<H>(this.u, false), 5);
        this.o.a((a) this.p);
        contentFrameLayout.a(this.k.b());
        this.g = toolbarMenuHelper;
        this.h = new ContentViewManager.a(this.f.getContext(), this.f).a(R.string.error_no_connection_title, R.string.album_offline_body).b(R.string.error_general_title, R.string.error_general_body).a();
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        u b2 = this.o.b(view);
        this.d.a((AlbumTrack) view.getTag(), b2.e() - this.p.g(2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.d.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.d.a(this.m.isChecked());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.d.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        u b2 = this.o.b(view);
        this.d.a((AlbumRelease) view.getTag(), b2.e() - this.p.g(3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.d.a();
    }

    public final View a() {
        return this.f;
    }

    public final void a(Album album) {
        lsp lsp = this.l;
        fbp.a(album);
        if (lsp.e != null) {
            Calendar f2 = lsp.f.f();
            f2.set(1, album.getYear());
            f2.set(2, album.getMonth() - 1);
            f2.set(5, album.getDay());
            lsp.a(lsp.f, f2.getTime().getTime() / 1000);
            lsp.b(album.getFirstArtistName());
            lsp.a(album.getTotalDuration() / 1000);
            AlbumImage artistImage = album.getArtistImage();
            if (artistImage != null) {
                lsp.e.c(lsp.b, artistImage.getUri());
            }
            lsp.a(lsp.getContext().getString(lsf.a(album.getType())));
            ((fys) this.k.a()).b(this.k.b().getContext().getString(lsf.b(album.getType()), new Object[]{album.getAllArtistNames()}));
            ImageView imageView = (ImageView) fbp.a(this.k.c());
            Uri parse = !TextUtils.isEmpty(album.getCoverUri()) ? Uri.parse(album.getCoverUri()) : Uri.EMPTY;
            this.i.a(imageView, parse, this.k.g());
            this.i.a(this.k.d(), parse);
            if (!Uri.EMPTY.equals(parse)) {
                CoverImageActivity.a(this.e, imageView, parse);
                return;
            }
            return;
        }
        throw new IllegalStateException("View not initialized with init().");
    }

    public final void a(fzn fzn) {
        if (jvi.b(this.e)) {
            this.n = ToolbarMenuHelper.a(fzn, (OnClickListener) new $$Lambda$lst$XdbQ9FxC4jRDF6VdYNqhFrhUcbQ(this));
            this.k.a(fzn, this.e);
        }
    }

    public final void a(String str) {
        ((fys) this.k.a()).a(str);
    }

    public final void a(lsd lsd) {
        this.d = lsd;
        this.l.a((OnClickListener) new $$Lambda$lst$aYGtw9ZkPG6o0U1nN7EQpLNuymw(this));
        this.t.d = new $$Lambda$lst$Dl3mmHhgCBuZHj__umldfS2mRvI(this);
        this.t.e = new jor<ho<AlbumTrack, Integer>>() {
            public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
                ho hoVar = (ho) obj;
                AlbumTrack albumTrack = (AlbumTrack) fbp.a(hoVar.a);
                lst.this.d.a(albumTrack.getUri(), ((Integer) fbp.a(hoVar.b)).intValue());
                return lst.this.b.a(albumTrack.getUri(), albumTrack.getName(), lst.this.a.toString()).a(lst.this.a).a(false).b(true).c(true).d(false).a();
            }
        };
        this.s.d = new $$Lambda$lst$suQ3NSFBZUmiu9uWfphJVzMcl8U(this);
        this.s.e = new jor<ho<AlbumRelease, Integer>>() {
            public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
                ho hoVar = (ho) obj;
                AlbumRelease albumRelease = (AlbumRelease) fbp.a(hoVar.a);
                lst.this.d.b(albumRelease.getUri(), ((Integer) fbp.a(hoVar.b)).intValue());
                return lst.this.c.a(albumRelease.getUri(), albumRelease.getName()).a(lst.this.a).a(true).b(true).c(false).a();
            }
        };
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(new $$Lambda$lst$NShFCJ06d90autHeWbFsjCgrB0(this));
        }
        this.m.setOnClickListener(new $$Lambda$lst$FZYIXnbghHbWu5BBliP1LLna0wk(this));
        this.q.b = new DownloadHeaderView.a() {
            public final void a() {
                lst.this.d.c();
            }

            public final void a(boolean z) {
                lst.this.d.b(z);
            }
        };
        this.k.a((e) new h() {
            public final void b(int i) {
                lst.this.d.a(i);
            }
        });
    }

    public final void a(vli vli) {
        this.q.a(vli);
    }

    public final void a(boolean z) {
        this.m.setText(z ? R.string.cat_album_saved : R.string.cat_album_save);
        this.m.setChecked(z);
    }

    public final void b() {
        this.h.a(this.f.b);
    }

    public final void b(Album album) {
        this.s.a();
        this.t.a();
        fsm fsm = this.r;
        fsm.a((CharSequence) fsm.a().getContext().getString(R.string.album_tracks_page_title_more_by, new Object[]{album.getFirstArtistName()}));
        List releases = album.getReleases();
        if (!releases.isEmpty()) {
            this.p.a(true, 4);
            this.s.a(releases);
        } else {
            this.p.a(false, 4);
        }
        this.t.a(album.getTracks());
        this.u.setText(fbl.a(10).a((Iterable<?>) album.getCopyrights()));
    }

    public final void b(String str) {
        if (!fbn.a(this.t.f, str)) {
            lrx lrx = this.t;
            lrx.f = str;
            lrx.e();
        }
    }

    public final void b(boolean z) {
        this.t.b(z);
    }

    public final void c() {
        this.h.b((ContentState) null);
        this.h.a(true);
    }

    public final void c(String str) {
        if (!fbn.a(this.s.f, str)) {
            lrw lrw = this.s;
            lrw.f = str;
            lrw.e();
        }
    }

    public final void c(boolean z) {
        View view = this.n;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    public final void d() {
        this.h.b((ContentState) null);
        this.h.c(true);
    }

    public final void d(boolean z) {
        lrx lrx = this.t;
        if (lrx.g != z) {
            lrx.g = z;
            lrx.e();
        }
    }

    public final void e() {
        this.h.b((ContentState) null);
    }

    public final void f() {
        this.i.a();
    }
}
