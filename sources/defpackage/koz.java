package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: koz reason: default package */
public final class koz implements tum {
    final kos a;
    final kop b;
    private final tui c;
    private final String d;
    private final String e;
    private final Drawable f;
    private final int g;
    private final int h;
    private final OnClickListener i = new OnClickListener() {
        public final void onClick(View view) {
            koz.this.b.a();
            koz.this.a.a();
        }
    };
    private tqp j;

    /* renamed from: koz$a */
    public static class a extends tuq {
    }

    /* renamed from: koz$b */
    static class b extends defpackage.tum.a {
        public b(fqe fqe) {
            super(fqe.getView());
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public koz(Context context, tui tui, kos kos, kop kop) {
        this.c = tui;
        this.d = context.getString(R.string.create_podcast_title);
        this.e = context.getString(R.string.create_podcast_subtitle);
        this.f = koj.a(context);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_margin);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_spacing);
        this.a = kos;
        this.b = kop;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.j = (tqp) this.c.c(viewGroup);
        return new b(this.j);
    }

    public final void a(tuq tuq, u uVar) {
        this.j.a(this.d);
        this.j.b(this.e);
        this.j.c().setImageDrawable(this.f);
        this.j.h();
        this.j.d(false);
        this.j.a(this.i);
        View view = this.j.getView();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i2 = this.g;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.bottomMargin = this.h;
        view.setLayoutParams(marginLayoutParams);
    }
}
