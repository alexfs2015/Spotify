package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qbc reason: default package */
public final class qbc implements sgx {
    private final fpt a;
    private final boolean b;

    /* renamed from: qbc$a */
    static final class a implements Function<gzt, gzt> {
        private final String[] a;
        private final boolean b;
        private final fpt c;

        public a(fpt fpt, String[] strArr, boolean z) {
            this.c = (fpt) fay.a(fpt);
            this.a = (String[]) fay.a(strArr);
            this.b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public gzt apply(gzt gzt) {
            if (gzt.children().isEmpty()) {
                return b(gzt);
            }
            ArrayList arrayList = new ArrayList(gzt.children().size());
            for (gzt a2 : gzt.children()) {
                arrayList.add(apply(a2));
            }
            return b(gzt).toBuilder().a((List<? extends gzt>) arrayList).a();
        }

        private gzt b(gzt gzt) {
            gzy target = gzt.target();
            if (target == null) {
                return gzt;
            }
            String uri = target.uri();
            if (uri == null) {
                return gzt;
            }
            String str = (String) fay.a(uri);
            defpackage.gzt.a a2 = gzt.toBuilder().a((gzy) null).a("click", a(str, gzt));
            if (!c(str)) {
                String str2 = "rightAccessoryClick";
                a2 = a2.a("longClick", gvx.a(str, gzt.text().title())).a(str2, gvx.a(str, gzt.text().title()));
            }
            if (a(str)) {
                a2 = a2.c("secondary_icon", SpotifyIconV2.MORE_ANDROID).f(rzj.b(str));
            }
            return a2.a();
        }

        private gzp a(String str, gzt gzt) {
            Optional a2 = uiq.a(gzt.custom());
            if (a(gzt, str)) {
                return pvv.a(str);
            }
            if (a(str)) {
                return pvx.a(this.a, str);
            }
            if (ViewUris.aj.b(str)) {
                return pvr.a(str);
            }
            if (sgq.a(str)) {
                return gvz.a(str);
            }
            if (!a2.b() || !this.b) {
                return pvt.a(str);
            }
            return pvp.a(str, (uim) a2.c());
        }

        private static boolean a(gzt gzt, String str) {
            String string = gzt.metadata().string("album_uri");
            if (!jst.a(str, LinkType.TRACK) || !gzt.custom().boolValue("onDemand", false) || fax.a(str) || fax.a(string)) {
                return false;
            }
            return true;
        }

        private boolean a(String str) {
            return jst.a(str, LinkType.TRACK) && !sgt.a(this.c);
        }

        private static boolean b(String str) {
            return ViewUris.o.b(str) || ViewUris.h.b(str);
        }

        private boolean c(String str) {
            return ViewUris.aA.b(str) || b(str) || ViewUris.aj.b(str) || sgq.a(str) || sgt.a(this.c);
        }
    }

    public final /* synthetic */ Object apply(Object obj) {
        gzz gzz = (gzz) obj;
        defpackage.gzz.a builder = gzz.toBuilder();
        List body = gzz.body();
        return builder.a((List<? extends gzt>) ImmutableList.a(fbx.a((Iterable<E>) body).a((Function<? super E, T>) new a<Object,T>(this.a, wpi.a, this.b)).a())).a();
    }

    qbc(fpt fpt, boolean z) {
        this.a = (fpt) fay.a(fpt);
        this.b = z;
    }
}
