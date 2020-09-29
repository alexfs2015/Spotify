package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qka reason: default package */
public final class qka implements sre {
    private final fqn a;
    private final boolean b;

    /* renamed from: qka$a */
    static final class a implements Function<hcm, hcm> {
        private final String[] a;
        private final boolean b;
        private final fqn c;

        public a(fqn fqn, String[] strArr, boolean z) {
            this.c = (fqn) fbp.a(fqn);
            this.a = (String[]) fbp.a(strArr);
            this.b = z;
        }

        private hci a(String str, hcm hcm) {
            Optional a2 = uue.a(hcm.custom());
            return a(hcm, str) ? qer.a(str) : a(str) ? qet.a(this.a, str) : ViewUris.ai.b(str) ? qen.a(str) : sqx.a(str) ? gya.a(str) : (!a2.b() || !this.b) ? qep.a(str) : qel.a(str, (uua) a2.c());
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

        private static boolean a(hcm hcm, String str) {
            return jva.a(str, LinkType.TRACK) && hcm.custom().boolValue("onDemand", false) && !fbo.a(str) && !fbo.a(hcm.metadata().string("album_uri"));
        }

        private boolean a(String str) {
            return jva.a(str, LinkType.TRACK) && !sra.a(this.c);
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
            defpackage.hcm.a a2 = hcm.toBuilder().a((hcr) null).a("click", a(str, hcm));
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
            return ViewUris.az.b(str) || b(str) || ViewUris.ai.b(str) || sqx.a(str) || sra.a(this.c);
        }
    }

    qka(fqn fqn, boolean z) {
        this.a = (fqn) fbp.a(fqn);
        this.b = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        hcs hcs = (hcs) obj;
        defpackage.hcs.a builder = hcs.toBuilder();
        List body = hcs.body();
        return builder.a((List<? extends hcm>) ImmutableList.a(fcp.a((Iterable<E>) body).a((Function<? super E, T>) new a<Object,T>(this.a, xdo.a, this.b)).a())).a();
    }
}
