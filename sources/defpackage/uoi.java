package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.sociallistening.model.Participant;
import com.squareup.picasso.Picasso;

/* renamed from: uoi reason: default package */
public final class uoi extends androidx.recyclerview.widget.RecyclerView.a<a> implements gkv {
    public OnClickListener a;
    public ImmutableList<Participant> d;
    private final Context e;
    private final jyx f;
    private final Picasso g;
    private final uom h;

    /* renamed from: uoi$a */
    public static class a extends u {
        /* access modifiers changed from: private */
        public final ImageView a;

        public a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.facepile_face_image);
            this.a.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    public uoi(Context context, jyx jyx, Picasso picasso, uom uom) {
        this.e = context;
        this.f = jyx;
        this.g = picasso;
        this.h = uom;
        a(true);
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        if (this.d.size() > 1) {
            this.a.onClick(view);
        }
    }

    private boolean a() {
        return this.d.size() > 4;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.facepile_face, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a aVar = (a) uVar;
        if (i != 3 || !a()) {
            Participant participant = (Participant) this.d.get(i);
            if (fbo.a(participant.largeImageUrl())) {
                Object tag = aVar.a.getTag(R.id.picasso_target);
                if (tag instanceof wgx) {
                    this.g.d((wgx) tag);
                }
                aVar.a.setImageDrawable(this.h.a(participant.displayName()));
            } else {
                this.f.a(aVar.a, participant.largeImageUrl());
            }
            aVar.a.setOnClickListener(new $$Lambda$uoi$uJyO8FQYxZQKmXd5UDUgRhWTh6U(this));
            return;
        }
        this.g.d(aVar.a);
        ImageView a2 = aVar.a;
        uom uom = this.h;
        Context context = this.e;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(a() ? 1 + (this.d.size() - 4) : 0);
        a2.setImageDrawable(uom.a(context.getString(R.string.social_listening_facepile_overflow_character, objArr), this.e.getResources().getColor(uoo.a())));
    }

    public final int b() {
        if (this.d == null) {
            return 0;
        }
        if (a()) {
            return 4;
        }
        return this.d.size();
    }

    public final long b(int i) {
        if (i != 3 || !a()) {
            return (long) ((Participant) this.d.get(i)).username().hashCode();
        }
        return 0;
    }

    public final String c(int i) {
        return "participant";
    }
}
