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
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.SearchQuery;
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

/* renamed from: iic reason: default package */
public final class iic implements iib {
    private final iia a;
    private final ikj b;
    private final Map<String, iip<? extends JacksonModel, ? extends JacksonModel>> c = new LinkedHashMap(35);

    public iic(iia iia) {
        this.a = iia;
        this.b = new ikj(iia);
        a((iip<? extends JacksonModel, ? extends JacksonModel>) new EchoEndpoint<Object,Object>());
        iiq a2 = iiq.a(Empty.class, Empty.class);
        a2.c = "com.spotify.connect_switch_to_local_device";
        a2.a = 1;
        a2.b = $$Lambda$iic$QhMP2DtTePJdoe053OAuVrngXII.INSTANCE;
        a(a2.a());
        iiq a3 = iiq.a(Empty.class, Capabilities.class);
        a3.c = "com.spotify.get_capabilities";
        a3.a = 0;
        a3.b = $$Lambda$iic$Nnood67flBnCpTo8sHVGXMKbeu0.INSTANCE;
        a(a3.a());
        iiq a4 = iiq.a(ChildrenPageRequest.class, ListItems.class);
        a4.c = "com.spotify.get_children_of_item";
        a4.a = 8;
        a4.b = $$Lambda$iic$WiNPOQaj_CoxWh6vVHFygNkoWOo.INSTANCE;
        a(a4.a());
        iiq a5 = iiq.a(Empty.class, Context.class);
        a5.c = "com.spotify.get_current_context";
        a5.a = 4;
        a5.b = $$Lambda$iic$Hkc5KgYC51cmAPBdY5idvdMk0pg.INSTANCE;
        a(a5.a());
        iiq a6 = iiq.a(Empty.class, TrackData.class);
        a6.c = "com.spotify.get_current_track";
        a6.a = 4;
        a6.b = $$Lambda$iic$_IuBJoJPRiE5PP_mnwTxOzrsu1g.INSTANCE;
        a(a6.a());
        iiq a7 = iiq.a(ImageIdentifier.class, Image.class);
        a7.c = "com.spotify.get_image";
        a7.a = 4;
        a7.b = $$Lambda$iic$Dg2hzhdkfaPqxzZjtQwjoNI7zho.INSTANCE;
        a(a7.a());
        iiq a8 = iiq.a(Empty.class, PlaybackSpeed.class);
        a8.c = "com.spotify.get_playback_speed";
        a8.a = 4;
        a8.b = $$Lambda$iic$eLok0NgK3UtGMAk4Yiwn_3vRH1w.INSTANCE;
        a(a8.a());
        iiq a9 = iiq.a(Empty.class, PlayerState.class);
        a9.c = "com.spotify.get_player_state";
        a9.a = 4;
        a9.b = $$Lambda$iic$hPOkFEtNIA8ygVO7CuHeai48Fw.INSTANCE;
        a(a9.a());
        iiq a10 = iiq.a(RootListOptions.class, ListItems.class);
        a10.c = "com.spotify.get_recommended_root_items";
        a10.a = 8;
        a10.b = $$Lambda$iic$02ITRWAyRZr2PBA9wos5VdP_H0.INSTANCE;
        a(a10.a());
        iiq a11 = iiq.a(Identifier.class, Saved.class);
        a11.c = "com.spotify.get_saved";
        a11.a = 1;
        a11.b = $$Lambda$iic$CxWpTJNdULhCORnzwL7qU9AxGs.INSTANCE;
        a(a11.a());
        iiq a12 = iiq.a(Empty.class, SessionState.class);
        a12.c = "com.spotify.get_session_state";
        a12.a = 4;
        a12.b = $$Lambda$iic$cFkG1Z9PUPqodux519U0zJaqduE.INSTANCE;
        a(a12.a());
        iiq a13 = iiq.a(Empty.class, Rating.class);
        a13.c = "com.spotify.get_rating";
        a13.a = 4;
        a13.b = $$Lambda$iic$gK3hmOBlfiESPOr3W9yMfK4676g.INSTANCE;
        a(a13.a());
        iiq a14 = iiq.a(Empty.class, Repeat.class);
        a14.c = "com.spotify.get_repeat";
        a14.a = 4;
        a14.b = $$Lambda$iic$34ISE3hoVZD104f59ULgAqODE.INSTANCE;
        a(a14.a());
        iiq a15 = iiq.a(Empty.class, Shuffle.class);
        a15.c = "com.spotify.get_shuffle";
        a15.a = 4;
        a15.b = $$Lambda$iic$0q0CWQRRP4FtfetMXHwSLPWKAms.INSTANCE;
        a(a15.a());
        iiq a16 = iiq.a(ImageIdentifier.class, Image.class);
        a16.c = "com.spotify.get_thumbnail_image";
        a16.a = 8;
        a16.b = $$Lambda$iic$609xruQbe1TwRy57NUNmBdtTk.INSTANCE;
        a(a16.a());
        iiq a17 = iiq.a(Empty.class, TrackElapsed.class);
        a17.c = "com.spotify.get_track_elapsed";
        a17.a = 4;
        a17.b = $$Lambda$iic$p7EnqVyvmxdCfpTxue6cNQOPJv8.INSTANCE;
        a(a17.a());
        iiq a18 = iiq.a(LogMessage.class, Empty.class);
        a18.c = "com.spotify.log_message";
        a18.a = 0;
        a18.b = $$Lambda$iic$wu0wte88mpsyf6j4i5JO7pwxYFg.INSTANCE;
        a(a18.a());
        iiq a19 = iiq.a(Identifier.class, Empty.class);
        a19.c = "com.spotify.play_item";
        a19.a = 8;
        a19.b = $$Lambda$iic$Mkf2_w69TtBY_Nz0U05UHflDyfU.INSTANCE;
        a(a19.a());
        iiq a20 = iiq.a(Uri.class, Empty.class);
        a20.c = "com.spotify.play_spotify_track_uri";
        a20.a = 2;
        a20.b = $$Lambda$iic$eXOQfE2MGKfQ7OwHFzbax1IronY.INSTANCE;
        a(a20.a());
        iiq a21 = iiq.a(Uri.class, Empty.class);
        a21.c = "com.spotify.play_spotify_uri";
        a21.a = 2;
        a21.b = $$Lambda$iic$cqSPJBYLXMSJCu2VIa2b1hPEU4.INSTANCE;
        a(a21.a());
        iiq a22 = iiq.a(UriWithOptionExtras.class, Empty.class);
        a22.c = "com.spotify.play_spotify_uri_option_extras";
        a22.a = 2;
        a22.b = $$Lambda$iic$YtuWxVFG4jFaSQlPZK5ZWpVtC5E.INSTANCE;
        a(a22.a());
        iiq a23 = iiq.a(SearchQuery.class, ListItems.class);
        a23.c = "com.spotify.search_query";
        a23.a = 8;
        a23.b = $$Lambda$iic$kAFuoW7AUVyp3pJXgswOIlk6fCw.INSTANCE;
        a(a23.a());
        iiq a24 = iiq.a(PlaybackPosition.class, Empty.class);
        a24.c = "com.spotify.set_playback_position";
        a24.a = 1;
        a24.b = $$Lambda$iic$3oUApRsta76G_RTIRnPj9qqHs0.INSTANCE;
        a(a24.a());
        iiq a25 = iiq.a(PlaybackPosition.class, Empty.class);
        a25.c = "com.spotify.seek_to_relative_position";
        a25.a = 1;
        a25.b = $$Lambda$iic$5y3QbyscmwXUvbwPBrEaNJrEXw.INSTANCE;
        a(a25.a());
        iiq a26 = iiq.a(PlaybackSpeed.class, Empty.class);
        a26.c = "com.spotify.set_playback_speed";
        a26.a = 1;
        a26.b = $$Lambda$iic$hTeJhy2EzSejtWOf7VSmDGXz1Nc.INSTANCE;
        a(a26.a());
        iiq a27 = iiq.a(Rating.class, Empty.class);
        a27.c = "com.spotify.set_rating";
        a27.a = 1;
        a27.b = $$Lambda$iic$A31RMPp8lzDYDjCONn8Gc0hBpfU.INSTANCE;
        a(a27.a());
        iiq a28 = iiq.a(Repeat.class, Empty.class);
        a28.c = "com.spotify.set_repeat";
        a28.a = 1;
        a28.b = $$Lambda$iic$DQgDaPr5gGQD8twu_83aIBjOhxQ.INSTANCE;
        a(a28.a());
        iiq a29 = iiq.a(Empty.class, Empty.class);
        a29.c = "com.spotify.toggle_repeat";
        a29.a = 1;
        a29.b = $$Lambda$iic$n5y_5Er8WWRABQHypYD7pRZ2lkA.INSTANCE;
        a(a29.a());
        iiq a30 = iiq.a(Saved.class, Empty.class);
        a30.c = "com.spotify.set_saved";
        a30.a = 1;
        a30.b = $$Lambda$iic$SAKlVrPSjrLEzKoyhVdY_FMJEE.INSTANCE;
        a(a30.a());
        iiq a31 = iiq.a(Shuffle.class, Empty.class);
        a31.c = "com.spotify.set_shuffle";
        a31.a = 1;
        a31.b = $$Lambda$iic$3rZcS1UDHYF3qUaDz3v5oBLDRw.INSTANCE;
        a(a31.a());
        iiq a32 = iiq.a(Empty.class, Empty.class);
        a32.c = "com.spotify.toggle_shuffle";
        a32.a = 1;
        a32.b = $$Lambda$iic$KJ1Dk1mLfjoZqjIDcU3KAJ48c8Y.INSTANCE;
        a(a32.a());
        iiq a33 = iiq.a(Empty.class, Empty.class);
        a33.c = "com.spotify.skip_next";
        a33.a = 1;
        a33.b = $$Lambda$iic$lrRn5a95Bec7kJuzprKnJFcXuo.INSTANCE;
        a(a33.a());
        iiq a34 = iiq.a(Empty.class, Empty.class);
        a34.c = "com.spotify.skip_previous";
        a34.a = 1;
        a34.b = $$Lambda$iic$eaWH5mCeiVGIpyVegqrgfzV4PtM.INSTANCE;
        a(a34.a());
        iiq a35 = iiq.a(Identifier.class, Empty.class);
        a35.c = "com.spotify.start_radio";
        a35.a = 1;
        a35.b = $$Lambda$iic$PYdkhsseDF080s0ynKCTxFBvo.INSTANCE;
        a(a35.a());
        iiq a36 = iiq.a(Uri.class, Empty.class);
        a36.c = "com.spotify.queue_spotify_uri";
        a36.a = 1;
        a36.b = $$Lambda$iic$8O5T9DkWEkluDxkuaiCpy6t10V0.INSTANCE;
        a(a36.a());
    }

