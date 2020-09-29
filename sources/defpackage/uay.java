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

/* renamed from: uay reason: default package */
public final class uay implements gru {
    final ubi a;
    public final SerialDisposable b = new SerialDisposable();
    public defpackage.gru.a c;
    public a d;
    private final Picasso e;
    private final uau f;
    private final udm g;
    private final uci h;
    private final ubn i;
    private final Scheduler j;
    private final ufm k;
    private final uwj l;
    private final Context m;
    private final iww n;
    private final fpt o;
    private final SpotifyIconDrawable p;
    private final fbd<Observable<SocialListeningDeviceModel>> q = Suppliers.a((fbd<T>) new $$Lambda$uay$PYp6WzPWgiPJYvTawXLOTPvZVtQ<T>(this));
    private com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b r = com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a;
    private SocialListeningDeviceModel s;

    /* renamed from: uay$a */
    public interface a {
        void openParticipantList();
    }

    /* renamed from: uay$b */
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

    public final int a() {
        return 101;
    }

    public final int[] c() {
        return new int[]{101};
    }

    public uay(Picasso picasso, uau uau, udm udm, uci uci, ubn ubn, Scheduler scheduler, ufm ufm, uwj uwj, Context context, iww iww, ubi ubi, fpt fpt) {
        this.e = picasso;
        this.f = uau;
        this.g = udm;
        this.h = uci;
        this.i = ubn;
        this.j = scheduler;
        this.k = ufm;
        this.l = uwj;
        this.m = context;
        this.n = iww;
        this.a = ubi;
        this.o = fpt;
        this.i.a = new $$Lambda$uay$pBUN2TdWYSBrU4bxcEoVhRq9Xs(this);
        this.p = new SpotifyIconDrawable(this.m, SpotifyIconV2.SHARE_ANDROID, this.m.getResources().getDimension(R.dimen.share_button_size));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.a.accept(new defpackage.ubf.b());
        this.h.a("navigate-to-participants", -1);
    }

