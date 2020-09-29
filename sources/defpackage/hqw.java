package defpackage;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: hqw reason: default package */
public final class hqw {
    private final String a;
    private final hpt b;

    public hqw(String str, hpt hpt) {
        this.a = str;
        this.b = hpt;
    }

    private static String a(Bundle bundle) {
        String str = "";
        return bundle != null ? bundle.getString("com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ContentUri", str) : str;
    }

    private void a() {
        PlayerState b2 = this.b.d().b();
        String str = null;
        PlayerTrack track = b2 == null ? null : b2.track();
        if (track != null) {
            str = track.uri();
        }
        if (str != null) {
            this.b.e().a(str, this.a);
        } else {
            Logger.e("Couldn't start radio for the track: %s", track);
        }
    }

    private static boolean a(String str) {
        if (fbo.a(str)) {
            return false;
        }
        return jva.a(str, LinkType.ALBUM, LinkType.ARTIST, LinkType.PLAYLIST_V2, LinkType.TRACK);
    }

    private String b() {
        PlayerState b2 = this.b.d().b();
        if (b2 != null) {
            PlayerTrack track = b2.track();
            if (track != null) {
                return track.uri();
            }
        }
        return null;
    }

    private void b(String str) {
        this.b.e().a(str, this.a);
    }

    private String c() {
        PlayerState b2 = this.b.d().b();
        if (b2 != null) {
            return b2.contextUri();
        }
        return null;
    }

    public void a(MediaAction mediaAction, Bundle bundle) {
        Logger.b("Running action %s", mediaAction);
        switch (mediaAction) {
            case PLAY:
                this.b.d().a(this.a, (ActionCallback) null);
                break;
            case PAUSE:
                this.b.d().a(this.a);
                return;
            case TURN_SHUFFLE_ON:
                this.b.d().b(this.a);
                return;
            case TURN_SHUFFLE_OFF:
                this.b.d().c(this.a);
                return;
            case SKIP_TO_NEXT:
                this.b.d().b(this.a, null);
                return;
            case SKIP_TO_PREVIOUS:
                this.b.d().c(this.a, null);
                return;
            case START_RADIO:
                String a2 = a(bundle);
                if (a(a2)) {
                    b(a2);
                    return;
                } else {
                    a();
                    return;
                }
            case THUMB_UP:
                this.b.e().a(true, this.a);
                return;
            case THUMB_DOWN:
                this.b.e().a(false, this.a);
                return;
            case TURN_REPEAT_ALL_ON:
                this.b.d().f(this.a);
                return;
            case TURN_REPEAT_ONE_ON:
                this.b.d().e(this.a);
                return;
            case TURN_REPEAT_ONE_OFF:
            case TURN_REPEAT_ALL_OFF:
                this.b.d().d(this.a);
                return;
            case ADD_TO_COLLECTION:
                String b2 = b();
                String c = c();
                if (b2 != null) {
                    this.b.b().a(b2, c, this.a);
                    return;
                }
                break;
            case REMOVE_FROM_COLLECTION:
                String b3 = b();
                if (b3 != null) {
                    this.b.b().a(b3, this.a);
                    return;
                }
                break;
            case SEEK_15_SECONDS_FORWARD:
                PlayerState b4 = this.b.d().b();
                if (b4 != null) {
                    this.b.d().a(Math.min(b4.duration(), b4.currentPlaybackPosition() + 15000), (ActionCallback) null);
                    return;
                }
                break;
            case SEEK_15_SECONDS_BACK:
                PlayerState b5 = this.b.d().b();
                if (b5 != null) {
                    this.b.d().a(Math.max(0, b5.currentPlaybackPosition() - 15000), (ActionCallback) null);
                    return;
                }
                break;
            case PLAYBACK_SPEED_0_5:
                this.b.d().a(80);
                return;
            case PLAYBACK_SPEED_0_8:
                this.b.d().a(100);
                return;
            case PLAYBACK_SPEED_1_0:
                this.b.d().a(120);
                return;
            case PLAYBACK_SPEED_1_2:
                this.b.d().a((int) PlaybackSpeed.PLAYBACK_SPEED_150);
                return;
            case PLAYBACK_SPEED_1_5:
                this.b.d().a(200);
                return;
            case PLAYBACK_SPEED_2_0:
                this.b.d().a(80);
                return;
            case PLAYBACK_SPEED_3_0:
                this.b.d().a(80);
                return;
            case THUMBS_UP_SELECTED:
            case THUMB_DOWN_SELECTED:
            case SKIP_TO_NEXT_DISABLED:
            case SKIP_TO_PREVIOUS_DISABLED:
            case NO_ACTION:
            case TOGGLE_REPEAT:
            case TOGGLE_SHUFFLE:
                return;
            default:
                Assertion.b(String.format("Unhandled MediaAction: %s", new Object[]{mediaAction}));
                break;
        }
    }
}
