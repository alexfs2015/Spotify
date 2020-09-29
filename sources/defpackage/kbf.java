package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.jakewharton.rxrelay2.PublishRelay;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exception.ErrorType;
import com.spotify.mobile.android.video.exception.PlaybackException;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.mobile.android.video.model.PlayerState;
import com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason;
import com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.Reason;
import com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.UnplayableReason;
import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import com.spotify.mobile.android.video.model.VideoPlayerCommand.Type;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: kbf reason: default package */
public final class kbf implements kci {
    public static final VideoPlayerAdvanceReason a = new VideoPlayerAdvanceReason(Reason.FINISHED, null);
    public static final VideoPlayerAdvanceReason b = new VideoPlayerAdvanceReason(Reason.UNPLAYABLE, UnplayableReason.APP_IN_BACKGROUND);
    public static final VideoPlayerAdvanceReason c = new VideoPlayerAdvanceReason(Reason.UNPLAYABLE, UnplayableReason.NOT_AVAILABLE);
    private static final Set<String> g = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"video/webm", "video/mp4", "video/3gpp"})));
    public jzm d;
    public kad e;
    public kba f;
    private final PublishRelay<Request> h;
    private final RxResolver i;
    private final Scheduler j;
    /* access modifiers changed from: private */
    public final Scheduler k;
    private final rwl l;
    private final jzn m;
    private Disposable n;
    private Disposable o;
    private Optional<kab> p = Optional.e();
    /* access modifiers changed from: private */
    public Optional<Long> q = Optional.e();
    /* access modifiers changed from: private */
    public Optional<Disposable> r = Optional.e();
    private boolean s;
    private kai t;
    private kck u;

    /* renamed from: kbf$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type[] r0 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.STOP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.PAUSE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.RESUME     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.SEEK_TO     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.PREFETCH_TRACKS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kbf.AnonymousClass2.<clinit>():void");
        }
    }

    static {
        new VideoPlayerAdvanceReason(Reason.UNPLAYABLE, UnplayableReason.DRIVER_DISTRACTED);
        new VideoPlayerAdvanceReason(Reason.UNPLAYABLE, UnplayableReason.MISSING_MANIFEST_ID);
        new VideoPlayerAdvanceReason(Reason.UNPLAYABLE, UnplayableReason.NOT_AVAILABLE_OFFLINE);
    }

    public kbf(RxResolver rxResolver, Scheduler scheduler, Scheduler scheduler2, jzn jzn, List<kci> list, rwl rwl) {
        this.i = rxResolver;
        this.j = scheduler;
        this.k = scheduler2;
        this.h = PublishRelay.a();
        this.m = jzn;
        this.l = rwl;
        list.add(0, this);
        this.m.a(list);
    }

    /* access modifiers changed from: private */
    public Boolean a(String str, JacksonModel jacksonModel) {
        try {
            this.h.accept(new Request(Request.POST, str, new HashMap(), JacksonSerializer.toBytes(jacksonModel)));
            return Boolean.TRUE;
        } catch (ParserException unused) {
            Logger.d("Could not parse request", new Object[0]);
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c5, code lost:
        if (com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil.isAd(r1) == false) goto L_0x01c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(com.spotify.mobile.android.video.model.VideoPlayerCommand r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            java.lang.String r3 = "%s"
            com.spotify.base.java.logging.Logger.b(r3, r1)
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = r12.type
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r3 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.CONFIG
            if (r1 == r3) goto L_0x02c0
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = r12.type
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r3 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.SUBSCRIBED
            if (r1 != r3) goto L_0x0019
            goto L_0x02c0
        L_0x0019:
            jzm r1 = r11.d
            if (r1 != 0) goto L_0x0039
            jzn r1 = r11.m
            kad r3 = r11.e
            r1.g = r3
            jzm r1 = r1.a()
            r11.d = r1
            kai r1 = r11.t
            if (r1 == 0) goto L_0x0032
            jzm r3 = r11.d
            r3.a(r1)
        L_0x0032:
            jzm r1 = r11.d
            boolean r3 = r11.s
            r1.b(r3)
        L_0x0039:
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = r12.type
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r3 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.START
            if (r1 != r3) goto L_0x0227
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r1 = r12.trackWithPlayOrigin
            if (r1 == 0) goto L_0x01f0
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r1 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r1.track
            if (r1 != 0) goto L_0x004b
            goto L_0x01f0
        L_0x004b:
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r1 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r1.track
            java.util.Map r3 = r1.metadata()
            java.lang.String r4 = "media.manifest_id"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = r1.metadata()
            java.lang.String r5 = "media.manifest"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 0
            if (r5 != 0) goto L_0x00ac
            java.util.List r4 = defpackage.kdx.a(r4)
            r5 = 2147483647(0x7fffffff, float:NaN)
            java.util.Iterator r4 = r4.iterator()
            r5 = r6
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x007d:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r4.next()
            kdx r8 = (defpackage.kdx) r8
            java.lang.String r9 = r8.a
            if (r9 == 0) goto L_0x007d
            java.util.Set<java.lang.String> r9 = g
            java.lang.String r10 = r8.c
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L_0x007d
            int r9 = r8.b
            if (r9 <= 0) goto L_0x007d
            int r9 = r8.b
            int r9 = 640 - r9
            int r9 = java.lang.Math.abs(r9)
            if (r9 > r7) goto L_0x007d
            r5 = r8
            r7 = r9
            goto L_0x007d
        L_0x00a8:
            if (r5 == 0) goto L_0x00ac
            java.lang.String r6 = r5.a
        L_0x00ac:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00be
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L_0x00be
            com.google.common.base.Optional r1 = com.google.common.base.Optional.e()
            goto L_0x01f4
        L_0x00be:
            java.util.Map r4 = r1.metadata()
            java.lang.String r5 = "is_advertisement"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.util.HashMap r5 = new java.util.HashMap
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r7 = r7.track
            java.util.Map r7 = r7.metadata()
            r5.<init>(r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            java.lang.String r7 = r7.playbackId
            java.lang.String r8 = "endvideo_playback_id"
            r5.put(r8, r7)
            com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters r7 = r12.loggingParameters
            long r7 = r7.commandInitiatedTime
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "endvideo_command_initiated_time_ms"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            java.lang.String r7 = r7.entityURI
            java.lang.String r8 = "endvideo_context_uri"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.playOrigin
            java.lang.String r7 = r7.deviceIdentifier()
            java.lang.String r8 = "endvideo_device_identifier"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.playOrigin
            java.lang.String r7 = r7.featureIdentifier()
            java.lang.String r8 = "endvideo_feature_identifier"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.playOrigin
            java.lang.String r7 = r7.featureVersion()
            java.lang.String r8 = "endvideo_feature_version"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r7 = r7.track
            java.lang.String r7 = r7.provider()
            java.lang.String r8 = "endvideo_provider"
            r5.put(r8, r7)
            java.lang.String r7 = r12.startReason
            java.lang.String r8 = "endvideo_reason_start"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.playOrigin
            java.lang.String r7 = r7.referrerIdentifier()
            java.lang.String r8 = "endvideo_referrer_identifier"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r7 = r7.track
            java.lang.String r7 = r7.uri()
            java.lang.String r8 = "endvideo_track_uri"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r7 = r7.track
            java.lang.String r7 = r7.uid()
            java.lang.String r8 = "endvideo_track_uid"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r7 = r7.playOrigin
            java.lang.String r7 = r7.viewUri()
            java.lang.String r8 = "endvideo_view_uri"
            r5.put(r8, r7)
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r7 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r7 = r7.track
            java.lang.String r7 = r7.uri()
            java.lang.String r8 = ":"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            if (r8 <= r0) goto L_0x0199
            r8 = r7[r2]
            java.lang.String r9 = "spotify"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0199
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "context-player-"
            r8.<init>(r9)
            r7 = r7[r0]
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "betamax_override_feature_identifier"
            r5.put(r8, r7)
        L_0x0199:
            kab$a r7 = defpackage.kab.e()
            java.util.Map r8 = r1.metadata()
            java.lang.String r9 = "is_backgroundable"
            java.lang.Object r9 = r8.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x01c7
            java.lang.String r9 = "media.type"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r9 = "audio"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x01c7
            boolean r1 = com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil.isAd(r1)
            if (r1 == 0) goto L_0x01c8
        L_0x01c7:
            r2 = 1
        L_0x01c8:
            kab$a r1 = r7.a(r2)
            r2 = r4 ^ 1
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x01dc
            java.lang.String r3 = defpackage.kdq.a(r3)
            r1.a(r3)
            goto L_0x01df
        L_0x01dc:
            r1.a(r6)
        L_0x01df:
            kab$a r1 = r1.b(r2)
            kab$a r1 = r1.a(r5)
            kab r1 = r1.c()
            com.google.common.base.Optional r1 = com.google.common.base.Optional.b(r1)
            goto L_0x01f4
        L_0x01f0:
            com.google.common.base.Optional r1 = com.google.common.base.Optional.e()
        L_0x01f4:
            r11.p = r1
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r1 = r12.trackWithPlayOrigin
            if (r1 == 0) goto L_0x0221
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r1 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r1.track
            if (r1 != 0) goto L_0x0201
            goto L_0x0221
        L_0x0201:
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r1 = r12.trackWithPlayOrigin
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r1.track
            java.util.Map r1 = r1.metadata()
            java.lang.String r2 = "video.seconds_before_track_stuck"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0218
            com.google.common.base.Optional r1 = com.google.common.base.Optional.e()
            goto L_0x0225
        L_0x0218:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.b(r1)
            goto L_0x0225
        L_0x0221:
            com.google.common.base.Optional r1 = com.google.common.base.Optional.e()
        L_0x0225:
            r11.q = r1
        L_0x0227:
            com.google.common.base.Optional<kab> r1 = r11.p
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x02de
            int[] r1 = defpackage.kbf.AnonymousClass2.a
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r2 = r12.type
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r0) goto L_0x0284
            r0 = 2
            if (r1 == r0) goto L_0x027e
            r0 = 3
            if (r1 == r0) goto L_0x0278
            r0 = 4
            if (r1 == r0) goto L_0x0252
            r0 = 5
            if (r1 == r0) goto L_0x0249
            goto L_0x02de
        L_0x0249:
            jzm r0 = r11.d
            long r1 = r12.seekToInMs
            r0.a(r1)
            goto L_0x02de
        L_0x0252:
            com.google.common.base.Optional<kab> r12 = r11.p
            boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0272
            com.google.common.base.Optional<kab> r12 = r11.p
            java.lang.Object r12 = r12.c()
            kab r12 = (defpackage.kab) r12
            boolean r12 = a(r12)
            if (r12 == 0) goto L_0x0272
            jzm r12 = r11.d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12.a(r0)
        L_0x0272:
            jzm r12 = r11.d
            r12.b()
            return
        L_0x0278:
            jzm r12 = r11.d
            r12.am_()
            return
        L_0x027e:
            jzm r12 = r11.d
            r12.al_()
            return
        L_0x0284:
            com.google.common.base.Optional<kab> r1 = r11.p
            java.lang.Object r1 = r1.c()
            kab r1 = (defpackage.kab) r1
            boolean r1 = a(r1)
            jzx$a r2 = defpackage.jzx.c()
            boolean r3 = r12.initiallyPaused
            r0 = r0 ^ r3
            jzx$a r0 = r2.a(r0)
            if (r1 != 0) goto L_0x02ae
            long r1 = r12.seekToInMs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x02a7
            long r3 = r12.seekToInMs
        L_0x02a7:
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r0.a(r12)
        L_0x02ae:
            jzx r12 = r0.c()
            jzm r0 = r11.d
            com.google.common.base.Optional<kab> r1 = r11.p
            java.lang.Object r1 = r1.c()
            kab r1 = (defpackage.kab) r1
            r0.a(r1, r12)
            return
        L_0x02c0:
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r0 = r12.configuration
            boolean r0 = r0.hasSubtitle()
            if (r0 == 0) goto L_0x02de
            jzm r0 = r11.d
            if (r0 == 0) goto L_0x02d6
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r12 = r12.configuration
            kai r12 = r12.getSubtitle()
            r0.a(r12)
            return
        L_0x02d6:
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r12 = r12.configuration
            kai r12 = r12.getSubtitle()
            r11.t = r12
        L_0x02de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbf.a(com.spotify.mobile.android.video.model.VideoPlayerCommand):void");
    }

    static /* synthetic */ void a(kbf kbf, kcj kcj) {
        if (kbf.a()) {
            kbf.a("sp://videoplayer/v1/state", (JacksonModel) PlayerState.fromPlaybackState(kcj));
        }
    }

    private static boolean a(kab kab) {
        return Boolean.valueOf((String) kab.d().get(Metadata.MEDIA_LIVE)).booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public final void a(jzr jzr) {
        Disposable disposable = this.o;
        if (disposable != null && !disposable.b()) {
            this.o.bd_();
        }
        Disposable disposable2 = this.n;
        if (disposable2 != null) {
            disposable2.bd_();
            this.n = null;
        }
        jzm jzm = this.d;
        if (jzm != null) {
            jzm.a(jzr);
            this.d = null;
        }
    }

    public final void a(kad kad) {
        Disposable disposable = this.o;
        if (disposable == null || disposable.b()) {
            PublishRelay<Request> publishRelay = this.h;
            RxResolver rxResolver = this.i;
            rxResolver.getClass();
            this.o = publishRelay.c((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$WnSX8RXMvUDZDVUsFqG4upPB07o<Object,Object>(rxResolver), 1).g().a((Consumer<? super Throwable>) $$Lambda$kbf$r2jAdE_x8faBDkyKoWpX3JaCj8c.INSTANCE).a((Action) $$Lambda$kbf$AMYK2QaqGCLIj1VbbfJLuw9peuM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$kbf$utJLOcrvhVSAhF7Gx7Z3n6lHSBs.INSTANCE);
        }
        this.e = kad;
        ObjectMapper a2 = this.l.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.n = this.i.resolve(new Request(Request.SUB, "sp://videoplayer/v1/commands")).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(VideoPlayerCommand.class, a2, this.k)).a(this.j).a((Consumer<? super T>) new $$Lambda$kbf$IDKfcCEtBpJHW1MYdyTBC9oKH8A<Object>(this), (Consumer<? super Throwable>) $$Lambda$kbf$yWxg1G2G3tmWLEhCX0h74vZTy4.INSTANCE);
    }

    public final void a(boolean z) {
        this.s = z;
        jzm jzm = this.d;
        if (jzm != null) {
            jzm.b(z);
        }
    }

    public final boolean a() {
        return this.n != null;
    }

    public final Optional<kch> createEventObserver(final kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        this.u = new kck(jzx, kaa) {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(Long l) {
                kbf.this.a("sp://videoplayer/v1/error", (JacksonModel) PlayerError.fromVideoPlaybackError(new PlaybackException("Playback stuck", ErrorType.ERROR_PLAYBACK_STUCK), kaa));
                kbf.this.a("sp://videoplayer/v1/advance", (JacksonModel) kbf.a);
            }

            private void a(boolean z) {
                kba a2 = kbf.this.f;
                if (a2 != null) {
                    a2.a(z);
                }
            }

            private void b(boolean z) {
                kba a2 = kbf.this.f;
                if (a2 != null) {
                    a2.b(z);
                }
            }

            private void c() {
                if (kbf.this.r.b()) {
                    ((Disposable) kbf.this.r.c()).bd_();
                    kbf.this.r = Optional.e();
                }
            }

            public final void a(float f, long j, long j2) {
                super.a(f, j, j2);
                kbf.a(kbf.this, b());
            }

            public final void a(long j, long j2) {
                super.a(j, j2);
                c();
                kbf.a(kbf.this, b());
                b(b().g());
            }

            public final void a(BetamaxException betamaxException, long j, long j2) {
                super.a(betamaxException, j, j2);
                kbf.a(kbf.this, b());
                kbf.this.a("sp://videoplayer/v1/error", (JacksonModel) PlayerError.fromVideoPlaybackError(betamaxException, kaa));
            }

            public final void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
                super.a(jzr, reasonEnd, j, j2);
                c();
                kbf.a(kbf.this, b());
                if (reasonEnd == ReasonEnd.PLAYED_TO_END) {
                    kbf.this.a("sp://videoplayer/v1/advance", (JacksonModel) kbf.a);
                }
                a(false);
                b(true);
            }

            public final void a(boolean z, long j) {
                super.a(z, j);
                kbf.a(kbf.this, b());
                a(true);
            }

            public final void b(long j) {
                super.b(j);
                kbf.a(kbf.this, b());
                b(false);
            }

            public final void b(long j, long j2) {
                super.b(j, j2);
                kbf.a(kbf.this, b());
            }

            public final void b(BetamaxException betamaxException, long j, long j2) {
                super.b(betamaxException, j, j2);
                kbf.a(kbf.this, b());
                ErrorType errorType = betamaxException.mErrorType;
                String str = "sp://videoplayer/v1/advance";
                if (errorType == ErrorType.ERROR_AUDIO_ONLY_NOT_ALLOWED) {
                    kbf.this.a(str, (JacksonModel) kbf.b);
                } else if (errorType == ErrorType.ERROR_MANIFEST_DELETED) {
                    kbf.this.a(str, (JacksonModel) kbf.c);
                } else if (errorType == ErrorType.ERROR_UNAVAILABLE) {
                    kbf.this.a(str, (JacksonModel) kbf.c);
                } else {
                    if (errorType != ErrorType.ERROR_IN_OFFLINE_MODE) {
                        kbf.this.a("sp://videoplayer/v1/error", (JacksonModel) PlayerError.fromVideoPlaybackError(betamaxException, kaa));
                    }
                }
            }

            public final void c(long j, long j2) {
                super.c(j, j2);
                c();
                kbf.a(kbf.this, b());
                b(true);
            }

            public final void d(long j, long j2) {
                super.d(j, j2);
                kbf.a(kbf.this, b());
                if (!b().g()) {
                    c();
                    if (kbf.this.q.b()) {
                        kbf kbf = kbf.this;
                        kbf.r = Optional.b(Observable.a(((Long) kbf.q.c()).longValue(), TimeUnit.SECONDS, kbf.this.k).a((Consumer<? super T>) new $$Lambda$kbf$1$mjmFkF30wtEnSiTIZiSMgSHmg<Object>(this), (Consumer<? super Throwable>) $$Lambda$kbf$1$_k12xsbgxMmcQZAQxkUgZmHNSO4.INSTANCE));
                    }
                }
            }
        };
        return Optional.b(this.u);
    }
}
