package defpackage;

import android.media.AudioManager;
import android.view.KeyEvent;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: rqj reason: default package */
public final class rqj implements kyg {
    private final vti<AudioManager> a;
    private final rql b;
    private final Player c;
    private final gkw d;

    public rqj(gkw gkw, vti<AudioManager> vti, rql rql, Player player) {
        this.d = gkw;
        this.a = vti;
        this.b = rql;
        this.c = player;
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 62) {
            switch (keyCode) {
                case 19:
                    if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                        if (!this.d.a(Float.valueOf(1.0f))) {
                            ((AudioManager) this.a.get()).setStreamVolume(3, ((AudioManager) this.a.get()).getStreamMaxVolume(3), 0);
                        }
                        return true;
                    } else if (keyEvent.isCtrlPressed()) {
                        if (!this.d.a()) {
                            ((AudioManager) this.a.get()).setStreamVolume(3, this.b.a(true), 0);
                        }
                        return true;
                    }
                    break;
                case 20:
                    if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                        if (!this.d.a(Float.valueOf(0.0f))) {
                            ((AudioManager) this.a.get()).setStreamVolume(3, 0, 0);
                        }
                        return true;
                    } else if (keyEvent.isCtrlPressed()) {
                        if (!this.d.b()) {
                            ((AudioManager) this.a.get()).setStreamVolume(3, this.b.a(false), 0);
                        }
                        return true;
                    }
                    break;
                case 21:
                    boolean a2 = a(this.c.getLastPlayerState());
                    if (keyEvent.isCtrlPressed()) {
                        if (!a2 || keyEvent.isShiftPressed()) {
                            this.c.skipToPreviousTrack();
                        } else {
                            a(-15000);
                        }
                        return true;
                    }
                    break;
                case 22:
                    boolean a3 = a(this.c.getLastPlayerState());
                    if (keyEvent.isCtrlPressed()) {
                        if (!a3 || keyEvent.isShiftPressed()) {
                            this.c.skipToNextTrack();
                        } else {
                            a(15000);
                        }
                        return true;
                    }
                    break;
            }
            return false;
        }
        PlayerState lastPlayerState = this.c.getLastPlayerState();
        if (lastPlayerState == null || !lastPlayerState.isPaused()) {
            this.c.pause();
        } else {
            this.c.resume();
        }
        return true;
    }

    private static boolean a(PlayerState playerState) {
        if (playerState != null) {
            PlayerTrack track = playerState.track();
            if (track != null && a(track) && b(track)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(PlayerTrack playerTrack) {
        String str = (String) playerTrack.metadata().get("media.type");
        return str == null || str.equals("audio");
    }

    private static boolean b(PlayerTrack playerTrack) {
        String uri = playerTrack.uri();
        if (fax.a(uri) || jst.a(uri).b != LinkType.SHOW_EPISODE) {
            return false;
        }
        return true;
    }

    private void a(int i) {
        PlayerState playerState = (PlayerState) fay.a(this.c.getLastPlayerState());
        this.c.seekTo((long) ((int) Math.max(0, Math.min(playerState.currentPlaybackPosition() + ((long) i), playerState.duration()))));
    }
}
