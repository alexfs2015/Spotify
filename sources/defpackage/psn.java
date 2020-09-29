package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.profile.model.LoadingState;

/* renamed from: psn reason: default package */
public final class psn implements kmm<psg, pse> {
    public final ViewGroup a;
    /* access modifiers changed from: private */
    public final Activity b;
    /* access modifiers changed from: private */
    public final LoadingView c;
    /* access modifiers changed from: private */
    public final fvh d;
    /* access modifiers changed from: private */
    public final AppBarLayout e = ((AppBarLayout) this.a.findViewById(R.id.header_view));
    /* access modifiers changed from: private */
    public final fyh f = ftc.a((Context) this.b);
    /* access modifiers changed from: private */
    public final jyx g;
    private final jzc h;
    /* access modifiers changed from: private */
    public final psm i;
    /* access modifiers changed from: private */
    public final View j;
    /* access modifiers changed from: private */
    public final View k;
    /* access modifiers changed from: private */
    public final View l;
    /* access modifiers changed from: private */
    public final TextView m;
    /* access modifiers changed from: private */
    public final TextView n;
    /* access modifiers changed from: private */
    public final TextView o;
    /* access modifiers changed from: private */
    public final Button p;
    /* access modifiers changed from: private */
    public final ToggleButton q;
    /* access modifiers changed from: private */
    public final ppy r;
    /* access modifiers changed from: private */
    public final ppy s;
    /* access modifiers changed from: private */
    public final vhx t;
    private final fvh u;

