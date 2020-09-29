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

/* renamed from: vol reason: default package */
public final class vol implements kmm<vnu, vns>, vmr, vok {
    public final View a;
    private final PodcastOnboardingLogger b;
    /* access modifiers changed from: private */
    public final vms c;
    private final TextView d = ((TextView) this.a.findViewById(R.id.title));
    private final TextView e = ((TextView) this.a.findViewById(R.id.toolbar_title));
    private final AppBarLayout f = ((AppBarLayout) this.a.findViewById(R.id.app_bar_layout));
    private final ProgressBar g = ((ProgressBar) this.a.findViewById(R.id.podcast_onboarding_loading_progress));
    private final TextView h = ((TextView) this.a.findViewById(R.id.podcast_onboarding_error_message_title));
    private final TextView i = ((TextView) this.a.findViewById(R.id.podcast_onboarding_error_message_body));
    private final RecyclerView j = ((RecyclerView) this.a.findViewById(R.id.podcast_onboarding_topics_grid));
    private final voj k;
    /* access modifiers changed from: private */
    public final Button l = ((Button) this.a.findViewById(R.id.podcast_onboarding_topics_done_button));
    private final View m = this.a.findViewById(R.id.podcast_onboarding_done_button_overlay);
    /* access modifiers changed from: private */
    public final vnm n;
    /* access modifiers changed from: private */
    public Disposable o;
    /* access modifiers changed from: private */
    public knw<vns> p;

