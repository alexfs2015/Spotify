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

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder monthlyListeners(int i) {
            this.monthlyListeners = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<Integer> monthlyListeners() {
            Integer num = this.monthlyListeners;
            if (num == null) {
                return Optional.e();
            }
            return Optional.b(num);
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder globalChartPosition(int i) {
            this.globalChartPosition = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final Optional<Integer> globalChartPosition() {
            Integer num = this.globalChartPosition;
            if (num == null) {
                return Optional.e();
            }
            return Optional.b(num);
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder biography(String str) {
            this.biography = str;
            return this;
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder name(String str) {
            this.name = str;
            return this;
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder mainImageUrl(String str) {
            this.mainImageUrl = str;
            return this;
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder autobiography(Autobiography autobiography2) {
            this.autobiography = autobiography2;
            return this;
        }

        public final com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel.Builder images(List<ImageModel> list) {
            if (list != null) {
                this.images = list;
                return this;
            }
            throw new NullPointerException("Null images");
        }

        /* access modifiers changed from: 0000 */
        public final Optional<List<ImageModel>> images() {
            List<ImageModel> list = this.images;
            if (list == null) {
                return Optional.e();
            }
            return Optional.b(list);
        }

        /* access modifiers changed from: 0000 */
        public final CreatorAboutModel autoBuild() {
            String str = "";
            if (this.monthlyListeners == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" monthlyListeners");
                str = sb.toString();
            }
            if (this.globalChartPosition == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" globalChartPosition");
                str = sb2.toString();
            }
            if (this.images == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" images");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_CreatorAboutModel autoValue_CreatorAboutModel = new AutoValue_CreatorAboutModel(this.monthlyListeners.intValue(), this.globalChartPosition.intValue(), this.biography, this.name, this.mainImageUrl, this.autobiography, this.images);
                return autoValue_CreatorAboutModel;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
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

    public int monthlyListeners() {
        return this.monthlyListeners;
    }

    public int globalChartPosition() {
        return this.globalChartPosition;
    }

    public String biography() {
        return this.biography;
    }

    public String name() {
        return this.name;
    }

    public String mainImageUrl() {
        return this.mainImageUrl;
    }

    public Autobiography autobiography() {
        return this.autobiography;
    }

    public List<ImageModel> images() {
        return this.images;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreatorAboutModel{monthlyListeners=");
        sb.append(this.monthlyListeners);
        sb.append(", globalChartPosition=");
        sb.append(this.globalChartPosition);
        sb.append(", biography=");
        sb.append(this.biography);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", mainImageUrl=");
        sb.append(this.mainImageUrl);
        sb.append(", autobiography=");
        sb.append(this.autobiography);
        sb.append(", images=");
        sb.append(this.images);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreatorAboutModel) {
            CreatorAboutModel creatorAboutModel = (CreatorAboutModel) obj;
            if (this.monthlyListeners == creatorAboutModel.monthlyListeners() && this.globalChartPosition == creatorAboutModel.globalChartPosition()) {
                String str = this.biography;
                if (str != null ? str.equals(creatorAboutModel.biography()) : creatorAboutModel.biography() == null) {
                    String str2 = this.name;
                    if (str2 != null ? str2.equals(creatorAboutModel.name()) : creatorAboutModel.name() == null) {
                        String str3 = this.mainImageUrl;
                        if (str3 != null ? str3.equals(creatorAboutModel.mainImageUrl()) : creatorAboutModel.mainImageUrl() == null) {
                            Autobiography autobiography2 = this.autobiography;
                            if (autobiography2 != null ? autobiography2.equals(creatorAboutModel.autobiography()) : creatorAboutModel.autobiography() == null) {
                                if (this.images.equals(creatorAboutModel.images())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.monthlyListeners ^ 1000003) * 1000003) ^ this.globalChartPosition) * 1000003;
        String str = this.biography;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.name;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mainImageUrl;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Autobiography autobiography2 = this.autobiography;
        if (autobiography2 != null) {
            i2 = autobiography2.hashCode();
        }
        return ((hashCode3 ^ i2) * 1000003) ^ this.images.hashCode();
    }
}
