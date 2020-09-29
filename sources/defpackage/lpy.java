package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: lpy reason: default package */
public final class lpy extends lqc {
    public final View a = this.o.findViewById(R.id.btn_more);
    /* access modifiers changed from: private */
    public final a b;

    /* renamed from: lpy$a */
    public interface a {
        void a(lqy lqy);

        static {
            new a() {
                public final void a(lqy lqy) {
                }
            };
        }
    }

    public lpy(ViewGroup viewGroup, a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assisted_curation_card_footer, viewGroup, false));
        this.b = aVar;
    }
}
