package com.spotify.mobile.android.service.media;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
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

public final class ExternalIntegrationServicePlaybackImpl implements hqh {
    final xog<RestrictedMediaAction> a;
    private final Player b;
    private final hqy c;
    private final SpeedControlInteractor d;
    private final hxx e;
    private fqn f;
    private final ActionCallback g = new a();
    private final xok h = new xok();
    private final xog<Boolean> i;
    private final Flowable<PlayerState> j;
    private final vje k;
    private final tvn l;
    private final hvs m;

    enum ShuffleOverride {
        NO_OVERRIDE,
        FORCE_ENABLE_SHUFFLE,
        FORCE_DISABLE_SHUFFLE
    }

    static final class a implements ActionCallback {
        a() {
        }

        public final void onActionForbidden(List<String> list) {
            Logger.e("Action forbidden, reasons: %s", Arrays.toString(list.toArray()));
        }

        public final void onActionSuccess() {
        }
    }

    public ExternalIntegrationServicePlaybackImpl(Player player, Flowable<PlayerState> flowable, hxx hxx, hqy hqy, vje vje, tvn tvn, SpeedControlInteractor speedControlInteractor, hvs hvs) {
        this.b = player;
        this.j = flowable;
        this.e = hxx;
        this.m = hvs;
        this.a = xog.e();
        this.i = xog.e();
        this.c = hqy;
        this.k = vje;
        this.l = tvn;
        this.d = speedControlInteractor;
    }

    private static Builder a(PlayOptions playOptions) {
        return new Builder().allowSeeking(playOptions.allowSeeking()).audioStream(playOptions.audioStream()).configurationOverride(playOptions.configurationOverride()).initiallyPaused(playOptions.initiallyPaused()).operation(playOptions.operation()).playbackId(playOptions.playbackId()).playerOptionsOverride(playOptions.playerOptionsOverride()).seekTo(playOptions.seekTo()).skipTo(playOptions.skipTo()).suppressions(playOptions.suppressions()).systemInitiated(playOptions.systemInitiated()).trigger(playOptions.trigger());
    }

    private PlayOptions a(PlayOptions playOptions, vld vld, PlayerContext playerContext) {
        Builder builder = playOptions == null ? new Builder() : a(playOptions);
        ShuffleOverride a2 = a(this.l, this.f, vld, playerContext);
        if (a2 != ShuffleOverride.NO_OVERRIDE) {
            builder.playerOptionsOverride(a(playOptions == null ? null : playOptions.playerOptionsOverride(), a2 == ShuffleOverride.FORCE_ENABLE_SHUFFLE));
        }
        boolean c2 = jus.c(this.f);
        boolean a3 = a(this.l, vld, playerContext);
        if (!c2 && a3) {
            builder.suppressions(PlayerProviders.MFT);
        }
        return builder.build();
    }

    private static PlayerOptionsOverrides a(PlayerOptionsOverrides playerOptionsOverrides, boolean z) {
        return playerOptionsOverrides == null ? PlayerOptionsOverrides.create(Boolean.valueOf(z), null, null) : PlayerOptionsOverrides.create(Boolean.valueOf(z), playerOptionsOverrides.repeatingContext(), playerOptionsOverrides.repeatingTrack());
    }

