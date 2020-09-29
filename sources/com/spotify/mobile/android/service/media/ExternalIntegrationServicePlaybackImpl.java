package com.spotify.mobile.android.service.media;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.service.media.RestrictedMediaAction.Type;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx.internal.operators.NeverObservableHolder;

public final class ExternalIntegrationServicePlaybackImpl implements hof {
    final xac<RestrictedMediaAction> a;
    private final Player b;
    private final hou c;
    private final SpeedControlInteractor d;
    private final hvl e;
    private fpt f;
    private final ActionCallback g = new a();
    private final xag h = new xag();
    private final xac<Boolean> i;
    private final Flowable<PlayerState> j;
    private final uxc k;
    private final tjv l;
    private final hte m;

    enum ShuffleOverride {
        NO_OVERRIDE,
        FORCE_ENABLE_SHUFFLE,
        FORCE_DISABLE_SHUFFLE
    }

    static final class a implements ActionCallback {
        public final void onActionSuccess() {
        }

        a() {
        }

        public final void onActionForbidden(List<String> list) {
            Logger.e("Action forbidden, reasons: %s", Arrays.toString(list.toArray()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ uza b(Throwable th) {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h() {
    }

    public ExternalIntegrationServicePlaybackImpl(Player player, Flowable<PlayerState> flowable, hvl hvl, hou hou, uxc uxc, tjv tjv, SpeedControlInteractor speedControlInteractor, hte hte) {
        this.b = player;
        this.j = flowable;
        this.e = hvl;
        this.m = hte;
        this.a = xac.e();
        this.i = xac.e();
        this.c = hou;
        this.k = uxc;
        this.l = tjv;
        this.d = speedControlInteractor;
    }

    public final void a(fpt fpt) {
        this.f = fpt;
    }

    public final void e() {
        this.h.a();
        this.m.a.c();
    }

    public final void f() {
        this.i.onNext(Boolean.TRUE);
    }

    public final void g() {
        this.i.onNext(Boolean.FALSE);
    }

    public final wud<PlayerState> a() {
        return this.i.i(new wut() {
            public final Object call(Object obj) {
                return ExternalIntegrationServicePlaybackImpl.this.a((Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Boolean bool) {
        return bool.booleanValue() ? vun.a((wrf<T>) this.j) : NeverObservableHolder.a();
    }

    public final PlayerState b() {
        return this.b.getLastPlayerState();
    }

    public final wud<RestrictedMediaAction> c() {
        return this.a;
    }

    public final void a(String str, ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        this.b.resume(actionCallback);
        this.c.a(str, 1);
    }

    public final void a(String str) {
        this.b.pause();
        this.c.a(str, 0);
    }

    public final void b(String str, final ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        this.b.skipToNextTrack((ActionCallback) new ActionCallback() {
            public final void onActionSuccess() {
                actionCallback.onActionSuccess();
            }

            public final void onActionForbidden(List<String> list) {
                actionCallback.onActionForbidden(list);
                ExternalIntegrationServicePlaybackImpl.this.a.onNext(new RestrictedMediaAction(Type.SKIP_NEXT, list));
            }
        });
        this.c.b(str, 1);
    }

    public final void c(String str, final ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        this.b.skipToPreviousTrack(new ActionCallback() {
            public final void onActionSuccess() {
                actionCallback.onActionSuccess();
            }

            public final void onActionForbidden(List<String> list) {
                actionCallback.onActionForbidden(list);
                ExternalIntegrationServicePlaybackImpl.this.a.onNext(new RestrictedMediaAction(Type.SKIP_PREVIOUS, list));
            }
        });
        this.c.b(str, -1);
    }

    public final void a(int i2, String str, PlayerQueue playerQueue, ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        if (i2 == 0) {
            actionCallback.onActionSuccess();
            return;
        }
        String str2 = "index";
        if (i2 < 0) {
            PlayerTrack[] prevTracks = playerQueue.prevTracks();
            fay.a(-i2, prevTracks.length + 1, str2);
            this.b.skipToPastTrack(prevTracks[prevTracks.length + i2]);
            actionCallback.onActionSuccess();
        } else {
            PlayerTrack[] nextTracks = playerQueue.nextTracks();
            int i3 = i2 - 1;
            fay.a(i3, nextTracks.length, str2);
            this.b.skipToFutureTrack(nextTracks[i3], actionCallback);
        }
        long j2 = (long) i2;
        this.c.a(str, "play_from_queue", "play_from_queue", (String) null, (byte[]) null);
        Logger.a("LogHelper.logPlayFormQueue index: %d", Long.valueOf(j2));
    }

    public final void a(String str, PlayOptions playOptions, String str2, ActionCallback actionCallback) {
        a(str, playOptions, null, str2, actionCallback);
    }

    public final void a(String str, PlayOptions playOptions, Map<String, String> map, String str2, ActionCallback actionCallback) {
        fpt fpt = this.f;
        if (fpt == null || !fpt.a()) {
            Logger.e("Calling playUri before flags are loaded", new Object[0]);
        } else if (str.isEmpty()) {
            Logger.d("playUri should be called with a valid context-uri. Issuing a 'resume()'command instead", new Object[0]);
            a(str2, actionCallback);
        } else {
            this.c.a(str2, str);
            if (actionCallback == null) {
                actionCallback = this.g;
            }
            wud g2 = g(str);
            $$Lambda$ExternalIntegrationServicePlaybackImpl$O0nje1nXHFQGl4jXtRO58MzKjkA r0 = new wun(str, map, playOptions, actionCallback) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ Map f$2;
                private final /* synthetic */ PlayOptions f$3;
                private final /* synthetic */ ActionCallback f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void call(Object obj) {
                    ExternalIntegrationServicePlaybackImpl.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (uza) obj);
                }
            };
            this.h.a(g2.a((wun<? super T>) r0, (wun<Throwable>) new wun(str, actionCallback) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ ActionCallback f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void call(Object obj) {
                    ExternalIntegrationServicePlaybackImpl.a(this.f$0, this.f$1, (Throwable) obj);
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, PlayOptions playOptions, ActionCallback actionCallback, uza uza) {
        HashMap hashMap;
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        String sb2 = sb.toString();
        fpt fpt = this.f;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap(2);
        }
        if (uza == null || uza.a() == null) {
            LinkType linkType = jst.a(str).b;
            LinkType linkType2 = LinkType.COLLECTION_TRACKS;
            String str2 = Metadata.ADDED_AT;
            String str3 = PlayerContext.Metadata.SORTING_CRITERIA;
            if (linkType == linkType2) {
                hashMap.put(str3, String.format("%s DESC", new Object[]{str2}));
            } else if (linkType == LinkType.SHOW_SHOW && fpt.b(rxd.a)) {
                hashMap.put(str3, String.format("%s ASC", new Object[]{str2}));
            } else if (linkType == LinkType.COLLECTION_ALBUM) {
                hashMap.put(str3, String.format("%s, %s ASC", new Object[]{"album_disc_number", "album_track_number"}));
            }
        } else {
            String p = uza.a().p();
            if (!TextUtils.isEmpty(p)) {
                hashMap.put(PlayerContext.Metadata.FORMAT_LIST_TYPE, p);
            }
        }
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb2, hashMap);
        this.b.play(createFromContextUrl, a(playOptions, uza, createFromContextUrl), this.m.a(str, actionCallback));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str, ActionCallback actionCallback, Throwable th) {
        Logger.e(th, "Failed to resolve URI %s", str);
        actionCallback.onActionForbidden(Lists.a((E[]) new String[]{th.getMessage(), "invalid_uri"}));
    }

    public final void a(PlayerContext playerContext, PlayOptions playOptions, String str, ActionCallback actionCallback) {
        this.b.play(playerContext, a((PlayOptions) null, (uza) null, playerContext), this.m.a(playerContext.uri(), this.g));
        this.c.a(str, playerContext.uri());
    }

    public final void d(String str, ActionCallback actionCallback) {
        this.h.a(vun.a((wrf<T>) this.e.a).c((wut<? super T, Boolean>) $$Lambda$ExternalIntegrationServicePlaybackImpl$gwDUQG_wM1o8FxMzcq6oW0GZYg.INSTANCE).f($$Lambda$KGsdFp7hwr4JnEfZ19jPX0Xzi_E.INSTANCE).a(1).a((wun<? super T>) new wun(str, null) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ ActionCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void call(Object obj) {
                ExternalIntegrationServicePlaybackImpl.this.a(this.f$1, this.f$2, (String) obj);
            }
        }, (wun<Throwable>) $$Lambda$ExternalIntegrationServicePlaybackImpl$MwXZTEOuGkz8SteHz2zJ_Cweopw.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SessionState sessionState) {
        return Boolean.valueOf(sessionState != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ActionCallback actionCallback, String str2) {
        a(jst.g(str2).h(), new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), str, actionCallback);
    }

    private PlayOptions a(PlayOptions playOptions, uza uza, PlayerContext playerContext) {
        Builder builder;
        PlayerOptionsOverrides playerOptionsOverrides;
        if (playOptions == null) {
            builder = new Builder();
        } else {
            builder = a(playOptions);
        }
        ShuffleOverride a2 = a(this.l, this.f, uza, playerContext);
        if (a2 != ShuffleOverride.NO_OVERRIDE) {
            boolean z = a2 == ShuffleOverride.FORCE_ENABLE_SHUFFLE;
            if (playOptions == null) {
                playerOptionsOverrides = null;
            } else {
                playerOptionsOverrides = playOptions.playerOptionsOverride();
            }
            builder.playerOptionsOverride(a(playerOptionsOverrides, z));
        }
        boolean c2 = jsl.c(this.f);
        boolean a3 = a(this.l, uza, playerContext);
        if (!c2 && a3) {
            builder.suppressions(PlayerProviders.MFT);
        }
        return builder.build();
    }

    private static boolean a(tjv tjv, uza uza, PlayerContext playerContext) {
        if ((uza != null ? ((Boolean) uza.a().n().a(Boolean.FALSE)).booleanValue() : false) || a(playerContext) || a(uza, tjv)) {
            return true;
        }
        return false;
    }

    private static boolean a(uza uza, tjv tjv) {
        uyz a2 = uza == null ? null : uza.a();
        if (a2 == null || tjv.a(a2.p()) != FormatListType.CAR_MIX) {
            return false;
        }
        return true;
    }

    private static boolean a(PlayerContext playerContext) {
        return jst.a(playerContext.uri(), LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE);
    }

    private wud<uza> g(String str) {
        String str2 = "formatListAttributes";
        String str3 = "formatListType";
        String str4 = "containsTracks";
        String str5 = "containsEpisodes";
        String str6 = "containsAudioEpisodes";
        String str7 = "isOnDemandInFree";
        return wuh.a(vun.a((SingleSource<T>) this.k.a(str, defpackage.uxc.a.t().i(uyd.a(0, 0)).a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.g().b("link", Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b()).a()).a()).a())).a())).d($$Lambda$ExternalIntegrationServicePlaybackImpl$cFxKjx2vSznjbbBNldI8DPzRe0.INSTANCE));
    }

    public final void b(String str) {
        this.b.setShufflingContext(true);
        this.c.a(str, true);
    }

    public final void c(String str) {
        this.b.setShufflingContext(false);
        this.c.a(str, false);
    }

    public final void d(String str) {
        this.b.setRepeatingContext(false);
        this.b.setRepeatingTrack(false);
        this.c.c(str, 0);
    }

    public final void e(String str) {
        this.b.setRepeatingContext(false);
        this.b.setRepeatingTrack(true);
        this.c.c(str, 1);
    }

    public final void f(String str) {
        this.b.setRepeatingContext(true);
        this.b.setRepeatingTrack(false);
        this.c.c(str, 2);
    }

    public final void a(long j2, ActionCallback actionCallback) {
        PlayerState b2 = b();
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        if (b2 == null) {
            actionCallback.onActionForbidden(Collections.singletonList("Empty PlayerState"));
            return;
        }
        Set disallowSeekingReasons = b2.restrictions().disallowSeekingReasons();
        if (disallowSeekingReasons.isEmpty()) {
            this.b.seekTo(j2);
            actionCallback.onActionSuccess();
            return;
        }
        this.a.onNext(new RestrictedMediaAction(Type.SEEK, new ArrayList(disallowSeekingReasons)));
        actionCallback.onActionForbidden(new ArrayList(disallowSeekingReasons));
    }

    public final void a(int i2) {
        this.h.a(vun.a(this.d.a(i2).a((Action) $$Lambda$ExternalIntegrationServicePlaybackImpl$X9D4K_YEWe2VXoFgB_5NyNDOdKk.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ExternalIntegrationServicePlaybackImpl$Uqnv5X3CiPc2JCxspaJTVE2LiE.INSTANCE)));
    }

    public final wud<Integer> d() {
        return vun.a((ObservableSource<T>) this.d.a(), BackpressureStrategy.BUFFER);
    }

    private static PlayerOptionsOverrides a(PlayerOptionsOverrides playerOptionsOverrides, boolean z) {
        if (playerOptionsOverrides == null) {
            return PlayerOptionsOverrides.create(Boolean.valueOf(z), null, null);
        }
        return PlayerOptionsOverrides.create(Boolean.valueOf(z), playerOptionsOverrides.repeatingContext(), playerOptionsOverrides.repeatingTrack());
    }

    private static Builder a(PlayOptions playOptions) {
        return new Builder().allowSeeking(playOptions.allowSeeking()).audioStream(playOptions.audioStream()).configurationOverride(playOptions.configurationOverride()).initiallyPaused(playOptions.initiallyPaused()).operation(playOptions.operation()).playbackId(playOptions.playbackId()).playerOptionsOverride(playOptions.playerOptionsOverride()).seekTo(playOptions.seekTo()).skipTo(playOptions.skipTo()).suppressions(playOptions.suppressions()).systemInitiated(playOptions.systemInitiated()).trigger(playOptions.trigger());
    }

    private static ShuffleOverride a(tjv tjv, fpt fpt, uza uza, PlayerContext playerContext) {
        if (jsl.c(fpt)) {
            if (a(playerContext) || a(uza, tjv)) {
                return ShuffleOverride.FORCE_DISABLE_SHUFFLE;
            }
            return ShuffleOverride.NO_OVERRIDE;
        } else if (a(tjv, uza, playerContext)) {
            return ShuffleOverride.FORCE_DISABLE_SHUFFLE;
        } else {
            return ShuffleOverride.FORCE_ENABLE_SHUFFLE;
        }
    }
}
