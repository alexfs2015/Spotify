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
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

/* renamed from: php reason: default package */
public final class php implements phm {
    ImageView a;
    private final pjm b;
    private final Picasso c;
    private final who<a> d;
    private final phn e;
    private final pji f;
    private final pjz g;
    private final pjd h;
    private final plb i;
    private final pjs j;
    private GlueHeaderViewV2 k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private Button o;
    private ProgressBar p;
    private ColorDrawable q;
    private View r;
    private View s;
    private View t;

    public php(pjm pjm, pji pji, pjz pjz, pjd pjd, plb plb, pjs pjs, Picasso picasso, who<a> who, phn phn) {
        this.b = pjm;
        this.f = pji;
        this.g = pjz;
        this.h = pjd;
        this.i = plb;
        this.j = pjs;
        this.c = picasso;
        this.d = who;
        this.e = phn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ((a) this.d.get()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(phs phs, View view) {
        Context context = view.getContext();
        String b2 = phs.b();
        String c2 = phs.c();
        String i2 = phs.i();
        a aVar = (a) this.d.get();
        aVar.a(b2, c2, phs.j(), context.getString(R.string.share_episode_of_name, new Object[]{i2}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(phs phs, View view) {
        ((a) this.d.get()).a(phs.h(), phs.k());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(phs phs, View view) {
        ((a) this.d.get()).a(phs.h());
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.t = layoutInflater.inflate(R.layout.fragment_podcast_episode, viewGroup, false);
        View view = this.t;
        this.k = (GlueHeaderViewV2) view.findViewById(R.id.header_view);
        this.b.a(layoutInflater, (ViewGroup) view);
        this.k.a((fxe) this.b);
        if (view.getResources().getConfiguration().orientation != 2) {
            int a2 = gau.a(view.getContext().getResources()) + vgl.c(view.getContext(), R.attr.actionBarSize);
            this.k.a(a2);
            this.k.a = a2;
        }
        fxa a3 = fwz.a(view.getContext(), -11316397);
        this.q = (ColorDrawable) a3.getDrawable(0);
        ip.a((View) this.k, (Drawable) a3);
        View view2 = this.t;
        this.r = view2.findViewById(R.id.podcast_episode_content);
        this.l = (ImageView) view2.findViewById(R.id.btn_share);
        this.m = (TextView) view2.findViewById(R.id.txt_metadata);
        this.a = (ImageView) view2.findViewById(R.id.img_cover_art);
        this.o = (Button) view2.findViewById(R.id.btn_play);
        this.n = (TextView) view2.findViewById(R.id.txt_see_all);
        float dimensionPixelSize = (float) view2.getResources().getDimensionPixelSize(R.dimen.std_24dp);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(view2.getContext(), SpotifyIconV2.CHEVRON_RIGHT, dimensionPixelSize);
        if (VERSION.SDK_INT > 17) {
            this.n.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
        } else {
            this.n.setCompoundDrawablesWithIntrinsicBounds(null, null, spotifyIconDrawable, null);
        }
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(view2.getContext(), SpotifyIconV2.SHARE_ANDROID, dimensionPixelSize);
        spotifyIconDrawable2.a(fr.b(view2.getContext(), (int) R.color.glue_button_text));
        this.l.setImageDrawable(spotifyIconDrawable2);
        vfz.b(this.n).a(this.n).a();
        ViewGroup viewGroup2 = (ViewGroup) this.t;
        fvi b2 = fvm.b(this.t.getContext(), viewGroup2);
        b2.a((int) R.string.error_general_title);
        b2.b((int) R.string.error_general_body);
        b2.c((int) R.string.error_try_again);
        b2.V_().setOnClickListener(new $$Lambda$php$rxw0MVq6i4PH4DQCsO5LoTlQ0(this));
        this.s = b2.getView();
        this.s.setVisibility(8);
        this.s.setId(R.id.podcast_episode_error);
        viewGroup2.addView(this.s);
        this.p = (ProgressBar) this.t.findViewById(R.id.loading_progress_bar);
        this.i.a((RecyclerView) this.t.findViewById(R.id.recycler_featured_content));
        View view3 = this.t;
        this.j.a((RecyclerView) view3.findViewById(R.id.recycler_recommendations), (Group) view3.findViewById(R.id.group_recommendations));
        this.f.a((LottieAnimationView) this.t.findViewById(R.id.lottie_animated_icon));
        this.h.a((TextView) this.t.findViewById(R.id.txt_description));
        return this.t;
    }

    public final void a() {
        this.p.setVisibility(0);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
    }

    public final void a(int i2) {
        this.q.setColor(i2);
    }

    public final void a(fzn fzn) {
        this.g.a(fzn);
    }

    public final void a(String str) {
        ((a) this.d.get()).b(str);
    }

    public final void a(phs phs) {
        this.m.setText(phs.d());
        this.c.a(phs.e()).a(this.a, (wfz) new wfz() {
            public final void a() {
                php.this.a.setVisibility(0);
            }

            public final void b() {
                php.this.a.setVisibility(8);
            }
        });
        this.n.setOnClickListener(new $$Lambda$php$KypFNqIoQ_IPQgMVDS3KwKXEkI(this, phs));
        this.o.setOnClickListener(new $$Lambda$php$qXeuS65JFqf_iTTmtYqoXR8fjUE(this, phs));
        this.l.setOnClickListener(new $$Lambda$php$uXnfOk2GFJ7qr2FhTCa2iBhKgUc(this, phs));
        this.f.a(phs);
        this.h.a(phs);
        this.i.a(phs.m());
        this.j.a(phs.n());
    }

    public final void a(pjr pjr) {
        this.b.a(pjr);
        this.g.a(pjr);
    }

    public final void b() {
        this.s.setVisibility(0);
        this.r.setVisibility(8);
        this.p.setVisibility(8);
    }

    public final void b(String str) {
        ((a) this.d.get()).c(str);
    }

    public final void c() {
        this.r.setVisibility(0);
        this.s.setVisibility(8);
        this.p.setVisibility(8);
    }

    public final void d() {
        this.o.setText(R.string.header_pause);
    }

    public final void e() {
        this.o.setText(R.string.header_play);
    }

    public final View f() {
        return this.t;
    }
}
