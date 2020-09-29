package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: hos reason: default package */
public final class hos {
    private final String a;
    private final hne b;

    public hos(String str, hne hne) {
        this.a = str;
        this.b = hne;
    }

    public final void a(String str) {
        PlayerTrack playerTrack;
        try {
            MediaAction valueOf = MediaAction.valueOf(str);
            Logger.b("Running action %s", valueOf);
            String str2 = null;
            switch (valueOf) {
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
                    PlayerState b2 = this.b.d().b();
                    if (b2 == null) {
                        playerTrack = null;
                    } else {
                        playerTrack = b2.track();
                    }
                    if (playerTrack != null) {
                        str2 = playerTrack.uri();
                    }
                    if (str2 != null) {
                        this.b.e().a(str2, this.a);
                        break;
                    } else {
                        Logger.e("Couldn't start radio for the track: %s", playerTrack);
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
                    String a2 = a();
                    PlayerState b3 = this.b.d().b();
                    if (b3 != null) {
                        str2 = b3.contextUri();
                    }
                    if (a2 != null) {
                        this.b.b().a(a2, str2, this.a);
                        return;
                    }
                    break;
                case REMOVE_FROM_COLLECTION:
                    String a3 = a();
                    if (a3 != null) {
                        this.b.b().a(a3, this.a);
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
                    Assertion.b(String.format("Unhandled MediaAction: %s", new Object[]{valueOf}));
                    break;
            }
        } catch (IllegalArgumentException e) {
            Logger.e(e, "Media action %s is not supported", str);
        }
    }

    private String a() {
        PlayerState b2 = this.b.d().b();
        if (b2 != null) {
            PlayerTrack track = b2.track();
            if (track != null) {
                return track.uri();
            }
        }
        return null;
    }
}
