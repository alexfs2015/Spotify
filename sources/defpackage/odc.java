package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: odc reason: default package */
final class odc extends u {
    final Picasso a;
    final TextView b;
    final TextView c;
    final TextView d;
    final ImageView e;
    final ImageView f;
    final TextView g;
    final TextView h;
    final ImageView i;
    final Context j;
    final TextView k;

    public odc(View view, Picasso picasso) {
        super(view);
        this.j = view.getContext();
        this.a = picasso;
        this.b = (TextView) view.findViewById(R.id.presenter_name);
        this.g = (TextView) view.findViewById(R.id.recsplanations_tv);
        this.c = (TextView) view.findViewById(R.id.entity_name_tv);
        this.d = (TextView) view.findViewById(R.id.entity_owner_tv);
        this.e = (ImageView) view.findViewById(R.id.presenter_image);
        this.f = (ImageView) view.findViewById(R.id.album_image);
        this.h = (TextView) view.findViewById(R.id.presenter_date);
        this.k = (TextView) view.findViewById(R.id.type_tv);
        this.i = (ImageView) view.findViewById(R.id.action_button);
        if (VERSION.SDK_INT >= 21) {
            view.findViewById(R.id.constraintLayout).setClipToOutline(true);
        }
    }

    public static String a(String str) {
        try {
            return DateUtils.getRelativeTimeSpanString(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault()).parse(str).getTime()).toString();
        } catch (ParseException e2) {
            Logger.e(e2, "Exception when parsing date.", new Object[0]);
            return "";
        }
    }

    static vgr a(Context context, Drawable drawable) {
        vgr vgr = new vgr(drawable, 0.5f);
        vgr.a(0.0f);
        vgr.a(fr.b(context, (int) R.color.bg_primary_action_white));
        return vgr;
    }
}
