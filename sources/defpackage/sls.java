package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.music.MainActivity;
import com.spotify.music.navigation.NavigationManager;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: sls reason: default package */
public interface sls {

    /* renamed from: sls$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gbr<Intent> a(Activity activity) {
            activity.getClass();
            return new $$Lambda$hoBzSR0w2wYcIzRsWTjnmCY9ZY(activity);
        }

        public static soz a(MainActivity mainActivity, NavigationManager navigationManager) {
            return new spc(new slq(navigationManager), new $$Lambda$sls$YxCfSLzFyxmjcKmYvSTfUqErdg(mainActivity));
        }

        public static gjw<Intent> a(klp klp, soz soz, CompletableSubject completableSubject, NavigationManager navigationManager) {
            a aVar = new a(completableSubject, klp.d.a().j(), klp.c.a.j(), AndroidSchedulers.a());
            spr spr = new spr(aVar, new spb(klp.e, soz, defpackage.snc.CC.a(navigationManager)), klp.f);
            gbr<Intent> gbr = klp.f;
            snd snd = klp.a;
            smx smx = klp.b;
            sps sps = new sps(aVar, spr, gbr);
            snd.a(sps);
            smx.a(sps);
            gju gju = new gju(Collections.unmodifiableList(new ArrayList(sps.a.a)), 0);
            spv spv = new spv();
            spu spu = new spu();
            gjw<Intent> gjw = new gjw<>(gju, new gjt());
            gjw.b = spu;
            gjw.a.b.b = spv;
            return gjw;
        }
    }
}
