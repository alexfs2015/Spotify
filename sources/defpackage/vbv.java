package defpackage;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.podcastonboarding.logger.PodcastOnboardingLogger;
import com.spotify.podcastonboarding.logger.PodcastOnboardingLogger.PodcastOnboardingRenderType;
import com.squareup.picasso.Picasso;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

/* renamed from: vbv reason: default package */
public final class vbv extends androidx.recyclerview.widget.RecyclerView.a<vbz<? extends vbq>> implements gjk {
    PodcastOnboardingLogger a;
    ImmutableList<vbq> d;
    final PublishSubject<c> e = PublishSubject.a();
    private final Picasso f;

    /* renamed from: vbv$a */
    public static class a extends vbz<vbp> {
        final TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.header_title);
        }
    }

    /* renamed from: vbv$b */
    public static class b extends defpackage.nv.a {
        private final List<vbq> a;
        private final List<vbq> b;

        public b(List<vbq> list, List<vbq> list2) {
            this.a = list;
            this.b = list2;
        }

        public final int a() {
            List<vbq> list = this.a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final int b() {
            List<vbq> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final boolean a(int i, int i2) {
            vbq vbq = (vbq) this.a.get(i);
            vbq vbq2 = (vbq) this.b.get(i2);
            if ((vbq instanceof vbp) && (vbq2 instanceof vbp)) {
                return ((vbp) vbq).a().equals(((vbp) vbq2).a());
            } else if (!(vbq instanceof vbt) || !(vbq2 instanceof vbt)) {
                return false;
            } else {
                return ((vbt) vbq).a().equals(((vbt) vbq2).a());
            }
        }

        public final boolean b(int i, int i2) {
            return ((vbq) this.a.get(i)).equals(this.b.get(i2));
        }
    }

    /* renamed from: vbv$c */
    public static final class c {
        public final vbt a;
        public final int b;

        public c(vbt vbt, int i) {
            this.a = vbt;
            this.b = i;
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        vbz vbz = (vbz) uVar;
        vbq f2 = f(i);
        if (f2 instanceof vbp) {
            ((a) vbz).a.setText(((vbp) f2).a());
        } else if (f2 instanceof vbs) {
            vcb vcb = (vcb) vbz;
            vbs vbs = (vbs) f2;
            vcb.a.setText(vbs.b());
            vcb.c.setVisibility(vbs.d() ? 0 : 8);
            vcb.d.a(vbs.f()).a(vcb.o.getResources().getDrawable(R.drawable.pillow_placeholder)).a((vst) new defpackage.vcb.a(vcb.e)).a(vcb.b);
        } else if (f2 instanceof vbr) {
            vca vca = (vca) vbz;
            vbr vbr = (vbr) f2;
            vca.a.setText(vbr.b());
            Drawable drawable = vca.a.getContext().getResources().getDrawable(R.drawable.podcast_onboarding_pill);
            int paddingLeft = vca.a.getPaddingLeft();
            int paddingTop = vca.a.getPaddingTop();
            int paddingRight = vca.a.getPaddingRight();
            int paddingBottom = vca.a.getPaddingBottom();
            if (vbr.d()) {
                drawable.setColorFilter(Color.parseColor(vbr.c()), Mode.SRC_ATOP);
            }
            vca.a.setBackground(drawable);
            vca.a.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        } else {
            StringBuilder sb = new StringBuilder("Unrecognizable item at position: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        boolean z = f2 instanceof vbt;
        if (z) {
            vbz.o.setOnClickListener(new $$Lambda$vbv$w_VOe3Gy2jvCIftPEM7levG8FxI(this, (vbt) f2, i));
        }
        if (z) {
            vbt vbt = (vbt) f2;
            this.a.a(vbt.a(), i, vbt instanceof vbr ? PodcastOnboardingRenderType.PILL : PodcastOnboardingRenderType.PILLOW);
        }
    }

    public vbv(Picasso picasso) {
        this.f = picasso;
    }

    private vbq f(int i) {
        return (vbq) this.d.get(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vbt vbt, int i, View view) {
        this.e.onNext(new c(vbt, i));
    }

    public final int a(int i) {
        vbq f2 = f(i);
        if (f2 instanceof vbp) {
            return 0;
        }
        if (f2 instanceof vbs) {
            return 1;
        }
        if (f2 instanceof vbr) {
            return 2;
        }
        StringBuilder sb = new StringBuilder("Unrecognizable item at position: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String c(int i) {
        int a2 = a(i);
        if (a2 == 0) {
            return "header";
        }
        if (a2 == 1) {
            return "pillow";
        }
        if (a2 == 2) {
            return "pill";
        }
        StringBuilder sb = new StringBuilder("Unrecognizable item at position: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int b() {
        return this.d.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new a(from.inflate(R.layout.topic_picker_header, viewGroup, false));
        }
        if (i == 1) {
            View inflate = from.inflate(R.layout.topic_picker_pillow, viewGroup, false);
            inflate.getLayoutParams().width = ((viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / 3;
            return new vcb(inflate, this.f);
        } else if (i == 2) {
            return new vca(from.inflate(R.layout.podcast_onboarding_topic_picker_pill, viewGroup, false));
        } else {
            StringBuilder sb = new StringBuilder("Unrecognizable item with viewType: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
