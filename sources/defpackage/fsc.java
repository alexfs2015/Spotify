package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fsc reason: default package */
public final class fsc {
    public final fsd a = new frr();
    private final a b = new a(0);

    /* renamed from: fsc$a */
    public static class a {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }

        public static frs a(Context context, ViewGroup viewGroup) {
            frt frt = new frt(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader, viewGroup, false));
            fqf.a(frt);
            fqc.a(frt.getView());
            return frt;
        }

        public static fsa b(Context context, ViewGroup viewGroup) {
            fsb fsb = new fsb(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_subtitle, viewGroup, false));
            fqf.a(fsb);
            fqc.a(fsb.getView());
            return fsb;
        }

        public static fry c(Context context, ViewGroup viewGroup) {
            frz frz = new frz(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_with_metadata, viewGroup, false));
            fqf.a(frz);
            fqc.a(frz.getView());
            return frz;
        }

        public static frs d(Context context, ViewGroup viewGroup) {
            frt frt = new frt(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_large, viewGroup, false));
            fqf.a(frt);
            fqc.a(frt.getView());
            return frt;
        }

        public static frs e(Context context, ViewGroup viewGroup) {
            frt frt = new frt(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_small, viewGroup, false));
            fqf.a(frt);
            fqc.a(frt.getView());
            return frt;
        }

        public static frs f(Context context, ViewGroup viewGroup) {
            frt frt = new frt(LayoutInflater.from(context).inflate(R.layout.solar_sectionheader_extra_small, viewGroup, false));
            fqf.a(frt);
            fqc.a(frt.getView());
            return frt;
        }
    }

    public final frs a(Context context, ViewGroup viewGroup) {
        frs a2 = this.a.a(context, viewGroup);
        fqf.a(a2);
        fqc.a(a2.getView());
        return a2;
    }

    public final fsa b(Context context, ViewGroup viewGroup) {
        fsa b2 = this.a.b(context, viewGroup);
        fqf.a(b2);
        fqc.a(b2.getView());
        return b2;
    }

    public final frs c(Context context, ViewGroup viewGroup) {
        frs d = this.a.d(context, viewGroup);
        fqf.a(d);
        fqc.a(d.getView());
        return d;
    }

    public final fsa d(Context context, ViewGroup viewGroup) {
        fsa e = this.a.e(context, viewGroup);
        fqf.a(e);
        fqc.a(e.getView());
        return e;
    }

    public final frw e(Context context, ViewGroup viewGroup) {
        frw f = this.a.f(context, viewGroup);
        fqf.a(f);
        fqc.a(f.getView());
        return f;
    }
}
