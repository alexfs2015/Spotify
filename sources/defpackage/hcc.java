package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.playlist.shelves.Extender.Item;
import com.spotify.mobile.android.playlist.shelves.Extender.Track;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hcc reason: default package */
public final class hcc extends hcb<u, Track> implements gjl {
    /* access modifiers changed from: private */
    public static final Keyframe[] h = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.75f), Keyframe.ofFloat(0.4f, 1.2f), Keyframe.ofFloat(1.0f, 1.0f)};
    /* access modifiers changed from: private */
    public static final Keyframe[] i = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.15f, 1.0f), Keyframe.ofFloat(0.2f, 0.5f), Keyframe.ofFloat(0.25f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)};
    final int a;
    public List<Track> d = new ArrayList();
    public boolean e;
    boolean f;
    public defpackage.hcb.a g;
    /* access modifiers changed from: private */
    public final Activity j;
    /* access modifiers changed from: private */
    public final sih k;
    /* access modifiers changed from: private */
    public final jmq l;
    private fpt m;
    /* access modifiers changed from: private */
    public final b n;
    private String o;
    /* access modifiers changed from: private */
    public final Drawable p;
    /* access modifiers changed from: private */
    public final Drawable q;
    private final jmf<Track> r = new jmf<Track>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            Track track = (Track) obj;
            return hcc.this.l.a(track.getUri(), track.name, hcc.this.k.toString()).a(hcc.this.k).a(true).b(true).c(true).d(false).f(false).a();
        }
    };

    /* renamed from: hcc$a */
    class a extends u {
        Track a;
        /* access modifiers changed from: 0000 */
        public ValueAnimator b;
        /* access modifiers changed from: 0000 */
        public int c;
        final OnClickListener d = new OnClickListener() {
            public final void onClick(View view) {
                if (a.this.c != -1) {
                    hcc.this.n.a(a.this.c);
                }
            }
        };
        /* access modifiers changed from: 0000 */
        public final OnClickListener e = new OnClickListener() {
            public final void onClick(View view) {
                if (hcc.this.g != null) {
                    view.setOnClickListener(null);
                    a.b(a.this);
                }
            }
        };

        public a(View view) {
            super(view);
            frh frh = (frh) fqb.a(view, frh.class);
            frh.a(jwz.a(hcc.this.j));
            ImageButton imageButton = (ImageButton) frh.a();
            imageButton.setImageDrawable(hcc.this.p);
            imageButton.setOnClickListener(this.e);
        }

        static /* synthetic */ void b(a aVar) {
            final ImageButton imageButton = (ImageButton) ((frh) fqb.a(aVar.o, frh.class)).a();
            aVar.b = ObjectAnimator.ofPropertyValuesHolder(imageButton, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, hcc.h), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, hcc.h), PropertyValuesHolder.ofKeyframe(View.ALPHA, hcc.i)});
            aVar.b.setDuration(1000);
            aVar.b.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (valueAnimator.getAnimatedFraction() > 0.2f) {
                        valueAnimator.removeUpdateListener(this);
                        imageButton.setImageDrawable(hcc.this.q);
                    }
                }
            });
            final int i = aVar.c;
            final String uri = aVar.a.getUri();
            aVar.b.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    ImageButton imageButton = imageButton;
                    imageButton.post(new $$Lambda$hcc$a$5$uXaok8kPqL5IAyhx8namk8NENE(this, uri, i, imageButton));
                    a.this.b = null;
                }

                /* access modifiers changed from: private */
                public /* synthetic */ void a(String str, int i, ImageButton imageButton) {
                    if (hcc.this.g != null) {
                        hcc.this.g.a(str, i, new $$Lambda$hcc$a$5$6eb54_phytX1xx3vmx4ikhnEzs(this, imageButton));
                    }
                }

                /* access modifiers changed from: private */
                public /* synthetic */ void a(ImageButton imageButton, boolean z) {
                    if (!z) {
                        imageButton.setImageDrawable(hcc.this.p);
                        imageButton.setOnClickListener(a.this.e);
                    }
                }
            });
            aVar.b.start();
        }
    }

    public hcc(Activity activity, sih sih, fpt fpt, int i2, jmq jmq, b bVar) {
        this.j = activity;
        this.k = sih;
        this.m = fpt;
        this.a = i2;
        this.l = jmq;
        this.n = (b) fay.a(bVar);
        this.p = jwz.b(this.j, SpotifyIconV2.ADD_TO_PLAYLIST, fr.b((Context) this.j, (int) R.color.cat_white));
        this.q = jwz.b(this.j, SpotifyIconV2.CHECK, fr.b((Context) this.j, (int) R.color.cat_white));
        a(true);
    }

    public final void a(List<Track> list) {
        this.d.addAll(list);
        e();
    }

    public final void b(boolean z) {
        if (z != this.e) {
            this.e = z;
            e();
        }
    }

    public final void a(String str) {
        if (!faw.a(this.o, str)) {
            this.o = str;
            e();
        }
    }

    public final int a() {
        return Math.min(this.d.size(), this.a);
    }

    public final Track f(int i2) {
        return (Track) this.d.get(i2);
    }

    public final long b(int i2) {
        return (long) ((Track) this.d.get(i2)).getUri().hashCode();
    }

    public final int a(int i2) {
        return frh.class.hashCode() + (jsl.c(this.m) ? 1 : 0);
    }

    public final int b() {
        return a();
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqb.b();
        return new a(frq.a((Context) this.j, viewGroup, !jsl.c(this.m)).getView());
    }

    public final void c(u uVar) {
        if (uVar instanceof a) {
            a aVar = (a) uVar;
            if (aVar.b != null) {
                aVar.b.end();
                aVar.b = null;
            }
            ImageButton imageButton = (ImageButton) ((frh) fqb.a(aVar.o, frh.class)).a();
            imageButton.setImageDrawable(hcc.this.p);
            imageButton.setOnClickListener(aVar.e);
        }
    }

    public final void a(u uVar, int i2) {
        View view = uVar.o;
        a aVar = (a) uVar;
        Track track = (Track) this.d.get(i2);
        aVar.a = track;
        aVar.c = i2;
        frh frh = (frh) fqb.a(aVar.o, frh.class);
        frh.a(track.name);
        String str = ((Item) track.artists.get(0)).name;
        String str2 = track.album.name;
        StringBuilder sb = new StringBuilder(16);
        if (!fax.a(str)) {
            sb.append(str);
        }
        if (!fax.a(str2)) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(str2);
        }
        frh.b(sb.toString());
        frh.a(track.getUri().equals(hcc.this.o));
        frh.getView().setEnabled(!hcc.this.e);
        frh.getView().setOnClickListener(aVar.d);
        frh.getView().setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                Object tag = view.getTag(R.id.context_menu_tag);
                if (tag == null) {
                    return false;
                }
                ((jny) tag).a(hcc.this.j, hcc.this.k);
                return true;
            }
        });
        frh.getView().setTag(track);
        frh.getView().setTag(R.id.context_menu_tag, new jny(hcc.this.r, track));
        jxb.a((Context) hcc.this.j, frh.d(), track.explicit);
        frh.c(jtb.a(true, hcc.this.f, track.explicit));
        aVar.o.setId(R.id.extender_item);
        view.setEnabled(!this.e);
    }
}
