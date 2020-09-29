package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.sociallistening.model.Participant;
import java.util.Collection;
import java.util.List;

/* renamed from: uqf reason: default package */
public final class uqf implements kmm<uqa, upy> {
    public final View a;
    /* access modifiers changed from: private */
    public final upp b;
    /* access modifiers changed from: private */
    public final RecyclerView c = ((RecyclerView) this.a.findViewById(R.id.recycler_view));
    /* access modifiers changed from: private */
    public final upd d;

    public uqf(LayoutInflater layoutInflater, ViewGroup viewGroup, upp upp, upd upd) {
        this.b = upp;
        this.d = upd;
        this.a = layoutInflater.inflate(R.layout.fragment_social_listening_participant_list, viewGroup, false);
        this.c.a((i) new LinearLayoutManager(layoutInflater.getContext()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, int i) {
        knw.accept(new d(i));
        this.d.a("leave-session", "participant-item", i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, Participant participant, int i) {
        knw.accept(new b(participant, i));
        this.d.a("navigate-to-profile", i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(knw knw, int i) {
        knw.accept(new c(i));
        this.d.a("end-session", "participant-item", i);
    }

    public final kmn<uqa> connect(knw<upy> knw) {
        upp upp = this.b;
        upp.e = new $$Lambda$uqf$bPKESvbOTnwufDYAxgD4wPPShKw(this, knw);
        upp.g = new $$Lambda$uqf$2LaFvxQJWIu8Fc5UKBwdmBERu8E(this, knw);
        upp.f = new $$Lambda$uqf$YO8jWjHpcRqFu3gKXJBDE50Pl4(this, knw);
        return new kmn<uqa>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(int i) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(Participant participant, int i) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void b(int i) {
            }

            public final /* synthetic */ void accept(Object obj) {
                uqa uqa = (uqa) obj;
                if (uqf.this.c.c() == null) {
                    uqf.this.d.a.a(null, "participant-list", -1, ImpressionType.ITEM, RenderType.LIST);
                    uqf.this.c.a((a) uqf.this.b);
                }
                upp c = uqf.this.b;
                List list = (List) uqa.a().a(ImmutableList.d());
                if (!c.a.equals(list)) {
                    c.a = ImmutableList.a((Collection<? extends E>) list);
                    c.e();
                }
                upp c2 = uqf.this.b;
                String str = (String) uqa.b().a("");
                if (!c2.d.equals(str)) {
                    c2.d = str;
                    c2.e();
                }
            }

            public final void dispose() {
                uqf.this.b.e = $$Lambda$uqf$1$OFW5xQJgQmOG9FcGI1vHi9sCnQ.INSTANCE;
                uqf.this.b.g = $$Lambda$uqf$1$xQciUHyFe3bT3tSh2G69O7iW8ro.INSTANCE;
                uqf.this.b.f = $$Lambda$uqf$1$m_tCgvFS1TjOiSwUinMqAFIy_A.INSTANCE;
            }
        };
    }
}
