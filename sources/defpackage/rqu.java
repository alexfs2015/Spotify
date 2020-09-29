package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardTextLines;
import com.squareup.picasso.Picasso;

/* renamed from: rqu reason: default package */
public class rqu implements HomeCardViewBinder {
    private static final String a = rqu.class.getSimpleName();
    private final Context b;
    private final View c;
    private final ConstraintLayout d = ((ConstraintLayout) this.c.findViewById(R.id.home_card_root_view));
    private final ImageView e = ((ImageView) this.c.findViewById(R.id.image));
    private final TextView f = ((TextView) this.c.findViewById(R.id.title));
    private final TextView g = ((TextView) this.c.findViewById(R.id.sub_title));
    private final wgj h;
    private final rqw i;

    public rqu(Context context, ViewGroup viewGroup, Picasso picasso, rqw rqw) {
        this.b = context;
        this.c = LayoutInflater.from((Context) fbp.a(this.b)).inflate(R.layout.home_card_component_layout, viewGroup, false);
        this.h = new wgj(new wgu(picasso), this.b);
        this.i = (rqw) fbp.a(rqw);
        vfz.a(this.d).b(this.e).a(this.f, this.g).a();
    }

    private static CharSequence a(CharSequence charSequence, Drawable drawable) {
        return !TextUtils.isEmpty(charSequence) ? frl.a(charSequence, drawable) : charSequence;
    }

    private void e() {
        TruncateAt truncateAt;
        int i2;
        if (vgi.a(this.b)) {
            i2 = 8388613;
            truncateAt = TruncateAt.START;
        } else {
            i2 = 8388611;
            truncateAt = TruncateAt.END;
        }
        this.f.setGravity(i2);
        this.g.setGravity(i2);
        this.f.setEllipsize(truncateAt);
        this.g.setEllipsize(truncateAt);
    }

    public final void a() {
        this.f.setText(a(this.f.getText(), frr.a(this.f.getContext())));
    }

    public final void a(Drawable drawable) {
        e();
        this.e.setImageDrawable(drawable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.net.Uri r4, android.graphics.drawable.Drawable r5, java.lang.String r6) {
        /*
            r3 = this;
            wgj r0 = r3.h
            wgr r0 = r0.a(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            wgr r4 = r0.a(r4)
            r3.e()
            int r0 = r6.hashCode()
            r1 = -1498085729(0xffffffffa6b5069f, float:-1.2561193E-15)
            r2 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 1385468589(0x529492ad, float:3.19057986E11)
            if (r0 == r1) goto L_0x002e
            goto L_0x0042
        L_0x002e:
            java.lang.String r0 = "rounded"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0042
            r6 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "circular"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = -1
        L_0x0043:
            if (r6 == 0) goto L_0x0074
            if (r6 == r2) goto L_0x0053
            r4.a(r5)
            r4.b(r5)
            android.widget.ImageView r5 = r3.e
            r4.a(r5)
            return
        L_0x0053:
            vgr r6 = new vgr
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r5, r0)
            r4.a(r6)
            r4.b(r6)
            android.widget.ImageView r5 = r3.e
            wgx r5 = defpackage.vhj.a(r5)
            r4.a(r5)
            android.widget.TextView r4 = r3.f
            r4.setGravity(r2)
            android.widget.TextView r4 = r3.g
            r4.setGravity(r2)
            return
        L_0x0074:
            r4.a(r5)
            r4.b(r5)
            android.view.View r5 = r3.getView()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165653(0x7f0701d5, float:1.794553E38)
            int r5 = r5.getDimensionPixelSize(r6)
            float r5 = (float) r5
            android.widget.ImageView r6 = r3.e
            vfk r5 = defpackage.vgt.a(r5)
            wgx r5 = defpackage.vhj.a(r6, r5)
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqu.a(android.net.Uri, android.graphics.drawable.Drawable, java.lang.String):void");
    }

    public final void a(CardSize cardSize) {
        this.i.a(this.e, cardSize);
        this.i.a((View) this.d, cardSize);
    }

    public final void a(CardTextLines cardTextLines) {
        this.f.setMaxLines(cardTextLines.value);
    }

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setText(charSequence);
        this.f.setVisibility(0);
    }

    public final void b() {
        this.g.setText(a(this.g.getText(), frr.a(this.g.getContext())));
    }

    public final void b(CardTextLines cardTextLines) {
        this.g.setMaxLines(cardTextLines.value);
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setText(charSequence);
        this.g.setVisibility(0);
    }

    public final void c() {
        this.f.setText(a(this.f.getText(), frr.b(this.f.getContext())));
    }

    public final void d() {
        this.g.setText(a(this.g.getText(), frr.b(this.f.getContext())));
    }

    public View getView() {
        return this.c;
    }
}
