package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.service.feature.FeatureService.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.settings.adapter.SettingsAdapter;
import com.spotify.music.features.user.model.DecoratedUser;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Map;

/* renamed from: qmd reason: default package */
public class qmd extends qlx implements NavigationItem, jqx, qmp, qmr, a, uqq {
    TextView T;
    ImageView U;
    public hxx V;
    public fqn W;
    public vph X;
    public wzi<SettingsAdapter> Y;
    public wzi<qmt> Z;
    private qxh aA;
    private jwd<DecoratedUser> aB;
    private final xis<SessionState> aC = new $$Lambda$qmd$kz0AQhD9kUXvtH20pXSwGpY4mWY(this);
    public rqb aa;
    public hlv ab;
    public ConnectManager ac;
    public jty ad;
    public xil ae;
    public xil af;
    public qly ag;
    public qma ah;
    public lon ai;
    public szp aj;
    public RxResolver ak;
    public jwo al;
    public lbr am;
    public InteractionLogger an;
    /* access modifiers changed from: 0000 */
    public String ao;
    private final xok ap = xon.a(new xip[0]);
    private boolean aq;
    private View ar;
    private LoadingView as;
    /* access modifiers changed from: private */
    public boolean at;
    private xip au = xon.b();
    /* access modifiers changed from: private */
    public SettingsAdapter av;
    private final c aw = new c() {
        public final void onFlagsChanged(fqn fqn) {
            boolean z = false;
            boolean z2 = ((Boolean) fqn.a(gwf.d)).booleanValue() || isu.a(qmd.this.W);
            boolean booleanValue = ((Boolean) fqn.a(jrl.a)).booleanValue();
            boolean a2 = nxp.a(fqn);
            boolean z3 = !((Boolean) fqn.a(rqa.a)).booleanValue();
            boolean a3 = ijr.a(fqn);
            boolean z4 = !fbo.a((String) fqn.a(jrl.b));
            boolean booleanValue2 = ((Boolean) fqn.a(lcl.a)).booleanValue();
            boolean b = gvm.b(fqn);
            if (qmd.this.av != null) {
                SettingsAdapter a4 = qmd.this.av;
                if (a4.u != booleanValue) {
                    z = true;
                }
                a4.z = z;
                a4.A = z;
                a4.u = booleanValue;
                a4.v = z2;
                a4.o = z4;
                a4.k = SettingsAdapter.a(a4.b);
                a4.l = SettingsAdapter.b(a4.b);
                a4.m = SettingsAdapter.a(a4.u);
                a4.n = SettingsAdapter.b(a4.u);
                a4.r = z3;
                a4.s = a3;
                a4.t = a2;
                a4.x = booleanValue2;
                a4.y = b;
                a4.b();
            }
        }
    };
    private final xis<SettingsState> ax = new xis<SettingsState>() {
        public final /* synthetic */ void call(Object obj) {
            SettingsState settingsState = (SettingsState) obj;
            SettingsAdapter a2 = qmd.this.av;
            a2.g = settingsState;
            a2.b();
            qmd qmd = qmd.this;
            qmd.b = true;
            qmd.ai();
            qmd.this.at = settingsState.facebookConnected();
            SettingsAdapter a3 = qmd.this.av;
            boolean b = qmd.this.at;
            if (a3.w != b) {
                a3.w = b;
                a3.b();
            }
        }
    };
    private qmt ay;
    private xip az;
    protected boolean b;

    static {
        qmd.class.getSimpleName();
    }

