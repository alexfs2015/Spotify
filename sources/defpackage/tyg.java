package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

/* renamed from: tyg reason: default package */
public interface tyg {

    /* renamed from: tyg$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static tyk a(tzd tzd, wlc<tzv> wlc, wlc<tzs> wlc2) {
            tzm a = tzd.a();
            if (a instanceof tzo) {
                tzv tzv = (tzv) wlc.get();
                return new tzu((Picasso) tzv.a(tzv.a.get(), 1), (wum) tzv.a(tzv.b.get(), 2), (tzp) tzv.a(tzv.c.get(), 3), (tzo) tzv.a((tzo) a, 4));
            } else if (a instanceof tzn) {
                tzs tzs = (tzs) wlc2.get();
                return new tzr((Picasso) tzs.a(tzs.a.get(), 1), (wum) tzs.a(tzs.b.get(), 2), (tzn) tzs.a((tzn) a, 3));
            } else {
                throw new IllegalArgumentException("Could not find content view model mapping to slate content implementation");
            }
        }

        public static tzd a(Bundle bundle) {
            return (tzd) bundle.getParcelable("VIEW_MODEL");
        }

        public static wum a(Activity activity) {
            return new $$Lambda$tyg$xPCw5OrPN7hD5LU38WWc3I60Q78(activity);
        }

        public static /* synthetic */ void b(Activity activity) {
            activity.setResult(101);
            activity.finish();
        }
    }
}
