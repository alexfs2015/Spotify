package com.spotify.nlu.slimo.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ParsedQueryList extends Message<ParsedQueryList, Builder> {
    public static final ProtoAdapter<ParsedQueryList> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<ParsedQuery> queries;

    public static final class Builder extends com.squareup.wire.Message.a<ParsedQueryList, Builder> {
        public List<ParsedQuery> queries = vte.a();

        public final Builder queries(List<ParsedQuery> list) {
            vte.a(list);
            this.queries = list;
            return this;
        }

        public final ParsedQueryList build() {
            return new ParsedQueryList(this.queries, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ParsedQueryList> {
        public final /* synthetic */ int a(Object obj) {
            ParsedQueryList parsedQueryList = (ParsedQueryList) obj;
            return ParsedQuery.ADAPTER.a().a(1, parsedQueryList.queries) + parsedQueryList.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ParsedQueryList parsedQueryList = (ParsedQueryList) obj;
            ParsedQuery.ADAPTER.a().a(vtb, 1, parsedQueryList.queries);
            vtb.a(parsedQueryList.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ParsedQueryList.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b != 1) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.queries.add(ParsedQuery.ADAPTER.a(vta));
                }
            }
        }
    }

    public ParsedQueryList(List<ParsedQuery> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.queries = vte.a("queries", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParsedQueryList)) {
            return false;
        }
        ParsedQueryList parsedQueryList = (ParsedQueryList) obj;
        return a().equals(parsedQueryList.a()) && this.queries.equals(parsedQueryList.queries);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.queries.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.queries.isEmpty()) {
            sb.append(", queries=");
            sb.append(this.queries);
        }
        StringBuilder replace = sb.replace(0, 2, "ParsedQueryList{");
        replace.append('}');
        return replace.toString();
    }
}
