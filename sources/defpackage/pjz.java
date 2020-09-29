package defpackage;

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
import com.spotify.music.features.profile.domain.ProfileModel;
import com.spotify.music.features.profile.domain.ProfileModel.LoadingState;

/* renamed from: pjz reason: default package */
public final class pjz implements kjd<ProfileModel, pjr> {
    public final ViewGroup a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final LoadingView c;
    /* access modifiers changed from: private */
    public final fun d;
    /* access modifiers changed from: private */
    public final AppBarLayout e = ((AppBarLayout) this.a.findViewById(R.id.header_view));
    /* access modifiers changed from: private */
    public final fxn f = fsi.a(this.b);
    /* access modifiers changed from: private */
    public final jwv g;
    private final jxc h;
    /* access modifiers changed from: private */
    public final pjy i;
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

    public pjz(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, BadgesFactory badgesFactory, jwv jwv) {
        this.b = context;
        this.g = jwv;
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        this.f.a(this.b.getString(R.string.profile_title));
        View findViewById = this.a.findViewById(R.id.header_content);
        this.i = new pjy(findViewById);
        this.e.a((b) new $$Lambda$pjz$fsZL8lK7HS_HkQVC8MeCcndU1HM(this, findViewById));
        uwh uwh = new uwh();
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(1, false));
        recyclerView.a((a) uwh);
        View inflate = layoutInflater.inflate(R.layout.profile_tabs, recyclerView, false);
        inflate.setBackgroundColor(0);
        uwh.a((a<H>) new jlu<H>(inflate), 0);
        this.j = inflate.findViewById(R.id.playlists_layout);
        this.k = inflate.findViewById(R.id.followers_layout);
        this.l = inflate.findViewById(R.id.following_layout);
        this.m = (TextView) inflate.findViewById(R.id.playlists_count);
        this.n = (TextView) inflate.findViewById(R.id.followers_count);
        this.o = (TextView) inflate.findViewById(R.id.following_count);
        uui.c(this.j).a(this.m, inflate.findViewById(R.id.playlists_label)).a();
        uui.c(this.k).a(this.n, inflate.findViewById(R.id.followers_label)).a();
        uui.c(this.l).a(this.o, inflate.findViewById(R.id.following_label)).a();
        this.p = (Button) this.a.findViewById(R.id.edit_button);
        this.q = (ToggleButton) this.a.findViewById(R.id.follow_button);
        this.c = LoadingView.a(layoutInflater, this.b, this.a);
        this.c.setLayoutParams(new LayoutParams(-1, -1));
        this.a.addView(this.c);
        this.d = fus.a(this.b, viewGroup);
        this.d.getView().setVisibility(8);
        this.a.addView(this.d.getView());
        this.h = new jxc(this.b, badgesFactory);
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

    public final kje<ProfileModel> connect(final kkn<pjr> kkn) {
        return new kje<ProfileModel>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                ProfileModel profileModel = (ProfileModel) obj;
                if (profileModel.k() == LoadingState.LOADING || profileModel.k() == LoadingState.INIT) {
                    pjz.this.e.setVisibility(8);
                    if (!pjz.this.c.d()) {
                        pjz.this.c.a();
                    }
                    return;
                }
                pjz.this.c.b();
                if (profileModel.k() == LoadingState.FAILED) {
                    pjz.this.e.setVisibility(8);
                    pjz.this.d.a((int) R.string.profile_error_title);
                    pjz.this.d.b((int) R.string.profile_error_subtitle);
                    pjz.this.d.getView().setVisibility(0);
                } else if (profileModel.k() == LoadingState.OFFLINE) {
                    pjz.this.e.setVisibility(8);
                    pjz.this.d.a((int) R.string.profile_offline_title);
                    pjz.this.d.b((int) R.string.profile_offline_subtitle);
                    pjz.this.d.getView().setVisibility(0);
                } else {
                    ip.a((View) pjz.this.e, (Drawable) fwf.a(pjz.this.b, gb.b(pjz.this.b.getResources(), R.color.glue_blue_light, null)));
                    pjz.this.d.getView().setVisibility(8);
                    pjz.this.e.setVisibility(0);
                    pjz.this.i.b.setText(profileModel.c());
                    pjz.this.f.a(profileModel.c());
                    pjz.this.g.a(pjz.this.i.a, !TextUtils.isEmpty(profileModel.d()) ? Uri.parse(profileModel.d()) : Uri.EMPTY, pjz.a(pjz.this, profileModel));
                    pjz.a(pjz.this.j, pjz.this.m, profileModel.g());
                    pjz.a(pjz.this.k, pjz.this.n, profileModel.h());
                    pjz.a(pjz.this.l, pjz.this.o, profileModel.i());
                    if (profileModel.j()) {
                        pjz.this.p.setVisibility(0);
                        pjz.this.p.setOnClickListener(new $$Lambda$pjz$1$T4_inS6RB6QDg5VSKNVsAjPSgOQ(kkn));
                        pjz.this.q.setVisibility(8);
                        return;
                    }
                    pjz.this.p.setVisibility(8);
                    pjz.this.q.setVisibility(0);
                    if (profileModel.f()) {
                        pjz.this.q.setChecked(true);
                    } else {
                        pjz.this.q.setChecked(false);
                    }
                }
            }
        };
    }

    static /* synthetic */ utt a(pjz pjz, ProfileModel profileModel) {
        return profileModel.e() ? pjz.h : uuz.a();
    }

    static /* synthetic */ void a(View view, TextView textView, int i2) {
        textView.setText(String.valueOf(i2));
        view.setClickable(i2 > 0);
    }
}