    public psn(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, BadgesFactory badgesFactory, jyx jyx, wzi<ppy> wzi) {
        this.b = activity;
        this.g = jyx;
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        this.f.a(this.b.getString(R.string.profile_title));
        View findViewById = this.a.findViewById(R.id.header_content);
        this.i = new psm(findViewById);
        this.e.a((b) new $$Lambda$psn$O7Csb_VwEn7xyqjbAydTh6alsvI(this, findViewById));
        this.t = new vhx();
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(1, false));
        recyclerView.a((a) this.t);
        View inflate = layoutInflater.inflate(R.layout.profile_tabs, recyclerView, false);
        inflate.setBackgroundColor(0);
        this.t.a((a<H>) new jog<H>(inflate), 0);
        this.j = inflate.findViewById(R.id.playlists_layout);
        this.k = inflate.findViewById(R.id.followers_layout);
        this.l = inflate.findViewById(R.id.following_layout);
        this.m = (TextView) inflate.findViewById(R.id.playlists_count);
        this.n = (TextView) inflate.findViewById(R.id.followers_count);
        this.o = (TextView) inflate.findViewById(R.id.following_count);
        vfz.c(this.j).a(this.m, inflate.findViewById(R.id.playlists_label)).a();
        vfz.c(this.k).a(this.n, inflate.findViewById(R.id.followers_label)).a();
        vfz.c(this.l).a(this.o, inflate.findViewById(R.id.following_label)).a();
        this.p = (Button) this.a.findViewById(R.id.edit_button);
        this.q = (ToggleButton) this.a.findViewById(R.id.follow_button);
        this.r = (ppy) wzi.get();
        this.r.a(activity.getString(R.string.profile_list_recently_played_artists_title));
        this.r.f(3);
        this.t.a((a<H>) this.r, 1);
        this.s = (ppy) wzi.get();
        this.s.a(activity.getString(R.string.profile_list_public_playlists_title));
        this.s.f(3);
        this.t.a((a<H>) this.s, 2);
        this.u = fvm.a(this.b, viewGroup);
        this.u.a((int) R.string.profile_empty_view);
        this.u.getView().setPadding(0, vfj.b(24.0f, this.b.getResources()), 0, 0);
        this.u.getView().setBackground(null);
        this.t.a((a<H>) new jog<H>(this.u.getView()), 3);
        this.t.a(3);
        this.c = LoadingView.a(layoutInflater, this.b, this.a);
        this.c.setLayoutParams(new LayoutParams(-1, -1));
        this.a.addView(this.c);
        this.d = fvm.a(this.b, viewGroup);
        this.d.getView().setVisibility(8);
        this.a.addView(this.d.getView());
        this.h = new jzc(this.b, badgesFactory);
    }

    static /* synthetic */ vfk a(psn psn, psg psg) {
        return psg.d() ? psn.h : vgq.a();
    }

    static /* synthetic */ void a(View view, TextView textView, int i2) {
        textView.setText(String.valueOf(i2));
        view.setClickable(i2 > 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        this.i.a(abs, height);
        view.setTranslationY(f2);
        this.f.a(height);
    }

    static /* synthetic */ boolean a(prg prg) {
        return prg.a() == LoadingState.LOADED || prg.a() == LoadingState.FAILED;
    }

    public final kmn<psg> connect(final knw<pse> knw) {
        ppy ppy = this.r;
        ppy.d = new $$Lambda$psn$QtTKnkZW5sijCWMSqzuTI_FzLo0(knw);
        ppy.e = new $$Lambda$psn$3LraLgu0SZdrjrS17dYcHiYIJ2U(knw);
        ppy ppy2 = this.s;
        ppy2.d = new $$Lambda$psn$dM1YQrfl5DFAAy1eZTScAfQPfpY(knw);
        ppy2.e = new $$Lambda$psn$F41e_Y_gbfTzANTjr3IPtjO6FVI(knw);
        return new kmn<psg>() {
            public final /* synthetic */ void accept(Object obj) {
                psg psg = (psg) obj;
                psn.this.b.invalidateOptionsMenu();
                LoadingState m = psg.m();
                if (m == LoadingState.LOADING || m == LoadingState.NOT_LOADED) {
                    psn.this.e.setVisibility(8);
                    if (!psn.this.c.d()) {
                        psn.this.c.a();
                    }
                    return;
                }
                psn.this.c.b();
                if (m == LoadingState.FAILED) {
                    psn.this.e.setVisibility(8);
                    psn.this.d.a((int) R.string.profile_error_title);
                    psn.this.d.b((int) R.string.profile_error_subtitle);
                    psn.this.d.getView().setVisibility(0);
                } else if (m == LoadingState.LOADED || psg.l()) {
                    ip.a((View) psn.this.e, (Drawable) fwz.a((Context) psn.this.b, gb.b(psn.this.b.getResources(), R.color.glue_blue_light, null)));
                    psn.this.d.getView().setVisibility(8);
                    psn.this.e.setVisibility(0);
                    psn.this.i.b.setText(psg.b());
                    psn.this.f.a(psg.b());
                    psn.this.g.a(psn.this.i.a, !TextUtils.isEmpty(psg.c()) ? Uri.parse(psg.c()) : Uri.EMPTY, psn.a(psn.this, psg));
                    psn.a(psn.this.j, psn.this.m, psg.h());
                    psn.a(psn.this.k, psn.this.n, psg.i());
                    psn.a(psn.this.l, psn.this.o, psg.j());
                    if (psg.h() > 0) {
                        psn.this.j.setOnClickListener(new $$Lambda$psn$1$OdliUiGhTglphexRCIUkAJuFMw(knw));
                    }
                    if (psg.i() > 0) {
                        psn.this.k.setOnClickListener(new $$Lambda$psn$1$Trf4h4B1RcGSLMgwWAOA66fkX0(knw));
                    }
                    if (psg.j() > 0) {
                        psn.this.l.setOnClickListener(new $$Lambda$psn$1$rbvRZeG4vrhQEXX6MGUlFJG27Q0(knw));
                    }
                    if (psg.k()) {
                        psn.this.p.setVisibility(0);
                        if (psg.l()) {
                            psn.this.p.setEnabled(true);
                            psn.this.p.setOnClickListener(new $$Lambda$psn$1$fMHD8Aff8i6ty4LktnBLlPRIhSA(knw));
                        } else {
                            psn.this.p.setEnabled(false);
                            psn.this.p.setOnClickListener(null);
                        }
                        psn.this.q.setVisibility(8);
                    } else {
                        psn.this.p.setVisibility(8);
                        psn.this.q.setVisibility(0);
                        if (psg.g()) {
                            psn.this.q.setChecked(true);
                        } else {
                            psn.this.q.setChecked(false);
                        }
                        psn.this.q.setEnabled(psg.l());
                        psn.this.q.setOnClickListener(new $$Lambda$psn$1$9PKxBryXlL3olrMFBSm0UXVf9PQ(knw));
                    }
                    if (psn.a(psg.n()) && psn.a(psg.o())) {
                        psn.this.r.a(psg.n());
                        psn.this.s.a(psg.o());
                        psn.this.t.h(1);
                        psn.this.t.h(2);
                        if (psn.this.r.b() == 0 && psn.this.s.b() == 0) {
                            psn.this.t.h(3);
                        }
                    }
                } else {
                    psn.this.e.setVisibility(8);
                    psn.this.d.a((int) R.string.profile_offline_title);
                    psn.this.d.b((int) R.string.profile_offline_subtitle);
                    psn.this.d.getView().setVisibility(0);
                }
            }

            public final void dispose() {
            }
        };
    }
}
