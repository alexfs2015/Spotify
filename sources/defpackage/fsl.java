package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fsl reason: default package */
public final class fsl implements fsx {
    public final fsm a(Context context, ViewGroup viewGroup) {
        return new fsn(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_large, viewGroup, false));
    }

    public final fsu b(Context context, ViewGroup viewGroup) {
        return new fsv(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_large_description, viewGroup, false));
    }

    public final fso c(Context context, ViewGroup viewGroup) {
        return new fsp(LayoutInflater.from(context).inflate(R.layout.glue_setionheader_large_description_icon, viewGroup, false));
    }

    public final fsm d(Context context, ViewGroup viewGroup) {
        return new fsn(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small, viewGroup, false));
    }

    public final fsu e(Context context, ViewGroup viewGroup) {
        return new fsv(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small_description, viewGroup, false));
    }

    public final fsq f(Context context, ViewGroup viewGroup) {
        return new fsr(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small_icon, viewGroup, false));
    }
}
