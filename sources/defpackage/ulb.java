package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

/* renamed from: ulb reason: default package */
public interface ulb {

    /* renamed from: ulb$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ulf a(uly uly, wzi<umq> wzi, wzi<umn> wzi2) {
            umh a = uly.a();
            if (a instanceof umj) {
                umq umq = (umq) wzi.get();
                return new ump((Picasso) umq.a(umq.a.get(), 1), (xir) umq.a(umq.b.get(), 2), (umk) umq.a(umq.c.get(), 3), (umj) umq.a((umj) a, 4));
            } else if (a instanceof umi) {
                umn umn = (umn) wzi2.get();
                return new umm((Picasso) umn.a(umn.a.get(), 1), (xir) umn.a(umn.b.get(), 2), (umi) umn.a((umi) a, 3));
            } else {
                throw new IllegalArgumentException("Could not find content view model mapping to slate content implementation");
            }
        }

        public static uly a(Bundle bundle) {
            return (uly) bundle.getParcelable("VIEW_MODEL");
        }

        public static xir a(Activity activity) {
            return new $$Lambda$ulb$Oz14wWZ_QkQVxjibF2ESo059T4(activity);
        }

        public static /* synthetic */ void b(Activity activity) {
            activity.setResult(101);
            activity.finish();
        }
    }
}
