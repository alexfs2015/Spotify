package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: txi reason: default package */
public final class txi implements ugp {
    private final uep a;

    /* renamed from: txi$a */
    public static class a extends ugt {
        public OnClickListener a;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public Runnable f;
    }

    /* renamed from: txi$b */
    public static class b extends defpackage.ugp.a {
        public b(View view) {
            super(view);
        }
    }

    public txi(uep uep) {
        this.a = uep;
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        uep uep = this.a;
        uep.f = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.podcast_trailer_section, viewGroup, false);
        uep.g = (ImageView) uep.f.findViewById(16908294);
        uep.h = (TextView) uep.f.findViewById(16908308);
        uep.i = (TextView) uep.f.findViewById(16908309);
        uep.i.setAllCaps(false);
        vfz.b(uep.f).b(uep.f).a();
        return new b(uep.f);
    }

    public final void a(ugt ugt) {
        Runnable a2 = ((a) ugt).f;
        if (a2 != null) {
            a2.run();
        }
    }

    public final void a(ugt ugt, u uVar) {
        a aVar = (a) ugt;
        uep uep = this.a;
        uep.h.setText(aVar.b);
        uep uep2 = this.a;
        uep2.i.setText(aVar.c.toUpperCase(Locale.getDefault()));
        uep uep3 = this.a;
        jzb.a(uep3.f.getContext(), uep3.i, aVar.d);
        uep uep4 = this.a;
        String str = aVar.e;
        uep4.b.d(uep4.g);
        wgr a2 = uep4.b.a(str).a(uep4.d).b(uep4.d).b(uep4.c, uep4.c).d().a((Object) uep.a);
        ImageView imageView = uep4.g;
        uel uel = uep4.e;
        uen uen = (uen) imageView.getTag(R.id.picasso_target);
        if (uen == null) {
            uen = new uen(imageView, uel);
            imageView.setTag(R.id.picasso_target, uen);
        } else {
            uen.a = uel;
        }
        a2.a((wgx) uen);
        uep uep5 = this.a;
        uep5.f.setOnClickListener(aVar.a);
    }
}
