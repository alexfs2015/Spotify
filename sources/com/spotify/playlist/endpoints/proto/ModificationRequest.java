package com.spotify.playlist.endpoints.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ModificationRequest extends Message<ModificationRequest, Builder> {
    public static final ProtoAdapter<ModificationRequest> ADAPTER = new a();
    public static final String DEFAULT_AFTER = "";
    public static final String DEFAULT_BEFORE = "";
    public static final Boolean DEFAULT_CONTENTS = Boolean.FALSE;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_OPERATION = "";
    public static final Boolean DEFAULT_PLAYLIST = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    public final String after;
    public final Attributes attributes;
    public final String before;
    public final Boolean contents;
    public final String name;
    public final String operation;
    public final Boolean playlist;
    public final List<String> rows;
    public final List<String> uris;

    public static final class Attributes extends Message<Attributes, Builder> {
        public static final ProtoAdapter<Attributes> ADAPTER = new a();
        public static final Boolean DEFAULT_COLLABORATIVE = Boolean.FALSE;
        public static final String DEFAULT_DESCRIPTION = "";
        public static final String DEFAULT_IMAGEURI = "";
        public static final String DEFAULT_NAME = "";
        public static final Boolean DEFAULT_PUBLISHED = Boolean.FALSE;
        private static final long serialVersionUID = 0;
        public final Boolean collaborative;
        public final String description;
        public final String imageUri;
        public final String name;
        public final Boolean published;

        public static final class Builder extends com.squareup.wire.Message.a<Attributes, Builder> {
            public Boolean collaborative;
            public String description;
            public String imageUri;
            public String name;
            public Boolean published;

            public final Attributes build() {
                Attributes attributes = new Attributes(this.published, this.collaborative, this.name, this.description, this.imageUri, super.buildUnknownFields());
                return attributes;
            }

            public final Builder collaborative(Boolean bool) {
                this.collaborative = bool;
                return this;
            }

            public final Builder description(String str) {
                this.description = str;
                return this;
            }

            public final Builder imageUri(String str) {
                this.imageUri = str;
                return this;
            }

            public final Builder name(String str) {
                this.name = str;
                return this;
            }

            public final Builder published(Boolean bool) {
                this.published = bool;
                return this;
            }
        }

        static final class a extends ProtoAdapter<Attributes> {
            a() {
                super(FieldEncoding.LENGTH_DELIMITED, Attributes.class);
            }

            public final /* synthetic */ int a(Object obj) {
                Attributes attributes = (Attributes) obj;
                int i = 0;
                int a = (attributes.published != null ? ProtoAdapter.a.a(1, attributes.published) : 0) + (attributes.collaborative != null ? ProtoAdapter.a.a(2, attributes.collaborative) : 0) + (attributes.name != null ? ProtoAdapter.i.a(3, attributes.name) : 0) + (attributes.description != null ? ProtoAdapter.i.a(4, attributes.description) : 0);
                if (attributes.imageUri != null) {
                    i = ProtoAdapter.i.a(5, attributes.imageUri);
                }
                return a + i + attributes.a().h();
            }

            public final /* synthetic */ Object a(whg whg) {
                Builder builder = new Builder();
                long a = whg.a();
                while (true) {
                    int b = whg.b();
                    if (b == -1) {
                        whg.a(a);
                        return builder.build();
                    } else if (b == 1) {
                        builder.published((Boolean) ProtoAdapter.a.a(whg));
                    } else if (b == 2) {
                        builder.collaborative((Boolean) ProtoAdapter.a.a(whg));
                    } else if (b == 3) {
                        builder.name((String) ProtoAdapter.i.a(whg));
                    } else if (b == 4) {
                        builder.description((String) ProtoAdapter.i.a(whg));
                    } else if (b != 5) {
                        FieldEncoding fieldEncoding = whg.b;
                        builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                    } else {
                        builder.imageUri((String) ProtoAdapter.i.a(whg));
                    }
                }
            }

            public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
                Attributes attributes = (Attributes) obj;
                if (attributes.published != null) {
                    ProtoAdapter.a.a(whh, 1, attributes.published);
                }
                if (attributes.collaborative != null) {
                    ProtoAdapter.a.a(whh, 2, attributes.collaborative);
                }
                if (attributes.name != null) {
                    ProtoAdapter.i.a(whh, 3, attributes.name);
                }
                if (attributes.description != null) {
                    ProtoAdapter.i.a(whh, 4, attributes.description);
                }
                if (attributes.imageUri != null) {
                    ProtoAdapter.i.a(whh, 5, attributes.imageUri);
                }
                whh.a(attributes.a());
            }
        }

        public Attributes(Boolean bool, Boolean bool2, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.published = bool;
            this.collaborative = bool2;
            this.name = str;
            this.description = str2;
            this.imageUri = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Attributes)) {
                return false;
            }
            Attributes attributes = (Attributes) obj;
            return a().equals(attributes.a()) && whk.a((Object) this.published, (Object) attributes.published) && whk.a((Object) this.collaborative, (Object) attributes.collaborative) && whk.a((Object) this.name, (Object) attributes.name) && whk.a((Object) this.description, (Object) attributes.description) && whk.a((Object) this.imageUri, (Object) attributes.imageUri);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = a().hashCode() * 37;
            Boolean bool = this.published;
            int i2 = 0;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.collaborative;
            int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            String str = this.name;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.imageUri;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            int i3 = hashCode5 + i2;
            this.hashCode = i3;
            return i3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.published != null) {
                sb.append(", published=");
                sb.append(this.published);
            }
            if (this.collaborative != null) {
                sb.append(", collaborative=");
                sb.append(this.collaborative);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.imageUri != null) {
                sb.append(", imageUri=");
                sb.append(this.imageUri);
            }
            StringBuilder replace = sb.replace(0, 2, "Attributes{");
            replace.append('}');
            return replace.toString();
        }
    }

    public static final class Builder extends com.squareup.wire.Message.a<ModificationRequest, Builder> {
        public String after;
        public Attributes attributes;
        public String before;
        public Boolean contents;
        public String name;
        public String operation;
        public Boolean playlist;
        public List<String> rows = whk.a();
        public List<String> uris = whk.a();

        public final Builder after(String str) {
            this.after = str;
            return this;
        }

        public final Builder attributes(Attributes attributes2) {
            this.attributes = attributes2;
            return this;
        }

        public final Builder before(String str) {
            this.before = str;
            return this;
        }

        public final ModificationRequest build() {
            ModificationRequest modificationRequest = new ModificationRequest(this.operation, this.before, this.after, this.name, this.playlist, this.attributes, this.uris, this.rows, this.contents, super.buildUnknownFields());
            return modificationRequest;
        }

        public final Builder contents(Boolean bool) {
            this.contents = bool;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder operation(String str) {
            this.operation = str;
            return this;
        }

        public final Builder playlist(Boolean bool) {
            this.playlist = bool;
            return this;
        }

        public final Builder rows(List<String> list) {
            whk.a(list);
            this.rows = list;
            return this;
        }

        public final Builder uris(List<String> list) {
            whk.a(list);
            this.uris = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ModificationRequest> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ModificationRequest.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ModificationRequest modificationRequest = (ModificationRequest) obj;
            int i = 0;
            int a = (modificationRequest.operation != null ? ProtoAdapter.i.a(1, modificationRequest.operation) : 0) + (modificationRequest.before != null ? ProtoAdapter.i.a(2, modificationRequest.before) : 0) + (modificationRequest.after != null ? ProtoAdapter.i.a(3, modificationRequest.after) : 0) + (modificationRequest.name != null ? ProtoAdapter.i.a(4, modificationRequest.name) : 0) + (modificationRequest.playlist != null ? ProtoAdapter.a.a(5, modificationRequest.playlist) : 0) + (modificationRequest.attributes != null ? Attributes.ADAPTER.a(6, modificationRequest.attributes) : 0) + ProtoAdapter.i.a().a(7, modificationRequest.uris) + ProtoAdapter.i.a().a(8, modificationRequest.rows);
            if (modificationRequest.contents != null) {
                i = ProtoAdapter.a.a(9, modificationRequest.contents);
            }
            return a + i + modificationRequest.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.operation((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.before((String) ProtoAdapter.i.a(whg));
                            break;
                        case 3:
                            builder.after((String) ProtoAdapter.i.a(whg));
                            break;
                        case 4:
                            builder.name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 5:
                            builder.playlist((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 6:
                            builder.attributes((Attributes) Attributes.ADAPTER.a(whg));
                            break;
                        case 7:
                            builder.uris.add(ProtoAdapter.i.a(whg));
                            break;
                        case 8:
                            builder.rows.add(ProtoAdapter.i.a(whg));
                            break;
                        case 9:
                            builder.contents((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    whg.a(a);
                    return builder.build();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ModificationRequest modificationRequest = (ModificationRequest) obj;
            if (modificationRequest.operation != null) {
                ProtoAdapter.i.a(whh, 1, modificationRequest.operation);
            }
            if (modificationRequest.before != null) {
                ProtoAdapter.i.a(whh, 2, modificationRequest.before);
            }
            if (modificationRequest.after != null) {
                ProtoAdapter.i.a(whh, 3, modificationRequest.after);
            }
            if (modificationRequest.name != null) {
                ProtoAdapter.i.a(whh, 4, modificationRequest.name);
            }
            if (modificationRequest.playlist != null) {
                ProtoAdapter.a.a(whh, 5, modificationRequest.playlist);
            }
            if (modificationRequest.attributes != null) {
                Attributes.ADAPTER.a(whh, 6, modificationRequest.attributes);
            }
            ProtoAdapter.i.a().a(whh, 7, modificationRequest.uris);
            ProtoAdapter.i.a().a(whh, 8, modificationRequest.rows);
            if (modificationRequest.contents != null) {
                ProtoAdapter.a.a(whh, 9, modificationRequest.contents);
            }
            whh.a(modificationRequest.a());
        }
    }

    public ModificationRequest(String str, String str2, String str3, String str4, Boolean bool, Attributes attributes2, List<String> list, List<String> list2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operation = str;
        this.before = str2;
        this.after = str3;
        this.name = str4;
        this.playlist = bool;
        this.attributes = attributes2;
        this.uris = whk.a("uris", list);
        this.rows = whk.a("rows", list2);
        this.contents = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModificationRequest)) {
            return false;
        }
        ModificationRequest modificationRequest = (ModificationRequest) obj;
        return a().equals(modificationRequest.a()) && whk.a((Object) this.operation, (Object) modificationRequest.operation) && whk.a((Object) this.before, (Object) modificationRequest.before) && whk.a((Object) this.after, (Object) modificationRequest.after) && whk.a((Object) this.name, (Object) modificationRequest.name) && whk.a((Object) this.playlist, (Object) modificationRequest.playlist) && whk.a((Object) this.attributes, (Object) modificationRequest.attributes) && this.uris.equals(modificationRequest.uris) && this.rows.equals(modificationRequest.rows) && whk.a((Object) this.contents, (Object) modificationRequest.contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.operation;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.before;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.after;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.playlist;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Attributes attributes2 = this.attributes;
        int hashCode7 = (((((hashCode6 + (attributes2 != null ? attributes2.hashCode() : 0)) * 37) + this.uris.hashCode()) * 37) + this.rows.hashCode()) * 37;
        Boolean bool2 = this.contents;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        int i3 = hashCode7 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        if (this.before != null) {
            sb.append(", before=");
            sb.append(this.before);
        }
        if (this.after != null) {
            sb.append(", after=");
            sb.append(this.after);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.playlist != null) {
            sb.append(", playlist=");
            sb.append(this.playlist);
        }
        if (this.attributes != null) {
            sb.append(", attributes=");
            sb.append(this.attributes);
        }
        if (!this.uris.isEmpty()) {
            sb.append(", uris=");
            sb.append(this.uris);
        }
        if (!this.rows.isEmpty()) {
            sb.append(", rows=");
            sb.append(this.rows);
        }
        if (this.contents != null) {
            sb.append(", contents=");
            sb.append(this.contents);
        }
        StringBuilder replace = sb.replace(0, 2, "ModificationRequest{");
        replace.append('}');
        return replace.toString();
    }
}
