package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fsw reason: default package */
public final class fsw {
    public final fsx a = new fsl();
    private final a b = new a(0);

    /* renamed from: fsw$a */
    public static class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public static fsm a(Context context, ViewGroup viewGroup) {
            fsn fsn = new fsn(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader, viewGroup, false));
            fqz.a(fsn);
            fqw.a(fsn.getView());
            return fsn;
        }

        public static fsu b(Context context, ViewGroup viewGroup) {
            fsv fsv = new fsv(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_subtitle, viewGroup, false));
            fqz.a(fsv);
            fqw.a(fsv.getView());
            return fsv;
        }

        public static fss c(Context context, ViewGroup viewGroup) {
            fst fst = new fst(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_metadata, viewGroup, false));
            fqz.a(fst);
            fqw.a(fst.getView());
            return fst;
        }

        public static fsm d(Context context, ViewGroup viewGroup) {
            fsn fsn = new fsn(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_large, viewGroup, false));
            fqz.a(fsn);
            fqw.a(fsn.getView());
            return fsn;
        }

        public static fsm e(Context context, ViewGroup viewGroup) {
            fsn fsn = new fsn(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_small, viewGroup, false));
            fqz.a(fsn);
            fqw.a(fsn.getView());
            return fsn;
        }

        public static fsm f(Context context, ViewGroup viewGroup) {
            fsn fsn = new fsn(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_extra_small, viewGroup, false));
            fqz.a(fsn);
            fqw.a(fsn.getView());
            return fsn;
        }
    }

    public final fsm a(Context context, ViewGroup viewGroup) {
        fsm a2 = this.a.a(context, viewGroup);
        fqz.a(a2);
        fqw.a(a2.getView());
        return a2;
    }

    public final fsu b(Context context, ViewGroup viewGroup) {
        fsu b2 = this.a.b(context, viewGroup);
        fqz.a(b2);
        fqw.a(b2.getView());
        return b2;
    }

    public final fsm c(Context context, ViewGroup viewGroup) {
        fsm d = this.a.d(context, viewGroup);
        fqz.a(d);
        fqw.a(d.getView());
        return d;
    }

    public final fsu d(Context context, ViewGroup viewGroup) {
        fsu e = this.a.e(context, viewGroup);
        fqz.a(e);
        fqw.a(e.getView());
        return e;
    }

    public final fsq e(Context context, ViewGroup viewGroup) {
        fsq f = this.a.f(context, viewGroup);
        fqz.a(f);
        fqw.a(f.getView());
        return f;
    }
}
