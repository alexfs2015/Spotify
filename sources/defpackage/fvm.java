package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fvm reason: default package */
public final class fvm {
    private static <T extends fqy> T a(T t) {
        fqz.a(t);
        fqw.a(t.getView());
        return t;
    }

    public static fvk a(Context context, ViewGroup viewGroup) {
        return (fvk) a(new fvl(LayoutInflater.from(context).inflate(R.layout.glue_empty_state, viewGroup, false)));
    }

    public static fvi b(Context context, ViewGroup viewGroup) {
        return (fvi) a(new fvj(LayoutInflater.from(context).inflate(R.layout.glue_empty_state_button, viewGroup, false)));
    }
}
