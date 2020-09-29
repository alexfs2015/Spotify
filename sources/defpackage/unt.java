package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel;
import com.spotify.music.sociallistening.facepile.FacePile;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: unt reason: default package */
public final class unt implements gtw {
    final uod a;
    public final SerialDisposable b = new SerialDisposable();
    public defpackage.gtw.a c;
    public a d;
    private final Picasso e;
    private final unp f;
    private final uqh g;
    private final upd h;
    private final uoi i;
    private final Scheduler j;
    private final ura k;
    private final via l;
    private final Context m;
    private final izh n;
    private final fqn o;
    private final SpotifyIconDrawable p;
    private final fbu<Observable<SocialListeningDeviceModel>> q = Suppliers.a((fbu<T>) new $$Lambda$unt$5xpLiXuWq7YQ156vRXjgHTafTb8<T>(this));
    private com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b r = com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a;
    private SocialListeningDeviceModel s;

    /* renamed from: unt$a */
    public interface a {
        void openParticipantList();
    }

    /* renamed from: unt$b */
    public static class b extends u {
        final TextView a;
        final TextView b;
        final LinearLayout c;
        final View d;
        final ImageView e;
        final LinearLayout f;
        final ImageButton g;
        final View h;
        final LinearLayout i;
        final Button j;
        final FacePile k;
        final Button l;
        final Button m;
        final Button n;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.social_listening_title);
            this.b = (TextView) view.findViewById(R.id.social_listening_subtitle);
            this.d = view.findViewById(R.id.loading_view_layout);
            this.h = view.findViewById(R.id.code_container);
            this.i = (LinearLayout) view.findViewById(R.id.code_layout);
            this.e = (ImageView) view.findViewById(R.id.scannable);
            this.f = (LinearLayout) view.findViewById(R.id.share_code_container);
            this.g = (ImageButton) view.findViewById(R.id.share_code_button);
            this.c = (LinearLayout) view.findViewById(R.id.error_layout);
            this.j = (Button) view.findViewById(R.id.error_retry_button);
            this.k = (FacePile) view.findViewById(R.id.facepile);
            this.l = (Button) view.findViewById(R.id.scan_code_button);
            this.m = (Button) view.findViewById(R.id.leave_button);
            this.n = (Button) view.findViewById(R.id.end_button);
        }
    }

    public unt(Picasso picasso, unp unp, uqh uqh, upd upd, uoi uoi, Scheduler scheduler, ura ura, via via, Context context, izh izh, uod uod, fqn fqn) {
        this.e = picasso;
        this.f = unp;
        this.g = uqh;
        this.h = upd;
        this.i = uoi;
        this.j = scheduler;
        this.k = ura;
        this.l = via;
        this.m = context;
        this.n = izh;
        this.a = uod;
        this.o = fqn;
        this.i.a = new $$Lambda$unt$jVx0CBtkrcUJ0G7Gd58ZTqsy_88(this);
        this.p = new SpotifyIconDrawable(this.m, SpotifyIconV2.SHARE_ANDROID, this.m.getResources().getDimension(R.dimen.share_button_size));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.accept(new l());
        this.h.a("share-social-link", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b bVar) {
        this.r = bVar;
        defpackage.gtw.a aVar = this.c;
        if (aVar != null) {
            aVar.update();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SocialListeningDeviceModel socialListeningDeviceModel) {
        this.s = socialListeningDeviceModel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.accept(uoa.a(false));
        this.h.a("end-session", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.accept(new d());
        this.h.a("leave-session", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.a.accept(new g());
        this.h.a("scan-code", -1);
    }

    /* access modifiers changed from: private */
    public Observable<SocialListeningDeviceModel> e() {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$unt$xf3Nmw3vL8m9ZisyYLAAsmde5d8<Object>(this)).a(1).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.a.accept(new n());
        this.h.a("try-again", -1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe f() {
        return new kom(Schedulers.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.a.accept(new defpackage.uoa.b());
        this.h.a("navigate-to-participants", -1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe g() {
        return new kom(Schedulers.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource h() {
        Observable d2 = Observable.d();
        $$Lambda$zZNgxBH2tRAFJ3ep5Grl1fGWEZ0 r1 = $$Lambda$zZNgxBH2tRAFJ3ep5Grl1fGWEZ0.INSTANCE;
        Context context = this.m;
        unp unp = this.f;
        via via = this.l;
        Picasso picasso = this.e;
        izh izh = this.n;
        uqh uqh = this.g;
        upd upd = this.h;
        uod uod = this.a;
        a aVar = this.d;
        Scheduler scheduler = this.j;
        defpackage.knd.a a2 = kok.a((kni<M, E, F>) r1, kok.a().a(defpackage.unz.a.class, uoc.a(context, picasso, scheduler)).a(e.class, uoc.a(context, upd), scheduler).a(d.class, uoc.a(aVar), scheduler).a(f.class, uoc.a(context, izh), scheduler).a(g.class, uoc.a(uqh, upd, uod), scheduler).a(h.class, uoc.a(uqh), scheduler).a(defpackage.unz.b.class, uoc.a(context, unp, via, scheduler)).a(c.class, uoc.a(unp)).a()).b($$Lambda$unt$Mb1vjQ9KUM8ozzLBoNL7WcEJ20s.INSTANCE).a((kny<koe>) $$Lambda$unt$9_DBeFxFI1t6UBQX5zmWCQcuRhI.INSTANCE);
        uod uod2 = this.a;
        unp unp2 = this.f;
        defpackage.knd.a a3 = a2.a(koj.a(uod2.a, uof.c(unp2), uof.a(unp2), uof.b(unp2), uof.a(this.k)));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return d2.a(kok.a((c<M, E, F>) a3, fbm.a(this.s, SocialListeningDeviceModel.a))).b((Consumer<? super T>) new $$Lambda$unt$1vEwHrkLc71t12MYmuDgdVhN9YA<Object>(this));
    }

    public final int a() {
        return 101;
    }

    public final long a(int i2) {
        return (long) "social_listening".hashCode();
    }

    public final u a(ViewGroup viewGroup, int i2) {
        b bVar = new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.social_listening, viewGroup, false));
        bVar.k.a((androidx.recyclerview.widget.RecyclerView.a) this.i);
        bVar.g.setImageDrawable(this.p);
        bVar.j.setOnClickListener(new $$Lambda$unt$uXZadD8KI_zg9WqNqdkSd2Zbqg(this));
        bVar.l.setOnClickListener(new $$Lambda$unt$5f9BCowXLzqyINTUgPBUHDjh9M(this));
        bVar.m.setOnClickListener(new $$Lambda$unt$pCY61ahRfZ0KFM0pd2VxhVTlg_E(this));
        bVar.n.setOnClickListener(new $$Lambda$unt$kR1dqsNwgHVDKyoIxtUM8tBH57A(this));
        if (uok.b(this.o)) {
            bVar.f.setVisibility(0);
            bVar.g.setOnClickListener(new $$Lambda$unt$8pJZr5MyWYJUnB_bOK9XIdOfE7g(this));
        } else {
            int dimensionPixelOffset = this.m.getResources().getDimensionPixelOffset(R.dimen.code_layout_padding);
            int dimensionPixelOffset2 = this.m.getResources().getDimensionPixelOffset(R.dimen.code_layout_padding_share_link_enabled);
            bVar.i.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            bVar.f.setVisibility(8);
        }
        return bVar;
    }

    public final void a(u uVar, int i2) {
        if (uVar instanceof b) {
            b bVar = (b) uVar;
            uoi uoi = this.i;
            ImmutableList b2 = this.r.b();
            if (!fbn.a(uoi.d, b2)) {
                uoi.d = ImmutableList.a((Collection<? extends E>) b2);
                uoi.e();
            }
            bVar.d.setVisibility(this.r.f() ? 0 : 4);
            if (this.r.c()) {
                bVar.a.setText(R.string.social_listening_title_in_session);
                bVar.b.setText(R.string.social_listening_subtitle_in_session);
            } else {
                bVar.a.setText(R.string.social_listening_title_no_session);
                bVar.b.setText(R.string.social_listening_subtitle_no_session);
            }
            if (this.r.e().b()) {
                this.e.a((String) this.r.e().c()).a(bVar.e, (wfz) new wfz() {
                    public final void a() {
                        unt.this.a.accept(new j());
                    }

                    public final void b() {
                        unt.this.a.accept(new i());
                        Logger.e("social listening device: Image loading failed", new Object[0]);
                    }
                });
            }
            if (this.r.g()) {
                if (this.r.d().b()) {
                    int intValue = ((Integer) this.r.d().c()).intValue();
                    bVar.i.getBackground().setColorFilter(intValue, Mode.SRC_IN);
                    bVar.g.setBackgroundColor(intValue);
                    this.p.a(uoo.a(intValue) ? -16777216 : -1);
                }
                bVar.h.setVisibility(0);
            } else {
                bVar.h.setVisibility(4);
            }
            bVar.l.setVisibility(this.r.h() ? 0 : 4);
            bVar.m.setVisibility(this.r.i() ? 0 : 4);
            bVar.n.setVisibility(this.r.j() ? 0 : 4);
            if (this.r.k()) {
                bVar.c.setVisibility(0);
                return;
            }
            bVar.c.setVisibility(4);
        }
    }

    public final int b() {
        return this.r.a() ? 1 : 0;
    }

    public final int[] c() {
        return new int[]{101};
    }

    public final void d() {
        this.b.a(((Observable) this.q.get()).c((Function<? super T, ? extends R>) $$Lambda$fwjX6ftSNI2j6X5YCHq_KXFiRyc.INSTANCE).a(Functions.a()).a(this.j).a((Consumer<? super T>) new $$Lambda$unt$Z7NnMi0IICWvviUig6rYdlVPcSE<Object>(this), (Consumer<? super Throwable>) $$Lambda$unt$huCmctbQDH_44QdLwNvbXkrScSg.INSTANCE));
    }
}
