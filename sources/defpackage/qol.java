package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.collect.Lists;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.view.GradientView;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.HeaderView;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import com.spotify.playlist.models.Show.MediaType;
import com.squareup.picasso.Picasso;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: qol reason: default package */
public class qol extends jrd implements d, fzq, jqx, uez, uqq {
    private static final sso ak = sso.a("spotify:empty");
    public Picasso T;
    public qof U;
    public PlayerFactory V;
    public utg W;
    public sgb X;
    public fzt Y;
    public lon Z;
    public tmu a;
    /* access modifiers changed from: private */
    public sso aA;
    /* access modifiers changed from: private */
    public String aB;
    /* access modifiers changed from: private */
    public String aC;
    /* access modifiers changed from: private */
    public String aD;
    /* access modifiers changed from: private */
    public String aE;
    /* access modifiers changed from: private */
    public String aF;
    /* access modifiers changed from: private */
    public String aG;
    /* access modifiers changed from: private */
    public String aH;
    /* access modifiers changed from: private */
    public boolean aI;
    private boolean aJ;
    private boolean aK;
    /* access modifiers changed from: private */
    public boolean aL;
    /* access modifiers changed from: private */
    public boolean aM;
    /* access modifiers changed from: private */
    public boolean aN;
    /* access modifiers changed from: private */
    public boolean aO;
    /* access modifiers changed from: private */
    public boolean aP;
    /* access modifiers changed from: private */
    public int aQ;
    /* access modifiers changed from: private */
    public int aR;
    private int aS;
    /* access modifiers changed from: private */
    public Player aT;
    /* access modifiers changed from: private */
    public vau aU;
    /* access modifiers changed from: private */
    public SortOption aV;
    private vav aW;
    /* access modifiers changed from: private */
    public MediaType aX;
    /* access modifiers changed from: private */
    public ConsumptionOrder aY;
    /* access modifiers changed from: private */
    public fxy aZ;
    public jpc aa;
    public izh ab;
    public szp ac;
    public ufv ad;
    public RxResolver ae;
    public lbr af;
    public xil ag;
    public xil ah;
    final rly ai;
    final jwn<vml> aj;
    /* access modifiers changed from: private */
    public final List<vau> al = Lists.a();
    private final List<SortOption> am = Lists.a();
    private final SortOption an;
    private final SortOption ao;
    private final xok ap;
    private final xom aq;
    /* access modifiers changed from: private */
    public LinearLayoutManager ar;
    /* access modifiers changed from: private */
    public vau as;
    /* access modifiers changed from: private */
    public vau at;
    /* access modifiers changed from: private */
    public vau au;
    /* access modifiers changed from: private */
    public ViewLoadingTracker av;
    /* access modifiers changed from: private */
    public fqn aw;
    /* access modifiers changed from: private */
    public sgq<vkv, vml, Policy> ax;
    private sgx ay;
    /* access modifiers changed from: private */
    public vhx az;
    public kbd b;
    private final defpackage.vav.a bA;
    private final OnClickListener bB;
    private final itd bC;
    /* access modifiers changed from: private */
    public HeaderView ba;
    /* access modifiers changed from: private */
    public jsr bb;
    private RecyclerView bc;
    private Parcelable bd;
    private LoadingView be;
    /* access modifiers changed from: private */
    public TextView bf;
    /* access modifiers changed from: private */
    public TextView bg;
    /* access modifiers changed from: private */
    public TextView bh;
    /* access modifiers changed from: private */
    public View bi;
    /* access modifiers changed from: private */
    public View bj;
    private ViewGroup bk;
    private ViewGroup bl;
    /* access modifiers changed from: private */
    public FrameLayout bm;
    private LinearLayout bn;
    private VideoSurfaceView bo;
    private FrameLayout bp;
    private LinearLayout bq;
    private TextView br;
    private View bs;
    private fvd bt;
    /* access modifiers changed from: private */
    public boolean bu;
    private boolean bv;
    private xip bw;
    /* access modifiers changed from: private */
    public final jor<vml> bx;
    private PlayerStateObserver by;
    /* access modifiers changed from: private */
    public final defpackage.vau.a bz;

    /* renamed from: qol$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[MediaType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.playlist.models.Show$MediaType[] r0 = com.spotify.playlist.models.Show.MediaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.playlist.models.Show$MediaType r1 = com.spotify.playlist.models.Show.MediaType.MIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.playlist.models.Show$MediaType r1 = com.spotify.playlist.models.Show.MediaType.AUDIO     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.playlist.models.Show$MediaType r1 = com.spotify.playlist.models.Show.MediaType.VIDEO     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qol.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: qol$a */
    class a implements ActionCallback {
        private a() {
        }

