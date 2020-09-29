package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.sociallistening.model.Participant;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

/* renamed from: upp reason: default package */
public final class upp extends androidx.recyclerview.widget.RecyclerView.a<d> implements gkv {
    public ImmutableList<Participant> a = ImmutableList.d();
    public String d = "";
    public c e = $$Lambda$upp$8UCmuKu6Rbbz4oScuMIQ9EJEZTs.INSTANCE;
    public b f = $$Lambda$upp$iPPpKVed4E6_R7esEL6IcsMA5ck.INSTANCE;
    public a g = $$Lambda$upp$KgJxzueGaFJfjVdfI_ZL3rwW9AM.INSTANCE;
    private final jyx h;
    private final Picasso i;
    private final uom j;

    /* renamed from: upp$a */
    public interface a {
        void onEndClicked(int i);
    }

    /* renamed from: upp$b */
    public interface b {
        void onLeaveClicked(int i);
    }

    /* renamed from: upp$c */
    public interface c {
        void onParticipantClicked(Participant participant, int i);
    }

    /* renamed from: upp$d */
    public static class d extends u {
        final ImageView a;
        final TextView b;
        final Button c;

        public d(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.participant_image);
            this.b = (TextView) view.findViewById(R.id.participant_name);
            this.c = (Button) view.findViewById(R.id.action_button);
        }
    }

    public upp(jyx jyx, Picasso picasso, uom uom) {
        this.h = jyx;
        this.i = picasso;
        this.j = uom;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, View view) {
        this.f.onLeaveClicked(i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Participant participant, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Participant participant, int i2, View view) {
        this.e.onParticipantClicked(participant, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2, View view) {
        this.g.onEndClicked(i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Participant participant, int i2, View view) {
        this.e.onParticipantClicked(participant, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(int i2) {
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.participant, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        d dVar = (d) uVar;
        Participant participant = (Participant) this.a.get(i2);
        String largeImageUrl = participant.largeImageUrl();
        if (fbo.a(largeImageUrl)) {
            this.i.d(dVar.a);
            dVar.a.setImageDrawable(this.j.a(participant.displayName()));
        } else {
            this.h.a(dVar.a, largeImageUrl);
        }
        dVar.a.setScaleType(ScaleType.CENTER_CROP);
        dVar.a.setOnClickListener(new $$Lambda$upp$5cvyubwc4_ZEdoCe_8KbyzmW0k(this, participant, i2));
        dVar.b.setText(participant.displayName());
        dVar.b.setOnClickListener(new $$Lambda$upp$eRTk9bvbQUITQrJaEZ8I5caSlZY(this, participant, i2));
        if (this.a.size() < 2 || !this.d.equals(participant.username())) {
            dVar.c.setVisibility(8);
        } else {
            if (((Boolean) fbm.a(participant.isHost(), Boolean.FALSE)).booleanValue()) {
                dVar.c.setText(R.string.social_listening_participant_list_item_action_button_label_end);
                dVar.c.setOnClickListener(new $$Lambda$upp$7FQ05cITEatftp5FdW1j7MNsw(this, i2));
            } else {
                dVar.c.setText(R.string.social_listening_participant_list_item_action_button_label_leave);
                dVar.c.setOnClickListener(new $$Lambda$upp$7C5W67cMkEC8LzqJ8a6iJ028qo(this, i2));
            }
            dVar.c.setVisibility(0);
        }
        if (((Boolean) fbm.a(participant.isHost(), Boolean.FALSE)).booleanValue()) {
            Context context = dVar.b.getContext();
            jm.b(dVar.b, null, null, new SpotifyIconDrawable(context, SpotifyIconV2.VOLUME, (float) context.getResources().getDimensionPixelSize(R.dimen.std_16dp)), null);
            return;
        }
        dVar.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    public final int b() {
        return this.a.size();
    }

    public final String c(int i2) {
        return "participant";
    }
}
