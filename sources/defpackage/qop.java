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

/* renamed from: qop reason: default package */
public class qop extends jor implements d, b, NavigationItem, fyw, jol, upu {
    public rwr T;
    public iww U;
    public fyz V;
    public ToolbarMenuHelper W;
    public RxResolver X;
    public FireAndForgetResolver Y;
    public kxz Z;
    public qor a;
    private Button aA;
    private TextView aB;
    private TextView aC;
    private TextView aD;
    private View aE;
    private View aF;
    private View aG;
    /* access modifiers changed from: private */
    public ListView aH;
    private fyt aI;
    /* access modifiers changed from: private */
    public NotAvailableViewManager aJ;
    private fxq<fxw> aK;
    private ViewLoadingTracker aL;
    /* access modifiers changed from: private */
    public Parcelable aM;
    private fpt aN;
    private jxc aO;
    /* access modifiers changed from: private */
    public sih aP;
    /* access modifiers changed from: private */
    public String aQ;
    private Disposable aR = Disposables.b();
    /* access modifiers changed from: private */
    public qoq aS;
    private final jtv<DecoratedUser> aT = new jtv<DecoratedUser>() {
        public final void a(Throwable th) {
        }

        public final void a(Map<String, DecoratedUser> map) {
            DecoratedUser decoratedUser = (DecoratedUser) map.get(qop.this.as);
            if (decoratedUser != null) {
                qop.this.ay = decoratedUser.displayName;
                qop.this.az = decoratedUser.images != null ? decoratedUser.images.largeUri : null;
                qop.this.ai();
            }
        }
    };
    private final a aU = new a() {
        public final void onWebTokenUriReady(Uri uri) {
            if (uri != null && !Uri.EMPTY.equals(uri)) {
                qop.this.aQ = uri.toString();
            }
        }
    };
    private final fyq aV = new fyq() {
        public final void onClick() {
            String str;
            if (qop.this.ay != null) {
                str = qop.this.ay;
            } else {
                str = qop.this.as;
            }
            qop.this.U.a(qop.this.ae_().toString(), !TextUtils.isEmpty(qop.this.az) ? Uri.parse(qop.this.az) : Uri.EMPTY, (String) null, str, "", qop.this.a(qop.this.ak ? R.string.share_to_external_profile_own_message : R.string.share_to_external_profile_others_message), jnu.a);
        }
    };
    private final OnItemClickListener aW = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - qop.this.aH.getHeaderViewsCount();
            int a2 = qop.this.am.a(headerViewsCount);
            if (a2 == 0) {
                TopArtistModel topArtistModel = (TopArtistModel) view.getTag();
                if (topArtistModel == null) {
                    String f = jdt.f(qop.this.aP.toString());
                    qop.this.aS.b(f);
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("artists-json", qop.this.at.getTopArtists());
                    qop.this.ai.a(f, bundle);
                    return;
                }
                qop.this.aS.b(topArtistModel.uri());
                qop.this.ai.a(topArtistModel.uri());
            } else if (a2 != 1) {
                Assertion.a(String.format(Locale.US, "Missing case for section id %d for position %d", new Object[]{Integer.valueOf(a2), Integer.valueOf(headerViewsCount)}));
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    PlaylistModel playlistModel = (PlaylistModel) tag;
                    qop.this.aS.a(playlistModel.getUri());
                    qop.this.ai.a(spd.a(playlistModel.getUri()).b(playlistModel.getName()).a());
                    return;
                }
                String e = jdt.e(qop.this.aP.toString());
                qop.this.aS.a(e);
                qop.this.ai.a(e);
            }
        }
    };
    public Scheduler aa;
    public Scheduler ab;
    public BadgesFactory ac;
    public jtd ad;
    public AndroidFeatureUserProperties ae;
    public kyi af;
    public FollowManager ag;
    public jwv ah;
    public spi ai;
    public rnf aj;
    /* access modifiers changed from: private */
    public boolean ak;
    private ToggleButton al;
    /* access modifiers changed from: private */
    public jqb am;
    private qou an;
    private qon ao;
    private jlv ap;
    private qom aq;
    private String ar;
    /* access modifiers changed from: private */
    public String as;
    /* access modifiers changed from: private */
    public ProfileModel at;
    /* access modifiers changed from: private */
    public ProfileV2Model au;
    /* access modifiers changed from: private */
    public ProfileV2VolatileModel av;
    private qoy aw;
    private Disposable ax;
    /* access modifiers changed from: private */
    public String ay;
    /* access modifiers changed from: private */
    public String az;
    public uhs b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static qop a(String str, String str2, String str3, fpt fpt) {
        sih a2 = ViewUris.aA.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("view_uri", a2);
        bundle.putString("currentusername", str2);
        bundle.putString("title", str3);
        qop qop = new qop();
        qop.g(bundle);
        fpu.a((Fragment) qop, fpt);
        return qop;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aP = ae_();
        this.ar = this.i.getString("title");
        String string = this.i.getString("currentusername");
        this.aN = fpu.a((Fragment) this);
        this.as = jst.a(this.aP.toString()).c();
        this.ak = faw.a(this.as, string);
        if (bundle != null) {
            String str = "list";
            if (bundle.containsKey(str)) {
                this.aM = bundle.getParcelable(str);
            }
        }
        this.aw = new qoy(this.X, null, vun.a(this.ab), vun.a(this.aa));
        this.aO = new jxc(p().getApplicationContext(), this.ac);
        this.aS = this.a.a(udt.bd.a(), this.aP.toString());
        c(true);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.aL.a(bundle);
        ListView listView = this.aH;
        if (listView != null) {
            bundle.putParcelable("list", listView.onSaveInstanceState());
        }
    }

    public final void g() {
        super.g();
        this.aR = this.Z.a().a(this.aa).a((Consumer<? super T>) new $$Lambda$qop$QAVCscdLkJcmwtLzdZKu34dVWvI<Object>(this), (Consumer<? super Throwable>) $$Lambda$qop$3TJTtfxoGisx2sqrRpSzTdjxncw.INSTANCE);
        if (!this.ak) {
            this.aQ = ((String) this.aN.a(ikp.a)).replace("{uri}", this.aP.toString());
            this.ad.a(this.aQ, this.aU);
        }
    }

    public final void h() {
        super.h();
        Disposable disposable = this.ax;
        if (disposable != null) {
            disposable.bf_();
            this.ax = null;
        }
        this.aR.bf_();
        jtd jtd = this.ad;
        if (jtd != null) {
            jtd.a();
        }
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
                    public final /* synthetic */ void onResolved(Response response, Object obj) {
                        ProfileV2Model profileV2Model = (ProfileV2Model) obj;
                        if (qop.this.u()) {
                            qop.this.au = profileV2Model;
                            qop.k(qop.this);
                        }
                    }

                    public final void onError(Throwable th, ErrorCause errorCause) {
                        Logger.e(th, "Profile failed to load", new Object[0]);
                        qop.this.aJ.a(DataState.FAILED_TO_LOAD);
                    }
                });
            }
            String format2 = String.format("hm://user-profile-view/v2/android/profile/%s/volatile", new Object[]{Uri.encode(this.as)});
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.Y.resolve(RequestBuilder.get(format2).build(), new JsonCallbackReceiver<ProfileV2VolatileModel>(handler2, ProfileV2VolatileModel.class, this.aj.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
                public final /* synthetic */ void onResolved(Response response, Object obj) {
                    ProfileV2VolatileModel profileV2VolatileModel = (ProfileV2VolatileModel) obj;
                    if (qop.this.u()) {
                        qop.this.av = profileV2VolatileModel;
                        qop.k(qop.this);
                    }
                }

                public final void onError(Throwable th, ErrorCause errorCause) {
                    Logger.e(th, "ProfileVolatile failed to load", new Object[0]);
                    qop.this.aJ.a(DataState.FAILED_TO_LOAD);
                }
            });
            Disposable disposable = this.ax;
            if (disposable != null) {
                disposable.bf_();
            }
            wud a2 = this.aw.a(this.as);
            jtv<DecoratedUser> jtv = this.aT;
            jtv.getClass();
            $$Lambda$ncCSboH1FaCmXyCE6yVwqM2qGEw r1 = new $$Lambda$ncCSboH1FaCmXyCE6yVwqM2qGEw(jtv);
            jtv<DecoratedUser> jtv2 = this.aT;
            jtv2.getClass();
            wuk a3 = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$iY_nMrWcKl8ktbhdwcx_k94XNQY<Throwable>(jtv2));
            ObjectHelper.a(a3, "subscription is null");
            this.ax = new vuq(a3);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Button button;
        LayoutInflater layoutInflater2 = layoutInflater;
        this.an = new qou(p(), true, this.ah, this.ae);
        this.ao = new qon(p(), true, this.ah, this.ae);
        this.aq = new qom(p(), this.ah, this.ae);
        this.am = new jqb(p());
        this.am.a((ListAdapter) this.aq, a((int) R.string.profile_section_title_invitation_codes), 3, (View) null, (View) null);
        this.am.a((ListAdapter) this.an, a((int) R.string.profile_section_title_recent_artists), 0, (View) null, (View) null);
        this.am.a((ListAdapter) this.ao, a((int) R.string.profile_section_title_public_playlists), 1, (View) null, (View) null);
        jqb jqb = this.am;
        fuj a2 = jqj.a(p(), R.string.profile_no_activity_title, R.string.profile_no_activity_text);
        $$Lambda$qop$JuAVEE91uKXWGLMaUD72gmifYN4 r4 = new $$Lambda$qop$JuAVEE91uKXWGLMaUD72gmifYN4(this);
        Button V_ = a2.V_();
        a2.a(true);
        V_.setId(R.id.button_primary);
        V_.setText(R.string.profile_no_activity_button_browse);
        V_.setSingleLine(true);
        V_.setEllipsize(TruncateAt.END);
        V_.setOnClickListener(r4);
        this.ap = new jlv(a2.getView(), false);
        jqb.a((ListAdapter) this.ap, (String) null, 2);
        this.am.a(3, 0, 1);
        if (!this.ak) {
            ka p = p();
            Resources resources = p.getResources();
            String upperCase = resources.getString(R.string.header_follow_follow).toUpperCase(Locale.getDefault());
            String upperCase2 = resources.getString(R.string.header_follow_following).toUpperCase(Locale.getDefault());
            ToggleButton h = fzz.h(p);
            h.setTextOn(upperCase2);
            h.setTextOff(upperCase);
            this.al = h;
            this.al.setId(R.id.follow_button);
            this.al.setOnClickListener(new $$Lambda$qop$3xN2oL5jTl2lfE1fl9u1g4SumM(this));
            fuj fuj = (fuj) fqb.a(this.ap.getView(0, null, null), fuj.class);
            fuj.c().setVisibility(8);
            fuj.a(false);
        }
        ka p2 = p();
        if (this.ak) {
            button = fzz.b(n());
            button.setId(R.id.profile_find_friends);
            button.setText(a((int) R.string.profile_find_friends_button));
            button.setOnClickListener(new $$Lambda$qop$s3lYr16wWWjosMNjVyfLVZh5iI(this));
        } else {
            button = this.al;
        }
        this.aA = button;
        if (jtc.b(p2)) {
            this.aK = fxq.b((Context) p2).b().a(this.aA, 1).a((Fragment) this);
        } else {
            this.aK = fxq.a((Context) p2).b().a(this.aA, 1).a((Fragment) this);
        }
        this.aH = this.aK.e().a;
        View inflate = layoutInflater2.inflate(R.layout.profile_counts_subheader, null);
        inflate.setBackgroundColor(0);
        this.aH.addHeaderView(inflate, null, false);
        this.aH.setAdapter(this.am);
        this.aH.setOnItemClickListener(this.aW);
        ((ImageView) fay.a(this.aK.c())).setImageDrawable(fzg.f(p()));
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
        uui.c(this.aE).a(this.aB, textView).a();
        uui.c(this.aF).a(this.aC, textView2).a();
        uui.c(this.aG).a(this.aD, textView3).a();
        this.aG.setOnClickListener(new $$Lambda$qop$g7MCgWm_GLbAvfv7C71LzwDpH24(this));
        this.aE.setOnClickListener(new $$Lambda$qop$x1QHsrW3WzQrcqlDBSum2KVcxw(this));
        this.aF.setOnClickListener(new $$Lambda$qop$WcijdE5jhfebP2ZmPlqMEU6xbhY(this));
        return frameLayout;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        String sih = this.aP.toString();
        boolean isChecked = this.al.isChecked();
        this.ag.a(sih, isChecked);
        this.aS.a(sih, isChecked);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        String d = jdt.d(this.as);
        this.ai.a(spd.a(d).b(o().getResources().getString(R.string.playlist_default_title)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        String a2 = jdt.a(this.as);
        this.ai.a(spd.a(a2).b(o().getResources().getString(R.string.profile_list_title_followers)).a());
    }

    public final void ax_() {
        super.ax_();
        this.aL.e();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.aH.setOnCreateContextMenuListener(this);
        this.ag.a(this.aP.toString(), (b) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.ai.a("spotify:findfriends");
    }

    private utt a(ProfileModel profileModel) {
        if (profileModel.isVerified()) {
            return this.aO;
        }
        return uuz.a();
    }

    /* access modifiers changed from: private */
    public void ai() {
        if (this.ay != null) {
            ((fxw) this.aK.a()).a(this.ay);
        }
        if (!fax.a(this.az) && this.at != null) {
            String str = this.az;
            if (str != null && !str.endsWith(".gif")) {
                this.ah.a(this.aK.d(), !TextUtils.isEmpty(this.az) ? Uri.parse(this.az) : Uri.EMPTY, (uvj) this.aK.g());
            }
            ImageView imageView = (ImageView) fay.a(this.aK.c());
            this.ah.a(imageView, !TextUtils.isEmpty(this.az) ? Uri.parse(this.az) : Uri.EMPTY, a(this.at));
            imageView.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    public final void a(Menu menu) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        fxq<fxw> fxq = this.aK;
        if (fxq != null) {
            fxq.a(fyt, p());
        }
        fyt.a(uhs.a(this.az, this.aP.toString(), true), SpotifyIconV2.USER, false, true);
        fyt.b(this.ay);
        this.V.a(fyt, this.aV);
        ProfileModel profileModel = this.at;
        if (profileModel != null && profileModel.reportAbuseEnabled()) {
            String str = this.aQ;
            if (str != null) {
                this.W.a(fyt, this.aP, str);
            }
        }
        this.aI = fyt;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.ar == null) {
            this.ar = p().getString(R.string.profile_title);
        }
        this.af.a(this, this.ar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.ai.a(ViewUris.af.toString());
    }

    public final String b(Context context) {
        return context.getString(R.string.profile_title);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("profile:");
        sb.append(this.i.getString("view_uri"));
        return sb.toString();
    }

    public final udr ag() {
        return udt.bd;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PROFILE, null);
    }

    public final Uri au_() {
        return Uri.parse(this.aP.toString());
    }

    public final void B() {
        this.ag.b(this.aP.toString(), (b) this);
        super.B();
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

    private static void a(View view, TextView textView, int i) {
        textView.setText(String.valueOf(i));
        view.setClickable(i > 0);
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final sih ae_() {
        return (sih) fay.a(this.i.getParcelable("view_uri"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.ai.a(spd.a(jdt.b(this.as)).b(o().getResources().getString(R.string.profile_list_title_following)).a());
    }

    static /* synthetic */ void k(qop qop) {
        ProfileV2Model profileV2Model = qop.au;
        if (profileV2Model != null) {
            ProfileV2VolatileModel profileV2VolatileModel = qop.av;
            if (profileV2VolatileModel != null) {
                qop.at = ProfileModel.create(profileV2VolatileModel, profileV2Model);
                qop.ag.a(qop.at.getFollowData());
                a(qop.aG, qop.aD, qop.at.getPlaylistCount());
                qop.ai();
                qop.am.notifyDataSetChanged();
                if (qop.at.getPlaylists() != null) {
                    qop.ao.a((T[]) qop.at.getPlaylists());
                    qop.am.c(1);
                    qop.am.a(2);
                }
                if (qop.at.getTopArtists() != null) {
                    TopArtistModel[] topArtists = qop.at.getTopArtists();
                    qop.an.a((T[]) (TopArtistModel[]) Arrays.copyOfRange(topArtists, 0, Math.min(3, topArtists.length)));
                    qop.am.c(0);
                    qop.am.a(2);
                }
                if (qop.at.getInvitationCodes() != null && qop.at.getInvitationCodes().length > 0 && ((Boolean) qop.aN.a(qoo.a)).booleanValue()) {
                    qop.aq.a(qop.at.hasMoreInvitationCodes());
                    qop.aq.a((T[]) qop.at.getInvitationCodes());
                    qop.am.c(3);
                    qop.am.a(2);
                }
                qop.aH.post(new Runnable() {
                    public final void run() {
                        if (qop.this.aM != null) {
                            qop.this.aH.onRestoreInstanceState(qop.this.aM);
                            qop.this.aM = null;
                        }
                    }
                });
                qop.aJ.a(DataState.LOADED);
                qop.p().invalidateOptionsMenu();
                qop.aL.b();
                return;
            }
        }
        qop.aL.e();
    }
}
