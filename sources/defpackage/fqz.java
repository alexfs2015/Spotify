package defpackage;

import android.view.View;
import com.spotify.music.R;

/* renamed from: fqz reason: default package */
public final class fqz {
    public static <V extends fqy> V a(View view, Class<V> cls) {
        V v = (fqy) cls.cast(((View) fbp.a(view)).getTag(R.id.glue_viewholder_tag));
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }

    public static void a(fqy fqy) {
        fqy.getView().setTag(R.id.glue_viewholder_tag, fqy);
    }

    public static <V extends fqy> V b(View view, Class<V> cls) {
        if (view == null) {
            return null;
        }
        V v = (fqy) cls.cast(view.getTag(R.id.glue_viewholder_tag));
        if (v != null) {
            return v;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }

    public static <V extends fqy> boolean c(View view, Class<V> cls) {
        return cls.isInstance(((View) fbp.a(view)).getTag(R.id.glue_viewholder_tag));
    }
}
