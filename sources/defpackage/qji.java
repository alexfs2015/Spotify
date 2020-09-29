package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qji reason: default package */
public final class qji implements sre {
    private final fqn a;

    /* renamed from: qji$a */
    static final class a implements Function<hcm, hcm> {
        private final fqn a;

        public a(fqn fqn) {
            this.a = (fqn) fbp.a(fqn);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public hcm apply(hcm hcm) {
            if (hcm.children().isEmpty()) {
                return b(hcm);
            }
            ArrayList arrayList = new ArrayList(hcm.children().size());
            for (hcm a2 : hcm.children()) {
                arrayList.add(apply(a2));
            }
            return b(hcm).toBuilder().a((List<? extends hcm>) arrayList).a();
        }

        private boolean a(String str) {
            return jva.a(str, LinkType.TRACK) && !sra.a(this.a);
        }

        private hcm b(hcm hcm) {
            hcr target = hcm.target();
            if (target == null) {
                return hcm;
            }
            String uri = target.uri();
            if (uri == null) {
                return hcm;
            }
            String str = (String) fbp.a(uri);
            int b = six.b(hcm);
            String c = six.c(hcm);
            defpackage.hcm.a a2 = hcm.toBuilder().a((hcr) null).a("click", qil.a(str, b, c));
            if (!c(str)) {
                String str2 = "rightAccessoryClick";
                a2 = a2.a("longClick", gxy.a(str, hcm.text().title())).a(str2, gxy.a(str, hcm.text().title()));
            }
            if (a(str)) {
                a2 = a2.c("secondary_icon", SpotifyIconV2.MORE_ANDROID).f(six.b(str));
            }
            return a2.a();
        }

        private static boolean b(String str) {
            return ViewUris.n.b(str) || ViewUris.g.b(str);
        }

        private boolean c(String str) {
            return ViewUris.az.b(str) || b(str) || ViewUris.ai.b(str) || sqx.a(str) || (sra.a(this.a) && !a(str));
        }
    }

    qji(fqn fqn) {
        this.a = (fqn) fbp.a(fqn);
    }

    public final /* synthetic */ Object apply(Object obj) {
        hcs hcs = (hcs) obj;
        defpackage.hcs.a builder = hcs.toBuilder();
        List body = hcs.body();
        return builder.a((List<? extends hcm>) ImmutableList.a(fcp.a((Iterable<E>) body).a((Function<? super E, T>) new a<Object,T>(this.a)).a())).a();
    }
}
