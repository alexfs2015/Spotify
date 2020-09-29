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

/* renamed from: voj reason: default package */
public final class voj extends androidx.recyclerview.widget.RecyclerView.a<von<? extends voe>> implements gkv {
    PodcastOnboardingLogger a;
    ImmutableList<voe> d;
    final PublishSubject<c> e = PublishSubject.a();
    private final Picasso f;

    /* renamed from: voj$a */
    public static class a extends von<vod> {
        final TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.header_title);
        }
    }

    /* renamed from: voj$b */
    public static class b extends defpackage.oa.a {
        private final List<voe> a;
        private final List<voe> b;

        public b(List<voe> list, List<voe> list2) {
            this.a = list;
            this.b = list2;
        }

        public final int a() {
            List<voe> list = this.a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final boolean a(int i, int i2) {
            voe voe = (voe) this.a.get(i);
            voe voe2 = (voe) this.b.get(i2);
            if ((voe instanceof vod) && (voe2 instanceof vod)) {
                return ((vod) voe).a().equals(((vod) voe2).a());
            } else if (!(voe instanceof voh) || !(voe2 instanceof voh)) {
                return false;
            } else {
                return ((voh) voe).a().equals(((voh) voe2).a());
            }
        }

        public final int b() {
            List<voe> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final boolean b(int i, int i2) {
            return ((voe) this.a.get(i)).equals(this.b.get(i2));
        }
    }

    /* renamed from: voj$c */
    public static final class c {
        public final voh a;
        public final int b;

        public c(voh voh, int i) {
            this.a = voh;
            this.b = i;
        }
    }

    public voj(Picasso picasso) {
        this.f = picasso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(voh voh, int i, View view) {
        this.e.onNext(new c(voh, i));
    }

    private voe f(int i) {
        return (voe) this.d.get(i);
    }

    public final int a(int i) {
        voe f2 = f(i);
        if (f2 instanceof vod) {
            return 0;
        }
        if (f2 instanceof vog) {
            return 1;
        }
        if (f2 instanceof vof) {
            return 2;
        }
        StringBuilder sb = new StringBuilder("Unrecognizable item at position: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new a(from.inflate(R.layout.topic_picker_header, viewGroup, false));
        }
        if (i == 1) {
            View inflate = from.inflate(R.layout.topic_picker_pillow, viewGroup, false);
            inflate.getLayoutParams().width = ((viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / 3;
            return new vop(inflate, this.f);
        } else if (i == 2) {
            return new voo(from.inflate(R.layout.podcast_onboarding_topic_picker_pill, viewGroup, false));
        } else {
            StringBuilder sb = new StringBuilder("Unrecognizable item with viewType: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        von von = (von) uVar;
        voe f2 = f(i);
        if (f2 instanceof vod) {
            ((a) von).a.setText(((vod) f2).a());
        } else if (f2 instanceof vog) {
            vop vop = (vop) von;
            vog vog = (vog) f2;
            vop.a.setText(vog.b());
            vop.c.setVisibility(vog.d() ? 0 : 8);
            vop.d.a(vog.f()).a(vop.o.getResources().getDrawable(R.drawable.pillow_placeholder)).a((wgz) new defpackage.vop.a(vop.e)).a(vop.b);
        } else if (f2 instanceof vof) {
            voo voo = (voo) von;
            vof vof = (vof) f2;
            voo.a.setText(vof.b());
            Drawable drawable = voo.a.getContext().getResources().getDrawable(R.drawable.podcast_onboarding_pill);
            int paddingLeft = voo.a.getPaddingLeft();
            int paddingTop = voo.a.getPaddingTop();
            int paddingRight = voo.a.getPaddingRight();
            int paddingBottom = voo.a.getPaddingBottom();
            if (vof.d()) {
                drawable.setColorFilter(Color.parseColor(vof.c()), Mode.SRC_ATOP);
            }
            voo.a.setBackground(drawable);
            voo.a.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        } else {
            StringBuilder sb = new StringBuilder("Unrecognizable item at position: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        boolean z = f2 instanceof voh;
        if (z) {
            von.o.setOnClickListener(new $$Lambda$voj$paz0_W4Mkdqfj_3s63HOpsg1MP0(this, (voh) f2, i));
        }
        if (z) {
            voh voh = (voh) f2;
            this.a.a(voh.a(), i, voh instanceof vof ? PodcastOnboardingRenderType.PILL : PodcastOnboardingRenderType.PILLOW);
        }
    }

    public final int b() {
        return this.d.size();
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
}
