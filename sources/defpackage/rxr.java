package defpackage;

import android.view.ViewGroup;
import com.spotify.instrumentation.ItemType;
import java.util.Locale;

/* renamed from: rxr reason: default package */
public final class rxr extends gly {
    public rxr(ViewGroup viewGroup, a aVar) {
        super(viewGroup, aVar);
    }

    public final void a(gmc gmc, int i) {
        super.a(gmc, i);
        String lowerCase = gmc.a().toLowerCase(Locale.US);
        if (lowerCase.charAt(0) == '0') {
            lowerCase = "world";
        }
        gko.a(this.o, gkp.b().a().a(ItemType.ROW).a(lowerCase).a(), "select");
    }
}
