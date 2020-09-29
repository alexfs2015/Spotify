package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;

public class TokenBufferReadContext extends JsonStreamContext {
    protected String _currentName;
    protected Object _currentValue;
    protected final JsonStreamContext _parent;
    protected final JsonLocation _startLocation;

    protected TokenBufferReadContext() {
        super(0, -1);
        this._parent = null;
        this._startLocation = JsonLocation.NA;
    }

    protected TokenBufferReadContext(JsonStreamContext jsonStreamContext, JsonLocation jsonLocation) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        this._startLocation = jsonLocation;
    }

    protected TokenBufferReadContext(TokenBufferReadContext tokenBufferReadContext, int i, int i2) {
        super(i, i2);
        this._parent = tokenBufferReadContext;
        this._startLocation = tokenBufferReadContext._startLocation;
    }

    public static TokenBufferReadContext createRootContext(JsonStreamContext jsonStreamContext) {
        return jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, null);
    }

    public TokenBufferReadContext createChildArrayContext() {
        return new TokenBufferReadContext(this, 1, -1);
    }

    public TokenBufferReadContext createChildObjectContext() {
        return new TokenBufferReadContext(this, 2, -1);
    }

    public String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return this._currentValue;
    }

    public JsonStreamContext getParent() {
        return this._parent;
    }

    public TokenBufferReadContext parentOrCopy() {
        JsonStreamContext jsonStreamContext = this._parent;
        return jsonStreamContext instanceof TokenBufferReadContext ? (TokenBufferReadContext) jsonStreamContext : jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, this._startLocation);
    }

    public void setCurrentName(String str) {
        this._currentName = str;
    }

    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }
}
