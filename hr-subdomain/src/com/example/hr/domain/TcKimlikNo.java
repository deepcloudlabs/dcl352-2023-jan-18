package com.example.hr.domain;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import com.example.ddd.DomainValueObject;

// ValueObject: i. Has No IDENTITY ii. Immutable
@DomainValueObject
public final class TcKimlikNo {
	private final String value;

	private TcKimlikNo(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	private static Map<String,TcKimlikNo> cache = new ConcurrentHashMap<>();

	public static TcKimlikNo valueOf(String value) {
		// validation
		if (!value.matches("\\d{11}"))
			throw new IllegalArgumentException(value);
		// object pooling -> immutable -> fly weight
		var identity = cache.get(value);
		if (Objects.isNull(identity)) {
			identity = new TcKimlikNo(value);
			cache.put(value, identity);
		}
		return identity;
	}
	
}
