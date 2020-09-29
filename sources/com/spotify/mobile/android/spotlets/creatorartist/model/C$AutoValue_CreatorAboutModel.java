package com.spotify.mobile.android.spotlets.creatorartist.model;

import com.google.common.base.Optional;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_CreatorAboutModel reason: invalid class name */
abstract class C$AutoValue_CreatorAboutModel extends CreatorAboutModel {
    private final Autobiography autobiography;
    private final String biography;
    private final int globalChartPosition;
    private final List<ImageModel> images;
    private final String mainImageUrl;
    private final int monthlyListeners;
    private final String name;

    /* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_CreatorAboutModel$Builder */
    static final class Builder extends com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder {
        private Autobiography autobiography;
        private String biography;
        private Integer globalChartPosition;
        private List<ImageModel> images;
        private String mainImageUrl;
        private Integer monthlyListeners;
        private String name;

        Builder() {
        }

        /* access modifiers changed from: 0000 */
        public final CreatorAboutModel autoBuild() {
            String str = "";
            String str2 = "";
            if (this.monthlyListeners == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String str3 = "rms tlsnteyihosLe";
                sb.append(" monthlyListeners");
                str2 = sb.toString();
            }
            if (this.globalChartPosition == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" globalChartPosition");
                str2 = sb2.toString();
            }
            if (this.images == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                String str4 = "gi maes";
                sb3.append(" images");
                str2 = sb3.toString();
            }
            if (str2.isEmpty()) {
                AutoValue_CreatorAboutModel autoValue_CreatorAboutModel = r2;
                AutoValue_CreatorAboutModel autoValue_CreatorAboutModel2 = new AutoValue_CreatorAboutModel(this.monthlyListeners.intValue(), this.globalChartPosition.intValue(), this.biography, this.name, this.mainImageUrl, this.autobiography, this.images);
                return autoValue_CreatorAboutModel2;
            }
            String str5 = "resioi dprorr: ieugneqepitMs";
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str2);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder autobiography(Autobiography autobiography2) {
            this.autobiography = autobiography2;
            return this;
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder biography(String str) {
            this.biography = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<Integer> globalChartPosition() {
            Integer num = this.globalChartPosition;
            return num == null ? Optional.e() : Optional.b(num);
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder globalChartPosition(int i) {
            this.globalChartPosition = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<List<ImageModel>> images() {
            List<ImageModel> list = this.images;
            return list == null ? Optional.e() : Optional.b(list);
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder images(List<ImageModel> list) {
            if (list != null) {
                this.images = list;
                return this;
            }
            throw new NullPointerException("Null images");
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder mainImageUrl(String str) {
            this.mainImageUrl = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<Integer> monthlyListeners() {
            Integer num = this.monthlyListeners;
            return num == null ? Optional.e() : Optional.b(num);
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder monthlyListeners(int i) {
            this.monthlyListeners = Integer.valueOf(i);
            return this;
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    C$AutoValue_CreatorAboutModel(int i, int i2, String str, String str2, String str3, Autobiography autobiography2, List<ImageModel> list) {
        this.monthlyListeners = i;
        this.globalChartPosition = i2;
        this.biography = str;
        this.name = str2;
        this.mainImageUrl = str3;
        this.autobiography = autobiography2;
        if (list != null) {
            this.images = list;
            return;
        }
        throw new NullPointerException("Null images");
    }

    public Autobiography autobiography() {
        return this.autobiography;
    }

    public String biography() {
        return this.biography;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r1.equals(r6.autobiography()) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 5
            r0 = 1
            r4 = 6
            if (r6 != r5) goto L_0x0006
            return r0
        L_0x0006:
            r4 = 3
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel
            r2 = 0
            r4 = 5
            if (r1 == 0) goto L_0x009c
            r4 = 2
            com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel r6 = (com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel) r6
            r4 = 0
            int r1 = r5.monthlyListeners
            r4 = 1
            int r3 = r6.monthlyListeners()
            r4 = 3
            if (r1 != r3) goto L_0x009c
            int r1 = r5.globalChartPosition
            r4 = 0
            int r3 = r6.globalChartPosition()
            r4 = 5
            if (r1 != r3) goto L_0x009c
            java.lang.String r1 = r5.biography
            if (r1 != 0) goto L_0x0031
            java.lang.String r1 = r6.biography()
            r4 = 7
            if (r1 != 0) goto L_0x009c
            goto L_0x003c
        L_0x0031:
            java.lang.String r3 = r6.biography()
            r4 = 7
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009c
        L_0x003c:
            r4 = 7
            java.lang.String r1 = r5.name
            r4 = 4
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r6.name()
            r4 = 1
            if (r1 != 0) goto L_0x009c
            goto L_0x0057
        L_0x004a:
            r4 = 0
            java.lang.String r3 = r6.name()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 3
            if (r1 == 0) goto L_0x009c
        L_0x0057:
            java.lang.String r1 = r5.mainImageUrl
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = r6.mainImageUrl()
            r4 = 1
            if (r1 != 0) goto L_0x009c
            goto L_0x0070
        L_0x0063:
            r4 = 6
            java.lang.String r3 = r6.mainImageUrl()
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x009c
        L_0x0070:
            r4 = 3
            com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography r1 = r5.autobiography
            if (r1 != 0) goto L_0x007f
            r4 = 0
            com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography r1 = r6.autobiography()
            r4 = 5
            if (r1 != 0) goto L_0x009c
            r4 = 0
            goto L_0x008c
        L_0x007f:
            r4 = 0
            com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography r3 = r6.autobiography()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x009c
        L_0x008c:
            r4 = 6
            java.util.List<com.spotify.mobile.android.spotlets.creatorartist.model.ImageModel> r1 = r5.images
            java.util.List r6 = r6.images()
            r4 = 2
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x009c
            r4 = 2
            return r0
        L_0x009c:
            r4 = 3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.creatorartist.model.C$AutoValue_CreatorAboutModel.equals(java.lang.Object):boolean");
    }

    public int globalChartPosition() {
        return this.globalChartPosition;
    }

    public int hashCode() {
        int i;
        int i2 = (((this.monthlyListeners ^ 1000003) * 1000003) ^ this.globalChartPosition) * 1000003;
        String str = this.biography;
        int i3 = 0;
        int hashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.name;
        if (str2 == null) {
            i = 0;
            boolean z = true & false;
        } else {
            i = str2.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        String str3 = this.mainImageUrl;
        int hashCode2 = (i4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Autobiography autobiography2 = this.autobiography;
        if (autobiography2 != null) {
            i3 = autobiography2.hashCode();
        }
        return ((hashCode2 ^ i3) * 1000003) ^ this.images.hashCode();
    }

    public List<ImageModel> images() {
        return this.images;
    }

    public String mainImageUrl() {
        return this.mainImageUrl;
    }

    public int monthlyListeners() {
        return this.monthlyListeners;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        String str = "ytsleelhoneas=mobrtCLnMrost{eoirdtA";
        StringBuilder sb = new StringBuilder("CreatorAboutModel{monthlyListeners=");
        sb.append(this.monthlyListeners);
        sb.append(", globalChartPosition=");
        sb.append(this.globalChartPosition);
        sb.append(", biography=");
        sb.append(this.biography);
        String str2 = "m=,me n";
        sb.append(", name=");
        sb.append(this.name);
        String str3 = "mne=oaUg,Iri lm";
        sb.append(", mainImageUrl=");
        sb.append(this.mainImageUrl);
        String str4 = "uo,igbhrtaoybp= ";
        sb.append(", autobiography=");
        sb.append(this.autobiography);
        sb.append(", images=");
        sb.append(this.images);
        sb.append("}");
        return sb.toString();
    }
}
