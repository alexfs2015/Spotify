package defpackage;

import android.view.ViewGroup;
import com.spotify.instrumentation.ItemType;
import java.util.Locale;

/* renamed from: rol reason: default package */
public final class rol extends gkm {
    public rol(ViewGroup viewGroup, a aVar) {
        super(viewGroup, aVar);
    }

    public final void a(gkq gkq, int i) {
        super.a(gkq, i);
        String lowerCase = gkq.a().toLowerCase(Locale.US);
        if (lowerCase.charAt(0) == '0') {
            lowerCase = "world";
        }
        gjd.a(this.o, gje.b().a().a(ItemType.ROW).a(lowerCase).a(), "select");
    }
}
