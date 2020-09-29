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
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
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

/* renamed from: qfi reason: default package */
public class qfi extends jor implements d, fyw, jol, tsw, udv {
    private static final sih ak = sih.a("spotify:empty");
    public Picasso T;
    public qfc U;
    public PlayerFactory V;
    public uhs W;
    public rwr X;
    public fyz Y;
    public lkn Z;
    public tcn a;
    /* access modifiers changed from: private */
    public sih aA;
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
    public upp aU;
    /* access modifiers changed from: private */
    public SortOption aV;
    private upq aW;
    /* access modifiers changed from: private */
    public MediaType aX;
    /* access modifiers changed from: private */
    public ConsumptionOrder aY;
    /* access modifiers changed from: private */
    public fxe aZ;
    public jmq aa;
    public iww ab;
    public spi ac;
    public tts ad;
    public RxResolver ae;
    public kyi af;
    public wug ag;
    public wug ah;
    final rda ai;
    final juf<uzx> aj;
    /* access modifiers changed from: private */
    public final List<upp> al = Lists.a();
    private final List<SortOption> am = Lists.a();
    private final SortOption an;
    private final SortOption ao;
    private final xag ap;
    private final xai aq;
    /* access modifiers changed from: private */
    public LinearLayoutManager ar;
    /* access modifiers changed from: private */
    public upp as;
    /* access modifiers changed from: private */
    public upp at;
    /* access modifiers changed from: private */
    public upp au;
    /* access modifiers changed from: private */
    public ViewLoadingTracker av;
    /* access modifiers changed from: private */
    public fpt aw;
    /* access modifiers changed from: private */
    public rxg<uys, uzx, Policy> ax;
    private rxn ay;
    /* access modifiers changed from: private */
    public uwh az;
    public jzd b;
    private final defpackage.upq.a bA;
    private final OnClickListener bB;
    private final iqq bC;
    /* access modifiers changed from: private */
    public HeaderView ba;
    /* access modifiers changed from: private */
    public jqg bb;
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
    private fuj bt;
    /* access modifiers changed from: private */
    public boolean bu;
    private boolean bv;
    private wuk bw;
    /* access modifiers changed from: private */
    public final jmf<uzx> bx;
    private PlayerStateObserver by;
    /* access modifiers changed from: private */
    public final defpackage.upp.a bz;

    /* renamed from: qfi$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qfi.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: qfi$a */
    class a implements ActionCallback {
        public void onActionSuccess() {
        }

        private a() {
        }

        /* synthetic */ a(qfi qfi, byte b) {
            this();
        }

        public void onActionForbidden(List<String> list) {
            Logger.d("-> onActionForbidden() reasons: %s", TextUtils.join(", ", list));
            qfi.this.aO = true;
            qfi.this.ak();
        }
    }

    /* renamed from: qfi$b */
    static class b extends FrameLayout {
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public b(Context context) {
            super(context);
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "show";
    }