        /* synthetic */ a(qol qol, byte b) {
            this();
        }

        public void onActionForbidden(List<String> list) {
            Logger.d("-> onActionForbidden() reasons: %s", TextUtils.join(", ", list));
            qol.this.aO = true;
            qol.this.ak();
        }

        public void onActionSuccess() {
        }
    }

    /* renamed from: qol$b */
    static class b extends FrameLayout {
        public b(Context context) {
            super(context);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public qol() {
        String str = "number";
        SortOption sortOption = new SortOption(str, R.string.sort_order_date, true);
        String str2 = "publishDate";
        SortOption sortOption2 = new SortOption(str2, true);
        String str3 = "name";
        sortOption2.mSecondarySortOption = new SortOption(str3);
        sortOption.mSecondarySortOption = sortOption2;
        this.an = sortOption;
        SortOption a2 = new SortOption(str, R.string.sort_order_date, true).a(true);
        SortOption a3 = new SortOption(str2, true).a(true);
        a3.mSecondarySortOption = new SortOption(str3);
        a2.mSecondarySortOption = a3;
        this.ao = a2;
        this.ap = new xok();
        this.aq = new xom();
        this.aA = ak;
        this.aQ = 100;
        this.aS = -1;
        this.aX = MediaType.UNKNOWN;
        this.aY = ConsumptionOrder.UNKNOWN;
        this.ai = new rly();
        this.bx = new $$Lambda$qol$20tdAZKLREAKdBKpJO2bBZnI(this);
        this.aj = new jwn<vml>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(DialogInterface dialogInterface) {
                qol.this.ac.a();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(vml vml, View view) {
                jok.a((Context) fbp.a(qol.this.n()), qol.this.bx, vml, qol.this.aA);
            }

            public final /* synthetic */ void a(Object obj) {
                vml vml = (vml) obj;
                Logger.b("onDataLoaded(showModel: %s) isAdded(): %s", vml, Boolean.valueOf(qol.this.u()));
                if (!qol.this.u()) {
                    if (qol.this.av != null) {
                        qol.this.av.e();
                    }
                    return;
                }
                boolean z = ((vkv[]) vml.getItems()).length == 0;
                Logger.b("onDataLoaded() showModel.isLoading(): %s, isEmpty: %s", Boolean.valueOf(vml.isLoading()), Boolean.valueOf(z));
                if (!vml.isLoading() || !z) {
                    kf kfVar = (kf) fbp.a(qol.this.p());
                    if (!qol.this.bu && qol.this.aX == MediaType.VIDEO && !isu.c(qol.this.aw)) {
                        qol.this.bu = true;
                        defpackage.gaq.a a2 = new defpackage.gaq.a(kfVar, 2132017714).a((int) R.string.show_video_is_not_available_button_ok, (DialogInterface.OnClickListener) $$Lambda$qol$3$yuoQSxogMwyuEN0NWND5guknP1k.INSTANCE);
                        a2.g = new $$Lambda$qol$3$2w_BqmKzd9bQnWcIHIOSgAODB8(this);
                        a2.b(R.string.show_video_is_not_available_body).a((rma) kfVar, PageIdentifiers.DIALOG_SHOW_VIDEOUNAVAILABLE.mPageIdentifier, qol.this.aA.toString()).a().show();
                    }
                    if (qol.this.bu) {
                        if (qol.this.av != null) {
                            qol.this.av.e();
                        }
                        return;
                    }
                    qol.this.aC = vml.a().d();
                    ufv ufv = qol.this.ad;
                    vkv[] vkvArr = (vkv[]) vml.getItems();
                    ufa ufa = ufv.e;
                    vkv[] vkvArr2 = ufv.f;
                    if (vkvArr2 != null) {
                        ufa.b = vkvArr2;
                    }
                    ufa.a = vkvArr;
                    oa.a(ufv.e).a((androidx.recyclerview.widget.RecyclerView.a) ufv);
                    ufv.d.a(vkvArr);
                    ufv.f = vkvArr;
                    qol.this.az.h(0);
                    qol.this.aL = vml.getUnrangedLength() > ((vkv[]) vml.getItems()).length;
                    qol.this.aR = vml.getUnrangedLength();
                    boolean z2 = qol.this.at.a || qol.this.au.a;
                    if (z2) {
                        qol.this.az.a(true, 1);
                        qol.this.az.a(false, 3);
                    } else if (qol.this.aR == 0) {
                        qol.this.az.a(false, 1);
                        qol.this.az.a(true, 3);
                    } else {
                        qol.this.az.a(false, 1);
                        qol.this.az.a(false, 3);
                    }
                    if (!fbo.a(qol.this.aC)) {
                        qol.this.ax.d_(qol.this.aC);
                    }
                    PlayerState lastPlayerState = qol.this.aT.getLastPlayerState();
                    if (qol.this.aM && lastPlayerState != null && fbn.a(qol.this.aB, lastPlayerState.entityUri())) {
                        qol.this.aT.updateWithContext(qol.this.am());
                        qol.this.aM = false;
                    }
                    Show a3 = vml.a();
                    qol.this.aE = a3.a();
                    qol.this.aF = a3.c();
                    Covers covers = (Covers) fbp.a(a3.b());
                    qol.this.aG = covers.getUri();
                    qol.this.aH = a3.f();
                    Uri parse = Uri.parse(covers.getImageUri(Size.LARGE));
                    qol.this.T.a(parse).a(vhj.a(qol.this.aZ.c(), (vha) new vha() {
                        public final void a(int i) {
                            qol.this.aZ.b().a(i);
                        }
                    }));
                    qol.this.T.a(parse).a(gaa.c(kfVar)).a(qol.this.ba.b);
                    qol.this.ba.b.setScaleType(ScaleType.CENTER_CROP);
                    CoverImageActivity.a(kfVar, qol.this.ba.b, parse);
                    qol.this.bb.a((CharSequence) uiq.a(a3.f()));
                    qol.this.bb.a.setOnClickListener(new $$Lambda$qol$3$OfqQvSErure4KL65WHiSAMS_SnM(this, vml));
                    qol qol = qol.this;
                    qol.this.bb.a(uiq.a(qol.a((int) R.string.show_header_description_by_publisher, qol.aF)).toUpperCase(jua.a((Context) fbp.a(qol.this.p()))));
                    qol.this.bb.b.setGravity(17);
                    if (!fbo.a(a3.c())) {
                        qol.this.bf.setText(qol.this.o().getResources().getString(R.string.show_header_by_publisher, new Object[]{a3.c()}).toUpperCase(jua.a((Context) kfVar)));
                    }
                    qol.this.c(true);
                    qol.this.af.ao_();
                    qol.this.bi.setEnabled(z2 || qol.this.aR > 0);
                    qol.this.bj.setEnabled(z2 || qol.this.aR > 0);
                    if (!qol.this.aP) {
                        qol.this.bc.post(new $$Lambda$qol$0y1hlSShS0J1Hrb1q_JfmSRQd1A(qol.this, vml));
                        qol.this.aP = true;
                    }
                    qol.this.az.a(false, 2);
                    if (qol.this.av != null) {
                        qol.this.av.b();
                    }
                    return;
                }
                if (qol.this.av != null) {
                    qol.this.av.e();
                }
            }

            public final void a(String str) {
                Logger.e("Failed to load show: %s", str);
                if (qol.this.u()) {
                    qol.this.c(false);
                    qol.f(qol.this, str);
                }
            }
        };
        this.by = new PlayerStateObserver() {
            public final void onPlayerStateReceived(PlayerState playerState) {
                if (!qol.this.aN) {
                    qol.this.ax.a(qol.this.aj);
                }
                qol.this.aN = true;
                qol.this.a(playerState);
            }
        };
        this.bz = new defpackage.vau.a() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a() {
                if (qol.this.az.i(4)) {
                    if (qol.this.aI) {
                        qol.this.ar.e(0);
                        return;
                    }
                    qol.this.aZ.b(false);
                }
            }

            public final void a(vau vau) {
                for (vau vau2 : qol.this.al) {
                    vau2.a = false;
                }
                if (vau.c == qol.this.aU.c) {
                    qol qol = qol.this;
                    qol.aU = qol.as;
                } else {
                    qol.this.aU = vau;
                }
                qol.this.aU.a = true;
                qol.this.bg.setText(qol.this.aU.b);
                qol.this.bh.setText(qol.this.aU.b);
                qol.this.ax.a(false, qol.this.au.a, qol.this.at.a);
                qol.this.ax.a(qol.this.aj);
                qol.this.aZ.e().post(new $$Lambda$qol$5$YCfraO0719TcredbimYo5Y2xt1M(this));
            }
        };
        this.bA = new defpackage.vav.a() {
            public final void a(SortOption sortOption) {
                qol.this.aV = sortOption;
                qol.this.ax.a(qol.this.aV);
                qol.this.ax.a(qol.this.aj);
                String n = qol.this.aB;
                qof qof = qol.this.U;
                if (n == null) {
                    n = "";
                }
                qof.a(n, qol.this.aV.a());
                qol.this.aM = true;
            }
        };
        this.bB = new OnClickListener() {
            public final void onClick(View view) {
                qol.this.bz.a(qol.this.as);
            }
        };
        this.bC = new itd() {
            public final int a() {
                return 10;
            }

            public final void a(int i, int i2) {
                qol.this.aQ = i + 100;
                qol.this.ax.a(Integer.valueOf(0), Integer.valueOf(qol.this.aQ));
                qol.this.az.a(true, 2);
                qol.this.ax.a(qol.this.aj);
            }

            public final boolean b() {
                return qol.this.aL;
            }
        };
    }

