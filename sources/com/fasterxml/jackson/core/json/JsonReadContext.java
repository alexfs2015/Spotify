package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;

public final class JsonReadContext extends JsonStreamContext {
    protected JsonReadContext _child;
    protected int _columnNr;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonReadContext, DupDetector dupDetector, int i, int i2, int i3) {
        this._parent = jsonReadContext;
        this._dups = dupDetector;
        this._type = i;
        this._lineNr = i2;
        this._columnNr = i3;
        this._index = -1;
    }

    private void _checkDup(DupDetector dupDetector, String str) {
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            JsonParser jsonParser = source instanceof JsonParser ? (JsonParser) source : null;
            StringBuilder sb = new StringBuilder("Duplicate field '");
            sb.append(str);
            sb.append("'");
            throw new JsonParseException(jsonParser, sb.toString());
        }
    }

    public static JsonReadContext createRootContext(DupDetector dupDetector) {
        JsonReadContext jsonReadContext = new JsonReadContext(null, dupDetector, 0, 1, 0);
        return jsonReadContext;
    }

    public final JsonReadContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public final JsonReadContext createChildArrayContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this._dups;
            jsonReadContext = new JsonReadContext(this, dupDetector == null ? null : dupDetector.child(), 1, i, i2);
            this._child = jsonReadContext;
        } else {
            jsonReadContext.reset(1, i, i2);
        }
        return jsonReadContext;
    }

    public final JsonReadContext createChildObjectContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this._dups;
            JsonReadContext jsonReadContext2 = new JsonReadContext(this, dupDetector == null ? null : dupDetector.child(), 2, i, i2);
            this._child = jsonReadContext2;
            return jsonReadContext2;
        }
        jsonReadContext.reset(2, i, i2);
        return jsonReadContext;
    }

    public final boolean expectComma() {
        int i = this._index + 1;
        this._index = i;
        return this._type != 0 && i > 0;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public final Object getCurrentValue() {
        return this._currentValue;
    }

    public final DupDetector getDupDetector() {
        return this._dups;
    }

    public final JsonReadContext getParent() {
        return this._parent;
    }

    public final JsonLocation getStartLocation(Object obj) {
        JsonLocation jsonLocation = new JsonLocation(obj, -1, this._lineNr, this._columnNr);
        return jsonLocation;
    }

    /* access modifiers changed from: protected */
    public final void reset(int i, int i2, int i3) {
        this._type = i;
        this._index = -1;
        this._lineNr = i2;
        this._columnNr = i3;
        this._currentName = null;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
    }

    public final void setCurrentName(String str) {
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
    }

    public final void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public final JsonReadContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }
}
