package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;

/* renamed from: qwe reason: default package */
public final class qwe implements kjd<MusicPagesModel, qwj> {
    /* access modifiers changed from: private */
    public a a = $$Lambda$qwe$xUc7Vj2G_MTB20OYrucHw0To0.INSTANCE;

    /* renamed from: qwe$a */
    interface a {
        void onDialogDismissed();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        this.a = new $$Lambda$qwe$UyE5tT6QVj4wvlwk9wgx3Jn1Y4Y(kkn);
        return new kje<MusicPagesModel>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
                qwe.this.a = $$Lambda$qwe$1$X02cmbkj_ov4CZvYjKclBGZxXzw.INSTANCE;
            }
        };
    }

    public final void a() {
        this.a.onDialogDismissed();
    }
}
