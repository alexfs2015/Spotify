package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper.ItemType;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger.UserIntent;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.collectionalbum.adapter.AlbumTracksAdapter;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.playlist.models.Covers.Size;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* renamed from: mdu reason: default package */
public class mdu extends jor implements d, com.spotify.music.features.collectionalbum.adapter.AlbumTracksAdapter.a, fyw, jol, udv, upu {
    public lkn T;
    public spi U;
    public iww V;
    public uhs W;
    public fyz X;
    public mdt Y;
    public ToolbarMenuHelper Z;
    public kxi a;
    private jqb aA;
    /* access modifiers changed from: private */
    public AlbumTracksAdapter aB;
    private View aC;
    private DownloadHeaderView aD;
    private LoadingView aE;
    private fuj aF;
    private View aG;
    private int aH;
    private fxq<fxy> aI;
    private jri aJ;
    private Handler aK;
    private ToggleButton aL;
    /* access modifiers changed from: private */
    public boolean aM;
    private Optional<Boolean> aN = Optional.e();
    private boolean aO;
    private uzf aP = new f();
    private boolean aQ;
    private boolean aR;
    /* access modifiers changed from: private */
    public sih aS;
    private final jmf<uzc> aT = new jmf<uzc>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            uzc uzc = (uzc) obj;
            return mdu.this.ae.a(uzc.getUri(), uzc.getName(), mdu.this.as).a(mdu.this.aS).a(mdu.this.aM).b(mdu.this.aM).c(true).d(false).a(udt.t).a();
        }
    };
    private jql aU;
    private fpt aV;
    /* access modifiers changed from: private */
    public boolean aW;
    /* access modifiers changed from: private */
    public inz aX;
    private final CompositeDisposable aY = new CompositeDisposable();
    private final Consumer<Boolean> aZ = new Consumer<Boolean>() {
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            AlbumTracksAdapter d = mdu.this.aB;
            d.b = bool.booleanValue();
            if (d.getCount() > 0) {
                d.notifyDataSetChanged();
            }
            mdu.this.aW = bool.booleanValue();
        }
    };
    public kxz aa;
    public Scheduler ab;
    public PlayOrigin ac;
    public ioa ad;
    public jmq ae;
    public jug af;
    public Flowable<PlayerState> ag;
    public kyi ah;
    public iqa ai;
    public iqf aj;
    public jwv ak;
    public Picasso al;
    public mdx am;
    private ListView an;
    private String ao;
    /* access modifiers changed from: private */
    public String ap;
    private String aq;
    private String ar;
    /* access modifiers changed from: private */
    public String as;
    private String at;
    private String au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private AlbumCollectionState ay = AlbumCollectionState.NO;
    private int az;
    public CollectionLogger b;
    private final OnClickListener ba = new OnClickListener() {
        public final void onClick(View view) {
            mdu.this.b.a(null, "shuffle-play-button", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
            mdu.this.am();
        }
    };
    private final com.spotify.mobile.android.ui.view.DownloadHeaderView.a bb = new com.spotify.mobile.android.ui.view.DownloadHeaderView.a() {
        public final void a() {
            mdu.this.U.a("spotify:internal:preferences");
        }

        public final void a(boolean z) {
            mdu.this.aX.a(z);
            OffliningLogger.a(mdu.this.aS, mdu.this.ap, SourceElement.HEADER_TOGGLE, z);
        }
    };

    /* renamed from: mdu$5 reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[AlbumCollectionState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState[] r0 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.NO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.PARTIALLY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.YES     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mdu.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: mdu$a */
    public static abstract class a {

        /* renamed from: mdu$a$a reason: collision with other inner class name */
        public interface C0054a {
            C0054a a(Optional<Boolean> optional);

            C0054a a(ios ios);

            C0054a a(boolean z);

            a a();
        }

        public abstract ios a();

        public abstract boolean b();

        public abstract Optional<Boolean> c();

        public abstract C0054a d();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static mdu a(String str, String str2, String str3, fpt fpt) {
        sih a2 = ViewUris.bh.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("collection_album_uri", a2);
        bundle.putString("title", str2);
        bundle.putString("username", str3);
        mdu mdu = new mdu();
        mdu.g(bundle);
        fpu.a((Fragment) mdu, fpt);
        return mdu;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aV = fpu.a((Fragment) this);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            String str = "list_position";
            if (bundle.containsKey(str)) {
                this.aH = bundle.getInt(str, 0);
            }
        }
        Bundle bundle2 = this.i;
        this.aS = ae_();
        this.as = this.aS.toString();
        this.ao = bundle2.getString("title");
        this.aX = this.ad.a(this.as);
        c(true);
        this.aJ = new jri();
        this.aK = new Handler();
    }

    public final void g() {
        super.g();
        this.aG.setVisibility(4);
        this.aE.a();
        this.aY.a(vun.b(this.T.a()).a(this.ab).a(this.aZ, (Consumer<? super Throwable>) $$Lambda$mdu$He7594oyNRjvLfDqmNEPMziYUGs.INSTANCE));
        this.aY.a(this.aa.a().a(this.ab).a((Consumer<? super T>) new $$Lambda$mdu$S2ZPMiufwZCGxBwNFZpgGSjuC7w<Object>(this), (Consumer<? super Throwable>) $$Lambda$mdu$mCzVHPAF9bVpCfmWnuLsz2HaHkM.INSTANCE));
        this.aY.a(this.af.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$mdu$Bb5YGHr9PF1BfOD2GmSKRLaLvJE(this)).h(new $$Lambda$mdu$SCvtXcmWcpqDIe_D12uq7P2Q(this)).a(this.ab).a((Consumer<? super T>) new $$Lambda$mdu$tXBIPjQcb_eiUElXfLB43rR5Q<Object>(this), (Consumer<? super Throwable>) $$Lambda$mdu$jhUtilrIwlRMjg4uB_UpMsCBSg.INSTANCE));
        this.aY.a(this.ag.a(this.ab).a((Consumer<? super T>) new $$Lambda$mdu$SzyGquMhuxcG6BfPYr9fohqBg8<Object>(this), (Consumer<? super Throwable>) $$Lambda$mdu$QC8BszrgBquFeswylkXdvDU_Yv0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        inz a2 = this.ad.a(this.as);
        a2.g = !bool.booleanValue();
        return Observable.a((ObservableSource<? extends T1>) a2.a((Policy) null), (ObservableSource<? extends T2>) this.aa.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$mdu$FnCDzLbKvuChyeOqueVK6_x2VfM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(a aVar) {
        return vun.b(this.ai.b(aVar.a().getHeader().getUri())).c((Function<? super T, ? extends R>) new $$Lambda$mdu$vLI8K15y8Y7YCrwjJXeeuEkeNhM<Object,Object>(aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (jst.a(playerState.contextUri()).b != LinkType.COLLECTION_ALBUM || track == null) {
            this.aB.a((String) null);
        } else {
            this.aB.a(track.uri());
        }
    }

    public final void h() {
        super.h();
        this.aY.c();
        this.aE.c();
    }

    public final void a(View view, long j) {
        uzc uzc = (uzc) view.getTag();
        if (jsl.c(this.aV)) {
            this.b.a(uzc.getUri(), TrackData.TYPE_TRACK, (int) j, InteractionType.HIT, UserIntent.PLAY);
            if (!this.aW || !uzc.isExplicit()) {
                Builder builder = new Builder();
                PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, uzc.getUri(), 0);
                this.aX.a(builder.skipTo(playOptionsSkipTo).build(), this.ac, Collections.emptyMap());
                return;
            }
            this.T.a(uzc.getUri(), this.as);
            return;
        }
        this.b.a(uzc.getUri(), "inert-track", (int) j, InteractionType.HIT, UserIntent.PLAY);
        if (!uzc.isPremiumOnly()) {
            View view2 = this.aC;
            if (view2 instanceof ShufflePlayHeaderView) {
                ((ShufflePlayHeaderView) view2).a();
            } else if (view2 != null) {
                ShufflePlayHeaderView.a(this.aJ, view2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.aM = z;
        an();
        this.ah.ap_();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aV = fpu.a((Fragment) this);
        if (jtc.b(p())) {
            this.aI = fxq.b((Context) p()).b().b(ah(), 0).a((View) ai()).b((View) null).a((Fragment) this);
        } else {
            this.aC = jqd.a(p(), null);
            this.aC.setOnClickListener(this.ba);
            this.aI = fxq.a((Context) p()).b().b(ah(), 0).a((View) ai()).b(this.aC).a((Fragment) this);
        }
        this.aI.a(uuu.b(p(), R.attr.pasteColorSubHeaderBackground));
        ((fxy) this.aI.a()).a(this.ao);
        this.aG = this.aI.b();
        this.an = this.aI.e().a;
        FrameLayout frameLayout = new FrameLayout(p());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.aG);
        this.an.setFastScrollEnabled(true);
        this.aE = LoadingView.a(layoutInflater, p(), this.aG);
        frameLayout.addView(this.aE);
        ka p = p();
        fqb.f();
        fuj a2 = fum.a(p, null);
        a2.a(false);
        TextView b2 = a2.b();
        TextView c = a2.c();
        b2.setSingleLine(false);
        b2.setEllipsize(null);
        c.setSingleLine(false);
        c.setEllipsize(null);
        a2.b().setVisibility(8);
        a2.b((CharSequence) p.getString(R.string.placeholder_collection_empty_album_only_no_available_songs_body));
        this.aF = a2;
        this.aF.b((CharSequence) p().getString(R.string.placeholder_collection_empty_album_only_no_available_songs_body, new Object[]{this.ao}));
        AlbumTracksAdapter albumTracksAdapter = new AlbumTracksAdapter(p(), jsl.c(this.aV), this, this.aT, this.aS, skn.a(this.aV));
        this.aB = albumTracksAdapter;
        this.aA = new jqb(p());
        if (!jsl.c(this.aV)) {
            this.aA.a((ListAdapter) this.aB, (int) R.string.collection_album_section_header_includes, 0);
        } else {
            this.aA.a((ListAdapter) this.aB, (String) null, 0);
        }
        this.aA.a((ListAdapter) new jlv(this.aF.getView(), false), (String) null, 1);
        this.aA.a(1, 0);
        this.aD = DownloadHeaderView.a((Context) p(), (ViewGroup) null);
        DownloadHeaderView downloadHeaderView = this.aD;
        downloadHeaderView.b = this.bb;
        this.an.addHeaderView(downloadHeaderView, null, false);
        this.an.setAdapter(this.aA);
        return frameLayout;
    }

    private ToggleButton ah() {
        this.aL = (ToggleButton) LayoutInflater.from(p()).inflate(R.layout.collection_album_header_toggle_button, null);
        this.aL.setVisibility(0);
        this.aL.setOnClickListener(new $$Lambda$mdu$Ijg_tnM5oQFZbwd6HK8x9R6LQho(this));
        return this.aL;
    }

    private jql ai() {
        this.aU = new jql(p());
        this.aU.a((OnClickListener) new $$Lambda$mdu$TqChR9GGRyiagfyh03Kto3FKRXg(this));
        this.aU.a(a((int) R.string.collection_album_header_album_by));
        return this.aU;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.a(this.ar, "artist", -1, InteractionType.HIT, UserIntent.BROWSE);
        this.U.a(spd.a(this.ar).b(this.ao).a());
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        AlbumTracksAdapter albumTracksAdapter = this.aB;
        boolean z = albumTracksAdapter != null && albumTracksAdapter.getCount() > 0;
        if (u()) {
            String str = this.ap;
            if (str != null) {
                fyt.a(uhs.a(this.at, str, true), SpotifyIconV2.ALBUM, false, true);
                fyt.b(this.ao);
                fyt.c(this.aq);
                fxq<fxy> fxq = this.aI;
                if (fxq != null) {
                    fxq.a(fyt, p());
                }
                if (jtc.b(p()) && z) {
                    this.aC = ToolbarMenuHelper.a(fyt, (OnClickListener) new $$Lambda$mdu$hqkKlEjD8rak9t_EaXKukReQRcQ(this));
                }
                this.Z.a(fyt, this.aS, this.ay, this.aM, this.ap, ItemType.ALBUM, this.aV);
                if (z) {
                    this.Z.a(fyt, this.aS, this.aP, (Runnable) new $$Lambda$mdu$WHzFO4beageNNzYPKcy6fTFGAeQ(this), (Runnable) new $$Lambda$mdu$TYlDTKbmjCqDLDrWtYhP5h3VHuo(this));
                }
                if (this.aO && z) {
                    this.am.a(fyt, this.as);
                }
                if (this.aw) {
                    this.am.a(fyt, R.id.options_menu_browse_album, R.string.options_menu_browse_album, ContextMenuEvent.BROWSE_ALBUM, this.ap);
                }
                if (this.ar != null && !jrk.a(this.aq) && this.ax) {
                    this.am.a(fyt, R.id.options_menu_browse_artist, R.string.options_menu_browse_artist, ContextMenuEvent.BROWSE_ARTIST, this.ar);
                }
                ToolbarMenuHelper.a(fyt, b((Context) p()), "", !TextUtils.isEmpty(this.at) ? Uri.parse(this.at) : Uri.EMPTY, this.ap, this.V);
                if (this.aN.b()) {
                    Boolean bool = (Boolean) this.aN.c();
                    this.X.e(fyt, bool.booleanValue(), new $$Lambda$mdu$s4po_o_docOdGQgCJfJNv6YlBlg(this, bool));
                }
                if (this.av) {
                    this.Z.a(fyt, ae_(), this.ap, this.ao, this.aV, this.U, n());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a(null, "toolbar-menu", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
        am();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void as() {
        this.aX.a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ar() {
        this.aX.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool, ImmutableList immutableList) {
        if (bool.booleanValue()) {
            this.a.a((String[]) immutableList.toArray(new String[0]), true);
        } else {
            this.a.a((String[]) immutableList.toArray(new String[0]), this.ap, true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in CollectionAlbumFragment", th);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.an;
        if (listView != null) {
            bundle.putInt("list_position", listView.getFirstVisiblePosition());
        }
    }

    private void ak() {
        if (this.aR && this.aQ) {
            if (this.aE.d()) {
                this.aE.b();
                if (this.aI != null) {
                    this.aK.post(new $$Lambda$mdu$YVknBDzc5p3cix4UwbdBxzaRltY(this));
                }
            }
            boolean z = this.aB.getCount() > 0;
            if (!z) {
                this.aA.c(1);
                View view = this.aC;
                if (view != null) {
                    view.setEnabled(false);
                }
                if (this.aI != null) {
                    this.aK.post(new $$Lambda$mdu$x92GWXJP7K_8xwpt_cl9rUxOWy0(this));
                }
            } else {
                this.aA.a(1);
                View view2 = this.aC;
                if (view2 != null) {
                    view2.setEnabled(true);
                }
            }
            al();
            if (!this.aE.d()) {
                this.aG.setVisibility(0);
            }
            if (this.aH > 0 && z) {
                this.an.post(new $$Lambda$mdu$5_mKv83d1LdL5lgY4Cbj4SUdW3Y(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aq() {
        if (!jsl.c(this.aV)) {
            this.aI.b(false);
        } else {
            this.aI.a(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ap() {
        this.aI.b(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ao() {
        this.an.setSelectionFromTop(this.aH, 0);
        this.aH = 0;
    }

    private void al() {
        uzf uzf;
        AlbumTracksAdapter albumTracksAdapter = this.aB;
        boolean z = albumTracksAdapter != null && albumTracksAdapter.getCount() > 0;
        DownloadHeaderView downloadHeaderView = this.aD;
        if (z) {
            uzf = this.aP;
        } else {
            uzf = new f();
        }
        downloadHeaderView.a(uzf);
    }

    /* access modifiers changed from: private */
    public void am() {
        this.aX.a(new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), this.ac, Collections.emptyMap());
    }

    private void an() {
        if (!(this.aI == null || this.ay == null)) {
            int i = AnonymousClass5.a[this.ay.ordinal()];
            if (i == 1) {
                this.aL.setText(R.string.cat_album_save);
                this.aL.setChecked(false);
                this.aL.setEnabled(true);
            } else if (i == 2) {
                this.aL.setText(R.string.cat_album_complete);
                this.aL.setChecked(false);
                this.aL.setEnabled(this.aM);
            } else if (i == 3) {
                this.aL.setText(R.string.cat_album_saved);
                this.aL.setChecked(true);
                this.aL.setEnabled(true);
            }
        }
    }

    public final String b(Context context) {
        String str = this.ao;
        return str == null ? context.getString(R.string.collection_album_title_default) : str;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("collection:album:");
        sb.append(this.as);
        return sb.toString();
    }

    public final udr ag() {
        return udt.t;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION_ALBUMS_ALBUM, null);
    }

    public final Uri au_() {
        return Uri.parse(this.as);
    }

    public final gjf aj() {
        return PageIdentifiers.COLLECTION_ALBUMS_ALBUM;
    }

    public final sih ae_() {
        return (sih) fay.a(this.i.getParcelable("collection_album_uri"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.aY.a(vun.b(this.aj.a(this.ap)).a(this.ab).a((Consumer<? super T>) new $$Lambda$mdu$b1OnitfD90QrLdYH3b0RlFSxTk8<Object>(this, bool), (Consumer<? super Throwable>) $$Lambda$mdu$NrsXlwg2cPXVrA7GV7W6Q3cX8_U.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        int i = AnonymousClass5.a[this.ay.ordinal()];
        if (i == 1) {
            this.a.a(this.ap, this.as, false);
        } else if (i == 2) {
            this.a.a(this.ap, this.as, false);
        } else if (i == 3) {
            this.a.a(this.ap, false);
        }
        mdt mdt = this.Y;
        AlbumCollectionState albumCollectionState = this.ay;
        String str = this.ap;
        fpt fpt = this.aV;
        fay.a(albumCollectionState);
        fay.a(str);
        fay.a(fpt);
        int i2 = AnonymousClass1.a[albumCollectionState.ordinal()];
        if (i2 == 1) {
            mdt.a.a(str, "album-collection-state-button", InteractionType.HIT, UserIntent.COLLECTION_ADD, InteractionAction.LIKE);
        } else if (i2 != 2) {
            if (i2 == 3) {
                mdt.a.a(str, "album-collection-state-button", InteractionType.HIT, UserIntent.COLLECTION_REMOVE, InteractionAction.UNLIKE);
            }
        } else {
            mdt.a.a(str, "album-collection-state-button", InteractionType.HIT, UserIntent.COLLECTION_COMPLETE, InteractionAction.LIKE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.aQ = true;
        this.aN = aVar.c();
        uyq header = aVar.a().getHeader();
        boolean a2 = fax.a(this.ap);
        this.ao = header.getName();
        this.az = header.getNumTracksInCollection();
        this.ay = AlbumCollectionState.a(this.az, header.isSavedToCollection());
        this.ap = header.getUri();
        uyr artist = header.getArtist();
        String str = "";
        this.aq = artist != null ? artist.getName() : str;
        this.ar = artist != null ? artist.getUri() : str;
        this.aO = true;
        this.at = header.getImageUri(Size.LARGE);
        if (this.aI != null) {
            Uri parse = !TextUtils.isEmpty(this.at) ? Uri.parse(this.at) : Uri.EMPTY;
            this.ak.a(this.aI.d(), parse);
            ImageView imageView = (ImageView) fay.a(this.aI.c());
            this.ak.a(imageView, parse, this.aI.g());
            imageView.setScaleType(ScaleType.CENTER_CROP);
            CoverImageActivity.a(p(), imageView, parse);
            this.aF.a().a(this.al.a(parse).b(fzg.b(p())).a(fzg.b(p())));
        }
        if (a2) {
            ak();
        }
        if (this.aI != null) {
            ((fxy) this.aI.a()).b(p().getString(R.string.collection_album_header_album_by_format, new Object[]{this.aq}).toUpperCase(Locale.getDefault()));
            this.aU.b(this.aq.toUpperCase(Locale.getDefault()));
            jql jql = this.aU;
            String valueOf = String.valueOf(header.getYear());
            if (!TextUtils.isEmpty(valueOf)) {
                jql.d.setText(valueOf);
                jql.d.setVisibility(0);
            } else {
                jql.d.setVisibility(8);
            }
            String imageUri = artist != null ? artist.getImageUri(Size.LARGE) : str;
            ImageView imageView2 = this.aU.b;
            if (!faw.a(this.au, imageUri) || (!fax.a(imageUri) && imageView2.getDrawable() == null)) {
                this.au = imageUri;
                jwv jwv = this.ak;
                jwv.a(imageView2, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, fzg.a(jwv.a), uuz.a());
            }
        }
        an();
        if (this.ay == AlbumCollectionState.NO) {
            str = p().getString(mdw.a(this.aV, R.string.placeholder_collection_empty_album_only_not_following_body), new Object[]{this.ao});
        } else {
            AlbumTracksAdapter albumTracksAdapter = this.aB;
            if (albumTracksAdapter != null && this.az > albumTracksAdapter.getCount()) {
                str = p().getString(R.string.placeholder_collection_empty_album_only_no_available_songs_body, new Object[]{this.ao});
            }
        }
        this.aF.b((CharSequence) str);
        this.aP = header.getOfflineState();
        this.av = aVar.b();
        this.i.putString("title", this.ao);
        fxq<fxy> fxq = this.aI;
        if (fxq == null) {
            this.ah.a(this, this.ao);
        } else {
            ((fxy) fxq.a()).a(this.ao);
        }
        this.aw = header.isAnyTrackPlayable();
        this.ax = aVar.b();
        boolean z = !jrk.a(this.aq) && this.ax;
        if (this.aI != null) {
            jql jql2 = this.aU;
            jql2.c.setEnabled(z);
            jql2.b.setEnabled(z);
        }
        this.ah.ap_();
        al();
        uzc[] uzcArr = (uzc[]) aVar.a().getItems();
        this.aR = true;
        AlbumTracksAdapter albumTracksAdapter2 = this.aB;
        albumTracksAdapter2.a = Arrays.asList(uzcArr);
        albumTracksAdapter2.notifyDataSetChanged();
        if (this.aI != null) {
            int length = uzcArr.length;
            for (uzc length2 : uzcArr) {
                length += length2.getLength();
            }
            this.aU.a(length);
        }
        ak();
        this.aA.c(0);
        this.ah.ap_();
    }
}
