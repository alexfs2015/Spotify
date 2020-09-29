package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Capabilities;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Empty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Image;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItem;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItems;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.RootListOptions;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil.Streamtype;
import com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil.UriOptionExtras;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ikv reason: default package */
public final class ikv {
    final Context a;
    final hpt b;
    final ilq c;
    final Scheduler d;
    final Scheduler e;
    final kwf f;
    final AtomicInteger g = new AtomicInteger();
    final ikq h;
    HelloDetails i;
    String j;
    boolean k;
    imt l;
    hqr m;
    hpu n;
    hqf o;
    hqn p;
    ikw q;
    String r = "default";
    private final SpeedControlInteractor s;
    private final ilk t;
    private final mip u;
    private final jty v;
    private final hwi w;
    private Disposable x;

    /* renamed from: ikv$a */
    static class a implements defpackage.ilk.a {
        private final SingleEmitter<Image> a;
        private final int b;
        private final int c;

        public a(SingleEmitter<Image> singleEmitter, int i, int i2) {
            this.a = singleEmitter;
            this.b = i;
            this.c = i2;
        }

        public final void a() {
            this.a.a((Throwable) new IapException(new Message("Failed to load image."), "wamp.error"));
        }

        public final void a(byte[] bArr) {
            this.a.a(new Image(bArr, this.b, this.c));
        }

        public final void b() {
            this.a.a((Throwable) new IapException(new Message("Image was cancelled due to throttling."), "wamp.error"));
        }
    }

    public ikv(Context context, hpt hpt, iks iks, ilk ilk, SpeedControlInteractor speedControlInteractor, Scheduler scheduler, Scheduler scheduler2, kwf kwf, mip mip, jty jty) {
        this.a = context;
        this.h = new ikq(iks);
        this.b = hpt;
        this.s = speedControlInteractor;
        this.t = ilk;
        this.u = mip;
        this.c = new ilq();
        this.w = new hwi();
        this.e = scheduler;
        this.d = scheduler2;
        this.f = kwf;
        this.v = jty;
    }

    private static int a(int i2, int i3) {
        return i2 > 0 ? Math.min(i2, Image.MAX_IMAGE_DIMENSION) : Math.min(i3, Image.MAX_IMAGE_DIMENSION);
    }

