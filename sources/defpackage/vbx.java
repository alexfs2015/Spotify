package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.podcastonboarding.PodcastOnboardingActivity;
import com.spotify.podcastonboarding.logger.PodcastOnboardingLogger;
import com.squareup.picasso.Picasso;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Set;

/* renamed from: vbx reason: default package */
public final class vbx implements kjd<vbg, vbe>, vad, vbw {
    public final View a;
    private final PodcastOnboardingLogger b;
    /* access modifiers changed from: private */
    public final vae c;
    private final TextView d = ((TextView) this.a.findViewById(R.id.title));
    private final TextView e = ((TextView) this.a.findViewById(R.id.toolbar_title));
    private final AppBarLayout f = ((AppBarLayout) this.a.findViewById(R.id.app_bar_layout));
    private final ProgressBar g = ((ProgressBar) this.a.findViewById(R.id.podcast_onboarding_loading_progress));
    private final TextView h = ((TextView) this.a.findViewById(R.id.podcast_onboarding_error_message_title));
    private final TextView i = ((TextView) this.a.findViewById(R.id.podcast_onboarding_error_message_body));
    private final RecyclerView j = ((RecyclerView) this.a.findViewById(R.id.podcast_onboarding_topics_grid));
    private final vbv k;
    /* access modifiers changed from: private */
    public final Button l = ((Button) this.a.findViewById(R.id.podcast_onboarding_topics_done_button));
    private final View m = this.a.findViewById(R.id.podcast_onboarding_done_button_overlay);
    /* access modifiers changed from: private */
    public final vay n;
    /* access modifiers changed from: private */
    public Disposable o;
    /* access modifiers changed from: private */
    public kkn<vbe> p;

