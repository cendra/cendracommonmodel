package org.cendra.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6860031388219178145L;

	protected String formatValue(String value) {
		if (value != null) {
			value = value.trim();
		}

		if (value != null && value.isEmpty()) {
			value = null;
		}

		return value;
	}

	protected Boolean nullIsFalse(Boolean value) {
		if (value == null) {
			value = false;
		}

		return value;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected List formatValues(List values) {

		List r = new ArrayList();

		if (values != null) {
			for (Object item : values) {
				if (item != null) {
					r.add(item);
				}
			}
		}

		return r;
	}

}
