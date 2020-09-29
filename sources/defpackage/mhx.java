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

/* renamed from: mhx reason: default package */
public class mhx extends jrd implements d, com.spotify.music.features.collectionalbum.adapter.AlbumTracksAdapter.a, fzq, jqx, uqq, vaz {
    public lon T;
    public szp U;
    public izh V;
    public utg W;
    public fzt X;
    public mhw Y;
    public ToolbarMenuHelper Z;
    public lar a;
    private AlbumCollectionState aA = AlbumCollectionState.NO;
    private int aB;
    private jsm aC;
    /* access modifiers changed from: private */
    public AlbumTracksAdapter aD;
    private gmu aE;
    private View aF;
    private DownloadHeaderView aG;
    private LoadingView aH;
    private fvd aI;
    private View aJ;
    private int aK;
    private fyk<fys> aL;
    private jts aM;
    private Handler aN;
    private ToggleButton aO;
    /* access modifiers changed from: private */
    public boolean aP;
    private Optional<Boolean> aQ = Optional.e();
    private boolean aR;
    private vli aS = new f();
    private boolean aT;
    private boolean aU;
    /* access modifiers changed from: private */
    public sso aV;
    private final jor<vlf> aW = new jor<vlf>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            vlf vlf = (vlf) obj;
            return mhx.this.ae.a(vlf.getUri(), vlf.getName(), mhx.this.au).a(mhx.this.aV).a(mhx.this.aP).b(mhx.this.aP).c(true).d(false).a(uqo.t).a();
        }
    };
    private jsw aX;
    private fqn aY;
    /* access modifiers changed from: private */
    public boolean aZ;
    public lbi aa;
    public Scheduler ab;
    public PlayOrigin ac;
    public iqn ad;
    public jpc ae;
    public jwo af;
    public Flowable<PlayerState> ag;
    public lbr ah;
    public isn ai;
    public iss aj;
    public jyx ak;
    public Picasso al;
    public mia am;
    public defpackage.gmu.a an;
    public heg ao;
    private ListView ap;
    private String aq;
    /* access modifiers changed from: private */
    public String ar;
    private String as;
    private String at;
    /* access modifiers changed from: private */
    public String au;
    private String av;
    private String aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public CollectionLogger b;
    /* access modifiers changed from: private */
    public iqm ba;
    private final CompositeDisposable bb = new CompositeDisposable();
    private final Consumer<Boolean> bc = new Consumer<Boolean>() {
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            AlbumTracksAdapter d = mhx.this.aD;
            d.b = bool.booleanValue();
            if (d.getCount() > 0) {
                d.notifyDataSetChanged();
            }
            mhx.this.aZ = bool.booleanValue();
        }
    };
    private final OnClickListener bd = new OnClickListener() {
        public final void onClick(View view) {
            mhx.this.b.a(null, "shuffle-play-button", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
            mhx.this.am();
        }
    };
    private final com.spotify.mobile.android.ui.view.DownloadHeaderView.a be = new com.spotify.mobile.android.ui.view.DownloadHeaderView.a() {
        public final void a() {
            mhx.this.U.a("spotify:internal:preferences");
        }

        public final void a(boolean z) {
            mhx.this.ba.a(z);
            OffliningLogger.a(mhx.this.aV, mhx.this.ar, SourceElement.HEADER_TOGGLE, z);
        }
    };

    /* renamed from: mhx$5 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mhx.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: mhx$a */
    public static abstract class a {

        /* renamed from: mhx$a$a reason: collision with other inner class name */
        public interface C0055a {
            C0055a a(Optional<Boolean> optional);

            C0055a a(irf irf);

            C0055a a(boolean z);

            a a();
        }

        public abstract irf a();

        public abstract boolean b();

        public abstract Optional<Boolean> c();

        public abstract C0055a d();
    }

    public static mhx a(String str, String str2, String str3, fqn fqn) {
        sso a2 = ViewUris.bg.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("collection_album_uri", a2);
        bundle.putString("title", str2);
        bundle.putString("username", str3);
        mhx mhx = new mhx();
        mhx.g(bundle);
        fqo.a((Fragment) mhx, fqn);
        return mhx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (jva.a(playerState.contextUri()).b != LinkType.COLLECTION_ALBUM || track == null) {
            this.aD.a((String) null);
        } else {
            this.aD.a(track.uri());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.bb.a(wit.b(this.aj.a(this.ar)).a(this.ab).d((Consumer<? super T>) new $$Lambda$mhx$m5yZQNCmJbI_Xhv_LUlIVL2xvU<Object>(this, bool)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool, ImmutableList immutableList) {
        if (bool.booleanValue()) {
            this.a.a((String[]) immutableList.toArray(new String[0]), true);
        } else {
            this.a.a((String[]) immutableList.toArray(new String[0]), this.ar, true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.aT = true;
        this.aQ = aVar.c();
        vkt header = aVar.a().getHeader();
        boolean a2 = fbo.a(this.ar);
        this.aq = header.getName();
        this.aB = header.getNumTracksInCollection();
        this.aA = AlbumCollectionState.a(this.aB, header.isSavedToCollection());
        this.ar = header.getUri();
        vku artist = header.getArtist();
        String str = "";
        this.as = artist != null ? artist.getName() : str;
        this.at = artist != null ? artist.getUri() : str;
        this.aR = true;
        this.av = header.getImageUri(Size.LARGE);
        if (this.aL != null) {
            Uri parse = !TextUtils.isEmpty(this.av) ? Uri.parse(this.av) : Uri.EMPTY;
            this.ak.a(this.aL.d(), parse);
            ImageView imageView = (ImageView) fbp.a(this.aL.c());
            this.ak.a(imageView, parse, this.aL.g());
            imageView.setScaleType(ScaleType.CENTER_CROP);
            CoverImageActivity.a(p(), imageView, parse);
            this.aI.a().a(this.al.a(parse).b(gaa.b(p())).a(gaa.b(p())));
        }
        if (a2) {
            ak();
        }
        if (this.aL != null) {
            ((fys) this.aL.a()).b(p().getString(R.string.collection_album_header_album_by_format, new Object[]{this.as}).toUpperCase(Locale.getDefault()));
            this.aX.b(this.as.toUpperCase(Locale.getDefault()));
            jsw jsw = this.aX;
            String valueOf = String.valueOf(header.getYear());
            if (!TextUtils.isEmpty(valueOf)) {
                jsw.d.setText(valueOf);
                jsw.d.setVisibility(0);
            } else {
                jsw.d.setVisibility(8);
            }
            String imageUri = artist != null ? artist.getImageUri(Size.LARGE) : str;
            ImageView imageView2 = this.aX.b;
            if (!fbn.a(this.aw, imageUri) || (!fbo.a(imageUri) && imageView2.getDrawable() == null)) {
                this.aw = imageUri;
                jyx jyx = this.ak;
                jyx.a(imageView2, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, gaa.a(jyx.a), vgq.a());
            }
        }
        an();
        if (this.aA == AlbumCollectionState.NO) {
            str = p().getString(mhz.a(this.aY, R.string.placeholder_collection_empty_album_only_not_following_body), new Object[]{this.aq});
        } else {
            AlbumTracksAdapter albumTracksAdapter = this.aD;
            if (albumTracksAdapter != null && this.aB > albumTracksAdapter.getCount()) {
                str = p().getString(R.string.placeholder_collection_empty_album_only_no_available_songs_body, new Object[]{this.aq});
            }
        }
        this.aI.b((CharSequence) str);
        this.aS = header.getOfflineState();
        this.ax = aVar.b();
        this.i.putString("title", this.aq);
        fyk<fys> fyk = this.aL;
        if (fyk == null) {
            this.ah.a(this, this.aq);
        } else {
            ((fys) fyk.a()).a(this.aq);
        }
        this.ay = header.isAnyTrackPlayable();
        this.az = aVar.b();
        boolean z = !jtu.a(this.as) && this.az;
        if (this.aL != null) {
            jsw jsw2 = this.aX;
            jsw2.c.setEnabled(z);
            jsw2.b.setEnabled(z);
        }
        this.ah.ao_();
        al();
        vlf[] vlfArr = (vlf[]) aVar.a().getItems();
        this.aU = true;
        AlbumTracksAdapter albumTracksAdapter2 = this.aD;
        albumTracksAdapter2.a = Arrays.asList(vlfArr);
        albumTracksAdapter2.notifyDataSetChanged();
        if (this.aL != null) {
            int length = vlfArr.length;
            for (vlf length2 : vlfArr) {
                length += length2.getLength();
            }
            this.aX.a(length);
        }
        ak();
        this.aC.c(0);
        this.ah.ao_();
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.aP = z;
        an();
        this.ah.ao_();
    }

    private ToggleButton ah() {
        this.aO = (ToggleButton) LayoutInflater.from(p()).inflate(R.layout.collection_album_header_toggle_button, null);
        this.aO.setVisibility(0);
        this.aO.setOnClickListener(new $$Lambda$mhx$bRS3oL6ztdevALAQwmOGfCN5yGk(this));
        return this.aO;
    }

    private jsw ai() {
        this.aX = new jsw(p());
        this.aX.a((OnClickListener) new $$Lambda$mhx$DanrW280sFnSkGq4WDsyUDM3k(this));
        this.aX.a(a((int) R.string.collection_album_header_album_by));
        return this.aX;
    }

    private void ak() {
        if (this.aU && this.aT) {
            if (this.aH.d()) {
                this.aH.b();
                if (this.aL != null) {
                    this.aN.post(new $$Lambda$mhx$BrgDzQhOGNozL_aD45cVgJWTC64(this));
                }
            }
            boolean z = this.aD.getCount() > 0;
            if (!z) {
                this.aC.c(1);
                View view = this.aF;
                if (view != null) {
                    view.setEnabled(false);
                }
                if (this.aL != null) {
                    this.aN.post(new $$Lambda$mhx$u19pk51pXk79iDqSrDwL7FymS8A(this));
                }
            } else {
                this.aC.a(1);
                View view2 = this.aF;
                if (view2 != null) {
                    view2.setEnabled(true);
                }
            }
            al();
            if (!this.aH.d()) {
                this.aJ.setVisibility(0);
            }
            if (this.aK > 0 && z) {
                this.ap.post(new $$Lambda$mhx$AdC7def6CJb7UNQbHL_YmihT4kI(this));
            }
        }
    }

    private void al() {
        AlbumTracksAdapter albumTracksAdapter = this.aD;
        this.aG.a(albumTracksAdapter != null && albumTracksAdapter.getCount() > 0 ? this.aS : new f());
    }

    /* access modifiers changed from: private */
    public void am() {
        this.ba.a(new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), this.ac, Collections.emptyMap());
    }

    private void an() {
        if (!(this.aL == null || this.aA == null)) {
            int i = AnonymousClass5.a[this.aA.ordinal()];
            if (i == 1) {
                this.aO.setText(R.string.cat_album_save);
                this.aO.setChecked(false);
                this.aO.setEnabled(true);
            } else if (i == 2) {
                this.aO.setText(R.string.cat_album_complete);
                this.aO.setChecked(false);
                this.aO.setEnabled(this.aP);
            } else if (i == 3) {
                this.aO.setText(R.string.cat_album_saved);
                this.aO.setChecked(true);
                this.aO.setEnabled(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ao() {
        this.ap.setSelectionFromTop(this.aK, 0);
        this.aK = 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ap() {
        this.aL.b(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aq() {
        if (!jus.c(this.aY)) {
            this.aL.b(false);
        } else {
            this.aL.a(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ar() {
        this.ba.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void as() {
        this.ba.a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        iqm a2 = this.ad.a(this.au);
        a2.g = !bool.booleanValue();
        return Observable.a((ObservableSource<? extends T1>) a2.a((Policy) null), (ObservableSource<? extends T2>) this.aa.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$mhx$HwgogUjOEhyaytQq4fxa0j0P0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(a aVar) {
        return wit.b(this.ai.b(aVar.a().getHeader().getUri())).c((Function<? super T, ? extends R>) new $$Lambda$mhx$K5FddRNX98SBMjTdw4HnbogRMgw<Object,Object>(aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a(null, "toolbar-menu", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
        am();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.a(this.at, "artist", -1, InteractionType.HIT, UserIntent.BROWSE);
        this.U.a(szk.a(this.at).b(this.aq).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        int i = AnonymousClass5.a[this.aA.ordinal()];
        if (i == 1) {
            this.a.a(this.ar, this.au, false);
        } else if (i == 2) {
            this.a.a(this.ar, this.au, false);
        } else if (i == 3) {
            this.a.a(this.ar, false);
        }
        mhw mhw = this.Y;
        AlbumCollectionState albumCollectionState = this.aA;
        String str = this.ar;
        fqn fqn = this.aY;
        fbp.a(albumCollectionState);
        fbp.a(str);
        fbp.a(fqn);
        int i2 = AnonymousClass1.a[albumCollectionState.ordinal()];
        if (i2 == 1) {
            mhw.a.a(str, "album-collection-state-button", InteractionType.HIT, UserIntent.COLLECTION_ADD, InteractionAction.LIKE);
        } else if (i2 != 2) {
            if (i2 == 3) {
                mhw.a.a(str, "album-collection-state-button", InteractionType.HIT, UserIntent.COLLECTION_REMOVE, InteractionAction.UNLIKE);
            }
        } else {
            mhw.a.a(str, "album-collection-state-button", InteractionType.HIT, UserIntent.COLLECTION_COMPLETE, InteractionAction.LIKE);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aY = fqo.a((Fragment) this);
        if (jvi.b(p())) {
            this.aL = fyk.b((Context) p()).b().b(ah(), 0).a((View) ai()).a((Fragment) this);
        } else {
            if (this.ao.a()) {
                this.aE = this.an.a((Context) p());
                this.aE.a(!this.ao.b());
                this.aF = this.aE.a();
            } else {
                this.aF = jso.a(p(), null);
            }
            this.aF.setOnClickListener(this.bd);
            this.aL = fyk.a((Context) p()).b().b(ah(), 0).a((View) ai()).b(this.aF).a((Fragment) this);
        }
        this.aL.a(vgl.b(p(), R.attr.pasteColorSubHeaderBackground));
        ((fys) this.aL.a()).a(this.aq);
        this.aJ = this.aL.b();
        this.ap = this.aL.e().a;
        FrameLayout frameLayout = new FrameLayout(p());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.aJ);
        this.ap.setFastScrollEnabled(true);
        this.aH = LoadingView.a(layoutInflater, p(), this.aJ);
        frameLayout.addView(this.aH);
        kf p = p();
        fqv.f();
        fvd a2 = fvg.a(p, null);
        a2.a(false);
        TextView b2 = a2.b();
        TextView c = a2.c();
        b2.setSingleLine(false);
        b2.setEllipsize(null);
        c.setSingleLine(false);
        c.setEllipsize(null);
        a2.b().setVisibility(8);
        a2.b((CharSequence) p.getString(R.string.placeholder_collection_empty_album_only_no_available_songs_body));
        this.aI = a2;
        this.aI.b((CharSequence) p().getString(R.string.placeholder_collection_empty_album_only_no_available_songs_body, new Object[]{this.aq}));
        AlbumTracksAdapter albumTracksAdapter = new AlbumTracksAdapter(p(), jus.c(this.aY), this, this.aW, this.aV, suu.a(this.aY));
        this.aD = albumTracksAdapter;
        this.aC = new jsm(p());
        if (!jus.c(this.aY)) {
            this.aC.a((ListAdapter) this.aD, (int) R.string.collection_album_section_header_includes, 0);
        } else {
            this.aC.a((ListAdapter) this.aD, (String) null, 0);
        }
        this.aC.a((ListAdapter) new joh(this.aI.getView(), false), (String) null, 1);
        this.aC.a(1, 0);
        this.aG = DownloadHeaderView.a((Context) p(), (ViewGroup) null);
        DownloadHeaderView downloadHeaderView = this.aG;
        downloadHeaderView.b = this.be;
        this.ap.addHeaderView(downloadHeaderView, null, false);
        this.ap.setAdapter(this.aC);
        return frameLayout;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        fzv.a(this, menu);
    }

    public final void a(View view, long j) {
        vlf vlf = (vlf) view.getTag();
        if (jus.c(this.aY)) {
            this.b.a(vlf.getUri(), TrackData.TYPE_TRACK, (int) j, InteractionType.HIT, UserIntent.PLAY);
            if (!this.aZ || !vlf.isExplicit()) {
                Builder builder = new Builder();
                PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, vlf.getUri(), 0);
                this.ba.a(builder.skipTo(playOptionsSkipTo).build(), this.ac, Collections.emptyMap());
                return;
            }
            this.T.a(vlf.getUri(), this.au);
            return;
        }
        this.b.a(vlf.getUri(), "inert-track", (int) j, InteractionType.HIT, UserIntent.PLAY);
        if (!vlf.isPremiumOnly()) {
            View view2 = this.aF;
            if (view2 instanceof ShufflePlayHeaderView) {
                ((ShufflePlayHeaderView) view2).a();
            } else if (view2 != null) {
                ShufflePlayHeaderView.a(this.aM, view2);
            }
        }
    }

    public final void a(fzn fzn) {
        AlbumTracksAdapter albumTracksAdapter = this.aD;
        boolean z = albumTracksAdapter != null && albumTracksAdapter.getCount() > 0;
        if (u()) {
            String str = this.ar;
            if (str != null) {
                fzn.a(utg.a(this.av, str, true), SpotifyIconV2.ALBUM, false, true);
                fzn.b(this.aq);
                fzn.c(this.as);
                fyk<fys> fyk = this.aL;
                if (fyk != null) {
                    fyk.a(fzn, p());
                }
                if (jvi.b(p()) && z) {
                    this.aF = ToolbarMenuHelper.a(fzn, (OnClickListener) new $$Lambda$mhx$Ob3hQg9dR9uXhAXFDH_TBULVLQ(this));
                }
                this.Z.a(fzn, this.aV, this.aA, this.aP, this.ar, ItemType.ALBUM, this.aY);
                if (z) {
                    this.Z.a(fzn, this.aV, this.aS, (Runnable) new $$Lambda$mhx$zsR3SV3BJHQ0kGxoujaz7cEiqo(this), (Runnable) new $$Lambda$mhx$hxEutBGX_dLzyx6nDb1BVAmlc4Y(this));
                }
                if (this.aR && z) {
                    this.am.a(fzn, this.au);
                }
                if (this.ay) {
                    this.am.a(fzn, R.id.options_menu_browse_album, R.string.options_menu_browse_album, ContextMenuEvent.BROWSE_ALBUM, this.ar);
                }
                if (this.at != null && !jtu.a(this.as) && this.az) {
                    this.am.a(fzn, R.id.options_menu_browse_artist, R.string.options_menu_browse_artist, ContextMenuEvent.BROWSE_ARTIST, this.at);
                }
                ToolbarMenuHelper.a(fzn, b((Context) p()), "", !TextUtils.isEmpty(this.av) ? Uri.parse(this.av) : Uri.EMPTY, this.ar, this.V);
                if (this.aQ.b()) {
                    Boolean bool = (Boolean) this.aQ.c();
                    this.X.e(fzn, bool.booleanValue(), new $$Lambda$mhx$ITRsSbvjxKhOm3eC7WJuXJgHgM(this, bool));
                }
                if (this.ax) {
                    this.Z.a(fzn, ae_(), this.ar, this.aq, this.aY, this.U, n());
                }
            }
        }
    }

    public final void aP_() {
        super.aP_();
        this.aJ.setVisibility(4);
        this.aH.a();
        this.bb.a(wit.b(this.T.a()).a(this.ab).a(this.bc, (Consumer<? super Throwable>) $$Lambda$mhx$K576OHEYjpZXempwDcVOY9RbM0c.INSTANCE));
        this.bb.a(this.aa.a().a(this.ab).a((Consumer<? super T>) new $$Lambda$mhx$8Rww9GZa_4f4ILmcVo3BxN7h0Vg<Object>(this), (Consumer<? super Throwable>) $$Lambda$mhx$qDhlWnwZtJ1SpkYZ981mM0AhZWE.INSTANCE));
        this.bb.a(this.af.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$mhx$3XddT2wLy8UYCXc8YX4bK4vK4kY(this)).h(new $$Lambda$mhx$TKPEdHvytZp7DQ69J1WuBeUDFM(this)).a(this.ab).a((Consumer<? super T>) new $$Lambda$mhx$6kkdtwExnLDOzZHZKientyBc4s<Object>(this), (Consumer<? super Throwable>) $$Lambda$mhx$2aVWLHjNeOY8MI5G0F8Ky9PUP4.INSTANCE));
        this.bb.a(this.ag.a(this.ab).a((Consumer<? super T>) new $$Lambda$mhx$kP53oIp2jCp2Jpdkm8T8w11Sd_w<Object>(this), (Consumer<? super Throwable>) $$Lambda$mhx$MnQiq2VsI_yYrePuh1yZwOtHkM.INSTANCE));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return (sso) fbp.a(this.i.getParcelable("collection_album_uri"));
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION_ALBUMS_ALBUM, null);
    }

    public final uqm ag() {
        return uqo.t;
    }

    public final gkq aj() {
        return PageIdentifiers.COLLECTION_ALBUMS_ALBUM;
    }

    public final Uri at_() {
        return Uri.parse(this.au);
    }

    public final String b(Context context) {
        String str = this.aq;
        return str == null ? context.getString(R.string.collection_album_title_default) : str;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aY = fqo.a((Fragment) this);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            String str = "list_position";
            if (bundle.containsKey(str)) {
                this.aK = bundle.getInt(str, 0);
            }
        }
        Bundle bundle2 = this.i;
        this.aV = ae_();
        this.au = this.aV.toString();
        this.aq = bundle2.getString("title");
        this.ba = this.ad.a(this.au);
        c(true);
        this.aM = new jts();
        this.aN = new Handler();
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("collection:album:");
        sb.append(this.au);
        return sb.toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ap;
        if (listView != null) {
            bundle.putInt("list_position", listView.getFirstVisiblePosition());
        }
    }

    public final void h() {
        super.h();
        this.bb.c();
        this.aH.c();
    }
}
