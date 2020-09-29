package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.LongClickAction;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.tasteonboarding.TasteOnboardingActivity;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import dagger.android.DispatchingAndroidInjector;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.EnumMap;

/* renamed from: npp reason: default package */
public class npp extends jrd implements com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a, jqx, npu, defpackage.nts.a, ntz, ozk, uqq, whx {
    public defpackage.nta.a T;
    public b U;
    public nrq V;
    public npm W;
    public nsg X;
    public nsj Y;
    public nrt Z;
    public npq a;
    public sso aa;
    public nty ab;
    public ToastieManager ac;
    public nps ad;
    public opf ae;
    public opd af;
    public defpackage.oym.a ag;
    public defpackage.oqa.a ah;
    public npv ai;
    private nrw aj;
    /* access modifiers changed from: private */
    public oym ak;
    /* access modifiers changed from: private */
    public oqa al;
    private final SerialDisposable am = new SerialDisposable();
    /* access modifiers changed from: private */
    public pcl an;
    private nsf ao;
    /* access modifiers changed from: private */
    public fqn ap;
    /* access modifiers changed from: private */
    public View aq;
    private final Handler ar = new Handler();
    private a as;
    /* access modifiers changed from: private */
    public nrk at;
    public DispatchingAndroidInjector<Object> b;

