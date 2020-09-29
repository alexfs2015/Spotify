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

/* renamed from: hwm reason: default package */
public final class hwm extends hwr {
    final ConnectManager a;
    final tmo b;
    ThumbState c = ThumbState.NONE;
    final b d = new b(this, 0);
    private final urx n;
    private Disposable o;

    /* renamed from: hwm$a */
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

    /* renamed from: hwm$b */
    class b implements Runnable {
        ForceInCollection a;
        Player b;

        private b() {
            this.a = ForceInCollection.NO;
        }

        /* synthetic */ b(hwm hwm, byte b2) {
            this();
        }

        public final void run() {
            Optional optional;
            boolean z;
            boolean z2;
            CharSequence charSequence;
            rqb rqb = new rqb();
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            ForceInCollection forceInCollection = this.a;
            fqn fqn = hwm.this.h;
            ThumbState thumbState = hwm.this.c;
            Context context = hwm.this.e;
            String a2 = hwm.this.a.p() == ConnectState.ACTIVE ? hwm.a(hwm.this) : null;
            tmo tmo = hwm.this.b;
            new uix();
            lap lap = new lap();
            if (lastPlayerState == null) {
                optional = Optional.e();
            } else {
                PlayerTrack track = lastPlayerState.track();
                if (track == null) {
                    optional = Optional.e();
                } else {
                    Map metadata = track.metadata();
                    String str = (String) metadata.get("title");
                    if (fbo.a(str)) {
                        optional = Optional.e();
                    } else {
                        if (a.a(lastPlayerState)) {
                            z = (fqn == null || fqn.a(hyn.d) == SkippableAdsABFlag.CONTROL) ? false : Boolean.valueOf(jya.a(lastPlayerState, "ad.is_skippable")).booleanValue();
                        } else {
                            z = true;
                        }
                        Map contextMetadata = lastPlayerState.contextMetadata();
                        boolean isPaused = lastPlayerState.isPaused();
                        boolean z3 = lastPlayerState.restrictions().disallowSkippingPrevReasons().isEmpty() || lastPlayerState.restrictions().disallowSeekingReasons().isEmpty();
                        boolean z4 = lastPlayerState.restrictions().disallowSkippingNextReasons().isEmpty() && z;
                        boolean g = ute.g(lastPlayerState.entityUri());
                        boolean i = ute.i(lastPlayerState.entityUri());
                        boolean parseBoolean = Boolean.parseBoolean((String) metadata.get("collection.can_ban"));
                        boolean parseBoolean2 = Boolean.parseBoolean((String) metadata.get("collection.can_add"));
                        boolean parseBoolean3 = Boolean.parseBoolean((String) metadata.get("collection.is_banned"));
                        boolean parseBoolean4 = Boolean.parseBoolean((String) metadata.get("collection.in_collection"));
                        ThumbState thumbState2 = thumbState;
                        Map map = metadata;
                        boolean equals = "video".equals(metadata.get("media.type"));
                        boolean a3 = a.a(lastPlayerState);
                        boolean isQueued = PlayerQueueUtil.isQueued(track);
                        String entityUri = lastPlayerState.entityUri();
                        Resources resources = context.getResources();
                        if (a2 != null) {
                            z2 = equals;
                            charSequence = jug.a(resources.getString(R.string.connect_bar_listening_on, new Object[]{a2}));
                        } else {
                            z2 = equals;
                            charSequence = tmo != null ? tmo.a(lastPlayerState).b(resources) : (CharSequence) lastPlayerState.contextMetadata().get("context_description");
                        }
                        CharSequence charSequence2 = charSequence;
                        String uri = track.uri();
                        String artists = PlayerTrackUtil.getArtists(track);
                        Uri a4 = iyd.a(track);
                        PlayOrigin playOrigin = lastPlayerState.playOrigin();
                        boolean z5 = forceInCollection == ForceInCollection.YES;
                        boolean z6 = a2 == null;
                        boolean a5 = rqb.a(fqn);
                        boolean a6 = lap.a(fqn);
                        hwu hwu = r11;
                        hwu hwu2 = new hwu(uri, str, artists, z5, map, new hwn(parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4));
                        hwo hwo = new hwo(entityUri, charSequence2, contextMetadata, hwu, a4, playOrigin, isPaused, g, i, z2, z3, z4, thumbState2, a3, false, z, isQueued, z6, a5, a6);
                        optional = Optional.b(hwo);
                    }
                }
            }
            if (optional.b()) {
                hwm.this.i.obtainMessage(10, optional.c()).sendToTarget();
            }
        }
    }

    public hwm(Context context, vwy vwy, hws hws, Handler handler, fqn fqn, seb seb, ConnectManager connectManager, tvn tvn, Picasso picasso, ury ury) {
        super(context, vwy, hws, handler, fqn, seb, tvn, picasso);
        this.a = (ConnectManager) fbp.a(connectManager);
        Context context2 = context;
        this.n = ury.a(context, new com.spotify.music.spotlets.radio.service.RadioStateObserver.a() {
            public final void a(usi usi) {
                hwm.this.c = (ThumbState) fbp.a(usi.b());
                hwm.this.g.post(hwm.this.d);
            }
        }, getClass().getSimpleName());
        this.b = new tmo();
    }

    static /* synthetic */ String a(hwm hwm) {
        ConnectDevice q = hwm.a.q();
        if (q != null) {
            return q.b;
        }
        Disposable disposable = hwm.o;
        if (disposable == null || disposable.b()) {
            String format = String.format(Locale.getDefault(), "deprecatedValues:{state:%s, activeDevice:%s}", new Object[]{hwm.a.p(), hwm.a.q()});
            hwm.o = Single.a((SingleSource<? extends T1>) Single.b(format), (SingleSource<? extends T2>) Single.a((SingleSource<? extends T1>) hwm.a.f().a(0).f($$Lambda$NabzgBHkkbX1vyfaELbQGx2eShw.INSTANCE).g($$Lambda$hwm$kG5yHZeyOPW6Um34mnMCJ6eWNag.INSTANCE), (SingleSource<? extends T2>) hwm.a.g().a(0).f($$Lambda$zcMEr5DFbJOxdnFpvootP71KX4.INSTANCE).g($$Lambda$hwm$Hrs7qW4VcIS6g_PqhVhq3RMVvcE.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hwm$Rfwi8unAd2iWbAWiFBlOJ8wrNLw.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hwm$WNopQ00ap5HiAblfKXgdq8lUPIs.INSTANCE).a((Consumer<? super T>) $$Lambda$hwm$jEawZD_hg6NnDcEXDEX3ibR4icQ.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hwm$p2m193C0DDpH4hIUQfyzOySiKFQ.INSTANCE);
        }
        return null;
    }

    public final void a() {
        super.a();
        Disposable disposable = this.o;
        if (disposable != null) {
            disposable.bd_();
        }
        this.n.b();
    }

    public final void a(ForceInCollection forceInCollection, Player player) {
        b bVar = this.d;
        bVar.a = forceInCollection;
        bVar.b = player;
        this.n.a();
        this.g.post(this.d);
    }
}
