package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: frq reason: default package */
public final class frq {
    public static frb a(Context context, ViewGroup viewGroup, int i) {
        frc frc = new frc(fzh.a(context, viewGroup, R.layout.glue_listtile_1));
        frc.a(i);
        fqf.a(frc);
        return frc;
    }

    public static frd a(Context context, ViewGroup viewGroup) {
        frg frg = new frg(fzh.a(context, viewGroup, R.layout.glue_listtile_1));
        fqf.a(frg);
        return frg;
    }

    public static fre b(Context context, ViewGroup viewGroup) {
        frf frf = new frf(fzh.a(context, viewGroup, R.layout.glue_listtile_1_image));
        fqf.a(frf);
        return frf;
    }

    public static frd c(Context context, ViewGroup viewGroup) {
        frg frg = new frg(fzh.a(context, viewGroup, R.layout.glue_listtile_1_small));
        fqf.a(frg);
        return frg;
    }

    public static fre d(Context context, ViewGroup viewGroup) {
        frf frf = new frf(fzh.a(context, viewGroup, R.layout.glue_listtile_1_image_small));
        fqf.a(frf);
        return frf;
    }

    public static frh a(Context context, ViewGroup viewGroup, boolean z) {
        frk frk = new frk(fzh.a(context, viewGroup, z ? R.layout.glue_listtile_2_muted : R.layout.glue_listtile_2));
        fqf.a(frk);
        return frk;
    }

    public static fri b(Context context, ViewGroup viewGroup, boolean z) {
        frj frj = new frj(fzh.a(context, viewGroup, z ? R.layout.glue_listtile_2_image_muted : R.layout.glue_listtile_2_image));
        fqf.a(frj);
        return frj;
    }

    public static frl e(Context context, ViewGroup viewGroup) {
        frm frm = new frm(fzh.a(context, viewGroup, R.layout.glue_listtile_2_landscape_image));
        fqf.a(frm);
        return frm;
    }

    public static frn c(Context context, ViewGroup viewGroup, boolean z) {
        fro fro = new fro(fzh.a(context, viewGroup, z ? R.layout.glue_listtile_2_number_muted : R.layout.glue_listtile_2_number));
        fqf.a(fro);
        return fro;
    }
}
