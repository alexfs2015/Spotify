package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.common.base.Optional;
import com.google.common.net.HostAndPort;
import com.spotify.base.java.logging.Logger;
import com.spotify.localization.SpotifyLocale.Separator;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: wdc reason: default package */
public final class wdc implements FlowableOnSubscribe<wot> {
    private static final wvc a = wvc.b((CharSequence) "x-route");
    private static final byte[] b = "\r\n".getBytes(fbi.c);
    private static final byte[] c = "content-type: application/json\r\ncontent-disposition: form-data; name=\"player-state\"\r\n\r\n".getBytes(fbi.c);
    private final String d;
    private final String e;
    private final String f;
    private final ObjectMapper g;
    private final wuj h;
    private final wqb i;
    private final PlayerState j;
    private final byte[] k;
    private final HostAndPort l;
    private final boolean m;
    private final wem n;

    public wdc(String str, ObjectMapper objectMapper, wuj wuj, wqb wqb, boolean z, PlayerState playerState, String str2, String str3, String str4, boolean z2, wen wen, String str5, Optional<String> optional, Optional<String> optional2, wem wem) {
        wsv wsv = new wsv(wen.b());
        wsv.a("uid", str5);
        String str6 = str4;
        wsv.a("client-version", str4);
        wsv.a("client-locale", gos.a(Locale.getDefault(), Separator.DASH.mSeparator));
        if (optional2.b()) {
            String str7 = (String) optional2.c();
            if (!fbo.a(str7)) {
                wsv.a("asr", str7);
            }
        }
        String str8 = "true";
        if (z) {
            wsv.a("save_audio", str8);
        }
        if (z2) {
            wsv.a("nft", str8);
        }
        if (optional.b()) {
            String str9 = (String) optional.c();
            if (!fbo.a(str9)) {
                wsv.a("language", str9);
            }
        }
        this.e = str;
        this.f = wsv.toString();
        this.g = objectMapper;
        this.h = wuj;
        this.i = wqb;
        this.j = playerState;
        String str10 = str2;
        this.k = str2.getBytes(fbi.a);
        this.l = HostAndPort.a(wen.a(), wen.c());
        this.m = wen.e();
        this.d = str3;
        this.n = wem;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter, wox wox) {
        if (!flowableEmitter.b()) {
            if (!wox.g()) {
                Throwable f2 = wox.f();
                Logger.e(f2, "Error while writing HTTP headers to speech-proxy active=%s", Boolean.valueOf(wox.e().D()));
                flowableEmitter.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, wel.e, f2));
                return;
            }
            wot e2 = wox.e();
            if (e2.D()) {
                wnb a2 = e2.d().a();
                byte[] bytes = this.d.getBytes(fbi.c);
                a2.b(bytes);
                a2.b(b);
                a2.b(c);
                ObjectWriter writer = this.g.writer();
                wnf wnf = new wnf(a2);
                PlayerState playerState = this.j;
                if (playerState != null) {
                    writer.writeValue(wnf, vhz.a(playerState));
                } else {
                    writer.writeValue(wnf, new JSONObject());
                }
                a2.b(b);
                a2.b(bytes);
                a2.b(b);
                a2.b(this.k);
                a2.b(b);
                a2.b(b);
                e2.b((Object) a2).a(new $$Lambda$wdc$vwx9oodKowtS2fp6TcqOBEfb8mw(flowableEmitter));
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(FlowableEmitter flowableEmitter, wox wox) {
        if (wox.g()) {
            Logger.b("Successfully sent player state, now onto audio!", new Object[0]);
            flowableEmitter.a(wox.e());
            return;
        }
        Logger.e("Error sending data %s", wox.f());
        flowableEmitter.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, wel.f, wox.f()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(FlowableEmitter flowableEmitter, wox wox) {
        if (!wox.g()) {
            Logger.e("Bootstrap connection was not successful", new Object[0]);
            if (!flowableEmitter.b()) {
                flowableEmitter.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, wel.d, wox.f()));
            }
            return;
        }
        wru wru = new wru(wst.b, wsk.c, this.f);
        wsg d2 = wru.d();
        wvc wvc = wse.c;
        StringBuilder sb = new StringBuilder("multipart/mixed; boundary=");
        sb.append(this.d.substring(2));
        d2.b((CharSequence) wvc, (Object) sb.toString());
        d2.b((CharSequence) wse.d, (Object) this.l.toString());
        wvc wvc2 = wse.a;
        StringBuilder sb2 = new StringBuilder("Bearer ");
        sb2.append(this.e);
        d2.b((CharSequence) wvc2, (Object) sb2.toString());
        d2.b("X-ClientVersion", (Object) "");
        if (this.m) {
            wru.d().b((CharSequence) a, (Object) "pool=dev");
        }
        wss.a((wsi) wru, true);
        Logger.b("sending speech-proxy request %s", wru);
        wox.e().b((Object) wru).a(new $$Lambda$wdc$NQDPwEvqX9LzVwkP1WRlq3OQjGY(this, flowableEmitter));
    }

    public final void subscribe(FlowableEmitter<wot> flowableEmitter) {
        wmp wmp = new wmp();
        wqb wqb = this.i;
        if (wqb == null) {
            throw new NullPointerException("group");
        } else if (wmp.a == null) {
            wmp.a = wqb;
            wmp wmp2 = wmp;
            wqi wqi = new wqi(wrb.class);
            if (wmp2.b == null) {
                wmp2.b = wqi;
                wmp wmp3 = wmp2;
                wdb wdb = new wdb(flowableEmitter, this.h, this.g, this.l, this.n);
                wmp3.f = wdb;
                wmp wmp4 = wmp3;
                InetSocketAddress createUnresolved = InetSocketAddress.createUnresolved(this.l.host, this.l.a());
                if (createUnresolved != null) {
                    wmp4.a();
                    SocketAddress a2 = wmp4.g.a();
                    wox c2 = wmp4.c();
                    wot e2 = c2.e();
                    if (!c2.isDone()) {
                        a aVar = new a(e2);
                        AnonymousClass1 r8 = new woy(aVar, e2, createUnresolved, a2) {
                            private /* synthetic */ a c;
                            private /* synthetic */ wot d;
                            private /* synthetic */ SocketAddress e;
                            private /* synthetic */ SocketAddress f;

                            {
                                this.c = r2;
                                this.d = r3;
                                this.e = r4;
                                this.f = r5;
                            }

                            public final /* synthetic */ void operationComplete(wwi wwi) {
                                Throwable f2 = ((wox) wwi).f();
                                if (f2 != null) {
                                    this.c.c(f2);
                                    return;
                                }
                                a aVar = this.c;
                                aVar.a = true;
                                wmp.this.a(this.d, this.e, this.f, aVar);
                            }
                        };
                        c2.a(r8);
                        c2 = aVar;
                    } else if (c2.g()) {
                        c2 = wmp4.a(e2, createUnresolved, a2, e2.k());
                    }
                    c2.a(new $$Lambda$wdc$xMHqmazciFetLRQh2JrWVX6kXM(this, flowableEmitter));
                    return;
                }
                throw new NullPointerException("remoteAddress");
            }
            throw new IllegalStateException("channelFactory set already");
        } else {
            throw new IllegalStateException("group set already");
        }
    }
}
