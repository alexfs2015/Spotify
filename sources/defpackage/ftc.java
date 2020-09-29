package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.music.R;

/* renamed from: ftc reason: default package */
public final class ftc {
    public static fsy a(Context context, ViewGroup viewGroup) {
        return a((GlueToolbarLayout) LayoutInflater.from(context).inflate(R.layout.glue_toolbar, viewGroup, false));
    }

    public static fsy a(GlueToolbarLayout glueToolbarLayout) {
        return new fta(glueToolbarLayout);
    }

    public static fyh a(Context context) {
        if (context instanceof fsz) {
            return ((fsz) context).b();
        }
        throw new IllegalArgumentException("Context should implement GlueToolbarContainer");
    }
}
