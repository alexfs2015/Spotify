package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: frp reason: default package */
public final class frp {
    public static frn a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.glue_category_card, viewGroup, false);
        fro fro = new fro(inflate);
        fqz.a(fro);
        fqw.a(inflate);
        return fro;
    }
}
