package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.mobile.android.spotlets.user.ProfileV2Model;
import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.NotAvailableViewManager;
import com.spotify.music.contentviewstate.NotAvailableViewManager.DataState;
import com.spotify.music.features.user.model.DecoratedUser;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.follow.FollowManager.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* renamed from: qwy reason: default package */
public class qwy extends jrd implements d, b, NavigationItem, fzq, jqx, vaz {
    public sgb T;
    public izh U;
    public fzt V;
    public ToolbarMenuHelper W;
    public RxResolver X;
    public FireAndForgetResolver Y;
    public lbi Z;
    public qxa a;
    private Button aA;
    private TextView aB;
    private TextView aC;
    private TextView aD;
    private View aE;
    private View aF;
    private View aG;
    /* access modifiers changed from: private */
    public ListView aH;
    private fzn aI;
    /* access modifiers changed from: private */
    public NotAvailableViewManager aJ;
    private fyk<fyq> aK;
    private ViewLoadingTracker aL;
    /* access modifiers changed from: private */
    public Parcelable aM;
    private fqn aN;
    private jzc aO;
    /* access modifiers changed from: private */
    public sso aP;
    /* access modifiers changed from: private */
    public String aQ;
    private Disposable aR = Disposables.b();
    /* access modifiers changed from: private */
    public qwz aS;
    private final jwd<DecoratedUser> aT = new jwd<DecoratedUser>() {
        public final void a(Throwable th) {
        }

        public final void a(Map<String, DecoratedUser> map) {
            DecoratedUser decoratedUser = (DecoratedUser) map.get(qwy.this.as);
            if (decoratedUser != null) {
                qwy.this.ay = decoratedUser.displayName;
                qwy.this.az = decoratedUser.images != null ? decoratedUser.images.largeUri : null;
                qwy.this.ai();
            }
        }
    };
    private final a aU = new a() {
        public final void onWebTokenUriReady(Uri uri) {
            if (uri != null && !Uri.EMPTY.equals(uri)) {
                qwy.this.aQ = uri.toString();
            }
        }
    };
    private final fzk aV = new fzk() {
        public final void onClick() {
            qwy.this.U.a(qwy.this.ae_().toString(), !TextUtils.isEmpty(qwy.this.az) ? Uri.parse(qwy.this.az) : Uri.EMPTY, (String) null, qwy.this.ay != null ? qwy.this.ay : qwy.this.as, "", qwy.this.a(qwy.this.ak ? R.string.share_to_external_profile_own_message : R.string.share_to_external_profile_others_message), jqg.a);
        }
    };
    private final OnItemClickListener aW = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - qwy.this.aH.getHeaderViewsCount();
            int a2 = qwy.this.am.a(headerViewsCount);
            if (a2 == 0) {
                TopArtistModel topArtistModel = (TopArtistModel) view.getTag();
                if (topArtistModel == null) {
                    String f = jgi.f(qwy.this.aP.toString());
                    qwy.this.aS.b(f);
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("artists-json", qwy.this.at.getTopArtists());
                    qwy.this.ai.a(f, bundle);
                    return;
                }
                qwy.this.aS.b(topArtistModel.uri());
                qwy.this.ai.a(topArtistModel.uri());
            } else if (a2 != 1) {
                Assertion.a(String.format(Locale.US, "Missing case for section id %d for position %d", new Object[]{Integer.valueOf(a2), Integer.valueOf(headerViewsCount)}));
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    PlaylistModel playlistModel = (PlaylistModel) tag;
                    qwy.this.aS.a(playlistModel.getUri());
                    qwy.this.ai.a(szk.a(playlistModel.getUri()).b(playlistModel.getName()).a());
                    return;
                }
                String e = jgi.e(qwy.this.aP.toString());
                qwy.this.aS.a(e);
                qwy.this.ai.a(e);
            }
        }
    };
    public Scheduler aa;
    public Scheduler ab;
    public BadgesFactory ac;
    public jvj ad;
    public AndroidFeatureUserProperties ae;
    public lbr af;
    public FollowManager ag;
    public jyx ah;
    public szp ai;
    public rwl aj;
    /* access modifiers changed from: private */
    public boolean ak;
    private ToggleButton al;
    /* access modifiers changed from: private */
    public jsm am;
    private qxd an;
    private qww ao;
    private joh ap;
    private qwv aq;
    private String ar;
    /* access modifiers changed from: private */
    public String as;
    /* access modifiers changed from: private */
    public ProfileModel at;
    /* access modifiers changed from: private */
    public ProfileV2Model au;
    /* access modifiers changed from: private */
    public ProfileV2VolatileModel av;
    private qxh aw;
    private Disposable ax;
    /* access modifiers changed from: private */
    public String ay;
    /* access modifiers changed from: private */
    public String az;
    public utg b;

    public static qwy a(String str, String str2, String str3, fqn fqn) {
        sso a2 = ViewUris.az.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("view_uri", a2);
        bundle.putString("currentusername", str2);
        bundle.putString("title", str3);
        qwy qwy = new qwy();
        qwy.g(bundle);
        fqo.a((Fragment) qwy, fqn);
        return qwy;
    }

    private vfk a(ProfileModel profileModel) {
        return profileModel.isVerified() ? this.aO : vgq.a();
    }

    private static void a(View view, TextView textView, int i) {
        textView.setText(String.valueOf(i));
        view.setClickable(i > 0);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.aJ.a(z);
        if (z) {
            if (!this.aJ.a().booleanValue()) {
                this.aJ.a(DataState.LOADING);
                String format = String.format("hm://user-profile-view/v2/android/profile/%s", new Object[]{Uri.encode(this.as)});
                Handler handler = new Handler(Looper.getMainLooper());
                this.Y.resolve(RequestBuilder.get(format).build(), new JsonCallbackReceiver<ProfileV2Model>(handler, ProfileV2Model.class, this.aj.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
                    public final void onError(Throwable th, ErrorCause errorCause) {
                        Logger.e(th, "Profile failed to load", new Object[0]);
                        qwy.this.aJ.a(DataState.FAILED_TO_LOAD);
                    }

                    public final /* synthetic */ void onResolved(Response response, Object obj) {
                        ProfileV2Model profileV2Model = (ProfileV2Model) obj;
                        if (qwy.this.u()) {
                            qwy.this.au = profileV2Model;
                            qwy.k(qwy.this);
                        }
                    }
                });
            }
            String format2 = String.format("hm://user-profile-view/v2/android/profile/%s/volatile", new Object[]{Uri.encode(this.as)});
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.Y.resolve(RequestBuilder.get(format2).build(), new JsonCallbackReceiver<ProfileV2VolatileModel>(handler2, ProfileV2VolatileModel.class, this.aj.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
                public final void onError(Throwable th, ErrorCause errorCause) {
                    Logger.e(th, "ProfileVolatile failed to load", new Object[0]);
                    qwy.this.aJ.a(DataState.FAILED_TO_LOAD);
                }

                public final /* synthetic */ void onResolved(Response response, Object obj) {
                    ProfileV2VolatileModel profileV2VolatileModel = (ProfileV2VolatileModel) obj;
                    if (qwy.this.u()) {
                        qwy.this.av = profileV2VolatileModel;
                        qwy.k(qwy.this);
                    }
                }
            });
            Disposable disposable = this.ax;
            if (disposable != null) {
                disposable.bd_();
            }
            xii a2 = this.aw.a(this.as);
            jwd<DecoratedUser> jwd = this.aT;
            jwd.getClass();
            $$Lambda$XDL4Au0f00RTfc3B4IioulF3aM r1 = new $$Lambda$XDL4Au0f00RTfc3B4IioulF3aM(jwd);
            jwd<DecoratedUser> jwd2 = this.aT;
            jwd2.getClass();
            xip a3 = a2.a((xis<? super T>) r1, (xis<Throwable>) new $$Lambda$MqG290HLZEY1Aj0HIWM4pqrL_us<Throwable>(jwd2));
            ObjectHelper.a(a3, "subscription is null");
            this.ax = new wiw(a3);
        }
    }

    /* access modifiers changed from: private */
    public void ai() {
        if (this.ay != null) {
            ((fyq) this.aK.a()).a(this.ay);
        }
        if (!fbo.a(this.az) && this.at != null) {
            String str = this.az;
            if (str != null && !str.endsWith(".gif")) {
                this.ah.a(this.aK.d(), !TextUtils.isEmpty(this.az) ? Uri.parse(this.az) : Uri.EMPTY, (vha) this.aK.g());
            }
            ImageView imageView = (ImageView) fbp.a(this.aK.c());
            this.ah.a(imageView, !TextUtils.isEmpty(this.az) ? Uri.parse(this.az) : Uri.EMPTY, a(this.at));
            imageView.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.ai.a(ViewUris.ae.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.ai.a("spotify:findfriends");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.ai.a(szk.a(jgi.b(this.as)).b(o().getResources().getString(R.string.profile_list_title_following)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        String a2 = jgi.a(this.as);
        this.ai.a(szk.a(a2).b(o().getResources().getString(R.string.profile_list_title_followers)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        String d = jgi.d(this.as);
        this.ai.a(szk.a(d).b(o().getResources().getString(R.string.playlist_default_title)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        String sso = this.aP.toString();
        boolean isChecked = this.al.isChecked();
        this.ag.a(sso, isChecked);
        this.aS.a(sso, isChecked);
    }

    static /* synthetic */ void k(qwy qwy) {
        ProfileV2Model profileV2Model = qwy.au;
        if (profileV2Model != null) {
            ProfileV2VolatileModel profileV2VolatileModel = qwy.av;
            if (profileV2VolatileModel != null) {
                qwy.at = ProfileModel.create(profileV2VolatileModel, profileV2Model);
                qwy.ag.a(qwy.at.getFollowData());
                a(qwy.aG, qwy.aD, qwy.at.getPlaylistCount());
                qwy.ai();
                qwy.am.notifyDataSetChanged();
                if (qwy.at.getPlaylists() != null) {
                    qwy.ao.a((T[]) qwy.at.getPlaylists());
                    qwy.am.c(1);
                    qwy.am.a(2);
                }
                if (qwy.at.getTopArtists() != null) {
                    TopArtistModel[] topArtists = qwy.at.getTopArtists();
                    qwy.an.a((T[]) (TopArtistModel[]) Arrays.copyOfRange(topArtists, 0, Math.min(3, topArtists.length)));
                    qwy.am.c(0);
                    qwy.am.a(2);
                }
                if (qwy.at.getInvitationCodes() != null && qwy.at.getInvitationCodes().length > 0 && ((Boolean) qwy.aN.a(qwx.a)).booleanValue()) {
                    qwy.aq.a(qwy.at.hasMoreInvitationCodes());
                    qwy.aq.a((T[]) qwy.at.getInvitationCodes());
                    qwy.am.c(3);
                    qwy.am.a(2);
                }
                qwy.aH.post(new Runnable() {
                    public final void run() {
                        if (qwy.this.aM != null) {
                            qwy.this.aH.onRestoreInstanceState(qwy.this.aM);
                            qwy.this.aM = null;
                        }
                    }
                });
                qwy.aJ.a(DataState.LOADED);
                qwy.p().invalidateOptionsMenu();
                qwy.aL.b();
                return;
            }
        }
        qwy.aL.e();
    }

    public final void B() {
        this.ag.b(this.aP.toString(), (b) this);
        super.B();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Button button;
        LayoutInflater layoutInflater2 = layoutInflater;
        this.an = new qxd(p(), true, this.ah, this.ae);
        this.ao = new qww(p(), true, this.ah, this.ae);
        this.aq = new qwv(p(), this.ah, this.ae);
        this.am = new jsm(p());
        this.am.a((ListAdapter) this.aq, a((int) R.string.profile_section_title_invitation_codes), 3, (View) null, (View) null);
        this.am.a((ListAdapter) this.an, a((int) R.string.profile_section_title_recent_artists), 0, (View) null, (View) null);
        this.am.a((ListAdapter) this.ao, a((int) R.string.profile_section_title_public_playlists), 1, (View) null, (View) null);
        jsm jsm = this.am;
        fvd a2 = jsu.a(p(), R.string.profile_no_activity_title, R.string.profile_no_activity_text);
        $$Lambda$qwy$ujMLH4DWE_OPA3PerdXbCdJRPrE r4 = new $$Lambda$qwy$ujMLH4DWE_OPA3PerdXbCdJRPrE(this);
        Button V_ = a2.V_();
        a2.a(true);
        V_.setId(R.id.button_primary);
        V_.setText(R.string.profile_no_activity_button_browse);
        V_.setSingleLine(true);
        V_.setEllipsize(TruncateAt.END);
        V_.setOnClickListener(r4);
        this.ap = new joh(a2.getView(), false);
        jsm.a((ListAdapter) this.ap, (String) null, 2);
        this.am.a(3, 0, 1);
        if (!this.ak) {
            kf p = p();
            Resources resources = p.getResources();
            String upperCase = resources.getString(R.string.header_follow_follow).toUpperCase(Locale.getDefault());
            String upperCase2 = resources.getString(R.string.header_follow_following).toUpperCase(Locale.getDefault());
            ToggleButton h = gat.h(p);
            h.setTextOn(upperCase2);
            h.setTextOff(upperCase);
            this.al = h;
            this.al.setId(R.id.follow_button);
            this.al.setOnClickListener(new $$Lambda$qwy$TN7HQ9W242PMvELiwhF5HwZ1wLc(this));
            fvd fvd = (fvd) fqv.a(this.ap.getView(0, null, null), fvd.class);
            fvd.c().setVisibility(8);
            fvd.a(false);
        }
        kf p2 = p();
        if (this.ak) {
            button = gat.b(n());
            button.setId(R.id.profile_find_friends);
            button.setText(a((int) R.string.profile_find_friends_button));
            button.setOnClickListener(new $$Lambda$qwy$HVs18Z2ASmDKy0DdGetsp8DaZV8(this));
        } else {
            button = this.al;
        }
        this.aA = button;
        if (jvi.b(p2)) {
            this.aK = fyk.b((Context) p2).b().a(this.aA, 1).a((Fragment) this);
        } else {
            this.aK = fyk.a((Context) p2).b().a(this.aA, 1).a((Fragment) this);
        }
        this.aH = this.aK.e().a;
        View inflate = layoutInflater2.inflate(R.layout.profile_counts_subheader, null);
        inflate.setBackgroundColor(0);
        this.aH.addHeaderView(inflate, null, false);
        this.aH.setAdapter(this.am);
        this.aH.setOnItemClickListener(this.aW);
        ((ImageView) fbp.a(this.aK.c())).setImageDrawable(gaa.f(p()));
        FrameLayout frameLayout = new FrameLayout(p());
        this.aL = this.T.a(frameLayout, this.aP.toString(), bundle, af());
        frameLayout.addView(this.aK.b());
        this.aJ = new NotAvailableViewManager(p(), layoutInflater2, this.aK.b(), frameLayout);
        this.aJ.a = R.string.profile_offline_body;
        this.aE = inflate.findViewById(R.id.followers_layout);
        this.aF = inflate.findViewById(R.id.following_layout);
        this.aG = inflate.findViewById(R.id.playlists_layout);
        this.aB = (TextView) inflate.findViewById(R.id.followers_count);
        this.aC = (TextView) inflate.findViewById(R.id.following_count);
        this.aD = (TextView) inflate.findViewById(R.id.playlists_count);
        TextView textView = (TextView) inflate.findViewById(R.id.followers_label);
        TextView textView2 = (TextView) inflate.findViewById(R.id.following_label);
        TextView textView3 = (TextView) inflate.findViewById(R.id.playlists_label);
        vfz.c(this.aE).a(this.aB, textView).a();
        vfz.c(this.aF).a(this.aC, textView2).a();
        vfz.c(this.aG).a(this.aD, textView3).a();
        this.aG.setOnClickListener(new $$Lambda$qwy$j2VVXnKBMlgC5zAZlSA5DhjjU(this));
        this.aE.setOnClickListener(new $$Lambda$qwy$7PtMqt35hATcKTg3UIrxaxLpo(this));
        this.aF.setOnClickListener(new $$Lambda$qwy$_qHdSLyQAC955F6RewKXEZ0pls(this));
        return frameLayout;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(Menu menu) {
        fzv.a(this, menu);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.aH.setOnCreateContextMenuListener(this);
        this.ag.a(this.aP.toString(), (b) this);
    }

    public final void a(a aVar) {
        a(this.aE, this.aB, aVar.c);
        a(this.aF, this.aC, aVar.b);
        ToggleButton toggleButton = this.al;
        if (toggleButton != null) {
            toggleButton.setChecked(aVar.d);
            ez.a(p());
        }
    }

    public final void a(fzn fzn) {
        fyk<fyq> fyk = this.aK;
        if (fyk != null) {
            fyk.a(fzn, p());
        }
        fzn.a(utg.a(this.az, this.aP.toString(), true), SpotifyIconV2.USER, false, true);
        fzn.b(this.ay);
        this.V.a(fzn, this.aV);
        ProfileModel profileModel = this.at;
        if (profileModel != null && profileModel.reportAbuseEnabled()) {
            String str = this.aQ;
            if (str != null) {
                this.W.a(fzn, this.aP, str);
            }
        }
        this.aI = fzn;
    }

    public final void aP_() {
        super.aP_();
        this.aR = this.Z.a().a(this.aa).a((Consumer<? super T>) new $$Lambda$qwy$3Z1_nzPimTbu9M7u9ionSV7QiOo<Object>(this), (Consumer<? super Throwable>) $$Lambda$qwy$Zqlrkh2xRlYDm34uCE08wPxhvFU.INSTANCE);
        if (!this.ak) {
            this.aQ = ((String) this.aN.a(inc.a)).replace("{uri}", this.aP.toString());
            this.ad.a(this.aQ, this.aU);
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return (sso) fbp.a(this.i.getParcelable("view_uri"));
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PROFILE, null);
    }

    public final uqm ag() {
        return uqo.bd;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final Uri at_() {
        return Uri.parse(this.aP.toString());
    }

    public final void aw_() {
        super.aw_();
        this.aL.e();
    }

    public final String b(Context context) {
        return context.getString(R.string.profile_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aP = ae_();
        this.ar = this.i.getString("title");
        String string = this.i.getString("currentusername");
        this.aN = fqo.a((Fragment) this);
        this.as = jva.a(this.aP.toString()).c();
        this.ak = fbn.a(this.as, string);
        if (bundle != null) {
            String str = "list";
            if (bundle.containsKey(str)) {
                this.aM = bundle.getParcelable(str);
            }
        }
        this.aw = new qxh(this.X, null, wit.a(this.ab), wit.a(this.aa));
        this.aO = new jzc(p().getApplicationContext(), this.ac);
        this.aS = this.a.a(uqo.bd.a(), this.aP.toString());
        c(true);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.ar == null) {
            this.ar = p().getString(R.string.profile_title);
        }
        this.af.a(this, this.ar);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("profile:");
        sb.append(this.i.getString("view_uri"));
        return sb.toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.aL.a(bundle);
        ListView listView = this.aH;
        if (listView != null) {
            bundle.putParcelable("list", listView.onSaveInstanceState());
        }
    }

    public final void h() {
        super.h();
        Disposable disposable = this.ax;
        if (disposable != null) {
            disposable.bd_();
            this.ax = null;
        }
        this.aR.bd_();
        jvj jvj = this.ad;
        if (jvj != null) {
            jvj.a();
        }
    }
}
