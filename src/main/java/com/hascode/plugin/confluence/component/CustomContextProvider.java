package com.hascode.plugin.confluence.component;

import java.util.Date;
import java.util.Map;

import com.atlassian.plugin.PluginParseException;
import com.atlassian.plugin.web.ContextProvider;

public class CustomContextProvider implements ContextProvider {

	@Override
	public void init(final Map<String, String> params)
			throws PluginParseException {
	}

	@Override
	public Map<String, Object> getContextMap(final Map<String, Object> context) {
		context.put("creationDate", new Date());
		return context;
	}

}