    private static ActionCallback a(final SingleEmitter<Empty> singleEmitter, final String str) {
        return new ActionCallback() {
            public final void onActionForbidden(List<String> list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": [%s]");
                singleEmitter.a((Throwable) new IapException(new Message(String.format(sb.toString(), new Object[]{ikv.a((Set<String>) ImmutableSet.a((Collection<? extends E>) list))})), "wamp.error"));
            }

            public final void onActionSuccess() {
                singleEmitter.a(AppProtocol.a);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppProtocol.Context a(ho hoVar) {
        return hoVar.b == null ? AppProtocol.Context.EMPTY : new AppProtocol.Context((tmm) fbp.a(((ho) hoVar.b).b), (PlayerState) fbp.a(((ho) hoVar.b).a), this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(Saved saved, PlayerState playerState) {
        PlayerTrack playerTrack = null;
        String contextUri = playerState != null ? playerState.contextUri() : null;
        if (saved.uri != null) {
            a(saved.saved, saved.uri, contextUri);
        } else {
            if (playerState != null) {
                playerTrack = playerState.track();
            }
            if (playerTrack == null) {
                Assertion.a("Track is null");
                return AppProtocol.a;
            }
            a(saved.saved, playerTrack.uri(), contextUri);
        }
        return AppProtocol.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(Shuffle shuffle, PlayerState playerState) {
        PlayerRestrictions restrictions = playerState.restrictions();
        if (restrictions.disallowTogglingShuffleReasons().isEmpty()) {
            if (shuffle.shuffle) {
                this.o.b(this.m.d());
            } else {
                this.o.c(this.m.d());
            }
            return AppProtocol.a;
        }
        throw new IapException(new Message(String.format("Cannot set shuffle: [%s]", new Object[]{a(restrictions.disallowTogglingShuffleReasons())})), "wamp.error");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(Uri uri, PlayerState playerState) {
        PlayerRestrictions restrictions = playerState.restrictions();
        if (restrictions.disallowInsertingIntoNextTracksReasons().isEmpty()) {
            this.b.h().a(this.a, uri.uri, this.m.d());
            return AppProtocol.a;
        }
        throw new IapException(new Message(String.format("Cannot queue specified uri: [%s]", new Object[]{a(restrictions.disallowInsertingIntoNextTracksReasons())})), "wamp.error");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(String str) {
        this.p.a(str, this.m.d());
        return AppProtocol.a;
    }

    static /* synthetic */ ListItems a(List list, int i2, int i3) {
        int i4 = i2;
        int i5 = i3 == 0 ? Integer.MAX_VALUE : i3;
        if (i5 <= 0 || i4 < 0 || i4 >= list.size()) {
            List list2 = list;
            return new ListItems(i5, i4, list.size(), new ListItem[0]);
        }
        ArrayList arrayList = new ArrayList(Math.min(list.size(), i5));
        int i6 = i4;
        while (i6 < i4 + i5 && i6 < list.size()) {
            MediaBrowserItem mediaBrowserItem = (MediaBrowserItem) list.get(i6);
            ListItem listItem = r7;
            ListItem listItem2 = new ListItem(mediaBrowserItem.a, mediaBrowserItem.a, String.valueOf(mediaBrowserItem.e), mediaBrowserItem.c, mediaBrowserItem.d == null ? "" : mediaBrowserItem.d, mediaBrowserItem.b == ActionType.PLAYABLE, mediaBrowserItem.b == ActionType.BROWSABLE, mediaBrowserItem.g);
            arrayList.add(listItem);
            i6++;
        }
        List list3 = list;
        return new ListItems(i5, i4, list.size(), (ListItem[]) arrayList.toArray(new ListItem[0]));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Saved a(Identifier identifier, PlayerState playerState) {
        PlayerTrack track = playerState != null ? playerState.track() : null;
        if (track == null) {
            return new Saved(playerState);
        }
        if (!Boolean.parseBoolean((String) track.metadata().get("collection.can_add"))) {
            return new Saved(identifier.id, false, false);
        }
        return new Saved(identifier.id, Boolean.parseBoolean((String) track.metadata().get("collection.in_collection")), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SessionState a(com.spotify.mobile.android.service.session.SessionState sessionState) {
        return new SessionState(sessionState, jvt.a(this.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TrackData a(usi usi, PlayerState playerState) {
        return TrackData.trackDataFor(usi, playerState, this.b.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PlaybackPosition playbackPosition, PlayerState playerState) {
        return a(new PlaybackPosition(Math.min(Math.max(0, playerState.currentPlaybackPosition() + playbackPosition.position), playerState.duration())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(AppProtocol.PlayerState playerState) {
        return playerState.track.isEpisode && playerState.track.isPodcast ? Observable.b(playerState) : IapException.a("Playback speed is only supported for Podcast playback");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Boolean bool) {
        return bool.booleanValue() ? Observable.b(AppProtocol.a) : Observable.c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Throwable th) {
        return th instanceof TimeoutException ? IapException.a("Failed to switch to local device.") : Observable.a(th);
    }

    static String a(HelloDetails helloDetails) {
        return helloDetails.info.isCategoryCar() ? "default-cars" : "default";
    }

    static String a(Set<String> set) {
        return (set.contains(DisallowReasons.MFT) || set.contains("disallow-mft-radio")) ? "CANT_PLAY_ON_DEMAND" : (set.contains(DisallowReasons.AD) || set.contains("endless_context") || set.contains("disallow-radio")) ? "ACTION_NOT_ALLOWED_IN_CONTEXT" : set.contains("invalid_uri") ? "NOT_A_VALID_URI" : set.contains(PlayerError.ERROR_IN_OFFLINE_MODE) ? "TRACK_UNAVAILABLE_OFFLINE" : "UNKNOWN";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final ChildrenPageRequest childrenPageRequest, final SingleEmitter singleEmitter) {
        final int intValue = childrenPageRequest.limit == null ? 20 : childrenPageRequest.limit.intValue();
        hpu hpu = this.n;
        huo a2 = huo.a(childrenPageRequest.parentId, false).c(this.i.info.name).d(this.i.info.id).a(this.r).a();
        new Bundle();
        hpu.a(a2, new huq() {
            public final void a(List<MediaBrowserItem> list) {
                singleEmitter.a(ikv.a((List) list, childrenPageRequest.offset, intValue));
            }
        }, (long) childrenPageRequest.offset, (long) intValue, this.m.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ImageIdentifier imageIdentifier, int i2, int i3, boolean z, SingleEmitter singleEmitter) {
        int a2 = a(imageIdentifier.width, i2);
        int a3 = a(imageIdentifier.height, i3);
        String str = imageIdentifier.imageType != null ? imageIdentifier.imageType : this.i.info.imageType;
        if (!this.k) {
            ilk ilk = this.t;
            if (!ilk.c) {
                synchronized (ilk.b) {
                    for (b a4 : ilk.b) {
                        a4.a();
                    }
                }
            }
        }
        this.t.a(android.net.Uri.parse(imageIdentifier.id), ("jpeg".equals(str) || !"png".equals(str)) ? ImageFormat.JPEG : ImageFormat.PNG, a2, a3, z, new a(singleEmitter, a2, a3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlaybackPosition playbackPosition, SingleEmitter singleEmitter) {
        this.o.a(playbackPosition.position, a(singleEmitter, "Cannot seek in song"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RootListOptions rootListOptions, final SingleEmitter singleEmitter) {
        String str;
        if (rootListOptions != null) {
            if (!"default".equals(rootListOptions.type)) {
                str = rootListOptions.type;
                this.r = str;
                new Bundle().putString("_type", str);
                this.n.a(huo.a(this.j, true).c(this.i.info.name).d(this.i.info.id).a(str).a(), new huq() {
                    public final void a(List<MediaBrowserItem> list) {
                        singleEmitter.a(ikv.a((List) list, 0, list.size()));
                    }
                }, 0, 20, this.m.d());
            }
        }
        str = a(this.i);
        this.r = str;
        new Bundle().putString("_type", str);
        this.n.a(huo.a(this.j, true).c(this.i.info.name).d(this.i.info.id).a(str).a(), new huq() {
            public final void a(List<MediaBrowserItem> list) {
                singleEmitter.a(ikv.a((List) list, 0, list.size()));
            }
        }, 0, 20, this.m.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, SingleEmitter singleEmitter) {
        a(uri.uri, (PlayOptions) null, singleEmitter);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SingleEmitter singleEmitter) {
        this.o.c(this.m.d(), a(singleEmitter, "Cannot skip song"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(SingleEmitter singleEmitter, Throwable th) {
        Logger.e(th, "Couldn't subscribe to flags", new Object[0]);
        singleEmitter.a((Throwable) new IapException(new Message("Cannot play specified uri"), "wamp.error"));
    }

    private void a(String str, PlayOptions playOptions, SingleEmitter<Empty> singleEmitter) {
        if (jva.a(str).b == LinkType.PROFILE_PLAYLIST) {
            Assertion.b("Unsupported playlist URI. [https://spoti.fi/2NwLTih]");
            jva a2 = jva.a(str);
            StringBuilder sb = new StringBuilder();
            sb.append("spotify:");
            List pathSegments = a2.a.getPathSegments();
            for (int i2 = 0; i2 < pathSegments.size(); i2++) {
                if (sb.charAt(sb.length() - 1) != ':') {
                    sb.append(':');
                }
                if (i2 == 0) {
                    sb.append("playlist:");
                } else {
                    sb.append(android.net.Uri.encode((String) pathSegments.get(i2)));
                }
            }
            str = jva.a(sb.toString()).a(1, 2);
        }
        this.b.i().a().a(0).d().a((Consumer<? super T>) new $$Lambda$ikv$MEdWS1F9IEqJhS0bHI1TL7j4WEw<Object>(this, str, singleEmitter, playOptions), (Consumer<? super Throwable>) new $$Lambda$ikv$YrT20Gsp0bo2Pkkr51Mgm0cB4Hk<Object>(singleEmitter));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(java.lang.String r18, io.reactivex.SingleEmitter r19, com.spotify.mobile.android.cosmos.player.v2.PlayOptions r20, defpackage.fqn r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            jva r2 = defpackage.jva.a(r18)
            com.spotify.mobile.android.util.LinkType r2 = r2.b
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.TRACK
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x003f
            boolean r2 = r21.a()
            java.lang.String r3 = "Flags must be loaded if we are here."
            com.spotify.mobile.android.util.Assertion.a(r3, r2)
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Capabilities r2 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Capabilities
            fqk r3 = defpackage.gwf.a
            r6 = r21
            java.io.Serializable r3 = r6.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.<init>(r3)
            boolean r2 = r2.canPlayOnDemand
            if (r2 != 0) goto L_0x003f
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r3 = "CANT_PLAY_ON_DEMAND"
            r2[r4] = r3
            java.util.HashSet r2 = com.google.common.collect.Sets.a((E[]) r2)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            goto L_0x0043
        L_0x003f:
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x0043:
            hqr r3 = r0.m
            rzt r3 = r3.a()
            java.lang.String r3 = r3.b
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0075
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r5 = ","
            fbl r5 = defpackage.fbl.a(r5)
            java.lang.String r2 = r5.a(r2)
            r3[r4] = r2
            java.lang.String r2 = "Cannot play specified uri: [%s]"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            com.spotify.mobile.android.spotlets.appprotocol.IapException r3 = new com.spotify.mobile.android.spotlets.appprotocol.IapException
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Message r4 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Message
            r4.<init>(r2)
            java.lang.String r2 = "wamp.error"
            r3.<init>(r4, r2)
            r1.a(r3)
            return
        L_0x0075:
            jva r2 = defpackage.jva.a(r18)
            java.lang.String r6 = "9cc4aaeb43f24b098cff096385f00233"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0088
            com.spotify.mobile.android.util.LinkType r2 = r2.b
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.TRACK
            if (r2 != r3) goto L_0x0088
            r4 = 1
        L_0x0088:
            java.lang.String r2 = "Cannot play specified uri"
            if (r4 == 0) goto L_0x0143
            ikw r3 = r0.q
            com.spotify.mobile.android.cosmos.player.v2.Player$ActionCallback r9 = a(r1, r2)
            hpt r1 = r3.a
            hqf r4 = r1.d()
            if (r20 != 0) goto L_0x00a4
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r1.<init>()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r1 = r1.build()
            goto L_0x00a6
        L_0x00a4:
            r1 = r20
        L_0x00a6:
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r2 = r1.suppressions()
            java.util.HashSet r5 = new java.util.HashSet
            if (r2 == 0) goto L_0x00b3
            java.util.Set r2 = r2.providers()
            goto L_0x00b7
        L_0x00b3:
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x00b7:
            r5.<init>(r2)
            java.lang.String r2 = "mft/inject_random_tracks"
            r5.add(r2)
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r2 = new com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions
            r2.<init>(r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r5 = com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides.create(r5, r6, r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r6.<init>()
            boolean r7 = r1.allowSeeking()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.allowSeeking(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r7 = r1.audioStream()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.audioStream(r7)
            java.util.Map r7 = r1.configurationOverride()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.configurationOverride(r7)
            boolean r7 = r1.initiallyPaused()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.initiallyPaused(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Operation r7 = r1.operation()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.operation(r7)
            java.lang.String r7 = r1.playbackId()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.playbackId(r7)
            java.lang.Long r7 = r1.seekTo()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.seekTo(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r7 = r1.skipTo()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.skipTo(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r2 = r6.suppressions(r2)
            boolean r6 = r1.systemInitiated()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r2 = r2.systemInitiated(r6)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Trigger r1 = r1.trigger()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = r2.trigger(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = r1.playerOptionsOverride(r5)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r6 = r1.build()
            java.lang.String r1 = "autoplay_candidate"
            java.lang.String r2 = "false"
            com.google.common.collect.ImmutableMap r7 = com.google.common.collect.ImmutableMap.b(r1, r2)
            hqr r1 = r3.b
            java.lang.String r8 = r1.d()
            r5 = r18
            r4.a(r5, r6, r7, r8, r9)
            return
        L_0x0143:
            hwi r10 = r0.w
            hpt r12 = r0.b
            hqr r3 = r0.m
            java.lang.String r13 = r3.d()
            com.spotify.mobile.android.cosmos.player.v2.Player$ActionCallback r14 = a(r1, r2)
            jty r1 = r0.v
            r11 = r18
            r15 = r20
            r16 = r1
            r10.a(r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikv.a(java.lang.String, io.reactivex.SingleEmitter, com.spotify.mobile.android.cosmos.player.v2.PlayOptions, fqn):void");
    }

    private void a(boolean z, String str, String str2) {
        if (z) {
            this.b.b().a(str, str2, this.m.d());
        } else {
            this.b.b().a(str, this.m.d());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, String str, SingleEmitter singleEmitter) {
        PlayOptions playOptions = null;
        try {
            if (Arrays.asList(strArr).contains(null) || strArr.length == 0) {
                Logger.d("Attempting to get UriOptionExtras for empty option extras", new Object[0]);
                throw new IllegalArgumentException("Option extras cannot be empty.");
            }
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                Streamtype a2 = Streamtype.a(strArr[i2]);
                if (!hashMap.containsKey(UriOptionExtras.STREAMTYPE)) {
                    if (Streamtype.UNKNOWN_STREAMTYPE != a2) {
                        hashMap.put(UriOptionExtras.STREAMTYPE, a2);
                    }
                    i2++;
                } else {
                    Logger.d("Found duplicate UriOptionExtras", new Object[0]);
                    throw new IllegalArgumentException(String.format("Duplicate use not allowed for value of option extra [%s]", new Object[]{UriOptionExtras.STREAMTYPE.type}));
                }
            }
            if (!hashMap.isEmpty()) {
                if (hashMap.containsKey(UriOptionExtras.STREAMTYPE) && Streamtype.ALARM == ((Streamtype) hashMap.get(UriOptionExtras.STREAMTYPE))) {
                    Logger.b("UriOptionExtra StreamTypeAlarm", new Object[0]);
                    playOptions = new Builder().audioStream(AudioStream.ALARM).build();
                }
                a(str, playOptions, singleEmitter);
                return;
            }
            Logger.d("Unknown UriOptionExtras", new Object[0]);
            throw new IllegalArgumentException("Unknown option extras");
        } catch (Exception e2) {
            singleEmitter.a((Throwable) new IapException(e2.getMessage(), "wamp.error"));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return playerState.track() != null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerTrack playerTrack) {
        return playerTrack != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty b(Rating rating) {
        int i2 = rating.rating;
        if (i2 == -1) {
            this.p.a(false, this.m.d());
        } else if (i2 != 1) {
            StringBuilder sb = new StringBuilder("Unexpected rating ");
            sb.append(rating.rating);
            Assertion.a(sb.toString());
        } else {
            this.p.a(true, this.m.d());
        }
        return AppProtocol.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty b(Repeat repeat) {
        int i2 = repeat.repeat;
        if (i2 == 0) {
            this.o.d(this.m.d());
        } else if (i2 == 1) {
            this.o.e(this.m.d());
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder("Unexpected repeat ");
            sb.append(repeat.repeat);
            Assertion.a(sb.toString());
        } else {
            this.o.f(this.m.d());
        }
        return AppProtocol.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource b(Boolean bool) {
        return bool.booleanValue() ? Observable.b(bool) : IapException.a("Playback speed can only be set on local device");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SingleEmitter singleEmitter) {
        this.o.b(this.m.d(), a(singleEmitter, "Cannot skip song"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource c(Throwable th) {
        return th instanceof TimeoutException ? IapException.a("Unable to start radio") : Observable.a(th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(PlayerState playerState) {
        return !playerState.isPaused();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(Identifier identifier) {
        return (identifier == null || fbo.a(identifier.id)) ? wit.b(this.o.a()).a((Predicate<? super T>) $$Lambda$ikv$vC6KhDRMkc439UoFimXqw6CqfzU.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a((Predicate<? super T>) $$Lambda$ikv$PwlxguIQtzVp3kzUMHFGQ_ZKuYo.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE) : Observable.b(identifier.id);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource d(Throwable th) {
        return th instanceof TimeoutException ? IapException.a("Failed to play.") : Observable.a(th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(PlayerState playerState) {
        return !playerState.isPaused();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty e(Identifier identifier) {
        this.w.a(identifier.id, this.b, this.m.d(), null, null, this.v);
        return AppProtocol.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource e(Throwable th) {
        return th instanceof TimeoutException ? IapException.a("Failed to pause.") : Observable.a(th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource f(Throwable th) {
        return th instanceof TimeoutException ? IapException.a("Failed to set Podcast playback speed.") : Observable.a(th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean f(PlayerState playerState) {
        return playerState.isPaused() || !playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean g(PlayerState playerState) {
        return playerState.isPaused() || !playerState.isPlaying();
    }

    private void r() {
        Disposable disposable = this.x;
        if (disposable != null) {
            if (!disposable.b()) {
                this.x.bd_();
            }
            this.x = null;
        }
    }

    private Completable s() {
        return n().a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ikv$XgsIudESQxzXtM4vU7wvLT13sGg.INSTANCE, false).g();
    }

    private Completable t() {
        return wit.b(this.b.c().d()).a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ikv$LObXVeGyf0pa_Mz1kldh5alJr9c.INSTANCE, false).g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.b.c().c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Saved v() {
        return new Saved(this.o.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.o.a(this.m.d(), (ActionCallback) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.o.a(this.m.d());
    }

    /* access modifiers changed from: 0000 */
    public Observable<Empty> a(int i2) {
        return ((SpeedControlInteractor) fbp.a(this.s)).a(i2).c((CompletableSource) this.h.a(2)).b((CompletableSource) t()).b((CompletableSource) s()).e().c((ObservableSource<? extends T>) Observable.b(AppProtocol.a)).c((Function<? super T, ? extends R>) $$Lambda$ikv$V5fvQU0oyp2ZDAXJP8CWP2Q7lM.INSTANCE).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ikv$v2VupwqglVGfoLnq5YagOUP3E8E.INSTANCE);
    }

    public final Observable<ListItems> a(ChildrenPageRequest childrenPageRequest) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$q11zR5Ne1PnFnZwL5Z8mvLjHk<T>(this, childrenPageRequest)).d().f((ObservableSource<? extends T>) this.h.a(8).e());
    }

    public final Observable<Saved> a(Identifier identifier) {
        return (identifier == null || identifier.id == null || identifier.id.isEmpty()) ? Observable.b((Callable<? extends T>) new $$Lambda$ikv$oTJ_Lk8B5RFkZ_yOgkq5xJSJ7G4<Object>(this)).f((ObservableSource<? extends T>) this.h.a(1).e()) : wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$ikv$3DoecgBh_aw_nijF2H4weerlMXg<Object,Object>(identifier));
    }

    /* access modifiers changed from: 0000 */
    public Observable<Image> a(ImageIdentifier imageIdentifier, int i2, int i3, boolean z) {
        $$Lambda$ikv$hupm4liUfqaRI38L3Kd7nk1u6E r0 = new $$Lambda$ikv$hupm4liUfqaRI38L3Kd7nk1u6E(this, imageIdentifier, i2, i3, z);
        return Single.a((SingleOnSubscribe<T>) r0).d();
    }

    public final Observable<Empty> a(PlaybackPosition playbackPosition) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$LAZJyBsOuuKJ65bQ6WRhCj80w<T>(this, playbackPosition)).d().f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    public final Observable<Empty> a(Rating rating) {
        return Observable.b((Callable<? extends T>) new $$Lambda$ikv$CrrM_xnmMPqjbnt0_KbfrqZw0YA<Object>(this, rating)).f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    public final Observable<Empty> a(Repeat repeat) {
        return Observable.b((Callable<? extends T>) new $$Lambda$ikv$PW2pcdaAWfrMUZyPEwqnFfNHF8Q<Object>(this, repeat)).f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    public final Observable<ListItems> a(RootListOptions rootListOptions) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$_fSRIGcorr37R57zcFBHwWNeU<T>(this, rootListOptions)).d().f((ObservableSource<? extends T>) this.h.a(8).e());
    }

    public final Observable<Empty> a(Saved saved) {
        return wit.b(this.b.d().a()).f((ObservableSource<? extends T>) this.h.a(1).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$ikv$5hYhJwsEShgPIzg4qAMb2QlQYo<Object,Object>(this, saved));
    }

    public final Observable<Empty> a(Shuffle shuffle) {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$ikv$1mDE69gNYZNNbJJNBENpDpdoCiY<Object,Object>(this, shuffle));
    }

    public final Observable<Empty> a(Uri uri) {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(2).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$ikv$dmalZ018ODvE2sheUBTg0EjxEfA<Object,Object>(this, uri));
    }

    public final Observable<Empty> a(String str, String[] strArr) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$1T66BTYIGVUsLi5v4LeeUNOj86A<T>(this, strArr, str)).d().f((ObservableSource<? extends T>) this.h.a(2).e());
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Flowable<com.spotify.mobile.android.service.session.SessionState> flowable = this.b.g().a;
        ikq ikq = this.h;
        ikq.getClass();
        this.x = flowable.a((Consumer<? super T>) new $$Lambda$wLa1VJAKkr7rXQzRFTATot5W7o<Object>(ikq), (Consumer<? super Throwable>) $$Lambda$ikv$NzWMk2eZDJLR6tkC1TW7HOlBlQw.INSTANCE);
    }

    public final Observable<Empty> b(Identifier identifier) {
        return Observable.b((Callable<? extends T>) new $$Lambda$ikv$l6QWKTPq4LrZrvMvxR4NXgYQmgI<Object>(this, identifier)).f((ObservableSource<? extends T>) this.h.a(8).e());
    }

    public final Observable<Empty> b(PlaybackPosition playbackPosition) {
        return wit.b(this.o.a()).a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ikv$4QmaFXuyipeObby3QNPVFeT4efw<Object,Object>(this, playbackPosition), false);
    }

    public final Observable<Empty> b(Uri uri) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$X1Un9MwgONCBpVmfQMfybyO5IDM<T>(this, uri)).d().f((ObservableSource<? extends T>) this.h.a(2).e());
    }

    public final void b() {
        r();
        hqr hqr = this.m;
        if (hqr != null) {
            hqr.c();
        }
        this.t.a();
        imt imt = this.l;
        if (imt != null) {
            imt.b();
        }
    }

    public final void b(int i2) {
        this.h.b(i2).c();
    }

    public final Observable<TrackData> c() {
        return Observable.a((ObservableSource<? extends T1>) wit.b(this.p.a()), (ObservableSource<? extends T2>) wit.b(this.o.a()), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$ikv$n54P2craJr9yCZ01ntg49JyuLz0<Object,Object,Object>(this)).f((ObservableSource<? extends T>) this.h.a(4).e());
    }

    public final Observable<Empty> c(Identifier identifier) {
        return Observable.b(identifier).f((ObservableSource<? extends T>) this.h.a(1).e()).h(new $$Lambda$ikv$YgmjEIhB3jGgMm_Q2U7vkMmkbGU(this)).c((Function<? super T, ? extends R>) new $$Lambda$ikv$yOMGRMyR2haHOjKSZ1Caf8nubQ<Object,Object>(this)).a(0).d().c(15, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ikv$KCeKyrKBLKH65DlKdLY8BnMva6c.INSTANCE);
    }

    public final Observable<TrackElapsed> d() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$lAB34NzXpRn8qYrqEfL4wvSzVjg.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public Observable<Empty> e() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).f((ObservableSource<? extends T>) Completable.a((Action) new $$Lambda$ikv$gZ3fe9m5M_iLSiuM9zNg0DKWMFU(this)).e()).b((Predicate<? super T>) $$Lambda$ikv$PGUN5NxxqJbeL7uTqsFXI8v93g4.INSTANCE).a((Predicate<? super T>) $$Lambda$ikv$h4LsAQRyRYXZMmB2yNMKVt3pmw.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ikv$5kWydUt20jJwTLRFgh7j7KhVIU.INSTANCE).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ikv$fVp7VWdNi6s3AweXt0mgIxhpQ.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public Observable<Empty> f() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).f((ObservableSource<? extends T>) Completable.a((Action) new $$Lambda$ikv$en0EvIDd1mSu9XVxDvXau82GeDs(this)).e()).b((Predicate<? super T>) $$Lambda$ikv$_yyQjf_hSWPKRlHhucYdE0VlSQ.INSTANCE).a((Predicate<? super T>) $$Lambda$ikv$wGfGfv0uLq3V6q_G1mWzd9RF4yk.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ikv$hd3WsJ1Z7iVObxcc4kKaC1Ji56M.INSTANCE).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ikv$EBeg7xqytRK_E5WkRheWUZlRX8s.INSTANCE);
    }

    public final Observable<PlaybackSpeed> g() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$MPeeVt7sIVYIJtx8LR2x7CArjDI.INSTANCE);
    }

    public final Observable<Empty> h() {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$qycvWtV3PFK14syXfCFEU6oN4Q<T>(this)).d().f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    public final Observable<Empty> i() {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ikv$VvaqMy3uqjXVDJ5buFkQPGIF5wo<T>(this)).d().f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    public final Observable<Shuffle> j() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys.INSTANCE);
    }

    public final Observable<Repeat> k() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$eRq0dBVBr_cUtuIOWKkl2GjaOrU.INSTANCE);
    }

    public final Observable<Rating> l() {
        return wit.b(this.p.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$cd6Vc4a87J97guHciJqtqlZMNxs.INSTANCE);
    }

    public final Observable<AppProtocol.Context> m() {
        return new ilu(this.b, this.e).a().f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$ikv$3rcsVw7GaEnTHLGHhIpv3wapOk<Object,Object>(this));
    }

    public final Observable<AppProtocol.PlayerState> n() {
        return wit.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg.INSTANCE);
    }

    public final Observable<SessionState> o() {
        return this.b.g().a.j().f((ObservableSource<? extends T>) this.h.b(4).e()).c((Function<? super T, ? extends R>) new $$Lambda$ikv$FPeNTwvukftfSXiXhTURGA8j7WE<Object,Object>(this));
    }

    public final Observable<Capabilities> p() {
        return this.b.i().a().e().j().f((ObservableSource<? extends T>) this.h.a().e()).a((Predicate<? super T>) $$Lambda$qTcPNaUa6AH8fr8X7JVMhLzoOTk.INSTANCE).c(30, TimeUnit.SECONDS).c((Function<? super T, ? extends R>) $$Lambda$ciah83Pyo6MkxTw71ih_wtxpXao.INSTANCE).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ikv$BBbIPQ9pbLCsNHOL1wIyLKHkW4.INSTANCE);
    }

    public final Observable<Empty> q() {
        return this.h.a(1).a((CompletableSource) Completable.a((Action) new $$Lambda$ikv$L_oACUmPFiYYwwJl4awpwt_8QhY(this))).a((ObservableSource<T>) wit.b(this.b.c().d()).b((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ikv$FWc1qpLx2EkIVoFIHkwsfas_vF8.INSTANCE, false).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$ikv$ljO_wtDBm5Kfkb2hvhI5gIcUhek.INSTANCE));
    }
}
