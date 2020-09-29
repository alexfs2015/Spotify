package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.legacy.ui.OfferViewModel;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: phb reason: default package */
public final class phb extends u {
    private final TextView a;
    private final ImageView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final Button f;
    private final TextView g;
    private final pha h;
    private final pgz i;

    public phb(View view, pha pha, pgz pgz) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.offer_title);
        this.b = (ImageView) view.findViewById(R.id.offer_icon);
        this.c = (TextView) view.findViewById(R.id.offer_price);
        this.d = (TextView) view.findViewById(R.id.offer_duration);
        this.e = (TextView) view.findViewById(R.id.offer_details);
        this.f = (Button) view.findViewById(R.id.offer_cta);
        this.g = (TextView) view.findViewById(R.id.offer_legal_text);
        this.h = pha;
        this.i = pgz;
    }

    public final void a(OfferViewModel offerViewModel) {
        this.o.setBackgroundResource(offerViewModel.c);
        this.a.setText(offerViewModel.b);
        this.b.setBackgroundResource(offerViewModel.d);
        this.c.setText(offerViewModel.e);
        this.d.setText(offerViewModel.f);
        this.e.setText(offerViewModel.g);
        this.f.setText(offerViewModel.h);
        this.f.setOnClickListener(new $$Lambda$phb$3sZLBiIw6c0qS1MsdmWhvNwvqZo(this, offerViewModel));
        Spannable spannable = (Spannable) jrw.a(this.o.getContext().getString(offerViewModel.i));
        jrx.a(spannable, new $$Lambda$phb$8DWBfbOBWu7cJRzjAjZtrJJHVC8(this, offerViewModel));
        this.g.setText(spannable);
        this.g.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfferViewModel offerViewModel, View view) {
        pha pha = this.h;
        Activity activity = (Activity) this.o.getContext();
        int i2 = AnonymousClass1.a[offerViewModel.a.ordinal()];
        if (i2 == 1) {
            mbl.a(activity, mbt.g().a(pha.a).a());
            pha.b.a(ViewUris.aW.toString(), "offers", -1, InteractionType.HIT, "get-30-day-trial");
        } else if (i2 != 2) {
            if (i2 == 3) {
                mbl.a(activity, mbt.g().a(Uri.parse(activity.getResources().getString(R.string.offer_student_cta_url))).a(pha.a).a());
                pha.b.a(ViewUris.aW.toString(), "offers", -1, InteractionType.HIT, "get-student-plan");
            }
        } else {
            mbl.a(activity, mbt.g().a(Uri.parse("https://www.spotify.com/family/purchase/")).a(pha.a).a());
            pha.b.a(ViewUris.aW.toString(), "offers", -1, InteractionType.HIT, "get-family-plan");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(OfferViewModel offerViewModel, String str) {
        pha pha = this.h;
        Context context = this.o.getContext();
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getResources().getString(offerViewModel.j))));
        return false;
    }
}
