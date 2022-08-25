package dev.binarycoders.ehcache.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import dev.binarycoders.ehcache.service.HashService;

@Service
public class HashServiceImpl implements HashService {

	@Cacheable(value = "md5-cache")
	@Override
	public String generateMd5(final String text) {
		try {
			final MessageDigest md = MessageDigest.getInstance("MD5");

			md.update(text.getBytes());

			return DatatypeConverter.printHexBinary(md.digest()).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Unable to get MD5 instance");
		}
	}
}
