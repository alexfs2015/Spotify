package defpackage;

import android.content.Context;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.rcs.model.Fetch.Type;
import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.rcs.model.Platform;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

/* renamed from: vur reason: default package */
public final class vur {
    public final vuy a;
    public final vuy b;
    final vuy c;
    public vup d = null;
    private final vua e;
    private final vuv f;
    private final vus g;

    private vur(vua vua, vuv vuv, vus vus, vuy vuy, vuy vuy2, vuy vuy3) {
        this.e = vua;
        this.f = vuv;
        this.g = vus;
        this.a = vuy;
        this.b = vuy2;
        this.c = vuy3;
    }

    static vur a(Context context, xah xah, gfj gfj) {
        Context applicationContext = context.getApplicationContext();
        vur vur = new vur(new vua(applicationContext), CC.a(vuw.a(xah)), new vut(gfj), vux.a(applicationContext, "remote-config-fetched.pb"), vux.a(applicationContext, "remote-config-active.pb"), vux.a(applicationContext, "remote-config-debug.pb"));
        return vur;
    }

    /* access modifiers changed from: private */
    public void a(xgo<GranularConfiguration> xgo, Throwable th) {
        if (th != null) {
            xop.a(th, "There was an error when calling fetch.", new Object[0]);
            this.g.a(this.e, 500, th.toString());
        }
        if (xgo != null && !xgo.a()) {
            xop.c("There was an error returned from RCS. code: %d body: %s", Integer.valueOf(xgo.a.c), xgo.b());
            this.g.a(this.e, xgo.a.c, xgo.b.f());
        }
        xop.b("RCS responded with code %d and body %s", Integer.valueOf(xgo.a.c), xgo.b());
    }

    public final Completable a(Type type) {
        Single c2 = this.f.a(Platform.ANDROID.toString(), this.e.a, this.e.b, this.e.c, this.e.b, String.valueOf(type)).a((BiConsumer<? super T, ? super Throwable>) new $$Lambda$vur$P04Bg4Vf8A_97QTdkGiZQN65z74<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$L9hiCCho6yilAi5YtcOUOMgZDdQ.INSTANCE).a((Function<? super T, ? extends R>) $$Lambda$7ooLYOgilopL2LOKhNtOggjXvBo.INSTANCE).c().b(Schedulers.b()).f($$Lambda$C5J1C0ek5OijvqEZApvUfSrJSEU.INSTANCE).c(this.a.a());
        vuy vuy = this.a;
        vuy.getClass();
        return c2.b((Consumer<? super T>) new $$Lambda$FhEiKfNfd1znXuoIRnsU_vEeryo<Object>(vuy)).bb_();
    }

    public final void a() {
        a(this.a.a());
    }

    /* access modifiers changed from: 0000 */
    public void a(vup vup) {
        this.d = vup;
        this.b.a(vup);
        this.g.a(this.e, vup);
    }

    public final boolean a(byte[] bArr) {
        if (bArr.length == 0) {
            return false;
        }
        try {
            this.a.a(vup.a(GranularConfiguration.a(bArr)));
            return true;
        } catch (InvalidProtocolBufferException e2) {
            xop.a(e2, "Invalid format of configuration.", new Object[0]);
            return false;
        }
    }
}
