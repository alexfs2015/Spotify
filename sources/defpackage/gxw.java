package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.music.follow.FollowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gxw reason: default package */
public final class gxw {
    private final wbt a;
    private final gyc b;
    private final FollowManager c;
    private final gxr d;
    private final gxp e;

    /* renamed from: gxw$a */
    public static class a {
        private final Context a;
        private final defpackage.gwm.a b;
        private final defpackage.sso.a c;
        private final wbt d;
        private final gyc e;
        private final FollowManager f;

        private a(Context context, defpackage.gwm.a aVar, defpackage.sso.a aVar2, wbt wbt, gyc gyc, FollowManager followManager) {
            this.a = context;
            this.b = aVar;
            this.c = aVar2;
            this.d = wbt;
            this.e = gyc;
            this.f = followManager;
        }

        /* synthetic */ a(Context context, defpackage.gwm.a aVar, defpackage.sso.a aVar2, wbt wbt, gyc gyc, FollowManager followManager, byte b2) {
            this(context, aVar, aVar2, wbt, gyc, followManager);
        }

        @Deprecated
        public final a a(has has) {
            Context context = this.a;
            a aVar = new a(context, this.b.a((hce) new hao(context, this.c, has, this.f)), this.c, this.d, this.e, this.f);
            return aVar;
        }

        public final b a(Map<String, gxk> map) {
            return new b(this.b.a(gxj.a(map, gxk.a, gxa.a)), 0);
        }

        public final b a(jqh jqh, szp szp, has has) {
            Context context = this.a;
            defpackage.sso.a aVar = this.c;
            wbt wbt = this.d;
            HashMap hashMap = new HashMap(2);
            hashMap.put("navigate", new gya(szp, has, new hcf(aVar), wbt));
            gxy gxy = new gxy(context, jqh, aVar, has, new hcf(aVar), wbt);
            hashMap.put("contextMenu", gxy);
            return a((Map<String, gxk>) hashMap);
        }
    }

    /* renamed from: gxw$b */
    public static class b {
        public final defpackage.gwm.a a;

        private b(defpackage.gwm.a aVar) {
            this.a = aVar;
        }

        /* synthetic */ b(defpackage.gwm.a aVar, byte b) {
            this(aVar);
        }

        @Deprecated
        public final defpackage.gwm.a a(defpackage.gxt.a aVar) {
            return this.a.b((gwo) new gxt(aVar));
        }
    }

    public gxw(wbt wbt, gyc gyc, FollowManager followManager, gxr gxr, gxp gxp) {
        this.a = wbt;
        this.b = gyc;
        this.c = followManager;
        this.d = gxr;
        this.e = gxp;
    }

    public final a a(Context context, defpackage.sso.a aVar) {
        Context context2 = context;
        defpackage.sso.a aVar2 = aVar;
        a aVar3 = new a(context2, new defpackage.gwm.a().b(gxp.b()).c(HubsCommonComponent.d()).b(gxp.c()).b((gwo) new gxm()).b((gwo) this.d).a((gww) new gxv()).a(hay.a(aVar)).a(hay.b(aVar)).a(this.e.a(), gwq.a(HubsCommonComponent.c()).a()), aVar2, this.a, this.b, this.c, 0);
        return aVar3;
    }

    public final <T extends Fragment & defpackage.sso.a> a a(T t) {
        Context n = t.n();
        if (n != null) {
            return a(n, (defpackage.sso.a) t);
        }
        throw new IllegalStateException("Fragment is not attached!");
    }
}