    private fsq a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kf kfVar = (kf) fbp.a(p());
        this.aW = new vav(kfVar, layoutInflater, this.bA);
        this.aW.a(this.al);
        this.aW.a(this.am, this.aV);
        fsq e = fqv.e().e(kfVar, viewGroup);
        e.a((OnClickListener) new $$Lambda$qol$Xomhhlt_jE1R7xF1mtoqkODcqyo(this));
        e.a(SpotifyIcon.SORT_32);
        e.getView().setDuplicateParentStateEnabled(false);
        e.getView().setBackgroundColor(vgl.b(kfVar, 16842836));
        viewGroup.addView(e.getView());
        return e;
    }

    private static qol a(Bundle bundle, fqn fqn) {
        qol qol = new qol();
        qol.g(bundle);
        fqo.a((Fragment) qol, fqn);
        return qol;
    }

    public static qol a(String str, fqn fqn, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        bundle.putString("original_uri", str);
        bundle.putBoolean("auto_play", z);
        return a(bundle, fqn);
    }

    public static qol a(String str, String str2, fqn fqn) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", (String) fbp.a(str2));
        bundle.putString("original_uri", (String) fbp.a(str));
        bundle.putString("episode_uri", (String) fbp.a(str2));
        bundle.putBoolean("auto_play", true);
        return a(bundle, fqn);
    }

    private void a(long j, ActionCallback actionCallback) {
        Builder playerOptionsOverride = new Builder().skipToIndex(0, (int) j).suppressions(PlayerProviders.MFT).playerOptionsOverride(Boolean.FALSE, null, null);
        Bundle bundle = (Bundle) fbp.a(this.i);
        String str = "seek_to";
        if (bundle.containsKey(str)) {
            playerOptionsOverride.seekTo(Long.valueOf(bundle.getLong(str)));
        }
        this.aT.play(am(), playerOptionsOverride.build(), actionCallback);
    }

    private static void a(Activity activity, VideoSurfaceView videoSurfaceView) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        LayoutParams layoutParams = videoSurfaceView.getLayoutParams();
        layoutParams.width = point.x;
        layoutParams.height = (int) (((float) point.x) / 1.77f);
        videoSurfaceView.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle) {
        if (!this.B) {
            if (this.aE == null) {
                this.aE = a((int) R.string.show_title);
            }
            this.aB = ((Bundle) fbp.a(this.i)).getString("uri");
            this.al.clear();
            if (this.aX == MediaType.VIDEO) {
                vau vau = new vau(this.bz, R.string.filter_show_all_videos);
                vau.c = 0;
                this.as = vau;
            } else {
                vau vau2 = new vau(this.bz, R.string.filter_show_all_episodes);
                vau2.c = 0;
                this.as = vau2;
            }
            vau vau3 = new vau(this.bz, R.string.filter_show_unheard_only);
            vau3.c = 2;
            this.at = vau3;
            vau vau4 = new vau(this.bz, R.string.filter_show_only_offlined_content);
            vau4.c = 3;
            this.au = vau4;
            this.al.add(this.as);
            if (ao()) {
                this.al.add(this.au);
            }
            this.al.add(this.at);
            int i = bundle != null ? bundle.getInt("filter", 0) : 0;
            for (vau vau5 : this.al) {
                if (i == vau5.c) {
                    this.aU = vau5;
                    vau5.a = true;
                } else {
                    vau5.a = false;
                }
            }
            this.aU = (vau) jvi.a(this.aU, this.as);
            SortOption sortOption = this.aY == ConsumptionOrder.SEQUENTIAL ? this.ao : this.an;
            this.am.clear();
            this.am.add(sortOption);
            String str = this.aB;
            qof qof = this.U;
            if (str == null) {
                str = "";
            }
            this.aV = qof.a(str, sortOption, this.am);
            this.av = this.X.a(this.bn, this.aA.toString(), bundle, rmf.a((defpackage.rmf.a) this.ai));
            this.aT = this.V.create(this.aA.toString(), uqo.aR, defpackage.uqo.a.a((jqx) this));
            this.aT.registerPlayerStateObserver(this.by);
            if (this.ax == null) {
                this.ax = new sgs(this.ae, (String) fbp.a(this.aB));
            }
            this.ax.a(Integer.valueOf(0), Integer.valueOf(this.aQ));
            this.ax.a(false, this.au.a, this.at.a);
            this.ax.a(this.aV);
            if (!fbo.a(this.aD)) {
                this.ax.d_(this.aD);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(LayoutInflater layoutInflater) {
        this.bk = ai();
        this.bl = ai();
        fsq a2 = a(this.bk, layoutInflater);
        fsq a3 = a(this.bl, layoutInflater);
        this.bi = a2.c();
        this.bj = a3.c();
        this.bg = a2.a();
        this.bh = a3.a();
        this.bg.setText(a(this.aU.b));
        this.bh.setText(a(this.aU.b));
        this.bq = (LinearLayout) layoutInflater.inflate(R.layout.header_show_video, null);
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        if (this.ad != null) {
            PlayerTrack track = playerState != null ? playerState.track() : null;
            boolean z = false;
            if (!(playerState == null || track == null)) {
                boolean equals = "context".equals(track.provider());
                boolean equals2 = "queue".equals(track.provider());
                boolean a2 = fbn.a(fbp.a(this.aB), track.metadata().get("context_uri"));
                boolean a3 = fbn.a(fbp.a(this.aB), playerState.entityUri());
                if ((equals && a3) || (equals2 && a2)) {
                    ufv ufv = this.ad;
                    String uri = track.uri();
                    if (playerState.isPlaying() && !playerState.isPaused()) {
                        z = true;
                    }
                    ufv.a(uri, z);
                    a(true);
                    int i = this.aS;
                    if (i >= 0) {
                        d(i);
                        this.aS = -1;
                    }
                    ak();
                    return;
                }
            }
            this.ad.a((String) null, false);
            a(false);
            int i2 = this.aS;
            if (i2 >= 0) {
                d(i2);
                this.aS = -1;
            }
            ak();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.bv = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(defpackage.vml r9) {
        /*
            r8 = this;
            android.os.Parcelable r0 = r8.bd
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            r8.bd = r1
            r8.aD = r1
            r8.aJ = r2
            goto L_0x0082
        L_0x000e:
            java.lang.String r0 = r8.aD
            boolean r0 = defpackage.fbo.a(r0)
            r3 = 0
            if (r0 != 0) goto L_0x006d
            android.os.Bundle r0 = r8.i
            java.lang.Object r0 = defpackage.fbp.a(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r4 = "auto_play"
            boolean r0 = r0.getBoolean(r4, r3)
            r4 = 0
        L_0x0026:
            java.lang.Object[] r5 = r9.getItems()
            vkv[] r5 = (defpackage.vkv[]) r5
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0061
            java.lang.Object[] r5 = r9.getItems()
            vkv[] r5 = (defpackage.vkv[]) r5
            r5 = r5[r4]
            java.lang.String r6 = r8.aD
            java.lang.String r7 = r5.getUri()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x005e
            boolean r9 = r5.l()
            if (r9 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x0059
            java.lang.String r9 = r8.aD
            r8.aS = r4
            long r3 = (long) r4
            qol$1 r0 = new qol$1
            r0.<init>(r9)
            r8.a(r3, r0)
            goto L_0x005c
        L_0x0059:
            r8.d(r4)
        L_0x005c:
            r3 = 1
            goto L_0x0061
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x0026
        L_0x0061:
            if (r3 != 0) goto L_0x0068
            r8.aO = r2
            r8.ak()
        L_0x0068:
            r8.aD = r1
            r8.aJ = r2
            goto L_0x0087
        L_0x006d:
            boolean r9 = r8.aJ
            if (r9 != 0) goto L_0x0082
            r8.aO = r2
            boolean r9 = r8.aK
            if (r9 != 0) goto L_0x007c
            fxy r9 = r8.aZ
            r9.b(r3)
        L_0x007c:
            r8.aJ = r2
            r8.ak()
            goto L_0x0087
        L_0x0082:
            r8.aO = r2
            r8.ak()
        L_0x0087:
            android.widget.TextView r9 = r8.br
            if (r9 == 0) goto L_0x0090
            java.lang.String r0 = r8.aE
            r9.setText(r0)
        L_0x0090:
            boolean r9 = r8.aK
            if (r9 != 0) goto L_0x00a2
            com.spotify.paste.widgets.HeaderView r9 = r8.ba
            java.lang.String r0 = r8.aE
            r9.a(r0)
            fxy r9 = r8.aZ
            java.lang.String r0 = r8.aE
            r9.a(r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qol.a(vml):void");
    }

    private void a(boolean z) {
        if (this.aX == MediaType.VIDEO) {
            if ((!z || !this.aI) && this.aK != z) {
                this.aK = z;
                this.bp.setVisibility(z ? 0 : 8);
                if (z) {
                    this.aZ.a().a((View) null);
                    this.ba.b((View) null);
                    this.bq.addView(this.bs);
                    this.az.a(true, 4);
                    this.az.a(true, 5);
                    this.br.setText(this.aE);
                    this.ba.a((CharSequence) null);
                    this.aZ.a((String) null);
                    this.af.a(this, " ");
                    this.af.ao_();
                    this.b.a(this.bo);
                    return;
                }
                this.az.a(false, 4);
                this.az.a(false, 5);
                this.bq.removeView(this.bs);
                this.ba.a((CharSequence) this.aE);
                this.ba.b(this.bs);
                this.aZ.a(this.aE);
                this.aZ.a().a((View) this.aZ.b());
                this.b.b(this.bo);
            }
        }
    }

    private void ah() {
        StickyRecyclerView a2 = this.aZ.a();
        a2.a(true);
        ViewGroup viewGroup = this.bk;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, this.bk.getPaddingRight(), this.bk.getPaddingBottom());
        if (!this.aI) {
            this.aZ.a((View) this.bk);
            return;
        }
        a2.a((View) this.bk);
        a2.b((View) this.bk);
    }

    private ViewGroup ai() {
        b bVar = new b(n());
        bVar.setClickable(true);
        bVar.setBackgroundColor(vgl.b(p(), R.attr.pasteColorSubHeaderBackground));
        bVar.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return bVar;
    }

    /* access modifiers changed from: private */
    public void ak() {
        if (!this.aO) {
            return;
        }
        if ((this.aX != MediaType.VIDEO || this.aN) && this.be.d()) {
            this.be.b();
        }
    }

    private View al() {
        View inflate = LayoutInflater.from(p()).inflate(R.layout.header_pretty_subtitle, null);
        this.bf = (TextView) inflate.findViewById(R.id.subtitle);
        this.bf.setVisibility(0);
        return inflate;
    }

    /* access modifiers changed from: private */
    public PlayerContext am() {
        PlayerTrack[] playerTrackArr = new PlayerTrack[this.ad.b()];
        int i = 0;
        for (int i2 = 0; i2 < this.ad.b(); i2++) {
            vkv f = this.ad.f(i2);
            if (f != null && !f.isHeader()) {
                Map v = f.v();
                v.put("artist_name", this.aE);
                v.put("context_uri", fbp.a(this.aB));
                int i3 = i + 1;
                playerTrackArr[i] = PlayerTrack.create(f.getUri(), v);
                i = i3;
            }
        }
        String str = (String) fbp.a(this.aB);
        HashMap hashMap = new HashMap();
        hashMap.put("context_description", this.aE);
        hashMap.put("image_url", this.aG);
        hashMap.put(Metadata.CONTEXT_LONG_DESCRIPTION, this.aH);
        hashMap.put("media.type", this.aX == MediaType.VIDEO ? "video" : "audio");
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }

    private void an() {
        this.bb = new jsr(p());
        this.bb.a(o().getResources().getInteger(R.integer.show_description_max_lines));
        this.ba.a((sf) new qon(this.bb));
    }

    private boolean ao() {
        return this.aX == MediaType.AUDIO && isu.a(this.aw);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ap() {
        this.ab.a((String) fbp.a(this.aB), this.aG, (String) null, this.aE, "", (String) null, jqg.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe b(vml vml) {
        return this.aa.c(vml.a().getUri(), vml.a().a()).a(this.aA).a(uqo.aR).a();
    }

    /* access modifiers changed from: private */
    public void b(LayoutInflater layoutInflater) {
        kf kfVar = (kf) fbp.a(p());
        this.ba = new HeaderView(kfVar);
        this.aZ = this.aI ? fyw.b(this, this.ba) : fyw.a((Fragment) this, (View) this.ba);
        this.bc = this.aZ.e();
        this.bc.a((m) this.bC);
        this.ar = new LinearLayoutManager(n());
        this.bc.a((i) this.ar);
        this.aZ.a(0);
        this.aZ.b().c(false);
        this.bs = al();
        this.ba.b(this.bs);
        View d = this.aZ.d();
        d.setVisibility(4);
        this.bm.addView(d, 0);
        LoadingView loadingView = this.be;
        loadingView.c = d;
        loadingView.a = new lce(kfVar, d);
        String str = " ";
        this.ba.a((CharSequence) str);
        this.aZ.a(str);
        ah();
        an();
        this.ad.b(false);
        c(layoutInflater);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    public static boolean b(Intent intent) {
        return intent.getBooleanExtra("auto_play", false);
    }

    private void c(LayoutInflater layoutInflater) {
        this.az = new vhx(false);
        View view = qnu.a((Context) fbp.a(p()), this.aX == MediaType.VIDEO).getView();
        View inflate = layoutInflater.inflate(R.layout.filter_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.bB);
        View inflate2 = layoutInflater.inflate(R.layout.footer_loading_infinite, this.bc, false);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(this.bq, false), 4);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(this.bl, false), 5);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) this.ad, 0);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(inflate, false), 1);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(view, false), 3);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(inflate2, false), 2);
        this.az.h(0);
        this.az.a(false, 4, 5, 1, 2, 3);
        this.bc.a((androidx.recyclerview.widget.RecyclerView.a) this.az);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.aW.a(view);
    }

    private void d(int i) {
        this.bc.post(new $$Lambda$qol$i2021gjNDvRfIhk2SqDI0oxPex0(this, i));
    }

    /* access modifiers changed from: private */
    public void d(LayoutInflater layoutInflater) {
        kf kfVar = (kf) fbp.a(p());
        int a2 = gau.b(kfVar) ? gau.a(kfVar.getResources()) : 0;
        this.bo = new VideoSurfaceView((Context) kfVar, false);
        this.bp = new FrameLayout(kfVar);
        this.bp.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.bp.setBackgroundColor(fr.c(kfVar, R.color.cat_black));
        this.bp.setPadding(0, a2, 0, 0);
        this.bp.setVisibility(8);
        this.bp.addView(this.bo);
        GradientView gradientView = (GradientView) layoutInflater.inflate(R.layout.actionbar_bgd_show_video, null);
        gradientView.setLayoutParams(new FrameLayout.LayoutParams(-1, gav.a(kfVar)));
        this.bp.addView(gradientView);
        this.bn.addView(this.bp, 0);
        a((Activity) kfVar, this.bo);
        this.br = (TextView) this.bq.findViewById(R.id.title);
        this.bo.setOnClickListener(new $$Lambda$qol$figbV3sC3fohDW24ynS3zviIooU(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i) {
        this.ar.e(i);
        this.aO = true;
        ak();
    }

    static /* synthetic */ void f(qol qol, String str) {
        fvd fvd = qol.bt;
        if (fvd != null) {
            fvd.getView().setVisibility(0);
        }
    }

    static /* synthetic */ void h(qol qol, String str) {
        PlayerState lastPlayerState = qol.aT.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused() && str.equals(track.uri())) {
                qol.a(qol.aT.getLastPlayerState());
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aw = fqo.a((Fragment) this);
        this.bn = new LinearLayout(p());
        this.bn.setOrientation(1);
        this.bn.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fqv.f();
        this.bt = fvg.a(p(), this.bn);
        this.bt.a((CharSequence) a((int) R.string.show_failed_to_load_title));
        this.bt.a().a((Drawable) new SpotifyIconDrawable(p(), SpotifyIcon.WARNING_32));
        this.bt.getView().setVisibility(8);
        this.bn.addView(this.bt.getView(), new LinearLayout.LayoutParams(-1, -1));
        this.bm = new FrameLayout(p());
        this.bm.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.bm.setId(16908290);
        this.bn.addView(this.bm);
        this.be = LoadingView.a(layoutInflater);
        this.be.a();
        this.bm.addView(this.be);
        if (this.aX != MediaType.UNKNOWN) {
            a(layoutInflater);
            b(layoutInflater);
            d(layoutInflater);
        }
        return this.bn;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        fzn.a(utg.a(this.aG, (String) fbp.a(this.aB), true), SpotifyIconV2.SHOWS, false, true);
        fzn.b(this.aE);
        fzn.c(this.aF);
        fzn.a(this.aH);
        this.Y.a(fzn, new $$Lambda$qol$51ClfaID5Lm_zF3CbAJ5YkWWTUc(this));
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i) {
        if (vkv.w() == MediaType.VIDEO && !this.aK) {
            this.aS = i;
        }
        if (this.bv && vkv.i()) {
            this.Z.a(vkv.getUri(), null);
        } else if (vkv.w() == MediaType.AUDIO) {
            this.ac.a(vkv.getUri());
        } else {
            a((long) i, (ActionCallback) new a() {
                public final void onActionSuccess() {
                }
            });
        }
    }

    public final void aP_() {
        super.aP_();
        this.bw = this.Z.a().a((xis<? super T>) new $$Lambda$qol$2WNQnWUIG7ZsuTBuOmsnc5wLccw<Object>(this), (xis<Throwable>) $$Lambda$qol$tZVXa_Fifux8WFA7WQu49zNsAI.INSTANCE);
        sgq<vkv, vml, Policy> sgq = this.ax;
        if (sgq != null) {
            sgq.a(this.aj);
        }
        if (this.aK) {
            this.b.a(this.bo);
        }
        Player player = this.aT;
        if (player != null) {
            player.registerPlayerStateObserver(this.by);
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        if (this.aA.equals(ak)) {
            this.aB = (String) fbp.a(this.i.getString("uri"));
            this.aA = sso.a(this.aB);
        }
        return this.aA;
    }

    public final rmf af() {
        return rmf.a((defpackage.rmf.a) this.ai);
    }

    public final uqm ag() {
        return uqo.aR;
    }

    public final gkq aj() {
        int i = AnonymousClass2.a[this.aX.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? PageIdentifiers.UNKNOWN : PageIdentifiers.SHOWS_VIDEO : PageIdentifiers.SHOWS_AUDIO : PageIdentifiers.SHOWS_MIXED;
    }

    public final void aw_() {
        super.aw_();
        ViewLoadingTracker viewLoadingTracker = this.av;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.e();
        }
        vav vav = this.aW;
        if (vav != null) {
            vav.a();
        }
        this.aN = false;
        this.b.b(this.bo);
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(final Bundle bundle) {
        super.b(bundle);
        c(false);
        this.aw = fqo.a((Fragment) this);
        final Bundle bundle2 = (Bundle) fbp.a(this.i);
        String string = bundle2.getString("uri");
        this.aA = sso.a(string);
        this.aD = bundle2.getString("episode_uri");
        kf kfVar = (kf) fbp.a(p());
        this.aI = jvi.b(kfVar);
        if (bundle != null) {
            bundle.setClassLoader(kfVar.getClassLoader());
            this.bd = bundle.getParcelable("list");
            this.aQ = bundle.getInt("range_length", 100);
            this.aX = MediaType.e[bundle.getInt("media_type", MediaType.UNKNOWN.ordinal())];
            this.aY = ConsumptionOrder.e[bundle.getInt("consumption_order", ConsumptionOrder.UNKNOWN.ordinal())];
        }
        AnonymousClass9 r2 = new defpackage.sgx.a() {
            public final void a(Throwable th) {
                Logger.e(th, "Failed to load show.", new Object[0]);
                if (qol.this.u()) {
                    qol.f(qol.this, th.getMessage());
                }
            }

            public final void a(sgv sgv) {
                if (qol.this.u()) {
                    Show a2 = sgv.a();
                    vkv vkv = (vkv) sgv.b().d();
                    bundle2.putString("uri", a2.getUri());
                    qol.this.aE = a2.a();
                    qol.this.aC = a2.d();
                    qol.this.aY = a2.j();
                    if (fbo.a(qol.this.aD) && qol.this.aY != ConsumptionOrder.RECENT && a2.g()) {
                        qol qol = qol.this;
                        qol.aD = qol.aC;
                    }
                    qol.this.aX = vkv != null ? vkv.w() : a2.k();
                    qol qol2 = qol.this;
                    qol2.ai.a(qol2.aj().a());
                    Object[] objArr = new Object[5];
                    objArr[0] = qol.this.aE;
                    objArr[1] = a2.g() ? "is" : "not";
                    objArr[2] = qol.this.aY;
                    objArr[3] = qol.this.aD;
                    objArr[4] = qol.this.aX;
                    Logger.b("Show %s (%s following) has consumption order %s and latest episode/scroll to episode set to %s. Media type %s", objArr);
                    qol.this.a(bundle);
                    if (qol.this.bm != null && qol.this.u()) {
                        qol qol3 = qol.this;
                        qol3.a(qol3.x());
                        qol qol4 = qol.this;
                        qol4.b(qol4.x());
                        qol qol5 = qol.this;
                        qol5.d(qol5.x());
                    }
                }
            }
        };
        if (this.ay == null) {
            this.ay = new sgx(string, this.ae, this.ag, this.ah);
        }
        if (this.aX == MediaType.UNKNOWN) {
            this.aq.a(this.ay.a(r2));
        } else {
            a(bundle);
        }
    }

    public final String e() {
        return "show";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ViewLoadingTracker viewLoadingTracker = this.av;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.a(bundle);
        }
        bundle.putInt("media_type", this.aX.ordinal());
        bundle.putInt("consumption_order", this.aY.ordinal());
        bundle.putInt("range_length", this.aQ);
        vau vau = this.aU;
        if (vau != null) {
            bundle.putInt("filter", vau.c);
        }
    }

    public final void h() {
        super.h();
        this.bw.unsubscribe();
        sgq<vkv, vml, Policy> sgq = this.ax;
        if (sgq != null) {
            sgq.d();
        }
        if (this.aK) {
            this.b.b(this.bo);
        }
        Player player = this.aT;
        if (player != null) {
            player.unregisterPlayerStateObserver(this.by);
        }
        this.ap.a();
        this.aq.a(xon.b());
    }
}
