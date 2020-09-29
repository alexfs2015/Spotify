package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fus reason: default package */
public final class fus {
    public static fuq a(Context context, ViewGroup viewGroup) {
        return (fuq) a(new fur(LayoutInflater.from(context).inflate(R.layout.glue_empty_state, viewGroup, false)));
    }

    public static fuo b(Context context, ViewGroup viewGroup) {
        return (fuo) a(new fup(LayoutInflater.from(context).inflate(R.layout.glue_empty_state_button, viewGroup, false)));
    }

    private static <T extends fqe> T a(T t) {
        fqf.a(t);
        fqc.a(t.getView());
        return t;
    }
}
