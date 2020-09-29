package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;

public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    protected TokenFilter() {
    }

    /* access modifiers changed from: protected */
    public boolean _includeScalar() {
        return true;
    }

    public void filterFinishArray() {
    }

    public TokenFilter filterStartArray() {
        return this;
    }

    public TokenFilter filterStartObject() {
        return this;
    }

    public TokenFilter includeElement(int i) {
        return this;
    }

    public TokenFilter includeProperty(String str) {
        return this;
    }

    public TokenFilter includeRootValue(int i) {
        return this;
    }

    public boolean includeValue(JsonParser jsonParser) {
        return _includeScalar();
    }

    public String toString() {
        return this == INCLUDE_ALL ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
