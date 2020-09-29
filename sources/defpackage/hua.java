package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.ConnectDevice;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.spotlets.ads.flags.SkippableAdsABFlag;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.squareup.picasso.Picasso;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import java.util.Map;

/* renamed from: hua reason: default package */
public final class hua extends huf {
    final ConnectManager a;
    final tch b;
    ThumbState c = ThumbState.NONE;
    final b d = new b(this, 0);
    private final ugj n;
    private Disposable o;

    /* renamed from: hua$a */
    static class a {
        public static boolean a(PlayerState playerState) {
            PlayerTrack track = playerState.track();
            if (track != null) {
                String str = "is_advertisement";
                if (track.metadata().containsKey(str) && Boolean.valueOf((String) track.metadata().get(str)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: hua$b */
    class b implements Runnable {
        ForceInCollection a;
        Player b;

        private b() {
            this.a = ForceInCollection.NO;
        }

        /* synthetic */ b(hua hua, byte b2) {
            this();
        }

        public final void run() {
            String str;
            Optional optional;
            boolean z;
            boolean z2;
            CharSequence charSequence;
            rgz rgz = new rgz();
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            ForceInCollection forceInCollection = this.a;
            fpt fpt = hua.this.h;
            ThumbState thumbState = hua.this.c;
            Context context = hua.this.e;
            if (hua.this.a.p() == ConnectState.ACTIVE) {
                str = hua.a(hua.this);
            } else {
                str = null;
            }
            tch tch = hua.this.b;
            new twu();
            kxg kxg = new kxg();
            if (lastPlayerState == null) {
                optional = Optional.e();
            } else {
                PlayerTrack track = lastPlayerState.track();
                if (track == null) {
                    optional = Optional.e();
                } else {
                    Map metadata = track.metadata();
                    String str2 = (String) metadata.get("title");
                    if (fax.a(str2)) {
                        optional = Optional.e();
                    } else {
                        if (a.a(lastPlayerState)) {
                            z = (fpt == null || fpt.a(hwb.d) == SkippableAdsABFlag.CONTROL) ? false : Boolean.valueOf(jvs.a(lastPlayerState, "ad.is_skippable")).booleanValue();
                        } else {
                            z = true;
                        }
                        Map contextMetadata = lastPlayerState.contextMetadata();
                        boolean isPaused = lastPlayerState.isPaused();
                        boolean z3 = lastPlayerState.restrictions().disallowSkippingPrevReasons().isEmpty() || lastPlayerState.restrictions().disallowSeekingReasons().isEmpty();
                        boolean z4 = lastPlayerState.restrictions().disallowSkippingNextReasons().isEmpty() && z;
                        boolean h = uhq.h(lastPlayerState.entityUri());
                        boolean j = uhq.j(lastPlayerState.entityUri());
                        boolean parseBoolean = Boolean.parseBoolean((String) metadata.get("collection.can_ban"));
                        boolean parseBoolean2 = Boolean.parseBoolean((String) metadata.get("collection.can_add"));
                        boolean parseBoolean3 = Boolean.parseBoolean((String) metadata.get("collection.is_banned"));
                        boolean parseBoolean4 = Boolean.parseBoolean((String) metadata.get("collection.in_collection"));
                        ThumbState thumbState2 = thumbState;
                        Map map = metadata;
                        boolean equals = "video".equals(metadata.get("media.type"));
                        boolean a2 = a.a(lastPlayerState);
                        boolean isQueued = PlayerQueueUtil.isQueued(track);
                        String entityUri = lastPlayerState.entityUri();
                        Resources resources = context.getResources();
                        if (str != null) {
                            z2 = equals;
                            charSequence = jrw.a(resources.getString(R.string.connect_bar_listening_on, new Object[]{str}));
                        } else {
                            z2 = equals;
                            if (tch != null) {
                                charSequence = tch.a(lastPlayerState).b(resources);
                            } else {
                                charSequence = (CharSequence) lastPlayerState.contextMetadata().get("context_description");
                            }
                        }
                        CharSequence charSequence2 = charSequence;
                        String uri = track.uri();
                        String artists = PlayerTrackUtil.getArtists(track);
                        Uri a3 = ivs.a(track);
                        PlayOrigin playOrigin = lastPlayerState.playOrigin();
                        boolean z5 = forceInCollection == ForceInCollection.YES;
                        boolean z6 = str == null;
                        boolean a4 = rgz.a(fpt);
                        boolean a5 = kxg.a(fpt);
                        hui hui = r11;
                        hui hui2 = new hui(uri, str2, artists, z5, map, new hub(parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4));
                        huc huc = new huc(entityUri, charSequence2, contextMetadata, hui, a3, playOrigin, isPaused, h, j, z2, z3, z4, thumbState2, a2, false, z, isQueued, z6, a4, a5);
                        optional = Optional.b(huc);
                    }
                }
            }
            if (optional.b()) {
                hua.this.i.obtainMessage(10, optional.c()).sendToTarget();
            }
        }
    }

    public hua(Context context, vjs vjs, hug hug, Handler handler, fpt fpt, rur rur, ConnectManager connectManager, tjv tjv, Picasso picasso, ugk ugk) {
        super(context, vjs, hug, handler, fpt, rur, tjv, picasso);
        this.a = (ConnectManager) fay.a(connectManager);
        Context context2 = context;
        this.n = ugk.a(context, new com.spotify.music.spotlets.radio.service.RadioStateObserver.a() {
            public final void a(ugu ugu) {
                hua.this.c = (ThumbState) fay.a(ugu.b());
                hua.this.g.post(hua.this.d);
            }
        }, getClass().getSimpleName());
        this.b = new tch();
    }

    public final void a(ForceInCollection forceInCollection, Player player) {
        b bVar = this.d;
        bVar.a = forceInCollection;
        bVar.b = player;
        this.n.a();
        this.g.post(this.d);
    }

    public final void a() {
        super.a();
        Disposable disposable = this.o;
        if (disposable != null) {
            disposable.bf_();
        }
        this.n.b();
    }

    static /* synthetic */ String a(hua hua) {
        ConnectDevice q = hua.a.q();
        if (q != null) {
            return q.b;
        }
        Disposable disposable = hua.o;
        if (disposable == null || disposable.b()) {
            String format = String.format(Locale.getDefault(), "deprecatedValues:{state:%s, activeDevice:%s}", new Object[]{hua.a.p(), hua.a.q()});
            hua.o = Single.a((SingleSource<? extends T1>) Single.b(format), (SingleSource<? extends T2>) Single.a((SingleSource<? extends T1>) hua.a.f().a(0).f($$Lambda$NabzgBHkkbX1vyfaELbQGx2eShw.INSTANCE).g($$Lambda$hua$S5EEonImWOR0y1nqlDngVYkEaCA.INSTANCE), (SingleSource<? extends T2>) hua.a.g().a(0).f($$Lambda$zcMEr5DFbJOxdnFpvootP71KX4.INSTANCE).g($$Lambda$hua$7uwrbeq2wJFTBjHuadxCb73vtRo.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hua$xrCjndaXa0X1Aqgv249sc4BI9fE.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hua$DJIHH_w6sDwG06kCgODVKgNBKPo.INSTANCE).a((Consumer<? super T>) $$Lambda$hua$dpj6_SMXwvx2JKrNuc5eOlB7o5g.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hua$A8lQt5BGL2DIzJ2INzc0Oy9TwRk.INSTANCE);
        }
        return null;
    }
}