    private static ShuffleOverride a(tvn tvn, fqn fqn, vld vld, PlayerContext playerContext) {
        return jus.c(fqn) ? (a(playerContext) || a(vld, tvn)) ? ShuffleOverride.FORCE_DISABLE_SHUFFLE : ShuffleOverride.NO_OVERRIDE : a(tvn, vld, playerContext) ? ShuffleOverride.FORCE_DISABLE_SHUFFLE : ShuffleOverride.FORCE_ENABLE_SHUFFLE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SessionState sessionState) {
        return Boolean.valueOf(sessionState != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Boolean bool) {
        return bool.booleanValue() ? wit.a((xfk<T>) this.j) : NeverObservableHolder.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ActionCallback actionCallback, String str2) {
        a(jva.g(str2).h(), new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), str, actionCallback);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str, ActionCallback actionCallback, Throwable th) {
        Object[] objArr = {str};
        String str2 = "FRssd ltsIl eaoi e rev%U";
        Logger.e(th, "Failed to resolve URI %s", objArr);
        String str3 = "r_umindavii";
        actionCallback.onActionForbidden(Lists.a((E[]) new String[]{th.getMessage(), "invalid_uri"}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, PlayOptions playOptions, ActionCallback actionCallback, vld vld) {
        HashMap hashMap;
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        String sb2 = sb.toString();
        fqn fqn = this.f;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap(2);
        }
        if (vld == null || vld.a() == null) {
            LinkType linkType = jva.a(str).b;
            LinkType linkType2 = LinkType.COLLECTION_TRACKS;
            String str2 = Metadata.ADDED_AT;
            String str3 = PlayerContext.Metadata.SORTING_CRITERIA;
            if (linkType == linkType2) {
                String str4 = "sS %EbD";
                hashMap.put(str3, String.format("%s DESC", new Object[]{str2}));
            } else if (linkType == LinkType.SHOW_SHOW && fqn.b(sgn.a)) {
                String str5 = "b%SsC ";
                hashMap.put(str3, String.format("%s ASC", new Object[]{str2}));
            } else if (linkType == LinkType.COLLECTION_ALBUM) {
                String str6 = "bdbrsaute_icm_mnu";
                String str7 = "ecbnu_blptmr_raaku";
                String str8 = "s SC%A ,st";
                hashMap.put(str3, String.format("%s, %s ASC", new Object[]{"album_disc_number", "album_track_number"}));
            }
        } else {
            String p = vld.a().p();
            if (!TextUtils.isEmpty(p)) {
                String str9 = "_rayoeltpitf_tom";
                hashMap.put(PlayerContext.Metadata.FORMAT_LIST_TYPE, p);
            }
        }
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb2, hashMap);
        this.b.play(createFromContextUrl, a(playOptions, vld, createFromContextUrl), this.m.a(str, actionCallback));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        String str = "c syeaalddskt aepuo ppbfdtee la";
        Logger.e(th, "failed to update playback speed", new Object[0]);
    }

    private static boolean a(PlayerContext playerContext) {
        return jva.a(playerContext.uri(), LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE);
    }

    private static boolean a(tvn tvn, vld vld, PlayerContext playerContext) {
        return (vld != null ? ((Boolean) vld.a().n().a(Boolean.FALSE)).booleanValue() : false) || a(playerContext) || a(vld, tvn);
    }

