package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tdy reason: default package */
public final class tdy implements c<gzt, tfg> {
    private final teb a;

    public final /* synthetic */ Object call(Object obj) {
        wud wud = (wud) obj;
        AtomicInteger atomicInteger = new AtomicInteger();
        wud a2 = wud.c((wut<? super T, Boolean>) $$Lambda$tdy$yp3HHVobEAxeBZ6pxDltZx586HU.INSTANCE).a((wut<? super T, ? extends wud<? extends R>>) $$Lambda$tdy$_CVCmXvOYfeCc4EEYJz0DjvgeE.INSTANCE);
        teb teb = this.a;
        teb.getClass();
        return a2.d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$glH5hyXMUl_AX6jRGAGcTkr180<Object,Object>(teb)).b(wud, (wuu<? super T, ? super T2, ? extends R>) new $$Lambda$tdy$egP0IFPaw8CRWPImOfvjc7V9TgQ<Object,Object,Object>(atomicInteger));
    }

    public tdy(teb teb) {
        this.a = teb;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(gzt gzt) {
        return Boolean.valueOf(gzt.target() != null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tfg a(AtomicInteger atomicInteger, tee tee, gzt gzt) {
        String a2 = a(gzt.target());
        gzw main = gzt.images().main();
        return new a().e(main != null ? main.uri() : "").a(new hcz(a2)).b(gzt.id()).a(Integer.toString(atomicInteger.getAndIncrement())).a(new PlayerContextIndex(0, 0)).a(0).c(gzt.text().title()).d(tee.a()).a(tee.b()).a(tee.c()).a();
    }

    private static String a(gzy gzy) {
        if (gzy != null) {
            return gzy.uri();
        }
        return null;
    }
}
