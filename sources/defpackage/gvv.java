package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.music.follow.FollowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gvv reason: default package */
public final class gvv {
    private final vol a;
    private final gwb b;
    private final FollowManager c;
    private final gvq d;
    private final HubsGlueImageDelegate e;

    /* renamed from: gvv$a */
    public static class a {
        private final Context a;
        private final defpackage.gum.a b;
        private final defpackage.sih.a c;
        private final vol d;
        private final gwb e;
        private final FollowManager f;

        /* synthetic */ a(Context context, defpackage.gum.a aVar, defpackage.sih.a aVar2, vol vol, gwb gwb, FollowManager followManager, byte b2) {
            this(context, aVar, aVar2, vol, gwb, followManager);
        }

        private a(Context context, defpackage.gum.a aVar, defpackage.sih.a aVar2, vol vol, gwb gwb, FollowManager followManager) {
            this.a = context;
            this.b = aVar;
            this.c = aVar2;
            this.d = vol;
            this.e = gwb;
            this.f = followManager;
        }

        @Deprecated
        public final a a(gxz gxz) {
            Context context = this.a;
            a aVar = new a(context, this.b.a((gzl) new gxv(context, this.c, gxz, this.f)), this.c, this.d, this.e, this.f);
            return aVar;
        }

        public final b a(jnv jnv, spi spi, gxz gxz) {
            Context context = this.a;
            defpackage.sih.a aVar = this.c;
            vol vol = this.d;
            HashMap hashMap = new HashMap(2);
            hashMap.put("navigate", new gvz(spi, gxz, new gzm(aVar), vol));
            gvx gvx = new gvx(context, jnv, aVar, gxz, new gzm(aVar), vol);
            hashMap.put("contextMenu", gvx);
            return a((Map<String, gvk>) hashMap);
        }

        public final b a(Map<String, gvk> map) {
            return new b(this.b.a(gvj.a(map, gvk.a, gva.a)), 0);
        }
    }

    /* renamed from: gvv$b */
    public static class b {
        public final defpackage.gum.a a;

        /* synthetic */ b(defpackage.gum.a aVar, byte b) {
            this(aVar);
        }

        private b(defpackage.gum.a aVar) {
            this.a = aVar;
        }

        @Deprecated
        public final defpackage.gum.a a(defpackage.gvs.a aVar) {
            return this.a.b((guo) new gvs(aVar));
        }
    }

    public gvv(vol vol, gwb gwb, FollowManager followManager, gvq gvq, HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = vol;
        this.b = gwb;
        this.c = followManager;
        this.d = gvq;
        this.e = hubsGlueImageDelegate;
    }

    public final <T extends Fragment & defpackage.sih.a> a a(T t) {
        Context n = t.n();
        if (n != null) {
            return a(n, (defpackage.sih.a) t);
        }
        throw new IllegalStateException("Fragment is not attached!");
    }

    public final a a(Context context, defpackage.sih.a aVar) {
        Context context2 = context;
        defpackage.sih.a aVar2 = aVar;
        a aVar3 = new a(context2, new defpackage.gum.a().b(gvp.a()).c(HubsCommonComponent.d()).b(gvp.b()).b((guo) new gvm()).b((guo) this.d).a((guw) new gvu()).a(gyf.a(aVar)).a(gyf.b(aVar)).a(gvp.a(this.e), guq.a(HubsCommonComponent.c()).a()), aVar2, this.a, this.b, this.c, 0);
        return aVar3;
    }
}
