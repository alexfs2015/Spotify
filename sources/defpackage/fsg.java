package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fsg reason: default package */
public final class fsg extends fsd implements fsf {
    private final TextView a;

    public fsg(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.prefixAccessory);
    }

    public final /* bridge */ /* synthetic */ View a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public final /* bridge */ /* synthetic */ void a(CharSequence charSequence) {
        super.a(charSequence);
    }

    public final /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public final /* bridge */ /* synthetic */ TextView b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ void b(CharSequence charSequence) {
        super.b(charSequence);
    }

    public final /* bridge */ /* synthetic */ void b(boolean z) {
        super.b(z);
    }

    public final /* bridge */ /* synthetic */ ImageView c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ void c(CharSequence charSequence) {
        super.c(charSequence);
    }

    public final /* bridge */ /* synthetic */ void c(boolean z) {
        super.c(z);
    }

    public final /* bridge */ /* synthetic */ TextView d() {
        return super.d();
    }

    public final void d(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final /* bridge */ /* synthetic */ View getView() {
        return super.getView();
    }
}
