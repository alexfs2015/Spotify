package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: frr reason: default package */
public final class frr implements fsd {
    public final frs a(Context context, ViewGroup viewGroup) {
        return new frt(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_large, viewGroup, false));
    }

    public final fsa b(Context context, ViewGroup viewGroup) {
        return new fsb(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_large_description, viewGroup, false));
    }

    public final fru c(Context context, ViewGroup viewGroup) {
        return new frv(LayoutInflater.from(context).inflate(R.layout.glue_setionheader_large_description_icon, viewGroup, false));
    }

    public final frs d(Context context, ViewGroup viewGroup) {
        return new frt(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small, viewGroup, false));
    }

    public final fsa e(Context context, ViewGroup viewGroup) {
        return new fsb(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small_description, viewGroup, false));
    }

    public final frw f(Context context, ViewGroup viewGroup) {
        return new frx(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small_icon, viewGroup, false));
    }
}
