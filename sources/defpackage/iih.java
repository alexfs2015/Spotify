package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.model.FieldValidator.ValidationException;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

/* renamed from: iih reason: default package */
public final class iih implements iig {
    private final iia a;
    private final ihy b;
    private final ijq c;
    private a d;
    private Disposable e = Disposables.b();

    /* renamed from: iih$a */
    public interface a {
        void a(iia iia);

        void a(iia iia, boolean z);
    }

    public iih(iia iia, ihy ihy, ijq ijq, a aVar) {
        this.a = iia;
        this.b = ihy;
        this.c = ijq;
        this.d = aVar;
    }

    public final void a(String str, HelloDetails helloDetails) {
        String str2 = "roles";
        String str3 = "details";
        String str4 = "wamp.error.invalid_argument";
        try {
            ijd ijd = this.a.g;
            ijd.a((Object) helloDetails, str3);
            ijd.a((Object) "spotify", (Object) str, "uri");
            ijd.a((Object) helloDetails, LogMessage.SEVERITY_INFO, str3);
            boolean z = true;
            ijd.a((Object) Integer.valueOf(1), (Object) Integer.valueOf(helloDetails.info.protocolVersion), "protocol version");
            ijd.a(helloDetails.info.name, "name");
            ijd.a(helloDetails.info.id, "id");
            ijd.a(0, 10000, helloDetails.info.defaultImageWidth, "default image width");
            ijd.a(0, 10000, helloDetails.info.defaultImageHeight, "default image height");
            ijd.a(0, 10000, helloDetails.info.defaultThumbnailImageWidth, "default thumbnail image width");
            ijd.a(0, 10000, helloDetails.info.defaultThumbnailImageHeight, "default thumbnail image height");
            ijd.a((Object) helloDetails.roles, "subscriber", str2);
            ijd.a((Object) helloDetails.roles, "caller", str2);
            if (this.a.b) {
                ijd ijd2 = this.a.g;
                ijd.a(helloDetails.authid, "authid");
                ijd.a(helloDetails.authmethods, "authmethods");
                String[] strArr = helloDetails.authmethods;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str5 = strArr[i];
                    if (ijc.a.contains(str5)) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("\"");
                        sb.append(str5);
                        sb.append("\" is not a valid auth method");
                        throw new ValidationException(sb.toString());
                    }
                }
            }
            List<String> list = helloDetails.info.requiredFeatures;
            ImmutableList<String> immutableList = iil.a;
            if (list != null) {
                z = immutableList.containsAll(list);
            }
            if (!z) {
                this.b.a(new Message("Feature mismatch"), "com.spotify.error.unsupported_version");
                a(false);
                return;
            }
            this.a.h = (HelloDetails) fay.a(helloDetails);
            if (!wpi.a((Object[]) helloDetails.authmethods)) {
                ktb ktb = (ktb) this.a.a.get(helloDetails.authmethods[0]);
                if (ktb == null) {
                    this.b.a(new Message("Unsupported authentication method"), "wamp.error");
                    a(false);
                } else {
                    try {
                        ktb.a(helloDetails.mapToAuthDetails());
                        this.e = ktb.b(helloDetails.mapToAuthDetails()).a((Action) new $$Lambda$iih$_YoBCjr2pngPv30ujAYJivqdZ8(this), (Consumer<? super Throwable>) new $$Lambda$iih$Ok1ufhZx38Hq4Wi78nc3LF3nBs<Object>(this));
                    } catch (ValidationException e2) {
                        Logger.e(e2.getMessage(), new Object[0]);
                        this.b.a(Message.fromValidationException(e2), str4);
                        a(false);
                    }
                }
            } else {
                a();
            }
            this.c.a(this.a);
        } catch (ValidationException e3) {
            Logger.e(e3.getMessage(), new Object[0]);
            this.b.a(Message.fromValidationException(e3), str4);
            a(false);
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        if (th instanceof BuiltInAuthException) {
            IapException a2 = IapException.a((BuiltInAuthException) th);
            this.b.a((Message) a2.reason, a2.errorUri);
        } else {
            this.b.a(new Message(th.toString()), "com.spotify.error.client_authentication_failed");
        }
        a(false);
    }

    public final void b(String str) {
        try {
            ijd ijd = this.a.g;
            ijd.a(str, "signature");
            a();
        } catch (ValidationException e2) {
            this.b.a(Message.fromValidationException(e2), "wamp.error");
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        iia iia = this.a;
        iia.i = 1;
        iii iii = iia.d;
        int i = this.a.c;
        iia iia2 = this.a;
        HelloDetails b2 = iia2.b();
        String str = this.a.e;
        String str2 = this.a.f;
        iii.i = b2;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("_root");
        iii.j = sb.toString();
        defpackage.rqi.a b3 = new defpackage.rqi.a(str2).b(str);
        String idOrUnknown = b2.info.idOrUnknown();
        String str3 = "";
        if (idOrUnknown == null) {
            idOrUnknown = str3;
        }
        b3.c = idOrUnknown;
        defpackage.rqi.a e2 = b3.a(b2.info.name).e(b2.info.model);
        String str4 = b2.info.version;
        if (str4 == null) {
            str4 = str3;
        }
        e2.i = str4;
        if (b2.info.isCategoryCar()) {
            e2.c("car");
        } else if (b2.info.isCategoryWearable()) {
            e2.c("wearable");
        } else if (b2.info.isCategoryApp()) {
            e2.c("app");
        }
        if (b2.info.isCategoryApp()) {
            iii.k = true;
        } else {
            iii.k = b2.info.requiresFeature("com.spotify.features.load_multiple_images");
        }
        iii.m = iii.b.a(e2.a());
        iii.m.b();
        iii.q = new iij(iii.b, iii.m);
        ikg ikg = new ikg(iii.a, iii.b, iia2, iii.e, iii.d, iii.f);
        iii.l = ikg;
        ikg ikg2 = iii.l;
        ijw ijw = new ijw(ikg2.d, ikg2.b, ikg2.e);
        iki iki = new iki(ikg2.d, ikg2.b, ikg2.e);
        ijx ijx = new ijx(ikg2.d, ikg2.b, ikg2.e);
        ikd ikd = new ikd(ikg2.d, ikg2.b, ikg2.e);
        ika ika = new ika(ikg2.d, ikg2.b, ikg2.e);
        ikb ikb = new ikb(ikg2.d, ikg2.b, ikg2.e);
        ijz ijz = new ijz(ikg2.d, ikg2.b, ikg2.e);
        ijv ijv = new ijv(ikg2.a, ikg2.d, ikg2.b, new ijh(ikg2.d, ikg2.e));
        ike ike = new ike(ikg2.a, ikg2.d, ikg2.b, ikg2.e);
        ijt ijt = new ijt(ikg2.d, ikg2.b);
        ijy ijy = new ijy(ikg2.d, ikg2.b, ikg2.e);
        iii iii2 = iii;
        iju iju = new iju(ikg2.d, ikg2.b, ikg2.f);
        iju iju2 = iju;
        ijy ijy2 = ijy;
        ijt ijt2 = ijt;
        ikh ikh = new ikh(ikg2.a, ikg2.d, ikg2.b, ikg2.e, ikg2.g);
        ikc ikc = new ikc(ikg2.a, ikg2.d, ikg2.b, ikg2.e);
        ikg2.c.put("com.spotify.current_track", ijw);
        ikg2.c.put("com.spotify.track_elapsed", iki);
        ikg2.c.put("com.spotify.playback_speed", ijx);
        ikg2.c.put("com.spotify.shuffle", ikd);
        ikg2.c.put("com.spotify.repeat", ika);
        ikg2.c.put("com.spotify.saved", ikb);
        ikg2.c.put("com.spotify.rating", ijz);
        ikg2.c.put("com.spotify.current_context", ijv);
        ikg2.c.put("com.spotify.status", ike);
        ikg2.c.put("com.spotify.alert", ijt2);
        ikg2.c.put("com.spotify.player_state", ijy2);
        ikg2.c.put("com.spotify.capabilities", iju2);
        ikg2.c.put("com.spotify.token", ikh);
        ikg2.c.put("com.spotify.session_state", ikc);
        iii iii3 = iii2;
        iii3.l.a();
        iii3.a();
        iii3.n = iii3.b.a();
        iii3.o = iii3.b.d();
        iii3.p = iii3.b.e();
        this.b.a(this.a.c, AppProtocol.d);
        a(true);
    }

    private void a(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.a, z);
        }
    }

    public final void a(ija ija) {
        int i;
        this.a.a();
        try {
            iii iii = this.a.d;
            int a2 = ija.a();
            String b2 = ija.b();
            iii.b(4);
            iii.c.a(a2, b2);
            ikf a3 = iii.l.a(b2);
            if (a3 != null) {
                i = a3.d();
            } else {
                Logger.d("Attempted to subscribe to unknown topic \"%s\".", b2);
                i = iii.g.getAndIncrement();
            }
            this.c.a(this.a);
            this.b.a(ija.a(), i);
            try {
                iii iii2 = this.a.d;
                iii2.b(4);
                iii2.c.a(ija.a(), ija.b());
                ikf a4 = iii2.l.a(ija.b());
                if (a4 != null) {
                    a4.a(ija, i);
                } else {
                    Logger.d("Attempted to notify subscribed to unknown topic \"%s\".", ija.b());
                }
            } catch (ValidationException unused) {
            }
        } catch (ValidationException e2) {
            this.b.a(32, ija.a(), Message.fromValidationException(e2), "wamp.error.invalid_argument");
        }
    }

    public final void a(int i, int i2) {
        ikf ikf;
        this.a.a();
        try {
            iii iii = this.a.d;
            ijd ijd = iii.c;
            boolean z = false;
            ijd.a(0, Integer.MAX_VALUE, i, "request id");
            ijd.a(Integer.MIN_VALUE, Integer.MAX_VALUE, i2, "subscription id");
            Iterator it = iii.l.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ikf = null;
                    break;
                }
                ikf = (ikf) it.next();
                if (ikf.a.contains(Integer.valueOf(i2))) {
                    break;
                }
            }
            if (ikf != null) {
                ikf.a(i2);
                z = true;
            }
            if (z) {
                this.c.a(this.a);
                this.b.a(i);
                return;
            }
            this.b.a(34, i, AppProtocol.a, "wamp.error.no_such_subscription");
        } catch (ValidationException e2) {
            this.b.a(34, i, Message.fromValidationException(e2), "wamp.error.invalid_argument");
        }
    }

    public final void a(String str) {
        this.a.a(str);
        this.e.bf_();
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.a);
        }
        ijq ijq = this.c;
        int i = this.a.c;
        ijq.a.remove(Integer.valueOf(i));
        Logger.b("Session stopped: %d", Integer.valueOf(i));
        ijq.b.onNext(ijq.a());
    }
}