    public final u a(ViewGroup viewGroup, int i2) {
        b bVar = new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.social_listening, viewGroup, false));
        bVar.k.a((androidx.recyclerview.widget.RecyclerView.a) this.i);
        bVar.g.setImageDrawable(this.p);
        bVar.j.setOnClickListener(new $$Lambda$uay$nrs3smpFQcDfUqquX3Ad42JWJ8I(this));
        bVar.l.setOnClickListener(new $$Lambda$uay$vZtpSzXHIlEcP_T4LQc10pkQu5A(this));
        bVar.m.setOnClickListener(new $$Lambda$uay$zAbj2ssK7EQJhUSeupaY4pc9l4Q(this));
        bVar.n.setOnClickListener(new $$Lambda$uay$znpYgGl8hOdvHVUNd_oMKVn3TD8(this));
        if (ubp.b(this.o)) {
            bVar.f.setVisibility(0);
            bVar.g.setOnClickListener(new $$Lambda$uay$IBvfguiyE838WF9QWyaMjtlf3UM(this));
        } else {
            int dimensionPixelOffset = this.m.getResources().getDimensionPixelOffset(R.dimen.code_layout_padding);
            int dimensionPixelOffset2 = this.m.getResources().getDimensionPixelOffset(R.dimen.code_layout_padding_share_link_enabled);
            bVar.i.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            bVar.f.setVisibility(8);
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.a.accept(new n());
        this.h.a("try-again", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.a.accept(new g());
        this.h.a("scan-code", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.accept(new d());
        this.h.a("leave-session", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.accept(ubf.a(false));
        this.h.a("end-session", -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.accept(new l());
        this.h.a("share-social-link", -1);
    }

    public final void a(u uVar, int i2) {
        if (uVar instanceof b) {
            b bVar = (b) uVar;
            ubn ubn = this.i;
            ImmutableList b2 = this.r.b();
            if (!faw.a(ubn.d, b2)) {
                ubn.d = ImmutableList.a((Collection<? extends E>) b2);
                ubn.e();
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
                this.e.a((String) this.r.e().c()).a(bVar.e, (vrt) new vrt() {
                    public final void a() {
                        uay.this.a.accept(new j());
                    }

                    public final void b() {
                        uay.this.a.accept(new i());
                        Logger.e("social listening device: Image loading failed", new Object[0]);
                    }
                });
            }
            if (this.r.g()) {
                if (this.r.d().b()) {
                    int intValue = ((Integer) this.r.d().c()).intValue();
                    bVar.i.getBackground().setColorFilter(intValue, Mode.SRC_IN);
                    bVar.g.setBackgroundColor(intValue);
                    this.p.a(ubt.a(intValue) ? -16777216 : -1);
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

    public final long a(int i2) {
        return (long) "social_listening".hashCode();
    }

    public final int b() {
        return this.r.a() ? 1 : 0;
    }

    public final void d() {
        this.b.a(((Observable) this.q.get()).c((Function<? super T, ? extends R>) $$Lambda$fwjX6ftSNI2j6X5YCHq_KXFiRyc.INSTANCE).a(Functions.a()).a(this.j).a((Consumer<? super T>) new $$Lambda$uay$JviRqx6YrbFTQPpkrWAKh3wNOU<Object>(this), (Consumer<? super Throwable>) $$Lambda$uay$CcW0qthoFLOSretxfyBl75pn8Og.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b bVar) {
        this.r = bVar;
        defpackage.gru.a aVar = this.c;
        if (aVar != null) {
            aVar.update();
        }
    }

    /* access modifiers changed from: private */
    public Observable<SocialListeningDeviceModel> e() {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$uay$snOTuxVEgKD4QPoPrZoSrip7yoY<Object>(this)).a(1).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource h() {
        Observable d2 = Observable.d();
        $$Lambda$ajtaVWt8J5Zu_Ip07pA0KEbhetY r1 = $$Lambda$ajtaVWt8J5Zu_Ip07pA0KEbhetY.INSTANCE;
        Context context = this.m;
        uau uau = this.f;
        uwj uwj = this.l;
        Picasso picasso = this.e;
        iww iww = this.n;
        udm udm = this.g;
        uci uci = this.h;
        ubi ubi = this.a;
        a aVar = this.d;
        Scheduler scheduler = this.j;
        defpackage.kju.a a2 = klb.a((kjz<M, E, F>) r1, klb.a().a(defpackage.ube.a.class, ubh.a(context, picasso, scheduler)).a(e.class, ubh.a(context, uci), scheduler).a(d.class, ubh.a(aVar), scheduler).a(f.class, ubh.a(context, iww), scheduler).a(g.class, ubh.a(udm, uci, ubi), scheduler).a(h.class, ubh.a(udm), scheduler).a(defpackage.ube.b.class, ubh.a(context, uau, uwj, scheduler)).a(c.class, ubh.a(uau)).a()).b($$Lambda$uay$Dvr0ONQODhB55yYuNjp4rKS_F2g.INSTANCE).a((kkp<kkv>) $$Lambda$uay$oxUY4JOPr359aWVemmeTgDxh0K0.INSTANCE);
        ubi ubi2 = this.a;
        uau uau2 = this.f;
        defpackage.kju.a a3 = a2.a(kla.a(ubi2.a, ubk.c(uau2), ubk.a(uau2), ubk.b(uau2), ubk.a(this.k)));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return d2.a(klb.a((c<M, E, F>) a3, fav.a(this.s, SocialListeningDeviceModel.a))).b((Consumer<? super T>) new $$Lambda$uay$j7A_aGKrMcJzkJJRpCzaAmUXVtM<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SocialListeningDeviceModel socialListeningDeviceModel) {
        this.s = socialListeningDeviceModel;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv g() {
        return new kld(Schedulers.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv f() {
        return new kld(Schedulers.a());
    }
}
