package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback;
import com.spotify.mobile.android.cosmos.player.v2.internal.ActionParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerInternalError;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerSessionParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PreparePlayParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.SkipToTrackParameters;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class ResolverPlayer implements Player {
    private static final String PLAYER_URI = "sp://player/v2/main";
    private final String mFeatureIdentifier;
    private final String mFeatureVersion;
    private final Handler mHandler;
    private final ObjectMapper mObjectMapper;
    private final wzi<PlayerStateCompat> mPlayerStateCompatProvider;
    private final String mReferrerIdentifier;
    private final FireAndForgetResolver mResolver;
    private final String mViewUri;

    ResolverPlayer(Handler handler, FireAndForgetResolver fireAndForgetResolver, String str, String str2, String str3, String str4, ObjectMapper objectMapper, wzi<PlayerStateCompat> wzi) {
        this.mResolver = fireAndForgetResolver;
        this.mViewUri = str;
        this.mFeatureIdentifier = str2;
        this.mFeatureVersion = str3;
        this.mReferrerIdentifier = str4;
        this.mHandler = handler;
        this.mObjectMapper = objectMapper;
        this.mPlayerStateCompatProvider = wzi;
    }

    ResolverPlayer(FireAndForgetResolver fireAndForgetResolver, String str, String str2, String str3, String str4, ObjectMapper objectMapper, wzi<PlayerStateCompat> wzi) {
        this(new Handler(), fireAndForgetResolver, str, str2, str3, str4, objectMapper, wzi);
    }

    private void doPreparePlay(PlayerContext playerContext, PlayOptions playOptions, String str, PreparePlayCallback preparePlayCallback) {
        try {
            byte[] bytes = this.mObjectMapper.writeValueAsString(new PreparePlayParameters(playerContext, playOptions, getPlaybackOrigin(null, str, null))).getBytes(fbi.c);
            Map emptyMap = Collections.emptyMap();
            final PlayerSession playerSession = new PlayerSession(this);
            FireAndForgetResolver fireAndForgetResolver = this.mResolver;
            String str2 = "SOTP";
            String str3 = "eysonil/n//as2//iesrspma:pv";
            Request request = new Request(Request.POST, "sp://player/v2/main/session", emptyMap, bytes);
            Class<PlayerSessionParameters> cls = PlayerSessionParameters.class;
            AnonymousClass2 r0 = r0;
            final PreparePlayCallback preparePlayCallback2 = preparePlayCallback;
            AnonymousClass2 r02 = new JsonCallbackReceiver<PlayerSessionParameters>(this.mHandler, PlayerSessionParameters.class, this.mObjectMapper) {
                public void onError(Throwable th, ErrorCause errorCause) {
                    Logger.e(th, "Failed to prepare play: %s", errorCause);
                    preparePlayCallback2.onPreparePlayFailed();
                }

                /* access modifiers changed from: protected */
                public void onResolved(Response response, PlayerSessionParameters playerSessionParameters) {
                    playerSession.setSessionUri(playerSessionParameters.sessionUri);
                    preparePlayCallback2.onPreparePlaySuccess(playerSession);
                }
            };
            fireAndForgetResolver.resolve(request, r02);
        } catch (Exception e) {
            throw new PlayerInternalError(e);
        }
    }

    private PlayOrigin getPlaybackOrigin(Set<String> set, String str, String str2) {
        if (str == null) {
            str = this.mViewUri;
        }
        PlayOrigin playOrigin = r0;
        String str3 = str2;
        Set<String> set2 = set;
        PlayOrigin playOrigin2 = new PlayOrigin(this.mFeatureIdentifier, this.mFeatureVersion, str, str2, this.mReferrerIdentifier, null, set);
        return playOrigin2;
    }

    private void playContext(PlayerContext playerContext, Set<String> set, PlayOptions playOptions, String str, String str2, ActionCallback actionCallback) {
        PlayParameters playParameters = new PlayParameters();
        playParameters.context = playerContext;
        playParameters.options = playOptions;
        playParameters.playOrigin = getPlaybackOrigin(set, str, str2);
        String str3 = "lpya";
        sendRequestWithAction("play", playParameters, actionCallback);
    }

    private <T extends JacksonModel> void sendRequestWithAction(String str, T t, final ActionCallback actionCallback) {
        try {
            byte[] bytes = this.mObjectMapper.writeValueAsString(t).getBytes(fbi.c);
            Object[] objArr = {str};
            String str2 = "2eam://smrp/s/pl/yvn%a";
            this.mResolver.resolve(new Request(Request.POST, String.format("sp://player/v2/main/%s", objArr), Collections.emptyMap(), bytes), new ResolverCallbackReceiver(this.mHandler) {
                public void onError(Throwable th) {
                    ActionCallback actionCallback = actionCallback;
                    if (actionCallback != null) {
                        actionCallback.onActionForbidden(Lists.a((E[]) new String[]{"android.internal-error"}));
                    }
                }

                public void onResolved(Response response) {
                    if (actionCallback != null) {
                        if (response.getStatus() == 200) {
                            actionCallback.onActionSuccess();
                        } else if (response.getStatus() == 403) {
                            String str = ",";
                            actionCallback.onActionForbidden(Arrays.asList(((String) response.getHeaders().get("forbidden-reasons")).split(",")));
                        } else {
                            ActionCallback actionCallback = actionCallback;
                            String str2 = "uison.we-roknnnor-addr";
                            StringBuilder sb = new StringBuilder("android.unknown-error-");
                            sb.append(response.getStatus());
                            actionCallback.onActionForbidden(Lists.a((E[]) new String[]{sb.toString()}));
                        }
                    }
                }
            });
        } catch (Exception e) {
            throw new PlayerInternalError(e);
        }
    }

    private void skipToPreviousTrack(boolean z, boolean z2, ActionCallback actionCallback) {
        SkipToTrackParameters skipToTrackParameters = new SkipToTrackParameters();
        skipToTrackParameters.playOptions = new Builder().allowSeeking(z2).overrideRestrictions(z).build();
        String str = "epkrov_pi";
        sendRequestWithAction("skip_prev", skipToTrackParameters, actionCallback);
    }

    /* access modifiers changed from: 0000 */
    public void destroyPlayerSession(PlayerSession playerSession, final ActionCallback actionCallback) {
        String str = "EELDTb";
        this.mResolver.resolve(new Request(Request.DELETE, playerSession.getSessionUri(), Collections.emptyMap(), new byte[0]), new ResolverCallbackReceiver(this.mHandler) {
            public void onError(Throwable th) {
                ActionCallback actionCallback = actionCallback;
                if (actionCallback != null) {
                    actionCallback.onActionForbidden(Lists.a((E[]) new String[]{"android.internal-error"}));
                }
            }

            public void onResolved(Response response) {
                if (actionCallback != null) {
                    if (response.getStatus() == 200) {
                        actionCallback.onActionSuccess();
                    } else if (response.getStatus() == 403) {
                        actionCallback.onActionForbidden(Lists.a((E[]) new String[]{"player-session-not-found"}));
                    } else {
                        ActionCallback actionCallback = actionCallback;
                        String str = "rns--idenwuooarondkrr.";
                        StringBuilder sb = new StringBuilder("android.unknown-error-");
                        sb.append(response.getStatus());
                        actionCallback.onActionForbidden(Lists.a((E[]) new String[]{sb.toString()}));
                    }
                }
            }
        });
    }

    public void fetchState(PlayerStateObserver playerStateObserver) {
        fetchState(playerStateObserver, 2, 2);
    }

    public void fetchState(PlayerStateObserver playerStateObserver, int i, int i2) {
        ((PlayerStateCompat) this.mPlayerStateCompatProvider.get()).fetch(playerStateObserver, i, i2);
    }

    public PlayerState getLastPlayerState() {
        return ((PlayerStateCompat) this.mPlayerStateCompatProvider.get()).getMostRecentPlayerState();
    }

    public String getViewUri() {
        return this.mViewUri;
    }

    public void pause() {
        String str = "pbseu";
        sendRequestWithAction("pause", new ActionParameters(), null);
    }

    public void pause(ActionCallback actionCallback) {
        String str = "eptsu";
        sendRequestWithAction("pause", new ActionParameters(), (ActionCallback) fbp.a(actionCallback));
    }

    public void play(PlayerContext playerContext, PlayOptions playOptions) {
        PlayerContext playerContext2 = playerContext;
        PlayOptions playOptions2 = playOptions;
        playContext(playerContext, null, playOptions, null, null, null);
    }

    public void play(PlayerContext playerContext, PlayOptions playOptions, ActionCallback actionCallback) {
        int i = 3 << 0;
        PlayerContext playerContext2 = playerContext;
        PlayOptions playOptions2 = playOptions;
        playContext(playerContext, null, playOptions, null, null, actionCallback);
    }

    public void play(PlayerContext playerContext, PlayOptions playOptions, Set<String> set, String str) {
        String str2 = str;
        playContext(playerContext, set, playOptions, str, null, null);
    }

    /* access modifiers changed from: 0000 */
    public void play(PlayerSession playerSession) {
        try {
            byte[] writeValueAsBytes = this.mObjectMapper.writeValueAsBytes(LoggingParameters.createWithCurrentTimestamp());
            this.mResolver.resolve(new Request(Request.POST, String.format("%s/play", new Object[]{playerSession.getSessionUri()}), Collections.emptyMap(), writeValueAsBytes), null);
        } catch (JsonProcessingException e) {
            throw new PlayerInternalError(e);
        }
    }

    public void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str) {
        String str2 = str;
        playContext(playerContext, null, playOptions, str, null, null);
    }

    public void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str, ActionCallback actionCallback) {
        PlayOptions playOptions2 = playOptions;
        playContext(playerContext, null, playOptions, str, null, actionCallback);
    }

    public void preparePlay(PlayerContext playerContext, PlayOptions playOptions, PreparePlayCallback preparePlayCallback) {
        doPreparePlay(playerContext, playOptions, null, preparePlayCallback);
    }

    public void registerPlayerStateObserver(PlayerStateObserver playerStateObserver) {
        registerPlayerStateObserver(playerStateObserver, 2, 2);
    }

    public void registerPlayerStateObserver(PlayerStateObserver playerStateObserver, int i, int i2) {
        ((PlayerStateCompat) this.mPlayerStateCompatProvider.get()).subscribe(playerStateObserver, i, i2);
    }

    public void resume() {
        String str = "smpuee";
        sendRequestWithAction("resume", new ActionParameters(), null);
    }

    public void resume(ActionCallback actionCallback) {
        String str = "emutre";
        sendRequestWithAction("resume", new ActionParameters(), (ActionCallback) fbp.a(actionCallback));
    }

    public void seekTo(long j) {
        ActionParameters actionParameters = new ActionParameters();
        actionParameters.value = Long.valueOf(j);
        String str = "ses_ote";
        sendRequestWithAction("seek_to", actionParameters, null);
    }

    public void setRepeatingContext(boolean z) {
        ActionParameters actionParameters = new ActionParameters();
        actionParameters.value = Boolean.valueOf(z);
        sendRequestWithAction("set_repeating_context", actionParameters, null);
    }

    public void setRepeatingTrack(boolean z) {
        ActionParameters actionParameters = new ActionParameters();
        actionParameters.value = Boolean.valueOf(z);
        String str = "tagmt_inctsrera_pke";
        sendRequestWithAction("set_repeating_track", actionParameters, null);
    }

    public void setShufflingContext(boolean z) {
        ActionParameters actionParameters = new ActionParameters();
        actionParameters.value = Boolean.valueOf(z);
        String str = "tneuoi_sxe_lftnshctgf";
        sendRequestWithAction("set_shuffling_context", actionParameters, null);
    }

    public void skipToFutureTrack(PlayerTrack playerTrack, ActionCallback actionCallback) {
        SkipToTrackParameters skipToTrackParameters = new SkipToTrackParameters();
        skipToTrackParameters.track = playerTrack;
        sendRequestWithAction("skip_next", skipToTrackParameters, actionCallback);
    }

    public void skipToNextTrack() {
        String str = "e_knxbpts";
        sendRequestWithAction("skip_next", new ActionParameters(), null);
    }

    public void skipToNextTrack(ActionCallback actionCallback) {
        sendRequestWithAction("skip_next", new ActionParameters(), actionCallback);
    }

    public void skipToNextTrack(boolean z) {
        SkipToTrackParameters skipToTrackParameters = new SkipToTrackParameters();
        skipToTrackParameters.playOptions = new Builder().overrideRestrictions(z).build();
        String str = "pt_iesbxn";
        sendRequestWithAction("skip_next", skipToTrackParameters, null);
    }

    public void skipToPastTrack(PlayerTrack playerTrack) {
        SkipToTrackParameters skipToTrackParameters = new SkipToTrackParameters();
        skipToTrackParameters.track = playerTrack;
        sendRequestWithAction("skip_prev", skipToTrackParameters, null);
    }

    public void skipToPreviousTrack() {
        skipToPreviousTrack(false, true, null);
    }

    public void skipToPreviousTrack(ActionCallback actionCallback) {
        skipToPreviousTrack(false, true, actionCallback);
    }

    public void skipToPreviousTrackAndDisableSeeking() {
        skipToPreviousTrack(false, false, null);
    }

    public void skipToPreviousTrackAndDisableSeeking(ActionCallback actionCallback) {
        skipToPreviousTrack(false, false, actionCallback);
    }

    public void unregisterPlayerStateObserver(PlayerStateObserver playerStateObserver) {
        ((PlayerStateCompat) this.mPlayerStateCompatProvider.get()).unsubscribe(playerStateObserver);
    }

    public void updateWithContext(PlayerContext playerContext) {
        updateWithContext(playerContext, null);
    }

    public void updateWithContext(PlayerContext playerContext, ActionCallback actionCallback) {
        PlayParameters playParameters = new PlayParameters();
        playParameters.context = playerContext;
        String str = "utpeda";
        sendRequestWithAction("update", playParameters, actionCallback);
    }
}
