package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.music.MainActivity;
import com.spotify.music.navigation.NavigationManager;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: svz reason: default package */
public interface svz {

    /* renamed from: svz$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gcp<Intent> a(Activity activity) {
            activity.getClass();
            return new $$Lambda$H0nI3XFK4z8f2N_sgNjttXCl0KI(activity);
        }

        public static glh<Intent> a(koy koy, szg szg, CompletableSubject completableSubject, NavigationManager navigationManager) {
            a aVar = new a(completableSubject, koy.d.a().j(), koy.c.a.j(), AndroidSchedulers.a());
            szy szy = new szy(aVar, new szi(koy.e, szg, defpackage.sxj.CC.a(navigationManager)), koy.f);
            gcp<Intent> gcp = koy.f;
            sxk sxk = koy.a;
            sxe sxe = koy.b;
            szz szz = new szz(aVar, szy, gcp);
            sxk.a(szz);
            sxe.a(szz);
            glf glf = new glf(Collections.unmodifiableList(new ArrayList(szz.a.a)), 0);
            tac tac = new tac();
            tab tab = new tab();
            glh<Intent> glh = new glh<>(glf, new gle());
            glh.b = tab;
            glh.a.b.b = tac;
            return glh;
        }

        public static szg a(MainActivity mainActivity, NavigationManager navigationManager) {
            return new szj(new svx(navigationManager), new $$Lambda$svz$fqmF6v_R2iFuIxcNaXHiqa2_Vg(mainActivity));
        }
    }
}
