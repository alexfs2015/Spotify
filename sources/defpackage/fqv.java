package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fqv reason: default package */
public final class fqv {
    public static fqt a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.glue_category_card, viewGroup, false);
        fqu fqu = new fqu(inflate);
        fqf.a(fqu);
        fqc.a(inflate);
        return fqu;
    }
}
