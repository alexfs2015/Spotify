package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qak reason: default package */
public final class qak implements sgx {
    private final fpt a;

    /* renamed from: qak$a */
    static final class a implements Function<gzt, gzt> {
        private final fpt a;

        public a(fpt fpt) {
            this.a = (fpt) fay.a(fpt);
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
            int b = rzj.b(gzt);
            String c = rzj.c(gzt);
            defpackage.gzt.a a2 = gzt.toBuilder().a((gzy) null).a("click", pzn.a(str, b, c));
            if (!c(str)) {
                String str2 = "rightAccessoryClick";
                a2 = a2.a("longClick", gvx.a(str, gzt.text().title())).a(str2, gvx.a(str, gzt.text().title()));
            }
            if (a(str)) {
                a2 = a2.c("secondary_icon", SpotifyIconV2.MORE_ANDROID).f(rzj.b(str));
            }
            return a2.a();
        }

        private boolean a(String str) {
            return jst.a(str, LinkType.TRACK) && !sgt.a(this.a);
        }

        private static boolean b(String str) {
            return ViewUris.o.b(str) || ViewUris.h.b(str);
        }

        private boolean c(String str) {
            return ViewUris.aA.b(str) || b(str) || ViewUris.aj.b(str) || sgq.a(str) || (sgt.a(this.a) && !a(str));
        }
    }

    public final /* synthetic */ Object apply(Object obj) {
        gzz gzz = (gzz) obj;
        defpackage.gzz.a builder = gzz.toBuilder();
        List body = gzz.body();
        return builder.a((List<? extends gzt>) ImmutableList.a(fbx.a((Iterable<E>) body).a((Function<? super E, T>) new a<Object,T>(this.a)).a())).a();
    }

    qak(fpt fpt) {
        this.a = (fpt) fay.a(fpt);
    }
}
