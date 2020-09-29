package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.Restrictions;
import java.util.List;
import java.util.Set;

/* renamed from: vhz reason: default package */
public final class vhz {

    /* renamed from: vhz$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[AudioStream.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.player.model.AudioStream[] r0 = com.spotify.player.model.AudioStream.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.player.model.AudioStream r1 = com.spotify.player.model.AudioStream.ALARM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.player.model.AudioStream r1 = com.spotify.player.model.AudioStream.DEFAULT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vhz.AnonymousClass1.<clinit>():void");
        }
    }

    public static PlayerContextIndex a(ContextIndex contextIndex) {
        return new PlayerContextIndex(fev.a(contextIndex.page()), fev.a(contextIndex.track()));
    }

    public static PlayerState a(com.spotify.player.model.PlayerState playerState) {
        long timestamp = playerState.timestamp();
        String contextUri = playerState.contextUri();
        PlayOrigin playOrigin = (PlayOrigin) playerState.playOrigin().a(PlayOrigin.create(""));
        com.spotify.mobile.android.cosmos.player.v2.PlayOrigin playOrigin2 = new com.spotify.mobile.android.cosmos.player.v2.PlayOrigin(playOrigin.featureIdentifier(), playOrigin.featureVersion(), playOrigin.viewUri(), playOrigin.externalReferrer(), playOrigin.referrerIdentifier(), playOrigin.deviceIdentifier(), playOrigin.featureClasses());
        PlayerTrack playerTrack = (PlayerTrack) playerState.track().a((Function<? super T, V>) $$Lambda$ppCgmTO1K56PawrXl5gFMcGH36o.INSTANCE).d();
        String str = (String) playerState.playbackId().d();
        PlayerContextIndex playerContextIndex = (PlayerContextIndex) playerState.index().a((Function<? super T, V>) $$Lambda$S44y7bvpFL1IGzHMYubnakDN3Fk.INSTANCE).d();
        float floatValue = ((Double) playerState.playbackSpeed().a(Double.valueOf(0.0d))).floatValue();
        Optional positionAsOfTimestamp = playerState.positionAsOfTimestamp();
        Long valueOf = Long.valueOf(0);
        long longValue = ((Long) positionAsOfTimestamp.a(valueOf)).longValue();
        long longValue2 = ((Long) playerState.duration().a(valueOf)).longValue();
        boolean isPlaying = playerState.isPlaying();
        boolean isPaused = playerState.isPaused();
        PlayerOptions options = playerState.options();
        com.spotify.mobile.android.cosmos.player.v2.PlayerOptions create = com.spotify.mobile.android.cosmos.player.v2.PlayerOptions.create(options.shufflingContext(), options.repeatingContext(), options.repeatingTrack());
        Restrictions restrictions = playerState.restrictions();
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(restrictions.disallowPeekingPrevReasons(), restrictions.disallowPeekingNextReasons(), restrictions.disallowSkippingPrevReasons(), restrictions.disallowSkippingNextReasons(), restrictions.disallowPausingReasons(), restrictions.disallowResumingReasons(), restrictions.disallowTogglingRepeatContextReasons(), restrictions.disallowTogglingRepeatTrackReasons(), restrictions.disallowTogglingShuffleReasons(), restrictions.disallowSeekingReasons(), restrictions.disallowTransferringPlaybackReasons(), restrictions.disallowRemoteControlReasons(), restrictions.disallowInsertingIntoNextTracksReasons(), restrictions.disallowInsertingIntoContextTracksReasons(), restrictions.disallowReorderingInNextTracksReasons(), restrictions.disallowReorderingInContextTracksReasons(), restrictions.disallowRemovingFromNextTracksReasons(), restrictions.disallowRemovingFromContextTracksReasons(), restrictions.disallowUpdatingContextReasons(), restrictions.disallowSetQueueReasons());
        PlayerState playerState2 = new PlayerState(timestamp, contextUri, playOrigin2, playerTrack, str, playerContextIndex, floatValue, longValue, longValue2, isPlaying, isPaused, create, playerRestrictions, new PlayerSuppressions((Set<String>) playerState.suppressions().providers()), a((List<ContextTrack>) playerState.nextTracks()), a((List<ContextTrack>) playerState.prevTracks()), playerState.contextMetadata(), playerState.pageMetadata(), AnonymousClass1.a[playerState.audioStream().ordinal()] != 1 ? PlayOptions.AudioStream.DEFAULT : PlayOptions.AudioStream.ALARM);
        return playerState2;
    }

    public static PlayerTrack a(ContextTrack contextTrack) {
        PlayerTrack playerTrack = new PlayerTrack(contextTrack.uri(), contextTrack.uid(), null, null, fbo.c(contextTrack.provider()), contextTrack.metadata());
        return playerTrack;
    }

    private static PlayerTrack[] a(List<ContextTrack> list) {
        return (PlayerTrack[]) ImmutableList.a(fcp.a((Iterable<E>) list).a((Function<? super E, T>) $$Lambda$ppCgmTO1K56PawrXl5gFMcGH36o.INSTANCE).a()).toArray(new PlayerTrack[0]);
    }
}
