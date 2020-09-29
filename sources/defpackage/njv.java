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

/* renamed from: njv reason: default package */
public class njv extends jor implements com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a, jol, nka, defpackage.nnr.a, nny, ose, udv, vtr {
    public defpackage.osu.a T;
    public b U;
    public nmb V;
    public njq W;
    public nmr X;
    public nmu Y;
    public nme Z;
    public njw a;
    public sih aa;
    public nnx ab;
    public ToastieManager ac;
    public njy ad;
    public org ae;
    public oiw af;
    public nkb ag;
    private nmh ah;
    private final SerialDisposable ai = new SerialDisposable();
    /* access modifiers changed from: private */
    public ova aj;
    private nmq ak;
    /* access modifiers changed from: private */
    public fpt al;
    /* access modifiers changed from: private */
    public View am;
    private final Handler an = new Handler();
    private a ao;
    /* access modifiers changed from: private */
    public nlv ap;
    public DispatchingAndroidInjector<Object> b;

    /* renamed from: njv$a */
    class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(njv njv, byte b) {
            this();
        }

        public final void run() {
            nlv a2 = njv.this.ap;
            if (a2 != null) {
                ViewGroup viewGroup = (ViewGroup) njv.this.am.findViewById(R.id.container);
                a2.setVisibility(0);
                njv.this.ad.c.a().a(njy.b, true).b();
                viewGroup.getHandler().postDelayed(new $$Lambda$njv$a$_mScf47irlwBSgIuEY2iBB3hDJE(this, a2, viewGroup), 3000);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(nlv nlv, ViewGroup viewGroup) {
            ip.n(nlv).a(400).a(0.0f).a((Runnable) new $$Lambda$njv$a$mnHB1VjDESMpZ57WxjS7ZydOehA(this, viewGroup, nlv)).c();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ViewGroup viewGroup, nlv nlv) {
            if (njv.this.am != null) {
                viewGroup.removeView(nlv);
            }
        }
    }

    public final void a(boolean z) {
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final boolean c() {
        return false;
    }

    public final String e() {
        return "android-features-home-mix";
    }

    public static njv a(fpt fpt, String str) {
        njv njv = new njv();
        fpu.a((Fragment) njv, fpt);
        Bundle bundle = njv.i;
        if (bundle == null) {
            bundle = new Bundle();
            njv.g(bundle);
        }
        bundle.putString("key_home_mix_uri", str);
        return njv;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        c(true);
        osu a2 = this.T.a();
        FrameLayout frameLayout = new FrameLayout(n());
        this.am = a2.a(layoutInflater2, viewGroup2);
        frameLayout.addView(this.am);
        this.aj = this.U.a(this.W.b.a().o().b(true).c(true).d(false).i(false).j(false).m(false).h(false).a());
        this.aj.a(bundle);
        this.aj.a(a2.b());
        nmb nmb = this.V;
        a2.a((osi) nmb, nmb.a(layoutInflater2, viewGroup2, this.aj));
        a2.a(this.V.i());
        uwh a3 = a2.a();
        if (fpu.a((Fragment) this).b(nol.f)) {
            nme nme = this.Z;
            nmh nmh = r13;
            nmh nmh2 = new nmh((Context) nme.a(nme.a.get(), 1), (nmf) nme.a(nme.b.get(), 2), (ToastieManager) nme.a(nme.c.get(), 3), (uwh) nme.a(a3, 4), (ViewGroup) nme.a(this.V.j(), 5));
            this.ah = nmh;
        }
        this.V.k().a((fva) new $$Lambda$njv$YykeK1IEDHOK9G8ZllOhFwJ5cY(this, new AccelerateInterpolator(2.0f)));
        nmr nmr = this.X;
        nnx nnx = this.ab;
        njw njw = this.a;
        nmu nmu = this.Y;
        kf t = t();
        njq njq = this.W;
        nmq nmq = new nmq((nmo) nmr.a(nmr.a.get(), 1), (ofh) nmr.a(nmr.b.get(), 2), (oew) nmr.a(nmr.c.get(), 3), (Context) nmr.a(nmr.d.get(), 4), (EnumMap) nmr.a(nmr.e.get(), 5), (HomeMixInteractionLogger) nmr.a(nmr.f.get(), 6), (nnx) nmr.a(nnx, 7), (njw) nmr.a(njw, 8), (nmu) nmr.a(nmu, 9), (kf) nmr.a(t, 10), (ItemListConfiguration) nmr.a(njq.c.a().A().a(Optional.b(Boolean.valueOf(njq.d.a() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM))).o(false).a(false).a(LongClickAction.SHOW_CONTEXT_MENU).d(true).n(false).a(), 11));
        this.ak = nmq;
        this.ak.a(layoutInflater2, viewGroup2, a3);
        this.ab.b = this;
        this.a.e = this;
        return frameLayout;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Interpolator interpolator, float f) {
        float interpolation = interpolator.getInterpolation(f);
        this.V.a(interpolation);
        nmh nmh = this.ah;
        if (nmh != null) {
            float f2 = 1.0f - interpolation;
            nmh.f.onScroll(f2);
            nmh.g.onScroll(f2);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.al = (fpt) fay.a(fpu.a((Bundle) fay.a(this.i)));
        this.af.a(bundle);
    }

    public final void h() {
        super.h();
        a aVar = this.ao;
        if (aVar != null) {
            this.an.removeCallbacks(aVar);
        }
        nmb nmb = this.V;
        if (nmb != null) {
            nmb.d();
        }
        nmh nmh = this.ah;
        if (nmh != null) {
            nmh.e.a.c();
        }
        nnx nnx = this.ab;
        if (nnx != null) {
            nnx.a.c();
        }
        ova ova = this.aj;
        if (ova != null) {
            ova.d();
        }
        nmq nmq = this.ak;
        if (nmq != null) {
            nmq.c();
            this.ak.b.b();
        }
        this.ae.f();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ova ova = this.aj;
        if (ova != null) {
            ova.b(bundle);
        }
        this.af.b(bundle);
    }

    public final void g() {
        super.g();
        AnonymousClass1 r0 = new defpackage.ofc.a() {
            public final orf a() {
                return njv.this.ae;
            }

            public final oix b() {
                return njv.this.af;
            }
        };
        ArrayList arrayList = new ArrayList(3);
        nmb nmb = this.V;
        if (nmb != null) {
            nmb.a((defpackage.ofc.a) r0);
            arrayList.add(this.V.a());
        }
        nmh nmh = this.ah;
        if (nmh != null) {
            nmh.e.a();
        }
        nnx nnx = this.ab;
        if (nnx != null) {
            nnx.a();
        }
        ova ova = this.aj;
        if (ova != null) {
            ova.a((defpackage.ofc.a) r0);
            arrayList.add(this.aj.a());
        }
        nmq nmq = this.ak;
        if (nmq != null) {
            nmq.a((defpackage.ofc.a) r0);
            this.ak.az_();
            arrayList.add(this.ak.b.a());
        }
        this.ae.a(this.af);
        this.af.a();
        this.ai.a(Completable.b((Iterable<? extends CompletableSource>) arrayList).a((Action) new $$Lambda$njv$AgTCg4ojaeKegsTOzIR4M2b7TBs(this), (Consumer<? super Throwable>) new $$Lambda$njv$IJoY9OmY35ZJtq605Kr9ZkM2tRU<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aE() {
        this.ag.a.onComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.ag.a.onError(th);
    }

    public final void B() {
        super.B();
        this.ac.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.ap == null) {
            this.ap = nlv.b(n(), view, a((int) R.string.home_mix_settings_tooltip_message, this.ab.d.a((Context) fay.a(n()))));
            this.ap.setVisibility(8);
            ((ViewGroup) this.am.findViewById(R.id.container)).addView(this.ap);
        }
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItem;
        super.a(menu, menuInflater);
        fzb.a((Fragment) this, (fyw) new fyw() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(uyz uyz, fyt fyt) {
            }

            public final void a(fyt fyt) {
                njv.this.aj.a(fyt, null, new $$Lambda$njv$2$XGy17NfaNGRPFoa2YWYNrCeIi_Y(this, fyt), $$Lambda$njv$2$Vh7JBWlwKMWPb7gx8SYhqvFsFWI.INSTANCE);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(fyt fyt, uyz uyz, fyt fyt2) {
                nnx nnx = njv.this.ab;
                if (nnx.c != null && nnx.c.c()) {
                    Resources resources = njv.this.o().getResources();
                    if (nom.b(njv.this.al) && njv.this.ab.d() && !njv.this.ab.e) {
                        njv.a(njv.this, fyt, resources);
                    }
                    if (!nom.d(njv.this.al)) {
                        DebugFlag debugFlag = DebugFlag.HOME_MIX_USER_TOGGLE;
                    } else if (njv.this.ab.d != HomeMixPlanType.DUO) {
                        njv.b(njv.this, fyt, resources);
                    }
                    if (nom.a(njv.this.al)) {
                        if (njv.this.ab.d()) {
                            njv.c(njv.this, fyt, resources);
                        }
                        njv.d(njv.this, fyt, resources);
                    }
                }
            }

            public final sih ae_() {
                return njv.this.aa;
            }
        }, menu);
        if (nom.a(this.al) && !this.ad.c.a(njy.b, false)) {
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
                menuItem.getActionView().addOnLayoutChangeListener(new $$Lambda$njv$bOU9nXivhlN1WLwB9Z_h8tm90U8(this));
                if (this.ao == null) {
                    this.ao = new a(this, 0);
                    this.an.postDelayed(this.ao, 200);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aD() {
        nnx nnx = this.ab;
        if (nnx.b != null) {
            nnx.b.ai();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aC() {
        nnx nnx = this.ab;
        if (nnx.b != null) {
            nnx.b.ak();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aB() {
        this.ab.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aA() {
        this.ab.c();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.HOMEMIX_ENTITY, null);
    }

    public final udr ag() {
        return udt.ai;
    }

    public final gjf aj() {
        return PageIdentifiers.HOMEMIX_ENTITY;
    }

    public final Optional<String> ah() {
        return Optional.e();
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final void ai() {
        if (nom.b(this.al)) {
            nnr.a(t(), false);
        }
    }

    public final void ak() {
        if (!nom.d(this.al)) {
            DebugFlag debugFlag = DebugFlag.HOME_MIX_USER_TOGGLE;
        } else {
            nnz.a(t());
        }
    }

    public final void al() {
        this.an.removeCallbacks(this.ao);
    }

    public final void am() {
        b(a((int) R.string.home_mix_user_alone_message));
    }

    public final void an() {
        Context n = n();
        if (n != null) {
            a(a((int) R.string.home_mix_duo_join_to_be_in_the_mix, this.ab.d.a(n)), a((int) R.string.home_mix_join_text), new $$Lambda$njv$7H4Na6fRZVMujWuITtRubZxhd4(this), 60000);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    public final void ao() {
        b(a((int) R.string.home_mix_duo_needs_listening_history));
    }

    public final void ap() {
        nmh nmh = this.ah;
        if (nmh != null) {
            nmh.a(true);
        }
    }

    public final void aq() {
        nmh nmh = this.ah;
        if (nmh != null) {
            nmh.a(false);
        }
    }

    public final void ar() {
        Activity activity = (Activity) fay.a(p());
        a(TasteOnboardingActivity.a(activity, this.al, false), 101, fb.a((Context) activity, 17432576, 17432577).a());
    }

    private void b(String str) {
        a(str, null, null, 3000);
    }

    private void a(String str, String str2, OnClickListener onClickListener, int i) {
        this.ac.a(uos.a(str, i).c(R.color.white).b(R.color.textBlack).a(str2).a(onClickListener).a());
    }

    public final void as() {
        nnr.a(t(), true);
        this.an.removeCallbacks(this.ao);
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

    public final vtk<Object> j() {
        return this.b;
    }

    public final void az() {
        this.a.b();
    }

    static /* synthetic */ void a(njv njv, fyt fyt, Resources resources) {
        String string = resources.getString(R.string.home_mix_view_taste_viz);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(njv.n(), SpotifyIconV2.GRID_VIEW, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c((Context) fay.a(njv.n()), R.color.context_menu_gray));
        fyt.a((int) R.id.actionbar_item_view_taste_viz, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$njv$Rv8ZUwhhD6cYX8oFfmwtf7C3VOA(njv));
    }

    static /* synthetic */ void b(njv njv, fyt fyt, Resources resources) {
        String string = resources.getString(R.string.home_mix_user_toggle);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(njv.n(), SpotifyIconV2.GEARS, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c((Context) fay.a(njv.n()), R.color.context_menu_gray));
        fyt.a((int) R.id.actionbar_item_view_user_toggle, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$njv$U5VN2C3gTH6eFgS0RXp40tfQBn8(njv));
    }

    static /* synthetic */ void c(njv njv, fyt fyt, Resources resources) {
        String str;
        nnx nnx = njv.ab;
        if (nnx.c != null && nnx.c.b()) {
            str = resources.getString(R.string.home_mix_explicit_filter_remove);
        } else {
            str = resources.getString(R.string.home_mix_explicit_filter_include);
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(njv.n(), SpotifyIconV2.FILTER, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c((Context) fay.a(njv.n()), R.color.context_menu_gray));
        fyt.a((int) R.id.actionbar_item_explicit_filter, (CharSequence) str, (Drawable) spotifyIconDrawable).a(new $$Lambda$njv$9GIRkcYIOiZD1lSfNQQ5fk0kdc(njv));
    }

    static /* synthetic */ void d(njv njv, fyt fyt, Resources resources) {
        Context context = (Context) fay.a(njv.n());
        String a2 = njv.ab.d.a(context);
        String string = resources.getString(R.string.home_mix_join, new Object[]{a2});
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.PLUS_2PX;
        if (njv.ab.d()) {
            string = resources.getString(R.string.home_mix_leave, new Object[]{a2});
            spotifyIconV2 = SpotifyIconV2.BAN;
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.context_menu_gray));
        fyt.a((int) R.id.actionbar_item_opt_in_toggle, (CharSequence) string, (Drawable) spotifyIconDrawable).a(new $$Lambda$njv$ShSDAgRb7sl6OxNqxpYgvhDDFpU(njv));
    }
}
