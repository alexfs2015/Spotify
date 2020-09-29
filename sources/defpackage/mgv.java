package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: mgv reason: default package */
public final class mgv implements frh {
    private final TextView a = ((TextView) this.c.findViewById(16908308));
    private final TextView b = ((TextView) this.c.findViewById(16908309));
    private final View c;

    public final View a() {
        return null;
    }

    public final void a(View view) {
    }

    public final void a(boolean z) {
    }

    public final void b(boolean z) {
    }

    public final void c(CharSequence charSequence) {
    }

    public final void c(boolean z) {
    }

    public mgv(Context context, ViewGroup viewGroup) {
        this.c = LayoutInflater.from(context).inflate(R.layout.glue_listtile_2, null);
        if (!this.c.isInEditMode()) {
            fze.c(this.a);
            fze.b(this.b);
            fze.a(this.c);
        }
        this.c.setPadding(0, 12, 0, 12);
        uuu.a(context, this.a, 2132017666);
        this.a.setTextSize(2, 20.0f);
        this.b.setMaxLines(7);
        this.b.setTextSize(2, 18.0f);
        this.b.setGravity(1);
        LinearLayout linearLayout = (LinearLayout) this.c.findViewById(R.id.labels);
        linearLayout.setGravity(1);
        linearLayout.setHorizontalGravity(1);
    }

    public final TextView b() {
        return this.a;
    }

    public final TextView d() {
        return this.b;
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final View getView() {
        return this.c;
    }

    public final void c() {
        uui.b(this.c.findViewById(R.id.row_view)).a(this.a, this.b).a();
    }
}
