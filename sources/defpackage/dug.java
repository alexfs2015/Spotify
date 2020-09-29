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

@cfp
/* renamed from: dug reason: default package */
public final class dug extends RelativeLayout {
    private static final float[] a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable b;

    public dug(Context context, dud dud, LayoutParams layoutParams) {
        super(context);
        bxo.a(dud);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
        shapeDrawable.getPaint().setColor(dud.b);
        setLayoutParams(layoutParams);
        bkc.g().a((View) this, (Drawable) shapeDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(dud.a())) {
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(dud.a());
            textView.setTextColor(dud.c);
            textView.setTextSize((float) dud.d);
            dqe.a();
            int a2 = cpc.a(context, 4);
            dqe.a();
            textView.setPadding(a2, 0, cpc.a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<duh> list = dud.a;
        String str = "Error while getting drawable.";
        if (list != null && list.size() > 1) {
            this.b = new AnimationDrawable();
            for (duh a3 : list) {
                try {
                    this.b.addFrame((Drawable) cbj.a(a3.a()), dud.e);
                } catch (Exception e) {
                    cml.a(str, e);
                }
            }
            bkc.g().a((View) imageView, (Drawable) this.b);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) cbj.a(((duh) list.get(0)).a()));
            } catch (Exception e2) {
                cml.a(str, e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
