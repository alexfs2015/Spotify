package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor;
import com.spotify.music.behindthelyrics.presenter.CardType;

/* renamed from: ksb reason: default package */
public final class ksb implements wue<ihv<TrackAnnotation>> {
    private final krz a;
    private final kst b;
    private ihv<TrackAnnotation> c;

    /* renamed from: ksb$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[CardType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.music.behindthelyrics.presenter.CardType[] r0 = com.spotify.music.behindthelyrics.presenter.CardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.behindthelyrics.presenter.CardType r1 = com.spotify.music.behindthelyrics.presenter.CardType.INTRO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.behindthelyrics.presenter.CardType r1 = com.spotify.music.behindthelyrics.presenter.CardType.INFO     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.behindthelyrics.presenter.CardType r1 = com.spotify.music.behindthelyrics.presenter.CardType.LYRICS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.behindthelyrics.presenter.CardType r1 = com.spotify.music.behindthelyrics.presenter.CardType.VERIFIED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.behindthelyrics.presenter.CardType r1 = com.spotify.music.behindthelyrics.presenter.CardType.CREDITS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.AnonymousClass1.<clinit>():void");
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        ihv<TrackAnnotation> ihv = (ihv) obj;
        boolean z = true;
        Logger.b("New Annotation: %s", ihv.toString());
        TrackAnnotation trackAnnotation = (TrackAnnotation) ihv.a;
        int i = AnonymousClass1.a[CardType.a(trackAnnotation.getContentType()).ordinal()];
        if (i == 1) {
            this.b.b();
        } else if (i == 2) {
            if (a(trackAnnotation)) {
                this.b.b(trackAnnotation.getContent());
            }
            a(ihv);
        } else if (i == 3) {
            if (a(trackAnnotation)) {
                this.b.c(trackAnnotation.getContent());
            }
            a(ihv);
        } else if (i == 4) {
            TrackAnnotationAuthor author = trackAnnotation.getAuthor();
            if (author != null && a(trackAnnotation)) {
                ihv<TrackAnnotation> ihv2 = this.c;
                if (ihv2 == null || !author.equals(((TrackAnnotation) ihv2.a).getAuthor())) {
                    z = false;
                }
                if (z) {
                    this.b.a(trackAnnotation.getContent());
                } else {
                    this.b.a(author.getDisplayName(), new kry(author.getAvatarUrl(), this.a.a), trackAnnotation.getContent());
                }
            }
            a(ihv);
        } else if (i == 5) {
            this.b.a();
        } else {
            StringBuilder sb = new StringBuilder("Unknown TrackAnnotation Content Type: %s");
            sb.append(ihv);
            throw new IllegalArgumentException(sb.toString());
        }
        this.c = ihv;
    }

    public ksb(kst kst, krz krz) {
        this.b = kst;
        this.a = krz;
    }

    private boolean a(TrackAnnotation trackAnnotation) {
        ihv<TrackAnnotation> ihv = this.c;
        return ihv == null || !trackAnnotation.equals(ihv.a);
    }

    public final void onCompleted() {
        Logger.b("BTL Completed", new Object[0]);
    }

    public final void onError(Throwable th) {
        Logger.b(th, "BTL Error", new Object[0]);
    }

    private void a(ihv<TrackAnnotation> ihv) {
        this.b.a((int) ihv.c, (int) ihv.b, ihv.d);
    }
}
