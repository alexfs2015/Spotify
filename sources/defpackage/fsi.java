package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.music.R;

/* renamed from: fsi reason: default package */
public final class fsi {
    public static fxn a(Context context) {
        if (context instanceof fsf) {
            return ((fsf) context).b();
        }
        throw new IllegalArgumentException("Context should implement GlueToolbarContainer");
    }

    public static fse a(Context context, ViewGroup viewGroup) {
        return a((GlueToolbarLayout) LayoutInflater.from(context).inflate(R.layout.glue_toolbar, viewGroup, false));
    }

    public static fse a(GlueToolbarLayout glueToolbarLayout) {
        return new fsg(glueToolbarLayout);
    }
}
