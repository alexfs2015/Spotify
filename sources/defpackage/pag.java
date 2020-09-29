package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: pag reason: default package */
public final class pag implements pad {
    ImageView a;
    private final pcd b;
    private final Picasso c;
    private final vti<a> d;
    private final pae e;
    private final gum f;
    private final gut g;
    private final pbk h;
    private final pbz i;
    private final pcn j;
    private final pbu k;
    private final pdp l;
    private GlueHeaderViewV2 m;
    private ImageView n;
    private TextView o;
    private TextView p;
    private Button q;
    private ProgressBar r;
    private Group s;
    private ColorDrawable t;
    private View u;
    private View v;
    private View w;

    public pag(pcd pcd, pbz pbz, pcn pcn, pbu pbu, pdp pdp, Picasso picasso, vti<a> vti, pae pae, gut gut, gum gum, pbk pbk) {
        this.b = pcd;
        this.i = pbz;
        this.j = pcn;
        this.k = pbu;
        this.l = pdp;
        this.c = picasso;
        this.d = vti;
        this.e = pae;
        this.g = gut;
        this.f = gum;
        this.h = pbk;
    }

    public final View f() {
        return this.w;
    }

    public final void a(gzz gzz) {
        List body = gzz.body();
        this.s.setVisibility(0);
        this.g.a(body);
        this.g.e();
    }

    public final void g() {
        this.s.setVisibility(8);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.w = layoutInflater.inflate(R.layout.fragment_podcast_episode, viewGroup, false);
        View view = this.w;
        this.m = (GlueHeaderViewV2) view.findViewById(R.id.header_view);
        this.b.a(layoutInflater, (ViewGroup) view);
        this.m.a((fwk) this.b);
        if (view.getResources().getConfiguration().orientation != 2) {
            int a2 = gaa.a(view.getContext().getResources()) + uuu.c(view.getContext(), R.attr.actionBarSize);
            this.m.a(a2);
            this.m.a = a2;
        }
        fwg a3 = fwf.a(view.getContext(), -11316397);
        this.t = (ColorDrawable) a3.getDrawable(0);
        ip.a((View) this.m, (Drawable) a3);
        View view2 = this.w;
        this.u = view2.findViewById(R.id.podcast_episode_content);
        this.n = (ImageView) view2.findViewById(R.id.btn_share);
        this.o = (TextView) view2.findViewById(R.id.txt_metadata);
        this.a = (ImageView) view2.findViewById(R.id.img_cover_art);
        this.q = (Button) view2.findViewById(R.id.btn_play);
        this.p = (TextView) view2.findViewById(R.id.txt_see_all);
        float dimensionPixelSize = (float) view2.getResources().getDimensionPixelSize(R.dimen.std_24dp);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(view2.getContext(), SpotifyIconV2.CHEVRON_RIGHT, dimensionPixelSize);
        if (VERSION.SDK_INT > 17) {
            this.p.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
        } else {
            this.p.setCompoundDrawablesWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
        }
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(view2.getContext(), SpotifyIconV2.SHARE_ANDROID, dimensionPixelSize);
        spotifyIconDrawable2.a(fr.b(view2.getContext(), (int) R.color.glue_button_text));
        this.n.setImageDrawable(spotifyIconDrawable2);
        uui.b(this.p).a(this.p).a();
        ViewGroup viewGroup2 = (ViewGroup) this.w;
        fuo b2 = fus.b(this.w.getContext(), viewGroup2);
        b2.a((int) R.string.error_general_title);
        b2.b((int) R.string.error_general_body);
        b2.c((int) R.string.error_try_again);
        b2.V_().setOnClickListener(new $$Lambda$pag$Su9dkkItxQfUJfEhZ6j7KE4x8(this));
        this.v = b2.getView();
        this.v.setVisibility(8);
        this.v.setId(R.id.podcast_episode_error);
        viewGroup2.addView(this.v);
        this.r = (ProgressBar) this.w.findViewById(R.id.loading_progress_bar);
        this.l.a((RecyclerView) this.w.findViewById(R.id.recycler_featured_content));
        View view3 = this.w;
        RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.recycler_recommendations);
        this.s = (Group) view3.findViewById(R.id.group_recommendations);
        recyclerView.a((a) this.g);
        recyclerView.a((i) gvt.b(view3.getContext(), this.f));
        recyclerView.q = true;
        recyclerView.setNestedScrollingEnabled(false);
        this.h.a(recyclerView);
        recyclerView.setFocusable(false);
        this.i.a((LottieAnimationView) this.w.findViewById(R.id.lottie_animated_icon));
        this.k.a((TextView) this.w.findViewById(R.id.txt_description));
        return this.w;
    }

    public final void a(pci pci) {
        this.b.a(pci);
        this.j.a(pci);
    }

    public final void a(paj paj) {
        this.o.setText(paj.d());
        this.c.a(paj.e()).a(this.a, (vrt) new vrt() {
            public final void a() {
                pag.this.a.setVisibility(0);
            }

            public final void b() {
                pag.this.a.setVisibility(8);
            }
        });
        this.p.setOnClickListener(new $$Lambda$pag$B2dQc3_irz3rTtWSm4ojID1HPqU(this, paj));
        this.q.setOnClickListener(new $$Lambda$pag$FmwtW3RUp7IOPxpv816iZKznU(this, paj));
        this.n.setOnClickListener(new $$Lambda$pag$UexlxEM4St387Amtc1OAjXlzf4I(this, paj));
        this.i.a(paj);
        this.k.a(paj);
        this.l.a(paj.m());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(paj paj, View view) {
        ((a) this.d.get()).a(paj.h());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(paj paj, View view) {
        ((a) this.d.get()).a(paj.h(), paj.k());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(paj paj, View view) {
        Context context = view.getContext();
        String b2 = paj.b();
        String c2 = paj.c();
        String i2 = paj.i();
        a aVar = (a) this.d.get();
        aVar.a(b2, c2, paj.j(), context.getString(R.string.share_episode_of_name, new Object[]{i2}));
    }

    public final void a(fyt fyt) {
        this.j.a(fyt);
    }

    public final void a(String str) {
        ((a) this.d.get()).b(str);
    }

    public final void a(int i2) {
        this.t.setColor(i2);
    }

    public final void b(String str) {
        ((a) this.d.get()).c(str);
    }

    public final void a() {
        this.r.setVisibility(0);
        this.u.setVisibility(8);
        this.v.setVisibility(8);
    }

    public final void b() {
        this.v.setVisibility(0);
        this.u.setVisibility(8);
        this.r.setVisibility(8);
    }

    public final void c() {
        this.u.setVisibility(0);
        this.v.setVisibility(8);
        this.r.setVisibility(8);
    }

    public final void d() {
        this.q.setText(R.string.header_pause);
    }

    public final void e() {
        this.q.setText(R.string.header_play);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ((a) this.d.get()).a();
    }
}