    public qfi() {
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
        this.ap = new xag();
        this.aq = new xai();
        this.aA = ak;
        this.aQ = 100;
        this.aS = -1;
        this.aX = MediaType.UNKNOWN;
        this.aY = ConsumptionOrder.UNKNOWN;
        this.ai = new rda();
        this.bx = new $$Lambda$qfi$L1q7zN8qR8S29vrwUnG9_4_HMzg(this);
        this.aj = new juf<uzx>() {
            public final /* synthetic */ void a(Object obj) {
                uzx uzx = (uzx) obj;
                Logger.b("onDataLoaded(showModel: %s) isAdded(): %s", uzx, Boolean.valueOf(qfi.this.u()));
                if (!qfi.this.u()) {
                    if (qfi.this.av != null) {
                        qfi.this.av.e();
                    }
                    return;
                }
                boolean z = ((uys[]) uzx.getItems()).length == 0;
                Logger.b("onDataLoaded() showModel.isLoading(): %s, isEmpty: %s", Boolean.valueOf(uzx.isLoading()), Boolean.valueOf(z));
                if (!uzx.isLoading() || !z) {
                    ka kaVar = (ka) fay.a(qfi.this.p());
                    if (!qfi.this.bu && qfi.this.aX == MediaType.VIDEO && !iqh.c(qfi.this.aw)) {
                        qfi.this.bu = true;
                        defpackage.fzw.a a2 = new defpackage.fzw.a(kaVar, 2132017711).a((int) R.string.show_video_is_not_available_button_ok, (DialogInterface.OnClickListener) $$Lambda$qfi$3$fBxSY2VwUYhfxV_5rZ09vIdedo.INSTANCE);
                        a2.g = new $$Lambda$qfi$3$RnGf_vZOVccEwGQwu_SGZiwbsyg(this);
                        a2.b(R.string.show_video_is_not_available_body).a((rdc) kaVar, PageIdentifiers.DIALOG_SHOW_VIDEOUNAVAILABLE.mPageIdentifier, qfi.this.aA.toString()).a().show();
                    }
                    if (qfi.this.bu) {
                        if (qfi.this.av != null) {
                            qfi.this.av.e();
                        }
                        return;
                    }
                    qfi.this.aC = uzx.a().d();
                    tts tts = qfi.this.ad;
                    uys[] uysArr = (uys[]) uzx.getItems();
                    tsx tsx = tts.e;
                    uys[] uysArr2 = tts.f;
                    if (uysArr2 != null) {
                        tsx.b = uysArr2;
                    }
                    tsx.a = uysArr;
                    nv.a(tts.e).a((androidx.recyclerview.widget.RecyclerView.a) tts);
                    tts.d.a(uysArr);
                    tts.f = uysArr;
                    qfi.this.az.h(0);
                    qfi.this.aL = uzx.getUnrangedLength() > ((uys[]) uzx.getItems()).length;
                    qfi.this.aR = uzx.getUnrangedLength();
                    boolean z2 = qfi.this.at.a || qfi.this.au.a;
                    if (z2) {
                        qfi.this.az.a(true, 1);
                        qfi.this.az.a(false, 3);
                    } else if (qfi.this.aR == 0) {
                        qfi.this.az.a(false, 1);
                        qfi.this.az.a(true, 3);
                    } else {
                        qfi.this.az.a(false, 1);
                        qfi.this.az.a(false, 3);
                    }
                    if (!fax.a(qfi.this.aC)) {
                        qfi.this.ax.d_(qfi.this.aC);
                    }
                    PlayerState lastPlayerState = qfi.this.aT.getLastPlayerState();
                    if (qfi.this.aM && lastPlayerState != null && faw.a(qfi.this.aB, lastPlayerState.entityUri())) {
                        qfi.this.aT.updateWithContext(qfi.this.am());
                        qfi.this.aM = false;
                    }
                    Show a3 = uzx.a();
                    qfi.this.aE = a3.a();
                    qfi.this.aF = a3.c();
                    Covers covers = (Covers) fay.a(a3.b());
                    qfi.this.aG = covers.getUri();
                    qfi.this.aH = a3.f();
                    Uri parse = Uri.parse(covers.getImageUri(Size.LARGE));
                    qfi.this.T.a(parse).a(uvt.a(qfi.this.aZ.c(), (uvj) new uvj() {
                        public final void a(int i) {
                            qfi.this.aZ.b().a(i);
                        }
                    }));
                    qfi.this.T.a(parse).a(fzg.c(kaVar)).a(qfi.this.ba.b);
                    qfi.this.ba.b.setScaleType(ScaleType.CENTER_CROP);
                    CoverImageActivity.a(kaVar, qfi.this.ba.b, parse);
                    qfi.this.bb.a((CharSequence) twn.a(a3.f()));
                    qfi.this.bb.a.setOnClickListener(new $$Lambda$qfi$3$izTcACyf5javVvvSWHCvc9FMjNw(this, uzx));
                    qfi qfi = qfi.this;
                    qfi.this.bb.a(twn.a(qfi.a((int) R.string.show_header_description_by_publisher, qfi.aF)).toUpperCase(jrq.a((Context) fay.a(qfi.this.p()))));
                    qfi.this.bb.b.setGravity(17);
                    if (!fax.a(a3.c())) {
                        qfi.this.bf.setText(qfi.this.o().getResources().getString(R.string.show_header_by_publisher, new Object[]{a3.c()}).toUpperCase(jrq.a((Context) kaVar)));
                    }
                    qfi.this.c(true);
                    qfi.this.af.ap_();
                    qfi.this.bi.setEnabled(z2 || qfi.this.aR > 0);
                    qfi.this.bj.setEnabled(z2 || qfi.this.aR > 0);
                    if (!qfi.this.aP) {
                        qfi.this.bc.post(new $$Lambda$qfi$LZCFBHUdg3qF9NnUrO6Ssw_a8_M(qfi.this, uzx));
                        qfi.this.aP = true;
                    }
                    qfi.this.az.a(false, 2);
                    if (qfi.this.av != null) {
                        qfi.this.av.b();
                    }
                    return;
                }
                if (qfi.this.av != null) {
                    qfi.this.av.e();
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(DialogInterface dialogInterface) {
                qfi.this.ac.a();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(uzx uzx, View view) {
                jly.a((Context) fay.a(qfi.this.n()), qfi.this.bx, uzx, qfi.this.aA);
            }

            public final void a(String str) {
                Logger.e("Failed to load show: %s", str);
                if (qfi.this.u()) {
                    qfi.this.c(false);
                    qfi.f(qfi.this, str);
                }
            }
        };
        this.by = new PlayerStateObserver() {
            public final void onPlayerStateReceived(PlayerState playerState) {
                if (!qfi.this.aN) {
                    qfi.this.ax.a(qfi.this.aj);
                }
                qfi.this.aN = true;
                qfi.this.a(playerState);
            }
        };
        this.bz = new defpackage.upp.a() {
            public final void a(upp upp) {
                for (upp upp2 : qfi.this.al) {
                    upp2.a = false;
                }
                if (upp.c == qfi.this.aU.c) {
                    qfi qfi = qfi.this;
                    qfi.aU = qfi.as;
                } else {
                    qfi.this.aU = upp;
                }
                qfi.this.aU.a = true;
                qfi.this.bg.setText(qfi.this.aU.b);
                qfi.this.bh.setText(qfi.this.aU.b);
                qfi.this.ax.a(false, qfi.this.au.a, qfi.this.at.a);
                qfi.this.ax.a(qfi.this.aj);
                qfi.this.aZ.e().post(new $$Lambda$qfi$5$QuFR628WdDLgf3IKuQO1HrDjjpg(this));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a() {
                if (qfi.this.az.i(4)) {
                    if (qfi.this.aI) {
                        qfi.this.ar.e(0);
                        return;
                    }
                    qfi.this.aZ.b(false);
                }
            }
        };
        this.bA = new defpackage.upq.a() {
            public final void a(SortOption sortOption) {
                qfi.this.aV = sortOption;
                qfi.this.ax.a(qfi.this.aV);
                qfi.this.ax.a(qfi.this.aj);
                String n = qfi.this.aB;
                qfc qfc = qfi.this.U;
                if (n == null) {
                    n = "";
                }
                qfc.a(n, qfi.this.aV.a());
                qfi.this.aM = true;
            }
        };
        this.bB = new OnClickListener() {
            public final void onClick(View view) {
                qfi.this.bz.a(qfi.this.as);
            }
        };
        this.bC = new iqq() {
            public final int a() {
                return 10;
            }

            public final boolean b() {
                return qfi.this.aL;
            }

            public final void a(int i, int i2) {
                qfi.this.aQ = i + 100;
                qfi.this.ax.a(Integer.valueOf(0), Integer.valueOf(qfi.this.aQ));
                qfi.this.az.a(true, 2);
                qfi.this.ax.a(qfi.this.aj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms b(uzx uzx) {
        return this.aa.c(uzx.a().getUri(), uzx.a().a()).a(this.aA).a(udt.aR).a();
    }

    private void d(int i) {
        this.bc.post(new $$Lambda$qfi$sfMmj7y79kf0VpKN1VSH8AmMS1A(this, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i) {
        this.ar.e(i);
        this.aO = true;
        ak();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(defpackage.uzx r9) {
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
            boolean r0 = defpackage.fax.a(r0)
            r3 = 0
            if (r0 != 0) goto L_0x006d
            android.os.Bundle r0 = r8.i
            java.lang.Object r0 = defpackage.fay.a(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r4 = "auto_play"
            boolean r0 = r0.getBoolean(r4, r3)
            r4 = 0
        L_0x0026:
            java.lang.Object[] r5 = r9.getItems()
            uys[] r5 = (defpackage.uys[]) r5
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0061
            java.lang.Object[] r5 = r9.getItems()
            uys[] r5 = (defpackage.uys[]) r5
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
            qfi$1 r0 = new qfi$1
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
            fxe r9 = r8.aZ
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
            fxe r9 = r8.aZ
            java.lang.String r0 = r8.aE
            r9.a(r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfi.a(uzx):void");
    }

    public static qfi a(String str, fpt fpt, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        bundle.putString("original_uri", str);
        bundle.putBoolean("auto_play", z);
        return a(bundle, fpt);
    }

    public static qfi a(String str, String str2, fpt fpt) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", (String) fay.a(str2));
        bundle.putString("original_uri", (String) fay.a(str));
        bundle.putString("episode_uri", (String) fay.a(str2));
        bundle.putBoolean("auto_play", true);
        return a(bundle, fpt);
    }

    private static qfi a(Bundle bundle, fpt fpt) {
        qfi qfi = new qfi();
        qfi.g(bundle);
        fpu.a((Fragment) qfi, fpt);
        return qfi;
    }

    public static boolean b(Intent intent) {
        return intent.getBooleanExtra("auto_play", false);
    }

    public final void b(final Bundle bundle) {
        super.b(bundle);
        c(false);
        this.aw = fpu.a((Fragment) this);
        final Bundle bundle2 = (Bundle) fay.a(this.i);
        String string = bundle2.getString("uri");
        this.aA = sih.a(string);
        this.aD = bundle2.getString("episode_uri");
        ka kaVar = (ka) fay.a(p());
        this.aI = jtc.b(kaVar);
        if (bundle != null) {
            bundle.setClassLoader(kaVar.getClassLoader());
            this.bd = bundle.getParcelable("list");
            this.aQ = bundle.getInt("range_length", 100);
            this.aX = MediaType.e[bundle.getInt("media_type", MediaType.UNKNOWN.ordinal())];
            this.aY = ConsumptionOrder.e[bundle.getInt("consumption_order", ConsumptionOrder.UNKNOWN.ordinal())];
        }
        AnonymousClass9 r2 = new defpackage.rxn.a() {
            public final void a(rxl rxl) {
                if (qfi.this.u()) {
                    Show a2 = rxl.a();
                    uys uys = (uys) rxl.b().d();
                    bundle2.putString("uri", a2.getUri());
                    qfi.this.aE = a2.a();
                    qfi.this.aC = a2.d();
                    qfi.this.aY = a2.j();
                    if (fax.a(qfi.this.aD) && qfi.this.aY != ConsumptionOrder.RECENT && a2.g()) {
                        qfi qfi = qfi.this;
                        qfi.aD = qfi.aC;
                    }
                    qfi.this.aX = uys != null ? uys.w() : a2.k();
                    qfi qfi2 = qfi.this;
                    qfi2.ai.a(qfi2.aj().a());
                    Object[] objArr = new Object[5];
                    objArr[0] = qfi.this.aE;
                    objArr[1] = a2.g() ? "is" : "not";
                    objArr[2] = qfi.this.aY;
                    objArr[3] = qfi.this.aD;
                    objArr[4] = qfi.this.aX;
                    Logger.b("Show %s (%s following) has consumption order %s and latest episode/scroll to episode set to %s. Media type %s", objArr);
                    qfi.this.a(bundle);
                    if (qfi.this.bm != null && qfi.this.u()) {
                        qfi qfi3 = qfi.this;
                        qfi3.a(qfi3.x());
                        qfi qfi4 = qfi.this;
                        qfi4.b(qfi4.x());
                        qfi qfi5 = qfi.this;
                        qfi5.d(qfi5.x());
                    }
                }
            }

            public final void a(Throwable th) {
                Logger.e(th, "Failed to load show.", new Object[0]);
                if (qfi.this.u()) {
                    qfi.f(qfi.this, th.getMessage());
                }
            }
        };
        if (this.ay == null) {
            this.ay = new rxn(string, this.ae, this.ag, this.ah);
        }
        if (this.aX == MediaType.UNKNOWN) {
            this.aq.a(this.ay.a(r2));
        } else {
            a(bundle);
        }
    }

    public final gjf aj() {
        int i = AnonymousClass2.a[this.aX.ordinal()];
        if (i == 1) {
            return PageIdentifiers.SHOWS_MIXED;
        }
        if (i == 2) {
            return PageIdentifiers.SHOWS_AUDIO;
        }
        if (i != 3) {
            return PageIdentifiers.UNKNOWN;
        }
        return PageIdentifiers.SHOWS_VIDEO;
    }

    public final void h() {
        super.h();
        this.bw.unsubscribe();
        rxg<uys, uzx, Policy> rxg = this.ax;
        if (rxg != null) {
            rxg.d();
        }
        if (this.aK) {
            this.b.b(this.bo);
        }
        Player player = this.aT;
        if (player != null) {
            player.unregisterPlayerStateObserver(this.by);
        }
        this.ap.a();
        this.aq.a(xaj.b());
    }

    public final void g() {
        super.g();
        this.bw = this.Z.a().a((wun<? super T>) new $$Lambda$qfi$bIQyysiS2i7WUaja_Hiv0LpVdho<Object>(this), (wun<Throwable>) $$Lambda$qfi$boGLRLHhwCx96jSskzM9LeFW5tc.INSTANCE);
        rxg<uys, uzx, Policy> rxg = this.ax;
        if (rxg != null) {
            rxg.a(this.aj);
        }
        if (this.aK) {
            this.b.a(this.bo);
        }
        Player player = this.aT;
        if (player != null) {
            player.registerPlayerStateObserver(this.by);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.bv = bool.booleanValue();
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

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aw = fpu.a((Fragment) this);
        this.bn = new LinearLayout(p());
        this.bn.setOrientation(1);
        this.bn.setLayoutParams(new LayoutParams(-1, -1));
        fqb.f();
        this.bt = fum.a(p(), this.bn);
        this.bt.a((CharSequence) a((int) R.string.show_failed_to_load_title));
        this.bt.a().a((Drawable) new SpotifyIconDrawable(p(), SpotifyIcon.WARNING_32));
        this.bt.getView().setVisibility(8);
        this.bn.addView(this.bt.getView(), new LayoutParams(-1, -1));
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

    public final void a(uys uys, uys[] uysArr, String str, int i) {
        if (uys.w() == MediaType.VIDEO && !this.aK) {
            this.aS = i;
        }
        if (this.bv && uys.i()) {
            this.Z.a(uys.getUri(), null);
        } else if (uys.w() == MediaType.AUDIO) {
            this.ac.a(uys.getUri());
        } else {
            a((long) i, (ActionCallback) new a() {
                public final void onActionSuccess() {
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(LayoutInflater layoutInflater) {
        this.bk = ai();
        this.bl = ai();
        frw a2 = a(this.bk, layoutInflater);
        frw a3 = a(this.bl, layoutInflater);
        this.bi = a2.c();
        this.bj = a3.c();
        this.bg = a2.a();
        this.bh = a3.a();
        this.bg.setText(a(this.aU.b));
        this.bh.setText(a(this.aU.b));
        this.bq = (LinearLayout) layoutInflater.inflate(R.layout.header_show_video, null);
    }

    /* access modifiers changed from: private */
    public void b(LayoutInflater layoutInflater) {
        fxe fxe;
        ka kaVar = (ka) fay.a(p());
        this.ba = new HeaderView(kaVar);
        if (this.aI) {
            fxe = fyc.b(this, this.ba);
        } else {
            fxe = fyc.a((Fragment) this, (View) this.ba);
        }
        this.aZ = fxe;
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
        loadingView.a = new kyv(kaVar, d);
        String str = " ";
        this.ba.a((CharSequence) str);
        this.aZ.a(str);
        ah();
        an();
        this.ad.b(false);
        c(layoutInflater);
    }

    private void c(LayoutInflater layoutInflater) {
        this.az = new uwh(false);
        View view = qer.a((Context) fay.a(p()), this.aX == MediaType.VIDEO).getView();
        View inflate = layoutInflater.inflate(R.layout.filter_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.bB);
        View inflate2 = layoutInflater.inflate(R.layout.footer_loading_infinite, this.bc, false);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(this.bq, false), 4);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(this.bl, false), 5);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) this.ad, 0);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(inflate, false), 1);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(view, false), 3);
        this.az.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(inflate2, false), 2);
        this.az.h(0);
        this.az.a(false, 4, 5, 1, 2, 3);
        this.bc.a((androidx.recyclerview.widget.RecyclerView.a) this.az);
    }

    private ViewGroup ai() {
        b bVar = new b(n());
        bVar.setClickable(true);
        bVar.setBackgroundColor(uuu.b(p(), R.attr.pasteColorSubHeaderBackground));
        bVar.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return bVar;
    }

    private frw a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ka kaVar = (ka) fay.a(p());
        this.aW = new upq(kaVar, layoutInflater, this.bA);
        this.aW.a(this.al);
        this.aW.a(this.am, this.aV);
        frw e = fqb.e().e(kaVar, viewGroup);
        e.a((OnClickListener) new $$Lambda$qfi$611wc1nJ0KCz8YA5ICRhkG6Ar0Q(this));
        e.a(SpotifyIcon.SORT_32);
        e.getView().setDuplicateParentStateEnabled(false);
        e.getView().setBackgroundColor(uuu.b(kaVar, 16842836));
        viewGroup.addView(e.getView());
        return e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.aW.a(view);
    }

    /* access modifiers changed from: private */
    public void d(LayoutInflater layoutInflater) {
        ka kaVar = (ka) fay.a(p());
        int a2 = gaa.b(kaVar) ? gaa.a(kaVar.getResources()) : 0;
        this.bo = new VideoSurfaceView((Context) kaVar, false);
        this.bp = new FrameLayout(kaVar);
        this.bp.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.bp.setBackgroundColor(fr.c(kaVar, R.color.cat_black));
        this.bp.setPadding(0, a2, 0, 0);
        this.bp.setVisibility(8);
        this.bp.addView(this.bo);
        GradientView gradientView = (GradientView) layoutInflater.inflate(R.layout.actionbar_bgd_show_video, null);
        gradientView.setLayoutParams(new FrameLayout.LayoutParams(-1, gab.a(kaVar)));
        this.bp.addView(gradientView);
        this.bn.addView(this.bp, 0);
        a((Activity) kaVar, this.bo);
        this.br = (TextView) this.bq.findViewById(R.id.title);
        this.bo.setOnClickListener(new $$Lambda$qfi$QvPk6uujITpTg_QbX6uNGgfTWI0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    private static void a(Activity activity, VideoSurfaceView videoSurfaceView) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        ViewGroup.LayoutParams layoutParams = videoSurfaceView.getLayoutParams();
        layoutParams.width = point.x;
        layoutParams.height = (int) (((float) point.x) / 1.77f);
        videoSurfaceView.setLayoutParams(layoutParams);
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
                    this.af.ap_();
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

    /* access modifiers changed from: private */
    public void ak() {
        if (!this.aO) {
            return;
        }
        if ((this.aX != MediaType.VIDEO || this.aN) && this.be.d()) {
            this.be.b();
        }
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        if (this.ad != null) {
            PlayerTrack track = playerState != null ? playerState.track() : null;
            boolean z = false;
            if (!(playerState == null || track == null)) {
                boolean equals = "context".equals(track.provider());
                boolean equals2 = "queue".equals(track.provider());
                boolean a2 = faw.a(fay.a(this.aB), track.metadata().get("context_uri"));
                boolean a3 = faw.a(fay.a(this.aB), playerState.entityUri());
                if ((equals && a3) || (equals2 && a2)) {
                    tts tts = this.ad;
                    String uri = track.uri();
                    if (playerState.isPlaying() && !playerState.isPaused()) {
                        z = true;
                    }
                    tts.a(uri, z);
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
            uys f = this.ad.f(i2);
            if (f != null && !f.isHeader()) {
                Map v = f.v();
                v.put("artist_name", this.aE);
                v.put("context_uri", fay.a(this.aB));
                int i3 = i + 1;
                playerTrackArr[i] = PlayerTrack.create(f.getUri(), v);
                i = i3;
            }
        }
        String str = (String) fay.a(this.aB);
        HashMap hashMap = new HashMap();
        hashMap.put("context_description", this.aE);
        hashMap.put("image_url", this.aG);
        hashMap.put(Metadata.CONTEXT_LONG_DESCRIPTION, this.aH);
        hashMap.put("media.type", this.aX == MediaType.VIDEO ? "video" : "audio");
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }

    private void a(long j, ActionCallback actionCallback) {
        Builder playerOptionsOverride = new Builder().skipToIndex(0, (int) j).suppressions(PlayerProviders.MFT).playerOptionsOverride(Boolean.FALSE, null, null);
        Bundle bundle = (Bundle) fay.a(this.i);
        String str = "seek_to";
        if (bundle.containsKey(str)) {
            playerOptionsOverride.seekTo(Long.valueOf(bundle.getLong(str)));
        }
        this.aT.play(am(), playerOptionsOverride.build(), actionCallback);
    }

    public final void ax_() {
        super.ax_();
        ViewLoadingTracker viewLoadingTracker = this.av;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.e();
        }
        upq upq = this.aW;
        if (upq != null) {
            upq.a();
        }
        this.aN = false;
        this.b.b(this.bo);
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
        upp upp = this.aU;
        if (upp != null) {
            bundle.putInt("filter", upp.c);
        }
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        fyt.a(uhs.a(this.aG, (String) fay.a(this.aB), true), SpotifyIconV2.SHOWS, false, true);
        fyt.b(this.aE);
        fyt.c(this.aF);
        fyt.a(this.aH);
        this.Y.a(fyt, new $$Lambda$qfi$i2j2aExMigwp6onAB576oN74lMQ(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ap() {
        this.ab.a((String) fay.a(this.aB), this.aG, (String) null, this.aE, "", (String) null, jnu.a);
    }

    public final sih ae_() {
        if (this.aA.equals(ak)) {
            this.aB = (String) fay.a(this.i.getString("uri"));
            this.aA = sih.a(this.aB);
        }
        return this.aA;
    }

    private void an() {
        this.bb = new jqg(p());
        this.bb.a(o().getResources().getInteger(R.integer.show_description_max_lines));
        this.ba.a((sa) new qfk(this.bb));
    }

    public final udr ag() {
        return udt.aR;
    }

    public final rdh af() {
        return rdh.a((defpackage.rdh.a) this.ai);
    }

    private boolean ao() {
        return this.aX == MediaType.AUDIO && iqh.a(this.aw);
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle) {
        if (!this.B) {
            if (this.aE == null) {
                this.aE = a((int) R.string.show_title);
            }
            this.aB = ((Bundle) fay.a(this.i)).getString("uri");
            this.al.clear();
            if (this.aX == MediaType.VIDEO) {
                upp upp = new upp(this.bz, R.string.filter_show_all_videos);
                upp.c = 0;
                this.as = upp;
            } else {
                upp upp2 = new upp(this.bz, R.string.filter_show_all_episodes);
                upp2.c = 0;
                this.as = upp2;
            }
            upp upp3 = new upp(this.bz, R.string.filter_show_unheard_only);
            upp3.c = 2;
            this.at = upp3;
            upp upp4 = new upp(this.bz, R.string.filter_show_only_offlined_content);
            upp4.c = 3;
            this.au = upp4;
            this.al.add(this.as);
            if (ao()) {
                this.al.add(this.au);
            }
            this.al.add(this.at);
            int i = bundle != null ? bundle.getInt("filter", 0) : 0;
            for (upp upp5 : this.al) {
                if (i == upp5.c) {
                    this.aU = upp5;
                    upp5.a = true;
                } else {
                    upp5.a = false;
                }
            }
            this.aU = (upp) jtc.a(this.aU, this.as);
            SortOption sortOption = this.aY == ConsumptionOrder.SEQUENTIAL ? this.ao : this.an;
            this.am.clear();
            this.am.add(sortOption);
            String str = this.aB;
            qfc qfc = this.U;
            if (str == null) {
                str = "";
            }
            this.aV = qfc.a(str, sortOption, this.am);
            this.av = this.X.a(this.bn, this.aA.toString(), bundle, rdh.a((defpackage.rdh.a) this.ai));
            this.aT = this.V.create(this.aA.toString(), udt.aR, defpackage.udt.a.a((jol) this));
            this.aT.registerPlayerStateObserver(this.by);
            if (this.ax == null) {
                this.ax = new rxi(this.ae, (String) fay.a(this.aB));
            }
            this.ax.a(Integer.valueOf(0), Integer.valueOf(this.aQ));
            this.ax.a(false, this.au.a, this.at.a);
            this.ax.a(this.aV);
            if (!fax.a(this.aD)) {
                this.ax.d_(this.aD);
            }
        }
    }

    static /* synthetic */ void f(qfi qfi, String str) {
        fuj fuj = qfi.bt;
        if (fuj != null) {
            fuj.getView().setVisibility(0);
        }
    }

    static /* synthetic */ void h(qfi qfi, String str) {
        PlayerState lastPlayerState = qfi.aT.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused() && str.equals(track.uri())) {
                qfi.a(qfi.aT.getLastPlayerState());
            }
        }
    }
}