    /* renamed from: npp$a */
    class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(npp npp, byte b) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ViewGroup viewGroup, nrk nrk) {
            if (npp.this.aq != null) {
                viewGroup.removeView(nrk);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(nrk nrk, ViewGroup viewGroup) {
            ip.n(nrk).a(400).a(0.0f).a((Runnable) new $$Lambda$npp$a$bGRkU4kw44EberVfy8w_rKMuO0(this, viewGroup, nrk)).c();
        }

        public final void run() {
            nrk a2 = npp.this.at;
            if (a2 != null) {
                ViewGroup viewGroup = (ViewGroup) npp.this.aq.findViewById(R.id.container);
                a2.setVisibility(0);
                npp.this.ad.c.a().a(nps.b, true).b();
                viewGroup.getHandler().postDelayed(new $$Lambda$npp$a$hiERvl4yEjKt4vAAemMm2oeJNZU(this, a2, viewGroup), 3000);
            }
        }
    }

    public static npp a(fqn fqn, String str) {
        npp npp = new npp();
        fqo.a((Fragment) npp, fqn);
        Bundle bundle = npp.i;
        if (bundle == null) {
            bundle = new Bundle();
            npp.g(bundle);
        }
        bundle.putString("key_home_mix_uri", str);
        return npp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.at == null) {
            this.at = nrk.b(n(), view, a((int) R.string.home_mix_settings_tooltip_message, this.ab.d.a((Context) fbp.a(n()))));
            this.at.setVisibility(8);
            ((ViewGroup) this.aq.findViewById(R.id.container)).addView(this.at);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Interpolator interpolator, float f) {
        float interpolation = interpolator.getInterpolation(f);
        this.V.a(interpolation);
        nrw nrw = this.aj;
        if (nrw != null) {
            float f2 = 1.0f - interpolation;
            nrw.f.onScroll(f2);
            nrw.g.onScroll(f2);
        }
    }

    private void a(String str, String str2, OnClickListener onClickListener, int i) {
        this.ac.a(uzy.a(str, i).c(R.color.white).b(R.color.textBlack).a(str2).a(onClickListener).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.ai.a.onError(th);
    }

    static /* synthetic */ void a(npp npp, fzn fzn, Resources resources) {
        String string = resources.getString(R.string.home_mix_view_taste_viz);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(npp.n(), SpotifyIconV2.GRID_VIEW, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c((Context) fbp.a(npp.n()), R.color.context_menu_gray));
        fzn.a((int) R.id.actionbar_item_view_taste_viz, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$npp$6QfQVucNDVcfoLQnJkEboveF8E(npp));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aA() {
        this.ab.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aB() {
        this.ab.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aC() {
        nty nty = this.ab;
        if (nty.b != null) {
            nty.b.ak();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aD() {
        nty nty = this.ab;
        if (nty.b != null) {
            nty.b.ai();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aE() {
        this.ai.a.onComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    private void b(String str) {
        a(str, null, null, 3000);
    }

    static /* synthetic */ void b(npp npp, fzn fzn, Resources resources) {
        String string = resources.getString(R.string.home_mix_user_toggle);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(npp.n(), SpotifyIconV2.GEARS, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c((Context) fbp.a(npp.n()), R.color.context_menu_gray));
        fzn.a((int) R.id.actionbar_item_view_user_toggle, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$npp$tutFyii2JCaFHr4ViPBtiWwio(npp));
    }

    static /* synthetic */ void c(npp npp, fzn fzn, Resources resources) {
        nty nty = npp.ab;
        String string = nty.c != null && nty.c.b() ? resources.getString(R.string.home_mix_explicit_filter_remove) : resources.getString(R.string.home_mix_explicit_filter_include);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(npp.n(), SpotifyIconV2.FILTER, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c((Context) fbp.a(npp.n()), R.color.context_menu_gray));
        fzn.a((int) R.id.actionbar_item_explicit_filter, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$npp$CrdDwIudi1YtsecKRsDIniMcmc(npp));
    }

    static /* synthetic */ void d(npp npp, fzn fzn, Resources resources) {
        Context context = (Context) fbp.a(npp.n());
        String a2 = npp.ab.d.a(context);
        String string = resources.getString(R.string.home_mix_join, new Object[]{a2});
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.PLUS_2PX;
        if (npp.ab.c()) {
            string = resources.getString(R.string.home_mix_leave, new Object[]{a2});
            spotifyIconV2 = SpotifyIconV2.BAN;
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.context_menu_gray));
        fzn.a((int) R.id.actionbar_item_opt_in_toggle, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$npp$XuGdPAcZkX5PUBfTe1sBxmzv4oM(npp));
    }

    public final void B() {
        super.B();
        this.ac.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        Bundle bundle2 = bundle;
        c(true);
        npq npq = this.a;
        if (bundle2 != null) {
            npq.c = bundle2.getBoolean("triggerResync", false);
        }
        nta a2 = this.T.a();
        FrameLayout frameLayout = new FrameLayout(n());
        this.aq = a2.a(layoutInflater2, viewGroup2);
        frameLayout.addView(this.aq);
        this.an = this.U.a(this.W.b.a().o().b(true).c(true).d(false).i(false).j(false).m(false).h(false).a());
        this.an.a(bundle2);
        this.an.a(a2.b());
        nrq nrq = this.V;
        a2.a((ozo) nrq, nrq.a(layoutInflater2, viewGroup2, this.an));
        a2.a(this.V.i());
        vhx a3 = a2.a();
        if (fqo.a((Fragment) this).b(num.f)) {
            nrt nrt = this.Z;
            nrw nrw = r13;
            nrw nrw2 = new nrw((Context) nrt.a(nrt.a.get(), 1), (nru) nrt.a(nrt.b.get(), 2), (ToastieManager) nrt.a(nrt.c.get(), 3), (vhx) nrt.a(a3, 4), (ViewGroup) nrt.a(this.V.j(), 5));
            this.aj = nrw;
        }
        this.V.k().a((fvu) new $$Lambda$npp$cuGOLEKynCpEfYOhAfkpiduO10c(this, new AccelerateInterpolator(2.0f)));
        nsg nsg = this.X;
        nty nty = this.ab;
        npq npq2 = this.a;
        nsj nsj = this.Y;
        npm npm = this.W;
        nsf nsf = new nsf((nsd) nsg.a(nsg.a.get(), 1), (oml) nsg.a(nsg.b.get(), 2), (omc) nsg.a(nsg.c.get(), 3), (Context) nsg.a(nsg.d.get(), 4), (EnumMap) nsg.a(nsg.e.get(), 5), (HomeMixInteractionLogger) nsg.a(nsg.f.get(), 6), (nty) nsg.a(nty, 7), (npq) nsg.a(npq2, 8), (nsj) nsg.a(nsj, 9), (ItemListConfiguration) nsg.a(npm.c.a().z().a(Optional.b(Boolean.valueOf(npm.d.a() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM))).o(false).a(false).a(LongClickAction.SHOW_CONTEXT_MENU).d(true).n(false).a(), 10));
        this.ao = nsf;
        this.ao.a(layoutInflater2, viewGroup2, a3);
        this.ab.b = this;
        this.a.b = this;
        return frameLayout;
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItem;
        super.a(menu, menuInflater);
        fzv.a((Fragment) this, (fzq) new fzq() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(fzn fzn, vlc vlc, fzn fzn2) {
                nty nty = npp.this.ab;
                if (nty.c != null && nty.c.c()) {
                    Resources resources = npp.this.o().getResources();
                    if (nun.b(npp.this.ap) && npp.this.ab.c() && !npp.this.ab.e) {
                        npp.a(npp.this, fzn, resources);
                    }
                    if (!nun.d(npp.this.ap)) {
                        DebugFlag debugFlag = DebugFlag.HOME_MIX_USER_TOGGLE;
                    } else if (npp.this.ab.d != HomeMixPlanType.DUO) {
                        npp.b(npp.this, fzn, resources);
                    }
                    if (nun.a(npp.this.ap)) {
                        if (npp.this.ab.c()) {
                            npp.c(npp.this, fzn, resources);
                        }
                        npp.d(npp.this, fzn, resources);
                    }
                }
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(vlc vlc, fzn fzn) {
            }

            public final void a(fzn fzn) {
                npp.this.an.a(fzn, null, new $$Lambda$npp$2$NfcnG6DslBSd0qfBEN6RSxg8xhU(this, fzn), $$Lambda$npp$2$o8XC9Caday7zNH7fqMqfiUAqek.INSTANCE);
            }

            public final sso ae_() {
                return npp.this.aa;
            }
        }, menu);
        if (nun.a(this.ap) && !this.ad.c.a(nps.b, false)) {
            int i = 0;
            while (true) {
                if (i >= menu.size()) {
                    menuItem = null;
                    break;
                }
                menuItem = menu.getItem(i);
                if (menuItem.getTitle().equals(a((int) R.string.content_description_show_context_menu))) {
                    break;
                }
                i++;
            }
            if (menuItem != null && menuItem.getActionView() != null) {
                menuItem.getActionView().addOnLayoutChangeListener(new $$Lambda$npp$z2dI9vEHjZjqNJAYobWBmkFEIWY(this));
                if (this.as == null) {
                    this.as = new a(this, 0);
                    this.ar.postDelayed(this.as, 200);
                }
            }
        }
    }

    public final void a(boolean z) {
    }

    public final void aP_() {
        super.aP_();
        AnonymousClass1 r0 = new defpackage.omg.a() {
            public final oyl a() {
                return npp.this.ak;
            }

            public final oqb b() {
                return npp.this.al;
            }
        };
        this.a.a((defpackage.omg.a) r0);
        ArrayList arrayList = new ArrayList(3);
        nrq nrq = this.V;
        if (nrq != null) {
            nrq.a((defpackage.omg.a) r0);
            this.V.ay_();
            arrayList.add(this.V.a());
        }
        nrw nrw = this.aj;
        if (nrw != null) {
            nrw.e.a((defpackage.omg.a) r0);
        }
        nty nty = this.ab;
        if (nty != null) {
            nty.a((defpackage.omg.a) r0);
        }
        pcl pcl = this.an;
        if (pcl != null) {
            pcl.a((defpackage.omg.a) r0);
            arrayList.add(this.an.a());
        }
        nsf nsf = this.ao;
        if (nsf != null) {
            nsf.a((defpackage.omg.a) r0);
            this.ao.ay_();
            arrayList.add(this.ao.b.a());
        }
        this.ak.a(this.al);
        this.al.a();
        this.am.a(Completable.b((Iterable<? extends CompletableSource>) arrayList).a((Action) new $$Lambda$npp$n_nzEnVeJqpy9tD9MoeNKkJuGis(this), (Consumer<? super Throwable>) new $$Lambda$npp$zKnvJl7mWDemprljMBLWWtQTOYs<Object>(this)));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.HOMEMIX_ENTITY, null);
    }

    public final uqm ag() {
        return uqo.ai;
    }

    public final Optional<String> ah() {
        return Optional.e();
    }

    public final void ai() {
        if (nun.b(this.ap)) {
            nts.a(t(), false);
        }
    }

    public final gkq aj() {
        return PageIdentifiers.HOMEMIX_ENTITY;
    }

    public final void ak() {
        if (!nun.d(this.ap)) {
            DebugFlag debugFlag = DebugFlag.HOME_MIX_USER_TOGGLE;
        } else {
            nua.a(t());
        }
    }

    public final void al() {
        this.ar.removeCallbacks(this.as);
    }

    public final void am() {
        b(a((int) R.string.home_mix_user_alone_message));
    }

    public final void an() {
        Context n = n();
        if (n != null) {
            a(a((int) R.string.home_mix_duo_join_to_be_in_the_mix, this.ab.d.a(n)), a((int) R.string.home_mix_join_text), new $$Lambda$npp$gA_VoU1SFdkk9LltfY8FI0DlWno(this), 60000);
        }
    }

    public final void ao() {
        b(a((int) R.string.home_mix_duo_needs_listening_history));
    }

    public final void ap() {
        nrw nrw = this.aj;
        if (nrw != null) {
            nrw.a(true);
        }
    }

    public final void aq() {
        nrw nrw = this.aj;
        if (nrw != null) {
            nrw.a(false);
        }
    }

    public final void ar() {
        Activity activity = (Activity) fbp.a(p());
        a(TasteOnboardingActivity.a(activity, this.ap, false), 101, fb.a((Context) activity, 17432576, 17432577).a());
    }

    public final void as() {
        nts.a(t(), true);
        this.ar.removeCallbacks(this.as);
    }

    public final void at() {
        b(a((int) R.string.home_mix_unknown_error_title));
    }

    public final void au() {
        b(a((int) R.string.home_mix_explicit_tracks_removed));
    }

    public final void av() {
        b(a((int) R.string.home_mix_explicit_tracks_included));
    }

    public final void aw() {
        Context n = n();
        if (n != null) {
            b(a((int) R.string.home_mix_user_joined_message, this.ab.d.a(n)));
        }
    }

    public final void ax() {
        Context n = n();
        if (n != null) {
            b(a((int) R.string.home_mix_user_left_message, this.ab.d.a(n)));
        }
    }

    public final void ay() {
        b(a((int) R.string.home_mix_no_internet_connection));
    }

    public final void az() {
        this.a.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ap = (fqn) fbp.a(fqo.a((Bundle) fbp.a(this.i)));
        this.al = this.ah.a(this.ae.a());
        this.ak = this.ag.a(this.al, this.af.a());
        this.al.a(bundle);
    }

    public final boolean c() {
        return false;
    }

    public final String e() {
        return "android-features-home-mix";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        pcl pcl = this.an;
        if (pcl != null) {
            pcl.b(bundle);
        }
        this.al.b(bundle);
        bundle.putBoolean("triggerResync", this.a.c);
    }

    public final void h() {
        super.h();
        a aVar = this.as;
        if (aVar != null) {
            this.ar.removeCallbacks(aVar);
        }
        nrq nrq = this.V;
        if (nrq != null) {
            nrq.c();
            this.V.d();
        }
        nrw nrw = this.aj;
        if (nrw != null) {
            nrw.e.a.c();
        }
        nty nty = this.ab;
        if (nty != null) {
            nty.a.c();
        }
        pcl pcl = this.an;
        if (pcl != null) {
            pcl.d();
        }
        nsf nsf = this.ao;
        if (nsf != null) {
            nsf.c();
            this.ao.b.b();
        }
        this.a.a.c();
        this.ak.f();
    }

    public final whq<Object> j() {
        return this.b;
    }
}
