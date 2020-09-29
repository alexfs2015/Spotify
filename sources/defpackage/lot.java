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

/* renamed from: lot reason: default package */
public final class lot implements los {
    final sih a;
    final jmq b;
    final jmg c;
    lod d;
    private final Context e;
    private final ContentFrameLayout<View> f;
    private final ToolbarMenuHelper g;
    private final ContentViewManager h;
    private fxq<fxy> i;
    private lop j;
    private ToggleButton k;
    private View l;
    private RecyclerView m;
    private uwh n;
    private DownloadHeaderView o;
    private frs p;
    private lnw q;
    private lnx r;
    private TextView s;
    private jwv t;

    public lot(Context context, sih sih, Fragment fragment, jmq jmq, jmg jmg, ToolbarMenuHelper toolbarMenuHelper) {
        this.e = context;
        this.a = sih;
        this.b = (jmq) fay.a(jmq);
        this.c = (jmg) fay.a(jmg);
        this.f = new ContentFrameLayout<>(context);
        ContentFrameLayout<View> contentFrameLayout = this.f;
        this.j = new lop(context);
        ToggleButton toggleButton = (ToggleButton) LayoutInflater.from(context).inflate(R.layout.header_toggle_button, null);
        toggleButton.setVisibility(0);
        this.k = toggleButton;
        if (jtc.b(context)) {
            this.i = fxq.b(context).b().b(this.k, 0).a((View) this.j).b(true).a(fragment);
        } else {
            this.l = jqd.a(context, null);
            this.i = fxq.a(context).b().b(this.k, 0).a(true).b(this.l).a((View) this.j).b(true).a(fragment);
        }
        this.m = this.i.f();
        ggw.a(jww.class);
        this.t = jww.a(context);
        this.q = new lnw(context, sih, this.t);
        this.r = new lnx(context, sih);
        this.s = (TextView) LayoutInflater.from(context).inflate(R.layout.cell_copyright, this.m, false);
        this.n = new uwh();
        this.o = DownloadHeaderView.a(context, (ViewGroup) this.m);
        this.n.a((a<H>) new jlu<H>(this.o, true), 1);
        this.n.a((a<H>) this.r, 2);
        this.p = fqb.e().a(context, this.m);
        this.n.a((a<H>) new jlu<H>(this.p.getView(), true), 4);
        this.n.a((a<H>) this.q, 3);
        this.n.a((a<H>) new jlu<H>(this.s, false), 5);
        this.m.a((a) this.n);
        contentFrameLayout.a(this.i.b());
        this.g = toolbarMenuHelper;
        this.h = new ContentViewManager.a(this.f.getContext(), this.f).a(R.string.error_no_connection_title, R.string.album_offline_body).b(R.string.error_general_title, R.string.error_general_body).a();
    }

    public final View a() {
        return this.f;
    }

