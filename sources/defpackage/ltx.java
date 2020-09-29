package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: ltx reason: default package */
public final class ltx extends lub {
    public final View a = this.o.findViewById(R.id.btn_more);
    /* access modifiers changed from: private */
    public final a b;

    /* renamed from: ltx$a */
    public interface a {
        static {
            new a() {
                public final void a(lux lux) {
                }
            };
        }

        void a(lux lux);
    }

    public ltx(ViewGroup viewGroup, a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assisted_curation_card_footer, viewGroup, false));
        this.b = aVar;
    }
}