    public vbx(View view, vae vae, PodcastOnboardingLogger podcastOnboardingLogger, vay vay, Picasso picasso) {
        this.a = view;
        this.c = vae;
        this.b = podcastOnboardingLogger;
        this.n = vay;
        this.g.getIndeterminateDrawable().setColorFilter(fr.c(this.g.getContext(), R.color.white), Mode.SRC_IN);
        this.k = new vbv(picasso);
        vbv vbv = this.k;
        vbv.a = this.b;
        RecyclerView recyclerView = this.j;
        recyclerView.q = true;
        recyclerView.a((a) vbv);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.a.getContext());
        flexboxLayoutManager.f(0);
        this.j.a((i) flexboxLayoutManager);
    }

    public final kje<vbg> connect(kkn<vbe> kkn) {
        this.p = kkn;
        Activity activity = this.c.a;
        if (activity instanceof PodcastOnboardingActivity) {
            ((PodcastOnboardingActivity) activity).h = this;
        }
        this.o = this.k.e.a((Consumer<? super T>) new $$Lambda$vbx$Ul2I9DUrLEeqnQlRpvhYfTiWlu8<Object>(this, kkn), (Consumer<? super Throwable>) $$Lambda$vbx$rt2p6ps_RmiXjCufdqtU4mwWsnY.INSTANCE);
        this.l.setOnClickListener(new $$Lambda$vbx$Fk22_QUoAdKdkvZXHmuQa2JIkHQ(this, kkn));
        this.n.a(new $$Lambda$vbx$q43neTNOiKhM3y512CM4Oi8HXw(this, kkn));
        return new kje<vbg>() {
            public final /* synthetic */ void accept(Object obj) {
                vbx.a(vbx.this, (vbg) obj);
            }

            public final void dispose() {
                Activity activity = vbx.this.c.a;
                if (activity instanceof PodcastOnboardingActivity) {
                    ((PodcastOnboardingActivity) activity).h = null;
                }
                vbx.this.o.bf_();
                vbx.this.l.setOnClickListener(null);
                vbx.this.n.a(null);
                vbx.this.p = null;
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new IllegalStateException("ClickSubject must be set!");
    }

    public final void a() {
        kkn<vbe> kkn = this.p;
        if (kkn != null) {
            kkn.accept(new a());
        }
    }

    public final void d() {
        Context context = (Context) fay.a(this.a.getContext());
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_onboarding_skip_dialog, null);
        Resources resources = context.getResources();
        AlertDialog a2 = vby.a(inflate, resources.getString(R.string.podcast_onboarding_retry_dialog_title), resources.getString(R.string.podcast_onboarding_retry_dialog_body), resources.getString(R.string.podcast_onboarding_retry_dialog_top_button), resources.getString(R.string.podcast_onboarding_retry_dialog_bottom_button));
        Button button = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_continue_button);
        Button button2 = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_skip_button);
        button.setOnClickListener(new $$Lambda$vbx$E8wqB8odpP6F7Nklsf3So65Hq2E(this, a2));
        button2.setOnClickListener(new $$Lambda$vbx$fU9mGBakagA3f21iIlTOo14ybU(this, a2));
        a2.show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(AlertDialog alertDialog, View view) {
        this.p.accept(new d());
        alertDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(AlertDialog alertDialog, View view) {
        this.p.accept(new f());
        alertDialog.dismiss();
    }

    public final void b() {
        Context context = (Context) fay.a(this.a.getContext());
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_onboarding_skip_dialog, null);
        Resources resources = context.getResources();
        AlertDialog a2 = vby.a(inflate, resources.getString(R.string.podcast_onboarding_skip_dialog_title), resources.getString(R.string.podcast_onboarding_skip_dialog_body), resources.getString(R.string.podcast_onboarding_skip_dialog_continue), resources.getString(R.string.podcast_onboarding_skip_dialog_skip));
        Button button = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_continue_button);
        Button button2 = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_skip_button);
        button.setOnClickListener(new $$Lambda$vbx$32gjYCyX43EkLK8NviYmFT4K9rQ(this, a2));
        button2.setOnClickListener(new $$Lambda$vbx$z7ZDTLNto0DV2ZicSyzoUgI_L1A(this, a2));
        a2.show();
        this.b.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        this.b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, View view) {
        this.p.accept(new f());
        alertDialog.dismiss();
        this.b.d();
    }

    public final void a(Set<vbt> set) {
        this.c.a(vam.a(set));
    }

    public final void c() {
        this.c.a.finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn) {
        kkn.accept(new e());
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, View view) {
        kkn.accept(new c());
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, c cVar) {
        vbt vbt = cVar.a;
        int i2 = cVar.b;
        if (vbt.d()) {
            kkn.accept(new g(i2));
            this.b.b(vbt.a(), i2);
            return;
        }
        kkn.accept(new h(i2));
        this.b.a(vbt.a(), i2);
    }

    static /* synthetic */ void a(vbx vbx, vbg vbg) {
        int i2 = vbg.d() ? R.string.podcast_onboarding_header_after_tob : R.string.podcast_onboarding_header;
        vbx.d.setText(i2);
        vbx.e.setText(i2);
        vbh a2 = vbg.a();
        int i3 = 0;
        vbx.g.setVisibility(a2 instanceof c ? 0 : 8);
        boolean z = a2 instanceof a;
        vbx.h.setVisibility(z ? 0 : 8);
        vbx.i.setVisibility(z ? 0 : 8);
        if (z) {
            vbx.b.g();
        }
        boolean z2 = a2 instanceof b;
        vbx.j.setVisibility(z2 ? 0 : 8);
        vbx.f.setVisibility(z2 ? 0 : 8);
        vbx.l.setVisibility((!z2 || !vbg.c()) ? 8 : 0);
        View view = vbx.m;
        if (!z2 || !vbg.c()) {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (z2 && vbx.l.getVisibility() == 0) {
            vbx.b.e();
        }
        if (z2) {
            vbv vbv = vbx.k;
            ImmutableList<vbq> immutableList = ((b) vbg.a()).a;
            b a3 = nv.a(new b(vbv.d, immutableList));
            vbv.d = (ImmutableList) fay.a(immutableList);
            a3.a((a) vbv);
        }
    }
}
