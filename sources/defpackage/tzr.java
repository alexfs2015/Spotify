package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tzr reason: default package */
public final class tzr implements tyk {
    private final tzn a;
    /* access modifiers changed from: private */
    public final wum b;
    private final Picasso c;

    public tzr(Picasso picasso, wum wum, tzn tzn) {
        this.c = picasso;
        this.b = wum;
        this.a = tzn;
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.slate_modal_background_image, viewGroup, false);
        this.a.c().a((ImageView) inflate.findViewById(R.id.background_image), this.c);
        this.a.a().a((TextView) inflate.findViewById(R.id.title));
        this.a.b().a((TextView) inflate.findViewById(R.id.subtitle));
        Button button = (Button) inflate.findViewById(R.id.action_button);
        this.a.d().a((TextView) button);
        button.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                tzr.this.b.call();
            }
        });
        return inflate;
    }
}
