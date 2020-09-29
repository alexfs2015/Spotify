package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.NotAuthorizedException;
import com.spotify.mobile.android.spotlets.appprotocol.calls.EchoEndpoint;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Capabilities;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Context;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Empty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Image;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItems;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.RootListOptions;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.UriWithOptionExtras;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ikp reason: default package */
public final class ikp implements iko {
    private final ikn a;
    private final imw b;
    private final Map<String, ilc<? extends JacksonModel, ? extends JacksonModel>> c = new LinkedHashMap(35);

    public ikp(ikn ikn) {
        this.a = ikn;
        this.b = new imw(ikn);
        a((ilc<? extends JacksonModel, ? extends JacksonModel>) new EchoEndpoint<Object,Object>());
        ild a2 = ild.a(Empty.class, Empty.class);
        a2.c = "com.spotify.connect_switch_to_local_device";
        a2.a = 1;
        a2.b = $$Lambda$ikp$NRBk3Xs3Ff0AGtTlxozXZXCz4Q.INSTANCE;
        a(a2.a());
        ild a3 = ild.a(Empty.class, Capabilities.class);
        a3.c = "com.spotify.get_capabilities";
        a3.a = 0;
        a3.b = $$Lambda$ikp$hWyYSaQUIUqI5g4d_3uTUua2Q.INSTANCE;
        a(a3.a());
        ild a4 = ild.a(ChildrenPageRequest.class, ListItems.class);
        a4.c = "com.spotify.get_children_of_item";
        a4.a = 8;
        a4.b = $$Lambda$ikp$3PB04hoNah0JpqOmlZyaNZRIBs.INSTANCE;
        a(a4.a());
        ild a5 = ild.a(Empty.class, Context.class);
        a5.c = "com.spotify.get_current_context";
        a5.a = 4;
        a5.b = $$Lambda$ikp$kkZQVwlpmwIyN_LR8LAmxsz6mJQ.INSTANCE;
        a(a5.a());
        ild a6 = ild.a(Empty.class, TrackData.class);
        a6.c = "com.spotify.get_current_track";
        a6.a = 4;
        a6.b = $$Lambda$ikp$a9qCgZKfAEj9owqXXTQmOEpNRqI.INSTANCE;
        a(a6.a());
        ild a7 = ild.a(ImageIdentifier.class, Image.class);
        a7.c = "com.spotify.get_image";
        a7.a = 4;
        a7.b = $$Lambda$ikp$Zpxy3aPQejnmNipln4RJzKNp3FM.INSTANCE;
        a(a7.a());
        ild a8 = ild.a(Empty.class, PlaybackSpeed.class);
        a8.c = "com.spotify.get_playback_speed";
        a8.a = 4;
        a8.b = $$Lambda$ikp$VnNjXZ7AhkEjAgTSxxHA54TAIGw.INSTANCE;
        a(a8.a());
        ild a9 = ild.a(Empty.class, PlayerState.class);
        a9.c = "com.spotify.get_player_state";
        a9.a = 4;
        a9.b = $$Lambda$ikp$_xQ_ADevbWUID7b5MlIA0TAGuEU.INSTANCE;
        a(a9.a());
        ild a10 = ild.a(RootListOptions.class, ListItems.class);
        a10.c = "com.spotify.get_recommended_root_items";
        a10.a = 8;
        a10.b = $$Lambda$ikp$0ejPpN3hw5XqWr4WUV1Rd2vm59s.INSTANCE;
        a(a10.a());
        ild a11 = ild.a(Identifier.class, Saved.class);
        a11.c = "com.spotify.get_saved";
        a11.a = 1;
        a11.b = $$Lambda$ikp$DaAqSKGWsXc4Q2UTg_aJJyWNybw.INSTANCE;
        a(a11.a());
        ild a12 = ild.a(Empty.class, SessionState.class);
        a12.c = "com.spotify.get_session_state";
        a12.a = 4;
        a12.b = $$Lambda$ikp$yUxxMGFCtUqr6pn7AXaSAkxPTV8.INSTANCE;
        a(a12.a());
        ild a13 = ild.a(Empty.class, Rating.class);
        a13.c = "com.spotify.get_rating";
        a13.a = 4;
        a13.b = $$Lambda$ikp$V8Mv2cGxWuCB_umPV5e1xMF0QWU.INSTANCE;
        a(a13.a());
        ild a14 = ild.a(Empty.class, Repeat.class);
        a14.c = "com.spotify.get_repeat";
        a14.a = 4;
        a14.b = $$Lambda$ikp$cyTkFU5yBOwhdw58IP2aScziRTY.INSTANCE;
        a(a14.a());
        ild a15 = ild.a(Empty.class, Shuffle.class);
        a15.c = "com.spotify.get_shuffle";
        a15.a = 4;
        a15.b = $$Lambda$ikp$2Dwg8H1dXdro2HXR4W8q_KdL2mE.INSTANCE;
        a(a15.a());
        ild a16 = ild.a(ImageIdentifier.class, Image.class);
        a16.c = "com.spotify.get_thumbnail_image";
        a16.a = 8;
        a16.b = $$Lambda$ikp$rhsxT6LiLLFiZqblZ80r6V5nm38.INSTANCE;
        a(a16.a());
        ild a17 = ild.a(Empty.class, TrackElapsed.class);
        a17.c = "com.spotify.get_track_elapsed";
        a17.a = 4;
        a17.b = $$Lambda$ikp$viKQ11b5ZM97n6gXEo8tTh33TRo.INSTANCE;
        a(a17.a());
        ild a18 = ild.a(LogMessage.class, Empty.class);
        a18.c = "com.spotify.log_message";
        a18.a = 0;
        a18.b = $$Lambda$ikp$30dnBUfbroUoJ9g5uJq3M_iAxA.INSTANCE;
        a(a18.a());
        ild a19 = ild.a(Identifier.class, Empty.class);
        a19.c = "com.spotify.play_item";
        a19.a = 8;
        a19.b = $$Lambda$ikp$QbAanGpxEkaHdSiX3S7oGdWiz20.INSTANCE;
        a(a19.a());
        ild a20 = ild.a(Uri.class, Empty.class);
        a20.c = "com.spotify.play_spotify_track_uri";
        a20.a = 2;
        a20.b = $$Lambda$ikp$9ynFvyxMI1wSxb3F_8_iw1JDxFI.INSTANCE;
        a(a20.a());
        ild a21 = ild.a(Uri.class, Empty.class);
        a21.c = "com.spotify.play_spotify_uri";
        a21.a = 2;
        a21.b = $$Lambda$ikp$grazCeZqEsubf0H2GoCHAYtMC78.INSTANCE;
        a(a21.a());
        ild a22 = ild.a(UriWithOptionExtras.class, Empty.class);
        a22.c = "com.spotify.play_spotify_uri_option_extras";
        a22.a = 2;
        a22.b = $$Lambda$ikp$nMz1Ic1bvcKsW6_OQ63NIWyN_UQ.INSTANCE;
        a(a22.a());
        ild a23 = ild.a(PlaybackPosition.class, Empty.class);
        a23.c = "com.spotify.set_playback_position";
        a23.a = 1;
        a23.b = $$Lambda$ikp$YMlDFGVCAuP3IRGoZetnOSMyI.INSTANCE;
        a(a23.a());
        ild a24 = ild.a(PlaybackPosition.class, Empty.class);
        a24.c = "com.spotify.seek_to_relative_position";
        a24.a = 1;
        a24.b = $$Lambda$ikp$5Kqm8HeME_vUu3bxiYAWvI5mOeI.INSTANCE;
        a(a24.a());
        ild a25 = ild.a(PlaybackSpeed.class, Empty.class);
        a25.c = "com.spotify.set_playback_speed";
        a25.a = 1;
        a25.b = $$Lambda$ikp$prPED1iSeCAvhJ3TM1JaE8_UcWY.INSTANCE;
        a(a25.a());
        ild a26 = ild.a(Rating.class, Empty.class);
        a26.c = "com.spotify.set_rating";
        a26.a = 1;
        a26.b = $$Lambda$ikp$csptskgvKFay5TxhuurMsLSX1M.INSTANCE;
        a(a26.a());
        ild a27 = ild.a(Repeat.class, Empty.class);
        a27.c = "com.spotify.set_repeat";
        a27.a = 1;
        a27.b = $$Lambda$ikp$ve1S8aClXdPcuQQyrGw9XKd5XA.INSTANCE;
        a(a27.a());
        ild a28 = ild.a(Empty.class, Empty.class);
        a28.c = "com.spotify.toggle_repeat";
        a28.a = 1;
        a28.b = $$Lambda$ikp$7M7UVQ5Cn0Ojw7XkDLH0MURP4v4.INSTANCE;
        a(a28.a());
        ild a29 = ild.a(Saved.class, Empty.class);
        a29.c = "com.spotify.set_saved";
        a29.a = 1;
        a29.b = $$Lambda$ikp$Akt2ZVakyMPdLi_uUY1iV1o4uqo.INSTANCE;
        a(a29.a());
        ild a30 = ild.a(Shuffle.class, Empty.class);
        a30.c = "com.spotify.set_shuffle";
        a30.a = 1;
        a30.b = $$Lambda$ikp$aGgcwwZxNJKXedpsgs65MnVD9Vg.INSTANCE;
        a(a30.a());
        ild a31 = ild.a(Empty.class, Empty.class);
        a31.c = "com.spotify.toggle_shuffle";
        a31.a = 1;
        a31.b = $$Lambda$ikp$zBdDjxaXK_p1WHky5UBT9Dlavgc.INSTANCE;
        a(a31.a());
        ild a32 = ild.a(Empty.class, Empty.class);
        a32.c = "com.spotify.skip_next";
        a32.a = 1;
        a32.b = $$Lambda$ikp$8Ns65Tg1TFTw1ZhIkmcGrMnSY.INSTANCE;
        a(a32.a());
        ild a33 = ild.a(Empty.class, Empty.class);
        a33.c = "com.spotify.skip_previous";
        a33.a = 1;
        a33.b = $$Lambda$ikp$5USFeIwVjHufwIeLmrERxgRWA.INSTANCE;
        a(a33.a());
        ild a34 = ild.a(Identifier.class, Empty.class);
        a34.c = "com.spotify.start_radio";
        a34.a = 1;
        a34.b = $$Lambda$ikp$o_2NseLLA8dIy3QSmSjNJWQVHk.INSTANCE;
        a(a34.a());
        ild a35 = ild.a(Uri.class, Empty.class);
        a35.c = "com.spotify.queue_spotify_uri";
        a35.a = 1;
        a35.b = $$Lambda$ikp$HHrJgSg6RLqRypDBfnGLIrkqgc.INSTANCE;
        a(a35.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(ikn ikn, LogMessage logMessage) {
        StringBuilder sb = new StringBuilder("Log from IAP:");
        if (logMessage.title != null && !logMessage.title.isEmpty()) {
            sb.append(' ');
            sb.append(logMessage.title);
        }
        if (logMessage.message != null && !logMessage.message.isEmpty()) {
            sb.append(' ');
            sb.append(logMessage.message);
        }
        String sb2 = sb.toString();
        if (LogMessage.SEVERITY_ERROR.equals(logMessage.severity)) {
            Logger.e(sb2, new Object[0]);
        } else {
            if (LogMessage.SEVERITY_WARNING.equals(logMessage.severity)) {
                Logger.d(sb2, new Object[0]);
            } else {
                if (LogMessage.SEVERITY_INFO.equals(logMessage.severity)) {
                    Logger.c(sb2, new Object[0]);
                } else {
                    Logger.b(sb2, new Object[0]);
                }
            }
        }
        return Observable.b(AppProtocol.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(ikn ikn, PlaybackSpeed playbackSpeed) {
        ikv ikv = ikn.d;
        int i = playbackSpeed.playbackSpeed;
        if (i == 0) {
            return ikv.e();
        }
        if (i == 1) {
            return ikv.f();
        }
        if (i == 50 || i == 80 || i == 100 || i == 120 || i == 150 || i == 200 || i == 300) {
            return ikv.a(playbackSpeed.playbackSpeed);
        }
        StringBuilder sb = new StringBuilder("Unexpected playback speed ");
        sb.append(playbackSpeed.playbackSpeed);
        return IapException.a(sb.toString());
    }

    private void a(ilc<? extends JacksonModel, ? extends JacksonModel> ilc) {
        if (this.c.containsKey(ilc.b())) {
            Assertion.b(String.format("Endpoint already registered for URI: \"%s\".", new Object[]{ilc.b()}));
            return;
        }
        this.c.put(ilc.b(), ilc);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [com.spotify.mobile.android.cosmos.JacksonModel] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v6, types: [com.spotify.mobile.android.cosmos.JacksonModel] */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089 A[Catch:{ IapException -> 0x0104, Exception -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6 A[Catch:{ IapException -> 0x0104, Exception -> 0x00ec }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.reactivex.Observable<? extends com.spotify.mobile.android.cosmos.JacksonModel> b(defpackage.ilm r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Exception calling IAP endpoint on URI: \"%s\"."
            java.lang.String r1 = r14.b()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r5 = "Resolving IAP endpoint for URI: \"%s\"."
            com.spotify.base.java.logging.Logger.a(r5, r3)
            java.util.Map<java.lang.String, ilc<? extends com.spotify.mobile.android.cosmos.JacksonModel, ? extends com.spotify.mobile.android.cosmos.JacksonModel>> r3 = r13.c     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            ilc r3 = (defpackage.ilc) r3     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r3 != 0) goto L_0x0036
            java.lang.String r14 = "No IAP endpoint for URI: \"%s\"."
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r3[r4] = r1     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r14 = java.lang.String.format(r14, r3)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.base.java.logging.Logger.e(r14, r3)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.IapException r3 = new com.spotify.mobile.android.spotlets.appprotocol.IapException     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r5 = "wamp.error.invalid_uri"
            r3.<init>(r14, r5)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            io.reactivex.Observable r14 = io.reactivex.Observable.a(r3)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            return r14
        L_0x0036:
            ikn r5 = r13.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            ikv r5 = r5.d     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            int r6 = r3.c()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r5.b(r6)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            ikn r5 = r13.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            imw r6 = r13.b     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r7 = "com.spotify.queue_spotify_uri"
            java.lang.String r8 = r3.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r7 = r7.equals(r8)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r8 = 5
            if (r7 == 0) goto L_0x00c2
            ikn r7 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$HelloDetails r7 = r7.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Info r7 = r7.info     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r7 = r7.isCategoryApp()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x00b3
            ikn r7 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$HelloDetails r7 = r7.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.extras     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x0086
            ikn r7 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$HelloDetails r7 = r7.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.extras     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r9 = "scopes"
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x0086
            java.lang.String r9 = "app-remote-control"
            boolean r7 = r7.contains(r9)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x0086
            r7 = 1
            goto L_0x0087
        L_0x0086:
            r7 = 0
        L_0x0087:
            if (r7 == 0) goto L_0x00b3
            r7 = 2
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r10 = "0.5.0"
            r9[r4] = r10     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r10 = "0.6.0"
            r9[r2] = r10     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r10 = 0
        L_0x0095:
            if (r10 >= r7) goto L_0x00ae
            r11 = r9[r10]     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            ikn r12 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$HelloDetails r12 = r12.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Info r12 = r12.info     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r12 = r12.version     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r11 = r12.startsWith(r11)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r11 == 0) goto L_0x00ab
            r6 = 1
            goto L_0x00af
        L_0x00ab:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00ae:
            r6 = 0
        L_0x00af:
            if (r6 == 0) goto L_0x00b3
            r6 = 1
            goto L_0x00b4
        L_0x00b3:
            r6 = 0
        L_0x00b4:
            if (r6 == 0) goto L_0x00c2
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Uri r6 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Uri     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r6.<init>()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r14 = r14.a(r8)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r6.uri = r14     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            goto L_0x00e7
        L_0x00c2:
            java.lang.Class r6 = r3.a()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            ilo r7 = r14.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            int r7 = r7.d()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r9 = 6
            if (r7 != r9) goto L_0x00d9
            ilo r7 = r14.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r7 = r7.c(r8)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x00d9
            r7 = 1
            goto L_0x00da
        L_0x00d9:
            r7 = 0
        L_0x00da:
            if (r7 == 0) goto L_0x00e6
            ilo r14 = r14.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.Object r14 = r14.a(r8, r6)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r6 = r14
            com.spotify.mobile.android.cosmos.JacksonModel r6 = (com.spotify.mobile.android.cosmos.JacksonModel) r6     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            goto L_0x00e7
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            io.reactivex.Observable r14 = r3.a(r5, r6)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            return r14
        L_0x00ec:
            r14 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            com.spotify.base.java.logging.Logger.e(r14, r0, r2)
            com.spotify.mobile.android.spotlets.appprotocol.IapException r0 = new com.spotify.mobile.android.spotlets.appprotocol.IapException
            java.lang.Class r1 = r14.getClass()
            java.lang.String r2 = "wamp.error"
            r0.<init>(r14, r1, r2)
            io.reactivex.Observable r14 = io.reactivex.Observable.a(r0)
            return r14
        L_0x0104:
            r14 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            com.spotify.base.java.logging.Logger.e(r14, r0, r2)
            io.reactivex.Observable r14 = io.reactivex.Observable.a(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikp.b(ilm):io.reactivex.Observable");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable c(ikn ikn, Empty empty) {
        ikv ikv = ikn.d;
        com.spotify.mobile.android.cosmos.player.v2.PlayerState b2 = ikv.o.b();
        if (b2 != null) {
            return ikv.a(new Shuffle(!b2.options().shufflingContext()));
        }
        throw new IapException(new Message("Cannot toggle shuffle, playerState is null"), "wamp.error");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable d(ikn ikn, Empty empty) {
        ikv ikv = ikn.d;
        com.spotify.mobile.android.cosmos.player.v2.PlayerState b2 = ikv.o.b();
        if (b2 != null) {
            return ikv.a(Repeat.getNextRepeatMode(b2));
        }
        throw new IapException(new Message("Cannot toggle repeat, playerState is null"), "wamp.error");
    }

    public final Observable<? extends JacksonModel> a(ilm ilm) {
        try {
            this.a.a();
            return b(ilm);
        } catch (NotAuthorizedException e) {
            return Observable.a((Throwable) e);
        }
    }
}
