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

/* renamed from: vhm reason: default package */
public final class vhm {
    public final vht a;
    public final vht b;
    final vht c;
    public vhk d = null;
    private final vgv e;
    private final vhq f;
    private final vhn g;

    static vhm a(Context context, wmb wmb, gdy gdy) {
        Context applicationContext = context.getApplicationContext();
        vhm vhm = new vhm(new vgv(applicationContext), CC.a(vhr.a(wmb)), new vho(gdy), vhs.a(applicationContext, "remote-config-fetched.pb"), vhs.a(applicationContext, "remote-config-active.pb"), vhs.a(applicationContext, "remote-config-debug.pb"));
        return vhm;
    }

    private vhm(vgv vgv, vhq vhq, vhn vhn, vht vht, vht vht2, vht vht3) {
        this.e = vgv;
        this.f = vhq;
        this.g = vhn;
        this.a = vht;
        this.b = vht2;
        this.c = vht3;
    }

    public final boolean a(byte[] bArr) {
        if (bArr.length == 0) {
            return false;
        }
        try {
            this.a.a(vhk.a(GranularConfiguration.a(bArr)));
            return true;
        } catch (InvalidProtocolBufferException e2) {
            xal.a(e2, "Invalid format of configuration.", new Object[0]);
            return false;
        }
    }

    public final Completable a(Type type) {
        Single c2 = this.f.a(Platform.ANDROID.toString(), this.e.a, this.e.b, this.e.c, this.e.b, String.valueOf(type)).a((BiConsumer<? super T, ? super Throwable>) new $$Lambda$vhm$i80yJCDnr5S9MbEKSQuNujqHt5I<Object,Object>(this)).a((Predicate<? super T>) $$Lambda$bjxtsAhy3C7_d3KTKHPBtJNucXY.INSTANCE).a((Function<? super T, ? extends R>) $$Lambda$vcTbhcXBmAbLysNnkW3qUgjzHuQ.INSTANCE).c().b(Schedulers.b()).f($$Lambda$KEoP0J5SsKRJHs_HBRr4PXk8ng.INSTANCE).c(this.a.a());
        vht vht = this.a;
        vht.getClass();
        return c2.b((Consumer<? super T>) new $$Lambda$rfe9kWSGUuTVxkAoEfMD_7ibLAc<Object>(vht)).bd_();
    }

    public final void a() {
        a(this.a.a());
    }

    /* access modifiers changed from: 0000 */
    public void a(vhk vhk) {
        this.d = vhk;
        this.b.a(vhk);
        this.g.a(this.e, vhk);
    }

    /* access modifiers changed from: private */
    public void a(wsj<GranularConfiguration> wsj, Throwable th) {
        if (th != null) {
            xal.a(th, "There was an error when calling fetch.", new Object[0]);
            this.g.a(this.e, 500, th.toString());
        }
        if (wsj != null && !wsj.a()) {
            xal.c("There was an error returned from RCS. code: %d body: %s", Integer.valueOf(wsj.a.c), wsj.b());
            this.g.a(this.e, wsj.a.c, wsj.b.f());
        }
        xal.b("RCS responded with code %d and body %s", Integer.valueOf(wsj.a.c), wsj.b());
    }
}
