package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fsk reason: default package */
public final class fsk {
    public static frv a(Context context, ViewGroup viewGroup, int i) {
        frw frw = new frw(gab.a(context, viewGroup, R.layout.glue_listtile_1));
        frw.a(i);
        fqz.a(frw);
        return frw;
    }

    public static frx a(Context context, ViewGroup viewGroup) {
        fsa fsa = new fsa(gab.a(context, viewGroup, R.layout.glue_listtile_1));
        fqz.a(fsa);
        return fsa;
    }

    public static fsb a(Context context, ViewGroup viewGroup, boolean z) {
        fse fse = new fse(gab.a(context, viewGroup, z ? R.layout.glue_listtile_2_muted : R.layout.glue_listtile_2));
        fqz.a(fse);
        return fse;
    }

    public static fry b(Context context, ViewGroup viewGroup) {
        frz frz = new frz(gab.a(context, viewGroup, R.layout.glue_listtile_1_image));
        fqz.a(frz);
        return frz;
    }

    public static fsc b(Context context, ViewGroup viewGroup, boolean z) {
        fsd fsd = new fsd(gab.a(context, viewGroup, z ? R.layout.glue_listtile_2_image_muted : R.layout.glue_listtile_2_image));
        fqz.a(fsd);
        return fsd;
    }

    public static frx c(Context context, ViewGroup viewGroup) {
        fsa fsa = new fsa(gab.a(context, viewGroup, R.layout.glue_listtile_1_small));
        fqz.a(fsa);
        return fsa;
    }

    public static fsh c(Context context, ViewGroup viewGroup, boolean z) {
        fsi fsi = new fsi(gab.a(context, viewGroup, z ? R.layout.glue_listtile_2_number_muted : R.layout.glue_listtile_2_number));
        fqz.a(fsi);
        return fsi;
    }

    public static fry d(Context context, ViewGroup viewGroup) {
        frz frz = new frz(gab.a(context, viewGroup, R.layout.glue_listtile_1_image_small));
        fqz.a(frz);
        return frz;
    }

    public static fsf e(Context context, ViewGroup viewGroup) {
        fsg fsg = new fsg(gab.a(context, viewGroup, R.layout.glue_listtile_2_landscape_image));
        fqz.a(fsg);
        return fsg;
    }
}
