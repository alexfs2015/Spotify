package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegate extends JsonParserDelegate {
    protected boolean _allowMultipleMatches;
    protected JsonToken _currToken;
    protected TokenFilterContext _exposedContext;
    protected TokenFilterContext _headContext;
    @Deprecated
    protected boolean _includeImmediateParent;
    protected boolean _includePath;
    protected TokenFilter _itemFilter;
    protected JsonToken _lastClearedToken;
    protected int _matchCount;
    protected TokenFilter rootFilter;

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z, boolean z2) {
        super(jsonParser);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._headContext = TokenFilterContext.createRootContext(tokenFilter);
        this._includePath = z;
        this._allowMultipleMatches = z2;
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) {
        this._exposedContext = tokenFilterContext;
        JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
        if (nextTokenToRead != null) {
            return nextTokenToRead;
        }
        while (tokenFilterContext != this._headContext) {
            tokenFilterContext = this._exposedContext.findChildOf(tokenFilterContext);
            this._exposedContext = tokenFilterContext;
            if (tokenFilterContext != null) {
                JsonToken nextTokenToRead2 = this._exposedContext.nextTokenToRead();
                if (nextTokenToRead2 != null) {
                    return nextTokenToRead2;
                }
            } else {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean _verifyAllowedMatches() {
        if (this._matchCount != 0 && !this._allowMultipleMatches) {
            return false;
        }
        this._matchCount++;
        return true;
    }

    /* access modifiers changed from: protected */
    public JsonStreamContext _filterContext() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        return tokenFilterContext != null ? tokenFilterContext : this._headContext;
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextToken2() {
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                this._currToken = nextToken;
                return nextToken;
            }
            int id = nextToken.id();
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter tokenFilter = this._itemFilter;
                        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter checkValue = this._headContext.checkValue(tokenFilter);
                            if (checkValue == null) {
                                this.delegate.skipChildren();
                            } else {
                                if (checkValue != TokenFilter.INCLUDE_ALL) {
                                    checkValue = checkValue.filterStartArray();
                                }
                                this._itemFilter = checkValue;
                                if (checkValue == TokenFilter.INCLUDE_ALL) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                this._headContext = this._headContext.createChildArrayContext(checkValue, false);
                                if (this._includePath) {
                                    JsonToken _nextTokenWithBuffering = _nextTokenWithBuffering(this._headContext);
                                    if (_nextTokenWithBuffering != null) {
                                        this._currToken = _nextTokenWithBuffering;
                                        return _nextTokenWithBuffering;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (tokenFilter2 != null) {
                                TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter2);
                                if ((checkValue2 == TokenFilter.INCLUDE_ALL || (checkValue2 != null && checkValue2.includeValue(this.delegate))) && _verifyAllowedMatches()) {
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            if (fieldName == TokenFilter.INCLUDE_ALL) {
                                this._itemFilter = fieldName;
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                if (includeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = includeProperty;
                                    if (includeProperty == TokenFilter.INCLUDE_ALL) {
                                        if (_verifyAllowedMatches() && this._includePath) {
                                            this._currToken = nextToken;
                                            return nextToken;
                                        }
                                    } else if (this._includePath) {
                                        JsonToken _nextTokenWithBuffering2 = _nextTokenWithBuffering(this._headContext);
                                        if (_nextTokenWithBuffering2 != null) {
                                            this._currToken = _nextTokenWithBuffering2;
                                            return _nextTokenWithBuffering2;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean isStartHandled = this._headContext.isStartHandled();
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                this._headContext = this._headContext.getParent();
                this._itemFilter = this._headContext.getFilter();
                if (isStartHandled) {
                    this._currToken = nextToken;
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter3 = this._itemFilter;
                if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                    this._currToken = nextToken;
                    return nextToken;
                } else if (tokenFilter3 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter3);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (checkValue3 != TokenFilter.INCLUDE_ALL) {
                            checkValue3 = checkValue3.filterStartObject();
                        }
                        this._itemFilter = checkValue3;
                        if (checkValue3 == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, false);
                        if (this._includePath) {
                            JsonToken _nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext);
                            if (_nextTokenWithBuffering3 != null) {
                                this._currToken = _nextTokenWithBuffering3;
                                return _nextTokenWithBuffering3;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) {
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                return nextToken;
            }
            int id = nextToken.id();
            boolean z = false;
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter checkValue = this._headContext.checkValue(this._itemFilter);
                        if (checkValue == null) {
                            this.delegate.skipChildren();
                        } else {
                            if (checkValue != TokenFilter.INCLUDE_ALL) {
                                checkValue = checkValue.filterStartArray();
                            }
                            this._itemFilter = checkValue;
                            if (checkValue == TokenFilter.INCLUDE_ALL) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            this._headContext = this._headContext.createChildArrayContext(checkValue, false);
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter = this._itemFilter;
                            if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (tokenFilter != null) {
                                TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter);
                                if ((checkValue2 == TokenFilter.INCLUDE_ALL || (checkValue2 != null && checkValue2.includeValue(this.delegate))) && _verifyAllowedMatches()) {
                                    return _nextBuffered(tokenFilterContext);
                                }
                            } else {
                                continue;
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            if (fieldName == TokenFilter.INCLUDE_ALL) {
                                this._itemFilter = fieldName;
                                return _nextBuffered(tokenFilterContext);
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                if (includeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = includeProperty;
                                    if (includeProperty != TokenFilter.INCLUDE_ALL) {
                                        continue;
                                    } else if (_verifyAllowedMatches()) {
                                        return _nextBuffered(tokenFilterContext);
                                    } else {
                                        this._itemFilter = this._headContext.setFieldName(currentName);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                if ((this._headContext == tokenFilterContext) && this._headContext.isStartHandled()) {
                    z = true;
                }
                this._headContext = this._headContext.getParent();
                this._itemFilter = this._headContext.getFilter();
                if (z) {
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter2 = this._itemFilter;
                if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter2, true);
                    return nextToken;
                } else if (tokenFilter2 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter2);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (checkValue3 != TokenFilter.INCLUDE_ALL) {
                            checkValue3 = checkValue3.filterStartObject();
                        }
                        this._itemFilter = checkValue3;
                        if (checkValue3 == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            return _nextBuffered(tokenFilterContext);
                        }
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, false);
                    }
                }
            }
        }
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    public JsonToken currentToken() {
        return this._currToken;
    }

    public BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    public boolean getBooleanValue() {
        return this.delegate.getBooleanValue();
    }

    public byte getByteValue() {
        return this.delegate.getByteValue();
    }

    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    public String getCurrentName() {
        JsonStreamContext _filterContext = _filterContext();
        if (this._currToken != JsonToken.START_OBJECT && this._currToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public final int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    public double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    public Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    public float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    public int getIntValue() {
        return this.delegate.getIntValue();
    }

    public long getLongValue() {
        return this.delegate.getLongValue();
    }

    public NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    public Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    public JsonStreamContext getParsingContext() {
        return _filterContext();
    }

    public short getShortValue() {
        return this.delegate.getShortValue();
    }

    public String getText() {
        return this.delegate.getText();
    }

    public char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    public int getTextLength() {
        return this.delegate.getTextLength();
    }

    public int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    public int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    public int getValueAsInt(int i) {
        return this.delegate.getValueAsInt(i);
    }

    public long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    public long getValueAsLong(long j) {
        return this.delegate.getValueAsLong(j);
    }

    public String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    public String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    public final boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i == 0 : jsonToken.id() == i;
    }

    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    public JsonToken nextToken() {
        if (!this._allowMultipleMatches) {
            JsonToken jsonToken = this._currToken;
            if (jsonToken != null && this._exposedContext == null && jsonToken.isScalarValue() && !this._headContext.isStartHandled() && !this._includePath && this._itemFilter == TokenFilter.INCLUDE_ALL) {
                this._currToken = null;
                return null;
            }
        }
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext != null) {
            do {
                JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead != null) {
                    this._currToken = nextTokenToRead;
                    return nextTokenToRead;
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                if (tokenFilterContext == tokenFilterContext2) {
                    this._exposedContext = null;
                    if (tokenFilterContext.inArray()) {
                        JsonToken currentToken = this.delegate.getCurrentToken();
                        this._currToken = currentToken;
                        return currentToken;
                    }
                } else {
                    tokenFilterContext = tokenFilterContext2.findChildOf(tokenFilterContext);
                    this._exposedContext = tokenFilterContext;
                }
            } while (tokenFilterContext != null);
            throw _constructError("Unexpected problem: chain of filtered context broken");
        }
        JsonToken nextToken = this.delegate.nextToken();
        if (nextToken == null) {
            this._currToken = nextToken;
            return nextToken;
        }
        int id = nextToken.id();
        if (id != 1) {
            if (id != 2) {
                if (id == 3) {
                    TokenFilter tokenFilter = this._itemFilter;
                    if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                        this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                        this._currToken = nextToken;
                        return nextToken;
                    } else if (tokenFilter == null) {
                        this.delegate.skipChildren();
                    } else {
                        TokenFilter checkValue = this._headContext.checkValue(tokenFilter);
                        if (checkValue == null) {
                            this.delegate.skipChildren();
                        } else {
                            if (checkValue != TokenFilter.INCLUDE_ALL) {
                                checkValue = checkValue.filterStartArray();
                            }
                            this._itemFilter = checkValue;
                            if (checkValue == TokenFilter.INCLUDE_ALL) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue, true);
                                this._currToken = nextToken;
                                return nextToken;
                            }
                            this._headContext = this._headContext.createChildArrayContext(checkValue, false);
                            if (this._includePath) {
                                JsonToken _nextTokenWithBuffering = _nextTokenWithBuffering(this._headContext);
                                if (_nextTokenWithBuffering != null) {
                                    this._currToken = _nextTokenWithBuffering;
                                    return _nextTokenWithBuffering;
                                }
                            }
                        }
                    }
                } else if (id != 4) {
                    if (id != 5) {
                        TokenFilter tokenFilter2 = this._itemFilter;
                        if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter2 != null) {
                            TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter2);
                            if ((checkValue2 == TokenFilter.INCLUDE_ALL || (checkValue2 != null && checkValue2.includeValue(this.delegate))) && _verifyAllowedMatches()) {
                                this._currToken = nextToken;
                                return nextToken;
                            }
                        }
                    } else {
                        String currentName = this.delegate.getCurrentName();
                        TokenFilter fieldName = this._headContext.setFieldName(currentName);
                        if (fieldName == TokenFilter.INCLUDE_ALL) {
                            this._itemFilter = fieldName;
                            if (!this._includePath && this._includeImmediateParent && !this._headContext.isStartHandled()) {
                                nextToken = this._headContext.nextTokenToRead();
                                this._exposedContext = this._headContext;
                            }
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (fieldName == null) {
                            this.delegate.nextToken();
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter includeProperty = fieldName.includeProperty(currentName);
                            if (includeProperty == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                this._itemFilter = includeProperty;
                                if (includeProperty == TokenFilter.INCLUDE_ALL) {
                                    if (!_verifyAllowedMatches()) {
                                        this.delegate.nextToken();
                                        this.delegate.skipChildren();
                                    } else if (this._includePath) {
                                        this._currToken = nextToken;
                                        return nextToken;
                                    }
                                }
                                if (this._includePath) {
                                    JsonToken _nextTokenWithBuffering2 = _nextTokenWithBuffering(this._headContext);
                                    if (_nextTokenWithBuffering2 != null) {
                                        this._currToken = _nextTokenWithBuffering2;
                                        return _nextTokenWithBuffering2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            boolean isStartHandled = this._headContext.isStartHandled();
            TokenFilter filter = this._headContext.getFilter();
            if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                filter.filterFinishArray();
            }
            this._headContext = this._headContext.getParent();
            this._itemFilter = this._headContext.getFilter();
            if (isStartHandled) {
                this._currToken = nextToken;
                return nextToken;
            }
        } else {
            TokenFilter tokenFilter3 = this._itemFilter;
            if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                this._currToken = nextToken;
                return nextToken;
            } else if (tokenFilter3 == null) {
                this.delegate.skipChildren();
            } else {
                TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter3);
                if (checkValue3 == null) {
                    this.delegate.skipChildren();
                } else {
                    if (checkValue3 != TokenFilter.INCLUDE_ALL) {
                        checkValue3 = checkValue3.filterStartObject();
                    }
                    this._itemFilter = checkValue3;
                    if (checkValue3 == TokenFilter.INCLUDE_ALL) {
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                        this._currToken = nextToken;
                        return nextToken;
                    }
                    this._headContext = this._headContext.createChildObjectContext(checkValue3, false);
                    if (this._includePath) {
                        JsonToken _nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext);
                        if (_nextTokenWithBuffering3 != null) {
                            this._currToken = _nextTokenWithBuffering3;
                            return _nextTokenWithBuffering3;
                        }
                    }
                }
            }
        }
        return _nextToken2();
    }

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    public JsonParser skipChildren() {
        if (this._currToken != JsonToken.START_OBJECT && this._currToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else {
                continue;
            }
        }
    }
}
