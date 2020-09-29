package defpackage;

import android.view.View;
import com.spotify.music.R;

/* renamed from: fqf reason: default package */
public final class fqf {
    public static void a(fqe fqe) {
        fqe.getView().setTag(R.id.glue_viewholder_tag, fqe);
    }

    public static <V extends fqe> V a(View view, Class<V> cls) {
        V v = (fqe) cls.cast(((View) fay.a(view)).getTag(R.id.glue_viewholder_tag));
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }

    public static <V extends fqe> V b(View view, Class<V> cls) {
        if (view == null) {
            return null;
        }
        V v = (fqe) cls.cast(view.getTag(R.id.glue_viewholder_tag));
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }

    public static <V extends fqe> boolean c(View view, Class<V> cls) {
        return cls.isInstance(((View) fay.a(view)).getTag(R.id.glue_viewholder_tag));
    }
}