    public vol(View view, vms vms, PodcastOnboardingLogger podcastOnboardingLogger, vnm vnm, Picasso picasso) {
        this.a = view;
        this.c = vms;
        this.b = podcastOnboardingLogger;
        this.n = vnm;
        this.g.getIndeterminateDrawable().setColorFilter(fr.c(this.g.getContext(), R.color.white), Mode.SRC_IN);
        this.k = new voj(picasso);
        voj voj = this.k;
        voj.a = this.b;
        RecyclerView recyclerView = this.j;
        recyclerView.q = true;
        recyclerView.a((a) voj);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.a.getContext());
        flexboxLayoutManager.f(0);
        this.j.a((i) flexboxLayoutManager);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, View view) {
        this.p.accept(new f());
        alertDialog.dismiss();
        this.b.d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new IllegalStateException("ClickSubject must be set!");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw) {
        knw.accept(new e());
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, View view) {
        knw.accept(new c());
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, c cVar) {
        voh voh = cVar.a;
        int i2 = cVar.b;
        if (voh.d()) {
            knw.accept(new g(i2));
            this.b.b(voh.a(), i2);
            return;
        }
        knw.accept(new h(i2));
        this.b.a(voh.a(), i2);
    }

    static /* synthetic */ void a(vol vol, vnu vnu) {
        int i2 = vnu.d() ? R.string.podcast_onboarding_header_after_tob : R.string.podcast_onboarding_header;
        vol.d.setText(i2);
        vol.e.setText(i2);
        vnv a2 = vnu.a();
        int i3 = 0;
        vol.g.setVisibility(a2 instanceof c ? 0 : 8);
        boolean z = a2 instanceof a;
        vol.h.setVisibility(z ? 0 : 8);
        vol.i.setVisibility(z ? 0 : 8);
        if (z) {
            vol.b.g();
        }
        boolean z2 = a2 instanceof b;
        vol.j.setVisibility(z2 ? 0 : 8);
        vol.f.setVisibility(z2 ? 0 : 8);
        vol.l.setVisibility((!z2 || !vnu.c()) ? 8 : 0);
        View view = vol.m;
        if (!z2 || !vnu.c()) {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (z2 && vol.l.getVisibility() == 0) {
            vol.b.e();
        }
        if (z2) {
            voj voj = vol.k;
            ImmutableList<voe> immutableList = ((b) vnu.a()).a;
            b a3 = oa.a(new b(voj.d, immutableList));
            voj.d = (ImmutableList) fbp.a(immutableList);
            a3.a((a) voj);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        this.b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(AlertDialog alertDialog, View view) {
        this.p.accept(new f());
        alertDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(AlertDialog alertDialog, View view) {
        this.p.accept(new d());
        alertDialog.dismiss();
    }

    public final void a() {
        knw<vns> knw = this.p;
        if (knw != null) {
            knw.accept(new a());
        }
    }

    public final void a(Set<voh> set) {
        this.c.a(vna.a(set));
    }

    public final void b() {
        Context context = (Context) fbp.a(this.a.getContext());
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_onboarding_skip_dialog, null);
        Resources resources = context.getResources();
        AlertDialog a2 = vom.a(inflate, resources.getString(R.string.podcast_onboarding_skip_dialog_title), resources.getString(R.string.podcast_onboarding_skip_dialog_body), resources.getString(R.string.podcast_onboarding_skip_dialog_continue), resources.getString(R.string.podcast_onboarding_skip_dialog_skip));
        Button button = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_continue_button);
        Button button2 = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_skip_button);
        button.setOnClickListener(new $$Lambda$vol$yzUZTPc8zgKTKWv0XGwlOrxlmc(this, a2));
        button2.setOnClickListener(new $$Lambda$vol$Bt45vQwIoIDz2tWwZWiYVcQ9vQ(this, a2));
        a2.show();
        this.b.f();
    }

    public final void c() {
        this.c.a.finish();
    }

    public final kmn<vnu> connect(knw<vns> knw) {
        this.p = knw;
        Activity activity = this.c.a;
        if (activity instanceof PodcastOnboardingActivity) {
            ((PodcastOnboardingActivity) activity).h = this;
        }
        this.o = this.k.e.a((Consumer<? super T>) new $$Lambda$vol$7BzAf4uOOh9ITuUTPQ0QV5Wv3kY<Object>(this, knw), (Consumer<? super Throwable>) $$Lambda$vol$fNfCu5JcqLzOxsZqkARtdLMwGR8.INSTANCE);
        this.l.setOnClickListener(new $$Lambda$vol$fUBIuWX0gPO_ZYNU6cvLwItrghg(this, knw));
        this.n.a(new $$Lambda$vol$_uS3NY9UqXvQy97pDPm7hrw0qc(this, knw));
        return new kmn<vnu>() {
            public final /* synthetic */ void accept(Object obj) {
                vol.a(vol.this, (vnu) obj);
            }

            public final void dispose() {
                Activity activity = vol.this.c.a;
                if (activity instanceof PodcastOnboardingActivity) {
                    ((PodcastOnboardingActivity) activity).h = null;
                }
                vol.this.o.bd_();
                vol.this.l.setOnClickListener(null);
                vol.this.n.a(null);
                vol.this.p = null;
            }
        };
    }

    public final void d() {
        Context context = (Context) fbp.a(this.a.getContext());
        View inflate = LayoutInflater.from(context).inflate(R.layout.podcast_onboarding_skip_dialog, null);
        Resources resources = context.getResources();
        AlertDialog a2 = vom.a(inflate, resources.getString(R.string.podcast_onboarding_retry_dialog_title), resources.getString(R.string.podcast_onboarding_retry_dialog_body), resources.getString(R.string.podcast_onboarding_retry_dialog_top_button), resources.getString(R.string.podcast_onboarding_retry_dialog_bottom_button));
        Button button = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_continue_button);
        Button button2 = (Button) inflate.findViewById(R.id.podcast_onboarding_skip_dialog_skip_button);
        button.setOnClickListener(new $$Lambda$vol$piXhQejMxKZZmDrvcJSlrnn5ing(this, a2));
        button2.setOnClickListener(new $$Lambda$vol$yY2mHgYE4jWV6sVc5oUR5SGTLfQ(this, a2));
        a2.show();
    }
}
