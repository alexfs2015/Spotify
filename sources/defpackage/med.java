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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger.UserIntent;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter;
import com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.Type;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.b;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import com.spotify.music.follow.resolver.RxFollowersCountResolver.Count;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.internal.functions.Functions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: med reason: default package */
public class med extends jor implements d, fyw, jol, udv, upu {
    public uhs T;
    public ToolbarMenuHelper U;
    public kxz V;
    public RxResolver W;
    public Scheduler X;
    public Scheduler Y;
    public PlayOrigin Z;
    public CollectionLogger a;
    private fuj aA;
    private DownloadHeaderView aB;
    /* access modifiers changed from: private */
    public View aC;
    private LoadingView aD;
    private View aE;
    /* access modifiers changed from: private */
    public fxq<fxy> aF;
    /* access modifiers changed from: private */
    public int aG;
    /* access modifiers changed from: private */
    public jri aH;
    /* access modifiers changed from: private */
    public Handler aI;
    private ToggleButton aJ;
    /* access modifiers changed from: private */
    public boolean aK;
    /* access modifiers changed from: private */
    public boolean aL;
    /* access modifiers changed from: private */
    public com.spotify.music.follow.FollowManager.a aM;
    private RxFollowersCountResolver aN;
    private Disposable aO;
    private uzf aP = new f();
    private final CompositeDisposable aQ = new CompositeDisposable();
    private int aR;
    private int aS;
    /* access modifiers changed from: private */
    public boolean aT;
    /* access modifiers changed from: private */
    public sih aU;
    private ViewLoadingTracker aV;
    /* access modifiers changed from: private */
    public fpt aW;
    /* access modifiers changed from: private */
    public iog aX;
    private final jmf<uzc> aY = new jmf<uzc>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            uzc uzc = (uzc) obj;
            return med.this.ah.a(uzc.getUri(), uzc.getName(), med.this.as).a(med.this.aU).a(med.this.aw).b(med.this.aw).c(true).d(false).a(udt.v).a();
        }
    };
    private final jmf<com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a> aZ = new jmf<com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a aVar = (com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a) obj;
            return med.this.ai.a(aVar.b(), aVar.a()).a(med.this.aU).a(med.this.aw).b(true).c(true).a(udt.v).a();
        }
    };
    public ioh aa;
    public lkn ab;
    public jug ac;
    public Flowable<PlayerState> ad;
    public spi ae;
    public iww af;
    public fyz ag;
    public jmq ah;
    public jmg ai;
    public kyi aj;
    public FollowManager ak;
    public jwv al;
    public meg am;
    public meh an;
    public ObjectMapper ao;
    /* access modifiers changed from: private */
    public ListView ap;
    private String aq;
    /* access modifiers changed from: private */
    public String ar;
    /* access modifiers changed from: private */
    public String as;
    private String at;
    private boolean au;
    private boolean av;
    /* access modifiers changed from: private */
    public boolean aw;
    private boolean ax;
    /* access modifiers changed from: private */
    public jqb ay;
    private AlbumsWithTracksAdapter az;
    public rwr b;
    private final OnItemClickListener ba = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - med.this.ap.getHeaderViewsCount();
            if (headerViewsCount >= 0) {
                int a2 = med.this.ay.a(headerViewsCount);
                if (a2 == 0) {
                    Object tag = view.getTag();
                    if (tag instanceof com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a) {
                        com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a aVar = (com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a) tag;
                        String b = aVar.b();
                        String str = b;
                        med.this.a.a(str, "album", (int) j, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
                        med.this.ae.a(spd.a(b).b(aVar.a()).a());
                        return;
                    }
                    if (tag instanceof uzc) {
                        uzc uzc = (uzc) tag;
                        if (!jsl.c(med.this.aW)) {
                            med.this.a.a(uzc.getUri(), "inert-track", (int) j, InteractionType.HIT, UserIntent.PLAY);
                            if (med.this.aC instanceof ShufflePlayHeaderView) {
                                ((ShufflePlayHeaderView) med.this.aC).a();
                            } else if (med.this.aC != null) {
                                ShufflePlayHeaderView.a(med.this.aH, med.this.aC);
                            }
                        } else if (!med.this.aT || !uzc.isExplicit()) {
                            med.this.a.a(uzc.getUri(), TrackData.TYPE_TRACK, (int) j, InteractionType.HIT, UserIntent.PLAY);
                            Builder builder = new Builder();
                            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, uzc.getUri(), 0);
                            med.this.aX.a(builder.skipTo(playOptionsSkipTo).build(), med.this.Z, Collections.emptyMap());
                        } else {
                            med.this.ab.a(uzc.getUri(), med.this.aU.toString());
                        }
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("Unexpected section ");
                sb.append(a2);
                throw new AssertionError(sb.toString());
            }
        }
    };
    private final com.spotify.mobile.android.ui.view.DownloadHeaderView.a bb = new com.spotify.mobile.android.ui.view.DownloadHeaderView.a() {
        public final void a() {
            med.this.ae.a("spotify:internal:preferences");
        }

        public final void a(boolean z) {
            med.this.aX.a(z);
            OffliningLogger.a(med.this.aU, med.this.ar, SourceElement.HEADER_TOGGLE, z);
        }
    };
    private final OnClickListener bc = new OnClickListener() {
        public final void onClick(View view) {
            med.this.a.a((String) null, "shuffle-play-button", -1, InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
            med.this.ai();
        }
    };
    private final Consumer<Count> bd = new $$Lambda$med$pwu54oUsYEtJ3HnH2Jgjd7gOrlc(this);
    private final Consumer<Throwable> be = new $$Lambda$med$sJMWm4mAxcG4jbGAzou1cvGrV8U(this);
    /* access modifiers changed from: private */
    public final Runnable bf = new Runnable() {
        public final void run() {
            med.this.al();
        }
    };
    private final b bg = new b() {
        public final void a(com.spotify.music.follow.FollowManager.a aVar) {
            med.this.aM = aVar;
            med med = med.this;
            med.aK = med.aM.d;
            med med2 = med.this;
            med2.aL = med2.aM.e;
            med.this.aI.post(med.this.bf);
        }
    };

    /* renamed from: med$a */
    public static abstract class a {

        /* renamed from: med$a$a reason: collision with other inner class name */
        public interface C0055a {
            C0055a a(iot iot);

            C0055a a(boolean z);

            a a();
        }

        public abstract iot a();

        public abstract boolean b();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static med a(String str, String str2, String str3, fpt fpt) {
        sih a2 = ViewUris.bi.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_collection_uri", a2);
        bundle.putString("title", str2);
        bundle.putString("username", str3);
        med med = new med();
        med.g(bundle);
        fpu.a((Fragment) med, fpt);
        return med;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aU = ae_();
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            String str = "list_position";
            if (bundle.containsKey(str)) {
                this.aG = bundle.getInt(str, 0);
            }
        }
        Bundle bundle2 = this.i;
        this.as = this.aU.toString();
        this.aq = bundle2.getString("title");
        this.aX = this.aa.a(this.as);
        this.aW = fpu.a((Fragment) this);
        c(true);
        this.aH = new jri();
        this.aI = new Handler();
        this.aN = new RxFollowersCountResolver(this.W, this.ao, this.Y);
    }

    public final void B() {
        super.B();
        this.aI.removeCallbacks(this.bf);
        String str = this.ar;
        if (str != null) {
            this.ak.b(str, this.bg);
        }
        Disposable disposable = this.aO;
        if (disposable != null) {
            disposable.bf_();
        }
    }

    public final void g() {
        super.g();
        this.aE.setVisibility(4);
        this.aD.a();
        this.aQ.a(this.V.a().a(this.X).a((Consumer<? super T>) new $$Lambda$med$TvrREkEweynVIuEr_uanVgYXDnc<Object>(this), (Consumer<? super Throwable>) $$Lambda$med$WBRnH9vT28BqnN8qkkwze3qtcI.INSTANCE));
        this.aQ.a(vun.b(this.ab.a()).a(this.X).a((Consumer<? super T>) new $$Lambda$med$0O_nH3YskyI97WvrqpTpHxr1f0<Object>(this), (Consumer<? super Throwable>) $$Lambda$med$i7gDyTQr9avEJ3jM9CLMhVzZNdo.INSTANCE));
        if (jsl.b(this.aW)) {
            this.aQ.a(this.ac.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$med$vRfaCt8GXbqfl_dsvEaVtPb1wiQ(this)).a(this.X).a((Consumer<? super T>) new $$Lambda$med$dpNvHNTZWaWbEkV4AWZPGZos3l8<Object>(this), (Consumer<? super Throwable>) $$Lambda$med$LKdBm9rbuyR9GAYSjQ8LvT5lKQ.INSTANCE));
        } else {
            this.aQ.a(this.ac.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$med$TCrHFSGIAHvyw0DjZWfGBtmbps4(this)).a(this.X).a((Consumer<? super T>) new $$Lambda$med$dpNvHNTZWaWbEkV4AWZPGZos3l8<Object>(this), (Consumer<? super Throwable>) $$Lambda$med$VHYdUVB5BA06zk31jDTKKIW2U6g.INSTANCE));
        }
        this.aQ.a(this.ad.a(this.X).a((Consumer<? super T>) new $$Lambda$med$u7VZcWkiG8GRXybTbDRzPB4rCq8<Object>(this), (Consumer<? super Throwable>) $$Lambda$med$niTEFUPJ99v_HG4qlcTdt6Lf1_c.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Boolean bool) {
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.az;
        albumsWithTracksAdapter.d = bool.booleanValue();
        if (albumsWithTracksAdapter.getCount() > 0) {
            albumsWithTracksAdapter.notifyDataSetChanged();
        }
        this.aT = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        iog a2 = this.aa.a(this.as);
        a2.g = !bool.booleanValue();
        iog a3 = this.aa.a(this.as);
        a3.g = !bool.booleanValue();
        return Observable.a((ObservableSource<? extends T1>) a2.a((Policy) null), (ObservableSource<? extends T2>) this.V.a(), (ObservableSource<? extends T3>) a3.b((Policy) null), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$med$RrkCva_bNJNP6hKt8OmYxsxPEMA<Object,Object,Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a a(final iot iot, Boolean bool, final iot iot2) {
        return new a().a((iot) new iot() {
            public final boolean isLoading() {
                return iot.isLoading() || iot2.isLoading();
            }

            public final int getUnfilteredLength() {
                return iot2.getUnfilteredLength();
            }

            public final int getUnrangedLength() {
                return iot2.getUnrangedLength();
            }

            public final uyr getHeader() {
                return iot.getHeader();
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return (uzc[]) iot2.getItems();
            }
        }).a(bool.booleanValue()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        iog a2 = this.aa.a(this.as);
        a2.g = !bool.booleanValue();
        return Observable.a((ObservableSource<? extends T1>) a2.a((Policy) null), (ObservableSource<? extends T2>) this.V.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$med$92Mepfl6HcitObFq0ef9niU6cj8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (jst.a(playerState.contextUri()).b != LinkType.COLLECTION_ARTIST || track == null) {
            this.az.a(null);
        } else {
            this.az.a(track.uri());
        }
    }

    public final void h() {
        super.h();
        this.aQ.c();
        this.aD.c();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aW = fpu.a((Fragment) this);
        ka p = p();
        if (jtc.b(p)) {
            this.aF = fxq.b((Context) p).b().b(ah(), 0).b((View) null).a((Fragment) this);
        } else {
            this.aC = jqd.a(p, null);
            this.aC.setOnClickListener(this.bc);
            c a2 = fxq.a((Context) p);
            a2.b.b = 1;
            this.aF = new b(a2.a, a2.b).b(ah(), 0).a(true).b(this.aC).a((Fragment) this);
        }
        this.aF.a(uuu.b(p, R.attr.pasteColorSubHeaderBackground));
        ((fxy) this.aF.a()).a(this.aq);
        this.aE = this.aF.b();
        this.ap = this.aF.e().a;
        this.ap.setOnItemClickListener(this.ba);
        FrameLayout frameLayout = new FrameLayout(p());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.aE);
        this.aV = this.b.a(frameLayout, this.aU.toString(), bundle, af());
        this.ap.setFastScrollEnabled(true);
        this.aD = LoadingView.a(layoutInflater, p(), this.aE);
        frameLayout.addView(this.aD);
        this.aJ.setVisibility(4);
        meh meh = this.an;
        AlbumsWithTracksAdapter albumsWithTracksAdapter = new AlbumsWithTracksAdapter(jsl.c(this.aW), (jmf) meh.a(this.aY, 2), (jmf) meh.a(this.aZ, 3), (Context) meh.a(meh.a.get(), 4), (sih) meh.a(meh.b.get(), 5), (jwv) meh.a(meh.c.get(), 6));
        this.az = albumsWithTracksAdapter;
        ka p2 = p();
        fqb.f();
        fuj a3 = fum.a(p2, null);
        a3.a(false);
        TextView b2 = a3.b();
        TextView c = a3.c();
        b2.setSingleLine(false);
        b2.setEllipsize(null);
        c.setSingleLine(false);
        c.setEllipsize(null);
        a3.b().setVisibility(8);
        a3.b((CharSequence) p2.getString(R.string.placeholder_collection_empty_artist_only_body));
        this.aA = a3;
        this.aA.b((CharSequence) p().getString(R.string.placeholder_collection_empty_artist_only_body, new Object[]{this.aq}));
        this.ay = new jqb(p());
        this.ay.a((ListAdapter) this.az, p().getString(mef.a(this.aW, R.string.collection_artist_section_my_albums)), 0);
        this.ay.a((ListAdapter) new jlv(this.aA.getView(), false), (String) null, 1);
        this.ay.a(1, 0);
        this.aB = DownloadHeaderView.a((Context) p(), (ViewGroup) null);
        DownloadHeaderView downloadHeaderView = this.aB;
        downloadHeaderView.b = this.bb;
        this.ap.addHeaderView(downloadHeaderView, null, false);
        this.ap.setAdapter(this.ay);
        this.ap.setOnItemLongClickListener(new jmd(p(), this.aU));
        return frameLayout;
    }

    public final void ax_() {
        super.ax_();
        this.aV.e();
    }

    private ToggleButton ah() {
        this.aJ = (ToggleButton) LayoutInflater.from(p()).inflate(R.layout.header_toggle_button, null);
        this.aJ.setOnClickListener(new $$Lambda$med$wuVICN18Nb6Cd3Wcb1ln4tm33I(this));
        return this.aJ;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        boolean z = this.aK;
        if (this.aw) {
            this.a.a(this.ar, "follow-button", -1, InteractionType.HIT, z ? UserIntent.UNFOLLOW : UserIntent.FOLLOW, z ? InteractionAction.UNFOLLOW : InteractionAction.FOLLOW);
            this.ak.a(this.ar, !this.aK);
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.aw = z;
        al();
        if (z && this.ar != null) {
            Disposable disposable = this.aO;
            if (disposable != null) {
                disposable.bf_();
            }
            this.aO = this.aN.a(this.ar).a(this.X).a(this.bd, this.be);
        }
        this.aj.ap_();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.az;
        boolean z = albumsWithTracksAdapter != null && albumsWithTracksAdapter.getCount() > 0;
        if (u() && this.ar != null) {
            fxq<fxy> fxq = this.aF;
            if (fxq != null) {
                fxq.a(fyt, p());
            }
            fyt.a(uhs.a(this.at, this.ar, true), SpotifyIconV2.ARTIST, false, true);
            fyt.b(this.aq);
            if (jtc.b(p()) && z) {
                this.aC = ToolbarMenuHelper.a(fyt, (OnClickListener) new $$Lambda$med$_KZfwWTUX74xuVOL9kg8Ht7FhKM(this));
            }
            if (z) {
                this.U.a(fyt, this.aU, this.aP, (Runnable) new $$Lambda$med$SE9aLdIYBe_BiSWy_x9ksoOQ8(this), (Runnable) new $$Lambda$med$vGveIMSuQ1xraI9sCzXUOiRn6zM(this));
            }
            if (this.aw && this.ar != null && !jrk.a(this.aq) && this.aM != null) {
                this.ag.a(fyt, this.aU, this.ar, this.aK);
            }
            if (this.ar != null && !jrk.a(this.aq) && this.av) {
                this.am.a(fyt, this.ar);
            }
            ToolbarMenuHelper.a(fyt, b((Context) p()), "", !TextUtils.isEmpty(this.at) ? Uri.parse(this.at) : Uri.EMPTY, this.ar, this.af);
            if (this.au) {
                this.U.a(fyt, ae_(), this.ar, this.aq, this.aW, this.ae, n());
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a(null, "toolbar-menu", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
        ai();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void an() {
        this.aX.a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void am() {
        this.aX.a(false);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ap;
        if (listView != null) {
            bundle.putInt("list_position", listView.getFirstVisiblePosition());
        }
        this.aV.a(bundle);
    }

    /* access modifiers changed from: private */
    public void ai() {
        this.aX.a(new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), this.Z, Collections.emptyMap());
    }

    private void ak() {
        String str;
        if (this.aK || !this.aw) {
            str = p().getString(R.string.placeholder_collection_empty_artist_only_body, new Object[]{this.aq});
        } else {
            str = p().getString(mef.a(this.aW, R.string.placeholder_collection_empty_artist_only_not_following_body), new Object[]{this.aq});
        }
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.az;
        if (albumsWithTracksAdapter != null && this.aS > albumsWithTracksAdapter.getCount()) {
            str = p().getString(R.string.placeholder_collection_empty_artist_only_no_available_songs_body, new Object[]{this.aq});
        }
        this.aA.b((CharSequence) str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Count count) {
        this.aM = this.ak.a(this.ar);
        com.spotify.music.follow.FollowManager.a aVar = this.aM;
        if (aVar == null) {
            com.spotify.music.follow.FollowManager.a aVar2 = new com.spotify.music.follow.FollowManager.a(this.ar, count.getFollowersCount(), count.getFollowingCount(), this.aK, this.aL);
            this.aM = aVar2;
        } else {
            aVar.c = count.getFollowersCount();
            this.aM.b = count.getFollowingCount();
        }
        this.ak.a(this.aM);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to get followed count for %s", this.ar);
    }

    /* access modifiers changed from: private */
    public void al() {
        ak();
        if (this.aF != null) {
            boolean a2 = jrk.a(this.aq);
            this.aJ.setText(this.aK ? R.string.artist_header_following : R.string.artist_header_follow);
            this.aJ.setChecked(this.aK);
            this.aJ.setEnabled(this.aw && this.aM != null);
            if (!a2) {
                com.spotify.music.follow.FollowManager.a aVar = this.aM;
                if (aVar != null) {
                    int i = aVar.c;
                    ((fxy) this.aF.a()).a().setVisibility(0);
                    ((fxy) this.aF.a()).b(o().getResources().getQuantityString(R.plurals.artist_header_followers_count, i, new Object[]{Integer.valueOf(i)}));
                    this.aF.e().a.requestLayout();
                }
            }
            ((fxy) this.aF.a()).a().setVisibility(8);
            this.aF.e().a.requestLayout();
        }
        this.aj.ap_();
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        uzf uzf;
        uyr header = aVar.a().getHeader();
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.az;
        List asList = Arrays.asList(aVar.a().getItems());
        albumsWithTracksAdapter.a.clear();
        albumsWithTracksAdapter.b.clear();
        albumsWithTracksAdapter.c.clear();
        Object obj = null;
        int i = -1;
        for (int i2 = 0; i2 < asList.size(); i2++) {
            uzc uzc = (uzc) asList.get(i2);
            LinkType linkType = jst.a(uzc.getUri()).b;
            if (!(linkType == LinkType.ALBUM || linkType == LinkType.COLLECTION_ALBUM)) {
                if (i == -1) {
                    i = i2;
                }
                uyq album = uzc.getAlbum();
                String uri = album != null ? album.getUri() : "";
                boolean z = !faw.a(obj, uri);
                if (i2 > i && z) {
                    albumsWithTracksAdapter.a.add(albumsWithTracksAdapter.a.get(albumsWithTracksAdapter.a.size() - 1));
                    albumsWithTracksAdapter.b.add(Type.PLACEHOLDER);
                }
                if (z) {
                    albumsWithTracksAdapter.a.add(new com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a(uzc));
                    albumsWithTracksAdapter.b.add(Type.ALBUM);
                }
                albumsWithTracksAdapter.a.add(uzc);
                albumsWithTracksAdapter.b.add(Type.TRACK);
                albumsWithTracksAdapter.c.add(uzc);
                obj = uri;
            }
        }
        albumsWithTracksAdapter.notifyDataSetChanged();
        this.aq = header.getName();
        this.ar = header.getUri();
        this.at = header.getImageUri(Size.NORMAL);
        if (this.aF != null) {
            Uri parse = !TextUtils.isEmpty(this.at) ? Uri.parse(this.at) : Uri.EMPTY;
            this.al.a(this.aF.d(), parse);
            ImageView imageView = (ImageView) fay.a(this.aF.c());
            jwv jwv = this.al;
            jwv.a(imageView, parse, fzg.a(jwv.a), uuz.a(), this.aF.g());
            imageView.setScaleType(ScaleType.CENTER_CROP);
        }
        this.aP = header.getOfflineState();
        this.aR = header.getNumAlbumsInCollection();
        this.aS = header.getNumTracksInCollection();
        ak();
        this.au = aVar.b();
        this.i.putString("title", this.aq);
        fxq<fxy> fxq = this.aF;
        if (fxq == null) {
            this.aj.a(this, this.aq);
        } else {
            ((fxy) fxq.a()).a(this.aq);
        }
        this.aM = this.ak.a(this.ar);
        com.spotify.music.follow.FollowManager.a aVar2 = this.aM;
        if (aVar2 != null) {
            this.aK = aVar2.d;
            this.aL = this.aM.e;
        } else {
            this.aK = header.isFollowed();
            this.aL = header.isDismissed();
            Disposable disposable = this.aO;
            if (disposable != null) {
                disposable.bf_();
            }
            this.aO = this.aN.a(this.ar).a(this.X).a(this.bd, this.be);
        }
        this.ak.a(this.ar, this.bg);
        al();
        this.av = true;
        this.aj.ap_();
        AlbumsWithTracksAdapter albumsWithTracksAdapter2 = this.az;
        boolean z2 = albumsWithTracksAdapter2 != null && albumsWithTracksAdapter2.getCount() > 0;
        DownloadHeaderView downloadHeaderView = this.aB;
        if (z2) {
            uzf = this.aP;
        } else {
            uzf = new f();
        }
        downloadHeaderView.a(uzf);
        if (this.aD.d()) {
            this.aD.b();
            if (this.aF != null) {
                this.aI.post(new Runnable() {
                    public final void run() {
                        if (!jsl.c(med.this.aW)) {
                            med.this.aF.b(false);
                        } else {
                            med.this.aF.a(false);
                        }
                    }
                });
            }
        }
        boolean z3 = this.az.getCount() > 0;
        if (!z3) {
            this.ay.c(1);
            View view = this.aC;
            if (view != null) {
                view.setEnabled(false);
            }
            if (this.aF != null) {
                this.aI.post(new Runnable() {
                    public final void run() {
                        med.this.aF.b(true);
                    }
                });
            }
        } else {
            this.ay.a(1);
            View view2 = this.aC;
            if (view2 != null) {
                view2.setEnabled(true);
            }
        }
        if (!this.aD.d()) {
            this.aE.setVisibility(0);
        }
        if (this.aG > 0 && z3) {
            this.ap.post(new Runnable() {
                public final void run() {
                    med.this.ap.setSelectionFromTop(med.this.aG, 0);
                    med.this.aG = 0;
                }
            });
        }
        this.ay.c(0);
        this.aj.ap_();
        this.aJ.setVisibility(0);
        this.ax = true;
    }

    public final String b(Context context) {
        String str = this.aq;
        return str == null ? context.getString(R.string.collection_artist_default_title) : str;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("collection:artist:");
        sb.append(this.as);
        return sb.toString();
    }

    public final udr ag() {
        return udt.v;
    }

    public final Uri au_() {
        return Uri.parse(this.as);
    }

    public final gjf aj() {
        return PageIdentifiers.COLLECTION_ARTISTS_ARTIST;
    }

    public final sih ae_() {
        return (sih) fay.a(this.i.getParcelable("artist_collection_uri"));
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION_ARTISTS_ARTIST, ae_().toString());
    }
}
