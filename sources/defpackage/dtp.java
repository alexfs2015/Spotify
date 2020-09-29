package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.util.List;

@cey
/* renamed from: dtp reason: default package */
public final class dtp extends RelativeLayout {
    private static final float[] a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable b;

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }

    public dtp(Context context, dtm dtm, LayoutParams layoutParams) {
        super(context);
        bwx.a(dtm);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
        shapeDrawable.getPaint().setColor(dtm.b);
        setLayoutParams(layoutParams);
        bjl.g().a((View) this, (Drawable) shapeDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(dtm.a())) {
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(dtm.a());
            textView.setTextColor(dtm.c);
            textView.setTextSize((float) dtm.d);
            dpn.a();
            int a2 = col.a(context, 4);
            dpn.a();
            textView.setPadding(a2, 0, col.a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<dtq> list = dtm.a;
        String str = "Error while getting drawable.";
        if (list != null && list.size() > 1) {
            this.b = new AnimationDrawable();
            for (dtq a3 : list) {
                try {
                    this.b.addFrame((Drawable) cas.a(a3.a()), dtm.e);
                } catch (Exception e) {
                    clu.a(str, e);
                }
            }
            bjl.g().a((View) imageView, (Drawable) this.b);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) cas.a(((dtq) list.get(0)).a()));
            } catch (Exception e2) {
                clu.a(str, e2);
            }
        }
        addView(imageView);
    }
}
