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

/* renamed from: hey reason: default package */
public final class hey extends hex<u, Track> implements gkw {
    /* access modifiers changed from: private */
    public static final Keyframe[] h = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.75f), Keyframe.ofFloat(0.4f, 1.2f), Keyframe.ofFloat(1.0f, 1.0f)};
    /* access modifiers changed from: private */
    public static final Keyframe[] i = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.15f, 1.0f), Keyframe.ofFloat(0.2f, 0.5f), Keyframe.ofFloat(0.25f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)};
    final int a;
    public List<Track> d = new ArrayList();
    public boolean e;
    boolean f;
    public defpackage.hex.a g;
    /* access modifiers changed from: private */
    public final Activity j;
    /* access modifiers changed from: private */
    public final sso k;
    /* access modifiers changed from: private */
    public final jpc l;
    private fqn m;
    /* access modifiers changed from: private */
    public final b n;
    private String o;
    /* access modifiers changed from: private */
    public final Drawable p;
    /* access modifiers changed from: private */
    public final Drawable q;
    private final jor<Track> r = new jor<Track>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            Track track = (Track) obj;
            return hey.this.l.a(track.getUri(), track.name, hey.this.k.toString()).a(hey.this.k).a(true).b(true).c(true).d(false).f(false).a();
        }
    };

    /* renamed from: hey$a */
    class a extends u {
        Track a;
        /* access modifiers changed from: 0000 */
        public ValueAnimator b;
        /* access modifiers changed from: 0000 */
        public int c;
        final OnClickListener d = new OnClickListener() {
            public final void onClick(View view) {
                if (a.this.c != -1) {
                    hey.this.n.a(a.this.c);
                }
            }
        };
        /* access modifiers changed from: 0000 */
        public final OnClickListener e = new OnClickListener() {
            public final void onClick(View view) {
                if (hey.this.g != null) {
                    view.setOnClickListener(null);
                    a.b(a.this);
                }
            }
        };

        public a(View view) {
            super(view);
            fsb fsb = (fsb) fqv.a(view, fsb.class);
            fsb.a(jyz.a(hey.this.j));
            ImageButton imageButton = (ImageButton) fsb.a();
            imageButton.setImageDrawable(hey.this.p);
            imageButton.setOnClickListener(this.e);
            imageButton.setContentDescription(imageButton.getContext().getString(R.string.playlist_extended_tracks_add_to_playlist_content_description));
        }

        static /* synthetic */ void b(a aVar) {
            final ImageButton imageButton = (ImageButton) ((fsb) fqv.a(aVar.o, fsb.class)).a();
            aVar.b = ObjectAnimator.ofPropertyValuesHolder(imageButton, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, hey.h), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, hey.h), PropertyValuesHolder.ofKeyframe(View.ALPHA, hey.i)});
            aVar.b.setDuration(1000);
            aVar.b.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (valueAnimator.getAnimatedFraction() > 0.2f) {
                        valueAnimator.removeUpdateListener(this);
                        imageButton.setImageDrawable(hey.this.q);
                    }
                }
            });
            final int i = aVar.c;
            final String uri = aVar.a.getUri();
            aVar.b.addListener(new AnimatorListenerAdapter() {
                /* access modifiers changed from: private */
                public /* synthetic */ void a(ImageButton imageButton, boolean z) {
                    if (!z) {
                        imageButton.setImageDrawable(hey.this.p);
                        imageButton.setOnClickListener(a.this.e);
                    }
                }

                /* access modifiers changed from: private */
                public /* synthetic */ void a(String str, int i, ImageButton imageButton) {
                    if (hey.this.g != null) {
                        hey.this.g.a(str, i, new $$Lambda$hey$a$5$uwTCQfiqrZ_oO5YogMm5BhOMlQI(this, imageButton));
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    ImageButton imageButton = imageButton;
                    imageButton.post(new $$Lambda$hey$a$5$v9iY6FapaU4mKEHa8tMUM2g4PfU(this, uri, i, imageButton));
                    a.this.b = null;
                }
            });
            aVar.b.start();
        }
    }

    public hey(Activity activity, sso sso, fqn fqn, int i2, jpc jpc, b bVar) {
        this.j = activity;
        this.k = sso;
        this.m = fqn;
        this.a = i2;
        this.l = jpc;
        this.n = (b) fbp.a(bVar);
        this.p = jyz.b(this.j, SpotifyIconV2.ADD_TO_PLAYLIST, fr.b((Context) this.j, (int) R.color.cat_white));
        this.q = jyz.b(this.j, SpotifyIconV2.CHECK, fr.b((Context) this.j, (int) R.color.cat_white));
        a(true);
    }

    public final int a() {
        return Math.min(this.d.size(), this.a);
    }

    public final int a(int i2) {
        return fsb.class.hashCode() + (jus.c(this.m) ? 1 : 0);
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqv.b();
        return new a(fsk.a((Context) this.j, viewGroup, !jus.c(this.m)).getView());
    }

    public final void a(u uVar, int i2) {
        View view = uVar.o;
        a aVar = (a) uVar;
        Track track = (Track) this.d.get(i2);
        aVar.a = track;
        aVar.c = i2;
        fsb fsb = (fsb) fqv.a(aVar.o, fsb.class);
        fsb.a(track.name);
        String str = ((Item) track.artists.get(0)).name;
        String str2 = track.album.name;
        StringBuilder sb = new StringBuilder(16);
        if (!fbo.a(str)) {
            sb.append(str);
        }
        if (!fbo.a(str2)) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(str2);
        }
        fsb.b(sb.toString());
        fsb.a(track.getUri().equals(hey.this.o));
        fsb.getView().setEnabled(!hey.this.e);
        fsb.getView().setOnClickListener(aVar.d);
        fsb.getView().setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                Object tag = view.getTag(R.id.context_menu_tag);
                if (tag == null) {
                    return false;
                }
                ((jqk) tag).a(hey.this.j, hey.this.k);
                return true;
            }
        });
        fsb.getView().setTag(track);
        fsb.getView().setTag(R.id.context_menu_tag, new jqk(hey.this.r, track));
        jzb.a((Context) hey.this.j, fsb.d(), track.explicit);
        fsb.c(jvh.a(true, hey.this.f, track.explicit));
        aVar.o.setId(R.id.extender_item);
        view.setEnabled(!this.e);
    }

    public final void a(String str) {
        if (!fbn.a(this.o, str)) {
            this.o = str;
            e();
        }
    }

    public final void a(List<Track> list) {
        this.d.addAll(list);
        e();
    }

    public final int b() {
        return a();
    }

    public final long b(int i2) {
        return (long) ((Track) this.d.get(i2)).getUri().hashCode();
    }

    public final void b(boolean z) {
        if (z != this.e) {
            this.e = z;
            e();
        }
    }

    public final void c(u uVar) {
        if (uVar instanceof a) {
            a aVar = (a) uVar;
            if (aVar.b != null) {
                aVar.b.end();
                aVar.b = null;
            }
            ImageButton imageButton = (ImageButton) ((fsb) fqv.a(aVar.o, fsb.class)).a();
            imageButton.setImageDrawable(hey.this.p);
            imageButton.setOnClickListener(aVar.e);
        }
    }

    public final Track f(int i2) {
        return (Track) this.d.get(i2);
    }
}