    public final void a(lod lod) {
        this.d = lod;
        this.j.a((OnClickListener) new $$Lambda$lot$8TmKfyJLdhG8Du6pAzGkW697FY(this));
        this.r.d = new $$Lambda$lot$2LHH9uPk8tcm1T52jU9sCYbW0(this);
        this.r.e = new jmf<ho<AlbumTrack, Integer>>() {
            public final /* synthetic */ jms onCreateContextMenu(Object obj) {
                ho hoVar = (ho) obj;
                AlbumTrack albumTrack = (AlbumTrack) fay.a(hoVar.a);
                lot.this.d.a(albumTrack.getUri(), ((Integer) fay.a(hoVar.b)).intValue());
                return lot.this.b.a(albumTrack.getUri(), albumTrack.getName(), lot.this.a.toString()).a(lot.this.a).a(false).b(true).c(true).d(false).a();
            }
        };
        this.q.d = new $$Lambda$lot$gIoXtm_Af3bRgqj5ps6iK7jut5s(this);
        this.q.e = new jmf<ho<AlbumRelease, Integer>>() {
            public final /* synthetic */ jms onCreateContextMenu(Object obj) {
                ho hoVar = (ho) obj;
                AlbumRelease albumRelease = (AlbumRelease) fay.a(hoVar.a);
                lot.this.d.b(albumRelease.getUri(), ((Integer) fay.a(hoVar.b)).intValue());
                return lot.this.c.a(albumRelease.getUri(), albumRelease.getName()).a(lot.this.a).a(true).b(true).c(false).a();
            }
        };
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(new $$Lambda$lot$UsekwXfsZ7NXhCAChiVgZOB4yg(this));
        }
        this.k.setOnClickListener(new $$Lambda$lot$0LgQVwt0iXkV6f_EjzNrq4ub45A(this));
        this.o.b = new DownloadHeaderView.a() {
            public final void a() {
                lot.this.d.c();
            }

            public final void a(boolean z) {
                lot.this.d.b(z);
            }
        };
        this.i.a((e) new h() {
            public final void b(int i) {
                lot.this.d.a(i);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.d.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.d.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.d.a(this.k.isChecked());
    }

    public final void a(String str) {
        ((fxy) this.i.a()).a(str);
    }

    public final void a(Album album) {
        lop lop = this.j;
        fay.a(album);
        ggw.a(gbd.class);
        Calendar f2 = gbd.a().f();
        f2.set(1, album.getYear());
        f2.set(2, album.getMonth() - 1);
        f2.set(5, album.getDay());
        lop.a(f2.getTime().getTime() / 1000);
        lop.b(album.getFirstArtistName());
        lop.a(album.getTotalDuration() / 1000);
        AlbumImage artistImage = album.getArtistImage();
        if (artistImage != null) {
            lop.e.c(lop.b, artistImage.getUri());
        }
        lop.a(lop.getContext().getString(lof.a(album.getType())));
        ((fxy) this.i.a()).b(this.i.b().getContext().getString(lof.b(album.getType()), new Object[]{album.getAllArtistNames()}));
        ImageView imageView = (ImageView) fay.a(this.i.c());
        Uri parse = !TextUtils.isEmpty(album.getCoverUri()) ? Uri.parse(album.getCoverUri()) : Uri.EMPTY;
        this.t.a(imageView, parse, this.i.g());
        this.t.a(this.i.d(), parse);
        if (!Uri.EMPTY.equals(parse)) {
            CoverImageActivity.a(this.e, imageView, parse);
        }
    }

    public final void b(Album album) {
        this.q.a();
        this.r.a();
        frs frs = this.p;
        frs.a((CharSequence) frs.a().getContext().getString(R.string.album_tracks_page_title_more_by, new Object[]{album.getFirstArtistName()}));
        List releases = album.getReleases();
        if (!releases.isEmpty()) {
            this.n.a(true, 4);
            this.q.a(releases);
        } else {
            this.n.a(false, 4);
        }
        this.r.a(album.getTracks());
        this.s.setText(fau.a(10).a((Iterable<?>) album.getCopyrights()));
    }

    public final void b(String str) {
        if (!faw.a(this.r.f, str)) {
            lnx lnx = this.r;
            lnx.f = str;
            lnx.e();
        }
    }

    public final void c(String str) {
        if (!faw.a(this.q.f, str)) {
            lnw lnw = this.q;
            lnw.f = str;
            lnw.e();
        }
    }

    public final void a(boolean z) {
        this.k.setText(z ? R.string.cat_album_saved : R.string.cat_album_save);
        this.k.setChecked(z);
    }

    public final void a(uzf uzf) {
        this.o.a(uzf);
    }

    public final void b(boolean z) {
        this.r.b(z);
    }

    public final void b() {
        this.h.a(this.f.b);
    }

    public final void c() {
        this.h.b((ContentState) null);
        this.h.a(true);
    }

    public final void d() {
        this.h.b((ContentState) null);
        this.h.c(true);
    }

    public final void e() {
        this.h.b((ContentState) null);
    }

    public final void c(boolean z) {
        View view = this.l;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    public final void d(boolean z) {
        lnx lnx = this.r;
        if (lnx.g != z) {
            lnx.g = z;
            lnx.e();
        }
    }

    public final void a(fyt fyt) {
        if (jtc.b(this.e)) {
            this.l = ToolbarMenuHelper.a(fyt, (OnClickListener) new $$Lambda$lot$gu3KTNHawVbUxcrO1cvq91GcpjU(this));
            this.i.a(fyt, this.e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.d.b();
    }

    public final void f() {
        this.t.a();
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        u b2 = this.m.b(view);
        this.d.a((AlbumTrack) view.getTag(), b2.e() - this.n.g(2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        u b2 = this.m.b(view);
        this.d.a((AlbumRelease) view.getTag(), b2.e() - this.n.g(3));
    }
}
