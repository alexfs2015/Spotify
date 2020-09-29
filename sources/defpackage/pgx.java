package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import androidx.viewpager.widget.ViewPager;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.paste.widgets.ViewPagerIndicator;
import java.util.List;

/* renamed from: pgx reason: default package */
public final class pgx extends u {
    private final ViewPager a;
    private final ViewPagerIndicator b;
    private final View c;
    private final TextView d;
    private final int e;
    private final int f;
    private final pgw g;
    private final pgz h;
    private final pgh i;

    public pgx(View view, pgw pgw, pgz pgz, pgh pgh) {
        super(view);
        this.a = (ViewPager) view.findViewById(R.id.view_pager);
        this.b = (ViewPagerIndicator) view.findViewById(R.id.page_indicator);
        this.c = view.findViewById(R.id.get_premium_cta);
        this.d = (TextView) view.findViewById(R.id.legal_text);
        this.e = (int) TypedValue.applyDimension(1, 32.0f, view.getResources().getDisplayMetrics());
        this.f = (int) TypedValue.applyDimension(1, 16.0f, view.getResources().getDisplayMetrics());
        this.g = pgw;
        this.h = pgz;
        this.i = pgh;
    }

    public final void a(List<pgy> list) {
        this.a.setClipToPadding(false);
        ViewPager viewPager = this.a;
        int i2 = this.e;
        viewPager.setPadding(i2, 0, i2, 0);
        this.a.c(this.f);
        this.a.a((sa) new pgv(list));
        this.b.a(this.a);
        this.c.setOnClickListener(new $$Lambda$pgx$WEbuJPlPXYQp2jqApgR8yRdjfjc(this));
        Spannable spannable = (Spannable) jrw.a(this.o.getResources().getString(R.string.offer_premium_legal_text));
        jrx.a(spannable, new $$Lambda$pgx$NURvbtlWPAYlZo26dm54Km_2XhE(this));
        this.d.setText(spannable);
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        Activity activity;
        pgw pgw = this.g;
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                Assertion.b(String.format("Could not find Activity context from view. Context was: %s", new Object[]{view.getContext()}));
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            mbl.a(activity, mbt.g().a(pgw.a).a());
            pgw.b.a(ViewUris.aW.toString(), "free-vs-premium", -1, InteractionType.HIT, "get-30-day-trial");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(String str) {
        return pgw.a(this.d.getContext());
    }
}
