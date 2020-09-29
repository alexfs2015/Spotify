package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: jsw reason: default package */
public class jsw extends LinearLayout {
    public TextView a = ((TextView) findViewById(R.id.description));
    public ImageView b = ((ImageView) findViewById(R.id.image));
    public Button c = ((Button) findViewById(R.id.button));
    public TextView d;
    private TextView e;
    private TextView f = ((TextView) findViewById(R.id.by_text));

    public jsw(Context context) {
        super(context);
        inflate(getContext(), R.layout.header_info_page, this);
        int b2 = vfj.b(16.0f, getResources());
        setPadding(b2, 0, b2, vfj.b(6.0f, getResources()));
        setGravity(17);
        setOrientation(1);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.RELEASED, (float) vfj.b(32.0f, getContext().getResources()));
        spotifyIconDrawable.a(fr.c(getContext(), R.color.cat_white_70));
        this.d = (TextView) findViewById(R.id.date);
        spotifyIconDrawable.a(this.d.getTextSize() * 1.25f);
        jm.b(this.d, spotifyIconDrawable, null, null, null);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(getContext(), SpotifyIconV2.TIME, (float) vfj.b(32.0f, getContext().getResources()));
        spotifyIconDrawable2.a(fr.c(getContext(), R.color.cat_white_70));
        this.e = (TextView) findViewById(R.id.duration);
        spotifyIconDrawable2.a(this.e.getTextSize() * 1.2f);
        jm.b(this.e, spotifyIconDrawable2, null, null, null);
    }

    public final void a(int i) {
        String str;
        int i2 = i / 60;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 > 0) {
            str = getResources().getString(R.string.header_hours_minutes_format, new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
        } else {
            str = getResources().getString(R.string.header_minutes_format, new Object[]{Integer.valueOf(i4)});
        }
        this.e.setText(str);
    }

    public final void a(OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
    }

    public final void a(String str) {
        this.f.setText(str);
    }

    public final void a(jtz jtz, long j) {
        if (j > 0) {
            Calendar f2 = jtz.f();
            f2.setTimeInMillis(j * 1000);
            this.d.setText(DateFormat.getDateInstance(2).format(f2.getTime()));
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
    }

    public final void a(boolean z) {
        this.a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void b(String str) {
        this.c.setText(str);
    }
}