    private static boolean a(vld vld, tvn tvn) {
        vlc a2 = vld == null ? null : vld.a();
        return a2 != null && tvn.a(a2.p()) == FormatListType.CAR_MIX;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vld b(Throwable th) {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Throwable th) {
        String str = "eetmas otoisoisetlycnnitntr  socsa  nlg bt toaeg pluate";
        Logger.e(th, "unable to get session state to start playing collection", new Object[0]);
    }

    private xii<vld> g(String str) {
        String str2 = "inlk";
        String str3 = "rAstormsoLtietubattf";
        String str4 = "formatListAttributes";
        String str5 = "osepTbimyatrtL";
        String str6 = "formatListType";
        String str7 = "ancisTbrtkascn";
        String str8 = "containsTracks";
        String str9 = "nepsosottdiacisn";
        String str10 = "containsEpisodes";
        String str11 = "eEocsasdpoipodniAtinu";
        String str12 = "containsAudioEpisodes";
        String str13 = "nedmIseOFtDainer";
        String str14 = "isOnDemandInFree";
        return xim.a(wit.a((SingleSource<T>) this.k.a(str, defpackage.vje.a.t().i(vkg.a(0, 0)).a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.g().b("link", Boolean.TRUE).b(str4, Boolean.TRUE).b(str6, Boolean.TRUE).b(str8, Boolean.TRUE).b(str10, Boolean.TRUE).b(str12, Boolean.TRUE).b(str14, Boolean.TRUE).b()).a()).a()).a())).a())).d($$Lambda$ExternalIntegrationServicePlaybackImpl$Tmpw6jitq8ASg3B3jTjorMkeno.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h() {
    }

    public final xii<PlayerState> a() {
        return this.i.h(new xiy() {
            public final Object call(Object obj) {
                return ExternalIntegrationServicePlaybackImpl.this.a((Boolean) obj);
            }
        });
    }

    public final void a(int i2) {
        this.h.a(wit.a(this.d.a(i2).a((Action) $$Lambda$ExternalIntegrationServicePlaybackImpl$X9D4K_YEWe2VXoFgB_5NyNDOdKk.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ExternalIntegrationServicePlaybackImpl$Uqnv5X3CiPc2JCxspaJTVE2LiE.INSTANCE)));
    }

    public final void a(int i2, String str, PlayerQueue playerQueue, ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        if (i2 == 0) {
            actionCallback.onActionSuccess();
            return;
        }
        String str2 = "idsex";
        String str3 = "index";
        if (i2 < 0) {
            PlayerTrack[] prevTracks = playerQueue.prevTracks();
            fbp.a(-i2, prevTracks.length + 1, str3);
            this.b.skipToPastTrack(prevTracks[prevTracks.length + i2]);
            actionCallback.onActionSuccess();
        } else {
            PlayerTrack[] nextTracks = playerQueue.nextTracks();
            int i3 = i2 - 1;
            fbp.a(i3, nextTracks.length, str3);
            this.b.skipToFutureTrack(nextTracks[i3], actionCallback);
        }
        long j2 = (long) i2;
        String str4 = "lfumau_eqome_yp";
        String str5 = "ue_yop_lefuoarm";
        String str6 = str;
        this.c.a(str, "play_from_queue", "play_from_queue", (String) null, (byte[]) null);
        String str7 = "luyr.bLPlolHgnegeo%dpoF:em rieaQexdu";
        Logger.a("LogHelper.logPlayFormQueue index: %d", Long.valueOf(j2));
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

    public final void a(PlayerContext playerContext, PlayOptions playOptions, String str, ActionCallback actionCallback) {
        this.b.play(playerContext, a((PlayOptions) null, (vld) null, playerContext), this.m.a(playerContext.uri(), this.g));
        this.c.a(str, playerContext.uri());
    }

    public final void a(fqn fqn) {
        this.f = fqn;
    }

    public final void a(String str) {
        if (b() != null && AudioStream.ALARM == b().audioStream()) {
            d(str);
        }
        this.b.pause();
        this.c.a(str, 0);
    }

    public final void a(String str, PlayOptions playOptions, String str2, ActionCallback actionCallback) {
        String str3 = str;
        PlayOptions playOptions2 = playOptions;
        String str4 = str2;
        ActionCallback actionCallback2 = actionCallback;
        a(str, playOptions, null, str2, actionCallback);
    }

    public final void a(String str, PlayOptions playOptions, Map<String, String> map, String str2, ActionCallback actionCallback) {
        fqn fqn = this.f;
        if (fqn == null || !fqn.a()) {
            String str3 = "ao agrlt onplfgeariasab riC leUdlydel e";
            Logger.e("Calling playUri before flags are loaded", new Object[0]);
        } else if (str.isEmpty()) {
            String str4 = "avue lbuxeaca/ swi  nryhgnneued)i rsiactob Ia(ermi/snaldidc m du-h til dtop//l eUmass.ol";
            Logger.d("playUri should be called with a valid context-uri. Issuing a 'resume()'command instead", new Object[0]);
            a(str2, actionCallback);
        } else {
            this.c.a(str2, str);
            if (actionCallback == null) {
                actionCallback = this.g;
            }
            xii g2 = g(str);
            $$Lambda$ExternalIntegrationServicePlaybackImpl$cUvDaQMMme3tzcwHvlVXHqbvgQ r0 = r0;
            Map<String, String> map2 = map;
            PlayOptions playOptions2 = playOptions;
            $$Lambda$ExternalIntegrationServicePlaybackImpl$cUvDaQMMme3tzcwHvlVXHqbvgQ r02 = new xis(str, map, playOptions, actionCallback) {
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
                    Object obj2 = obj;
                    ExternalIntegrationServicePlaybackImpl.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (vld) obj);
                }
            };
            this.h.a(g2.a((xis<? super T>) r02, (xis<Throwable>) new xis(str, actionCallback) {
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

    public final void a(String str, ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        this.b.resume(actionCallback);
        this.c.a(str, 1);
    }

    public final PlayerState b() {
        return this.b.getLastPlayerState();
    }

    public final void b(String str) {
        this.b.setShufflingContext(true);
        this.c.a(str, true);
    }

    public final void b(String str, final ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        this.b.skipToNextTrack((ActionCallback) new ActionCallback() {
            public final void onActionForbidden(List<String> list) {
                actionCallback.onActionForbidden(list);
                ExternalIntegrationServicePlaybackImpl.this.a.onNext(new RestrictedMediaAction(Type.SKIP_NEXT, list));
            }

            public final void onActionSuccess() {
                actionCallback.onActionSuccess();
            }
        });
        this.c.b(str, 1);
    }

    public final xii<RestrictedMediaAction> c() {
        return this.a;
    }

    public final void c(String str) {
        this.b.setShufflingContext(false);
        this.c.a(str, false);
    }

    public final void c(String str, final ActionCallback actionCallback) {
        if (actionCallback == null) {
            actionCallback = this.g;
        }
        this.b.skipToPreviousTrack(new ActionCallback() {
            public final void onActionForbidden(List<String> list) {
                actionCallback.onActionForbidden(list);
                ExternalIntegrationServicePlaybackImpl.this.a.onNext(new RestrictedMediaAction(Type.SKIP_PREVIOUS, list));
            }

            public final void onActionSuccess() {
                actionCallback.onActionSuccess();
            }
        });
        this.c.b(str, -1);
    }

    public final xii<Integer> d() {
        return wit.a((ObservableSource<T>) this.d.a(), BackpressureStrategy.BUFFER);
    }

    public final void d(String str) {
        this.b.setRepeatingContext(false);
        this.b.setRepeatingTrack(false);
        this.c.c(str, 0);
    }

    public final void d(String str, ActionCallback actionCallback) {
        this.h.a(wit.a((xfk<T>) this.e.a).c((xiy<? super T, Boolean>) $$Lambda$ExternalIntegrationServicePlaybackImpl$bnsSYZDleRE2iWyAFlt44W46Iuo.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$nbqngfNSdfLKjtSNO4Px3HrEIDo.INSTANCE).a(1).a((xis<? super T>) new xis(str, null) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ ActionCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void call(Object obj) {
                ExternalIntegrationServicePlaybackImpl.this.a(this.f$1, this.f$2, (String) obj);
            }
        }, (xis<Throwable>) $$Lambda$ExternalIntegrationServicePlaybackImpl$jWFk07iepo9pCYg_lyN2r6jDz0g.INSTANCE));
    }

    public final void e() {
        this.h.a();
        this.m.a.c();
    }

    public final void e(String str) {
        this.b.setRepeatingContext(false);
        this.b.setRepeatingTrack(true);
        this.c.c(str, 1);
    }

    public final void f() {
        this.i.onNext(Boolean.TRUE);
    }

    public final void f(String str) {
        this.b.setRepeatingContext(true);
        this.b.setRepeatingTrack(false);
        this.c.c(str, 2);
    }

    public final void g() {
        this.i.onNext(Boolean.FALSE);
    }
}
