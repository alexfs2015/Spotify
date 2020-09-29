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

/* renamed from: mig reason: default package */
public class mig extends jrd implements d, fzq, jqx, uqq, vaz {
    public utg T;
    public ToolbarMenuHelper U;
    public lbi V;
    public RxResolver W;
    public Scheduler X;
    public Scheduler Y;
    public PlayOrigin Z;
    public CollectionLogger a;
    /* access modifiers changed from: private */
    public jsm aA;
    private AlbumsWithTracksAdapter aB;
    private fvd aC;
    private DownloadHeaderView aD;
    private gmu aE;
    /* access modifiers changed from: private */
    public View aF;
    private LoadingView aG;
    private View aH;
    /* access modifiers changed from: private */
    public fyk<fys> aI;
    /* access modifiers changed from: private */
    public int aJ;
    /* access modifiers changed from: private */
    public jts aK;
    /* access modifiers changed from: private */
    public Handler aL;
    private ToggleButton aM;
    /* access modifiers changed from: private */
    public boolean aN;
    /* access modifiers changed from: private */
    public boolean aO;
    /* access modifiers changed from: private */
    public com.spotify.music.follow.FollowManager.a aP;
    private RxFollowersCountResolver aQ;
    private Disposable aR;
    private vli aS = new f();
    private final CompositeDisposable aT = new CompositeDisposable();
    private int aU;
    private int aV;
    /* access modifiers changed from: private */
    public boolean aW;
    /* access modifiers changed from: private */
    public sso aX;
    private ViewLoadingTracker aY;
    /* access modifiers changed from: private */
    public fqn aZ;
    public iqu aa;
    public lon ab;
    public jwo ac;
    public Flowable<PlayerState> ad;
    public szp ae;
    public izh af;
    public fzt ag;
    public jpc ah;
    public jos ai;
    public lbr aj;
    public FollowManager ak;
    public jyx al;
    public mij am;
    public mik an;
    public ObjectMapper ao;
    public defpackage.gmu.a ap;
    public heg aq;
    /* access modifiers changed from: private */
    public ListView ar;
    private String as;
    /* access modifiers changed from: private */
    public String at;
    /* access modifiers changed from: private */
    public String au;
    private String av;
    private boolean aw;
    private boolean ax;
    /* access modifiers changed from: private */
    public boolean ay;
    private boolean az;
    public sgb b;
    /* access modifiers changed from: private */
    public iqt ba;
    private final jor<vlf> bb = new jor<vlf>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            vlf vlf = (vlf) obj;
            return mig.this.ah.a(vlf.getUri(), vlf.getName(), mig.this.au).a(mig.this.aX).a(mig.this.ay).b(mig.this.ay).c(true).d(false).a(uqo.v).a();
        }
    };
    private final jor<com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a> bc = new jor<com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a aVar = (com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a) obj;
            return mig.this.ai.a(aVar.b(), aVar.a()).a(mig.this.aX).a(mig.this.ay).b(true).c(true).a(uqo.v).a();
        }
    };
    private final OnItemClickListener bd = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - mig.this.ar.getHeaderViewsCount();
            if (headerViewsCount >= 0) {
                int a2 = mig.this.aA.a(headerViewsCount);
                if (a2 == 0) {
                    Object tag = view.getTag();
                    if (tag instanceof com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a) {
                        com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a aVar = (com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a) tag;
                        String b = aVar.b();
                        String str = b;
                        mig.this.a.a(str, "album", (int) j, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
                        mig.this.ae.a(szk.a(b).b(aVar.a()).a());
                        return;
                    }
                    if (tag instanceof vlf) {
                        vlf vlf = (vlf) tag;
                        if (!jus.c(mig.this.aZ)) {
                            mig.this.a.a(vlf.getUri(), "inert-track", (int) j, InteractionType.HIT, UserIntent.PLAY);
                            if (mig.this.aF instanceof ShufflePlayHeaderView) {
                                ((ShufflePlayHeaderView) mig.this.aF).a();
                            } else if (mig.this.aF != null) {
                                ShufflePlayHeaderView.a(mig.this.aK, mig.this.aF);
                            }
                        } else if (!mig.this.aW || !vlf.isExplicit()) {
                            mig.this.a.a(vlf.getUri(), TrackData.TYPE_TRACK, (int) j, InteractionType.HIT, UserIntent.PLAY);
                            Builder builder = new Builder();
                            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, vlf.getUri(), 0);
                            mig.this.ba.a(builder.skipTo(playOptionsSkipTo).build(), mig.this.Z, Collections.emptyMap());
                        } else {
                            mig.this.ab.a(vlf.getUri(), mig.this.aX.toString());
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
    private final com.spotify.mobile.android.ui.view.DownloadHeaderView.a be = new com.spotify.mobile.android.ui.view.DownloadHeaderView.a() {
        public final void a() {
            mig.this.ae.a("spotify:internal:preferences");
        }

        public final void a(boolean z) {
            mig.this.ba.a(z);
            OffliningLogger.a(mig.this.aX, mig.this.at, SourceElement.HEADER_TOGGLE, z);
        }
    };
    private final OnClickListener bf = new OnClickListener() {
        public final void onClick(View view) {
            mig.this.a.a((String) null, "shuffle-play-button", -1, InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
            mig.this.ai();
        }
    };
    private final Consumer<Count> bg = new $$Lambda$mig$3XZpNdi3YGe2UqiLeOyCOHlriQ(this);
    private final Consumer<Throwable> bh = new $$Lambda$mig$y8mYCVAWVaVtx07NWlSa97UwmyA(this);
    /* access modifiers changed from: private */
    public final Runnable bi = new Runnable() {
        public final void run() {
            mig.this.al();
        }
    };
    private final b bj = new b() {
        public final void a(com.spotify.music.follow.FollowManager.a aVar) {
            mig.this.aP = aVar;
            mig mig = mig.this;
            mig.aN = mig.aP.d;
            mig mig2 = mig.this;
            mig2.aO = mig2.aP.e;
            mig.this.aL.post(mig.this.bi);
        }
    };

    /* renamed from: mig$a */
    public static abstract class a {

        /* renamed from: mig$a$a reason: collision with other inner class name */
        public interface C0056a {
            C0056a a(irg irg);

            C0056a a(boolean z);

            a a();
        }

        public abstract irg a();

        public abstract boolean b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        iqt a2 = this.aa.a(this.au);
        a2.g = !bool.booleanValue();
        return Observable.a((ObservableSource<? extends T1>) a2.a((Policy) null), (ObservableSource<? extends T2>) this.V.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$mig$EZ6k1ZXzifKLYzV9LD2GEiCLFZQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a a(final irg irg, Boolean bool, final irg irg2) {
        return new a().a((irg) new irg() {
            public final vku getHeader() {
                return irg.getHeader();
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return (vlf[]) irg2.getItems();
            }

            public final int getUnfilteredLength() {
                return irg2.getUnfilteredLength();
            }

            public final int getUnrangedLength() {
                return irg2.getUnrangedLength();
            }

            public final boolean isLoading() {
                return irg.isLoading() || irg2.isLoading();
            }
        }).a(bool.booleanValue()).a();
    }

    public static mig a(String str, String str2, String str3, fqn fqn) {
        sso a2 = ViewUris.bh.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_collection_uri", a2);
        bundle.putString("title", str2);
        bundle.putString("username", str3);
        mig mig = new mig();
        mig.g(bundle);
        fqo.a((Fragment) mig, fqn);
        return mig;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (jva.a(playerState.contextUri()).b != LinkType.COLLECTION_ARTIST || track == null) {
            this.aB.a(null);
        } else {
            this.aB.a(track.uri());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Count count) {
        this.aP = this.ak.a(this.at);
        com.spotify.music.follow.FollowManager.a aVar = this.aP;
        if (aVar == null) {
            com.spotify.music.follow.FollowManager.a aVar2 = new com.spotify.music.follow.FollowManager.a(this.at, count.getFollowersCount(), count.getFollowingCount(), this.aN, this.aO);
            this.aP = aVar2;
        } else {
            aVar.c = count.getFollowersCount();
            this.aP.b = count.getFollowingCount();
        }
        this.ak.a(this.aP);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Failed to get followed count for %s", this.at);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        vku header = aVar.a().getHeader();
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.aB;
        List asList = Arrays.asList(aVar.a().getItems());
        albumsWithTracksAdapter.a.clear();
        albumsWithTracksAdapter.b.clear();
        albumsWithTracksAdapter.c.clear();
        Object obj = null;
        int i = -1;
        for (int i2 = 0; i2 < asList.size(); i2++) {
            vlf vlf = (vlf) asList.get(i2);
            LinkType linkType = jva.a(vlf.getUri()).b;
            if (!(linkType == LinkType.ALBUM || linkType == LinkType.COLLECTION_ALBUM)) {
                if (i == -1) {
                    i = i2;
                }
                vkt album = vlf.getAlbum();
                String uri = album != null ? album.getUri() : "";
                boolean z = !fbn.a(obj, uri);
                if (i2 > i && z) {
                    albumsWithTracksAdapter.a.add(albumsWithTracksAdapter.a.get(albumsWithTracksAdapter.a.size() - 1));
                    albumsWithTracksAdapter.b.add(Type.PLACEHOLDER);
                }
                if (z) {
                    albumsWithTracksAdapter.a.add(new com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter.a(vlf));
                    albumsWithTracksAdapter.b.add(Type.ALBUM);
                }
                albumsWithTracksAdapter.a.add(vlf);
                albumsWithTracksAdapter.b.add(Type.TRACK);
                albumsWithTracksAdapter.c.add(vlf);
                obj = uri;
            }
        }
        albumsWithTracksAdapter.notifyDataSetChanged();
        this.as = header.getName();
        this.at = header.getUri();
        this.av = header.getImageUri(Size.NORMAL);
        if (this.aI != null) {
            Uri parse = !TextUtils.isEmpty(this.av) ? Uri.parse(this.av) : Uri.EMPTY;
            this.al.a(this.aI.d(), parse);
            ImageView imageView = (ImageView) fbp.a(this.aI.c());
            jyx jyx = this.al;
            jyx.a(imageView, parse, gaa.a(jyx.a), vgq.a(), this.aI.g());
            imageView.setScaleType(ScaleType.CENTER_CROP);
        }
        this.aS = header.getOfflineState();
        this.aU = header.getNumAlbumsInCollection();
        this.aV = header.getNumTracksInCollection();
        ak();
        this.aw = aVar.b();
        this.i.putString("title", this.as);
        fyk<fys> fyk = this.aI;
        if (fyk == null) {
            this.aj.a(this, this.as);
        } else {
            ((fys) fyk.a()).a(this.as);
        }
        this.aP = this.ak.a(this.at);
        com.spotify.music.follow.FollowManager.a aVar2 = this.aP;
        if (aVar2 != null) {
            this.aN = aVar2.d;
            this.aO = this.aP.e;
        } else {
            this.aN = header.isFollowed();
            this.aO = header.isDismissed();
            Disposable disposable = this.aR;
            if (disposable != null) {
                disposable.bd_();
            }
            this.aR = this.aQ.a(this.at).a(this.X).a(this.bg, this.bh);
        }
        this.ak.a(this.at, this.bj);
        al();
        this.ax = true;
        this.aj.ao_();
        AlbumsWithTracksAdapter albumsWithTracksAdapter2 = this.aB;
        this.aD.a(albumsWithTracksAdapter2 != null && albumsWithTracksAdapter2.getCount() > 0 ? this.aS : new f());
        if (this.aG.d()) {
            this.aG.b();
            if (this.aI != null) {
                this.aL.post(new Runnable() {
                    public final void run() {
                        if (!jus.c(mig.this.aZ)) {
                            mig.this.aI.b(false);
                        } else {
                            mig.this.aI.a(false);
                        }
                    }
                });
            }
        }
        boolean z2 = this.aB.getCount() > 0;
        if (!z2) {
            this.aA.c(1);
            View view = this.aF;
            if (view != null) {
                view.setEnabled(false);
            }
            if (this.aI != null) {
                this.aL.post(new Runnable() {
                    public final void run() {
                        mig.this.aI.b(true);
                    }
                });
            }
        } else {
            this.aA.a(1);
            View view2 = this.aF;
            if (view2 != null) {
                view2.setEnabled(true);
            }
        }
        if (!this.aG.d()) {
            this.aH.setVisibility(0);
        }
        if (this.aJ > 0 && z2) {
            this.ar.post(new Runnable() {
                public final void run() {
                    mig.this.ar.setSelectionFromTop(mig.this.aJ, 0);
                    mig.this.aJ = 0;
                }
            });
        }
        this.aA.c(0);
        this.aj.ao_();
        this.aM.setVisibility(0);
        this.az = true;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.ay = z;
        al();
        if (z && this.at != null) {
            Disposable disposable = this.aR;
            if (disposable != null) {
                disposable.bd_();
            }
            this.aR = this.aQ.a(this.at).a(this.X).a(this.bg, this.bh);
        }
        this.aj.ao_();
    }

    private ToggleButton ah() {
        this.aM = (ToggleButton) LayoutInflater.from(p()).inflate(R.layout.header_toggle_button, null);
        this.aM.setOnClickListener(new $$Lambda$mig$M9TkCyiwjy0oW96nLpnOMyznU(this));
        return this.aM;
    }

    /* access modifiers changed from: private */
    public void ai() {
        this.ba.a(new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), this.Z, Collections.emptyMap());
    }

    private void ak() {
        String str;
        if (this.aN || !this.ay) {
            str = p().getString(R.string.placeholder_collection_empty_artist_only_body, new Object[]{this.as});
        } else {
            str = p().getString(mii.a(this.aZ, R.string.placeholder_collection_empty_artist_only_not_following_body), new Object[]{this.as});
        }
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.aB;
        if (albumsWithTracksAdapter != null && this.aV > albumsWithTracksAdapter.getCount()) {
            str = p().getString(R.string.placeholder_collection_empty_artist_only_no_available_songs_body, new Object[]{this.as});
        }
        this.aC.b((CharSequence) str);
    }

    /* access modifiers changed from: private */
    public void al() {
        ak();
        if (this.aI != null) {
            boolean a2 = jtu.a(this.as);
            this.aM.setText(this.aN ? R.string.artist_header_following : R.string.artist_header_follow);
            this.aM.setChecked(this.aN);
            this.aM.setEnabled(this.ay && this.aP != null);
            if (!a2) {
                com.spotify.music.follow.FollowManager.a aVar = this.aP;
                if (aVar != null) {
                    int i = aVar.c;
                    ((fys) this.aI.a()).a().setVisibility(0);
                    ((fys) this.aI.a()).b(o().getResources().getQuantityString(R.plurals.artist_header_followers_count, i, new Object[]{Integer.valueOf(i)}));
                    this.aI.e().a.requestLayout();
                }
            }
            ((fys) this.aI.a()).a().setVisibility(8);
            this.aI.e().a.requestLayout();
        }
        this.aj.ao_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void am() {
        this.ba.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void an() {
        this.ba.a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        iqt a2 = this.aa.a(this.au);
        a2.g = !bool.booleanValue();
        iqt a3 = this.aa.a(this.au);
        a3.g = !bool.booleanValue();
        return Observable.a((ObservableSource<? extends T1>) a2.a((Policy) null), (ObservableSource<? extends T2>) this.V.a(), (ObservableSource<? extends T3>) a3.b((Policy) null), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$mig$jfd5Eft9TnQ1S81SM_wY6jNGe9Y<Object,Object,Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a(null, "toolbar-menu", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
        ai();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        boolean z = this.aN;
        if (this.ay) {
            this.a.a(this.at, "follow-button", -1, InteractionType.HIT, z ? UserIntent.UNFOLLOW : UserIntent.FOLLOW, z ? InteractionAction.UNFOLLOW : InteractionAction.FOLLOW);
            this.ak.a(this.at, !this.aN);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Boolean bool) {
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.aB;
        albumsWithTracksAdapter.d = bool.booleanValue();
        if (albumsWithTracksAdapter.getCount() > 0) {
            albumsWithTracksAdapter.notifyDataSetChanged();
        }
        this.aW = bool.booleanValue();
    }

    public final void B() {
        super.B();
        this.aL.removeCallbacks(this.bi);
        String str = this.at;
        if (str != null) {
            this.ak.b(str, this.bj);
        }
        Disposable disposable = this.aR;
        if (disposable != null) {
            disposable.bd_();
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aZ = fqo.a((Fragment) this);
        kf p = p();
        if (jvi.b(p)) {
            this.aI = fyk.b((Context) p).b().b(ah(), 0).a((Fragment) this);
        } else {
            if (this.aq.a()) {
                this.aE = this.ap.a((Context) p);
                this.aE.a(!this.aq.b());
                this.aF = this.aE.a();
            } else {
                this.aF = jso.a(p, null);
            }
            this.aF.setOnClickListener(this.bf);
            c a2 = fyk.a((Context) p);
            a2.b.b = 1;
            this.aI = new b(a2.a, a2.b).b(ah(), 0).a(true).b(this.aF).a((Fragment) this);
        }
        this.aI.a(vgl.b(p, R.attr.pasteColorSubHeaderBackground));
        ((fys) this.aI.a()).a(this.as);
        this.aH = this.aI.b();
        this.ar = this.aI.e().a;
        this.ar.setOnItemClickListener(this.bd);
        FrameLayout frameLayout = new FrameLayout(p());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.aH);
        this.aY = this.b.a(frameLayout, this.aX.toString(), bundle, af());
        this.ar.setFastScrollEnabled(true);
        this.aG = LoadingView.a(layoutInflater, p(), this.aH);
        frameLayout.addView(this.aG);
        this.aM.setVisibility(4);
        mik mik = this.an;
        AlbumsWithTracksAdapter albumsWithTracksAdapter = new AlbumsWithTracksAdapter(jus.c(this.aZ), (jor) mik.a(this.bb, 2), (jor) mik.a(this.bc, 3), (Context) mik.a(mik.a.get(), 4), (sso) mik.a(mik.b.get(), 5), (jyx) mik.a(mik.c.get(), 6));
        this.aB = albumsWithTracksAdapter;
        kf p2 = p();
        fqv.f();
        fvd a3 = fvg.a(p2, null);
        a3.a(false);
        TextView b2 = a3.b();
        TextView c = a3.c();
        b2.setSingleLine(false);
        b2.setEllipsize(null);
        c.setSingleLine(false);
        c.setEllipsize(null);
        a3.b().setVisibility(8);
        a3.b((CharSequence) p2.getString(R.string.placeholder_collection_empty_artist_only_body));
        this.aC = a3;
        this.aC.b((CharSequence) p().getString(R.string.placeholder_collection_empty_artist_only_body, new Object[]{this.as}));
        this.aA = new jsm(p());
        this.aA.a((ListAdapter) this.aB, p().getString(mii.a(this.aZ, R.string.collection_artist_section_my_albums)), 0);
        this.aA.a((ListAdapter) new joh(this.aC.getView(), false), (String) null, 1);
        this.aA.a(1, 0);
        this.aD = DownloadHeaderView.a((Context) p(), (ViewGroup) null);
        DownloadHeaderView downloadHeaderView = this.aD;
        downloadHeaderView.b = this.be;
        this.ar.addHeaderView(downloadHeaderView, null, false);
        this.ar.setAdapter(this.aA);
        this.ar.setOnItemLongClickListener(new jop(p(), this.aX));
        return frameLayout;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.aB;
        boolean z = albumsWithTracksAdapter != null && albumsWithTracksAdapter.getCount() > 0;
        if (u() && this.at != null) {
            fyk<fys> fyk = this.aI;
            if (fyk != null) {
                fyk.a(fzn, p());
            }
            fzn.a(utg.a(this.av, this.at, true), SpotifyIconV2.ARTIST, false, true);
            fzn.b(this.as);
            if (jvi.b(p()) && z) {
                this.aF = ToolbarMenuHelper.a(fzn, (OnClickListener) new $$Lambda$mig$WA5HIknSW_5gLcfNBFUYBnsFLQ(this));
            }
            if (z) {
                this.U.a(fzn, this.aX, this.aS, (Runnable) new $$Lambda$mig$ClYITCzO0lO3ByJDYYm1OaMFNsk(this), (Runnable) new $$Lambda$mig$VqemehW_ebnc3Kzg63SEt3I8sHE(this));
            }
            if (this.ay && this.at != null && !jtu.a(this.as) && this.aP != null) {
                this.ag.a(fzn, this.aX, this.at, this.aN);
            }
            if (this.at != null && !jtu.a(this.as) && this.ax) {
                this.am.a(fzn, this.at);
            }
            ToolbarMenuHelper.a(fzn, b((Context) p()), "", !TextUtils.isEmpty(this.av) ? Uri.parse(this.av) : Uri.EMPTY, this.at, this.af);
            if (this.aw) {
                this.U.a(fzn, ae_(), this.at, this.as, this.aZ, this.ae, n());
            }
        }
    }

    public final void aP_() {
        super.aP_();
        this.aH.setVisibility(4);
        this.aG.a();
        this.aT.a(this.V.a().a(this.X).a((Consumer<? super T>) new $$Lambda$mig$tG4K3Sgl7_yzlhl2D0FbujiQwg<Object>(this), (Consumer<? super Throwable>) $$Lambda$mig$RSI0soAVplqG62J44F4qMRowWTA.INSTANCE));
        this.aT.a(wit.b(this.ab.a()).a(this.X).a((Consumer<? super T>) new $$Lambda$mig$W4NoF4l2I_AWM3_xaSUTfD9F5Z0<Object>(this), (Consumer<? super Throwable>) $$Lambda$mig$xFdoHwpuL6D3VzGzUrOfIcWgyqw.INSTANCE));
        if (jus.b(this.aZ)) {
            this.aT.a(this.ac.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$mig$ysYYAeI7DnJqCg08tLOUvsM_blM(this)).a(this.X).a((Consumer<? super T>) new $$Lambda$mig$IO_A6cFyAY5peGHty6rsPopFTQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$mig$lYcPesPQrBGxZRAK5i_ux4aWSwE.INSTANCE));
        } else {
            this.aT.a(this.ac.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$mig$Ntvw9k8x39enn9Pdc9gYxnjojKU(this)).a(this.X).a((Consumer<? super T>) new $$Lambda$mig$IO_A6cFyAY5peGHty6rsPopFTQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$mig$kf0K7fnrelOUfdAD6attVhGYsQM.INSTANCE));
        }
        this.aT.a(this.ad.a(this.X).a((Consumer<? super T>) new $$Lambda$mig$nOoNmDPbyyfWVyWTSM2EjcnbBo<Object>(this), (Consumer<? super Throwable>) $$Lambda$mig$ZelMA9d0jVW631vWYt8qw480F8.INSTANCE));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return (sso) fbp.a(this.i.getParcelable("artist_collection_uri"));
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION_ARTISTS_ARTIST, ae_().toString());
    }

    public final uqm ag() {
        return uqo.v;
    }

    public final gkq aj() {
        return PageIdentifiers.COLLECTION_ARTISTS_ARTIST;
    }

    public final Uri at_() {
        return Uri.parse(this.au);
    }

    public final void aw_() {
        super.aw_();
        this.aY.e();
    }

    public final String b(Context context) {
        String str = this.as;
        return str == null ? context.getString(R.string.collection_artist_default_title) : str;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aX = ae_();
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            String str = "list_position";
            if (bundle.containsKey(str)) {
                this.aJ = bundle.getInt(str, 0);
            }
        }
        Bundle bundle2 = this.i;
        this.au = this.aX.toString();
        this.as = bundle2.getString("title");
        this.ba = this.aa.a(this.au);
        this.aZ = fqo.a((Fragment) this);
        c(true);
        this.aK = new jts();
        this.aL = new Handler();
        this.aQ = new RxFollowersCountResolver(this.W, this.ao, this.Y);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("collection:artist:");
        sb.append(this.au);
        return sb.toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ar;
        if (listView != null) {
            bundle.putInt("list_position", listView.getFirstVisiblePosition());
        }
        this.aY.a(bundle);
    }

    public final void h() {
        super.h();
        this.aT.c();
        this.aG.c();
    }
}
