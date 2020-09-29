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

/* renamed from: iku reason: default package */
public final class iku implements ikt {
    private final ikn a;
    private final ikl b;
    private final imd c;
    private a d;
    private Disposable e = Disposables.b();

    /* renamed from: iku$a */
    public interface a {
        void a(ikn ikn);

        void a(ikn ikn, boolean z);
    }

    public iku(ikn ikn, ikl ikl, imd imd, a aVar) {
        this.a = ikn;
        this.b = ikl;
        this.c = imd;
        this.d = aVar;
    }

    /* access modifiers changed from: private */
    public void a() {
        ikn ikn = this.a;
        ikn.i = 1;
        ikv ikv = ikn.d;
        int i = this.a.c;
        ikn ikn2 = this.a;
        HelloDetails b2 = ikn2.b();
        String str = this.a.e;
        String str2 = this.a.f;
        ikv.i = b2;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("_root");
        ikv.j = sb.toString();
        ikv.r = ikv.a(b2);
        defpackage.rzt.a b3 = new defpackage.rzt.a(str2).b(str);
        String idOrUnknown = b2.info.idOrUnknown();
        String str3 = "";
        if (idOrUnknown == null) {
            idOrUnknown = str3;
        }
        b3.c = idOrUnknown;
        defpackage.rzt.a e2 = b3.a(b2.info.name).e(b2.info.model);
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
            ikv.k = true;
        } else {
            ikv.k = b2.info.requiresFeature("com.spotify.features.load_multiple_images");
        }
        ikv.m = ikv.b.a(e2.a());
        ikv.m.b();
        ikv.q = new ikw(ikv.b, ikv.m);
        imt imt = new imt(ikv.a, ikv.b, ikn2, ikv.e, ikv.d, ikv.f);
        ikv.l = imt;
        imt imt2 = ikv.l;
        imj imj = new imj(imt2.d, imt2.b, imt2.e);
        imv imv = new imv(imt2.d, imt2.b, imt2.e);
        imk imk = new imk(imt2.d, imt2.b, imt2.e);
        imq imq = new imq(imt2.d, imt2.b, imt2.e);
        imn imn = new imn(imt2.d, imt2.b, imt2.e);
        imo imo = new imo(imt2.d, imt2.b, imt2.e);
        imm imm = new imm(imt2.d, imt2.b, imt2.e);
        imi imi = new imi(imt2.a, imt2.d, imt2.b, new ilu(imt2.d, imt2.e));
        imr imr = new imr(imt2.a, imt2.d, imt2.b, imt2.e);
        img img = new img(imt2.d, imt2.b);
        iml iml = new iml(imt2.d, imt2.b, imt2.e);
        ikv ikv2 = ikv;
        imh imh = new imh(imt2.d, imt2.b, imt2.f);
        imh imh2 = imh;
        iml iml2 = iml;
        img img2 = img;
        imu imu = new imu(imt2.a, imt2.d, imt2.b, imt2.e, imt2.g);
        imp imp = new imp(imt2.a, imt2.d, imt2.b, imt2.e);
        imt2.c.put("com.spotify.current_track", imj);
        imt2.c.put("com.spotify.track_elapsed", imv);
        imt2.c.put("com.spotify.playback_speed", imk);
        imt2.c.put("com.spotify.shuffle", imq);
        imt2.c.put("com.spotify.repeat", imn);
        imt2.c.put("com.spotify.saved", imo);
        imt2.c.put("com.spotify.rating", imm);
        imt2.c.put("com.spotify.current_context", imi);
        imt2.c.put("com.spotify.status", imr);
        imt2.c.put("com.spotify.alert", img2);
        imt2.c.put("com.spotify.player_state", iml2);
        imt2.c.put("com.spotify.capabilities", imh2);
        imt2.c.put("com.spotify.token", imu);
        imt2.c.put("com.spotify.session_state", imp);
        ikv ikv3 = ikv2;
        ikv3.l.a();
        ikv3.a();
        ikv3.n = ikv3.b.a();
        ikv3.o = ikv3.b.d();
        ikv3.p = ikv3.b.e();
        this.b.a(this.a.c, AppProtocol.d);
        a(true);
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

