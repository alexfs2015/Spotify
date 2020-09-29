package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;

/* renamed from: ret reason: default package */
public final class ret implements kmm<MusicPagesModel, rey> {
    /* access modifiers changed from: private */
    public a a = $$Lambda$ret$MT1MfEOX8Y6OE5I2lD0IpOx3F8.INSTANCE;

    /* renamed from: ret$a */
    interface a {
        void onDialogDismissed();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public final void a() {
        this.a.onDialogDismissed();
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.a = new $$Lambda$ret$quBd7__fR0MHYSBibrQOl7yK8MQ(knw);
        return new kmn<MusicPagesModel>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
                ret.this.a = $$Lambda$ret$1$RKUyrerhHjsr6ESpyHzbGiPWKA.INSTANCE;
            }
        };
    }
}
