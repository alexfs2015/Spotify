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

/* renamed from: ksi reason: default package */
public final class ksi implements ugp {
    final ksb a;
    final kry b;
    private final ugl c;
    private final String d;
    private final String e;
    private final Drawable f;
    private final int g;
    private final int h;
    private final OnClickListener i = new OnClickListener() {
        public final void onClick(View view) {
            ksi.this.b.a();
            ksi.this.a.a();
        }
    };
    private ucs j;

    /* renamed from: ksi$a */
    public static class a extends ugt {
    }

    /* renamed from: ksi$b */
    static class b extends defpackage.ugp.a {
        public b(fqy fqy) {
            super(fqy.getView());
        }
    }

    public ksi(Context context, ugl ugl, ksb ksb, kry kry) {
        this.c = ugl;
        this.d = context.getString(R.string.create_podcast_title);
        this.e = context.getString(R.string.create_podcast_subtitle);
        this.f = krs.a(context);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_margin);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_spacing);
        this.a = ksb;
        this.b = kry;
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.j = (ucs) this.c.c(viewGroup);
        return new b(this.j);
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
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