    private void a(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.a, z);
        }
    }

    public final void a(int i, int i2) {
        ims ims;
        this.a.a();
        try {
            ikv ikv = this.a.d;
            ilq ilq = ikv.c;
            boolean z = false;
            ilq.a(0, Integer.MAX_VALUE, i, "request id");
            ilq.a(Integer.MIN_VALUE, Integer.MAX_VALUE, i2, "subscription id");
            Iterator it = ikv.l.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ims = null;
                    break;
                }
                ims = (ims) it.next();
                if (ims.a.contains(Integer.valueOf(i2))) {
                    break;
                }
            }
            if (ims != null) {
                ims.a(i2);
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

    public final void a(iln iln) {
        int i;
        this.a.a();
        try {
            ikv ikv = this.a.d;
            int a2 = iln.a();
            String b2 = iln.b();
            ikv.b(4);
            ikv.c.a(a2, b2);
            ims a3 = ikv.l.a(b2);
            if (a3 != null) {
                i = a3.d();
            } else {
                Logger.d("Attempted to subscribe to unknown topic \"%s\".", b2);
                i = ikv.g.getAndIncrement();
            }
            this.c.a(this.a);
            this.b.a(iln.a(), i);
            try {
                ikv ikv2 = this.a.d;
                ikv2.b(4);
                ikv2.c.a(iln.a(), iln.b());
                ims a4 = ikv2.l.a(iln.b());
                if (a4 != null) {
                    a4.a(iln, i);
                } else {
                    Logger.d("Attempted to notify subscribed to unknown topic \"%s\".", iln.b());
                }
            } catch (ValidationException unused) {
            }
        } catch (ValidationException e2) {
            this.b.a(32, iln.a(), Message.fromValidationException(e2), "wamp.error.invalid_argument");
        }
    }

    public final void a(String str) {
        this.a.a(str);
        this.e.bd_();
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.a);
        }
        imd imd = this.c;
        int i = this.a.c;
        imd.a.remove(Integer.valueOf(i));
        Logger.b("Session stopped: %d", Integer.valueOf(i));
        imd.b.onNext(imd.a());
    }

    public final void a(String str, HelloDetails helloDetails) {
        String str2 = "roles";
        String str3 = "details";
        String str4 = "wamp.error.invalid_argument";
        try {
            ilq ilq = this.a.g;
            ilq.a((Object) helloDetails, str3);
            ilq.a((Object) "spotify", (Object) str, "uri");
            ilq.a((Object) helloDetails, LogMessage.SEVERITY_INFO, str3);
            boolean z = true;
            ilq.a((Object) Integer.valueOf(1), (Object) Integer.valueOf(helloDetails.info.protocolVersion), "protocol version");
            ilq.a(helloDetails.info.name, "name");
            ilq.a(helloDetails.info.id, "id");
            ilq.a(0, 10000, helloDetails.info.defaultImageWidth, "default image width");
            ilq.a(0, 10000, helloDetails.info.defaultImageHeight, "default image height");
            ilq.a(0, 10000, helloDetails.info.defaultThumbnailImageWidth, "default thumbnail image width");
            ilq.a(0, 10000, helloDetails.info.defaultThumbnailImageHeight, "default thumbnail image height");
            ilq.a((Object) helloDetails.roles, "subscriber", str2);
            ilq.a((Object) helloDetails.roles, "caller", str2);
            if (this.a.b) {
                ilq ilq2 = this.a.g;
                ilq.a(helloDetails.authid, "authid");
                ilq.a(helloDetails.authmethods, "authmethods");
                String[] strArr = helloDetails.authmethods;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str5 = strArr[i];
                    if (ilp.a.contains(str5)) {
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
            ImmutableList<String> immutableList = iky.a;
            if (list != null) {
                z = immutableList.containsAll(list);
            }
            if (!z) {
                this.b.a(new Message("Feature mismatch"), "com.spotify.error.unsupported_version");
                a(false);
                return;
            }
            this.a.h = (HelloDetails) fbp.a(helloDetails);
            if (!xdo.a((Object[]) helloDetails.authmethods)) {
                kwk kwk = (kwk) this.a.a.get(helloDetails.authmethods[0]);
                if (kwk == null) {
                    this.b.a(new Message("Unsupported authentication method"), "wamp.error");
                    a(false);
                } else {
                    try {
                        kwk.a(helloDetails.mapToAuthDetails());
                        this.e = kwk.b(helloDetails.mapToAuthDetails()).a((Action) new $$Lambda$iku$_JpKS4kaiYHoyWbV8nOzOGumrww(this), (Consumer<? super Throwable>) new $$Lambda$iku$6bUmaU6M3cBJZKWnr5dqMxe7n0<Object>(this));
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

    public final void b(String str) {
        try {
            ilq ilq = this.a.g;
            ilq.a(str, "signature");
            a();
        } catch (ValidationException e2) {
            this.b.a(Message.fromValidationException(e2), "wamp.error");
        }
    }
}
