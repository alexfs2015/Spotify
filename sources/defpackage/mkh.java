package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: mkh reason: default package */
public final class mkh extends c<a> {

    /* renamed from: mkh$a */
    static class a extends defpackage.gui.c.a<View> {
        private TextView b;
        private Button c;

        a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.header_title_text);
            this.c = (Button) view.findViewById(R.id.play_button);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            if (!gzt.events().isEmpty()) {
                this.c.setVisibility(0);
                Button button = this.c;
                button.setText(button.getContext().getString(R.string.daily_mix_hub_play_all_cta));
            }
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.daily_mix_hub_header_layout, viewGroup, false));
    }
}
