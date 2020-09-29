package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.model.LocalItem.ImageType;
import com.spotify.music.features.localfilesimport.view.LocalFileRow;
import com.spotify.music.features.localfilesimport.view.LocalFileRow.Activated;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nwy reason: default package */
public final class nwy extends androidx.recyclerview.widget.RecyclerView.a<LocalFileRow> implements gkw {
    public List<LocalItem> a = new ArrayList();
    public final a d;
    public final C0065a e = new C0065a() {
        public final void a() {
            nwy.this.e();
        }
    };
    private final Context f;
    private final Picasso g;

    /* renamed from: nwy$a */
    public interface a {

        /* renamed from: nwy$a$a reason: collision with other inner class name */
        public interface C0065a {
            void a();
        }

        void a(ImmutableList<LocalItem> immutableList, boolean z, C0065a aVar);

        void a(LocalItem localItem, boolean z, C0065a aVar);

        void a(C0065a aVar);

        boolean a();

        boolean a(LocalItem localItem);

        void b(C0065a aVar);

        boolean b(LocalItem localItem);
    }

    public nwy(Context context, a aVar, Picasso picasso) {
        this.f = context;
        this.d = aVar;
        this.d.a(this.e);
        this.g = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new LocalFileRow(this.f, viewGroup);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        final LocalFileRow localFileRow = (LocalFileRow) uVar;
        final LocalItem localItem = (LocalItem) this.a.get(i);
        localFileRow.b.setText(localItem.getTitle());
        String subtitle = localItem.getSubtitle(this.f);
        localFileRow.c.setText(subtitle);
        localFileRow.c.setVisibility(subtitle == null ? 8 : 0);
        AnonymousClass2 r0 = new OnClickListener() {
            public final void onClick(View view) {
                boolean b2 = nwy.this.d.b(localItem);
                nwy.this.d.a(localItem, !b2, nwy.this.e);
                localFileRow.a(b2 ? Activated.INACTIVE : Activated.FULLY);
            }
        };
        localFileRow.a.setOnClickListener(r0);
        localFileRow.o.setOnClickListener(r0);
        Activated activated = this.d.a(localItem) ? Activated.FULLY : this.d.b(localItem) ? Activated.PARTLY : Activated.INACTIVE;
        localFileRow.a(activated);
        jzb.a(this.f, localFileRow.c, localItem.isExplicit());
        String imageUri = localItem.getImageUri();
        ImageView imageView = localFileRow.d;
        ImageType imageType = localItem.getImageType();
        if (imageType != ImageType.NONE) {
            Drawable imagePlaceholder = localItem.getImagePlaceholder(this.f);
            imageView.setVisibility(0);
            if (!fbo.a(imageUri)) {
                wgr a2 = this.g.a(!TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
                a2.a(imagePlaceholder);
                a2.b();
                if (imageType == ImageType.ROUND) {
                    a2.a(vhj.a(imageView, vgq.a()));
                } else {
                    a2.a(imageView);
                }
            } else {
                this.g.d(imageView);
                imageView.setImageDrawable(imagePlaceholder);
            }
            return;
        }
        imageView.setVisibility(8);
    }

    public final int b() {
        return this.a.size();
    }
}