    public final Observable<? extends JacksonModel> a(iiz iiz) {
        try {
            this.a.a();
            return b(iiz);
        } catch (NotAuthorizedException e) {
            return Observable.a((Throwable) e);
        }
    }

    private void a(iip<? extends JacksonModel, ? extends JacksonModel> iip) {
        if (this.c.containsKey(iip.b())) {
            Assertion.b(String.format("Endpoint already registered for URI: \"%s\".", new Object[]{iip.b()}));
            return;
        }
        this.c.put(iip.b(), iip);
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
    private io.reactivex.Observable<? extends com.spotify.mobile.android.cosmos.JacksonModel> b(defpackage.iiz r14) {
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
            java.util.Map<java.lang.String, iip<? extends com.spotify.mobile.android.cosmos.JacksonModel, ? extends com.spotify.mobile.android.cosmos.JacksonModel>> r3 = r13.c     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            iip r3 = (defpackage.iip) r3     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
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
            iia r5 = r13.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            iii r5 = r5.d     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            int r6 = r3.c()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r5.b(r6)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            iia r5 = r13.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            ikj r6 = r13.b     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.lang.String r7 = "com.spotify.queue_spotify_uri"
            java.lang.String r8 = r3.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r7 = r7.equals(r8)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r8 = 5
            if (r7 == 0) goto L_0x00c2
            iia r7 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$HelloDetails r7 = r7.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Info r7 = r7.info     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r7 = r7.isCategoryApp()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x00b3
            iia r7 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$HelloDetails r7 = r7.b()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.extras     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x0086
            iia r7 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
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
            iia r12 = r6.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
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
            ijb r7 = r14.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            int r7 = r7.d()     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            r9 = 6
            if (r7 != r9) goto L_0x00d9
            ijb r7 = r14.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            boolean r7 = r7.c(r8)     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
            if (r7 == 0) goto L_0x00d9
            r7 = 1
            goto L_0x00da
        L_0x00d9:
            r7 = 0
        L_0x00da:
            if (r7 == 0) goto L_0x00e6
            ijb r14 = r14.a     // Catch:{ IapException -> 0x0104, Exception -> 0x00ec }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iic.b(iiz):io.reactivex.Observable");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable c(iia iia, Empty empty) {
        iii iii = iia.d;
        com.spotify.mobile.android.cosmos.player.v2.PlayerState b2 = iii.o.b();
        if (b2 != null) {
            return iii.a(new Shuffle(!b2.options().shufflingContext()));
        }
        throw new IapException(new Message("Cannot toggle shuffle, playerState is null"), "wamp.error");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable d(iia iia, Empty empty) {
        iii iii = iia.d;
        com.spotify.mobile.android.cosmos.player.v2.PlayerState b2 = iii.o.b();
        if (b2 != null) {
            return iii.a(Repeat.getNextRepeatMode(b2));
        }
        throw new IapException(new Message("Cannot toggle repeat, playerState is null"), "wamp.error");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(iia iia, PlaybackSpeed playbackSpeed) {
        iii iii = iia.d;
        int i = playbackSpeed.playbackSpeed;
        if (i == 0) {
            return iii.e();
        }
        if (i == 1) {
            return iii.f();
        }
        if (i == 50 || i == 80 || i == 100 || i == 120 || i == 150 || i == 200 || i == 300) {
            return iii.a(playbackSpeed.playbackSpeed);
        }
        StringBuilder sb = new StringBuilder("Unexpected playback speed ");
        sb.append(playbackSpeed.playbackSpeed);
        return IapException.a(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(iia iia, LogMessage logMessage) {
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
}
