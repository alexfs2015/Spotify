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

/* renamed from: qda reason: default package */
public class qda extends qcu implements NavigationItem, jol, qdm, qdo, a, udv {
    TextView T;
    ImageView U;
    public hvl V;
    public fpt W;
    public vck X;
    public wlc<SettingsAdapter> Y;
    public wlc<qdq> Z;
    private qoy aA;
    private jtv<DecoratedUser> aB;
    private final wun<SessionState> aC = new $$Lambda$qda$UYeBSfqskzgPATFiymzSZfD0YC0(this);
    public rgz aa;
    public hjd ab;
    public ConnectManager ac;
    public jro ad;
    public wug ae;
    public wug af;
    public qcv ag;
    public qcx ah;
    public lkn ai;
    public spi aj;
    public RxResolver ak;
    public jug al;
    public kyi am;
    public InteractionLogger an;
    /* access modifiers changed from: 0000 */
    public String ao;
    private final xag ap = xaj.a(new wuk[0]);
    private boolean aq;
    private View ar;
    private LoadingView as;
    /* access modifiers changed from: private */
    public boolean at;
    private wuk au = xaj.b();
    /* access modifiers changed from: private */
    public SettingsAdapter av;
    private final c aw = new c() {
        public final void onFlagsChanged(fpt fpt) {
            boolean z = false;
            boolean z2 = ((Boolean) fpt.a(guf.d)).booleanValue() || iqh.a(qda.this.W);
            boolean booleanValue = ((Boolean) fpt.a(joz.a)).booleanValue();
            boolean a2 = nrm.a(fpt);
            boolean z3 = !((Boolean) fpt.a(rgy.a)).booleanValue();
            boolean a3 = ihe.a(fpt);
            boolean z4 = !fax.a((String) fpt.a(joz.b));
            boolean booleanValue2 = ((Boolean) fpt.a(kzc.a)).booleanValue();
            boolean b = gtm.b(fpt);
            if (qda.this.av != null) {
                SettingsAdapter a4 = qda.this.av;
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
    private final wun<SettingsState> ax = new wun<SettingsState>() {
        public final /* synthetic */ void call(Object obj) {
            SettingsState settingsState = (SettingsState) obj;
            SettingsAdapter a2 = qda.this.av;
            a2.g = settingsState;
            a2.b();
            qda qda = qda.this;
            qda.b = true;
            qda.ai();
            qda.this.at = settingsState.facebookConnected();
            SettingsAdapter a3 = qda.this.av;
            boolean b = qda.this.at;
            if (a3.w != b) {
                a3.w = b;
                a3.b();
            }
        }
    };
    private qdq ay;
    private wuk az;
    protected boolean b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "config";
    }

    static {
        qda.class.getSimpleName();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        if (sessionState.loggedIn()) {
            this.ao = sessionState.currentUser();
            SettingsAdapter settingsAdapter = this.av;
            String str = "";
            settingsAdapter.B = (String) jtc.a(sessionState.currentUserName(), str);
            settingsAdapter.b();
            SettingsAdapter settingsAdapter2 = this.av;
            settingsAdapter2.C = (String) jtc.a(sessionState.currentUser(), str);
            settingsAdapter2.b();
            hej.a(this.az);
            wud a = this.aA.a(this.ao);
            jtv<DecoratedUser> jtv = this.aB;
            jtv.getClass();
            $$Lambda$ncCSboH1FaCmXyCE6yVwqM2qGEw r2 = new $$Lambda$ncCSboH1FaCmXyCE6yVwqM2qGEw(jtv);
            jtv<DecoratedUser> jtv2 = this.aB;
            jtv2.getClass();
            this.az = a.a((wun<? super T>) r2, (wun<Throwable>) new $$Lambda$iY_nMrWcKl8ktbhdwcx_k94XNQY<Throwable>(jtv2));
        }
        this.aq = true;
        ai();
    }

    public static qda a(fpt fpt, SessionState sessionState) {
        Bundle bundle = new Bundle();
        bundle.putString("username", (String) fay.a(sessionState.currentUserName()));
        hdd paymentState = sessionState.paymentState();
        String productType = sessionState.productType();
        String str = "premium";
        boolean z = true;
        boolean z2 = productType.equalsIgnoreCase(str) && paymentState.c();
        boolean equalsIgnoreCase = str.equalsIgnoreCase(productType);
        if (!z2 && equalsIgnoreCase) {
            z = false;
        }
        bundle.putBoolean("premium_button_visible", z);
        qda qda = new qda();
        qda.g(bundle);
        fpu.a((Fragment) qda, fpt);
        return qda;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final void g() {
        super.g();
        this.ab.a(this.aw);
        this.ab.a();
        this.ap.a(vun.a((ObservableSource<T>) this.al.n, BackpressureStrategy.BUFFER).a(this.ae).a(this.ax, (wun<Throwable>) $$Lambda$qda$c9lbRcdkM3HE0ADSbnKD2622qA.INSTANCE));
        this.aB = new jtv<DecoratedUser>() {
            public final void a(Map<String, DecoratedUser> map) {
                qda qda = qda.this;
                DecoratedUser decoratedUser = (DecoratedUser) map.get(qda.ao);
                if (decoratedUser != null) {
                    if (decoratedUser.displayName != null) {
                        qda.T.setText(decoratedUser.displayName);
                    } else {
                        qda.T.setText(jst.b(qda.ao).c());
                    }
                    if (decoratedUser.images != null && !TextUtils.isEmpty(decoratedUser.images.largeUri)) {
                        Picasso.a(qda.U.getContext()).a(decoratedUser.images.largeUri).a(uvt.a(qda.U));
                        qda.U.setScaleType(ScaleType.CENTER_CROP);
                    }
                } else {
                    qda.T.setText(jst.b(qda.ao).c());
                }
            }

            public final void a(Throwable th) {
                qda.this.T.setText(jst.b(qda.this.ao).c());
                Logger.e(th, "UserDecorator failed to load", new Object[0]);
            }
        };
        this.aA = new qoy(this.ak, null, this.af, this.ae);
        this.ap.a(vun.a((wrf<T>) this.V.a).a(this.aC, (wun<Throwable>) $$Lambda$qda$akHO7qJY86sIB6PS6smwNp64F60.INSTANCE));
        this.ap.a(this.ag.a().a(this.ae).a((wun<? super T>) new $$Lambda$qda$zzhgCknOSY1X8J_GrVunZ5PQkY<Object>(this), (wun<Throwable>) $$Lambda$qda$CeKFaOYa3udJoStfNzojbASuf0I.INSTANCE));
        this.av.i = this;
        this.ap.a(this.ai.b().a(this.ae).a((wun<? super T>) new $$Lambda$qda$iMOfI17wtmBQ7Lad8MKCzxmLSHk<Object>(this), (wun<Throwable>) $$Lambda$qda$UtM5eHzm5sGZsVqMHrJZriYTk1U.INSTANCE));
        if (!this.aa.a(this.W)) {
            this.ap.a(this.ah.a().a(this.ae).a((wun<? super T>) new $$Lambda$qda$WB7KCHVifv7bp0a74_JiCLF7FQ<Object>(this), (wun<Throwable>) $$Lambda$qda$pwZ4_pw3RUcH1fKxow_x36DDFB4.INSTANCE));
        }
        this.ap.a(vun.a((ObservableSource<T>) this.ac.g(), BackpressureStrategy.BUFFER).a(this.ae).a((wun<? super T>) new $$Lambda$qda$59Js1C6Gmo7vD84sBdigv5qL2g4<Object>(this), (wun<Throwable>) $$Lambda$qda$dSD3vp43C6HDP8RzpAoEP8inKM.INSTANCE));
        this.av.j = this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        SettingsAdapter settingsAdapter = this.av;
        settingsAdapter.F = bool.booleanValue();
        settingsAdapter.a();
        settingsAdapter.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.av.a(num.intValue());
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
        qdq qdq = this.ay;
        String[] c = this.av.c();
        fay.a(c);
        if (c.length == qdq.a.size()) {
            for (int i = 0; i < c.length; i++) {
                qdq.a.set(i, c[i]);
            }
            qdq.notifyDataSetChanged();
        }
    }

    public final void z() {
        super.z();
        this.av.a();
        this.av.notifyDataSetChanged();
        this.as.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.av = (SettingsAdapter) this.Y.get();
        this.ay = (qdq) this.Z.get();
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
                    context.startActivity(kmf.a(context, ViewUris.aR.toString()).a);
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
        this.U.setImageDrawable(fzg.f(p()));
        ImageView imageView = (ImageView) inflate2.findViewById(16908294);
        imageView.setImageDrawable(new SpotifyIconDrawable(imageView.getContext(), SpotifyIconV2.CHEVRON_RIGHT, 24.0f));
        listView.addHeaderView(inflate2);
        inflate2.setOnClickListener(new $$Lambda$qda$iBKgYodfejKiXYCxNVLoYmQS8E(this));
        a(this.ay);
        listView.setDivider(null);
        listView.setDividerHeight(0);
        View view = (View) listView.getParent();
        view.setVisibility(4);
        this.as = LoadingView.a(layoutInflater, p(), view);
        ((ViewGroup) this.ar).addView(this.as, -1, -1);
        return this.ar;
    }

    public final void a(ListView listView, View view, int i, long j) {
        ((qea) fqf.a(view, qea.class)).a();
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

    /* access modifiers changed from: protected */
    public final void ai() {
        if (this.aq && this.b) {
            this.as.b();
        }
    }

    public final String b(Context context) {
        return context.getString(R.string.settings_title);
    }

    public final udr ag() {
        return udt.aP;
    }

    public final gjf aj() {
        return PageIdentifiers.SETTINGS;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        String str = (String) fay.a(jst.b(this.ao).h());
        String str2 = str;
        this.an.a(str2, "settings-profile-section", -1, InteractionType.HIT, "open-profile");
        this.aj.a(str);
    }

    public final sih ae_() {
        return ViewUris.U;
    }

    public final void a(boolean z) {
        if (!this.au.isUnsubscribed()) {
            this.au.unsubscribe();
        }
        this.au = wub.a(this.ag.a.a("publish-activity", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY)).a(this.ae).a(new $$Lambda$qda$EWC7I5CtorUsfmC9lfi5mjFqy0(this, z), new $$Lambda$qda$3TUaYcgaQh0uOcYiAxnVHZQQWqc(this, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(boolean z) {
        this.av.D = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Throwable th) {
        this.av.D = !z;
        Logger.e(th, "Failed updating 'publish-activity' in product state", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.av.D = bool.booleanValue();
    }

    public final void i(boolean z) {
        int i = this.av.E;
        int i2 = z ? i | 1 : i & -2;
        this.ap.a(wub.a(this.ah.a.a("public-toplist", Integer.toString(i2))).a(this.ae).a(new $$Lambda$qda$bNUr5USTPSyUY7uSPX0RTvqNLww(this, i2), new $$Lambda$qda$Dm6MO7lT7Wk2eutia6tY0PfG4k(this, i)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        this.av.a(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, Throwable th) {
        this.av.a(i);
        Logger.e(th, "Failed to update 'show my recently played artists' product state", new Object[0]);
    }

    public final void h() {
        ly.a(this).a((int) R.id.loader_settings);
        ly.a(this).a((int) R.id.loader_settings_session);
        this.ab.b(this.aw);
        this.ab.b();
        this.au.unsubscribe();
        this.ap.a();
        SettingsAdapter settingsAdapter = this.av;
        settingsAdapter.c.b();
        if (settingsAdapter.p != null) {
            settingsAdapter.p.a.unsubscribe();
        }
        ihg ihg = settingsAdapter.f;
        if (ihg.d != null && ihg.d.b()) {
            ihg.d.bf_();
        }
        ihg.d = null;
        hej.a(this.az);
        super.h();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SETTINGS, null);
    }
}
