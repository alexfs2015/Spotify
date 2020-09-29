package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: joj reason: default package */
public final class joj extends jxd<View> {
    private final Calendar b;
    private final TextView c = ((TextView) fay.a(this.a.findViewById(R.id.month)));
    private final TextView d = ((TextView) fay.a(this.a.findViewById(R.id.day)));

    private joj(Context context, Calendar calendar) {
        super(LayoutInflater.from(context).inflate(R.layout.calendar_view, null));
        this.b = (Calendar) fay.a(calendar);
    }

    public final void a(Date date, Locale locale) {
        if (date != null) {
            this.b.setTime(date);
            a(locale);
            return;
        }
        String str = "";
        this.c.setText(str);
        this.d.setText(str);
    }

    private void a(Locale locale) {
        a(this.b.getDisplayName(2, 1, locale).toUpperCase(locale), this.b.get(5));
    }

    public final void a(String str, int i) {
        a(str, String.valueOf(i));
    }

    private void a(String str, String str2) {
        this.c.setText(str);
        this.d.setText(str2);
    }

    public static joj a(ImageView imageView, jrp jrp) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof joj) {
            return (joj) drawable;
        }
        joj joj = new joj(imageView.getContext(), jrp.f());
        imageView.setImageDrawable(joj);
        return joj;
    }
}
