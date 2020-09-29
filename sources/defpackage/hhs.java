package defpackage;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.MainActivity;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: hhs reason: default package */
public final class hhs implements a {
    final Context a;
    final vjs b;
    public Optional<huf> c;
    public boolean d;
    private final PlayerFactory e;
    private final huk f;
    private ForceInCollection g = ForceInCollection.NO;
    private c h;
    private Player i;
    private String j;
    private boolean k;
    private final PlayerStateObserver l = new $$Lambda$hhs$GrIxoV28x1sdLa1uI3mXMQMVd98(this);

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerState playerState) {
        a(this.g);
        if (playerState.track() != null) {
            a(playerState);
            tcr.a(playerState.future());
        }
    }

    private void a(PlayerState playerState) {
        if (playerState != null) {
            PlayerTrack track = playerState.track();
            if (track != null) {
                String uri = track.uri();
                boolean isAd = PlayerTrackUtil.isAd(track);
                boolean z = jst.a(uri).b == LinkType.SHOW_EPISODE;
                boolean z2 = !faw.a(this.j, uri);
                if (z2) {
                    this.g = ForceInCollection.NO;
                }
                if (!isAd && !z && z2) {
                    this.g = Boolean.parseBoolean((String) track.metadata().get("collection.in_collection")) ? ForceInCollection.YES : ForceInCollection.NO;
                    a(this.g);
                }
                this.j = uri;
            }
        }
    }

    public final void a(ForceInCollection forceInCollection) {
        Optional<huf> optional = this.c;
        if (optional.b() && (optional.c() instanceof hua)) {
            this.g = forceInCollection;
            ((huf) optional.c()).a(this.g, this.i);
        }
    }

    public hhs(Service service, vjs vjs, huk huk, PlayerFactory playerFactory) {
        this.a = (Context) fay.a(service);
        this.b = (vjs) fay.a(vjs);
        this.f = (huk) fay.a(huk);
        this.e = (PlayerFactory) fay.a(playerFactory);
        this.c = Optional.e();
    }

    public final synchronized void a() {
        if (!this.k) {
            this.f.a(this);
            this.i = this.e.create(ViewUris.bJ.toString(), udt.au, rju.r);
            this.i.registerPlayerStateObserver(this.l);
            this.k = true;
        }
    }

    public final synchronized void b() {
        Optional<huf> optional = this.c;
        if (this.k) {
            this.f.b(this);
            if (optional.b()) {
                ((huf) optional.c()).a();
            }
            c();
            if (this.i != null) {
                this.i.unregisterPlayerStateObserver(this.l);
            }
            this.k = false;
        }
    }

    public final void c() {
        this.h = null;
        this.b.a((int) R.id.notification_sync);
    }

    public final void a(OfflineProgressModel offlineProgressModel) {
        if (this.d) {
            if (offlineProgressModel.getQueuedTracks() <= 0) {
                c();
            } else if (!offlineProgressModel.isSyncing() || !this.d) {
                c();
            } else {
                if (this.h == null) {
                    this.h = new c(this.a, "spotify_updates_channel");
                }
                PendingIntent activity = PendingIntent.getActivity(this.a, 0, new Intent(this.a, MainActivity.class), 0);
                Resources resources = this.a.getResources();
                c cVar = this.h;
                cVar.f = activity;
                c a2 = cVar.a((CharSequence) resources.getString(R.string.notification_syncing_title)).b((CharSequence) resources.getQuantityString(R.plurals.notification_syncing_text, offlineProgressModel.getTotalTracks(), new Object[]{Integer.valueOf(offlineProgressModel.getSyncedTracks()), Integer.valueOf(offlineProgressModel.getTotalTracks()), Integer.valueOf(Math.round(offlineProgressModel.getPercentComplete()))})).d(resources.getString(R.string.notification_syncing_title)).a(17301633);
                a2.a(2, true);
                a2.a(true).a(100, Math.round(offlineProgressModel.getPercentComplete()), false).r = fr.c(this.a, R.color.notification_bg_color);
                this.b.a(R.id.notification_sync, this.h.b());
            }
        }
    }

    public final void a(huf huf) {
        Optional<huf> optional = this.c;
        if (!optional.b() || huf == null) {
            if (optional.b()) {
                ((huf) optional.c()).a();
            }
        } else if (!((huf) optional.c()).getClass().equals(huf.getClass())) {
            ((huf) optional.c()).a();
        }
        this.c = Optional.c(huf);
        if (this.c.b() && this.k) {
            this.j = null;
            Player player = this.i;
            if (player != null) {
                a(player.getLastPlayerState());
            }
            ((huf) this.c.c()).a(ForceInCollection.NO, this.i);
        }
    }
}
