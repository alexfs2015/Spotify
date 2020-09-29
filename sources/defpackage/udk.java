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

/* renamed from: udk reason: default package */
public final class udk implements kjd<udf, udd> {
    public final View a;
    /* access modifiers changed from: private */
    public final ucu b;
    /* access modifiers changed from: private */
    public final RecyclerView c = ((RecyclerView) this.a.findViewById(R.id.recycler_view));
    /* access modifiers changed from: private */
    public final uci d;

    public udk(LayoutInflater layoutInflater, ViewGroup viewGroup, ucu ucu, uci uci) {
        this.b = ucu;
        this.d = uci;
        this.a = layoutInflater.inflate(R.layout.fragment_social_listening_participant_list, viewGroup, false);
        this.c.a((i) new LinearLayoutManager(layoutInflater.getContext()));
    }

    public final kje<udf> connect(kkn<udd> kkn) {
        ucu ucu = this.b;
        ucu.e = new $$Lambda$udk$LJpsmYreqj7Oo_6MF7N7Yr7CU4(this, kkn);
        ucu.g = new $$Lambda$udk$LXmdWVjqm0r_SW3Db5ijP4QD1eI(this, kkn);
        ucu.f = new $$Lambda$udk$rlB7wTic6SAE4JlirxPGr9eiTK8(this, kkn);
        return new kje<udf>() {
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
                udf udf = (udf) obj;
                if (udk.this.c.c() == null) {
                    udk.this.d.a.a(null, "participant-list", -1, ImpressionType.ITEM, RenderType.LIST);
                    udk.this.c.a((a) udk.this.b);
                }
                ucu c = udk.this.b;
                List list = (List) udf.a().a(ImmutableList.d());
                if (!c.a.equals(list)) {
                    c.a = ImmutableList.a((Collection<? extends E>) list);
                    c.e();
                }
                ucu c2 = udk.this.b;
                String str = (String) udf.b().a("");
                if (!c2.d.equals(str)) {
                    c2.d = str;
                    c2.e();
                }
            }

            public final void dispose() {
                udk.this.b.e = $$Lambda$udk$1$OCH2ZssWYJQCowLv6kjdnKHIs1s.INSTANCE;
                udk.this.b.g = $$Lambda$udk$1$zMw5RI7fUPgcdCoXKNbAXwnU_w.INSTANCE;
                udk.this.b.f = $$Lambda$udk$1$vvCz4eRnLMMi79sO4PTXRuVZ0yo.INSTANCE;
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, int i) {
        kkn.accept(new d(i));
        this.d.a("leave-session", "participant-item", i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kkn kkn, int i) {
        kkn.accept(new c(i));
        this.d.a("end-session", "participant-item", i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, Participant participant, int i) {
        kkn.accept(new b(participant, i));
        this.d.a("navigate-to-profile", i);
    }
}
