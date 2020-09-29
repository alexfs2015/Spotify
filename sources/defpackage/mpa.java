package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: mpa reason: default package */
public final class mpa extends c<a> {

    /* renamed from: mpa$a */
    static class a extends defpackage.gwi.c.a<View> {
        private TextView b;
        private Button c;

        a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.header_title_text);
            this.c = (Button) view.findViewById(R.id.play_button);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            if (!hcm.events().isEmpty()) {
                this.c.setVisibility(0);
                Button button = this.c;
                button.setText(button.getContext().getString(R.string.daily_mix_hub_play_all_cta));
            }
        }
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.daily_mix_hub_header_layout, viewGroup, false));
    }
}
