package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerInternalError;
import java.lang.ref.WeakReference;
import java.util.List;

public class PlayerSession {
    private boolean mPlayWasCalled;
    private final WeakReference<ResolverPlayer> mPlayerWeakReference;
    /* access modifiers changed from: private */
    public String mSessionUri;

    PlayerSession(ResolverPlayer resolverPlayer) {
        this.mPlayerWeakReference = new WeakReference<>(resolverPlayer);
    }

    /* access modifiers changed from: 0000 */
    public String getSessionUri() {
        return this.mSessionUri;
    }

    /* access modifiers changed from: 0000 */
    public void setSessionUri(String str) {
        this.mSessionUri = str;
        if (this.mPlayWasCalled) {
            play();
        }
    }

    public void play() {
        if (this.mSessionUri == null) {
            this.mPlayWasCalled = true;
            return;
        }
        ResolverPlayer resolverPlayer = (ResolverPlayer) this.mPlayerWeakReference.get();
        if (resolverPlayer != null) {
            resolverPlayer.play(this);
        }
    }

    public void destroy() {
        ResolverPlayer resolverPlayer = (ResolverPlayer) this.mPlayerWeakReference.get();
        if (resolverPlayer != null) {
            resolverPlayer.destroyPlayerSession(this, new ActionCallback() {
                public void onActionForbidden(List<String> list) {
                }

                public void onActionSuccess() {
                    PlayerSession.this.mSessionUri = null;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        String str = this.mSessionUri;
        if (str == null) {
            super.finalize();
        } else {
            throw new PlayerInternalError(new Throwable(String.format(" Session '%s' has not been destroyed", new Object[]{str})));
        }
    }
}
