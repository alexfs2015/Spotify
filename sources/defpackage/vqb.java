package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.common.base.Optional;
import com.google.common.net.HostAndPort;
import com.spotify.base.java.logging.Logger;
import com.spotify.localization.SpotifyLocale.Separator;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.ErrorDomain;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: vqb reason: default package */
public final class vqb implements FlowableOnSubscribe<wan> {
    private static final wgw a = wgw.b((CharSequence) "x-route");
    private static final byte[] b = "\r\n".getBytes(far.c);
    private static final byte[] c = "content-type: application/json\r\ncontent-disposition: form-data; name=\"player-state\"\r\n\r\n".getBytes(far.c);
    private final String d;
    private final String e;
    private final String f;
    private final ObjectMapper g;
    private final wgd h;
    private final wbv i;
    private final PlayerState j;
    private final byte[] k;
    private final HostAndPort l;
    private final boolean m;
    private final vre n;

    public vqb(String str, ObjectMapper objectMapper, wgd wgd, wbv wbv, boolean z, PlayerState playerState, String str2, String str3, String str4, boolean z2, vrf vrf, String str5, Optional<String> optional, Optional<String> optional2, vre vre) {
        wep wep = new wep(vrf.b());
        wep.a("uid", str5);
        String str6 = str4;
        wep.a("client-version", str4);
        wep.a("client-locale", gnd.a(Locale.getDefault(), Separator.DASH.mSeparator));
        if (optional2.b()) {
            String str7 = (String) optional2.c();
            if (!fax.a(str7)) {
                wep.a("asr", str7);
            }
        }
        String str8 = "true";
        if (z) {
            wep.a("save_audio", str8);
        }
        if (z2) {
            wep.a("nft", str8);
        }
        if (optional.b()) {
            String str9 = (String) optional.c();
            if (!fax.a(str9)) {
                wep.a("language", str9);
            }
        }
        this.e = str;
        this.f = wep.toString();
        this.g = objectMapper;
        this.h = wgd;
        this.i = wbv;
        this.j = playerState;
        String str10 = str2;
        this.k = str2.getBytes(far.a);
        this.l = HostAndPort.a(vrf.a(), vrf.c());
        this.m = vrf.e();
        this.d = str3;
        this.n = vre;
    }

    public final void subscribe(FlowableEmitter<wan> flowableEmitter) {
        vyj vyj = new vyj();
        wbv wbv = this.i;
        if (wbv == null) {
            throw new NullPointerException("group");
        } else if (vyj.a == null) {
            vyj.a = wbv;
            vyj vyj2 = vyj;
            wcc wcc = new wcc(wcv.class);
            if (vyj2.b == null) {
                vyj2.b = wcc;
                vyj vyj3 = vyj2;
                vqa vqa = new vqa(flowableEmitter, this.h, this.g, this.l, this.n);
                vyj3.f = vqa;
                vyj vyj4 = vyj3;
                InetSocketAddress createUnresolved = InetSocketAddress.createUnresolved(this.l.host, this.l.a());
                if (createUnresolved != null) {
                    vyj4.a();
                    SocketAddress a2 = vyj4.g.a();
                    war c2 = vyj4.c();
                    wan e2 = c2.e();
                    if (!c2.isDone()) {
                        a aVar = new a(e2);
                        AnonymousClass1 r8 = new was(aVar, e2, createUnresolved, a2) {
                            private /* synthetic */ a c;
                            private /* synthetic */ wan d;
                            private /* synthetic */ SocketAddress e;
                            private /* synthetic */ SocketAddress f;

                            {
                                this.c = r2;
                                this.d = r3;
                                this.e = r4;
                                this.f = r5;
                            }

                            public final /* synthetic */ void operationComplete(wic wic) {
                                Throwable f2 = ((war) wic).f();
                                if (f2 != null) {
                                    this.c.c(f2);
                                    return;
                                }
                                a aVar = this.c;
                                aVar.a = true;
                                vyj.this.a(this.d, this.e, this.f, aVar);
                            }
                        };
                        c2.a(r8);
                        c2 = aVar;
                    } else if (c2.g()) {
                        c2 = vyj4.a(e2, createUnresolved, a2, e2.k());
                    }
                    c2.a(new $$Lambda$vqb$rCdZb756NPNfrXjjttglyS_3vzk(this, flowableEmitter));
                    return;
                }
                throw new NullPointerException("remoteAddress");
            }
            throw new IllegalStateException("channelFactory set already");
        } else {
            throw new IllegalStateException("group set already");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(FlowableEmitter flowableEmitter, war war) {
        if (!war.g()) {
            Logger.e("Bootstrap connection was not successful", new Object[0]);
            if (!flowableEmitter.b()) {
                flowableEmitter.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, vrd.d, war.f()));
            }
            return;
        }
        wdo wdo = new wdo(wen.b, wee.c, this.f);
        wea d2 = wdo.d();
        wgw wgw = wdy.c;
        StringBuilder sb = new StringBuilder("multipart/mixed; boundary=");
        sb.append(this.d.substring(2));
        d2.b((CharSequence) wgw, (Object) sb.toString());
        d2.b((CharSequence) wdy.d, (Object) this.l.toString());
        wgw wgw2 = wdy.a;
        StringBuilder sb2 = new StringBuilder("Bearer ");
        sb2.append(this.e);
        d2.b((CharSequence) wgw2, (Object) sb2.toString());
        d2.b("X-ClientVersion", (Object) "");
        if (this.m) {
            wdo.d().b((CharSequence) a, (Object) "pool=dev");
        }
        wem.a((wec) wdo, true);
        Logger.b("sending speech-proxy request %s", wdo);
        war.e().b((Object) wdo).a(new $$Lambda$vqb$n3miZRmlt6iM6EZTKdtUH1gZ4(this, flowableEmitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter, war war) {
        if (!flowableEmitter.b()) {
            if (!war.g()) {
                Throwable f2 = war.f();
                Logger.e(f2, "Error while writing HTTP headers to speech-proxy active=%s", Boolean.valueOf(war.e().D()));
                flowableEmitter.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, vrd.e, f2));
                return;
            }
            wan e2 = war.e();
            if (e2.D()) {
                vyv a2 = e2.d().a();
                byte[] bytes = this.d.getBytes(far.c);
                a2.b(bytes);
                a2.b(b);
                a2.b(c);
                ObjectWriter writer = this.g.writer();
                vyz vyz = new vyz(a2);
                PlayerState playerState = this.j;
                if (playerState != null) {
                    writer.writeValue(vyz, playerState);
                } else {
                    writer.writeValue(vyz, new JSONObject());
                }
                a2.b(b);
                a2.b(bytes);
                a2.b(b);
                a2.b(this.k);
                a2.b(b);
                a2.b(b);
                e2.b((Object) a2).a(new $$Lambda$vqb$MdoPUiGqLeK5kct9wiEyBLi8fD4(flowableEmitter));
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(FlowableEmitter flowableEmitter, war war) {
        if (war.g()) {
            Logger.b("Successfully sent player state, now onto audio!", new Object[0]);
            flowableEmitter.a(war.e());
            return;
        }
        Logger.e("Error sending data %s", war.f());
        flowableEmitter.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, vrd.f, war.f()));
    }
}