    public static qmd a(fqn fqn, SessionState sessionState) {
        Bundle bundle = new Bundle();
        bundle.putString("username", (String) fbp.a(sessionState.currentUserName()));
        hfz paymentState = sessionState.paymentState();
        String productType = sessionState.productType();
        String str = "premium";
        boolean z = true;
        boolean z2 = productType.equalsIgnoreCase(str) && paymentState.c();
        boolean equalsIgnoreCase = str.equalsIgnoreCase(productType);
        if (!z2 && equalsIgnoreCase) {
            z = false;
        }
        bundle.putBoolean("premium_button_visible", z);
        qmd qmd = new qmd();
        qmd.g(bundle);
        fqo.a((Fragment) qmd, fqn);
        return qmd;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, Throwable th) {
        this.av.a(i);
        Logger.e(th, "Failed to update 'show my recently played artists' product state", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        SettingsAdapter settingsAdapter = this.av;
        boolean z = !gaiaDevice.isSelf();
        if (z != settingsAdapter.q) {
            settingsAdapter.q = z;
            settingsAdapter.b();
        }
        this.av.G = this.ac.p();
        qmt qmt = this.ay;
        String[] c = this.av.c();
        fbp.a(c);
        if (c.length == qmt.a.size()) {
            for (int i = 0; i < c.length; i++) {
                qmt.a.set(i, c[i]);
            }
            qmt.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        if (sessionState.loggedIn()) {
            this.ao = sessionState.currentUser();
            SettingsAdapter settingsAdapter = this.av;
            String str = "";
            settingsAdapter.B = (String) jvi.a(sessionState.currentUserName(), str);
            settingsAdapter.b();
            SettingsAdapter settingsAdapter2 = this.av;
            settingsAdapter2.C = (String) jvi.a(sessionState.currentUser(), str);
            settingsAdapter2.b();
            hhf.a(this.az);
            xii a = this.aA.a(this.ao);
            jwd<DecoratedUser> jwd = this.aB;
            jwd.getClass();
            $$Lambda$XDL4Au0f00RTfc3B4IioulF3aM r2 = new $$Lambda$XDL4Au0f00RTfc3B4IioulF3aM(jwd);
            jwd<DecoratedUser> jwd2 = this.aB;
            jwd2.getClass();
            this.az = a.a((xis<? super T>) r2, (xis<Throwable>) new $$Lambda$MqG290HLZEY1Aj0HIWM4pqrL_us<Throwable>(jwd2));
        }
        this.aq = true;
        ai();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.av.D = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.av.a(num.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Throwable th) {
        this.av.D = !z;
        Logger.e(th, "Failed updating 'publish-activity' in product state", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        String str = (String) fbp.a(jva.b(this.ao).h());
        String str2 = str;
        this.an.a(str2, "settings-profile-section", -1, InteractionType.HIT, "open-profile");
        this.aj.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        SettingsAdapter settingsAdapter = this.av;
        settingsAdapter.F = bool.booleanValue();
        settingsAdapter.a();
        settingsAdapter.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        this.av.a(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(boolean z) {
        this.av.D = z;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.av = (SettingsAdapter) this.Y.get();
        this.ay = (qmt) this.Z.get();
        this.ar = layoutInflater.inflate(R.layout.list_frame, viewGroup, false);
        this.am.a(this, p().getString(R.string.settings_title));
        ListView listView = (ListView) this.ar.findViewById(16908298);
        Bundle bundle2 = this.i;
        boolean g = this.ad.g();
        if (bundle2 != null && bundle2.getBoolean("premium_button_visible") && g) {
            View inflate = layoutInflater.inflate(R.layout.settings_get_premium, listView, false);
            View findViewById = inflate.findViewById(R.id.btn_get_premium);
            listView.addHeaderView(inflate);
            findViewById.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    Context context = view.getContext();
                    context.startActivity(kpo.a(context, ViewUris.aQ.toString()).a);
                }
            });
        }
        Optional a = this.X.a(listView);
        if (a.b()) {
            listView.addHeaderView((View) a.c());
        }
        View inflate2 = layoutInflater.inflate(R.layout.settings_view_profile, listView, false);
        this.U = (ImageView) inflate2.findViewById(R.id.avatar);
        this.T = (TextView) inflate2.findViewById(R.id.username);
        this.U.setImageDrawable(gaa.f(p()));
        ImageView imageView = (ImageView) inflate2.findViewById(16908294);
        imageView.setImageDrawable(new SpotifyIconDrawable(imageView.getContext(), SpotifyIconV2.CHEVRON_RIGHT, 24.0f));
        listView.addHeaderView(inflate2);
        inflate2.setOnClickListener(new $$Lambda$qmd$rCE54qSGEx0aoYLMdOWQ17g4Gjs(this));
        a(this.ay);
        listView.setDivider(null);
        listView.setDividerHeight(0);
        View view = (View) listView.getParent();
        view.setVisibility(4);
        this.as = LoadingView.a(layoutInflater, p(), view);
        ((ViewGroup) this.ar).addView(this.as, -1, -1);
        return this.ar;
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 1 && i2 == -1) {
            a a = PermissionsRequestActivity.a(intent);
            if (a != null) {
                SettingsAdapter settingsAdapter = this.av;
                settingsAdapter.f.a(a.a("android.permission.RECORD_AUDIO"));
            }
        }
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(ListView listView, View view, int i, long j) {
        ((qnd) fqz.a(view, qnd.class)).a();
    }

    public final void a(boolean z) {
        if (!this.au.isUnsubscribed()) {
            this.au.unsubscribe();
        }
        this.au = xig.a(this.ag.a.a("publish-activity", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY)).a(this.ae).a(new $$Lambda$qmd$U8VacvE5JgPTHfiekMPAAjhnMg(this, z), new $$Lambda$qmd$PF9kgf9l0wifgB_3txQkxikfJSM(this, z));
    }

    public final void aP_() {
        super.aP_();
        this.ab.a(this.aw);
        this.ab.a();
        this.ap.a(wit.a((ObservableSource<T>) this.al.n, BackpressureStrategy.BUFFER).a(this.ae).a(this.ax, (xis<Throwable>) $$Lambda$qmd$bkcE6mRoKQ5SWwAIgW4q3uLS4Hc.INSTANCE));
        this.aB = new jwd<DecoratedUser>() {
            public final void a(Throwable th) {
                qmd.this.T.setText(jva.b(qmd.this.ao).c());
                Logger.e(th, "UserDecorator failed to load", new Object[0]);
            }

            public final void a(Map<String, DecoratedUser> map) {
                qmd qmd = qmd.this;
                DecoratedUser decoratedUser = (DecoratedUser) map.get(qmd.ao);
                if (decoratedUser != null) {
                    if (decoratedUser.displayName != null) {
                        qmd.T.setText(decoratedUser.displayName);
                    } else {
                        qmd.T.setText(jva.b(qmd.ao).c());
                    }
                    if (decoratedUser.images != null && !TextUtils.isEmpty(decoratedUser.images.largeUri)) {
                        Picasso.a(qmd.U.getContext()).a(decoratedUser.images.largeUri).a(vhj.a(qmd.U));
                        qmd.U.setScaleType(ScaleType.CENTER_CROP);
                    }
                } else {
                    qmd.T.setText(jva.b(qmd.ao).c());
                }
            }
        };
        this.aA = new qxh(this.ak, null, this.af, this.ae);
        this.ap.a(wit.a((xfk<T>) this.V.a).a(this.aC, (xis<Throwable>) $$Lambda$qmd$21uJ6SsBYsqNmsfPtvgCAaItl4.INSTANCE));
        this.ap.a(this.ag.a().a(this.ae).a((xis<? super T>) new $$Lambda$qmd$adgHI33UPHKwNqRJSwsVs1WToA<Object>(this), (xis<Throwable>) $$Lambda$qmd$YGlUBRExwdu41wixSZDERX83B5M.INSTANCE));
        this.av.i = this;
        this.ap.a(this.ai.b().a(this.ae).a((xis<? super T>) new $$Lambda$qmd$yJ22zVVpXRC08XntzlQ5WyCSX1k<Object>(this), (xis<Throwable>) $$Lambda$qmd$OaUTEHFoiQL_5sFKUU6o_1a0qM.INSTANCE));
        if (!this.aa.a(this.W)) {
            this.ap.a(this.ah.a().a(this.ae).a((xis<? super T>) new $$Lambda$qmd$0j2uQiLjq4azHuvHpNKQKOMVF6c<Object>(this), (xis<Throwable>) $$Lambda$qmd$VkealUJicRzMgj_eU6FfTgMVQPs.INSTANCE));
        }
        this.ap.a(wit.a((ObservableSource<T>) this.ac.g(), BackpressureStrategy.BUFFER).a(this.ae).a((xis<? super T>) new $$Lambda$qmd$wkgfvjuMoy4IzQ1ABxyQPVNDyI<Object>(this), (xis<Throwable>) $$Lambda$qmd$WLSOJMsGef45HmMV722ZYedUqgQ.INSTANCE));
        this.av.j = this;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.T;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SETTINGS, null);
    }

    public final uqm ag() {
        return uqo.aP;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    /* access modifiers changed from: protected */
    public final void ai() {
        if (this.aq && this.b) {
            this.as.b();
        }
    }

    public final gkq aj() {
        return PageIdentifiers.SETTINGS;
    }

    public final String b(Context context) {
        return context.getString(R.string.settings_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final String e() {
        return "config";
    }

    public final void h() {
        md.a(this).a((int) R.id.loader_settings);
        md.a(this).a((int) R.id.loader_settings_session);
        this.ab.b(this.aw);
        this.ab.b();
        this.au.unsubscribe();
        this.ap.a();
        SettingsAdapter settingsAdapter = this.av;
        settingsAdapter.c.b();
        if (settingsAdapter.p != null) {
            settingsAdapter.p.a.unsubscribe();
        }
        ijt ijt = settingsAdapter.f;
        if (ijt.d != null && ijt.d.b()) {
            ijt.d.bd_();
        }
        ijt.d = null;
        hhf.a(this.az);
        super.h();
    }

    public final void i(boolean z) {
        int i = this.av.E;
        int i2 = z ? i | 1 : i & -2;
        this.ap.a(xig.a(this.ah.a.a("public-toplist", Integer.toString(i2))).a(this.ae).a(new $$Lambda$qmd$8UyI71EMDdo5RN2Gocq5fAYefqE(this, i2), new $$Lambda$qmd$Om2JfjfnGdx1Xv6P22sYafmSe_g(this, i)));
    }

    public final void z() {
        super.z();
        this.av.a();
        this.av.notifyDataSetChanged();
        this.as.a();
    }
}
